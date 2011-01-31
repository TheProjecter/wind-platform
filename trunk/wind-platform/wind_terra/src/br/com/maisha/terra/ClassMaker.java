package br.com.maisha.terra;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javassist.CannotCompileException;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ConstPool;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.BooleanMemberValue;
import javassist.bytecode.annotation.ClassMemberValue;
import javassist.bytecode.annotation.EnumMemberValue;
import javassist.bytecode.annotation.IntegerMemberValue;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.StringMemberValue;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.wind.common.exception.MakeClassException;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ClassMaker implements IClassMaker {

	/** Referencia para log. */
	private static final Logger log = Logger.getLogger(ClassMaker.class);

	/** */
	private List<String> javaLangTypes = Arrays.asList("Integer", "Double", "Float", "Long", "Short", "Boolean",
			"String");

	/** */
	private Map<String, String> typeMap = new HashMap<String, String>();

	/**
	 * 
	 */
	public ClassMaker() {
		typeMap.put("Date", "java.util.Date");
	}

	/**
	 * 
	 * @see br.com.maisha.terra.IClassMaker#makeClasses(java.lang.ClassLoader,
	 *      br.com.maisha.terra.lang.WindApplication)
	 */
	public void makeClasses(ClassLoader cLoader, WindApplication app) throws MakeClassException {
		try {
			log.debug("@@@ Creating java classes for " + app.getAppId());
			ClassPool pool = ClassPool.getDefault();

			pool.insertClassPath(new ClassClassPath(ModelReference.class));
			Map<DomainObject, CtClass> map = new HashMap<DomainObject, CtClass>();
			for (DomainObject dObj : app.getDomainObjects()) {
				map.put(dObj, createDeclaratrion(pool, dObj));
			}

			for (Map.Entry<DomainObject, CtClass> entry : map.entrySet()) {
				createFieldDeclarations(entry.getValue(), entry.getKey());
			}

			for (Map.Entry<DomainObject, CtClass> entry : map.entrySet()) {
				DomainObject obj = entry.getKey();
				obj.setObjectClass(entry.getValue().toClass(cLoader, null));

				if (log.isDebugEnabled()) {
					describeClass(obj.getObjectClass());
				}
			}
		} catch (CannotCompileException e) {
			throw new MakeClassException(e);
		}

	}

	/**
	 * 
	 * @param pool
	 * @param obj
	 * @return
	 * @throws MakeClassException
	 */
	private CtClass createDeclaratrion(ClassPool pool, DomainObject obj) throws MakeClassException {
		try {

			CtClass modelReference = pool.get(ModelReference.class.getName());

			CtClass cc = pool.makeClass(obj.getPckg() + "." + obj.getRef(), modelReference);

			ClassFile cf = cc.getClassFile();
			ConstPool cp = cf.getConstPool();

			AnnotationsAttribute entityAnnotation = new AnnotationsAttribute(cp, AnnotationsAttribute.visibleTag);
			entityAnnotation.addAnnotation(createAnnoation(cp, "javax.persistence.Entity", null));
			cf.addAttribute(entityAnnotation);

			createIdField(cc);

			String setIdMethod = "public void setId(long id){this.id = id;}";
			String getIdMethod = "public long getId(){return this.id;}";

			cc.addMethod(CtMethod.make(setIdMethod, cc));
			cc.addMethod(CtMethod.make(getIdMethod, cc));

			// create objId and appId columns
			cc.addField(CtField.make("private String appId;", cc));
			cc.addField(CtField.make("private String objId;", cc));

			String setAppIdMethod = "public void setAppId(String appId){this.appId = appId;}";
			String getAppIdMethod = "public String getAppId(){return this.appId;}";

			cc.addMethod(CtMethod.make(setAppIdMethod, cc));
			cc.addMethod(CtMethod.make(getAppIdMethod, cc));

			String setObjIdMethod = "public void setObjId(String objId){this.objId = objId;}";
			String getObjIdMethod = "public String getObjId(){return this.objId;}";

			cc.addMethod(CtMethod.make(setObjIdMethod, cc));
			cc.addMethod(CtMethod.make(getObjIdMethod, cc));

			return cc;
		} catch (CannotCompileException e) {
			throw new MakeClassException(e);
		} catch (NotFoundException e) {
			throw new MakeClassException(e);
		}
	}

	/**
	 * 
	 * @param cc
	 * @param obj
	 * @throws MakeClassException
	 */
	private void createFieldDeclarations(CtClass cc, DomainObject obj) throws MakeClassException {
		try {
			String field = "";
			for (Attribute att : obj.getAtts()) {
				if (!att.getPropertyValue(PropertyInfo.TRANSIENT)) {

					// many to one
					String manytoone = att.getPropertyValue(PropertyInfo.MANYTOONE);
					String onetomany = att.getPropertyValue(PropertyInfo.ONTOMANY);

					field = "private " + getQualifiedType(att, att.getType()) + " " + att.getRef() + ";";
					CtField ctField = CtField.make(field, cc);
					ConstPool cp = ctField.getFieldInfo().getConstPool();

					if (PresentationType.COMBO.getValue().equals(att.getPropertyValue(PropertyInfo.PRESENTATION_TYPE))) {
						createComboItemsProperty(cc, att);
					}

					AnnotationsAttribute fieldAnnotation = new AnnotationsAttribute(cp, AnnotationsAttribute.visibleTag);

					if (manytoone != null) {
						fieldAnnotation.addAnnotation(createAnnoation(cp, "javax.persistence.ManyToOne", null));

						Map<String, MemberValue> params = new HashMap<String, MemberValue>();
						params.put("name", new StringMemberValue(manytoone, cp));
						fieldAnnotation.addAnnotation(createAnnoation(cp, "javax.persistence.JoinColumn", params));
					} else if (onetomany != null) {

						Map<String, MemberValue> params = new HashMap<String, MemberValue>();
						params.put("mappedBy", new StringMemberValue(onetomany, cp));
						params.put("targetEntity", new ClassMemberValue(getRelatedObjectName(att, att.getType()), cp));
						fieldAnnotation.addAnnotation(createAnnoation(cp, "javax.persistence.OneToMany", params));

					} else {
						Map<String, MemberValue> columnParams = new HashMap<String, MemberValue>();
						columnParams.put("name", new StringMemberValue(att.getRef(), cp));
						columnParams.put("nullable", new BooleanMemberValue(!att
								.getPropertyValue(PropertyInfo.REQUIRED), cp));
						columnParams
								.put("length", new IntegerMemberValue(cp, att.getPropertyValue(PropertyInfo.WIDTH)));
						fieldAnnotation.addAnnotation(createAnnoation(cp, "javax.persistence.Column", columnParams));

					}

					ctField.getFieldInfo().addAttribute(fieldAnnotation);

					cc.addField(ctField);
					cc.addMethod(CtMethod.make(genSetMethod(att), cc));
					cc.addMethod(CtMethod.make(genGetMethod(att), cc));
				}
			}
		} catch (CannotCompileException e) {
			throw new MakeClassException(e);
		}
	}

	/**
	 * 
	 * @param cc
	 * @param att
	 * @throws Exception
	 */
	private void createComboItemsProperty(CtClass cc, Attribute att) throws CannotCompileException {
		String itemsField = "private String[] " + att.getRef() + "List;";
		CtField ctItemsField = CtField.make(itemsField, cc);
		cc.addField(ctItemsField);

		StringBuffer method = new StringBuffer();
		method.append("public void set");
		method.append(StringUtils.capitalize(att.getRef() + "List"));
		method.append("(String[] v){");
		method.append("String[]").append(" oldValue = this.").append(att.getRef() + "List").append(";");
		method.append("this.").append(att.getRef() + "List").append(" = v;");
		method.append("changeSupport.firePropertyChange(\"").append(att.getRef() + "List").append("\", oldValue, v);");
		method.append("}");
		cc.addMethod(CtMethod.make(method.toString(), cc));

		method = new StringBuffer();
		method.append("public ");
		method.append("String[] ");
		method.append(" get");
		method.append(StringUtils.capitalize(att.getRef() + "List"));
		method.append("(){");
		method.append("return this.");
		method.append(att.getRef() + "List");
		method.append(";");
		method.append("}");
		cc.addMethod(CtMethod.make(method.toString(), cc));

	}

	private void describeClass(Class<?> cl) {

		StringBuffer sb = new StringBuffer();
		sb.append("\n\npublic class ");
		sb.append(cl.getName());
		sb.append("{\n\n");

		try {
			for (Field f : cl.getDeclaredFields()) {
				for (java.lang.annotation.Annotation ann : f.getDeclaredAnnotations()) {
					sb.append("\t@");
					sb.append(ann.annotationType().getName());
					sb.append("\n");
				}
				sb.append("\tprivate ");
				sb.append(f.getType().getName());
				sb.append(" ");
				sb.append(f.getName());
				sb.append("; \n\n");
			}
		} catch (Throwable e) {
		}
		sb.append("\n}\n");
		log.debug(sb.toString());
	}

	private void createIdField(CtClass cc) throws CannotCompileException {
		String id = "private long id; ";

		CtField field = CtField.make(id, cc);
		cc.addField(field);

		FieldInfo fi = field.getFieldInfo2();

		Map<String, MemberValue> genValueParams = new HashMap<String, MemberValue>();
		Map<String, MemberValue> seqGenParams = new HashMap<String, MemberValue>();

		EnumMemberValue mv = new EnumMemberValue(fi.getConstPool());
		mv.setType("javax.persistence.GenerationType");
		mv.setValue("SEQUENCE");
		genValueParams.put("strategy", mv);
		genValueParams.put("generator", new StringMemberValue("idSeq", fi.getConstPool()));

		seqGenParams.put("name", new StringMemberValue("idSeq", fi.getConstPool()));
		seqGenParams.put("sequenceName", new StringMemberValue("seq_id_pk", fi.getConstPool()));
		seqGenParams.put("initialValue", new IntegerMemberValue(fi.getConstPool(), 1));
		seqGenParams.put("allocationSize", new IntegerMemberValue(fi.getConstPool(), 2));

		AnnotationsAttribute idAnnotation = new AnnotationsAttribute(fi.getConstPool(), AnnotationsAttribute.visibleTag);
		idAnnotation.addAnnotation(createAnnoation(fi.getConstPool(), "javax.persistence.Id", null));
		idAnnotation.addAnnotation(createAnnoation(fi.getConstPool(), "javax.persistence.GeneratedValue",
				genValueParams));
		idAnnotation.addAnnotation(createAnnoation(fi.getConstPool(), "javax.persistence.SequenceGenerator",
				seqGenParams));

		fi.addAttribute(idAnnotation);

	}

	/**
	 * 
	 * @param cp
	 * @param ann
	 * @return
	 */
	private Annotation createAnnoation(ConstPool cp, String ann, Map<String, MemberValue> params) {

		Annotation idAnn = new Annotation(ann, cp);

		if (params != null) {
			for (Map.Entry<String, MemberValue> entry : params.entrySet()) {
				idAnn.addMemberValue(entry.getKey(), entry.getValue());
			}
		}

		return idAnn;
	}

	private boolean isJavaLangType(String type) {
		return javaLangTypes.contains(type);
	}

	/**
	 * 
	 * @param dObj
	 * @param type
	 * @return
	 */
	private String getQualifiedType(Attribute att, String type) {

		if (StringUtils.isNotBlank(att.getPropertyValue(PropertyInfo.ONTOMANY))) {
			return "java.util.Set";
		}

		String returnType = type;
		if (!isJavaLangType(type)) {
			// procura no map de tipos
			if (typeMap.containsKey(type)) {
				returnType = typeMap.get(type);
			} else {
				// procura nos imports
				returnType = getRelatedObjectName(att, type);
			}
		}
		return returnType;
	}

	/**
	 * 
	 * @param att
	 * @param type
	 * @return
	 */
	private String getRelatedObjectName(Attribute att, String type) {
		DomainObject dObj = att.getDomainObject();
		String returnType = type;

		// procura nos imports
		for (Import imp : dObj.getImports()) {
			String[] path = imp.getPath().split("\\.");
			if (path != null && path.length > 0) {
				String last = path[path.length - 1];
				if (type.equals(last)) {
					returnType = imp.getPath();
				}
			}
		}

		return returnType;
	}

	/**
	 * 
	 * @param att
	 * @return
	 */
	private String genSetMethod(Attribute att) {
		StringBuilder method = new StringBuilder();

		method.append("public void set");
		method.append(StringUtils.capitalize(att.getRef()));
		method.append("(");
		method.append(getQualifiedType(att, att.getType()));
		method.append(" v ){");
		method.append(getQualifiedType(att, att.getType())).append(" oldValue = this.").append(att.getRef())
				.append(";");
		method.append("this.").append(att.getRef()).append(" = v;");
		method.append("changeSupport.firePropertyChange(\"").append(att.getRef()).append("\", oldValue, v);");
		method.append("}");

		return method.toString();
	}

	/**
	 * 
	 * @param att
	 * @return
	 */
	private String genGetMethod(Attribute att) {
		StringBuilder method = new StringBuilder();

		method.append("public ");
		method.append(getQualifiedType(att, att.getType()));
		method.append(" get");
		method.append(StringUtils.capitalize(att.getRef()));
		method.append("(){");
		method.append("return this.");
		method.append(att.getRef());
		method.append(";");
		method.append("}");

		return method.toString();
	}

}

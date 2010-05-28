package br.com.maisha.terra;

import java.util.HashMap;
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
import javassist.bytecode.annotation.EnumMemberValue;
import javassist.bytecode.annotation.IntegerMemberValue;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.StringMemberValue;

import org.apache.commons.lang.StringUtils;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.exception.MakeClassException;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ClassMaker implements IClassMaker {

	/**
	 * 
	 * @see br.com.maisha.terra.IClassMaker#make(br.com.maisha.terra.lang.DomainObject)
	 */
	public Class<?> make(ClassLoader cLoader, DomainObject obj) throws MakeClassException {
		try {
			ClassPool pool = ClassPool.getDefault();

			pool.insertClassPath(new ClassClassPath(ModelReference.class));

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

			String field = "";
			for (Attribute att : obj.getAtts()) {
				field = "private " + att.getType() + " " + att.getRef() + ";";
				cc.addField(CtField.make(field, cc));
				cc.addMethod(CtMethod.make(genSetMethod(att), cc));
				cc.addMethod(CtMethod.make(genGetMethod(att), cc));
			}

			return cc.toClass(cLoader, null);
		} catch (CannotCompileException e) {
			throw new MakeClassException(e);
		} catch (NotFoundException e) {
			throw new MakeClassException(e);
		}
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
		idAnnotation.addAnnotation(createAnnoation(fi.getConstPool(), "javax.persistence.GeneratedValue", genValueParams));
		idAnnotation.addAnnotation(createAnnoation(fi.getConstPool(), "javax.persistence.SequenceGenerator", seqGenParams));
		
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
		method.append(att.getType());
		method.append(" v ){");
		method.append(att.getType()).append(" oldValue = this.").append(att.getRef()).append(";");
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
		method.append(att.getType());
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

package br.com.maisha.terra;

import javassist.CannotCompileException;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;

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
	public Class<?> make(DomainObject obj) throws MakeClassException {
		try {
			ClassPool pool = ClassPool.getDefault();

			pool.insertClassPath(new ClassClassPath(ModelReference.class));

			CtClass modelReference = pool.get(ModelReference.class.getName());

			CtClass cc = pool.makeClass(obj.getPckg() + "." + obj.getRef(),
					modelReference);

			String field = "";
			for (Attribute att : obj.getAtts()) {
				field = "private " + att.getType() + " " + att.getRef() + ";";
				cc.addField(CtField.make(field, cc));
				cc.addMethod(CtMethod.make(genSetMethod(att), cc));
				cc.addMethod(CtMethod.make(genGetMethod(att), cc));
			}


			return cc.toClass();
		} catch (CannotCompileException e) {
			throw new MakeClassException(e);
		} catch (NotFoundException e) {
			throw new MakeClassException(e);
		}
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
		method.append(att.getType()).append(" oldValue = this.").append(
				att.getRef()).append(";");
		method.append("this.").append(att.getRef()).append(" = v;");
		method.append("changeSupport.firePropertyChange(\"").append(
				att.getRef()).append("\", oldValue, v);");
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

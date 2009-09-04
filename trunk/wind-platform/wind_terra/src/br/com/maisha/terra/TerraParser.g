parser grammar TerraParser;

options {
  // We're going to output an AST.
  output = AST;

  // We're going to use the tokens defined in our MathLexer grammar.
  tokenVocab = TerraLexer;
}

@header { 
package br.com.maisha.terra; 
import java.util.HashMap;
import java.util.Map;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.rcp.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;
}

@members {
public DomainObject domainObject = null;
private List<Attribute> atts = new ArrayList<Attribute>();
private List<Operation> ops = new ArrayList<Operation>();
private Map<String, Property> props = new HashMap<String, Property>();
private Map<String, Property> op_props = new HashMap<String, Property>();
private List<Import> imports = new ArrayList<Import>();
}



domain_object
	:	(import_declaration)*  DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body? RIGHT_BRACKET{
		domainObject = new DomainObject($NAME.text, $STRING_LITERAL.text);
		domainObject.setAtts(atts);
		domainObject.setOperations(ops);
		domainObject.setImports(imports);
		atts = new ArrayList<Attribute>();
		ops = new ArrayList<Operation>();
	}
	;
	
import_declaration
	:	IMPORT NAME NEWLINE+ {
		imports.add(new Import($NAME.text) );
		
	}
	;
	
body	:    (attr | operation)+;

attr	:   TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET {
		Attribute att = new Attribute($TYPE.text, $NAME.text, $STRING_LITERAL.text);
		att.setProperties(props);
		atts.add(att);
		props = new HashMap<String, Property>();

	}
	;

attr_body :  property+;

property:	NEWLINE | attr_prop_name ATTRIBUITION value {
		IConverterService convService = ServiceProvider.getInstance()
				.getService(IConverterService.class,
						Activator.getDefault().getBundle().getBundleContext());
						
		Class<?> type = PropertyInfo.getPropertyInfo($attr_prop_name.text).getType();
		Object propValue = convService.convert(type, $value.text);
		
		Property p = new Property($attr_prop_name.text, propValue);
		props.put($attr_prop_name.text, p);
	}
	;
attr_prop_name: PROPERTY|ATTRIBUTE_PROPERTY;
value	:	(NUMBER | NAME);


operation:  NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET{
		Operation op = new Operation($OP_TYPE.text, $NAME.text, $STRING_LITERAL.text);
		op.setProperties(op_props);
		ops.add(op);
		op_props = new HashMap<String, Property>();
	}
	;
	
op_body	: op_prop+;

op_prop:	NEWLINE | op_prop_name ATTRIBUITION value {
		IConverterService convService = ServiceProvider.getInstance()
				.getService(IConverterService.class,
						Activator.getDefault().getBundle().getBundleContext());
						
		Class<?> type = PropertyInfo.getPropertyInfo($op_prop_name.text).getType();
		Object propValue = convService.convert(type, $value.text);
		
		Property p = new Property($op_prop_name.text, propValue);
		op_props.put($op_prop_name.text, p);
	}
	;

op_prop_name	: PROPERTY | OPERATION_PROPERTY;

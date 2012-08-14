
grammar Terra;


options {
  output = AST;
  
}

@lexer::header {
package br.com.maisha.terra;  
}

@header {
package br.com.maisha.terra;
 
import java.util.HashMap;
import java.util.Map;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Container;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Validation;
import br.com.maisha.terra.lang.ValidValue;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.rcp.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;
 	
}
 
   
@members {
		public DomainObject domainObject = null;
		private String pckg = "";
		private List<Attribute> atts = new ArrayList<Attribute>();
		private List<Operation> ops = new ArrayList<Operation>();
		private Map<String, Property> props = new HashMap<String, Property>();
		private Map<String, Property> op_props = new HashMap<String, Property>();
		private Map<String, Property> obj_props = new HashMap<String, Property>();
		private Map<String, Property> folder_props = new HashMap<String, Property>();
		private Map<String, Attribute> folder_atts = new HashMap<String, Attribute>();
		private Map<String, Container> folders = new HashMap<String, Container>();
		private List<Import> imports = new ArrayList<Import>();
		private List<Validation> validationRulz = new ArrayList<Validation>();
		private List<ValidationRule> validationRulzEntry = new ArrayList<ValidationRule>();
		private List<ValidValue> validValues = new ArrayList<ValidValue>();
}



ASSIGN: '='; 
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';
LEFT_BRACE: '[';
RIGHT_BRACE: ']';

ATTRIBUITION:':';
DOMAIN_OBJECT:'domain_object';
PACKAGE:'package';
IMPORT:'import'; 
VALIDATION_RULE:	'validationRule';
PRESENTATION_TYPE: 'presentation_type';
SUPPORTED_PRESENTATION_TYPES: 'text' | 'radio' | 'checkbox' | 'combo' | 'list' | 'textarea' | 'date' | 'related' | 'embedded_object' | 'group' | 'label' | 'navigation';
PROPERTY:	'x' | 'y' | 'colspan' | 'rowspan' |  'disabled' |  'icon' | 'width' | 'height' | 'tooltip';
ATTRIBUTE_PROPERTY: 'folder' | 'parent_group' | 'visibleInEdition' | 'visibleInGrid' | 'content' | 'value' | 'validValues' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' ;
OPERATION_PROPERTY: 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' ;
OBJECT_PROPERTY: 'open_filtering' | 'event_handler' ;
FOLDER_PROPERTY: 'sequence' ;
GENERAL_PROPERTY: 'visible';
OPERATION: 'operation';
ATTRIBUTE: 'attribute'; 
FOLDER : 'Folder'; 

OP_TYPE: 'java' | 'python' | 'groovy';

NUMBER: INTEGER | FLOAT;
fragment FLOAT: INTEGER '.' '0'..'9'+;
fragment INTEGER: '0'..'9' '0'..'9'*;
NAME: LETTER (LETTER | DIGIT |  '.' | '_' | '/' )+;
//STRING_LITERAL: '"' NONCONTROL_CHAR* '"';
STRING_LITERAL:  ('"' (~'"')* '"');

TYPE2	:	LETTER+;

EXPRESSION
	: '${'NONCONTROL_CHAR+'}';

fragment NONCONTROL_CHAR: LETTER | DIGIT | SYMBOL | SPACE;
fragment LETTER: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment DIGIT: '0'..'9';
fragment SPACE: ' ' | '\t';

fragment SYMBOL: '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~' ;



NEWLINE: ('\r'? '\n')+;
WHITESPACE: SPACE+ { $channel = HIDDEN; }; 



domain_object
	:	(package_declaration) (import_declaration)*  DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body? RIGHT_BRACKET{
		domainObject = new DomainObject($NAME.text, $STRING_LITERAL.text);
		domainObject.setPckg(pckg);
		domainObject.setAtts(atts);
		domainObject.setOperations(ops);
		domainObject.setImports(imports);
		domainObject.setValidations(validationRulz);
		domainObject.setProperties(obj_props);
		domainObject.setContainers(folders);
		folders = new HashMap<String, Container>();
		atts = new ArrayList<Attribute>();
		ops = new ArrayList<Operation>();
		obj_props = new HashMap<String, Property>();
		validationRulz = new ArrayList<Validation>();
	}
	;

package_declaration
	:	PACKAGE NAME NEWLINE+ {
		pckg = $NAME.text;
		
	}
	;
	
import_declaration
	:	IMPORT NAME NEWLINE+ {
		imports.add(new Import($NAME.text) );
		
	}
	;
	
body	:    (attr | operation | validation_rulz | obj_property | folder | NEWLINE)+;

obj_property: OBJECT_PROPERTY ATTRIBUITION (value|expression) {
		IConverterService convService = ServiceProvider.getInstance()
				.getService(IConverterService.class,
						Activator.getDefault().getBundleContext());
						
		Class<?> type = PropertyInfo.getPropertyInfo($OBJECT_PROPERTY.text).getType();
		Object propValue = convService.convert(type, $value.text);
		
		Property p = new Property($OBJECT_PROPERTY.text, propValue);
		p.setExpression($expression.text);
		obj_props.put($OBJECT_PROPERTY.text, p);		
}
;

attr	: ATTRIBUTE type=NAME ref=NAME STRING_LITERAL LEFT_BRACKET attr_body+ RIGHT_BRACKET {
		Attribute att = new Attribute($type.text, $ref.text, $STRING_LITERAL.text);
		att.setDomainObject(domainObject);		
		att.setProperties(props);
		
		String folder = att.getPropertyValue(PropertyInfo.FOLDER);
		if(folder != null && folder.length() > 0){
      Container c = folders.get(folder);
      if(c != null){
        c.addAttribute(att.getRef());
      }
    }
		
		atts.add(att);
		props = new HashMap<String, Property>();

	}
	;



attr_body :NEWLINE | property  |  prstn_type  ;

prstn_type: PRESENTATION_TYPE ':' SUPPORTED_PRESENTATION_TYPES 'using'* array* {
    Property p = new Property($PRESENTATION_TYPE.text, $SUPPORTED_PRESENTATION_TYPES.text);
    p.setValidValues(validValues);
    props.put($PRESENTATION_TYPE.text, p);
    validValues = new ArrayList<ValidValue>();
};



property:	 attr_prop_name ATTRIBUITION (value|expression|array){
		IConverterService convService = ServiceProvider.getInstance()
				.getService(IConverterService.class,
						Activator.getDefault().getBundleContext());
					
		Class<?> type = PropertyInfo.getPropertyInfo($attr_prop_name.text).getType();
		Object propValue = convService.convert(type, $value.text);
		
		Property p = new Property($attr_prop_name.text, propValue);
		p.setExpression($expression.text);
		p.setValidValues(validValues);
		props.put($attr_prop_name.text, p);
		validValues = new ArrayList<ValidValue>();
	}
	;
	
attr_prop_name: PROPERTY|ATTRIBUTE_PROPERTY;

value	:	(NUMBER | NAME | STRING_LITERAL);

expression
	:	EXPRESSION;
	
array : LEFT_BRACE validValue (',' validValue)* RIGHT_BRACE ;

validValue: vValue=STRING_LITERAL{
     validValues.add(new ValidValue($vValue.text));
};

operation:  OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET{
		Operation op = new Operation($OP_TYPE.text, $NAME.text, $STRING_LITERAL.text);
		op.setDomainObject(domainObject);
		op.setProperties(op_props);
		ops.add(op);
		op_props = new HashMap<String, Property>();
	}
	;
	
op_body	: op_prop+;

op_prop:	NEWLINE | op_prop_name ATTRIBUITION value {
		IConverterService convService = ServiceProvider.getInstance()
				.getService(IConverterService.class,
						Activator.getDefault().getBundleContext());
						
		Class<?> type = PropertyInfo.getPropertyInfo($op_prop_name.text).getType();
		Object propValue = convService.convert(type, $value.text);
		
		Property p = new Property($op_prop_name.text, propValue);
		op_props.put($op_prop_name.text, p);
	}
	;

op_prop_name	: PROPERTY | OPERATION_PROPERTY | GENERAL_PROPERTY;


validation_rulz:  VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET{
		Validation validation = new Validation($NAME.text);
		validation.setRules(validationRulzEntry);
		validationRulz.add(validation);
		validationRulzEntry = new ArrayList<ValidationRule>();
};

validation_body : validation_entry+;

validation_entry: NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION {
		ValidationRule valRule = new ValidationRule($STRING_LITERAL.text, $EXPRESSION.text);
		validationRulzEntry.add(valRule);
};

folder: FOLDER NAME STRING_LITERAL LEFT_BRACKET folder_body RIGHT_BRACKET{
    Container f = new Container($NAME.text, $STRING_LITERAL.text);
    f.setDomainObject(domainObject);
    f.setProperties(folder_props);
    f.setType(Container.PresentationType.FOLDER);
    folders.put(f.getRef(), f);
    folder_props = new HashMap<String, Property>();
}; 

folder_body: folder_props+;
folder_prop_name: FOLDER_PROPERTY | GENERAL_PROPERTY;

folder_props: NEWLINE | folder_prop_name ATTRIBUITION (value|expression){
    IConverterService convService = ServiceProvider.getInstance()
        .getService(IConverterService.class,
            Activator.getDefault().getBundleContext());
            
    Class<?> type = PropertyInfo.getPropertyInfo($folder_prop_name.text).getType();
    Object propValue = convService.convert(type, $value.text);
    
    Property p = new Property($folder_prop_name.text, propValue);
    p.setExpression($expression.text);
    folder_props.put($folder_prop_name.text, p);
}; 

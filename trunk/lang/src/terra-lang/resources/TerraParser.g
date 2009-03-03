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
import br.com.maisha.terra.lang.TerraClass;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Property;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String, List<TerraClass>> memory = new HashMap<String, List<TerraClass>>();
List<Attribute> atts = new ArrayList<Attribute>();
List<Property> props = new ArrayList<Property>();
}



domain_object
	:	(import_declaration)*  DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body RIGHT_BRACKET{
		List<TerraClass> l = memory.get("domain_object"); 
		if(l == null) l = new ArrayList<TerraClass>();
		DomainObject domainObj = new DomainObject($NAME.text, $STRING_LITERAL.text);
		l.add(domainObj);
		memory.put("domain_object", l);
		domainObj.setAtts(atts);
		atts = new ArrayList<Attribute>();
	}
	;
	
import_declaration
	:	IMPORT NAME NEWLINE+ {
		List<TerraClass> l = memory.get("import"); 
		if(l == null) l = new ArrayList<TerraClass>();
		l.add(new Import($NAME.text));
		memory.put("import", l);
	}
	;
	
body	:    attr+  ;

attr	: NEWLINE | TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET {
		Attribute att = new Attribute($TYPE.text, $NAME.text, $STRING_LITERAL.text);
		att.setProps(props);
		atts.add(att);
		props = new ArrayList<Property>();

	}
	;

attr_body :  property+;

property:	NEWLINE | PROPERTY ATTRIBUITION value {
		Property p = new Property($PROPERTY.text, $value.text);
		props.add(p);
	}
	;
	
value	:	(NUMBER | NAME);

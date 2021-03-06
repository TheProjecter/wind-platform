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
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Property;
}

@members {
public DomainObject domainObject = null;
private List<Attribute> atts = new ArrayList<Attribute>();
private List<Property> props = new ArrayList<Property>();
private List<Import> imports = new ArrayList<Import>();
}



domain_object
	:	(import_declaration)*  DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body RIGHT_BRACKET{
		domainObject = new DomainObject($NAME.text, $STRING_LITERAL.text);
		domainObject.setAtts(atts);
		domainObject.setImports(imports);
		atts = new ArrayList<Attribute>();
	}
	;
	
import_declaration
	:	IMPORT NAME NEWLINE+ {
		imports.add(new Import($NAME.text) );
		
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

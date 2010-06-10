lexer grammar TerraLexer;

@header { package br.com.maisha.terra; }

ASSIGN: '=';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';

ATTRIBUITION:':';
DOMAIN_OBJECT:'domain_object';
PACKAGE:'package';
IMPORT:'import'; 
VALIDATION_RULE:	'validationRule';
TYPE	:	'Integer' | 'Double' | 'Float' | 'Long' | 'Short' | 'Boolean' | 'String' | 'Date'  ;
PROPERTY:	'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' |  'disabled' | 'visible' | 'icon' | 'width' | 'height' | 'tooltip';
ATTRIBUTE_PROPERTY: 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' ;
OPERATION_PROPERTY: 'class' | 'file' | 'validWhen' ;
OPERATION: 'operation';

OP_TYPE: 'java' | 'python' | 'groovy';

NUMBER: INTEGER | FLOAT;
fragment FLOAT: INTEGER '.' '0'..'9'+;
fragment INTEGER: '0'..'9' '0'..'9'*;
NAME: LETTER (LETTER | DIGIT |  '.' | '_' )+;
STRING_LITERAL: '"' NONCONTROL_CHAR* '"';

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

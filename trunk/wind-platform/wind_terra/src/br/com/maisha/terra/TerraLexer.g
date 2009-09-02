lexer grammar TerraLexer;

@header { package br.com.maisha.terra; }

ASSIGN: '=';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';

ATTRIBUITION:':';
DOMAIN_OBJECT:'domain_object';
IMPORT:'import';
TYPE	:	'int' | 'double' | 'float' | 'long' | 'short' | 'boolean' | 'String';
PROPERTY:	'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'disabled' | 'visible' | 'icon' | 'width' | 'height';
OPERATION: 'operation';
OP_TYPE: 'java' | 'python' | 'groowy';

NUMBER: INTEGER | FLOAT;
fragment FLOAT: INTEGER '.' '0'..'9'+;
fragment INTEGER: '0'..'9' '0'..'9'*;
NAME: LETTER (LETTER | DIGIT | '_')*;
STRING_LITERAL: '"' NONCONTROL_CHAR* '"';

fragment NONCONTROL_CHAR: LETTER | DIGIT | SYMBOL | SPACE;
fragment LETTER: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment DIGIT: '0'..'9';
fragment SPACE: ' ' | '\t';

fragment SYMBOL: '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~';



NEWLINE: ('\r'? '\n')+;
WHITESPACE: SPACE+ { $channel = HIDDEN; };

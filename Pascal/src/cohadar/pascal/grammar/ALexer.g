lexer grammar ALexer;


@lexer::header{
package cohadar.pascal.grammar;
}


//----------------------------------------------------------------------------
// The Pascal scanner
//----------------------------------------------------------------------------

// Not Yet Implemented
//NYI1	:	'NYI1'; 
//NYI2	:	'NYI2'; 

// CONCURRENT PASCAL KEYWORDS
SHARED		:	'shared';
COBEGIN		:	'cobegin';
COEND		:	'coend';
COFOR		:	'cofor';
SEMAPHORE	:	'semaphore';
REGION		:	'region';
AWAIT		:	'await';

// DEFAULT PASCAL KEYWORDS
  PROGRAM          : 'program'         ;
  CONST            : 'const'           ;
  TYPE             : 'type'            ;
  VAR              : 'var'             ;

  BOOLEAN          : 'boolean'         ;
  INTEGER          : 'integer'         ;
  REAL             : 'real'            ;
//  STRING	   : 'string'          ;
  ARRAY            : 'array'           ;
  OF               : 'of'              ;
  RECORD           : 'record'          ;
  
  TRUE             : 'true'            ;
  FALSE            : 'false'           ;

  PROCEDURE        : 'procedure'       ;
  FUNCTION         : 'function'        ;

  BEGIN            : 'begin'           ;
  END              : 'end'             ;

  IF               : 'if'              ;
  THEN             : 'then'            ;
  ELSE             : 'else'            ;
  WHILE            : 'while'           ;
  DO               : 'do'              ;
  REPEAT           : 'repeat'          ;
  UNTIL            : 'until'           ;
  FOR              : 'for'             ;
  TO               : 'to'              ;
  DOWNTO           : 'downto'          ;
  BREAK            : 'break'           ;

  AND              : 'and'             ;
  OR               : 'or'              ;
  XOR              : 'xor'             ;
  NOT              : 'not'             ;

  DIV              : 'div'             ;
  MOD              : 'mod'             ;

//----------------------------------------------------------------------------
// OPERATORS
//----------------------------------------------------------------------------
PLUS            : '+'   ;
MINUS           : '-'   ;
STAR            : '*'   ;
SLASH           : '/'   ;
ASSIGN          : ':='  ;
COMMA           : ','   ;
SEMI            : ';'   ;
COLON           : ':'   ;
DOTDOT		: '::'  ;
DOT             : '.'   ;// ('.' {$setType(DOTDOT);})?  ;
EQUAL           : '='   ;
NOT_EQUAL       : '<>'  ;
LT              : '<'   ;
LE              : '<='  ;
GE              : '>='  ;
GT              : '>'   ;
LPAREN          : '('   ;
RPAREN          : ')'   ;
LBRACK          : '['   ; // line_tab[line]
RBRACK          : ']'   ;
LCURLY          : '{' ;
RCURLY          : '}' ;
//STRING          : 'string'          ;


// Whitespace -- ignored
WS      : ( ' '
		|	'\t'
		|	'\f'
		// handle newlines
		|	(	'\r\n'  // Evil DOS
			|	'\r'    // Macintosh
			|	'\n'    // Unix (the right way)
			)
			{ //newline(); 
			}
		)
		{ $channel=HIDDEN; }
	;
	
COMMENT_0
    :   	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;	


COMMENT_1
	:	'(*' ( options {greedy=false;} : . )* '*)' {$channel=HIDDEN;}
	;

COMMENT_2
        :	'{'  ( options {greedy=false;} : . )*  '}' {$channel=HIDDEN;}
	;

IDENT:	
	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;

// string literals
STRING_LITERAL
	: '\'' ('\'\'' | ~('\''))* '\''   //pspsps   * in stead of + because of e.g. ''
	;

HEX_INT	: '$' HEX_DIGIT+
	;

NUM_INT 
	:  DIGIT+ 
	;	

/**
 *  digits .
 *  digits . digits
 *  digits . digits exponent
 *  digits . exponent
 *  digits exponent
 */
NUM_REAL
	: DIGIT+
	(
		  DOT 
		| DOT DIGIT+
		| DOT DIGIT+ EXPONENT
		| DOT EXPONENT
		| EXPONENT
	)?
	;


fragment
DIGIT	:	
	('0'..'9')
;

fragment
HEX_DIGIT	:	
	('0'..'9')|('a'..'f')|('A'..'F')
;


fragment
EXPONENT
	:	('e'|'E') ('+'|'-')? DIGIT+
	;


grammar Assembler;

@lexer::header{
package cohadar.assembler.grammar;
import cohadar.assembler.code.TextParam;
}

@parser::header{
package cohadar.assembler.grammar;
import cohadar.assembler.code.TextParam;
}


// START: members
@members {
	private IParserPolicy policy;
}
// END: members



program[IParserPolicy p]
@init{
	this.policy = p;
}
    :   line* EOF
    ;
    
line	:	NEWLINE
	|	segmentType NEWLINE	{ policy.startSegment($segmentType.start); }
	|	instruction NEWLINE	
	|	label NEWLINE		
	|	function NEWLINE
	|	variable NEWLINE	
	;
		
segmentType	:	(CODE | SHARED | INSTANCE)	
	;
    
instruction returns [Token op]
	: INSTRUCTION0 operand? { policy.instruction0($INSTRUCTION0, $operand.start); }
	| INSTRUCTION1 operand? { policy.instruction1($INSTRUCTION1, $operand.start); }
	;
		    

label
    :   LID COLON?	{ policy.label($LID, $COLON); }
   ;  


function
    	:   LID LB arguments RB COLON integer? 			{ policy.function($LID, $arguments.argList, null, $integer.start); }
     	|   LID LB arguments RB LC locals RC COLON integer?  	{ policy.function($LID, $arguments.argList, $locals.argList, $integer.start); }	
    ;

    
variable:
		ID COLON integer { policy.variable($ID, $integer.start); }
	;    
	
	
param returns [TextParam ret]
	:	ID { $ret = policy.param($ID, null); }
	|	ID COLON integer { $ret = policy.param($ID, $integer.start); }
	;	
  
arguments returns [List<TextParam> argList]
@init{
	argList = new ArrayList<TextParam>();
}
	:	
	| a=param  { argList.add($a.ret); } (COMMA b=param  { argList.add($b.ret); })*
	;    
	

locals returns [List<TextParam> argList]
@init{
	argList = new ArrayList<TextParam>();
}
	:	
	| a=param  { argList.add($a.ret); } (COMMA b=param  { argList.add($b.ret); })*
	;    

operand
    :   ID   // basic variable name
    |   LID  // label or function name
    |   SID  // system function name
    |   constant
    ;

constant 
	:	integer
	|	FLOAT
	|	STRING
	|	TRUE 
	|	FALSE
	;

integer	:	INT
	|	HEX
;
	
COLON	:	':';
COMMA	:	',';
LB	:	'(';
RB	:	')';
LC	:	'{';
RC	:	'}';

TRUE	:	'true' | 'TRUE';	
FALSE	:	'false' | 'FALSE';

SHARED	:	'.SHARED';
INSTANCE:	'.INSTANCE';
CODE	:	'.CODE';


INSTRUCTION0
	:	'add'
	|	'sub'
	|	'mul'
	|	'div'
	|	'mod'
	|	'inc'
	|	'dec'
	|	'neg'
	|	'eq'
	|	'neq'
	|	'lt'
	|	'lte'
	|	'gt'
	|	'gte'
	|	'and'
	|	'or'
	|	'xor'
	|	'not'
	|	'load'
	|	'store'
	|	'aload'
	|	'astore'
	|	'bload'
	|	'bstore'
	|	'join'
	|	'ret'
	|	'dup'
	|	'nop'
	|	'swap'
	|	'i2f'
	|	'fadd'
	|	'fdec'
	|	'fdiv'
	|	'finc'
	|	'fmod'
	|	'fmul'
	|	'fneg'
	|	'fsub'	
	|	'feq'	
	|	'fneq'	
	|	'flt'	
	|	'flte'	
	|	'fgt'	
	|	'fgte'
	|	'range'
	|	'index'		
;

INSTRUCTION1
	:	'br'
	|	'brf'
	|	'brt'
	|	'brz'
	|	'brnz'		
	|	'fork'	
	|	'call'
	|	'syscall'	
	
	|	'addr'
	
	|	'const'
	|	'dis'
	|	'exit'
	;


ID  :   LETTER (LETTER | '0'..'9')* ;
LID  :  '@' (LETTER | '0'..'9')+ ;
SID  :  '%' (LETTER | '0'..'9')+ ;


FUNC:   ID '()' {setText($ID.text);} ;

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z' | '_')
    ;
    
INT :   '-'? DIGIT+ ;

HEX	:	'0x' (HEX_DIGIT)+;


fragment
DIGIT	:	'0'..'9'
	;
	
fragment
HEX_DIGIT	:	'0'..'9' | 'a'..'f' | 'A'..'F'
	;	

FLOAT
    :   INT '.' INT*
    |   '.' INT+
    ;

WS  :   (' '|'\t')+ {skip();} ;


COMMENT
    :   '//' ~('\n'|'\r')* {$channel=HIDDEN;}
    ;


NEWLINE
    :   '\r' '\n' | '\r' | '\n'
    ;

STRING 
    :  '\'' RAW_STRING '\'' {setText($RAW_STRING.text);}
    ;
    
fragment
RAW_STRING
	: ( ~('\'') )*;
	

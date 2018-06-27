tree grammar CWalker; // yields CWalker.java
options {
tokenVocab=BParser; // read token types from P.tokens file
ASTLabelType = CommonTree;
//backtrack=true;
}

@header{
package cohadar.pascal.grammar;
import cohadar.pascal.walking.*;
}

@members{
private	IStrategy njak;
public void setStrategy(IStrategy njak){
	this.njak = njak;
}
}

    

program
	:	^( PROGRAM global_block* mainBody) { njak.program($PROGRAM); }
;


global_block
    : variableDeclaration[true]
    | typeDeclaration
    | constantDefinition
    | procedureDeclaration
    | functionDeclaration    
    ;
    
mainBody:	
     compoundStatement { njak.mainBody($start); }
;     
    
//=============================================================================
//  DECLARATIONS
//=============================================================================
variableDeclaration[boolean global]
    : ^(INSTANCE identifierList type) { njak.variableDeclaration(false, $global, $identifierList.start, $type.start); }
    | ^(SHARED identifierList type) { njak.variableDeclaration(true, $global, $identifierList.start, $type.start); }
    ;    
    
identifierList
    : ^(IDLIST IDENT+)
    ;

procedureStart
	: PROCEDURE { njak.functionStart($PROCEDURE); }	
	;
    
procedureDeclaration
    : ^(h=procedureStart f=formalParameterList l=localParamaterList body) { njak.functionDeclaration($h.start, $f.start, $l.start, $body.start, null); }
    ;

functionStart:
	FUNCTION { njak.functionStart($FUNCTION); }	
;

functionDeclaration
    : ^(h=functionStart f=formalParameterList l=localParamaterList body ret=typeIdentifier) { njak.functionDeclaration($h.start, $f.start, $l.start, $body.start, $ret.start); }
    ;    
    
formalParameterList
    : ^(LIST formalParameterSection*)
    ;    
    
formalParameterSection
    : ^(BY_VALUE parameterDeclaration[false])
    | ^(BY_REFERENCE parameterDeclaration[true])
    ;   
    
    
parameterDeclaration[boolean byref]
    : identifierList typeIdentifier  { njak.parameterDeclaration(byref, $identifierList.start, $typeIdentifier.start); }
    ;      
    
localParamaterList    
	:	
	^(LIST variableDeclaration[false]*)
	;

typeDeclaration
    : ^(TYPE type) { njak.typeDeclaration($TYPE, $type.start); }
;    

//=============================================================================
//  CONSTANTS
//=============================================================================
constantDefinition
    : ^(CONST expression) { njak.constantDefinition($CONST, $expression.start); }
    ;

//=============================================================================
//  TYPES
//=============================================================================
type
    : typeIdentifier
    | arrayType
    | recordType
    ; 


typeIdentifier
@after { njak.typeIdentifier($start); }
    	:	BOOLEAN
    	|	INTEGER
    	|	REAL
    	|	SEMAPHORE
    	|	IDENT
    	|       subrangeType
    ;    
    
subrangeType
    : ^(DOTDOT low=expression high=expression) { njak.subrangeType($DOTDOT, $low.start, $high.start); }
    ;     
    
arrayType
    	:  ^(ARRAY typeIdentifier type) { njak.arrayType($ARRAY, $typeIdentifier.start, $type.start); }
;

recordStart
	: RECORD { njak.recordStart($RECORD); }	
	;

recordType
    : ^(recordStart fieldDeclaration+) { njak.recordType($start); }
    ;


fieldDeclaration
    : ^(COLON identifierList type) { njak.fieldDeclaration($COLON, $identifierList.start, $type.start); }
    ;
    
//=============================================================================
//  STATEMENTS
//=============================================================================
body:	
	compoundStatement
	; 
    
statement
    : compoundStatement
    | cobeginStatement
    | assignmentStatement
    | callStatement
    | ifStatement
    | whileStatement
    | repeatStatement
    | forStatement       
    | breakStatement
    | coforStatement  
    | regionStatement
    | awaitStatement
;    

compoundStatement
    : ^(BEGIN statement*) { njak.compoundStatement($start); }
    ;
    

cobeginStatement
    : ^(COBEGIN statement*) { njak.cobeginStatement($start); }
    ;    
    
assignmentStatement
    : ^(ASSIGN variable[true] expression) { njak.assignmentStatement($ASSIGN, $variable.start, $expression.start); }
    ;      
    
callStatement
@after{  njak.functionCall($start); }
    : ^(CALL expression*) 
    ;      
    
ifStatement
    : ^(IF c=expression t=statement (e=statement)?) { njak.ifStatement($IF, $c.start, $t.start, $e.start); }
    ;    

whileStatement
    : ^(WHILE c=expression (d=statement)?) { njak.whileStatement($WHILE, $c.start, $d.start); }
    ;    
    
repeatStatement
    :  ^(REPEAT ^(LIST statement*) expression) { njak.repeatStatement($REPEAT, $LIST, $expression.start); }
    ;

forStatement
	: ^(FOR TO a=expression b=expression (c=statement)?) { njak.forStatement($FOR, false, $a.start, $b.start, $c.start); }
	| ^(FOR DOWNTO a=expression b=expression (c=statement)?) { njak.forStatement($FOR, true, $a.start, $b.start, $c.start); }
;        

coforStatement
	: ^(COFOR TO a=expression b=expression (c=statement)?) { njak.coforStatement($COFOR, false, $a.start, $b.start, $c.start); }
	| ^(COFOR DOWNTO a=expression b=expression (c=statement)?) { njak.coforStatement($COFOR, true, $a.start, $b.start, $c.start); }
;  


breakStatement
	:	
	BREAK { njak.breakStatement($BREAK); }
	;    

regionStatement
	: ^(REGION simpleVariable statement) { njak.regionStatement($REGION, $simpleVariable.start, $statement.start); }	
	;           
	
awaitStatement
	: ^(AWAIT expression) { njak.awaitStatement($AWAIT, $expression.start); }		
;	 
        
//=============================================================================
//  EXPRESSIONS
//=============================================================================    
logicOperator
	: AND | OR | XOR
	;
	
equalityOperator
	: EQUAL | NOT_EQUAL
	;
	
comparisonOperator
	: LT | LE | GE | GT
	;
	
arithmeticOperator
	: PLUS | MINUS | STAR | DIV | MOD | SLASH
	;	

expression
    : ^(op10=logicOperator a=expression b=expression) { njak.logicOperator($op10.start, $a.start, $b.start); }
    | ^(op11=equalityOperator a=expression b=expression) { njak.equalityOperator($op11.start, $a.start, $b.start); }
    | ^(op12=comparisonOperator a=expression b=expression) { njak.comparisonOperator($op12.start, $a.start, $b.start); }
    | ^(op2=arithmeticOperator a=expression b=expression) { njak.arithmeticOperator($op2.start, $a.start, $b.start); }
    | ^(UNARY_MINUS a=expression) { njak.unaryMinus($UNARY_MINUS, $a.start); }
    | ^(NOT a=expression) { njak.not($NOT, $a.start); }
    | variable[false]
    | functionCall
    | literal
    ;
    
simpleVariable
	: IDENT	{ njak.variable(false, $start); };    
    
variable[boolean lhs]:	
	^(IDENT variableSuffix*) { njak.variable($lhs, $start); }
    ;       
    
variableSuffix
	: arrayField
	| recordField	
;    

arrayField
	: ^(LBRACK expression)
;
	
recordField
	: ^(DOT IDENT)
;           

functionCall
    : ^(CALL expression*) { njak.functionCall($start); }
    ;
    
literal
@after{ njak.literal($start); }
    : HEX_INT
    | NUM_INT 
    | NUM_REAL
    | STRING_LITERAL 
    | TRUE
    | FALSE
    ;
 
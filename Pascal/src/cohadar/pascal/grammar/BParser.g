parser grammar BParser;


options {
	tokenVocab=ALexer;
	ASTLabelType=CommonTree;
	output=AST;
}

tokens{
	IDLIST;		// list of identifiers;
	PARAMETERS;	// all parameters of proc/func.
	LOCALVARS;	// local variables
	//PARAM_GROUP;	// group of parameters with same type
	
	INSTANCE;	// opposite of shared - normal global variables
	
	CALL;
	LIST; 		// virtual token for grouping of lists
	BY_VALUE;
	BY_REFERENCE;
	
	UNARY_MINUS;    // set on MINUS tokens when used as unary operation
}

@parser::header{
package cohadar.pascal.grammar;
}



program :	PROGRAM IDENT SEMI global_block* mainBody DOT -> ^( PROGRAM[$IDENT] global_block* mainBody)
;

global_block
	: variableDeclarations
      	| typeDeclarations
      	| constantDeclarations
      	| procedureDeclaration
      	| functionDeclaration      	
    ;

mainBody:	
	compoundStatement	
; 

    

//=============================================================================
//  DECLARATIONS
//=============================================================================
variableDeclarations
    : VAR variableDeclaration ( SEMI variableDeclaration )* SEMI -> variableDeclaration+
    ;
    

variableDeclaration
    : id = identifierList COLON t = type -> ^(INSTANCE[$COLON] $id $t)
    | id = identifierList COLON SHARED t = type -> ^(SHARED $id $t)
    ;    
      

identifierList
    : IDENT ( COMMA IDENT )* -> ^(IDLIST IDENT+)
    ;


procedureDeclaration
    : PROCEDURE IDENT formalParameterList SEMI localParamaterList body 
      -> ^(PROCEDURE[$IDENT] formalParameterList localParamaterList body)
    ;
    

functionDeclaration
    : FUNCTION IDENT formalParameterList COLON typeIdentifier SEMI localParamaterList body 
      -> ^(FUNCTION[$IDENT] formalParameterList localParamaterList body typeIdentifier) 
    ;    
    
    
formalParameterList
    : LPAREN RPAREN -> LIST
    | LPAREN e+=formalParameterSection ( SEMI e+=formalParameterSection)* RPAREN -> ^(LIST $e+)
    | -> LIST
    ;    
    
formalParameterSection
    : parameterGroup -> ^(BY_VALUE parameterGroup)
    | VAR parameterGroup -> ^(BY_REFERENCE parameterGroup)
    ;    
    
parameterGroup
    : identifierList COLON! typeIdentifier 
    ;    

localParamaterList    
	:	
	variableDeclarations* -> ^(LIST variableDeclarations*)
	;
    
typeDeclarations
    : TYPE! typeDeclaration ( SEMI! typeDeclaration )* SEMI!
    ;

typeDeclaration
    : IDENT EQUAL type -> ^(TYPE[$IDENT] type)
;



//=============================================================================
//  CONSTANTS
//=============================================================================
constantDeclarations
    : CONST! constantDefinition ( SEMI! constantDefinition )* SEMI!
    ;

constantDefinition
    : IDENT EQUAL expression -> ^(CONST[$IDENT] expression)
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
    	:	BOOLEAN
    	|	INTEGER
    	|	REAL
    	|	SEMAPHORE
    	|	IDENT
    	|       subrangeType
    ;    
    
subrangeType
    : expression DOTDOT^ expression 
    ;     
    
arrayType
    : ARRAY^ LBRACK! typeIdentifier RBRACK! OF! type
;


recordType
    : RECORD^ fieldDeclaration ( SEMI! fieldDeclaration )* SEMI!? END!
    ;


fieldDeclaration
    : identifierList COLON^ type
    ;

	
//=============================================================================
//  STATEMENTS
//=============================================================================
body:	
	compoundStatement SEMI!
	; 

statementList
    : statement ( SEMI! statement? )* 
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
    : BEGIN^
		statementList?
      END!
    ;
    
cobeginStatement
    : COBEGIN^
		statementList?
      COEND!
    ;
    
assignmentStatement
    : variable ASSIGN^ expression
    ;    
    
callStatement
    : IDENT ( LPAREN expressionList? RPAREN )? -> ^(CALL[$IDENT] expressionList?)
    ;    


ifStatement
    : IF^ expression THEN! statement
      (	ELSE! statement )?
    ;
    
whileStatement
    : WHILE^ expression DO! statement?
    ;

repeatStatement
    : REPEAT statementList? UNTIL expression -> ^(REPEAT ^(LIST statementList?) expression)
    ;

forStatement
    : FOR IDENT ASSIGN a=expression (
    	  TO     b=expression DO statement? -> ^(FOR[$IDENT] TO $a $b statement?)
    	| DOWNTO b=expression DO statement? -> ^(FOR[$IDENT] DOWNTO $a $b statement?)
    	) 
    ;  
    
breakStatement
	:	
	BREAK
	;    
    
coforStatement
    : COFOR IDENT ASSIGN a=expression (
    	  TO     b=expression DO statement? -> ^(COFOR[$IDENT] TO $a $b statement)
    	| DOWNTO b=expression DO statement? -> ^(COFOR[$IDENT] DOWNTO $a $b statement)
    	) 
    ;      
    
regionStatement
	: REGION simpleVariable DO statement -> ^(REGION simpleVariable statement)	
	;    
    
awaitStatement
	: AWAIT expression -> ^(AWAIT expression)	
	;    
    
//=============================================================================
//  EXPRESSIONS
//=============================================================================    
expression
    : simpleExpression
	  ( (EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GE^ | GT^) simpleExpression )*
    ;
    
simpleExpression
    : term ( (PLUS^ | MINUS^ | OR^ | XOR^) term )*
    ;
      
term	:	
    signedFactor ( (STAR^ | SLASH^ | DIV^ | MOD^ | AND^) signedFactor )*
    ;      
        
signedFactor
    : factor
    | PLUS factor -> factor
    | MINUS factor -> ^(UNARY_MINUS[$MINUS] factor)
    ;
            
factor
    : variable
    | LPAREN! expression RPAREN!
    | functionCall
    | literal
    | NOT^ factor
    ;
 
literal
    : HEX_INT
    | NUM_INT
    | NUM_REAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    ; 
 
functionCall
    : IDENT LPAREN expressionList? RPAREN -> ^(CALL[$IDENT] expressionList?)
    ;


expressionList
    : expression ( COMMA! expression )*
    ;    
       
simpleVariable
	:	IDENT;
       
variable:	
	IDENT^ variableSuffix*
    ;       
    
variableSuffix
	: arrayField
	| recordField	
;    

arrayField
	: LBRACK^ expression RBRACK!
;
	
recordField
	: DOT^ IDENT
;

    
 
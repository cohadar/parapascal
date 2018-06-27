// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g 2011-07-21 11:04:27

package cohadar.pascal.grammar;
import cohadar.pascal.walking.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SHARED", "COBEGIN", "COEND", "COFOR", "SEMAPHORE", "REGION", "AWAIT", "PROGRAM", "CONST", "TYPE", "VAR", "BOOLEAN", "INTEGER", "REAL", "ARRAY", "OF", "RECORD", "TRUE", "FALSE", "PROCEDURE", "FUNCTION", "BEGIN", "END", "IF", "THEN", "ELSE", "WHILE", "DO", "REPEAT", "UNTIL", "FOR", "TO", "DOWNTO", "BREAK", "AND", "OR", "XOR", "NOT", "DIV", "MOD", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", "DOTDOT", "DOT", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LCURLY", "RCURLY", "WS", "COMMENT_0", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "HEX_DIGIT", "HEX_INT", "DIGIT", "NUM_INT", "EXPONENT", "NUM_REAL", "IDLIST", "PARAMETERS", "LOCALVARS", "INSTANCE", "CALL", "LIST", "BY_VALUE", "BY_REFERENCE", "UNARY_MINUS"
    };
    public static final int EOF=-1;
    public static final int SHARED=4;
    public static final int COBEGIN=5;
    public static final int COEND=6;
    public static final int COFOR=7;
    public static final int SEMAPHORE=8;
    public static final int REGION=9;
    public static final int AWAIT=10;
    public static final int PROGRAM=11;
    public static final int CONST=12;
    public static final int TYPE=13;
    public static final int VAR=14;
    public static final int BOOLEAN=15;
    public static final int INTEGER=16;
    public static final int REAL=17;
    public static final int ARRAY=18;
    public static final int OF=19;
    public static final int RECORD=20;
    public static final int TRUE=21;
    public static final int FALSE=22;
    public static final int PROCEDURE=23;
    public static final int FUNCTION=24;
    public static final int BEGIN=25;
    public static final int END=26;
    public static final int IF=27;
    public static final int THEN=28;
    public static final int ELSE=29;
    public static final int WHILE=30;
    public static final int DO=31;
    public static final int REPEAT=32;
    public static final int UNTIL=33;
    public static final int FOR=34;
    public static final int TO=35;
    public static final int DOWNTO=36;
    public static final int BREAK=37;
    public static final int AND=38;
    public static final int OR=39;
    public static final int XOR=40;
    public static final int NOT=41;
    public static final int DIV=42;
    public static final int MOD=43;
    public static final int PLUS=44;
    public static final int MINUS=45;
    public static final int STAR=46;
    public static final int SLASH=47;
    public static final int ASSIGN=48;
    public static final int COMMA=49;
    public static final int SEMI=50;
    public static final int COLON=51;
    public static final int DOTDOT=52;
    public static final int DOT=53;
    public static final int EQUAL=54;
    public static final int NOT_EQUAL=55;
    public static final int LT=56;
    public static final int LE=57;
    public static final int GE=58;
    public static final int GT=59;
    public static final int LPAREN=60;
    public static final int RPAREN=61;
    public static final int LBRACK=62;
    public static final int RBRACK=63;
    public static final int LCURLY=64;
    public static final int RCURLY=65;
    public static final int WS=66;
    public static final int COMMENT_0=67;
    public static final int COMMENT_1=68;
    public static final int COMMENT_2=69;
    public static final int IDENT=70;
    public static final int STRING_LITERAL=71;
    public static final int HEX_DIGIT=72;
    public static final int HEX_INT=73;
    public static final int DIGIT=74;
    public static final int NUM_INT=75;
    public static final int EXPONENT=76;
    public static final int NUM_REAL=77;
    public static final int IDLIST=78;
    public static final int PARAMETERS=79;
    public static final int LOCALVARS=80;
    public static final int INSTANCE=81;
    public static final int CALL=82;
    public static final int LIST=83;
    public static final int BY_VALUE=84;
    public static final int BY_REFERENCE=85;
    public static final int UNARY_MINUS=86;

    // delegates
    // delegators


        public CWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public CWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g"; }


    private	IStrategy njak;
    public void setStrategy(IStrategy njak){
    	this.njak = njak;
    }



    // $ANTLR start "program"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:22:1: program : ^( PROGRAM ( global_block )* mainBody ) ;
    public final void program() throws RecognitionException {
        CommonTree PROGRAM1=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:23:2: ( ^( PROGRAM ( global_block )* mainBody ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:23:4: ^( PROGRAM ( global_block )* mainBody )
            {
            PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program50); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:23:15: ( global_block )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SHARED||(LA1_0>=CONST && LA1_0<=TYPE)||(LA1_0>=PROCEDURE && LA1_0<=FUNCTION)||LA1_0==INSTANCE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:23:15: global_block
            	    {
            	    pushFollow(FOLLOW_global_block_in_program52);
            	    global_block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_mainBody_in_program55);
            mainBody();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.program(PROGRAM1); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "global_block"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:27:1: global_block : ( variableDeclaration[true] | typeDeclaration | constantDefinition | procedureDeclaration | functionDeclaration );
    public final void global_block() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:28:5: ( variableDeclaration[true] | typeDeclaration | constantDefinition | procedureDeclaration | functionDeclaration )
            int alt2=5;
            switch ( input.LA(1) ) {
            case SHARED:
            case INSTANCE:
                {
                alt2=1;
                }
                break;
            case TYPE:
                {
                alt2=2;
                }
                break;
            case CONST:
                {
                alt2=3;
                }
                break;
            case PROCEDURE:
                {
                alt2=4;
                }
                break;
            case FUNCTION:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:28:7: variableDeclaration[true]
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_global_block72);
                    variableDeclaration(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:29:7: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_global_block81);
                    typeDeclaration();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:30:7: constantDefinition
                    {
                    pushFollow(FOLLOW_constantDefinition_in_global_block89);
                    constantDefinition();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:31:7: procedureDeclaration
                    {
                    pushFollow(FOLLOW_procedureDeclaration_in_global_block97);
                    procedureDeclaration();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:32:7: functionDeclaration
                    {
                    pushFollow(FOLLOW_functionDeclaration_in_global_block105);
                    functionDeclaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "global_block"

    public static class mainBody_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "mainBody"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:35:1: mainBody : compoundStatement ;
    public final CWalker.mainBody_return mainBody() throws RecognitionException {
        CWalker.mainBody_return retval = new CWalker.mainBody_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:35:9: ( compoundStatement )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:36:6: compoundStatement
            {
            pushFollow(FOLLOW_compoundStatement_in_mainBody131);
            compoundStatement();

            state._fsp--;

             njak.mainBody(((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mainBody"


    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:42:1: variableDeclaration[boolean global] : ( ^( INSTANCE identifierList type ) | ^( SHARED identifierList type ) );
    public final void variableDeclaration(boolean global) throws RecognitionException {
        CWalker.identifierList_return identifierList2 = null;

        CWalker.type_return type3 = null;

        CWalker.identifierList_return identifierList4 = null;

        CWalker.type_return type5 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:43:5: ( ^( INSTANCE identifierList type ) | ^( SHARED identifierList type ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INSTANCE) ) {
                alt3=1;
            }
            else if ( (LA3_0==SHARED) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:43:7: ^( INSTANCE identifierList type )
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_variableDeclaration160); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_identifierList_in_variableDeclaration162);
                    identifierList2=identifierList();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_variableDeclaration164);
                    type3=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.variableDeclaration(false, global, (identifierList2!=null?((CommonTree)identifierList2.start):null), (type3!=null?((CommonTree)type3.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:44:7: ^( SHARED identifierList type )
                    {
                    match(input,SHARED,FOLLOW_SHARED_in_variableDeclaration176); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_identifierList_in_variableDeclaration178);
                    identifierList4=identifierList();

                    state._fsp--;

                    pushFollow(FOLLOW_type_in_variableDeclaration180);
                    type5=type();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.variableDeclaration(true, global, (identifierList4!=null?((CommonTree)identifierList4.start):null), (type5!=null?((CommonTree)type5.start):null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableDeclaration"

    public static class identifierList_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "identifierList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:47:1: identifierList : ^( IDLIST ( IDENT )+ ) ;
    public final CWalker.identifierList_return identifierList() throws RecognitionException {
        CWalker.identifierList_return retval = new CWalker.identifierList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:48:5: ( ^( IDLIST ( IDENT )+ ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:48:7: ^( IDLIST ( IDENT )+ )
            {
            match(input,IDLIST,FOLLOW_IDLIST_in_identifierList209); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:48:16: ( IDENT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:48:16: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_identifierList211); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifierList"

    public static class procedureStart_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "procedureStart"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:51:1: procedureStart : PROCEDURE ;
    public final CWalker.procedureStart_return procedureStart() throws RecognitionException {
        CWalker.procedureStart_return retval = new CWalker.procedureStart_return();
        retval.start = input.LT(1);

        CommonTree PROCEDURE6=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:52:2: ( PROCEDURE )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:52:4: PROCEDURE
            {
            PROCEDURE6=(CommonTree)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureStart227); 
             njak.functionStart(PROCEDURE6); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureStart"


    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:55:1: procedureDeclaration : ^(h= procedureStart f= formalParameterList l= localParamaterList body ) ;
    public final void procedureDeclaration() throws RecognitionException {
        CWalker.procedureStart_return h = null;

        CWalker.formalParameterList_return f = null;

        CWalker.localParamaterList_return l = null;

        CWalker.body_return body7 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:56:5: ( ^(h= procedureStart f= formalParameterList l= localParamaterList body ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:56:7: ^(h= procedureStart f= formalParameterList l= localParamaterList body )
            {
            pushFollow(FOLLOW_procedureStart_in_procedureDeclaration251);
            h=procedureStart();

            state._fsp--;


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_formalParameterList_in_procedureDeclaration255);
            f=formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_localParamaterList_in_procedureDeclaration259);
            l=localParamaterList();

            state._fsp--;

            pushFollow(FOLLOW_body_in_procedureDeclaration261);
            body7=body();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.functionDeclaration((h!=null?((CommonTree)h.start):null), (f!=null?((CommonTree)f.start):null), (l!=null?((CommonTree)l.start):null), (body7!=null?((CommonTree)body7.start):null), null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedureDeclaration"

    public static class functionStart_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "functionStart"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:59:1: functionStart : FUNCTION ;
    public final CWalker.functionStart_return functionStart() throws RecognitionException {
        CWalker.functionStart_return retval = new CWalker.functionStart_return();
        retval.start = input.LT(1);

        CommonTree FUNCTION8=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:59:14: ( FUNCTION )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:60:2: FUNCTION
            {
            FUNCTION8=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionStart277); 
             njak.functionStart(FUNCTION8); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionStart"


    // $ANTLR start "functionDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:63:1: functionDeclaration : ^(h= functionStart f= formalParameterList l= localParamaterList body ret= typeIdentifier ) ;
    public final void functionDeclaration() throws RecognitionException {
        CWalker.functionStart_return h = null;

        CWalker.formalParameterList_return f = null;

        CWalker.localParamaterList_return l = null;

        CWalker.typeIdentifier_return ret = null;

        CWalker.body_return body9 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:64:5: ( ^(h= functionStart f= formalParameterList l= localParamaterList body ret= typeIdentifier ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:64:7: ^(h= functionStart f= formalParameterList l= localParamaterList body ret= typeIdentifier )
            {
            pushFollow(FOLLOW_functionStart_in_functionDeclaration296);
            h=functionStart();

            state._fsp--;


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration300);
            f=formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_localParamaterList_in_functionDeclaration304);
            l=localParamaterList();

            state._fsp--;

            pushFollow(FOLLOW_body_in_functionDeclaration306);
            body9=body();

            state._fsp--;

            pushFollow(FOLLOW_typeIdentifier_in_functionDeclaration310);
            ret=typeIdentifier();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.functionDeclaration((h!=null?((CommonTree)h.start):null), (f!=null?((CommonTree)f.start):null), (l!=null?((CommonTree)l.start):null), (body9!=null?((CommonTree)body9.start):null), (ret!=null?((CommonTree)ret.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionDeclaration"

    public static class formalParameterList_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "formalParameterList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:67:1: formalParameterList : ^( LIST ( formalParameterSection )* ) ;
    public final CWalker.formalParameterList_return formalParameterList() throws RecognitionException {
        CWalker.formalParameterList_return retval = new CWalker.formalParameterList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:68:5: ( ^( LIST ( formalParameterSection )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:68:7: ^( LIST ( formalParameterSection )* )
            {
            match(input,LIST,FOLLOW_LIST_in_formalParameterList339); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:68:14: ( formalParameterSection )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=BY_VALUE && LA5_0<=BY_REFERENCE)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:68:14: formalParameterSection
                	    {
                	    pushFollow(FOLLOW_formalParameterSection_in_formalParameterList341);
                	    formalParameterSection();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"


    // $ANTLR start "formalParameterSection"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:71:1: formalParameterSection : ( ^( BY_VALUE parameterDeclaration[false] ) | ^( BY_REFERENCE parameterDeclaration[true] ) );
    public final void formalParameterSection() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:72:5: ( ^( BY_VALUE parameterDeclaration[false] ) | ^( BY_REFERENCE parameterDeclaration[true] ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BY_VALUE) ) {
                alt6=1;
            }
            else if ( (LA6_0==BY_REFERENCE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:72:7: ^( BY_VALUE parameterDeclaration[false] )
                    {
                    match(input,BY_VALUE,FOLLOW_BY_VALUE_in_formalParameterSection369); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_parameterDeclaration_in_formalParameterSection371);
                    parameterDeclaration(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:73:7: ^( BY_REFERENCE parameterDeclaration[true] )
                    {
                    match(input,BY_REFERENCE,FOLLOW_BY_REFERENCE_in_formalParameterSection382); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_parameterDeclaration_in_formalParameterSection384);
                    parameterDeclaration(true);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalParameterSection"


    // $ANTLR start "parameterDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:77:1: parameterDeclaration[boolean byref] : identifierList typeIdentifier ;
    public final void parameterDeclaration(boolean byref) throws RecognitionException {
        CWalker.identifierList_return identifierList10 = null;

        CWalker.typeIdentifier_return typeIdentifier11 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:78:5: ( identifierList typeIdentifier )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:78:7: identifierList typeIdentifier
            {
            pushFollow(FOLLOW_identifierList_in_parameterDeclaration416);
            identifierList10=identifierList();

            state._fsp--;

            pushFollow(FOLLOW_typeIdentifier_in_parameterDeclaration418);
            typeIdentifier11=typeIdentifier();

            state._fsp--;

             njak.parameterDeclaration(byref, (identifierList10!=null?((CommonTree)identifierList10.start):null), (typeIdentifier11!=null?((CommonTree)typeIdentifier11.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameterDeclaration"

    public static class localParamaterList_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "localParamaterList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:81:1: localParamaterList : ^( LIST ( variableDeclaration[false] )* ) ;
    public final CWalker.localParamaterList_return localParamaterList() throws RecognitionException {
        CWalker.localParamaterList_return retval = new CWalker.localParamaterList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:82:2: ( ^( LIST ( variableDeclaration[false] )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:83:2: ^( LIST ( variableDeclaration[false] )* )
            {
            match(input,LIST,FOLLOW_LIST_in_localParamaterList452); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:83:9: ( variableDeclaration[false] )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==SHARED||LA7_0==INSTANCE) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:83:9: variableDeclaration[false]
                	    {
                	    pushFollow(FOLLOW_variableDeclaration_in_localParamaterList454);
                	    variableDeclaration(false);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localParamaterList"


    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:86:1: typeDeclaration : ^( TYPE type ) ;
    public final void typeDeclaration() throws RecognitionException {
        CommonTree TYPE12=null;
        CWalker.type_return type13 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:87:5: ( ^( TYPE type ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:87:7: ^( TYPE type )
            {
            TYPE12=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration472); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_typeDeclaration474);
            type13=type();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.typeDeclaration(TYPE12, (type13!=null?((CommonTree)type13.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeDeclaration"


    // $ANTLR start "constantDefinition"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:93:1: constantDefinition : ^( CONST expression ) ;
    public final void constantDefinition() throws RecognitionException {
        CommonTree CONST14=null;
        CWalker.expression_return expression15 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:94:5: ( ^( CONST expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:94:7: ^( CONST expression )
            {
            CONST14=(CommonTree)match(input,CONST,FOLLOW_CONST_in_constantDefinition498); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_constantDefinition500);
            expression15=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.constantDefinition(CONST14, (expression15!=null?((CommonTree)expression15.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantDefinition"

    public static class type_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "type"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:100:1: type : ( typeIdentifier | arrayType | recordType );
    public final CWalker.type_return type() throws RecognitionException {
        CWalker.type_return retval = new CWalker.type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:101:5: ( typeIdentifier | arrayType | recordType )
            int alt8=3;
            switch ( input.LA(1) ) {
            case SEMAPHORE:
            case BOOLEAN:
            case INTEGER:
            case REAL:
            case DOTDOT:
            case IDENT:
                {
                alt8=1;
                }
                break;
            case ARRAY:
                {
                alt8=2;
                }
                break;
            case RECORD:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:101:7: typeIdentifier
                    {
                    pushFollow(FOLLOW_typeIdentifier_in_type523);
                    typeIdentifier();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:102:7: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type531);
                    arrayType();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:103:7: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type539);
                    recordType();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeIdentifier_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "typeIdentifier"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:107:1: typeIdentifier : ( BOOLEAN | INTEGER | REAL | SEMAPHORE | IDENT | subrangeType );
    public final CWalker.typeIdentifier_return typeIdentifier() throws RecognitionException {
        CWalker.typeIdentifier_return retval = new CWalker.typeIdentifier_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:109:6: ( BOOLEAN | INTEGER | REAL | SEMAPHORE | IDENT | subrangeType )
            int alt9=6;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt9=1;
                }
                break;
            case INTEGER:
                {
                alt9=2;
                }
                break;
            case REAL:
                {
                alt9=3;
                }
                break;
            case SEMAPHORE:
                {
                alt9=4;
                }
                break;
            case IDENT:
                {
                alt9=5;
                }
                break;
            case DOTDOT:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:109:8: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_typeIdentifier564); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:110:8: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_typeIdentifier573); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:111:8: REAL
                    {
                    match(input,REAL,FOLLOW_REAL_in_typeIdentifier582); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:112:8: SEMAPHORE
                    {
                    match(input,SEMAPHORE,FOLLOW_SEMAPHORE_in_typeIdentifier591); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:113:8: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_typeIdentifier600); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:114:14: subrangeType
                    {
                    pushFollow(FOLLOW_subrangeType_in_typeIdentifier615);
                    subrangeType();

                    state._fsp--;


                    }
                    break;

            }
             njak.typeIdentifier(((CommonTree)retval.start)); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"


    // $ANTLR start "subrangeType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:117:1: subrangeType : ^( DOTDOT low= expression high= expression ) ;
    public final void subrangeType() throws RecognitionException {
        CommonTree DOTDOT16=null;
        CWalker.expression_return low = null;

        CWalker.expression_return high = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:118:5: ( ^( DOTDOT low= expression high= expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:118:7: ^( DOTDOT low= expression high= expression )
            {
            DOTDOT16=(CommonTree)match(input,DOTDOT,FOLLOW_DOTDOT_in_subrangeType641); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_subrangeType645);
            low=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_subrangeType649);
            high=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.subrangeType(DOTDOT16, (low!=null?((CommonTree)low.start):null), (high!=null?((CommonTree)high.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subrangeType"


    // $ANTLR start "arrayType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:121:1: arrayType : ^( ARRAY typeIdentifier type ) ;
    public final void arrayType() throws RecognitionException {
        CommonTree ARRAY17=null;
        CWalker.typeIdentifier_return typeIdentifier18 = null;

        CWalker.type_return type19 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:122:6: ( ^( ARRAY typeIdentifier type ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:122:9: ^( ARRAY typeIdentifier type )
            {
            ARRAY17=(CommonTree)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType681); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_typeIdentifier_in_arrayType683);
            typeIdentifier18=typeIdentifier();

            state._fsp--;

            pushFollow(FOLLOW_type_in_arrayType685);
            type19=type();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.arrayType(ARRAY17, (typeIdentifier18!=null?((CommonTree)typeIdentifier18.start):null), (type19!=null?((CommonTree)type19.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayType"


    // $ANTLR start "recordStart"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:125:1: recordStart : RECORD ;
    public final void recordStart() throws RecognitionException {
        CommonTree RECORD20=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:126:2: ( RECORD )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:126:4: RECORD
            {
            RECORD20=(CommonTree)match(input,RECORD,FOLLOW_RECORD_in_recordStart698); 
             njak.recordStart(RECORD20); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "recordStart"

    public static class recordType_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:129:1: recordType : ^( recordStart ( fieldDeclaration )+ ) ;
    public final CWalker.recordType_return recordType() throws RecognitionException {
        CWalker.recordType_return retval = new CWalker.recordType_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:130:5: ( ^( recordStart ( fieldDeclaration )+ ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:130:7: ^( recordStart ( fieldDeclaration )+ )
            {
            pushFollow(FOLLOW_recordStart_in_recordType716);
            recordStart();

            state._fsp--;


            match(input, Token.DOWN, null); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:130:21: ( fieldDeclaration )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COLON) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:130:21: fieldDeclaration
            	    {
            	    pushFollow(FOLLOW_fieldDeclaration_in_recordType718);
            	    fieldDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            match(input, Token.UP, null); 
             njak.recordType(((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "fieldDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:134:1: fieldDeclaration : ^( COLON identifierList type ) ;
    public final void fieldDeclaration() throws RecognitionException {
        CommonTree COLON21=null;
        CWalker.identifierList_return identifierList22 = null;

        CWalker.type_return type23 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:135:5: ( ^( COLON identifierList type ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:135:7: ^( COLON identifierList type )
            {
            COLON21=(CommonTree)match(input,COLON,FOLLOW_COLON_in_fieldDeclaration741); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_identifierList_in_fieldDeclaration743);
            identifierList22=identifierList();

            state._fsp--;

            pushFollow(FOLLOW_type_in_fieldDeclaration745);
            type23=type();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.fieldDeclaration(COLON21, (identifierList22!=null?((CommonTree)identifierList22.start):null), (type23!=null?((CommonTree)type23.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldDeclaration"

    public static class body_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "body"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:141:1: body : compoundStatement ;
    public final CWalker.body_return body() throws RecognitionException {
        CWalker.body_return retval = new CWalker.body_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:141:5: ( compoundStatement )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:142:2: compoundStatement
            {
            pushFollow(FOLLOW_compoundStatement_in_body769);
            compoundStatement();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class statement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "statement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:145:1: statement : ( compoundStatement | cobeginStatement | assignmentStatement | callStatement | ifStatement | whileStatement | repeatStatement | forStatement | breakStatement | coforStatement | regionStatement | awaitStatement );
    public final CWalker.statement_return statement() throws RecognitionException {
        CWalker.statement_return retval = new CWalker.statement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:146:5: ( compoundStatement | cobeginStatement | assignmentStatement | callStatement | ifStatement | whileStatement | repeatStatement | forStatement | breakStatement | coforStatement | regionStatement | awaitStatement )
            int alt11=12;
            switch ( input.LA(1) ) {
            case BEGIN:
                {
                alt11=1;
                }
                break;
            case COBEGIN:
                {
                alt11=2;
                }
                break;
            case ASSIGN:
                {
                alt11=3;
                }
                break;
            case CALL:
                {
                alt11=4;
                }
                break;
            case IF:
                {
                alt11=5;
                }
                break;
            case WHILE:
                {
                alt11=6;
                }
                break;
            case REPEAT:
                {
                alt11=7;
                }
                break;
            case FOR:
                {
                alt11=8;
                }
                break;
            case BREAK:
                {
                alt11=9;
                }
                break;
            case COFOR:
                {
                alt11=10;
                }
                break;
            case REGION:
                {
                alt11=11;
                }
                break;
            case AWAIT:
                {
                alt11=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:146:7: compoundStatement
                    {
                    pushFollow(FOLLOW_compoundStatement_in_statement788);
                    compoundStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:147:7: cobeginStatement
                    {
                    pushFollow(FOLLOW_cobeginStatement_in_statement796);
                    cobeginStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:148:7: assignmentStatement
                    {
                    pushFollow(FOLLOW_assignmentStatement_in_statement804);
                    assignmentStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:149:7: callStatement
                    {
                    pushFollow(FOLLOW_callStatement_in_statement812);
                    callStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:150:7: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement820);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:151:7: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement828);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:152:7: repeatStatement
                    {
                    pushFollow(FOLLOW_repeatStatement_in_statement836);
                    repeatStatement();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:153:7: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statement844);
                    forStatement();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:154:7: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_statement859);
                    breakStatement();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:155:7: coforStatement
                    {
                    pushFollow(FOLLOW_coforStatement_in_statement867);
                    coforStatement();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:156:7: regionStatement
                    {
                    pushFollow(FOLLOW_regionStatement_in_statement877);
                    regionStatement();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:157:7: awaitStatement
                    {
                    pushFollow(FOLLOW_awaitStatement_in_statement885);
                    awaitStatement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class compoundStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "compoundStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:160:1: compoundStatement : ^( BEGIN ( statement )* ) ;
    public final CWalker.compoundStatement_return compoundStatement() throws RecognitionException {
        CWalker.compoundStatement_return retval = new CWalker.compoundStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:161:5: ( ^( BEGIN ( statement )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:161:7: ^( BEGIN ( statement )* )
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_compoundStatement903); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:161:15: ( statement )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COBEGIN||LA12_0==COFOR||(LA12_0>=REGION && LA12_0<=AWAIT)||LA12_0==BEGIN||LA12_0==IF||LA12_0==WHILE||LA12_0==REPEAT||LA12_0==FOR||LA12_0==BREAK||LA12_0==ASSIGN||LA12_0==CALL) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:161:15: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_compoundStatement905);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             njak.compoundStatement(((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundStatement"

    public static class cobeginStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "cobeginStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:165:1: cobeginStatement : ^( COBEGIN ( statement )* ) ;
    public final CWalker.cobeginStatement_return cobeginStatement() throws RecognitionException {
        CWalker.cobeginStatement_return retval = new CWalker.cobeginStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:166:5: ( ^( COBEGIN ( statement )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:166:7: ^( COBEGIN ( statement )* )
            {
            match(input,COBEGIN,FOLLOW_COBEGIN_in_cobeginStatement932); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:166:17: ( statement )*
                loop13:
                do {
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==COBEGIN||LA13_0==COFOR||(LA13_0>=REGION && LA13_0<=AWAIT)||LA13_0==BEGIN||LA13_0==IF||LA13_0==WHILE||LA13_0==REPEAT||LA13_0==FOR||LA13_0==BREAK||LA13_0==ASSIGN||LA13_0==CALL) ) {
                        alt13=1;
                    }


                    switch (alt13) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:166:17: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_cobeginStatement934);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop13;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             njak.cobeginStatement(((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cobeginStatement"


    // $ANTLR start "assignmentStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:169:1: assignmentStatement : ^( ASSIGN variable[true] expression ) ;
    public final void assignmentStatement() throws RecognitionException {
        CommonTree ASSIGN24=null;
        CWalker.variable_return variable25 = null;

        CWalker.expression_return expression26 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:170:5: ( ^( ASSIGN variable[true] expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:170:7: ^( ASSIGN variable[true] expression )
            {
            ASSIGN24=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentStatement964); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_in_assignmentStatement966);
            variable25=variable(true);

            state._fsp--;

            pushFollow(FOLLOW_expression_in_assignmentStatement969);
            expression26=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.assignmentStatement(ASSIGN24, (variable25!=null?((CommonTree)variable25.start):null), (expression26!=null?((CommonTree)expression26.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignmentStatement"

    public static class callStatement_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "callStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:173:1: callStatement : ^( CALL ( expression )* ) ;
    public final CWalker.callStatement_return callStatement() throws RecognitionException {
        CWalker.callStatement_return retval = new CWalker.callStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:175:5: ( ^( CALL ( expression )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:175:7: ^( CALL ( expression )* )
            {
            match(input,CALL,FOLLOW_CALL_in_callStatement1004); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:175:14: ( expression )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=TRUE && LA14_0<=FALSE)||(LA14_0>=AND && LA14_0<=SLASH)||(LA14_0>=EQUAL && LA14_0<=GT)||(LA14_0>=IDENT && LA14_0<=STRING_LITERAL)||LA14_0==HEX_INT||LA14_0==NUM_INT||LA14_0==NUM_REAL||LA14_0==CALL||LA14_0==UNARY_MINUS) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:175:14: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_callStatement1006);
                	    expression();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

              njak.functionCall(((CommonTree)retval.start)); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callStatement"


    // $ANTLR start "ifStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:178:1: ifStatement : ^( IF c= expression t= statement (e= statement )? ) ;
    public final void ifStatement() throws RecognitionException {
        CommonTree IF27=null;
        CWalker.expression_return c = null;

        CWalker.statement_return t = null;

        CWalker.statement_return e = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:179:5: ( ^( IF c= expression t= statement (e= statement )? ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:179:7: ^( IF c= expression t= statement (e= statement )? )
            {
            IF27=(CommonTree)match(input,IF,FOLLOW_IF_in_ifStatement1037); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ifStatement1041);
            c=expression();

            state._fsp--;

            pushFollow(FOLLOW_statement_in_ifStatement1045);
            t=statement();

            state._fsp--;

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:179:37: (e= statement )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COBEGIN||LA15_0==COFOR||(LA15_0>=REGION && LA15_0<=AWAIT)||LA15_0==BEGIN||LA15_0==IF||LA15_0==WHILE||LA15_0==REPEAT||LA15_0==FOR||LA15_0==BREAK||LA15_0==ASSIGN||LA15_0==CALL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:179:38: e= statement
                    {
                    pushFollow(FOLLOW_statement_in_ifStatement1050);
                    e=statement();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             njak.ifStatement(IF27, (c!=null?((CommonTree)c.start):null), (t!=null?((CommonTree)t.start):null), (e!=null?((CommonTree)e.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:182:1: whileStatement : ^( WHILE c= expression (d= statement )? ) ;
    public final void whileStatement() throws RecognitionException {
        CommonTree WHILE28=null;
        CWalker.expression_return c = null;

        CWalker.statement_return d = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:183:5: ( ^( WHILE c= expression (d= statement )? ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:183:7: ^( WHILE c= expression (d= statement )? )
            {
            WHILE28=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1077); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileStatement1081);
            c=expression();

            state._fsp--;

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:183:28: (d= statement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COBEGIN||LA16_0==COFOR||(LA16_0>=REGION && LA16_0<=AWAIT)||LA16_0==BEGIN||LA16_0==IF||LA16_0==WHILE||LA16_0==REPEAT||LA16_0==FOR||LA16_0==BREAK||LA16_0==ASSIGN||LA16_0==CALL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:183:29: d= statement
                    {
                    pushFollow(FOLLOW_statement_in_whileStatement1086);
                    d=statement();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             njak.whileStatement(WHILE28, (c!=null?((CommonTree)c.start):null), (d!=null?((CommonTree)d.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "repeatStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:186:1: repeatStatement : ^( REPEAT ^( LIST ( statement )* ) expression ) ;
    public final void repeatStatement() throws RecognitionException {
        CommonTree REPEAT29=null;
        CommonTree LIST30=null;
        CWalker.expression_return expression31 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:187:5: ( ^( REPEAT ^( LIST ( statement )* ) expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:187:8: ^( REPEAT ^( LIST ( statement )* ) expression )
            {
            REPEAT29=(CommonTree)match(input,REPEAT,FOLLOW_REPEAT_in_repeatStatement1118); 

            match(input, Token.DOWN, null); 
            LIST30=(CommonTree)match(input,LIST,FOLLOW_LIST_in_repeatStatement1121); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:187:24: ( statement )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==COBEGIN||LA17_0==COFOR||(LA17_0>=REGION && LA17_0<=AWAIT)||LA17_0==BEGIN||LA17_0==IF||LA17_0==WHILE||LA17_0==REPEAT||LA17_0==FOR||LA17_0==BREAK||LA17_0==ASSIGN||LA17_0==CALL) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:187:24: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_repeatStatement1123);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop17;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            pushFollow(FOLLOW_expression_in_repeatStatement1127);
            expression31=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.repeatStatement(REPEAT29, LIST30, (expression31!=null?((CommonTree)expression31.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repeatStatement"


    // $ANTLR start "forStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:190:1: forStatement : ( ^( FOR TO a= expression b= expression (c= statement )? ) | ^( FOR DOWNTO a= expression b= expression (c= statement )? ) );
    public final void forStatement() throws RecognitionException {
        CommonTree FOR32=null;
        CommonTree FOR33=null;
        CWalker.expression_return a = null;

        CWalker.expression_return b = null;

        CWalker.statement_return c = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:191:2: ( ^( FOR TO a= expression b= expression (c= statement )? ) | ^( FOR DOWNTO a= expression b= expression (c= statement )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FOR) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==TO) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==DOWNTO) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:191:4: ^( FOR TO a= expression b= expression (c= statement )? )
                    {
                    FOR32=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forStatement1145); 

                    match(input, Token.DOWN, null); 
                    match(input,TO,FOLLOW_TO_in_forStatement1147); 
                    pushFollow(FOLLOW_expression_in_forStatement1151);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_forStatement1155);
                    b=expression();

                    state._fsp--;

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:191:39: (c= statement )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==COBEGIN||LA18_0==COFOR||(LA18_0>=REGION && LA18_0<=AWAIT)||LA18_0==BEGIN||LA18_0==IF||LA18_0==WHILE||LA18_0==REPEAT||LA18_0==FOR||LA18_0==BREAK||LA18_0==ASSIGN||LA18_0==CALL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:191:40: c= statement
                            {
                            pushFollow(FOLLOW_statement_in_forStatement1160);
                            c=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     njak.forStatement(FOR32, false, (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null), (c!=null?((CommonTree)c.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:192:4: ^( FOR DOWNTO a= expression b= expression (c= statement )? )
                    {
                    FOR33=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forStatement1171); 

                    match(input, Token.DOWN, null); 
                    match(input,DOWNTO,FOLLOW_DOWNTO_in_forStatement1173); 
                    pushFollow(FOLLOW_expression_in_forStatement1177);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_forStatement1181);
                    b=expression();

                    state._fsp--;

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:192:43: (c= statement )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==COBEGIN||LA19_0==COFOR||(LA19_0>=REGION && LA19_0<=AWAIT)||LA19_0==BEGIN||LA19_0==IF||LA19_0==WHILE||LA19_0==REPEAT||LA19_0==FOR||LA19_0==BREAK||LA19_0==ASSIGN||LA19_0==CALL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:192:44: c= statement
                            {
                            pushFollow(FOLLOW_statement_in_forStatement1186);
                            c=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     njak.forStatement(FOR33, true, (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null), (c!=null?((CommonTree)c.start):null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forStatement"


    // $ANTLR start "coforStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:195:1: coforStatement : ( ^( COFOR TO a= expression b= expression (c= statement )? ) | ^( COFOR DOWNTO a= expression b= expression (c= statement )? ) );
    public final void coforStatement() throws RecognitionException {
        CommonTree COFOR34=null;
        CommonTree COFOR35=null;
        CWalker.expression_return a = null;

        CWalker.expression_return b = null;

        CWalker.statement_return c = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:196:2: ( ^( COFOR TO a= expression b= expression (c= statement )? ) | ^( COFOR DOWNTO a= expression b= expression (c= statement )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==COFOR) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==TO) ) {
                        alt23=1;
                    }
                    else if ( (LA23_2==DOWNTO) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:196:4: ^( COFOR TO a= expression b= expression (c= statement )? )
                    {
                    COFOR34=(CommonTree)match(input,COFOR,FOLLOW_COFOR_in_coforStatement1210); 

                    match(input, Token.DOWN, null); 
                    match(input,TO,FOLLOW_TO_in_coforStatement1212); 
                    pushFollow(FOLLOW_expression_in_coforStatement1216);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_coforStatement1220);
                    b=expression();

                    state._fsp--;

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:196:41: (c= statement )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COBEGIN||LA21_0==COFOR||(LA21_0>=REGION && LA21_0<=AWAIT)||LA21_0==BEGIN||LA21_0==IF||LA21_0==WHILE||LA21_0==REPEAT||LA21_0==FOR||LA21_0==BREAK||LA21_0==ASSIGN||LA21_0==CALL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:196:42: c= statement
                            {
                            pushFollow(FOLLOW_statement_in_coforStatement1225);
                            c=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     njak.coforStatement(COFOR34, false, (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null), (c!=null?((CommonTree)c.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:197:4: ^( COFOR DOWNTO a= expression b= expression (c= statement )? )
                    {
                    COFOR35=(CommonTree)match(input,COFOR,FOLLOW_COFOR_in_coforStatement1236); 

                    match(input, Token.DOWN, null); 
                    match(input,DOWNTO,FOLLOW_DOWNTO_in_coforStatement1238); 
                    pushFollow(FOLLOW_expression_in_coforStatement1242);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_coforStatement1246);
                    b=expression();

                    state._fsp--;

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:197:45: (c= statement )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==COBEGIN||LA22_0==COFOR||(LA22_0>=REGION && LA22_0<=AWAIT)||LA22_0==BEGIN||LA22_0==IF||LA22_0==WHILE||LA22_0==REPEAT||LA22_0==FOR||LA22_0==BREAK||LA22_0==ASSIGN||LA22_0==CALL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:197:46: c= statement
                            {
                            pushFollow(FOLLOW_statement_in_coforStatement1251);
                            c=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     njak.coforStatement(COFOR35, true, (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null), (c!=null?((CommonTree)c.start):null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "coforStatement"


    // $ANTLR start "breakStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:201:1: breakStatement : BREAK ;
    public final void breakStatement() throws RecognitionException {
        CommonTree BREAK36=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:202:2: ( BREAK )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:203:2: BREAK
            {
            BREAK36=(CommonTree)match(input,BREAK,FOLLOW_BREAK_in_breakStatement1271); 
             njak.breakStatement(BREAK36); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "breakStatement"


    // $ANTLR start "regionStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:206:1: regionStatement : ^( REGION simpleVariable statement ) ;
    public final void regionStatement() throws RecognitionException {
        CommonTree REGION37=null;
        CWalker.simpleVariable_return simpleVariable38 = null;

        CWalker.statement_return statement39 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:207:2: ( ^( REGION simpleVariable statement ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:207:4: ^( REGION simpleVariable statement )
            {
            REGION37=(CommonTree)match(input,REGION,FOLLOW_REGION_in_regionStatement1289); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simpleVariable_in_regionStatement1291);
            simpleVariable38=simpleVariable();

            state._fsp--;

            pushFollow(FOLLOW_statement_in_regionStatement1293);
            statement39=statement();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.regionStatement(REGION37, (simpleVariable38!=null?((CommonTree)simpleVariable38.start):null), (statement39!=null?((CommonTree)statement39.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "regionStatement"


    // $ANTLR start "awaitStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:210:1: awaitStatement : ^( AWAIT expression ) ;
    public final void awaitStatement() throws RecognitionException {
        CommonTree AWAIT40=null;
        CWalker.expression_return expression41 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:211:2: ( ^( AWAIT expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:211:4: ^( AWAIT expression )
            {
            AWAIT40=(CommonTree)match(input,AWAIT,FOLLOW_AWAIT_in_awaitStatement1321); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_awaitStatement1323);
            expression41=expression();

            state._fsp--;


            match(input, Token.UP, null); 
             njak.awaitStatement(AWAIT40, (expression41!=null?((CommonTree)expression41.start):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "awaitStatement"

    public static class logicOperator_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "logicOperator"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:217:1: logicOperator : ( AND | OR | XOR );
    public final CWalker.logicOperator_return logicOperator() throws RecognitionException {
        CWalker.logicOperator_return retval = new CWalker.logicOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:218:2: ( AND | OR | XOR )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:
            {
            if ( (input.LA(1)>=AND && input.LA(1)<=XOR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicOperator"

    public static class equalityOperator_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "equalityOperator"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:221:1: equalityOperator : ( EQUAL | NOT_EQUAL );
    public final CWalker.equalityOperator_return equalityOperator() throws RecognitionException {
        CWalker.equalityOperator_return retval = new CWalker.equalityOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:222:2: ( EQUAL | NOT_EQUAL )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:
            {
            if ( (input.LA(1)>=EQUAL && input.LA(1)<=NOT_EQUAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityOperator"

    public static class comparisonOperator_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "comparisonOperator"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:225:1: comparisonOperator : ( LT | LE | GE | GT );
    public final CWalker.comparisonOperator_return comparisonOperator() throws RecognitionException {
        CWalker.comparisonOperator_return retval = new CWalker.comparisonOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:226:2: ( LT | LE | GE | GT )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:
            {
            if ( (input.LA(1)>=LT && input.LA(1)<=GT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparisonOperator"

    public static class arithmeticOperator_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "arithmeticOperator"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:229:1: arithmeticOperator : ( PLUS | MINUS | STAR | DIV | MOD | SLASH );
    public final CWalker.arithmeticOperator_return arithmeticOperator() throws RecognitionException {
        CWalker.arithmeticOperator_return retval = new CWalker.arithmeticOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:230:2: ( PLUS | MINUS | STAR | DIV | MOD | SLASH )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:
            {
            if ( (input.LA(1)>=DIV && input.LA(1)<=SLASH) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arithmeticOperator"

    public static class expression_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "expression"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:233:1: expression : ( ^(op10= logicOperator a= expression b= expression ) | ^(op11= equalityOperator a= expression b= expression ) | ^(op12= comparisonOperator a= expression b= expression ) | ^(op2= arithmeticOperator a= expression b= expression ) | ^( UNARY_MINUS a= expression ) | ^( NOT a= expression ) | variable[false] | functionCall | literal );
    public final CWalker.expression_return expression() throws RecognitionException {
        CWalker.expression_return retval = new CWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree UNARY_MINUS42=null;
        CommonTree NOT43=null;
        CWalker.logicOperator_return op10 = null;

        CWalker.expression_return a = null;

        CWalker.expression_return b = null;

        CWalker.equalityOperator_return op11 = null;

        CWalker.comparisonOperator_return op12 = null;

        CWalker.arithmeticOperator_return op2 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:234:5: ( ^(op10= logicOperator a= expression b= expression ) | ^(op11= equalityOperator a= expression b= expression ) | ^(op12= comparisonOperator a= expression b= expression ) | ^(op2= arithmeticOperator a= expression b= expression ) | ^( UNARY_MINUS a= expression ) | ^( NOT a= expression ) | variable[false] | functionCall | literal )
            int alt24=9;
            switch ( input.LA(1) ) {
            case AND:
            case OR:
            case XOR:
                {
                alt24=1;
                }
                break;
            case EQUAL:
            case NOT_EQUAL:
                {
                alt24=2;
                }
                break;
            case LT:
            case LE:
            case GE:
            case GT:
                {
                alt24=3;
                }
                break;
            case DIV:
            case MOD:
            case PLUS:
            case MINUS:
            case STAR:
            case SLASH:
                {
                alt24=4;
                }
                break;
            case UNARY_MINUS:
                {
                alt24=5;
                }
                break;
            case NOT:
                {
                alt24=6;
                }
                break;
            case IDENT:
                {
                alt24=7;
                }
                break;
            case CALL:
                {
                alt24=8;
                }
                break;
            case TRUE:
            case FALSE:
            case STRING_LITERAL:
            case HEX_INT:
            case NUM_INT:
            case NUM_REAL:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:234:7: ^(op10= logicOperator a= expression b= expression )
                    {
                    pushFollow(FOLLOW_logicOperator_in_expression1449);
                    op10=logicOperator();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1453);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1457);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.logicOperator((op10!=null?((CommonTree)op10.start):null), (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:235:7: ^(op11= equalityOperator a= expression b= expression )
                    {
                    pushFollow(FOLLOW_equalityOperator_in_expression1471);
                    op11=equalityOperator();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1475);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1479);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.equalityOperator((op11!=null?((CommonTree)op11.start):null), (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null)); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:236:7: ^(op12= comparisonOperator a= expression b= expression )
                    {
                    pushFollow(FOLLOW_comparisonOperator_in_expression1493);
                    op12=comparisonOperator();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1497);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1501);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.comparisonOperator((op12!=null?((CommonTree)op12.start):null), (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null)); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:237:7: ^(op2= arithmeticOperator a= expression b= expression )
                    {
                    pushFollow(FOLLOW_arithmeticOperator_in_expression1515);
                    op2=arithmeticOperator();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1519);
                    a=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1523);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.arithmeticOperator((op2!=null?((CommonTree)op2.start):null), (a!=null?((CommonTree)a.start):null), (b!=null?((CommonTree)b.start):null)); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:238:7: ^( UNARY_MINUS a= expression )
                    {
                    UNARY_MINUS42=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expression1535); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1539);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.unaryMinus(UNARY_MINUS42, (a!=null?((CommonTree)a.start):null)); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:239:7: ^( NOT a= expression )
                    {
                    NOT43=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expression1551); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1555);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     njak.not(NOT43, (a!=null?((CommonTree)a.start):null)); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:240:7: variable[false]
                    {
                    pushFollow(FOLLOW_variable_in_expression1566);
                    variable(false);

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:241:7: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_expression1575);
                    functionCall();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:242:7: literal
                    {
                    pushFollow(FOLLOW_literal_in_expression1583);
                    literal();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class simpleVariable_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "simpleVariable"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:245:1: simpleVariable : IDENT ;
    public final CWalker.simpleVariable_return simpleVariable() throws RecognitionException {
        CWalker.simpleVariable_return retval = new CWalker.simpleVariable_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:246:2: ( IDENT )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:246:4: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_simpleVariable1601); 
             njak.variable(false, ((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleVariable"

    public static class variable_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "variable"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:248:1: variable[boolean lhs] : ^( IDENT ( variableSuffix )* ) ;
    public final CWalker.variable_return variable(boolean lhs) throws RecognitionException {
        CWalker.variable_return retval = new CWalker.variable_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:248:22: ( ^( IDENT ( variableSuffix )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:249:2: ^( IDENT ( variableSuffix )* )
            {
            match(input,IDENT,FOLLOW_IDENT_in_variable1622); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:249:10: ( variableSuffix )*
                loop25:
                do {
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DOT||LA25_0==LBRACK) ) {
                        alt25=1;
                    }


                    switch (alt25) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:249:10: variableSuffix
                	    {
                	    pushFollow(FOLLOW_variableSuffix_in_variable1624);
                	    variableSuffix();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop25;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             njak.variable(lhs, ((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"


    // $ANTLR start "variableSuffix"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:252:1: variableSuffix : ( arrayField | recordField );
    public final void variableSuffix() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:253:2: ( arrayField | recordField )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LBRACK) ) {
                alt26=1;
            }
            else if ( (LA26_0==DOT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:253:4: arrayField
                    {
                    pushFollow(FOLLOW_arrayField_in_variableSuffix1653);
                    arrayField();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:254:4: recordField
                    {
                    pushFollow(FOLLOW_recordField_in_variableSuffix1658);
                    recordField();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableSuffix"


    // $ANTLR start "arrayField"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:257:1: arrayField : ^( LBRACK expression ) ;
    public final void arrayField() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:258:2: ( ^( LBRACK expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:258:4: ^( LBRACK expression )
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayField1674); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_arrayField1676);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayField"


    // $ANTLR start "recordField"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:261:1: recordField : ^( DOT IDENT ) ;
    public final void recordField() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:262:2: ( ^( DOT IDENT ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:262:4: ^( DOT IDENT )
            {
            match(input,DOT,FOLLOW_DOT_in_recordField1689); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_recordField1691); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "recordField"

    public static class functionCall_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:265:1: functionCall : ^( CALL ( expression )* ) ;
    public final CWalker.functionCall_return functionCall() throws RecognitionException {
        CWalker.functionCall_return retval = new CWalker.functionCall_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:266:5: ( ^( CALL ( expression )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:266:7: ^( CALL ( expression )* )
            {
            match(input,CALL,FOLLOW_CALL_in_functionCall1717); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:266:14: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=TRUE && LA27_0<=FALSE)||(LA27_0>=AND && LA27_0<=SLASH)||(LA27_0>=EQUAL && LA27_0<=GT)||(LA27_0>=IDENT && LA27_0<=STRING_LITERAL)||LA27_0==HEX_INT||LA27_0==NUM_INT||LA27_0==NUM_REAL||LA27_0==CALL||LA27_0==UNARY_MINUS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:266:14: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_functionCall1719);
                	    expression();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop27;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             njak.functionCall(((CommonTree)retval.start)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class literal_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "literal"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:269:1: literal : ( HEX_INT | NUM_INT | NUM_REAL | STRING_LITERAL | TRUE | FALSE );
    public final CWalker.literal_return literal() throws RecognitionException {
        CWalker.literal_return retval = new CWalker.literal_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:271:5: ( HEX_INT | NUM_INT | NUM_REAL | STRING_LITERAL | TRUE | FALSE )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\CWalker.g:
            {
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE)||input.LA(1)==STRING_LITERAL||input.LA(1)==HEX_INT||input.LA(1)==NUM_INT||input.LA(1)==NUM_REAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

             njak.literal(((CommonTree)retval.start)); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program50 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_global_block_in_program52 = new BitSet(new long[]{0x0000000003803010L,0x0000000000020000L});
    public static final BitSet FOLLOW_mainBody_in_program55 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableDeclaration_in_global_block72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_global_block81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDefinition_in_global_block89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_global_block97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_global_block105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_mainBody131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCE_in_variableDeclaration160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierList_in_variableDeclaration162 = new BitSet(new long[]{0x0010000000178100L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_variableDeclaration164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHARED_in_variableDeclaration176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierList_in_variableDeclaration178 = new BitSet(new long[]{0x0010000000178100L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_variableDeclaration180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDLIST_in_identifierList209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_identifierList211 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureStart227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureStart_in_procedureDeclaration251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterList_in_procedureDeclaration255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_localParamaterList_in_procedureDeclaration259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_body_in_procedureDeclaration261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_functionStart277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionStart_in_functionDeclaration296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_localParamaterList_in_functionDeclaration304 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_body_in_functionDeclaration306 = new BitSet(new long[]{0x0010000000038100L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeIdentifier_in_functionDeclaration310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_formalParameterList339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterSection_in_formalParameterList341 = new BitSet(new long[]{0x0000000000000008L,0x0000000000300000L});
    public static final BitSet FOLLOW_BY_VALUE_in_formalParameterSection369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterDeclaration_in_formalParameterSection371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BY_REFERENCE_in_formalParameterSection382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterDeclaration_in_formalParameterSection384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifierList_in_parameterDeclaration416 = new BitSet(new long[]{0x0010000000038100L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeIdentifier_in_parameterDeclaration418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_localParamaterList452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaration_in_localParamaterList454 = new BitSet(new long[]{0x0000000000000018L,0x0000000000020000L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_typeDeclaration474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONST_in_constantDefinition498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_constantDefinition500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeIdentifier_in_type523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_typeIdentifier564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_typeIdentifier573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_typeIdentifier582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMAPHORE_in_typeIdentifier591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeIdentifier600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrangeType_in_typeIdentifier615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_subrangeType641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_subrangeType645 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_subrangeType649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdentifier_in_arrayType683 = new BitSet(new long[]{0x0010000000178100L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_arrayType685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECORD_in_recordStart698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordStart_in_recordType716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldDeclaration_in_recordType718 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_COLON_in_fieldDeclaration741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifierList_in_fieldDeclaration743 = new BitSet(new long[]{0x0010000000178100L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_compoundStatement_in_body769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_statement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cobeginStatement_in_statement796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callStatement_in_statement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatStatement_in_statement836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coforStatement_in_statement867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regionStatement_in_statement877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_awaitStatement_in_statement885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundStatement903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_compoundStatement905 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_COBEGIN_in_cobeginStatement932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_cobeginStatement934 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentStatement964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_assignmentStatement966 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_callStatement1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_callStatement1006 = new BitSet(new long[]{0x0FC0FFC000600008L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_IF_in_ifStatement1037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement1041 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1045 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement1081 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_whileStatement1086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_in_repeatStatement1118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LIST_in_repeatStatement1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_repeatStatement1123 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_expression_in_repeatStatement1127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_forStatement1145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TO_in_forStatement1147 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1151 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1155 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_forStatement1160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_forStatement1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOWNTO_in_forStatement1173 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1177 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1181 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_forStatement1186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COFOR_in_coforStatement1210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TO_in_coforStatement1212 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1216 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1220 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_coforStatement1225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COFOR_in_coforStatement1236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DOWNTO_in_coforStatement1238 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1242 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1246 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_coforStatement1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_regionStatement1289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleVariable_in_regionStatement1291 = new BitSet(new long[]{0x000100254A0006A8L,0x0000000000040000L});
    public static final BitSet FOLLOW_statement_in_regionStatement1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AWAIT_in_awaitStatement1321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_awaitStatement1323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_logicOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparisonOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_arithmeticOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOperator_in_expression1449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1453 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_expression1457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equalityOperator_in_expression1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1475 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_expression1479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_comparisonOperator_in_expression1493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1497 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_expression1501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arithmeticOperator_in_expression1515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1519 = new BitSet(new long[]{0x0FC0FFC000600000L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_expression_in_expression1523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expression1535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_expression1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_expression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expression1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleVariable1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable1622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableSuffix_in_variable1624 = new BitSet(new long[]{0x4020000000000008L});
    public static final BitSet FOLLOW_arrayField_in_variableSuffix1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordField_in_variableSuffix1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayField1674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arrayField1676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_recordField1689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_recordField1691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_functionCall1717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_functionCall1719 = new BitSet(new long[]{0x0FC0FFC000600008L,0x0000000000442AC0L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}
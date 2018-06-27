// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g 2011-07-21 11:04:24

package cohadar.pascal.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BParser extends Parser {
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


        public BParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:1: program : PROGRAM IDENT SEMI ( global_block )* mainBody DOT -> ^( PROGRAM[$IDENT] ( global_block )* mainBody ) ;
    public final BParser.program_return program() throws RecognitionException {
        BParser.program_return retval = new BParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROGRAM1=null;
        Token IDENT2=null;
        Token SEMI3=null;
        Token DOT6=null;
        BParser.global_block_return global_block4 = null;

        BParser.mainBody_return mainBody5 = null;


        CommonTree PROGRAM1_tree=null;
        CommonTree IDENT2_tree=null;
        CommonTree SEMI3_tree=null;
        CommonTree DOT6_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_mainBody=new RewriteRuleSubtreeStream(adaptor,"rule mainBody");
        RewriteRuleSubtreeStream stream_global_block=new RewriteRuleSubtreeStream(adaptor,"rule global_block");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:9: ( PROGRAM IDENT SEMI ( global_block )* mainBody DOT -> ^( PROGRAM[$IDENT] ( global_block )* mainBody ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:11: PROGRAM IDENT SEMI ( global_block )* mainBody DOT
            {
            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program107);  
            stream_PROGRAM.add(PROGRAM1);

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program109);  
            stream_IDENT.add(IDENT2);

            SEMI3=(Token)match(input,SEMI,FOLLOW_SEMI_in_program111);  
            stream_SEMI.add(SEMI3);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:30: ( global_block )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=CONST && LA1_0<=VAR)||(LA1_0>=PROCEDURE && LA1_0<=FUNCTION)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:30: global_block
            	    {
            	    pushFollow(FOLLOW_global_block_in_program113);
            	    global_block4=global_block();

            	    state._fsp--;

            	    stream_global_block.add(global_block4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_mainBody_in_program116);
            mainBody5=mainBody();

            state._fsp--;

            stream_mainBody.add(mainBody5.getTree());
            DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_program118);  
            stream_DOT.add(DOT6);



            // AST REWRITE
            // elements: mainBody, PROGRAM, global_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:57: -> ^( PROGRAM[$IDENT] ( global_block )* mainBody )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:60: ^( PROGRAM[$IDENT] ( global_block )* mainBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, IDENT2), root_1);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:32:79: ( global_block )*
                while ( stream_global_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_global_block.nextTree());

                }
                stream_global_block.reset();
                adaptor.addChild(root_1, stream_mainBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class global_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_block"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:35:1: global_block : ( variableDeclarations | typeDeclarations | constantDeclarations | procedureDeclaration | functionDeclaration );
    public final BParser.global_block_return global_block() throws RecognitionException {
        BParser.global_block_return retval = new BParser.global_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.variableDeclarations_return variableDeclarations7 = null;

        BParser.typeDeclarations_return typeDeclarations8 = null;

        BParser.constantDeclarations_return constantDeclarations9 = null;

        BParser.procedureDeclaration_return procedureDeclaration10 = null;

        BParser.functionDeclaration_return functionDeclaration11 = null;



        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:36:2: ( variableDeclarations | typeDeclarations | constantDeclarations | procedureDeclaration | functionDeclaration )
            int alt2=5;
            switch ( input.LA(1) ) {
            case VAR:
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
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:36:4: variableDeclarations
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variableDeclarations_in_global_block141);
                    variableDeclarations7=variableDeclarations();

                    state._fsp--;

                    adaptor.addChild(root_0, variableDeclarations7.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:37:10: typeDeclarations
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeDeclarations_in_global_block152);
                    typeDeclarations8=typeDeclarations();

                    state._fsp--;

                    adaptor.addChild(root_0, typeDeclarations8.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:38:10: constantDeclarations
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constantDeclarations_in_global_block163);
                    constantDeclarations9=constantDeclarations();

                    state._fsp--;

                    adaptor.addChild(root_0, constantDeclarations9.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:39:10: procedureDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureDeclaration_in_global_block174);
                    procedureDeclaration10=procedureDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureDeclaration10.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:40:10: functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclaration_in_global_block185);
                    functionDeclaration11=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration11.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "global_block"

    public static class mainBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mainBody"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:43:1: mainBody : compoundStatement ;
    public final BParser.mainBody_return mainBody() throws RecognitionException {
        BParser.mainBody_return retval = new BParser.mainBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.compoundStatement_return compoundStatement12 = null;



        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:43:9: ( compoundStatement )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:44:2: compoundStatement
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_compoundStatement_in_mainBody206);
            compoundStatement12=compoundStatement();

            state._fsp--;

            adaptor.addChild(root_0, compoundStatement12.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mainBody"

    public static class variableDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarations"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:52:1: variableDeclarations : VAR variableDeclaration ( SEMI variableDeclaration )* SEMI -> ( variableDeclaration )+ ;
    public final BParser.variableDeclarations_return variableDeclarations() throws RecognitionException {
        BParser.variableDeclarations_return retval = new BParser.variableDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR13=null;
        Token SEMI15=null;
        Token SEMI17=null;
        BParser.variableDeclaration_return variableDeclaration14 = null;

        BParser.variableDeclaration_return variableDeclaration16 = null;


        CommonTree VAR13_tree=null;
        CommonTree SEMI15_tree=null;
        CommonTree SEMI17_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:53:5: ( VAR variableDeclaration ( SEMI variableDeclaration )* SEMI -> ( variableDeclaration )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:53:7: VAR variableDeclaration ( SEMI variableDeclaration )* SEMI
            {
            VAR13=(Token)match(input,VAR,FOLLOW_VAR_in_variableDeclarations230);  
            stream_VAR.add(VAR13);

            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarations232);
            variableDeclaration14=variableDeclaration();

            state._fsp--;

            stream_variableDeclaration.add(variableDeclaration14.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:53:31: ( SEMI variableDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SEMI) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==IDENT) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:53:33: SEMI variableDeclaration
            	    {
            	    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarations236);  
            	    stream_SEMI.add(SEMI15);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarations238);
            	    variableDeclaration16=variableDeclaration();

            	    state._fsp--;

            	    stream_variableDeclaration.add(variableDeclaration16.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarations243);  
            stream_SEMI.add(SEMI17);



            // AST REWRITE
            // elements: variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:66: -> ( variableDeclaration )+
            {
                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarations"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:57:1: variableDeclaration : (id= identifierList COLON t= type -> ^( INSTANCE[$COLON] $id $t) | id= identifierList COLON SHARED t= type -> ^( SHARED $id $t) );
    public final BParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        BParser.variableDeclaration_return retval = new BParser.variableDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON18=null;
        Token COLON19=null;
        Token SHARED20=null;
        BParser.identifierList_return id = null;

        BParser.type_return t = null;


        CommonTree COLON18_tree=null;
        CommonTree COLON19_tree=null;
        CommonTree SHARED20_tree=null;
        RewriteRuleTokenStream stream_SHARED=new RewriteRuleTokenStream(adaptor,"token SHARED");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:58:5: (id= identifierList COLON t= type -> ^( INSTANCE[$COLON] $id $t) | id= identifierList COLON SHARED t= type -> ^( SHARED $id $t) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:58:7: id= identifierList COLON t= type
                    {
                    pushFollow(FOLLOW_identifierList_in_variableDeclaration274);
                    id=identifierList();

                    state._fsp--;

                    stream_identifierList.add(id.getTree());
                    COLON18=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration276);  
                    stream_COLON.add(COLON18);

                    pushFollow(FOLLOW_type_in_variableDeclaration282);
                    t=type();

                    state._fsp--;

                    stream_type.add(t.getTree());


                    // AST REWRITE
                    // elements: t, id
                    // token labels: 
                    // rule labels: id, retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:42: -> ^( INSTANCE[$COLON] $id $t)
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:58:45: ^( INSTANCE[$COLON] $id $t)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTANCE, COLON18), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:59:7: id= identifierList COLON SHARED t= type
                    {
                    pushFollow(FOLLOW_identifierList_in_variableDeclaration307);
                    id=identifierList();

                    state._fsp--;

                    stream_identifierList.add(id.getTree());
                    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration309);  
                    stream_COLON.add(COLON19);

                    SHARED20=(Token)match(input,SHARED,FOLLOW_SHARED_in_variableDeclaration311);  
                    stream_SHARED.add(SHARED20);

                    pushFollow(FOLLOW_type_in_variableDeclaration317);
                    t=type();

                    state._fsp--;

                    stream_type.add(t.getTree());


                    // AST REWRITE
                    // elements: id, t, SHARED
                    // token labels: 
                    // rule labels: id, retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:49: -> ^( SHARED $id $t)
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:59:52: ^( SHARED $id $t)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SHARED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());
                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class identifierList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:63:1: identifierList : IDENT ( COMMA IDENT )* -> ^( IDLIST ( IDENT )+ ) ;
    public final BParser.identifierList_return identifierList() throws RecognitionException {
        BParser.identifierList_return retval = new BParser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT21=null;
        Token COMMA22=null;
        Token IDENT23=null;

        CommonTree IDENT21_tree=null;
        CommonTree COMMA22_tree=null;
        CommonTree IDENT23_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:64:5: ( IDENT ( COMMA IDENT )* -> ^( IDLIST ( IDENT )+ ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:64:7: IDENT ( COMMA IDENT )*
            {
            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifierList357);  
            stream_IDENT.add(IDENT21);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:64:13: ( COMMA IDENT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:64:15: COMMA IDENT
            	    {
            	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList361);  
            	    stream_COMMA.add(COMMA22);

            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifierList363);  
            	    stream_IDENT.add(IDENT23);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 64:30: -> ^( IDLIST ( IDENT )+ )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:64:33: ^( IDLIST ( IDENT )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDLIST, "IDLIST"), root_1);

                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());

                }
                stream_IDENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifierList"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:68:1: procedureDeclaration : PROCEDURE IDENT formalParameterList SEMI localParamaterList body -> ^( PROCEDURE[$IDENT] formalParameterList localParamaterList body ) ;
    public final BParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        BParser.procedureDeclaration_return retval = new BParser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE24=null;
        Token IDENT25=null;
        Token SEMI27=null;
        BParser.formalParameterList_return formalParameterList26 = null;

        BParser.localParamaterList_return localParamaterList28 = null;

        BParser.body_return body29 = null;


        CommonTree PROCEDURE24_tree=null;
        CommonTree IDENT25_tree=null;
        CommonTree SEMI27_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_localParamaterList=new RewriteRuleSubtreeStream(adaptor,"rule localParamaterList");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:69:5: ( PROCEDURE IDENT formalParameterList SEMI localParamaterList body -> ^( PROCEDURE[$IDENT] formalParameterList localParamaterList body ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:69:7: PROCEDURE IDENT formalParameterList SEMI localParamaterList body
            {
            PROCEDURE24=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration393);  
            stream_PROCEDURE.add(PROCEDURE24);

            IDENT25=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration395);  
            stream_IDENT.add(IDENT25);

            pushFollow(FOLLOW_formalParameterList_in_procedureDeclaration397);
            formalParameterList26=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList26.getTree());
            SEMI27=(Token)match(input,SEMI,FOLLOW_SEMI_in_procedureDeclaration399);  
            stream_SEMI.add(SEMI27);

            pushFollow(FOLLOW_localParamaterList_in_procedureDeclaration401);
            localParamaterList28=localParamaterList();

            state._fsp--;

            stream_localParamaterList.add(localParamaterList28.getTree());
            pushFollow(FOLLOW_body_in_procedureDeclaration403);
            body29=body();

            state._fsp--;

            stream_body.add(body29.getTree());


            // AST REWRITE
            // elements: formalParameterList, PROCEDURE, localParamaterList, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 70:7: -> ^( PROCEDURE[$IDENT] formalParameterList localParamaterList body )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:70:10: ^( PROCEDURE[$IDENT] formalParameterList localParamaterList body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, IDENT25), root_1);

                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_localParamaterList.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:74:1: functionDeclaration : FUNCTION IDENT formalParameterList COLON typeIdentifier SEMI localParamaterList body -> ^( FUNCTION[$IDENT] formalParameterList localParamaterList body typeIdentifier ) ;
    public final BParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        BParser.functionDeclaration_return retval = new BParser.functionDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FUNCTION30=null;
        Token IDENT31=null;
        Token COLON33=null;
        Token SEMI35=null;
        BParser.formalParameterList_return formalParameterList32 = null;

        BParser.typeIdentifier_return typeIdentifier34 = null;

        BParser.localParamaterList_return localParamaterList36 = null;

        BParser.body_return body37 = null;


        CommonTree FUNCTION30_tree=null;
        CommonTree IDENT31_tree=null;
        CommonTree COLON33_tree=null;
        CommonTree SEMI35_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_typeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule typeIdentifier");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_localParamaterList=new RewriteRuleSubtreeStream(adaptor,"rule localParamaterList");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:75:5: ( FUNCTION IDENT formalParameterList COLON typeIdentifier SEMI localParamaterList body -> ^( FUNCTION[$IDENT] formalParameterList localParamaterList body typeIdentifier ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:75:7: FUNCTION IDENT formalParameterList COLON typeIdentifier SEMI localParamaterList body
            {
            FUNCTION30=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration445);  
            stream_FUNCTION.add(FUNCTION30);

            IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionDeclaration447);  
            stream_IDENT.add(IDENT31);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration449);
            formalParameterList32=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList32.getTree());
            COLON33=(Token)match(input,COLON,FOLLOW_COLON_in_functionDeclaration451);  
            stream_COLON.add(COLON33);

            pushFollow(FOLLOW_typeIdentifier_in_functionDeclaration453);
            typeIdentifier34=typeIdentifier();

            state._fsp--;

            stream_typeIdentifier.add(typeIdentifier34.getTree());
            SEMI35=(Token)match(input,SEMI,FOLLOW_SEMI_in_functionDeclaration455);  
            stream_SEMI.add(SEMI35);

            pushFollow(FOLLOW_localParamaterList_in_functionDeclaration457);
            localParamaterList36=localParamaterList();

            state._fsp--;

            stream_localParamaterList.add(localParamaterList36.getTree());
            pushFollow(FOLLOW_body_in_functionDeclaration459);
            body37=body();

            state._fsp--;

            stream_body.add(body37.getTree());


            // AST REWRITE
            // elements: body, typeIdentifier, formalParameterList, FUNCTION, localParamaterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:7: -> ^( FUNCTION[$IDENT] formalParameterList localParamaterList body typeIdentifier )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:76:10: ^( FUNCTION[$IDENT] formalParameterList localParamaterList body typeIdentifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, IDENT31), root_1);

                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_localParamaterList.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());
                adaptor.addChild(root_1, stream_typeIdentifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:80:1: formalParameterList : ( LPAREN RPAREN -> LIST | LPAREN e+= formalParameterSection ( SEMI e+= formalParameterSection )* RPAREN -> ^( LIST ( $e)+ ) | -> LIST );
    public final BParser.formalParameterList_return formalParameterList() throws RecognitionException {
        BParser.formalParameterList_return retval = new BParser.formalParameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN38=null;
        Token RPAREN39=null;
        Token LPAREN40=null;
        Token SEMI41=null;
        Token RPAREN42=null;
        List list_e=null;
        RuleReturnScope e = null;
        CommonTree LPAREN38_tree=null;
        CommonTree RPAREN39_tree=null;
        CommonTree LPAREN40_tree=null;
        CommonTree SEMI41_tree=null;
        CommonTree RPAREN42_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameterSection=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterSection");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:81:5: ( LPAREN RPAREN -> LIST | LPAREN e+= formalParameterSection ( SEMI e+= formalParameterSection )* RPAREN -> ^( LIST ( $e)+ ) | -> LIST )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RPAREN) ) {
                    alt7=1;
                }
                else if ( (LA7_1==VAR||LA7_1==IDENT) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=SEMI && LA7_0<=COLON)) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:81:7: LPAREN RPAREN
                    {
                    LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList512);  
                    stream_LPAREN.add(LPAREN38);

                    RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList514);  
                    stream_RPAREN.add(RPAREN39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:21: -> LIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LIST, "LIST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:82:7: LPAREN e+= formalParameterSection ( SEMI e+= formalParameterSection )* RPAREN
                    {
                    LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList526);  
                    stream_LPAREN.add(LPAREN40);

                    pushFollow(FOLLOW_formalParameterSection_in_formalParameterList530);
                    e=formalParameterSection();

                    state._fsp--;

                    stream_formalParameterSection.add(e.getTree());
                    if (list_e==null) list_e=new ArrayList();
                    list_e.add(e.getTree());

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:82:40: ( SEMI e+= formalParameterSection )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==SEMI) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:82:42: SEMI e+= formalParameterSection
                    	    {
                    	    SEMI41=(Token)match(input,SEMI,FOLLOW_SEMI_in_formalParameterList534);  
                    	    stream_SEMI.add(SEMI41);

                    	    pushFollow(FOLLOW_formalParameterSection_in_formalParameterList538);
                    	    e=formalParameterSection();

                    	    state._fsp--;

                    	    stream_formalParameterSection.add(e.getTree());
                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList542);  
                    stream_RPAREN.add(RPAREN42);



                    // AST REWRITE
                    // elements: e
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: e
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
                    root_0 = (CommonTree)adaptor.nil();
                    // 82:82: -> ^( LIST ( $e)+ )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:82:85: ^( LIST ( $e)+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                        if ( !(stream_e.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:83:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:7: -> LIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LIST, "LIST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class formalParameterSection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterSection"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:86:1: formalParameterSection : ( parameterGroup -> ^( BY_VALUE parameterGroup ) | VAR parameterGroup -> ^( BY_REFERENCE parameterGroup ) );
    public final BParser.formalParameterSection_return formalParameterSection() throws RecognitionException {
        BParser.formalParameterSection_return retval = new BParser.formalParameterSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR44=null;
        BParser.parameterGroup_return parameterGroup43 = null;

        BParser.parameterGroup_return parameterGroup45 = null;


        CommonTree VAR44_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_parameterGroup=new RewriteRuleSubtreeStream(adaptor,"rule parameterGroup");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:87:5: ( parameterGroup -> ^( BY_VALUE parameterGroup ) | VAR parameterGroup -> ^( BY_REFERENCE parameterGroup ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            else if ( (LA8_0==VAR) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:87:7: parameterGroup
                    {
                    pushFollow(FOLLOW_parameterGroup_in_formalParameterSection587);
                    parameterGroup43=parameterGroup();

                    state._fsp--;

                    stream_parameterGroup.add(parameterGroup43.getTree());


                    // AST REWRITE
                    // elements: parameterGroup
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:22: -> ^( BY_VALUE parameterGroup )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:87:25: ^( BY_VALUE parameterGroup )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BY_VALUE, "BY_VALUE"), root_1);

                        adaptor.addChild(root_1, stream_parameterGroup.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:88:7: VAR parameterGroup
                    {
                    VAR44=(Token)match(input,VAR,FOLLOW_VAR_in_formalParameterSection603);  
                    stream_VAR.add(VAR44);

                    pushFollow(FOLLOW_parameterGroup_in_formalParameterSection605);
                    parameterGroup45=parameterGroup();

                    state._fsp--;

                    stream_parameterGroup.add(parameterGroup45.getTree());


                    // AST REWRITE
                    // elements: parameterGroup
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 88:26: -> ^( BY_REFERENCE parameterGroup )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:88:29: ^( BY_REFERENCE parameterGroup )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BY_REFERENCE, "BY_REFERENCE"), root_1);

                        adaptor.addChild(root_1, stream_parameterGroup.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterSection"

    public static class parameterGroup_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterGroup"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:91:1: parameterGroup : identifierList COLON typeIdentifier ;
    public final BParser.parameterGroup_return parameterGroup() throws RecognitionException {
        BParser.parameterGroup_return retval = new BParser.parameterGroup_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON47=null;
        BParser.identifierList_return identifierList46 = null;

        BParser.typeIdentifier_return typeIdentifier48 = null;


        CommonTree COLON47_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:92:5: ( identifierList COLON typeIdentifier )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:92:7: identifierList COLON typeIdentifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierList_in_parameterGroup638);
            identifierList46=identifierList();

            state._fsp--;

            adaptor.addChild(root_0, identifierList46.getTree());
            COLON47=(Token)match(input,COLON,FOLLOW_COLON_in_parameterGroup640); 
            pushFollow(FOLLOW_typeIdentifier_in_parameterGroup643);
            typeIdentifier48=typeIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, typeIdentifier48.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameterGroup"

    public static class localParamaterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localParamaterList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:95:1: localParamaterList : ( variableDeclarations )* -> ^( LIST ( variableDeclarations )* ) ;
    public final BParser.localParamaterList_return localParamaterList() throws RecognitionException {
        BParser.localParamaterList_return retval = new BParser.localParamaterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.variableDeclarations_return variableDeclarations49 = null;


        RewriteRuleSubtreeStream stream_variableDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarations");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:96:2: ( ( variableDeclarations )* -> ^( LIST ( variableDeclarations )* ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:97:2: ( variableDeclarations )*
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:97:2: ( variableDeclarations )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VAR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:97:2: variableDeclarations
            	    {
            	    pushFollow(FOLLOW_variableDeclarations_in_localParamaterList668);
            	    variableDeclarations49=variableDeclarations();

            	    state._fsp--;

            	    stream_variableDeclarations.add(variableDeclarations49.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: variableDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:24: -> ^( LIST ( variableDeclarations )* )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:97:27: ^( LIST ( variableDeclarations )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_1);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:97:34: ( variableDeclarations )*
                while ( stream_variableDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclarations.nextTree());

                }
                stream_variableDeclarations.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "localParamaterList"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:100:1: typeDeclarations : TYPE typeDeclaration ( SEMI typeDeclaration )* SEMI ;
    public final BParser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        BParser.typeDeclarations_return retval = new BParser.typeDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE50=null;
        Token SEMI52=null;
        Token SEMI54=null;
        BParser.typeDeclaration_return typeDeclaration51 = null;

        BParser.typeDeclaration_return typeDeclaration53 = null;


        CommonTree TYPE50_tree=null;
        CommonTree SEMI52_tree=null;
        CommonTree SEMI54_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:101:5: ( TYPE typeDeclaration ( SEMI typeDeclaration )* SEMI )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:101:7: TYPE typeDeclaration ( SEMI typeDeclaration )* SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            TYPE50=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclarations696); 
            pushFollow(FOLLOW_typeDeclaration_in_typeDeclarations699);
            typeDeclaration51=typeDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, typeDeclaration51.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:101:29: ( SEMI typeDeclaration )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==SEMI) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==IDENT) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:101:31: SEMI typeDeclaration
            	    {
            	    SEMI52=(Token)match(input,SEMI,FOLLOW_SEMI_in_typeDeclarations703); 
            	    pushFollow(FOLLOW_typeDeclaration_in_typeDeclarations706);
            	    typeDeclaration53=typeDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeDeclaration53.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            SEMI54=(Token)match(input,SEMI,FOLLOW_SEMI_in_typeDeclarations711); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDeclarations"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:104:1: typeDeclaration : IDENT EQUAL type -> ^( TYPE[$IDENT] type ) ;
    public final BParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        BParser.typeDeclaration_return retval = new BParser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT55=null;
        Token EQUAL56=null;
        BParser.type_return type57 = null;


        CommonTree IDENT55_tree=null;
        CommonTree EQUAL56_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:105:5: ( IDENT EQUAL type -> ^( TYPE[$IDENT] type ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:105:7: IDENT EQUAL type
            {
            IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration729);  
            stream_IDENT.add(IDENT55);

            EQUAL56=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_typeDeclaration731);  
            stream_EQUAL.add(EQUAL56);

            pushFollow(FOLLOW_type_in_typeDeclaration733);
            type57=type();

            state._fsp--;

            stream_type.add(type57.getTree());


            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:24: -> ^( TYPE[$IDENT] type )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:105:27: ^( TYPE[$IDENT] type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, IDENT55), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class constantDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarations"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:113:1: constantDeclarations : CONST constantDefinition ( SEMI constantDefinition )* SEMI ;
    public final BParser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        BParser.constantDeclarations_return retval = new BParser.constantDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST58=null;
        Token SEMI60=null;
        Token SEMI62=null;
        BParser.constantDefinition_return constantDefinition59 = null;

        BParser.constantDefinition_return constantDefinition61 = null;


        CommonTree CONST58_tree=null;
        CommonTree SEMI60_tree=null;
        CommonTree SEMI62_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:114:5: ( CONST constantDefinition ( SEMI constantDefinition )* SEMI )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:114:7: CONST constantDefinition ( SEMI constantDefinition )* SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            CONST58=(Token)match(input,CONST,FOLLOW_CONST_in_constantDeclarations760); 
            pushFollow(FOLLOW_constantDefinition_in_constantDeclarations763);
            constantDefinition59=constantDefinition();

            state._fsp--;

            adaptor.addChild(root_0, constantDefinition59.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:114:33: ( SEMI constantDefinition )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SEMI) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==IDENT) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:114:35: SEMI constantDefinition
            	    {
            	    SEMI60=(Token)match(input,SEMI,FOLLOW_SEMI_in_constantDeclarations767); 
            	    pushFollow(FOLLOW_constantDefinition_in_constantDeclarations770);
            	    constantDefinition61=constantDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, constantDefinition61.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            SEMI62=(Token)match(input,SEMI,FOLLOW_SEMI_in_constantDeclarations775); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantDeclarations"

    public static class constantDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDefinition"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:117:1: constantDefinition : IDENT EQUAL expression -> ^( CONST[$IDENT] expression ) ;
    public final BParser.constantDefinition_return constantDefinition() throws RecognitionException {
        BParser.constantDefinition_return retval = new BParser.constantDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT63=null;
        Token EQUAL64=null;
        BParser.expression_return expression65 = null;


        CommonTree IDENT63_tree=null;
        CommonTree EQUAL64_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:118:5: ( IDENT EQUAL expression -> ^( CONST[$IDENT] expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:118:7: IDENT EQUAL expression
            {
            IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDefinition793);  
            stream_IDENT.add(IDENT63);

            EQUAL64=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_constantDefinition795);  
            stream_EQUAL.add(EQUAL64);

            pushFollow(FOLLOW_expression_in_constantDefinition797);
            expression65=expression();

            state._fsp--;

            stream_expression.add(expression65.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:30: -> ^( CONST[$IDENT] expression )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:118:33: ^( CONST[$IDENT] expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, IDENT63), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantDefinition"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:124:1: type : ( typeIdentifier | arrayType | recordType );
    public final BParser.type_return type() throws RecognitionException {
        BParser.type_return retval = new BParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.typeIdentifier_return typeIdentifier66 = null;

        BParser.arrayType_return arrayType67 = null;

        BParser.recordType_return recordType68 = null;



        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:125:5: ( typeIdentifier | arrayType | recordType )
            int alt12=3;
            switch ( input.LA(1) ) {
            case SEMAPHORE:
            case BOOLEAN:
            case INTEGER:
            case REAL:
            case TRUE:
            case FALSE:
            case NOT:
            case PLUS:
            case MINUS:
            case LPAREN:
            case IDENT:
            case STRING_LITERAL:
            case HEX_INT:
            case NUM_INT:
            case NUM_REAL:
                {
                alt12=1;
                }
                break;
            case ARRAY:
                {
                alt12=2;
                }
                break;
            case RECORD:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:125:7: typeIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeIdentifier_in_type827);
                    typeIdentifier66=typeIdentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, typeIdentifier66.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:126:7: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type835);
                    arrayType67=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType67.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:127:7: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type843);
                    recordType68=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType68.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdentifier"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:131:1: typeIdentifier : ( BOOLEAN | INTEGER | REAL | SEMAPHORE | IDENT | subrangeType );
    public final BParser.typeIdentifier_return typeIdentifier() throws RecognitionException {
        BParser.typeIdentifier_return retval = new BParser.typeIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BOOLEAN69=null;
        Token INTEGER70=null;
        Token REAL71=null;
        Token SEMAPHORE72=null;
        Token IDENT73=null;
        BParser.subrangeType_return subrangeType74 = null;


        CommonTree BOOLEAN69_tree=null;
        CommonTree INTEGER70_tree=null;
        CommonTree REAL71_tree=null;
        CommonTree SEMAPHORE72_tree=null;
        CommonTree IDENT73_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:132:6: ( BOOLEAN | INTEGER | REAL | SEMAPHORE | IDENT | subrangeType )
            int alt13=6;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt13=1;
                }
                break;
            case INTEGER:
                {
                alt13=2;
                }
                break;
            case REAL:
                {
                alt13=3;
                }
                break;
            case SEMAPHORE:
                {
                alt13=4;
                }
                break;
            case IDENT:
                {
                int LA13_5 = input.LA(2);

                if ( ((LA13_5>=AND && LA13_5<=XOR)||(LA13_5>=DIV && LA13_5<=SLASH)||(LA13_5>=DOTDOT && LA13_5<=LPAREN)||LA13_5==LBRACK) ) {
                    alt13=6;
                }
                else if ( (LA13_5==END||LA13_5==SEMI||LA13_5==RPAREN||LA13_5==RBRACK) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case TRUE:
            case FALSE:
            case NOT:
            case PLUS:
            case MINUS:
            case LPAREN:
            case STRING_LITERAL:
            case HEX_INT:
            case NUM_INT:
            case NUM_REAL:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:132:8: BOOLEAN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BOOLEAN69=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_typeIdentifier863); 
                    BOOLEAN69_tree = (CommonTree)adaptor.create(BOOLEAN69);
                    adaptor.addChild(root_0, BOOLEAN69_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:133:8: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER70=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_typeIdentifier872); 
                    INTEGER70_tree = (CommonTree)adaptor.create(INTEGER70);
                    adaptor.addChild(root_0, INTEGER70_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:134:8: REAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REAL71=(Token)match(input,REAL,FOLLOW_REAL_in_typeIdentifier881); 
                    REAL71_tree = (CommonTree)adaptor.create(REAL71);
                    adaptor.addChild(root_0, REAL71_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:135:8: SEMAPHORE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMAPHORE72=(Token)match(input,SEMAPHORE,FOLLOW_SEMAPHORE_in_typeIdentifier890); 
                    SEMAPHORE72_tree = (CommonTree)adaptor.create(SEMAPHORE72);
                    adaptor.addChild(root_0, SEMAPHORE72_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:136:8: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT73=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeIdentifier899); 
                    IDENT73_tree = (CommonTree)adaptor.create(IDENT73);
                    adaptor.addChild(root_0, IDENT73_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:137:14: subrangeType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_subrangeType_in_typeIdentifier914);
                    subrangeType74=subrangeType();

                    state._fsp--;

                    adaptor.addChild(root_0, subrangeType74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeIdentifier"

    public static class subrangeType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subrangeType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:140:1: subrangeType : expression DOTDOT expression ;
    public final BParser.subrangeType_return subrangeType() throws RecognitionException {
        BParser.subrangeType_return retval = new BParser.subrangeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOTDOT76=null;
        BParser.expression_return expression75 = null;

        BParser.expression_return expression77 = null;


        CommonTree DOTDOT76_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:141:5: ( expression DOTDOT expression )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:141:7: expression DOTDOT expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_subrangeType939);
            expression75=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression75.getTree());
            DOTDOT76=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_subrangeType941); 
            DOTDOT76_tree = (CommonTree)adaptor.create(DOTDOT76);
            root_0 = (CommonTree)adaptor.becomeRoot(DOTDOT76_tree, root_0);

            pushFollow(FOLLOW_expression_in_subrangeType944);
            expression77=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression77.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subrangeType"

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:144:1: arrayType : ARRAY LBRACK typeIdentifier RBRACK OF type ;
    public final BParser.arrayType_return arrayType() throws RecognitionException {
        BParser.arrayType_return retval = new BParser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY78=null;
        Token LBRACK79=null;
        Token RBRACK81=null;
        Token OF82=null;
        BParser.typeIdentifier_return typeIdentifier80 = null;

        BParser.type_return type83 = null;


        CommonTree ARRAY78_tree=null;
        CommonTree LBRACK79_tree=null;
        CommonTree RBRACK81_tree=null;
        CommonTree OF82_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:145:5: ( ARRAY LBRACK typeIdentifier RBRACK OF type )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:145:7: ARRAY LBRACK typeIdentifier RBRACK OF type
            {
            root_0 = (CommonTree)adaptor.nil();

            ARRAY78=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType971); 
            ARRAY78_tree = (CommonTree)adaptor.create(ARRAY78);
            root_0 = (CommonTree)adaptor.becomeRoot(ARRAY78_tree, root_0);

            LBRACK79=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayType974); 
            pushFollow(FOLLOW_typeIdentifier_in_arrayType977);
            typeIdentifier80=typeIdentifier();

            state._fsp--;

            adaptor.addChild(root_0, typeIdentifier80.getTree());
            RBRACK81=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayType979); 
            OF82=(Token)match(input,OF,FOLLOW_OF_in_arrayType982); 
            pushFollow(FOLLOW_type_in_arrayType985);
            type83=type();

            state._fsp--;

            adaptor.addChild(root_0, type83.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:149:1: recordType : RECORD fieldDeclaration ( SEMI fieldDeclaration )* ( SEMI )? END ;
    public final BParser.recordType_return recordType() throws RecognitionException {
        BParser.recordType_return retval = new BParser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD84=null;
        Token SEMI86=null;
        Token SEMI88=null;
        Token END89=null;
        BParser.fieldDeclaration_return fieldDeclaration85 = null;

        BParser.fieldDeclaration_return fieldDeclaration87 = null;


        CommonTree RECORD84_tree=null;
        CommonTree SEMI86_tree=null;
        CommonTree SEMI88_tree=null;
        CommonTree END89_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:5: ( RECORD fieldDeclaration ( SEMI fieldDeclaration )* ( SEMI )? END )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:7: RECORD fieldDeclaration ( SEMI fieldDeclaration )* ( SEMI )? END
            {
            root_0 = (CommonTree)adaptor.nil();

            RECORD84=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType999); 
            RECORD84_tree = (CommonTree)adaptor.create(RECORD84);
            root_0 = (CommonTree)adaptor.becomeRoot(RECORD84_tree, root_0);

            pushFollow(FOLLOW_fieldDeclaration_in_recordType1002);
            fieldDeclaration85=fieldDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, fieldDeclaration85.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:32: ( SEMI fieldDeclaration )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==SEMI) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==IDENT) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:34: SEMI fieldDeclaration
            	    {
            	    SEMI86=(Token)match(input,SEMI,FOLLOW_SEMI_in_recordType1006); 
            	    pushFollow(FOLLOW_fieldDeclaration_in_recordType1009);
            	    fieldDeclaration87=fieldDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldDeclaration87.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:64: ( SEMI )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SEMI) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:150:64: SEMI
                    {
                    SEMI88=(Token)match(input,SEMI,FOLLOW_SEMI_in_recordType1014); 

                    }
                    break;

            }

            END89=(Token)match(input,END,FOLLOW_END_in_recordType1018); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDeclaration"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:154:1: fieldDeclaration : identifierList COLON type ;
    public final BParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        BParser.fieldDeclaration_return retval = new BParser.fieldDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON91=null;
        BParser.identifierList_return identifierList90 = null;

        BParser.type_return type92 = null;


        CommonTree COLON91_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:155:5: ( identifierList COLON type )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:155:7: identifierList COLON type
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifierList_in_fieldDeclaration1037);
            identifierList90=identifierList();

            state._fsp--;

            adaptor.addChild(root_0, identifierList90.getTree());
            COLON91=(Token)match(input,COLON,FOLLOW_COLON_in_fieldDeclaration1039); 
            COLON91_tree = (CommonTree)adaptor.create(COLON91);
            root_0 = (CommonTree)adaptor.becomeRoot(COLON91_tree, root_0);

            pushFollow(FOLLOW_type_in_fieldDeclaration1042);
            type92=type();

            state._fsp--;

            adaptor.addChild(root_0, type92.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:162:1: body : compoundStatement SEMI ;
    public final BParser.body_return body() throws RecognitionException {
        BParser.body_return retval = new BParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI94=null;
        BParser.compoundStatement_return compoundStatement93 = null;


        CommonTree SEMI94_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:162:5: ( compoundStatement SEMI )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:163:2: compoundStatement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_compoundStatement_in_body1061);
            compoundStatement93=compoundStatement();

            state._fsp--;

            adaptor.addChild(root_0, compoundStatement93.getTree());
            SEMI94=(Token)match(input,SEMI,FOLLOW_SEMI_in_body1063); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:166:1: statementList : statement ( SEMI ( statement )? )* ;
    public final BParser.statementList_return statementList() throws RecognitionException {
        BParser.statementList_return retval = new BParser.statementList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI96=null;
        BParser.statement_return statement95 = null;

        BParser.statement_return statement97 = null;


        CommonTree SEMI96_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:5: ( statement ( SEMI ( statement )? )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:7: statement ( SEMI ( statement )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementList1079);
            statement95=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement95.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:17: ( SEMI ( statement )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SEMI) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:19: SEMI ( statement )?
            	    {
            	    SEMI96=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementList1083); 
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:25: ( statement )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==COBEGIN||LA16_0==COFOR||(LA16_0>=REGION && LA16_0<=AWAIT)||LA16_0==BEGIN||LA16_0==IF||LA16_0==WHILE||LA16_0==REPEAT||LA16_0==FOR||LA16_0==BREAK||LA16_0==IDENT) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:167:25: statement
            	            {
            	            pushFollow(FOLLOW_statement_in_statementList1086);
            	            statement97=statement();

            	            state._fsp--;

            	            adaptor.addChild(root_0, statement97.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementList"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:170:1: statement : ( compoundStatement | cobeginStatement | assignmentStatement | callStatement | ifStatement | whileStatement | repeatStatement | forStatement | breakStatement | coforStatement | regionStatement | awaitStatement );
    public final BParser.statement_return statement() throws RecognitionException {
        BParser.statement_return retval = new BParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.compoundStatement_return compoundStatement98 = null;

        BParser.cobeginStatement_return cobeginStatement99 = null;

        BParser.assignmentStatement_return assignmentStatement100 = null;

        BParser.callStatement_return callStatement101 = null;

        BParser.ifStatement_return ifStatement102 = null;

        BParser.whileStatement_return whileStatement103 = null;

        BParser.repeatStatement_return repeatStatement104 = null;

        BParser.forStatement_return forStatement105 = null;

        BParser.breakStatement_return breakStatement106 = null;

        BParser.coforStatement_return coforStatement107 = null;

        BParser.regionStatement_return regionStatement108 = null;

        BParser.awaitStatement_return awaitStatement109 = null;



        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:171:5: ( compoundStatement | cobeginStatement | assignmentStatement | callStatement | ifStatement | whileStatement | repeatStatement | forStatement | breakStatement | coforStatement | regionStatement | awaitStatement )
            int alt18=12;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:171:7: compoundStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_compoundStatement_in_statement1112);
                    compoundStatement98=compoundStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundStatement98.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:172:7: cobeginStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cobeginStatement_in_statement1120);
                    cobeginStatement99=cobeginStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, cobeginStatement99.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:173:7: assignmentStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignmentStatement_in_statement1128);
                    assignmentStatement100=assignmentStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentStatement100.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:174:7: callStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_callStatement_in_statement1136);
                    callStatement101=callStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, callStatement101.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:175:7: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement1144);
                    ifStatement102=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement102.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:176:7: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement1156);
                    whileStatement103=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement103.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:177:7: repeatStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_repeatStatement_in_statement1164);
                    repeatStatement104=repeatStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, repeatStatement104.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:178:7: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_statement1172);
                    forStatement105=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement105.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:179:7: breakStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statement1184);
                    breakStatement106=breakStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, breakStatement106.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:180:7: coforStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_coforStatement_in_statement1192);
                    coforStatement107=coforStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, coforStatement107.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:181:7: regionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_regionStatement_in_statement1204);
                    regionStatement108=regionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, regionStatement108.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:182:7: awaitStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_awaitStatement_in_statement1212);
                    awaitStatement109=awaitStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, awaitStatement109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class compoundStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:185:1: compoundStatement : BEGIN ( statementList )? END ;
    public final BParser.compoundStatement_return compoundStatement() throws RecognitionException {
        BParser.compoundStatement_return retval = new BParser.compoundStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN110=null;
        Token END112=null;
        BParser.statementList_return statementList111 = null;


        CommonTree BEGIN110_tree=null;
        CommonTree END112_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:186:5: ( BEGIN ( statementList )? END )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:186:7: BEGIN ( statementList )? END
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN110=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compoundStatement1229); 
            BEGIN110_tree = (CommonTree)adaptor.create(BEGIN110);
            root_0 = (CommonTree)adaptor.becomeRoot(BEGIN110_tree, root_0);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:187:3: ( statementList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COBEGIN||LA19_0==COFOR||(LA19_0>=REGION && LA19_0<=AWAIT)||LA19_0==BEGIN||LA19_0==IF||LA19_0==WHILE||LA19_0==REPEAT||LA19_0==FOR||LA19_0==BREAK||LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:187:3: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_compoundStatement1234);
                    statementList111=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList111.getTree());

                    }
                    break;

            }

            END112=(Token)match(input,END,FOLLOW_END_in_compoundStatement1243); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundStatement"

    public static class cobeginStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cobeginStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:191:1: cobeginStatement : COBEGIN ( statementList )? COEND ;
    public final BParser.cobeginStatement_return cobeginStatement() throws RecognitionException {
        BParser.cobeginStatement_return retval = new BParser.cobeginStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COBEGIN113=null;
        Token COEND115=null;
        BParser.statementList_return statementList114 = null;


        CommonTree COBEGIN113_tree=null;
        CommonTree COEND115_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:192:5: ( COBEGIN ( statementList )? COEND )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:192:7: COBEGIN ( statementList )? COEND
            {
            root_0 = (CommonTree)adaptor.nil();

            COBEGIN113=(Token)match(input,COBEGIN,FOLLOW_COBEGIN_in_cobeginStatement1265); 
            COBEGIN113_tree = (CommonTree)adaptor.create(COBEGIN113);
            root_0 = (CommonTree)adaptor.becomeRoot(COBEGIN113_tree, root_0);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:193:3: ( statementList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COBEGIN||LA20_0==COFOR||(LA20_0>=REGION && LA20_0<=AWAIT)||LA20_0==BEGIN||LA20_0==IF||LA20_0==WHILE||LA20_0==REPEAT||LA20_0==FOR||LA20_0==BREAK||LA20_0==IDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:193:3: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_cobeginStatement1270);
                    statementList114=statementList();

                    state._fsp--;

                    adaptor.addChild(root_0, statementList114.getTree());

                    }
                    break;

            }

            COEND115=(Token)match(input,COEND,FOLLOW_COEND_in_cobeginStatement1279); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cobeginStatement"

    public static class assignmentStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:197:1: assignmentStatement : variable ASSIGN expression ;
    public final BParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
        BParser.assignmentStatement_return retval = new BParser.assignmentStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN117=null;
        BParser.variable_return variable116 = null;

        BParser.expression_return expression118 = null;


        CommonTree ASSIGN117_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:198:5: ( variable ASSIGN expression )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:198:7: variable ASSIGN expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variable_in_assignmentStatement1301);
            variable116=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable116.getTree());
            ASSIGN117=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentStatement1303); 
            ASSIGN117_tree = (CommonTree)adaptor.create(ASSIGN117);
            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN117_tree, root_0);

            pushFollow(FOLLOW_expression_in_assignmentStatement1306);
            expression118=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression118.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentStatement"

    public static class callStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:201:1: callStatement : IDENT ( LPAREN ( expressionList )? RPAREN )? -> ^( CALL[$IDENT] ( expressionList )? ) ;
    public final BParser.callStatement_return callStatement() throws RecognitionException {
        BParser.callStatement_return retval = new BParser.callStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT119=null;
        Token LPAREN120=null;
        Token RPAREN122=null;
        BParser.expressionList_return expressionList121 = null;


        CommonTree IDENT119_tree=null;
        CommonTree LPAREN120_tree=null;
        CommonTree RPAREN122_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:5: ( IDENT ( LPAREN ( expressionList )? RPAREN )? -> ^( CALL[$IDENT] ( expressionList )? ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:7: IDENT ( LPAREN ( expressionList )? RPAREN )?
            {
            IDENT119=(Token)match(input,IDENT,FOLLOW_IDENT_in_callStatement1331);  
            stream_IDENT.add(IDENT119);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:13: ( LPAREN ( expressionList )? RPAREN )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LPAREN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:15: LPAREN ( expressionList )? RPAREN
                    {
                    LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_callStatement1335);  
                    stream_LPAREN.add(LPAREN120);

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:22: ( expressionList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=TRUE && LA21_0<=FALSE)||LA21_0==NOT||(LA21_0>=PLUS && LA21_0<=MINUS)||LA21_0==LPAREN||(LA21_0>=IDENT && LA21_0<=STRING_LITERAL)||LA21_0==HEX_INT||LA21_0==NUM_INT||LA21_0==NUM_REAL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:22: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_callStatement1337);
                            expressionList121=expressionList();

                            state._fsp--;

                            stream_expressionList.add(expressionList121.getTree());

                            }
                            break;

                    }

                    RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_callStatement1340);  
                    stream_RPAREN.add(RPAREN122);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 202:48: -> ^( CALL[$IDENT] ( expressionList )? )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:51: ^( CALL[$IDENT] ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, IDENT119), root_1);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:202:66: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:206:1: ifStatement : IF expression THEN statement ( ELSE statement )? ;
    public final BParser.ifStatement_return ifStatement() throws RecognitionException {
        BParser.ifStatement_return retval = new BParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF123=null;
        Token THEN125=null;
        Token ELSE127=null;
        BParser.expression_return expression124 = null;

        BParser.statement_return statement126 = null;

        BParser.statement_return statement128 = null;


        CommonTree IF123_tree=null;
        CommonTree THEN125_tree=null;
        CommonTree ELSE127_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:207:5: ( IF expression THEN statement ( ELSE statement )? )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:207:7: IF expression THEN statement ( ELSE statement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            IF123=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1375); 
            IF123_tree = (CommonTree)adaptor.create(IF123);
            root_0 = (CommonTree)adaptor.becomeRoot(IF123_tree, root_0);

            pushFollow(FOLLOW_expression_in_ifStatement1378);
            expression124=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression124.getTree());
            THEN125=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1380); 
            pushFollow(FOLLOW_statement_in_ifStatement1383);
            statement126=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement126.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:208:7: ( ELSE statement )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:208:9: ELSE statement
                    {
                    ELSE127=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1393); 
                    pushFollow(FOLLOW_statement_in_ifStatement1396);
                    statement128=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement128.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:211:1: whileStatement : WHILE expression DO ( statement )? ;
    public final BParser.whileStatement_return whileStatement() throws RecognitionException {
        BParser.whileStatement_return retval = new BParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE129=null;
        Token DO131=null;
        BParser.expression_return expression130 = null;

        BParser.statement_return statement132 = null;


        CommonTree WHILE129_tree=null;
        CommonTree DO131_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:212:5: ( WHILE expression DO ( statement )? )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:212:7: WHILE expression DO ( statement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE129=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1420); 
            WHILE129_tree = (CommonTree)adaptor.create(WHILE129);
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE129_tree, root_0);

            pushFollow(FOLLOW_expression_in_whileStatement1423);
            expression130=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression130.getTree());
            DO131=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1425); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:212:29: ( statement )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COBEGIN||LA24_0==COFOR||(LA24_0>=REGION && LA24_0<=AWAIT)||LA24_0==BEGIN||LA24_0==IF||LA24_0==WHILE||LA24_0==REPEAT||LA24_0==FOR||LA24_0==BREAK||LA24_0==IDENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:212:29: statement
                    {
                    pushFollow(FOLLOW_statement_in_whileStatement1428);
                    statement132=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement132.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class repeatStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:215:1: repeatStatement : REPEAT ( statementList )? UNTIL expression -> ^( REPEAT ^( LIST ( statementList )? ) expression ) ;
    public final BParser.repeatStatement_return repeatStatement() throws RecognitionException {
        BParser.repeatStatement_return retval = new BParser.repeatStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REPEAT133=null;
        Token UNTIL135=null;
        BParser.statementList_return statementList134 = null;

        BParser.expression_return expression136 = null;


        CommonTree REPEAT133_tree=null;
        CommonTree UNTIL135_tree=null;
        RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
        RewriteRuleTokenStream stream_UNTIL=new RewriteRuleTokenStream(adaptor,"token UNTIL");
        RewriteRuleSubtreeStream stream_statementList=new RewriteRuleSubtreeStream(adaptor,"rule statementList");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:5: ( REPEAT ( statementList )? UNTIL expression -> ^( REPEAT ^( LIST ( statementList )? ) expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:7: REPEAT ( statementList )? UNTIL expression
            {
            REPEAT133=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeatStatement1446);  
            stream_REPEAT.add(REPEAT133);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:14: ( statementList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==COBEGIN||LA25_0==COFOR||(LA25_0>=REGION && LA25_0<=AWAIT)||LA25_0==BEGIN||LA25_0==IF||LA25_0==WHILE||LA25_0==REPEAT||LA25_0==FOR||LA25_0==BREAK||LA25_0==IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:14: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_repeatStatement1448);
                    statementList134=statementList();

                    state._fsp--;

                    stream_statementList.add(statementList134.getTree());

                    }
                    break;

            }

            UNTIL135=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_repeatStatement1451);  
            stream_UNTIL.add(UNTIL135);

            pushFollow(FOLLOW_expression_in_repeatStatement1453);
            expression136=expression();

            state._fsp--;

            stream_expression.add(expression136.getTree());


            // AST REWRITE
            // elements: expression, REPEAT, statementList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 216:46: -> ^( REPEAT ^( LIST ( statementList )? ) expression )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:49: ^( REPEAT ^( LIST ( statementList )? ) expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_REPEAT.nextNode(), root_1);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:58: ^( LIST ( statementList )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST"), root_2);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:216:65: ( statementList )?
                if ( stream_statementList.hasNext() ) {
                    adaptor.addChild(root_2, stream_statementList.nextTree());

                }
                stream_statementList.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "repeatStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:219:1: forStatement : FOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( FOR[$IDENT] TO $a $b ( statement )? ) | DOWNTO b= expression DO ( statement )? -> ^( FOR[$IDENT] DOWNTO $a $b ( statement )? ) ) ;
    public final BParser.forStatement_return forStatement() throws RecognitionException {
        BParser.forStatement_return retval = new BParser.forStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR137=null;
        Token IDENT138=null;
        Token ASSIGN139=null;
        Token TO140=null;
        Token DO141=null;
        Token DOWNTO143=null;
        Token DO144=null;
        BParser.expression_return a = null;

        BParser.expression_return b = null;

        BParser.statement_return statement142 = null;

        BParser.statement_return statement145 = null;


        CommonTree FOR137_tree=null;
        CommonTree IDENT138_tree=null;
        CommonTree ASSIGN139_tree=null;
        CommonTree TO140_tree=null;
        CommonTree DO141_tree=null;
        CommonTree DOWNTO143_tree=null;
        CommonTree DO144_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_DOWNTO=new RewriteRuleTokenStream(adaptor,"token DOWNTO");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:220:5: ( FOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( FOR[$IDENT] TO $a $b ( statement )? ) | DOWNTO b= expression DO ( statement )? -> ^( FOR[$IDENT] DOWNTO $a $b ( statement )? ) ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:220:7: FOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( FOR[$IDENT] TO $a $b ( statement )? ) | DOWNTO b= expression DO ( statement )? -> ^( FOR[$IDENT] DOWNTO $a $b ( statement )? ) )
            {
            FOR137=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement1485);  
            stream_FOR.add(FOR137);

            IDENT138=(Token)match(input,IDENT,FOLLOW_IDENT_in_forStatement1487);  
            stream_IDENT.add(IDENT138);

            ASSIGN139=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_forStatement1489);  
            stream_ASSIGN.add(ASSIGN139);

            pushFollow(FOLLOW_expression_in_forStatement1493);
            a=expression();

            state._fsp--;

            stream_expression.add(a.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:220:37: ( TO b= expression DO ( statement )? -> ^( FOR[$IDENT] TO $a $b ( statement )? ) | DOWNTO b= expression DO ( statement )? -> ^( FOR[$IDENT] DOWNTO $a $b ( statement )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==TO) ) {
                alt28=1;
            }
            else if ( (LA28_0==DOWNTO) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:221:8: TO b= expression DO ( statement )?
                    {
                    TO140=(Token)match(input,TO,FOLLOW_TO_in_forStatement1504);  
                    stream_TO.add(TO140);

                    pushFollow(FOLLOW_expression_in_forStatement1512);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());
                    DO141=(Token)match(input,DO,FOLLOW_DO_in_forStatement1514);  
                    stream_DO.add(DO141);

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:221:31: ( statement )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==COBEGIN||LA26_0==COFOR||(LA26_0>=REGION && LA26_0<=AWAIT)||LA26_0==BEGIN||LA26_0==IF||LA26_0==WHILE||LA26_0==REPEAT||LA26_0==FOR||LA26_0==BREAK||LA26_0==IDENT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:221:31: statement
                            {
                            pushFollow(FOLLOW_statement_in_forStatement1516);
                            statement142=statement();

                            state._fsp--;

                            stream_statement.add(statement142.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: TO, statement, b, a, FOR
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:42: -> ^( FOR[$IDENT] TO $a $b ( statement )? )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:221:45: ^( FOR[$IDENT] TO $a $b ( statement )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, IDENT138), root_1);

                        adaptor.addChild(root_1, stream_TO.nextNode());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:221:68: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:222:8: DOWNTO b= expression DO ( statement )?
                    {
                    DOWNTO143=(Token)match(input,DOWNTO,FOLLOW_DOWNTO_in_forStatement1544);  
                    stream_DOWNTO.add(DOWNTO143);

                    pushFollow(FOLLOW_expression_in_forStatement1548);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());
                    DO144=(Token)match(input,DO,FOLLOW_DO_in_forStatement1550);  
                    stream_DO.add(DO144);

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:222:31: ( statement )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COBEGIN||LA27_0==COFOR||(LA27_0>=REGION && LA27_0<=AWAIT)||LA27_0==BEGIN||LA27_0==IF||LA27_0==WHILE||LA27_0==REPEAT||LA27_0==FOR||LA27_0==BREAK||LA27_0==IDENT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:222:31: statement
                            {
                            pushFollow(FOLLOW_statement_in_forStatement1552);
                            statement145=statement();

                            state._fsp--;

                            stream_statement.add(statement145.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: FOR, DOWNTO, b, a, statement
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:42: -> ^( FOR[$IDENT] DOWNTO $a $b ( statement )? )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:222:45: ^( FOR[$IDENT] DOWNTO $a $b ( statement )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, IDENT138), root_1);

                        adaptor.addChild(root_1, stream_DOWNTO.nextNode());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:222:72: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:226:1: breakStatement : BREAK ;
    public final BParser.breakStatement_return breakStatement() throws RecognitionException {
        BParser.breakStatement_return retval = new BParser.breakStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BREAK146=null;

        CommonTree BREAK146_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:227:2: ( BREAK )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:228:2: BREAK
            {
            root_0 = (CommonTree)adaptor.nil();

            BREAK146=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement1601); 
            BREAK146_tree = (CommonTree)adaptor.create(BREAK146);
            adaptor.addChild(root_0, BREAK146_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class coforStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coforStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:231:1: coforStatement : COFOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( COFOR[$IDENT] TO $a $b statement ) | DOWNTO b= expression DO ( statement )? -> ^( COFOR[$IDENT] DOWNTO $a $b statement ) ) ;
    public final BParser.coforStatement_return coforStatement() throws RecognitionException {
        BParser.coforStatement_return retval = new BParser.coforStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COFOR147=null;
        Token IDENT148=null;
        Token ASSIGN149=null;
        Token TO150=null;
        Token DO151=null;
        Token DOWNTO153=null;
        Token DO154=null;
        BParser.expression_return a = null;

        BParser.expression_return b = null;

        BParser.statement_return statement152 = null;

        BParser.statement_return statement155 = null;


        CommonTree COFOR147_tree=null;
        CommonTree IDENT148_tree=null;
        CommonTree ASSIGN149_tree=null;
        CommonTree TO150_tree=null;
        CommonTree DO151_tree=null;
        CommonTree DOWNTO153_tree=null;
        CommonTree DO154_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_COFOR=new RewriteRuleTokenStream(adaptor,"token COFOR");
        RewriteRuleTokenStream stream_DOWNTO=new RewriteRuleTokenStream(adaptor,"token DOWNTO");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:232:5: ( COFOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( COFOR[$IDENT] TO $a $b statement ) | DOWNTO b= expression DO ( statement )? -> ^( COFOR[$IDENT] DOWNTO $a $b statement ) ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:232:7: COFOR IDENT ASSIGN a= expression ( TO b= expression DO ( statement )? -> ^( COFOR[$IDENT] TO $a $b statement ) | DOWNTO b= expression DO ( statement )? -> ^( COFOR[$IDENT] DOWNTO $a $b statement ) )
            {
            COFOR147=(Token)match(input,COFOR,FOLLOW_COFOR_in_coforStatement1623);  
            stream_COFOR.add(COFOR147);

            IDENT148=(Token)match(input,IDENT,FOLLOW_IDENT_in_coforStatement1625);  
            stream_IDENT.add(IDENT148);

            ASSIGN149=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_coforStatement1627);  
            stream_ASSIGN.add(ASSIGN149);

            pushFollow(FOLLOW_expression_in_coforStatement1631);
            a=expression();

            state._fsp--;

            stream_expression.add(a.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:232:39: ( TO b= expression DO ( statement )? -> ^( COFOR[$IDENT] TO $a $b statement ) | DOWNTO b= expression DO ( statement )? -> ^( COFOR[$IDENT] DOWNTO $a $b statement ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==TO) ) {
                alt31=1;
            }
            else if ( (LA31_0==DOWNTO) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:233:8: TO b= expression DO ( statement )?
                    {
                    TO150=(Token)match(input,TO,FOLLOW_TO_in_coforStatement1642);  
                    stream_TO.add(TO150);

                    pushFollow(FOLLOW_expression_in_coforStatement1650);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());
                    DO151=(Token)match(input,DO,FOLLOW_DO_in_coforStatement1652);  
                    stream_DO.add(DO151);

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:233:31: ( statement )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==COBEGIN||LA29_0==COFOR||(LA29_0>=REGION && LA29_0<=AWAIT)||LA29_0==BEGIN||LA29_0==IF||LA29_0==WHILE||LA29_0==REPEAT||LA29_0==FOR||LA29_0==BREAK||LA29_0==IDENT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:233:31: statement
                            {
                            pushFollow(FOLLOW_statement_in_coforStatement1654);
                            statement152=statement();

                            state._fsp--;

                            stream_statement.add(statement152.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: TO, b, COFOR, statement, a
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 233:42: -> ^( COFOR[$IDENT] TO $a $b statement )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:233:45: ^( COFOR[$IDENT] TO $a $b statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COFOR, IDENT148), root_1);

                        adaptor.addChild(root_1, stream_TO.nextNode());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:234:8: DOWNTO b= expression DO ( statement )?
                    {
                    DOWNTO153=(Token)match(input,DOWNTO,FOLLOW_DOWNTO_in_coforStatement1681);  
                    stream_DOWNTO.add(DOWNTO153);

                    pushFollow(FOLLOW_expression_in_coforStatement1685);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());
                    DO154=(Token)match(input,DO,FOLLOW_DO_in_coforStatement1687);  
                    stream_DO.add(DO154);

                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:234:31: ( statement )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==COBEGIN||LA30_0==COFOR||(LA30_0>=REGION && LA30_0<=AWAIT)||LA30_0==BEGIN||LA30_0==IF||LA30_0==WHILE||LA30_0==REPEAT||LA30_0==FOR||LA30_0==BREAK||LA30_0==IDENT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:234:31: statement
                            {
                            pushFollow(FOLLOW_statement_in_coforStatement1689);
                            statement155=statement();

                            state._fsp--;

                            stream_statement.add(statement155.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: COFOR, statement, b, a, DOWNTO
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:42: -> ^( COFOR[$IDENT] DOWNTO $a $b statement )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:234:45: ^( COFOR[$IDENT] DOWNTO $a $b statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COFOR, IDENT148), root_1);

                        adaptor.addChild(root_1, stream_DOWNTO.nextNode());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coforStatement"

    public static class regionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regionStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:238:1: regionStatement : REGION simpleVariable DO statement -> ^( REGION simpleVariable statement ) ;
    public final BParser.regionStatement_return regionStatement() throws RecognitionException {
        BParser.regionStatement_return retval = new BParser.regionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REGION156=null;
        Token DO158=null;
        BParser.simpleVariable_return simpleVariable157 = null;

        BParser.statement_return statement159 = null;


        CommonTree REGION156_tree=null;
        CommonTree DO158_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_REGION=new RewriteRuleTokenStream(adaptor,"token REGION");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_simpleVariable=new RewriteRuleSubtreeStream(adaptor,"rule simpleVariable");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:239:2: ( REGION simpleVariable DO statement -> ^( REGION simpleVariable statement ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:239:4: REGION simpleVariable DO statement
            {
            REGION156=(Token)match(input,REGION,FOLLOW_REGION_in_regionStatement1739);  
            stream_REGION.add(REGION156);

            pushFollow(FOLLOW_simpleVariable_in_regionStatement1741);
            simpleVariable157=simpleVariable();

            state._fsp--;

            stream_simpleVariable.add(simpleVariable157.getTree());
            DO158=(Token)match(input,DO,FOLLOW_DO_in_regionStatement1743);  
            stream_DO.add(DO158);

            pushFollow(FOLLOW_statement_in_regionStatement1745);
            statement159=statement();

            state._fsp--;

            stream_statement.add(statement159.getTree());


            // AST REWRITE
            // elements: REGION, statement, simpleVariable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:39: -> ^( REGION simpleVariable statement )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:239:42: ^( REGION simpleVariable statement )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_REGION.nextNode(), root_1);

                adaptor.addChild(root_1, stream_simpleVariable.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "regionStatement"

    public static class awaitStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "awaitStatement"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:242:1: awaitStatement : AWAIT expression -> ^( AWAIT expression ) ;
    public final BParser.awaitStatement_return awaitStatement() throws RecognitionException {
        BParser.awaitStatement_return retval = new BParser.awaitStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AWAIT160=null;
        BParser.expression_return expression161 = null;


        CommonTree AWAIT160_tree=null;
        RewriteRuleTokenStream stream_AWAIT=new RewriteRuleTokenStream(adaptor,"token AWAIT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:243:2: ( AWAIT expression -> ^( AWAIT expression ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:243:4: AWAIT expression
            {
            AWAIT160=(Token)match(input,AWAIT,FOLLOW_AWAIT_in_awaitStatement1775);  
            stream_AWAIT.add(AWAIT160);

            pushFollow(FOLLOW_expression_in_awaitStatement1777);
            expression161=expression();

            state._fsp--;

            stream_expression.add(expression161.getTree());


            // AST REWRITE
            // elements: expression, AWAIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:21: -> ^( AWAIT expression )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:243:24: ^( AWAIT expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_AWAIT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "awaitStatement"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:249:1: expression : simpleExpression ( ( EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression )* ;
    public final BParser.expression_return expression() throws RecognitionException {
        BParser.expression_return retval = new BParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQUAL163=null;
        Token NOT_EQUAL164=null;
        Token LT165=null;
        Token LE166=null;
        Token GE167=null;
        Token GT168=null;
        BParser.simpleExpression_return simpleExpression162 = null;

        BParser.simpleExpression_return simpleExpression169 = null;


        CommonTree EQUAL163_tree=null;
        CommonTree NOT_EQUAL164_tree=null;
        CommonTree LT165_tree=null;
        CommonTree LE166_tree=null;
        CommonTree GE167_tree=null;
        CommonTree GT168_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:250:5: ( simpleExpression ( ( EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:250:7: simpleExpression ( ( EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression1811);
            simpleExpression162=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleExpression162.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:4: ( ( EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=EQUAL && LA33_0<=GT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:6: ( EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression
            	    {
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:6: ( EQUAL | NOT_EQUAL | LT | LE | GE | GT )
            	    int alt32=6;
            	    switch ( input.LA(1) ) {
            	    case EQUAL:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case LE:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    case GE:
            	        {
            	        alt32=5;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt32=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:7: EQUAL
            	            {
            	            EQUAL163=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expression1819); 
            	            EQUAL163_tree = (CommonTree)adaptor.create(EQUAL163);
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQUAL163_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:16: NOT_EQUAL
            	            {
            	            NOT_EQUAL164=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression1824); 
            	            NOT_EQUAL164_tree = (CommonTree)adaptor.create(NOT_EQUAL164);
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL164_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:29: LT
            	            {
            	            LT165=(Token)match(input,LT,FOLLOW_LT_in_expression1829); 
            	            LT165_tree = (CommonTree)adaptor.create(LT165);
            	            root_0 = (CommonTree)adaptor.becomeRoot(LT165_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:35: LE
            	            {
            	            LE166=(Token)match(input,LE,FOLLOW_LE_in_expression1834); 
            	            LE166_tree = (CommonTree)adaptor.create(LE166);
            	            root_0 = (CommonTree)adaptor.becomeRoot(LE166_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:41: GE
            	            {
            	            GE167=(Token)match(input,GE,FOLLOW_GE_in_expression1839); 
            	            GE167_tree = (CommonTree)adaptor.create(GE167);
            	            root_0 = (CommonTree)adaptor.becomeRoot(GE167_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:251:47: GT
            	            {
            	            GT168=(Token)match(input,GT,FOLLOW_GT_in_expression1844); 
            	            GT168_tree = (CommonTree)adaptor.create(GT168);
            	            root_0 = (CommonTree)adaptor.becomeRoot(GT168_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simpleExpression_in_expression1848);
            	    simpleExpression169=simpleExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, simpleExpression169.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:254:1: simpleExpression : term ( ( PLUS | MINUS | OR | XOR ) term )* ;
    public final BParser.simpleExpression_return simpleExpression() throws RecognitionException {
        BParser.simpleExpression_return retval = new BParser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS171=null;
        Token MINUS172=null;
        Token OR173=null;
        Token XOR174=null;
        BParser.term_return term170 = null;

        BParser.term_return term175 = null;


        CommonTree PLUS171_tree=null;
        CommonTree MINUS172_tree=null;
        CommonTree OR173_tree=null;
        CommonTree XOR174_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:5: ( term ( ( PLUS | MINUS | OR | XOR ) term )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:7: term ( ( PLUS | MINUS | OR | XOR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_simpleExpression1872);
            term170=term();

            state._fsp--;

            adaptor.addChild(root_0, term170.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:12: ( ( PLUS | MINUS | OR | XOR ) term )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=OR && LA35_0<=XOR)||(LA35_0>=PLUS && LA35_0<=MINUS)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:14: ( PLUS | MINUS | OR | XOR ) term
            	    {
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:14: ( PLUS | MINUS | OR | XOR )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case PLUS:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case MINUS:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case OR:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case XOR:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:15: PLUS
            	            {
            	            PLUS171=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1877); 
            	            PLUS171_tree = (CommonTree)adaptor.create(PLUS171);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS171_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:23: MINUS
            	            {
            	            MINUS172=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1882); 
            	            MINUS172_tree = (CommonTree)adaptor.create(MINUS172);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS172_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:32: OR
            	            {
            	            OR173=(Token)match(input,OR,FOLLOW_OR_in_simpleExpression1887); 
            	            OR173_tree = (CommonTree)adaptor.create(OR173);
            	            root_0 = (CommonTree)adaptor.becomeRoot(OR173_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:255:38: XOR
            	            {
            	            XOR174=(Token)match(input,XOR,FOLLOW_XOR_in_simpleExpression1892); 
            	            XOR174_tree = (CommonTree)adaptor.create(XOR174);
            	            root_0 = (CommonTree)adaptor.becomeRoot(XOR174_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression1896);
            	    term175=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term175.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:258:1: term : signedFactor ( ( STAR | SLASH | DIV | MOD | AND ) signedFactor )* ;
    public final BParser.term_return term() throws RecognitionException {
        BParser.term_return retval = new BParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STAR177=null;
        Token SLASH178=null;
        Token DIV179=null;
        Token MOD180=null;
        Token AND181=null;
        BParser.signedFactor_return signedFactor176 = null;

        BParser.signedFactor_return signedFactor182 = null;


        CommonTree STAR177_tree=null;
        CommonTree SLASH178_tree=null;
        CommonTree DIV179_tree=null;
        CommonTree MOD180_tree=null;
        CommonTree AND181_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:258:6: ( signedFactor ( ( STAR | SLASH | DIV | MOD | AND ) signedFactor )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:5: signedFactor ( ( STAR | SLASH | DIV | MOD | AND ) signedFactor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_signedFactor_in_term1923);
            signedFactor176=signedFactor();

            state._fsp--;

            adaptor.addChild(root_0, signedFactor176.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:18: ( ( STAR | SLASH | DIV | MOD | AND ) signedFactor )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AND||(LA37_0>=DIV && LA37_0<=MOD)||(LA37_0>=STAR && LA37_0<=SLASH)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:20: ( STAR | SLASH | DIV | MOD | AND ) signedFactor
            	    {
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:20: ( STAR | SLASH | DIV | MOD | AND )
            	    int alt36=5;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt36=4;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt36=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:21: STAR
            	            {
            	            STAR177=(Token)match(input,STAR,FOLLOW_STAR_in_term1928); 
            	            STAR177_tree = (CommonTree)adaptor.create(STAR177);
            	            root_0 = (CommonTree)adaptor.becomeRoot(STAR177_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:29: SLASH
            	            {
            	            SLASH178=(Token)match(input,SLASH,FOLLOW_SLASH_in_term1933); 
            	            SLASH178_tree = (CommonTree)adaptor.create(SLASH178);
            	            root_0 = (CommonTree)adaptor.becomeRoot(SLASH178_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:38: DIV
            	            {
            	            DIV179=(Token)match(input,DIV,FOLLOW_DIV_in_term1938); 
            	            DIV179_tree = (CommonTree)adaptor.create(DIV179);
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV179_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:45: MOD
            	            {
            	            MOD180=(Token)match(input,MOD,FOLLOW_MOD_in_term1943); 
            	            MOD180_tree = (CommonTree)adaptor.create(MOD180);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD180_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:259:52: AND
            	            {
            	            AND181=(Token)match(input,AND,FOLLOW_AND_in_term1948); 
            	            AND181_tree = (CommonTree)adaptor.create(AND181);
            	            root_0 = (CommonTree)adaptor.becomeRoot(AND181_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_signedFactor_in_term1952);
            	    signedFactor182=signedFactor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, signedFactor182.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class signedFactor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signedFactor"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:262:1: signedFactor : ( factor | PLUS factor -> factor | MINUS factor -> ^( UNARY_MINUS[$MINUS] factor ) );
    public final BParser.signedFactor_return signedFactor() throws RecognitionException {
        BParser.signedFactor_return retval = new BParser.signedFactor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS184=null;
        Token MINUS186=null;
        BParser.factor_return factor183 = null;

        BParser.factor_return factor185 = null;

        BParser.factor_return factor187 = null;


        CommonTree PLUS184_tree=null;
        CommonTree MINUS186_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:263:5: ( factor | PLUS factor -> factor | MINUS factor -> ^( UNARY_MINUS[$MINUS] factor ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
            case NOT:
            case LPAREN:
            case IDENT:
            case STRING_LITERAL:
            case HEX_INT:
            case NUM_INT:
            case NUM_REAL:
                {
                alt38=1;
                }
                break;
            case PLUS:
                {
                alt38=2;
                }
                break;
            case MINUS:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:263:7: factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_factor_in_signedFactor1986);
                    factor183=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor183.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:264:7: PLUS factor
                    {
                    PLUS184=(Token)match(input,PLUS,FOLLOW_PLUS_in_signedFactor1994);  
                    stream_PLUS.add(PLUS184);

                    pushFollow(FOLLOW_factor_in_signedFactor1996);
                    factor185=factor();

                    state._fsp--;

                    stream_factor.add(factor185.getTree());


                    // AST REWRITE
                    // elements: factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 264:19: -> factor
                    {
                        adaptor.addChild(root_0, stream_factor.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:265:7: MINUS factor
                    {
                    MINUS186=(Token)match(input,MINUS,FOLLOW_MINUS_in_signedFactor2008);  
                    stream_MINUS.add(MINUS186);

                    pushFollow(FOLLOW_factor_in_signedFactor2010);
                    factor187=factor();

                    state._fsp--;

                    stream_factor.add(factor187.getTree());


                    // AST REWRITE
                    // elements: factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 265:20: -> ^( UNARY_MINUS[$MINUS] factor )
                    {
                        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:265:23: ^( UNARY_MINUS[$MINUS] factor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_MINUS, MINUS186), root_1);

                        adaptor.addChild(root_1, stream_factor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signedFactor"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:268:1: factor : ( variable | LPAREN expression RPAREN | functionCall | literal | NOT factor );
    public final BParser.factor_return factor() throws RecognitionException {
        BParser.factor_return retval = new BParser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN189=null;
        Token RPAREN191=null;
        Token NOT194=null;
        BParser.variable_return variable188 = null;

        BParser.expression_return expression190 = null;

        BParser.functionCall_return functionCall192 = null;

        BParser.literal_return literal193 = null;

        BParser.factor_return factor195 = null;


        CommonTree LPAREN189_tree=null;
        CommonTree RPAREN191_tree=null;
        CommonTree NOT194_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:269:5: ( variable | LPAREN expression RPAREN | functionCall | literal | NOT factor )
            int alt39=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==LPAREN) ) {
                    alt39=3;
                }
                else if ( (LA39_1==COEND||LA39_1==END||(LA39_1>=THEN && LA39_1<=ELSE)||LA39_1==DO||LA39_1==UNTIL||(LA39_1>=TO && LA39_1<=DOWNTO)||(LA39_1>=AND && LA39_1<=XOR)||(LA39_1>=DIV && LA39_1<=SLASH)||(LA39_1>=COMMA && LA39_1<=SEMI)||(LA39_1>=DOTDOT && LA39_1<=GT)||(LA39_1>=RPAREN && LA39_1<=RBRACK)) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
                {
                alt39=2;
                }
                break;
            case TRUE:
            case FALSE:
            case STRING_LITERAL:
            case HEX_INT:
            case NUM_INT:
            case NUM_REAL:
                {
                alt39=4;
                }
                break;
            case NOT:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:269:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_factor2048);
                    variable188=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable188.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:270:7: LPAREN expression RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LPAREN189=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor2056); 
                    pushFollow(FOLLOW_expression_in_factor2059);
                    expression190=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression190.getTree());
                    RPAREN191=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor2061); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:271:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_factor2070);
                    functionCall192=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall192.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:272:7: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_factor2078);
                    literal193=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal193.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:273:7: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT194=(Token)match(input,NOT,FOLLOW_NOT_in_factor2086); 
                    NOT194_tree = (CommonTree)adaptor.create(NOT194);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT194_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor2089);
                    factor195=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor195.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:276:1: literal : ( HEX_INT | NUM_INT | NUM_REAL | STRING_LITERAL | TRUE | FALSE );
    public final BParser.literal_return literal() throws RecognitionException {
        BParser.literal_return retval = new BParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set196=null;

        CommonTree set196_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:277:5: ( HEX_INT | NUM_INT | NUM_REAL | STRING_LITERAL | TRUE | FALSE )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set196=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE)||input.LA(1)==STRING_LITERAL||input.LA(1)==HEX_INT||input.LA(1)==NUM_INT||input.LA(1)==NUM_REAL ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set196));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:285:1: functionCall : IDENT LPAREN ( expressionList )? RPAREN -> ^( CALL[$IDENT] ( expressionList )? ) ;
    public final BParser.functionCall_return functionCall() throws RecognitionException {
        BParser.functionCall_return retval = new BParser.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT197=null;
        Token LPAREN198=null;
        Token RPAREN200=null;
        BParser.expressionList_return expressionList199 = null;


        CommonTree IDENT197_tree=null;
        CommonTree LPAREN198_tree=null;
        CommonTree RPAREN200_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:5: ( IDENT LPAREN ( expressionList )? RPAREN -> ^( CALL[$IDENT] ( expressionList )? ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:7: IDENT LPAREN ( expressionList )? RPAREN
            {
            IDENT197=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionCall2166);  
            stream_IDENT.add(IDENT197);

            LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionCall2168);  
            stream_LPAREN.add(LPAREN198);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:20: ( expressionList )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=TRUE && LA40_0<=FALSE)||LA40_0==NOT||(LA40_0>=PLUS && LA40_0<=MINUS)||LA40_0==LPAREN||(LA40_0>=IDENT && LA40_0<=STRING_LITERAL)||LA40_0==HEX_INT||LA40_0==NUM_INT||LA40_0==NUM_REAL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:20: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_functionCall2170);
                    expressionList199=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList199.getTree());

                    }
                    break;

            }

            RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionCall2173);  
            stream_RPAREN.add(RPAREN200);



            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 286:43: -> ^( CALL[$IDENT] ( expressionList )? )
            {
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:46: ^( CALL[$IDENT] ( expressionList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, IDENT197), root_1);

                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:286:61: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:290:1: expressionList : expression ( COMMA expression )* ;
    public final BParser.expressionList_return expressionList() throws RecognitionException {
        BParser.expressionList_return retval = new BParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA202=null;
        BParser.expression_return expression201 = null;

        BParser.expression_return expression203 = null;


        CommonTree COMMA202_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:291:5: ( expression ( COMMA expression )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:291:7: expression ( COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList2201);
            expression201=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression201.getTree());
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:291:18: ( COMMA expression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:291:20: COMMA expression
            	    {
            	    COMMA202=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList2205); 
            	    pushFollow(FOLLOW_expression_in_expressionList2208);
            	    expression203=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression203.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class simpleVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleVariable"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:294:1: simpleVariable : IDENT ;
    public final BParser.simpleVariable_return simpleVariable() throws RecognitionException {
        BParser.simpleVariable_return retval = new BParser.simpleVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT204=null;

        CommonTree IDENT204_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:295:2: ( IDENT )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:295:4: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT204=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleVariable2236); 
            IDENT204_tree = (CommonTree)adaptor.create(IDENT204);
            adaptor.addChild(root_0, IDENT204_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleVariable"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:297:1: variable : IDENT ( variableSuffix )* ;
    public final BParser.variable_return variable() throws RecognitionException {
        BParser.variable_return retval = new BParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT205=null;
        BParser.variableSuffix_return variableSuffix206 = null;


        CommonTree IDENT205_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:297:9: ( IDENT ( variableSuffix )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:298:2: IDENT ( variableSuffix )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT205=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable2252); 
            IDENT205_tree = (CommonTree)adaptor.create(IDENT205);
            root_0 = (CommonTree)adaptor.becomeRoot(IDENT205_tree, root_0);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:298:9: ( variableSuffix )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==DOT||LA42_0==LBRACK) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:298:9: variableSuffix
            	    {
            	    pushFollow(FOLLOW_variableSuffix_in_variable2255);
            	    variableSuffix206=variableSuffix();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variableSuffix206.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class variableSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableSuffix"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:301:1: variableSuffix : ( arrayField | recordField );
    public final BParser.variableSuffix_return variableSuffix() throws RecognitionException {
        BParser.variableSuffix_return retval = new BParser.variableSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BParser.arrayField_return arrayField207 = null;

        BParser.recordField_return recordField208 = null;



        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:302:2: ( arrayField | recordField )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LBRACK) ) {
                alt43=1;
            }
            else if ( (LA43_0==DOT) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:302:4: arrayField
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayField_in_variableSuffix2281);
                    arrayField207=arrayField();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayField207.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:303:4: recordField
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordField_in_variableSuffix2286);
                    recordField208=recordField();

                    state._fsp--;

                    adaptor.addChild(root_0, recordField208.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableSuffix"

    public static class arrayField_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayField"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:306:1: arrayField : LBRACK expression RBRACK ;
    public final BParser.arrayField_return arrayField() throws RecognitionException {
        BParser.arrayField_return retval = new BParser.arrayField_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACK209=null;
        Token RBRACK211=null;
        BParser.expression_return expression210 = null;


        CommonTree LBRACK209_tree=null;
        CommonTree RBRACK211_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:307:2: ( LBRACK expression RBRACK )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:307:4: LBRACK expression RBRACK
            {
            root_0 = (CommonTree)adaptor.nil();

            LBRACK209=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayField2301); 
            LBRACK209_tree = (CommonTree)adaptor.create(LBRACK209);
            root_0 = (CommonTree)adaptor.becomeRoot(LBRACK209_tree, root_0);

            pushFollow(FOLLOW_expression_in_arrayField2304);
            expression210=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression210.getTree());
            RBRACK211=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayField2306); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayField"

    public static class recordField_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordField"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:310:1: recordField : DOT IDENT ;
    public final BParser.recordField_return recordField() throws RecognitionException {
        BParser.recordField_return retval = new BParser.recordField_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT212=null;
        Token IDENT213=null;

        CommonTree DOT212_tree=null;
        CommonTree IDENT213_tree=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:311:2: ( DOT IDENT )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\BParser.g:311:4: DOT IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT212=(Token)match(input,DOT,FOLLOW_DOT_in_recordField2318); 
            DOT212_tree = (CommonTree)adaptor.create(DOT212);
            root_0 = (CommonTree)adaptor.becomeRoot(DOT212_tree, root_0);

            IDENT213=(Token)match(input,IDENT,FOLLOW_IDENT_in_recordField2321); 
            IDENT213_tree = (CommonTree)adaptor.create(IDENT213);
            adaptor.addChild(root_0, IDENT213_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordField"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\1\106\1\61\1\106\1\4\1\61\2\uffff";
    static final String DFA4_maxS =
        "\1\106\1\63\1\106\1\115\1\63\2\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3",
            "\1\4",
            "\1\5\3\uffff\1\6\6\uffff\4\6\1\uffff\3\6\22\uffff\1\6\2\uffff"+
            "\2\6\16\uffff\1\6\11\uffff\2\6\1\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\1\6",
            "\1\2\1\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "57:1: variableDeclaration : (id= identifierList COLON t= type -> ^( INSTANCE[$COLON] $id $t) | id= identifierList COLON SHARED t= type -> ^( SHARED $id $t) );";
        }
    }
    static final String DFA18_eotS =
        "\16\uffff";
    static final String DFA18_eofS =
        "\16\uffff";
    static final String DFA18_minS =
        "\1\5\2\uffff\1\6\12\uffff";
    static final String DFA18_maxS =
        "\1\106\2\uffff\1\76\12\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\3\1\4";
    static final String DFA18_specialS =
        "\16\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\1\11\1\uffff\1\12\1\13\16\uffff\1\1\1\uffff\1"+
            "\4\2\uffff\1\5\1\uffff\1\6\1\uffff\1\7\2\uffff\1\10\40\uffff"+
            "\1\3",
            "",
            "",
            "\1\15\23\uffff\1\15\2\uffff\1\15\3\uffff\1\15\16\uffff\1\14"+
            "\1\uffff\1\15\2\uffff\1\14\6\uffff\1\15\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "170:1: statement : ( compoundStatement | cobeginStatement | assignmentStatement | callStatement | ifStatement | whileStatement | repeatStatement | forStatement | breakStatement | coforStatement | regionStatement | awaitStatement );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_program109 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_program111 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_global_block_in_program113 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_mainBody_in_program116 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_DOT_in_program118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarations_in_global_block141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclarations_in_global_block152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_global_block163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_global_block174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_global_block185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_mainBody206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableDeclarations230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarations232 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_variableDeclarations236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarations238 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_variableDeclarations243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_variableDeclaration274 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration276 = new BitSet(new long[]{0x1000320000778100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_type_in_variableDeclaration282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_variableDeclaration307 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SHARED_in_variableDeclaration311 = new BitSet(new long[]{0x1000320000778100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_type_in_variableDeclaration317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifierList357 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_COMMA_in_identifierList361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_identifierList363 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration395 = new BitSet(new long[]{0x1004000000000000L});
    public static final BitSet FOLLOW_formalParameterList_in_procedureDeclaration397 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedureDeclaration399 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_localParamaterList_in_procedureDeclaration401 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_body_in_procedureDeclaration403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_functionDeclaration447 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration449 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_functionDeclaration451 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_typeIdentifier_in_functionDeclaration453 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_functionDeclaration455 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_localParamaterList_in_functionDeclaration457 = new BitSet(new long[]{0x0000000003807000L});
    public static final BitSet FOLLOW_body_in_functionDeclaration459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList512 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList526 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameterSection_in_formalParameterList530 = new BitSet(new long[]{0x2004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_formalParameterList534 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameterSection_in_formalParameterList538 = new BitSet(new long[]{0x2004000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_formalParameterSection603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parameterGroup_in_formalParameterSection605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_parameterGroup638 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_parameterGroup640 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_typeIdentifier_in_parameterGroup643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarations_in_localParamaterList668 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclarations696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeDeclaration_in_typeDeclarations699 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_typeDeclarations703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeDeclaration_in_typeDeclarations706 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_typeDeclarations711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration729 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_typeDeclaration731 = new BitSet(new long[]{0x1000320000778100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_type_in_typeDeclaration733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantDeclarations760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_constantDefinition_in_constantDeclarations763 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_constantDeclarations767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_constantDefinition_in_constantDeclarations770 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_constantDeclarations775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constantDefinition793 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_constantDefinition795 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_constantDefinition797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeIdentifier_in_type827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_typeIdentifier863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_typeIdentifier872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_typeIdentifier881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMAPHORE_in_typeIdentifier890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeIdentifier899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subrangeType_in_typeIdentifier914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_subrangeType939 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_subrangeType941 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_subrangeType944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType971 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_arrayType974 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_typeIdentifier_in_arrayType977 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayType979 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OF_in_arrayType982 = new BitSet(new long[]{0x1000320000778100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_type_in_arrayType985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_fieldDeclaration_in_recordType1002 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_SEMI_in_recordType1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_fieldDeclaration_in_recordType1009 = new BitSet(new long[]{0x0004000004000000L});
    public static final BitSet FOLLOW_SEMI_in_recordType1014 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_END_in_recordType1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_fieldDeclaration1037 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_fieldDeclaration1039 = new BitSet(new long[]{0x1000320000778100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_body1061 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_in_body1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList1079 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statementList1083 = new BitSet(new long[]{0x000400254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_statementList1086 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_statement1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cobeginStatement_in_statement1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callStatement_in_statement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatStatement_in_statement1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coforStatement_in_statement1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regionStatement_in_statement1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_awaitStatement_in_statement1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundStatement1229 = new BitSet(new long[]{0x000000254F8076A0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statementList_in_compoundStatement1234 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_END_in_compoundStatement1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COBEGIN_in_cobeginStatement1265 = new BitSet(new long[]{0x000000254B8076E0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statementList_in_cobeginStatement1270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COEND_in_cobeginStatement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignmentStatement1301 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentStatement1303 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_callStatement1331 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_callStatement1335 = new BitSet(new long[]{0x3000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expressionList_in_callStatement1337 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_callStatement1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1375 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_ifStatement1378 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1380 = new BitSet(new long[]{0x000000254B8076A0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_ifStatement1383 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1393 = new BitSet(new long[]{0x000000254B8076A0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_ifStatement1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1420 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_whileStatement1423 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1425 = new BitSet(new long[]{0x000000254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_whileStatement1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeatStatement1446 = new BitSet(new long[]{0x000000274B8076A0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statementList_in_repeatStatement1448 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_UNTIL_in_repeatStatement1451 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_repeatStatement1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_forStatement1487 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_forStatement1489 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1493 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_TO_in_forStatement1504 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1512 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_forStatement1514 = new BitSet(new long[]{0x000000254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_forStatement1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOWNTO_in_forStatement1544 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_forStatement1548 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_forStatement1550 = new BitSet(new long[]{0x000000254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_forStatement1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COFOR_in_coforStatement1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_coforStatement1625 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_coforStatement1627 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1631 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_TO_in_coforStatement1642 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1650 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_coforStatement1652 = new BitSet(new long[]{0x000000254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_coforStatement1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOWNTO_in_coforStatement1681 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_coforStatement1685 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_coforStatement1687 = new BitSet(new long[]{0x000000254B8076A2L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_coforStatement1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGION_in_regionStatement1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_simpleVariable_in_regionStatement1741 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DO_in_regionStatement1743 = new BitSet(new long[]{0x000000254B8076A0L,0x0000000000000040L});
    public static final BitSet FOLLOW_statement_in_regionStatement1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AWAIT_in_awaitStatement1775 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_awaitStatement1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1811 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1819 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expression1824 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_LT_in_expression1829 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_LE_in_expression1834 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_GE_in_expression1839 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_GT_in_expression1844 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1848 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1872 = new BitSet(new long[]{0x0000318000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1877 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1882 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1887 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_XOR_in_simpleExpression1892 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_term_in_simpleExpression1896 = new BitSet(new long[]{0x0000318000000002L});
    public static final BitSet FOLLOW_signedFactor_in_term1923 = new BitSet(new long[]{0x0000CC4000000002L});
    public static final BitSet FOLLOW_STAR_in_term1928 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_SLASH_in_term1933 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_DIV_in_term1938 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_MOD_in_term1943 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_AND_in_term1948 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_signedFactor_in_term1952 = new BitSet(new long[]{0x0000CC4000000002L});
    public static final BitSet FOLLOW_factor_in_signedFactor1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_signedFactor1994 = new BitSet(new long[]{0x1000020000600000L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_factor_in_signedFactor1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_signedFactor2008 = new BitSet(new long[]{0x1000020000600000L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_factor_in_signedFactor2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factor2056 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_factor2059 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_factor2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_factor2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor2086 = new BitSet(new long[]{0x1000020000600000L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_factor_in_factor2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionCall2166 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionCall2168 = new BitSet(new long[]{0x3000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expressionList_in_functionCall2170 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionCall2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2201 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList2205 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_expressionList2208 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleVariable2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable2252 = new BitSet(new long[]{0x4020000000000002L});
    public static final BitSet FOLLOW_variableSuffix_in_variable2255 = new BitSet(new long[]{0x4020000000000002L});
    public static final BitSet FOLLOW_arrayField_in_variableSuffix2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordField_in_variableSuffix2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayField2301 = new BitSet(new long[]{0x1000320000638100L,0x0000000000002AC0L});
    public static final BitSet FOLLOW_expression_in_arrayField2304 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayField2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_recordField2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENT_in_recordField2321 = new BitSet(new long[]{0x0000000000000002L});

}
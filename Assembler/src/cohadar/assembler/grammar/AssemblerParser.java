// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g 2011-07-20 20:52:19

package cohadar.assembler.grammar;
import cohadar.assembler.code.TextParam;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "CODE", "SHARED", "INSTANCE", "INSTRUCTION0", "INSTRUCTION1", "LID", "COLON", "LB", "RB", "LC", "RC", "ID", "COMMA", "SID", "FLOAT", "STRING", "TRUE", "FALSE", "INT", "HEX", "LETTER", "FUNC", "DIGIT", "HEX_DIGIT", "WS", "COMMENT", "RAW_STRING"
    };
    public static final int EOF=-1;
    public static final int NEWLINE=4;
    public static final int CODE=5;
    public static final int SHARED=6;
    public static final int INSTANCE=7;
    public static final int INSTRUCTION0=8;
    public static final int INSTRUCTION1=9;
    public static final int LID=10;
    public static final int COLON=11;
    public static final int LB=12;
    public static final int RB=13;
    public static final int LC=14;
    public static final int RC=15;
    public static final int ID=16;
    public static final int COMMA=17;
    public static final int SID=18;
    public static final int FLOAT=19;
    public static final int STRING=20;
    public static final int TRUE=21;
    public static final int FALSE=22;
    public static final int INT=23;
    public static final int HEX=24;
    public static final int LETTER=25;
    public static final int FUNC=26;
    public static final int DIGIT=27;
    public static final int HEX_DIGIT=28;
    public static final int WS=29;
    public static final int COMMENT=30;
    public static final int RAW_STRING=31;

    // delegates
    // delegators


        public AssemblerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public AssemblerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return AssemblerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g"; }


    	private IParserPolicy policy;



    // $ANTLR start "program"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:22:1: program[IParserPolicy p] : ( line )* EOF ;
    public final void program(IParserPolicy p) throws RecognitionException {

        	this.policy = p;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:26:5: ( ( line )* EOF )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:26:9: ( line )* EOF
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:26:9: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=LID)||LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:26:9: line
            	    {
            	    pushFollow(FOLLOW_line_in_program48);
            	    line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_program51); 

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


    // $ANTLR start "line"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:29:1: line : ( NEWLINE | segmentType NEWLINE | instruction NEWLINE | label NEWLINE | function NEWLINE | variable NEWLINE );
    public final void line() throws RecognitionException {
        AssemblerParser.segmentType_return segmentType1 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:29:6: ( NEWLINE | segmentType NEWLINE | instruction NEWLINE | label NEWLINE | function NEWLINE | variable NEWLINE )
            int alt2=6;
            switch ( input.LA(1) ) {
            case NEWLINE:
                {
                alt2=1;
                }
                break;
            case CODE:
            case SHARED:
            case INSTANCE:
                {
                alt2=2;
                }
                break;
            case INSTRUCTION0:
            case INSTRUCTION1:
                {
                alt2=3;
                }
                break;
            case LID:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==LB) ) {
                    alt2=5;
                }
                else if ( (LA2_4==NEWLINE||LA2_4==COLON) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:29:8: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line68); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:30:4: segmentType NEWLINE
                    {
                    pushFollow(FOLLOW_segmentType_in_line73);
                    segmentType1=segmentType();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line75); 
                     policy.startSegment((segmentType1!=null?((Token)segmentType1.start):null)); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:31:4: instruction NEWLINE
                    {
                    pushFollow(FOLLOW_instruction_in_line82);
                    instruction();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line84); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:32:4: label NEWLINE
                    {
                    pushFollow(FOLLOW_label_in_line90);
                    label();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line92); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:33:4: function NEWLINE
                    {
                    pushFollow(FOLLOW_function_in_line99);
                    function();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line101); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:34:4: variable NEWLINE
                    {
                    pushFollow(FOLLOW_variable_in_line106);
                    variable();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_line108); 

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
    // $ANTLR end "line"

    public static class segmentType_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "segmentType"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:37:1: segmentType : ( CODE | SHARED | INSTANCE ) ;
    public final AssemblerParser.segmentType_return segmentType() throws RecognitionException {
        AssemblerParser.segmentType_return retval = new AssemblerParser.segmentType_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:37:13: ( ( CODE | SHARED | INSTANCE ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:37:15: ( CODE | SHARED | INSTANCE )
            {
            if ( (input.LA(1)>=CODE && input.LA(1)<=INSTANCE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "segmentType"


    // $ANTLR start "instruction"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:40:1: instruction returns [Token op] : ( INSTRUCTION0 ( operand )? | INSTRUCTION1 ( operand )? );
    public final Token instruction() throws RecognitionException {
        Token op = null;

        Token INSTRUCTION02=null;
        Token INSTRUCTION14=null;
        AssemblerParser.operand_return operand3 = null;

        AssemblerParser.operand_return operand5 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:41:2: ( INSTRUCTION0 ( operand )? | INSTRUCTION1 ( operand )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INSTRUCTION0) ) {
                alt5=1;
            }
            else if ( (LA5_0==INSTRUCTION1) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:41:4: INSTRUCTION0 ( operand )?
                    {
                    INSTRUCTION02=(Token)match(input,INSTRUCTION0,FOLLOW_INSTRUCTION0_in_instruction151); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:41:17: ( operand )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==LID||LA3_0==ID||(LA3_0>=SID && LA3_0<=HEX)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:41:17: operand
                            {
                            pushFollow(FOLLOW_operand_in_instruction153);
                            operand3=operand();

                            state._fsp--;


                            }
                            break;

                    }

                     policy.instruction0(INSTRUCTION02, (operand3!=null?((Token)operand3.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:42:4: INSTRUCTION1 ( operand )?
                    {
                    INSTRUCTION14=(Token)match(input,INSTRUCTION1,FOLLOW_INSTRUCTION1_in_instruction161); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:42:17: ( operand )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==LID||LA4_0==ID||(LA4_0>=SID && LA4_0<=HEX)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:42:17: operand
                            {
                            pushFollow(FOLLOW_operand_in_instruction163);
                            operand5=operand();

                            state._fsp--;


                            }
                            break;

                    }

                     policy.instruction1(INSTRUCTION14, (operand5!=null?((Token)operand5.start):null)); 

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
        return op;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "label"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:46:1: label : LID ( COLON )? ;
    public final void label() throws RecognitionException {
        Token LID6=null;
        Token COLON7=null;

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:47:5: ( LID ( COLON )? )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:47:9: LID ( COLON )?
            {
            LID6=(Token)match(input,LID,FOLLOW_LID_in_label189); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:47:13: ( COLON )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:47:13: COLON
                    {
                    COLON7=(Token)match(input,COLON,FOLLOW_COLON_in_label191); 

                    }
                    break;

            }

             policy.label(LID6, COLON7); 

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
    // $ANTLR end "label"


    // $ANTLR start "function"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:51:1: function : ( LID LB arguments RB COLON ( integer )? | LID LB arguments RB LC locals RC COLON ( integer )? );
    public final void function() throws RecognitionException {
        Token LID8=null;
        Token LID11=null;
        List<TextParam> arguments9 = null;

        AssemblerParser.integer_return integer10 = null;

        List<TextParam> arguments12 = null;

        List<TextParam> locals13 = null;

        AssemblerParser.integer_return integer14 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:52:6: ( LID LB arguments RB COLON ( integer )? | LID LB arguments RB LC locals RC COLON ( integer )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:52:10: LID LB arguments RB COLON ( integer )?
                    {
                    LID8=(Token)match(input,LID,FOLLOW_LID_in_function216); 
                    match(input,LB,FOLLOW_LB_in_function218); 
                    pushFollow(FOLLOW_arguments_in_function220);
                    arguments9=arguments();

                    state._fsp--;

                    match(input,RB,FOLLOW_RB_in_function222); 
                    match(input,COLON,FOLLOW_COLON_in_function224); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:52:36: ( integer )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=INT && LA7_0<=HEX)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:52:36: integer
                            {
                            pushFollow(FOLLOW_integer_in_function226);
                            integer10=integer();

                            state._fsp--;


                            }
                            break;

                    }

                     policy.function(LID8, arguments9, null, (integer10!=null?((Token)integer10.start):null)); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:53:11: LID LB arguments RB LC locals RC COLON ( integer )?
                    {
                    LID11=(Token)match(input,LID,FOLLOW_LID_in_function244); 
                    match(input,LB,FOLLOW_LB_in_function246); 
                    pushFollow(FOLLOW_arguments_in_function248);
                    arguments12=arguments();

                    state._fsp--;

                    match(input,RB,FOLLOW_RB_in_function250); 
                    match(input,LC,FOLLOW_LC_in_function252); 
                    pushFollow(FOLLOW_locals_in_function254);
                    locals13=locals();

                    state._fsp--;

                    match(input,RC,FOLLOW_RC_in_function256); 
                    match(input,COLON,FOLLOW_COLON_in_function258); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:53:50: ( integer )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=INT && LA8_0<=HEX)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:53:50: integer
                            {
                            pushFollow(FOLLOW_integer_in_function260);
                            integer14=integer();

                            state._fsp--;


                            }
                            break;

                    }

                     policy.function(LID11, arguments12, locals13, (integer14!=null?((Token)integer14.start):null)); 

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
    // $ANTLR end "function"


    // $ANTLR start "variable"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:57:1: variable : ID COLON integer ;
    public final void variable() throws RecognitionException {
        Token ID15=null;
        AssemblerParser.integer_return integer16 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:57:9: ( ID COLON integer )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:58:3: ID COLON integer
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_variable285); 
            match(input,COLON,FOLLOW_COLON_in_variable287); 
            pushFollow(FOLLOW_integer_in_variable289);
            integer16=integer();

            state._fsp--;

             policy.variable(ID15, (integer16!=null?((Token)integer16.start):null)); 

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
    // $ANTLR end "variable"


    // $ANTLR start "param"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:62:1: param returns [TextParam ret] : ( ID | ID COLON integer );
    public final TextParam param() throws RecognitionException {
        TextParam ret = null;

        Token ID17=null;
        Token ID18=null;
        AssemblerParser.integer_return integer19 = null;


        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:63:2: ( ID | ID COLON integer )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==COLON) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RB||LA10_1==RC||LA10_1==COMMA) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:63:4: ID
                    {
                    ID17=(Token)match(input,ID,FOLLOW_ID_in_param313); 
                     ret = policy.param(ID17, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:64:4: ID COLON integer
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_param320); 
                    match(input,COLON,FOLLOW_COLON_in_param322); 
                    pushFollow(FOLLOW_integer_in_param324);
                    integer19=integer();

                    state._fsp--;

                     ret = policy.param(ID18, (integer19!=null?((Token)integer19.start):null)); 

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
        return ret;
    }
    // $ANTLR end "param"


    // $ANTLR start "arguments"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:67:1: arguments returns [List<TextParam> argList] : ( | a= param ( COMMA b= param )* );
    public final List<TextParam> arguments() throws RecognitionException {
        List<TextParam> argList = null;

        TextParam a = null;

        TextParam b = null;



        	argList = new ArrayList<TextParam>();

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:71:2: ( | a= param ( COMMA b= param )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RB) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:72:2: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:72:4: a= param ( COMMA b= param )*
                    {
                    pushFollow(FOLLOW_param_in_arguments354);
                    a=param();

                    state._fsp--;

                     argList.add(a); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:72:38: ( COMMA b= param )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:72:39: COMMA b= param
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments360); 
                    	    pushFollow(FOLLOW_param_in_arguments364);
                    	    b=param();

                    	    state._fsp--;

                    	     argList.add(b); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


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
        return argList;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "locals"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:76:1: locals returns [List<TextParam> argList] : ( | a= param ( COMMA b= param )* );
    public final List<TextParam> locals() throws RecognitionException {
        List<TextParam> argList = null;

        TextParam a = null;

        TextParam b = null;



        	argList = new ArrayList<TextParam>();

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:80:2: ( | a= param ( COMMA b= param )* )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RC) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:81:2: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:81:4: a= param ( COMMA b= param )*
                    {
                    pushFollow(FOLLOW_param_in_locals400);
                    a=param();

                    state._fsp--;

                     argList.add(a); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:81:38: ( COMMA b= param )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:81:39: COMMA b= param
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_locals406); 
                    	    pushFollow(FOLLOW_param_in_locals410);
                    	    b=param();

                    	    state._fsp--;

                    	     argList.add(b); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
        return argList;
    }
    // $ANTLR end "locals"

    public static class operand_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "operand"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:84:1: operand : ( ID | LID | SID | constant );
    public final AssemblerParser.operand_return operand() throws RecognitionException {
        AssemblerParser.operand_return retval = new AssemblerParser.operand_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:85:5: ( ID | LID | SID | constant )
            int alt15=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt15=1;
                }
                break;
            case LID:
                {
                alt15=2;
                }
                break;
            case SID:
                {
                alt15=3;
                }
                break;
            case FLOAT:
            case STRING:
            case TRUE:
            case FALSE:
            case INT:
            case HEX:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:85:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_operand435); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:86:9: LID
                    {
                    match(input,LID,FOLLOW_LID_in_operand448); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:87:9: SID
                    {
                    match(input,SID,FOLLOW_SID_in_operand460); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:88:9: constant
                    {
                    pushFollow(FOLLOW_constant_in_operand472);
                    constant();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operand"


    // $ANTLR start "constant"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:91:1: constant : ( integer | FLOAT | STRING | TRUE | FALSE );
    public final void constant() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:92:2: ( integer | FLOAT | STRING | TRUE | FALSE )
            int alt16=5;
            switch ( input.LA(1) ) {
            case INT:
            case HEX:
                {
                alt16=1;
                }
                break;
            case FLOAT:
                {
                alt16=2;
                }
                break;
            case STRING:
                {
                alt16=3;
                }
                break;
            case TRUE:
                {
                alt16=4;
                }
                break;
            case FALSE:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:92:4: integer
                    {
                    pushFollow(FOLLOW_integer_in_constant487);
                    integer();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:93:4: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant492); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:94:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant497); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:95:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_constant502); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:96:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_constant508); 

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
    // $ANTLR end "constant"

    public static class integer_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "integer"
    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:99:1: integer : ( INT | HEX );
    public final AssemblerParser.integer_return integer() throws RecognitionException {
        AssemblerParser.integer_return retval = new AssemblerParser.integer_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:99:9: ( INT | HEX )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            {
            if ( (input.LA(1)>=INT && input.LA(1)<=HEX) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\1\12\1\14\1\15\2\13\2\uffff\1\27\1\20\1\15\1\13\1\27\1\15";
    static final String DFA9_maxS =
        "\1\12\1\14\1\20\1\16\1\21\2\uffff\1\30\1\20\2\21\1\30\1\21";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\1\2\6\uffff";
    static final String DFA9_specialS =
        "\15\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\2\uffff\1\4",
            "\1\5\2\uffff\1\6",
            "\1\7\1\uffff\1\3\3\uffff\1\10",
            "",
            "",
            "\2\11",
            "\1\12",
            "\1\3\3\uffff\1\10",
            "\1\13\1\uffff\1\3\3\uffff\1\10",
            "\2\14",
            "\1\3\3\uffff\1\10"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "51:1: function : ( LID LB arguments RB COLON ( integer )? | LID LB arguments RB LC locals RC COLON ( integer )? );";
        }
    }
 

    public static final BitSet FOLLOW_line_in_program48 = new BitSet(new long[]{0x00000000000107F0L});
    public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_segmentType_in_line73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_line75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_line82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_line84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_line90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_line92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_line99 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_line101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_line106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_line108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_segmentType121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION0_in_instruction151 = new BitSet(new long[]{0x0000000001FD0402L});
    public static final BitSet FOLLOW_operand_in_instruction153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION1_in_instruction161 = new BitSet(new long[]{0x0000000001FD0402L});
    public static final BitSet FOLLOW_operand_in_instruction163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LID_in_label189 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COLON_in_label191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LID_in_function216 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LB_in_function218 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_arguments_in_function220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RB_in_function222 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_function224 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_integer_in_function226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LID_in_function244 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LB_in_function246 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_arguments_in_function248 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RB_in_function250 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LC_in_function252 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_locals_in_function254 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RC_in_function256 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_function258 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_integer_in_function260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable285 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_variable287 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_integer_in_variable289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param320 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_param322 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_integer_in_param324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_arguments354 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_arguments360 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_param_in_arguments364 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_param_in_locals400 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_locals406 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_param_in_locals410 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_operand435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LID_in_operand448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SID_in_operand460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_operand472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_constant487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integer0 = new BitSet(new long[]{0x0000000000000002L});

}
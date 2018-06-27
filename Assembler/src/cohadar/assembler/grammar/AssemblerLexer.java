// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g 2011-07-20 20:52:19

package cohadar.assembler.grammar;
import cohadar.assembler.code.TextParam;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AssemblerLexer extends Lexer {
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

    public AssemblerLexer() {;} 
    public AssemblerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AssemblerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g"; }

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:103:7: ( ':' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:103:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:104:7: ( ',' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:104:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:105:4: ( '(' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:105:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:106:4: ( ')' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:106:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:107:4: ( '{' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:107:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "RC"
    public final void mRC() throws RecognitionException {
        try {
            int _type = RC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:108:4: ( '}' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:108:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RC"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:110:6: ( 'true' | 'TRUE' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='T') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:110:8: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:110:17: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:111:7: ( 'false' | 'FALSE' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='f') ) {
                alt2=1;
            }
            else if ( (LA2_0=='F') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:111:9: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:111:19: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "SHARED"
    public final void mSHARED() throws RecognitionException {
        try {
            int _type = SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:113:8: ( '.SHARED' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:113:10: '.SHARED'
            {
            match(".SHARED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHARED"

    // $ANTLR start "INSTANCE"
    public final void mINSTANCE() throws RecognitionException {
        try {
            int _type = INSTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:114:9: ( '.INSTANCE' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:114:11: '.INSTANCE'
            {
            match(".INSTANCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCE"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:115:6: ( '.CODE' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:115:8: '.CODE'
            {
            match(".CODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CODE"

    // $ANTLR start "INSTRUCTION0"
    public final void mINSTRUCTION0() throws RecognitionException {
        try {
            int _type = INSTRUCTION0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:119:2: ( 'add' | 'sub' | 'mul' | 'div' | 'mod' | 'inc' | 'dec' | 'neg' | 'eq' | 'neq' | 'lt' | 'lte' | 'gt' | 'gte' | 'and' | 'or' | 'xor' | 'not' | 'load' | 'store' | 'aload' | 'astore' | 'bload' | 'bstore' | 'join' | 'ret' | 'dup' | 'nop' | 'swap' | 'i2f' | 'fadd' | 'fdec' | 'fdiv' | 'finc' | 'fmod' | 'fmul' | 'fneg' | 'fsub' | 'feq' | 'fneq' | 'flt' | 'flte' | 'fgt' | 'fgte' | 'range' | 'index' )
            int alt3=46;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:119:4: 'add'
                    {
                    match("add"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:120:4: 'sub'
                    {
                    match("sub"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:121:4: 'mul'
                    {
                    match("mul"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:122:4: 'div'
                    {
                    match("div"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:123:4: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:124:4: 'inc'
                    {
                    match("inc"); 


                    }
                    break;
                case 7 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:125:4: 'dec'
                    {
                    match("dec"); 


                    }
                    break;
                case 8 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:126:4: 'neg'
                    {
                    match("neg"); 


                    }
                    break;
                case 9 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:127:4: 'eq'
                    {
                    match("eq"); 


                    }
                    break;
                case 10 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:128:4: 'neq'
                    {
                    match("neq"); 


                    }
                    break;
                case 11 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:129:4: 'lt'
                    {
                    match("lt"); 


                    }
                    break;
                case 12 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:130:4: 'lte'
                    {
                    match("lte"); 


                    }
                    break;
                case 13 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:131:4: 'gt'
                    {
                    match("gt"); 


                    }
                    break;
                case 14 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:132:4: 'gte'
                    {
                    match("gte"); 


                    }
                    break;
                case 15 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:133:4: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 16 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:134:4: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 17 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:135:4: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 18 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:136:4: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 19 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:137:4: 'load'
                    {
                    match("load"); 


                    }
                    break;
                case 20 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:138:4: 'store'
                    {
                    match("store"); 


                    }
                    break;
                case 21 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:139:4: 'aload'
                    {
                    match("aload"); 


                    }
                    break;
                case 22 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:140:4: 'astore'
                    {
                    match("astore"); 


                    }
                    break;
                case 23 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:141:4: 'bload'
                    {
                    match("bload"); 


                    }
                    break;
                case 24 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:142:4: 'bstore'
                    {
                    match("bstore"); 


                    }
                    break;
                case 25 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:143:4: 'join'
                    {
                    match("join"); 


                    }
                    break;
                case 26 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:144:4: 'ret'
                    {
                    match("ret"); 


                    }
                    break;
                case 27 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:145:4: 'dup'
                    {
                    match("dup"); 


                    }
                    break;
                case 28 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:146:4: 'nop'
                    {
                    match("nop"); 


                    }
                    break;
                case 29 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:147:4: 'swap'
                    {
                    match("swap"); 


                    }
                    break;
                case 30 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:148:4: 'i2f'
                    {
                    match("i2f"); 


                    }
                    break;
                case 31 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:149:4: 'fadd'
                    {
                    match("fadd"); 


                    }
                    break;
                case 32 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:150:4: 'fdec'
                    {
                    match("fdec"); 


                    }
                    break;
                case 33 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:151:4: 'fdiv'
                    {
                    match("fdiv"); 


                    }
                    break;
                case 34 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:152:4: 'finc'
                    {
                    match("finc"); 


                    }
                    break;
                case 35 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:153:4: 'fmod'
                    {
                    match("fmod"); 


                    }
                    break;
                case 36 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:154:4: 'fmul'
                    {
                    match("fmul"); 


                    }
                    break;
                case 37 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:155:4: 'fneg'
                    {
                    match("fneg"); 


                    }
                    break;
                case 38 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:156:4: 'fsub'
                    {
                    match("fsub"); 


                    }
                    break;
                case 39 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:157:4: 'feq'
                    {
                    match("feq"); 


                    }
                    break;
                case 40 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:158:4: 'fneq'
                    {
                    match("fneq"); 


                    }
                    break;
                case 41 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:159:4: 'flt'
                    {
                    match("flt"); 


                    }
                    break;
                case 42 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:160:4: 'flte'
                    {
                    match("flte"); 


                    }
                    break;
                case 43 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:161:4: 'fgt'
                    {
                    match("fgt"); 


                    }
                    break;
                case 44 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:162:4: 'fgte'
                    {
                    match("fgte"); 


                    }
                    break;
                case 45 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:163:4: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 46 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:164:4: 'index'
                    {
                    match("index"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTRUCTION0"

    // $ANTLR start "INSTRUCTION1"
    public final void mINSTRUCTION1() throws RecognitionException {
        try {
            int _type = INSTRUCTION1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:168:2: ( 'br' | 'brf' | 'brt' | 'brz' | 'brnz' | 'fork' | 'call' | 'syscall' | 'addr' | 'const' | 'dis' | 'exit' )
            int alt4=12;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:168:4: 'br'
                    {
                    match("br"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:169:4: 'brf'
                    {
                    match("brf"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:170:4: 'brt'
                    {
                    match("brt"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:171:4: 'brz'
                    {
                    match("brz"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:172:4: 'brnz'
                    {
                    match("brnz"); 


                    }
                    break;
                case 6 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:173:4: 'fork'
                    {
                    match("fork"); 


                    }
                    break;
                case 7 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:174:4: 'call'
                    {
                    match("call"); 


                    }
                    break;
                case 8 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:175:4: 'syscall'
                    {
                    match("syscall"); 


                    }
                    break;
                case 9 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:177:4: 'addr'
                    {
                    match("addr"); 


                    }
                    break;
                case 10 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:179:4: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 11 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:180:4: 'dis'
                    {
                    match("dis"); 


                    }
                    break;
                case 12 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:181:4: 'exit'
                    {
                    match("exit"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTRUCTION1"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:185:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:185:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:185:16: ( LETTER | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LID"
    public final void mLID() throws RecognitionException {
        try {
            int _type = LID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:186:6: ( '@' ( LETTER | '0' .. '9' )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:186:9: '@' ( LETTER | '0' .. '9' )+
            {
            match('@'); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:186:13: ( LETTER | '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LID"

    // $ANTLR start "SID"
    public final void mSID() throws RecognitionException {
        try {
            int _type = SID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:187:6: ( '%' ( LETTER | '0' .. '9' )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:187:9: '%' ( LETTER | '0' .. '9' )+
            {
            match('%'); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:187:13: ( LETTER | '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SID"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken ID1=null;

            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:190:5: ( ID '()' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:190:9: ID '()'
            {
            int ID1Start509 = getCharIndex();
            int ID1StartLine509 = getLine();
            int ID1StartCharPos509 = getCharPositionInLine();
            mID(); 
            ID1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ID1Start509, getCharIndex()-1);
            ID1.setLine(ID1StartLine509);
            ID1.setCharPositionInLine(ID1StartCharPos509);
            match("()"); 

            setText((ID1!=null?ID1.getText():null));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:194:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:194:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:5: ( ( '-' )? ( DIGIT )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:9: ( '-' )? ( DIGIT )+
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:9: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:14: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:197:14: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            int _type = HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:199:5: ( '0x' ( HEX_DIGIT )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:199:7: '0x' ( HEX_DIGIT )+
            {
            match("0x"); 

            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:199:12: ( HEX_DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||(LA10_0>='a' && LA10_0<='f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:199:13: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:203:7: ( '0' .. '9' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:203:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:207:11: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:211:5: ( INT '.' ( INT )* | '.' ( INT )+ )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='-'||(LA13_0>='0' && LA13_0<='9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='.') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:211:9: INT '.' ( INT )*
                    {
                    mINT(); 
                    match('.'); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:211:17: ( INT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='-'||(LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:211:17: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:212:9: '.' ( INT )+
                    {
                    match('.'); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:212:13: ( INT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:212:13: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:215:5: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:215:9: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:215:9: ( ' ' | '\\t' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\t'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:219:5: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:219:9: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 

            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:219:14: (~ ( '\\n' | '\\r' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:219:14: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:224:5: ( '\\r' '\\n' | '\\r' | '\\n' )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\r') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='\n') ) {
                    alt16=1;
                }
                else {
                    alt16=2;}
            }
            else if ( (LA16_0=='\n') ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:224:9: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:224:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:224:28: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken RAW_STRING2=null;

            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:228:5: ( '\\'' RAW_STRING '\\'' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:228:8: '\\'' RAW_STRING '\\''
            {
            match('\''); 
            int RAW_STRING2Start766 = getCharIndex();
            int RAW_STRING2StartLine766 = getLine();
            int RAW_STRING2StartCharPos766 = getCharPositionInLine();
            mRAW_STRING(); 
            RAW_STRING2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, RAW_STRING2Start766, getCharIndex()-1);
            RAW_STRING2.setLine(RAW_STRING2StartLine766);
            RAW_STRING2.setCharPositionInLine(RAW_STRING2StartCharPos766);
            match('\''); 
            setText((RAW_STRING2!=null?RAW_STRING2.getText():null));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "RAW_STRING"
    public final void mRAW_STRING() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:233:2: ( (~ ( '\\'' ) )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:233:4: (~ ( '\\'' ) )*
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:233:4: (~ ( '\\'' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:233:6: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RAW_STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:8: ( COLON | COMMA | LB | RB | LC | RC | TRUE | FALSE | SHARED | INSTANCE | CODE | INSTRUCTION0 | INSTRUCTION1 | ID | LID | SID | FUNC | INT | HEX | FLOAT | WS | COMMENT | NEWLINE | STRING )
        int alt18=24;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:10: COLON
                {
                mCOLON(); 

                }
                break;
            case 2 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:16: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 3 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:22: LB
                {
                mLB(); 

                }
                break;
            case 4 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:25: RB
                {
                mRB(); 

                }
                break;
            case 5 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:28: LC
                {
                mLC(); 

                }
                break;
            case 6 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:31: RC
                {
                mRC(); 

                }
                break;
            case 7 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:34: TRUE
                {
                mTRUE(); 

                }
                break;
            case 8 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:39: FALSE
                {
                mFALSE(); 

                }
                break;
            case 9 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:45: SHARED
                {
                mSHARED(); 

                }
                break;
            case 10 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:52: INSTANCE
                {
                mINSTANCE(); 

                }
                break;
            case 11 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:61: CODE
                {
                mCODE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:66: INSTRUCTION0
                {
                mINSTRUCTION0(); 

                }
                break;
            case 13 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:79: INSTRUCTION1
                {
                mINSTRUCTION1(); 

                }
                break;
            case 14 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:92: ID
                {
                mID(); 

                }
                break;
            case 15 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:95: LID
                {
                mLID(); 

                }
                break;
            case 16 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:99: SID
                {
                mSID(); 

                }
                break;
            case 17 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:103: FUNC
                {
                mFUNC(); 

                }
                break;
            case 18 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:108: INT
                {
                mINT(); 

                }
                break;
            case 19 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:112: HEX
                {
                mHEX(); 

                }
                break;
            case 20 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:116: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 21 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:122: WS
                {
                mWS(); 

                }
                break;
            case 22 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:125: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 23 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:133: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 24 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Assembler\\src\\cohadar\\assembler\\grammar\\Assembler.g:1:141: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA3_eotS =
        "\40\uffff\1\67\1\uffff\1\71\34\uffff\1\104\1\106\6\uffff";
    static final String DFA3_eofS =
        "\107\uffff";
    static final String DFA3_minS =
        "\1\141\1\144\1\164\1\157\1\145\1\62\1\145\1\uffff\1\157\1\164\2"+
        "\uffff\1\154\1\uffff\2\141\14\uffff\1\143\1\uffff\1\147\1\160\1"+
        "\145\1\uffff\1\145\5\uffff\1\145\1\uffff\1\157\1\145\2\uffff\2\164"+
        "\16\uffff\1\147\2\145\6\uffff";
    static final String DFA3_maxS =
        "\1\170\1\163\1\167\2\165\1\156\1\157\1\uffff\2\164\2\uffff\1\163"+
        "\1\uffff\1\145\1\163\14\uffff\1\144\1\uffff\1\161\1\164\1\145\1"+
        "\uffff\1\145\5\uffff\1\151\1\uffff\1\165\1\145\2\uffff\2\164\16"+
        "\uffff\1\161\2\145\6\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\11\2\uffff\1\20\1\21\1\uffff\1\31\2\uffff\1\1\1\17\1"+
        "\25\1\26\1\2\1\24\1\35\1\3\1\5\1\4\1\7\1\33\1\uffff\1\36\3\uffff"+
        "\1\23\1\uffff\1\27\1\30\1\32\1\55\1\37\1\uffff\1\42\2\uffff\1\46"+
        "\1\47\2\uffff\1\6\1\56\1\10\1\12\1\22\1\34\1\14\1\13\1\16\1\15\1"+
        "\40\1\41\1\43\1\44\3\uffff\1\45\1\50\1\52\1\51\1\54\1\53";
    static final String DFA3_specialS =
        "\107\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\14\1\uffff\1\4\1\7\1\17\1\11\1\uffff\1\5\1\15\1\uffff"+
            "\1\10\1\3\1\6\1\12\2\uffff\1\16\1\2\4\uffff\1\13",
            "\1\20\7\uffff\1\22\1\uffff\1\21\4\uffff\1\23",
            "\1\25\1\24\1\uffff\1\26",
            "\1\30\5\uffff\1\27",
            "\1\32\3\uffff\1\31\13\uffff\1\33",
            "\1\35\73\uffff\1\34",
            "\1\36\11\uffff\1\37",
            "",
            "\1\41\4\uffff\1\40",
            "\1\42",
            "",
            "",
            "\1\43\6\uffff\1\44",
            "",
            "\1\46\3\uffff\1\45",
            "\1\47\2\uffff\1\50\1\55\1\uffff\1\57\1\uffff\1\51\2\uffff"+
            "\1\56\1\52\1\53\4\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\61",
            "",
            "\1\62\11\uffff\1\63",
            "\1\65\3\uffff\1\64",
            "\1\66",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\72\3\uffff\1\73",
            "",
            "\1\74\5\uffff\1\75",
            "\1\76",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\11\uffff\1\102",
            "\1\103",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "118:1: INSTRUCTION0 : ( 'add' | 'sub' | 'mul' | 'div' | 'mod' | 'inc' | 'dec' | 'neg' | 'eq' | 'neq' | 'lt' | 'lte' | 'gt' | 'gte' | 'and' | 'or' | 'xor' | 'not' | 'load' | 'store' | 'aload' | 'astore' | 'bload' | 'bstore' | 'join' | 'ret' | 'dup' | 'nop' | 'swap' | 'i2f' | 'fadd' | 'fdec' | 'fdiv' | 'finc' | 'fmod' | 'fmul' | 'fneg' | 'fsub' | 'feq' | 'fneq' | 'flt' | 'flte' | 'fgt' | 'fgte' | 'range' | 'index' );";
        }
    }
    static final String DFA4_eotS =
        "\10\uffff\1\17\7\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\141\1\162\1\uffff\1\141\4\uffff\1\146\7\uffff";
    static final String DFA4_maxS =
        "\1\163\1\162\1\uffff\1\157\4\uffff\1\172\7\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\6\1\uffff\1\10\1\11\1\13\1\14\1\uffff\1\7\1\12\1\2\1"+
        "\3\1\4\1\5\1\1";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\1\1\1\3\1\6\1\7\1\2\14\uffff\1\4",
            "\1\10",
            "",
            "\1\11\15\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\13\7\uffff\1\16\5\uffff\1\14\5\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
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
            return "167:1: INSTRUCTION1 : ( 'br' | 'brf' | 'brt' | 'brz' | 'brnz' | 'fork' | 'call' | 'syscall' | 'addr' | 'const' | 'dis' | 'exit' );";
        }
    }
    static final String DFA18_eotS =
        "\7\uffff\4\46\1\uffff\20\46\3\uffff\2\132\4\uffff\1\46\1\uffff"+
        "\1\46\1\uffff\14\46\4\uffff\21\46\1\u0080\1\46\1\u0080\1\46\2\u0080"+
        "\3\46\1\u008c\5\46\2\uffff\13\46\3\u0080\2\46\2\u0080\2\46\1\u0080"+
        "\3\46\3\u0080\1\u008c\3\u0080\1\46\5\u0080\1\uffff\1\46\1\u0080"+
        "\1\46\2\u0080\2\46\3\u008c\1\46\1\uffff\1\46\1\u0080\3\46\2\u00b2"+
        "\1\46\13\u0080\1\u008c\1\46\1\u008c\3\46\1\u0080\2\46\1\u008c\1"+
        "\u0080\2\46\1\u008c\1\u0080\1\46\1\u008c\1\46\1\uffff\2\u00be\1"+
        "\u0080\1\46\1\u0080\1\46\2\u0080\1\46\1\u0080\1\u008c\1\uffff\1"+
        "\u0080\1\46\1\u0080\1\u008c";
    static final String DFA18_eofS =
        "\u00c3\uffff";
    static final String DFA18_minS =
        "\1\11\6\uffff\4\50\1\55\20\50\2\uffff\1\60\2\56\4\uffff\1\50\1"+
        "\uffff\1\50\1\uffff\14\50\4\uffff\40\50\2\uffff\45\50\1\uffff\13"+
        "\50\1\uffff\45\50\1\uffff\13\50\1\uffff\4\50";
    static final String DFA18_maxS =
        "\1\175\6\uffff\4\172\1\123\20\172\2\uffff\1\71\1\170\1\71\4\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\14\172\4\uffff\40\172\2\uffff\45\172"+
        "\1\uffff\13\172\1\uffff\45\172\1\uffff\13\172\1\uffff\4\172";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\25\uffff\1\17\1\20\3\uffff\1\25"+
        "\1\26\1\27\1\30\1\uffff\1\16\1\uffff\1\21\14\uffff\1\11\1\12\1\13"+
        "\1\24\40\uffff\1\23\1\22\45\uffff\1\14\13\uffff\1\15\45\uffff\1"+
        "\7\13\uffff\1\10\4\uffff";
    static final String DFA18_specialS =
        "\u00c3\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\41\1\43\2\uffff\1\43\22\uffff\1\41\4\uffff\1\35\1\uffff"+
            "\1\44\1\3\1\4\2\uffff\1\2\1\36\1\13\1\42\1\37\11\40\1\1\5\uffff"+
            "\1\34\5\33\1\12\15\33\1\10\6\33\4\uffff\1\33\1\uffff\1\14\1"+
            "\27\1\32\1\17\1\22\1\11\1\24\1\33\1\20\1\30\1\33\1\23\1\16\1"+
            "\21\1\25\2\33\1\31\1\15\1\7\3\33\1\26\2\33\1\5\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\45\10\47",
            "\1\50\7\uffff\12\47\7\uffff\21\47\1\51\10\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\52"+
            "\2\47\1\53\1\60\1\47\1\62\1\47\1\54\2\47\1\61\1\55\1\56\1\63"+
            "\3\47\1\57\7\47",
            "\1\50\7\uffff\12\47\7\uffff\1\64\31\47\4\uffff\1\47\1\uffff"+
            "\32\47",
            "\1\70\2\uffff\12\70\11\uffff\1\67\5\uffff\1\66\11\uffff\1"+
            "\65",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\71\7\47\1\73\1\47\1\72\4\47\1\74\7\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\76\1\75\1\47\1\77\1\47\1\100\1\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\102\5\47\1\101\5\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\104\3\47\1\103\13\47\1\105\5\47",
            "\1\50\7\uffff\2\47\1\107\7\47\7\uffff\32\47\4\uffff\1\47\1"+
            "\uffff\15\47\1\106\14\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\110\11\47\1\111\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\20"+
            "\47\1\112\6\47\1\113\2\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\115\4\47\1\114\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\116\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\117\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\120\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\121\5\47\1\123\1\122\7\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\124\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\126"+
            "\3\47\1\125\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\127"+
            "\15\47\1\130\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\12\40",
            "\1\70\1\uffff\12\40\76\uffff\1\131",
            "\1\70\1\uffff\12\40",
            "",
            "",
            "",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24"+
            "\47\1\133\5\47",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\50\7\uffff\12\47\7\uffff\24\47\1\134\5\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\136\7\47\1\135\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\137\3\47\1\140\21\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15"+
            "\47\1\141\14\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\142\5\47\1\143\5\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\144\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24"+
            "\47\1\145\5\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\20"+
            "\47\1\146\11\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\147\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\150\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\151\10\47",
            "\1\50\7\uffff\12\47\7\uffff\13\47\1\152\16\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\153\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\154\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\155\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\156\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47"+
            "\1\157\30\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\160\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\161"+
            "\31\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22"+
            "\47\1\162\7\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\163\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\164\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22"+
            "\47\1\166\2\47\1\165\4\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47"+
            "\1\167\27\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17"+
            "\47\1\170\12\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47"+
            "\1\171\1\172\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47"+
            "\1\173\24\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47"+
            "\1\174\11\47\1\175\11\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17"+
            "\47\1\177\3\47\1\176\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\u0081\21\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u0082\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0083"+
            "\31\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u0084\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\u0085\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\u0086\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\u0087\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47"+
            "\1\u0088\7\47\1\u008b\5\47\1\u0089\5\47\1\u008a",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\u008d\21\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\u008e\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15"+
            "\47\1\u008f\14\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\u0090\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15"+
            "\47\1\u0091\14\47",
            "",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u0092\25\47",
            "\1\50\7\uffff\12\47\7\uffff\4\47\1\u0093\25\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22"+
            "\47\1\u0094\7\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\u0095\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47"+
            "\1\u0096\27\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\25"+
            "\47\1\u0097\4\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47"+
            "\1\u0098\27\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\u0099\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\u009a\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47"+
            "\1\u009b\11\47\1\u009c\11\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47"+
            "\1\u009d\30\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u009e\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u009f\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12"+
            "\47\1\u00a0\17\47",
            "\1\50\7\uffff\12\47\7\uffff\22\47\1\u00a1\7\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\u00a2\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00a3"+
            "\31\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\u00a4\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\u00a5\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17"+
            "\47\1\u00a6\12\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47"+
            "\1\u00a7\27\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00a8\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\u00a9\6\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\u00aa\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00ab"+
            "\31\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16"+
            "\47\1\u00ac\13\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\31"+
            "\47\1\u00ad",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15"+
            "\47\1\u00ae\14\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47"+
            "\1\u00af\23\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\u00b0\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22"+
            "\47\1\u00b1\7\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00b3\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\4\47\1\u00b4\25\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\u00b5\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\u00b6\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00b7\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00b8"+
            "\31\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\27"+
            "\47\1\u00b9\2\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47"+
            "\1\u00ba\26\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\u00bb\10\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00bc\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\u00bd\6\47",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00bf\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\u00c0\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00c1\25\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13"+
            "\47\1\u00c2\16\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\50\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47"
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
            return "1:1: Tokens : ( COLON | COMMA | LB | RB | LC | RC | TRUE | FALSE | SHARED | INSTANCE | CODE | INSTRUCTION0 | INSTRUCTION1 | ID | LID | SID | FUNC | INT | HEX | FLOAT | WS | COMMENT | NEWLINE | STRING );";
        }
    }
 

}
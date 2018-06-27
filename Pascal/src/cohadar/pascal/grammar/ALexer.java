// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g 2011-07-20 20:56:34

package cohadar.pascal.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ALexer extends Lexer {
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

    // delegates
    // delegators

    public ALexer() {;} 
    public ALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g"; }

    // $ANTLR start "SHARED"
    public final void mSHARED() throws RecognitionException {
        try {
            int _type = SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:18:9: ( 'shared' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:18:11: 'shared'
            {
            match("shared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHARED"

    // $ANTLR start "COBEGIN"
    public final void mCOBEGIN() throws RecognitionException {
        try {
            int _type = COBEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:19:10: ( 'cobegin' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:19:12: 'cobegin'
            {
            match("cobegin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COBEGIN"

    // $ANTLR start "COEND"
    public final void mCOEND() throws RecognitionException {
        try {
            int _type = COEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:20:8: ( 'coend' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:20:10: 'coend'
            {
            match("coend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COEND"

    // $ANTLR start "COFOR"
    public final void mCOFOR() throws RecognitionException {
        try {
            int _type = COFOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:21:8: ( 'cofor' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:21:10: 'cofor'
            {
            match("cofor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COFOR"

    // $ANTLR start "SEMAPHORE"
    public final void mSEMAPHORE() throws RecognitionException {
        try {
            int _type = SEMAPHORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:22:11: ( 'semaphore' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:22:13: 'semaphore'
            {
            match("semaphore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMAPHORE"

    // $ANTLR start "REGION"
    public final void mREGION() throws RecognitionException {
        try {
            int _type = REGION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:23:9: ( 'region' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:23:11: 'region'
            {
            match("region"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGION"

    // $ANTLR start "AWAIT"
    public final void mAWAIT() throws RecognitionException {
        try {
            int _type = AWAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:24:8: ( 'await' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:24:10: 'await'
            {
            match("await"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AWAIT"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:27:20: ( 'program' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:27:22: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:28:20: ( 'const' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:28:22: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:29:20: ( 'type' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:29:22: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:30:20: ( 'var' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:30:22: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:32:20: ( 'boolean' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:32:22: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:33:20: ( 'integer' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:33:22: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:34:20: ( 'real' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:34:22: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:36:20: ( 'array' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:36:22: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:37:20: ( 'of' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:37:22: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:38:20: ( 'record' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:38:22: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:40:20: ( 'true' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:40:22: 'true'
            {
            match("true"); 


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
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:41:20: ( 'false' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:41:22: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:43:20: ( 'procedure' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:43:22: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:44:20: ( 'function' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:44:22: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:46:20: ( 'begin' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:46:22: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:47:20: ( 'end' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:47:22: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:49:20: ( 'if' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:49:22: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:50:20: ( 'then' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:50:22: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:51:20: ( 'else' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:51:22: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:52:20: ( 'while' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:52:22: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:53:20: ( 'do' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:53:22: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:54:20: ( 'repeat' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:54:22: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:55:20: ( 'until' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:55:22: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:56:20: ( 'for' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:56:22: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:57:20: ( 'to' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:57:22: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "DOWNTO"
    public final void mDOWNTO() throws RecognitionException {
        try {
            int _type = DOWNTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:58:20: ( 'downto' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:58:22: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOWNTO"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:59:20: ( 'break' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:59:22: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:61:20: ( 'and' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:61:22: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:62:20: ( 'or' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:62:22: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:63:20: ( 'xor' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:63:22: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:64:20: ( 'not' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:64:22: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:66:20: ( 'div' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:66:22: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:67:20: ( 'mod' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:67:22: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:72:17: ( '+' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:72:19: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:73:17: ( '-' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:73:19: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:74:17: ( '*' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:74:19: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:75:17: ( '/' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:75:19: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:76:17: ( ':=' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:76:19: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:77:17: ( ',' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:77:19: ','
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

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:78:17: ( ';' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:78:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:79:17: ( ':' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:79:19: ':'
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

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:80:9: ( '::' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:80:11: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:81:17: ( '.' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:81:19: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:82:17: ( '=' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:82:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:83:17: ( '<>' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:83:19: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:84:17: ( '<' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:84:19: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:85:17: ( '<=' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:85:19: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:86:17: ( '>=' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:86:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:87:17: ( '>' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:87:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:88:17: ( '(' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:88:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:89:17: ( ')' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:89:19: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:90:17: ( '[' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:90:19: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:91:17: ( ']' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:91:19: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:92:17: ( '{' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:92:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:93:17: ( '}' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:93:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:98:9: ( ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:98:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:98:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt2=1;
                }
                break;
            case '\t':
                {
                alt2=2;
                }
                break;
            case '\f':
                {
                alt2=3;
                }
                break;
            case '\n':
            case '\r':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:98:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:99:5: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:100:5: '\\f'
                    {
                    match('\f'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:102:5: ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:102:5: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt1=3;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='\r') ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1=='\n') ) {
                            alt1=1;
                        }
                        else {
                            alt1=2;}
                    }
                    else if ( (LA1_0=='\n') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:102:7: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:103:6: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:104:6: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }

                     //newline(); 
                    			

                    }
                    break;

            }

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT_0"
    public final void mCOMMENT_0() throws RecognitionException {
        try {
            int _type = COMMENT_0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:15: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:15: ~ ( '\\n' | '\\r' )
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
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:29: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:113:29: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_0"

    // $ANTLR start "COMMENT_1"
    public final void mCOMMENT_1() throws RecognitionException {
        try {
            int _type = COMMENT_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:118:2: ( '(*' ( options {greedy=false; } : . )* '*)' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:118:4: '(*' ( options {greedy=false; } : . )* '*)'
            {
            match("(*"); 

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:118:9: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==')') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='(')||(LA5_1>='*' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:118:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*)"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_1"

    // $ANTLR start "COMMENT_2"
    public final void mCOMMENT_2() throws RecognitionException {
        try {
            int _type = COMMENT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:122:9: ( '{' ( options {greedy=false; } : . )* '}' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:122:11: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:122:16: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='}') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='|')||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:122:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('}'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT_2"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:125:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:126:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:126:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:131:2: ( '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:131:4: '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:131:9: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\'') ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:131:10: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:131:19: ~ ( '\\'' )
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
            	    break loop8;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "HEX_INT"
    public final void mHEX_INT() throws RecognitionException {
        try {
            int _type = HEX_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:134:9: ( '$' ( HEX_DIGIT )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:134:11: '$' ( HEX_DIGIT )+
            {
            match('$'); 
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:134:15: ( HEX_DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:134:15: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

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
    // $ANTLR end "HEX_INT"

    // $ANTLR start "NUM_INT"
    public final void mNUM_INT() throws RecognitionException {
        try {
            int _type = NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:138:2: ( ( DIGIT )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:138:5: ( DIGIT )+
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:138:5: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:138:5: DIGIT
            	    {
            	    mDIGIT(); 

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
    // $ANTLR end "NUM_INT"

    // $ANTLR start "NUM_REAL"
    public final void mNUM_REAL() throws RecognitionException {
        try {
            int _type = NUM_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:149:2: ( ( DIGIT )+ ( DOT | DOT ( DIGIT )+ | DOT ( DIGIT )+ EXPONENT | DOT EXPONENT | EXPONENT )? )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:149:4: ( DIGIT )+ ( DOT | DOT ( DIGIT )+ | DOT ( DIGIT )+ EXPONENT | DOT EXPONENT | EXPONENT )?
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:149:4: ( DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:149:4: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:150:2: ( DOT | DOT ( DIGIT )+ | DOT ( DIGIT )+ EXPONENT | DOT EXPONENT | EXPONENT )?
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:151:5: DOT
                    {
                    mDOT(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:152:5: DOT ( DIGIT )+
                    {
                    mDOT(); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:152:9: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:152:9: DIGIT
                    	    {
                    	    mDIGIT(); 

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
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:153:5: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); 
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:153:9: ( DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:153:9: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:154:5: DOT EXPONENT
                    {
                    mDOT(); 
                    mEXPONENT(); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:155:5: EXPONENT
                    {
                    mEXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_REAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:161:7: ( ( '0' .. '9' ) )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:162:2: ( '0' .. '9' )
            {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:162:2: ( '0' .. '9' )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:162:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:166:11: ( ( '0' .. '9' ) | ( 'a' .. 'f' ) | ( 'A' .. 'F' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt15=1;
                }
                break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                {
                alt15=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:2: ( '0' .. '9' )
                    {
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:2: ( '0' .. '9' )
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:3: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:13: ( 'a' .. 'f' )
                    {
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:13: ( 'a' .. 'f' )
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:14: 'a' .. 'f'
                    {
                    matchRange('a','f'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:24: ( 'A' .. 'F' )
                    {
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:24: ( 'A' .. 'F' )
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:167:25: 'A' .. 'F'
                    {
                    matchRange('A','F'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:173:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:173:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:173:14: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:173:25: ( DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:173:25: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:8: ( SHARED | COBEGIN | COEND | COFOR | SEMAPHORE | REGION | AWAIT | PROGRAM | CONST | TYPE | VAR | BOOLEAN | INTEGER | REAL | ARRAY | OF | RECORD | TRUE | FALSE | PROCEDURE | FUNCTION | BEGIN | END | IF | THEN | ELSE | WHILE | DO | REPEAT | UNTIL | FOR | TO | DOWNTO | BREAK | AND | OR | XOR | NOT | DIV | MOD | PLUS | MINUS | STAR | SLASH | ASSIGN | COMMA | SEMI | COLON | DOTDOT | DOT | EQUAL | NOT_EQUAL | LT | LE | GE | GT | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | WS | COMMENT_0 | COMMENT_1 | COMMENT_2 | IDENT | STRING_LITERAL | HEX_INT | NUM_INT | NUM_REAL )
        int alt18=71;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:10: SHARED
                {
                mSHARED(); 

                }
                break;
            case 2 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:17: COBEGIN
                {
                mCOBEGIN(); 

                }
                break;
            case 3 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:25: COEND
                {
                mCOEND(); 

                }
                break;
            case 4 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:31: COFOR
                {
                mCOFOR(); 

                }
                break;
            case 5 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:37: SEMAPHORE
                {
                mSEMAPHORE(); 

                }
                break;
            case 6 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:47: REGION
                {
                mREGION(); 

                }
                break;
            case 7 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:54: AWAIT
                {
                mAWAIT(); 

                }
                break;
            case 8 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:60: PROGRAM
                {
                mPROGRAM(); 

                }
                break;
            case 9 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:68: CONST
                {
                mCONST(); 

                }
                break;
            case 10 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:74: TYPE
                {
                mTYPE(); 

                }
                break;
            case 11 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:79: VAR
                {
                mVAR(); 

                }
                break;
            case 12 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:83: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 13 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:91: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 14 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:99: REAL
                {
                mREAL(); 

                }
                break;
            case 15 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:104: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 16 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:110: OF
                {
                mOF(); 

                }
                break;
            case 17 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:113: RECORD
                {
                mRECORD(); 

                }
                break;
            case 18 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:120: TRUE
                {
                mTRUE(); 

                }
                break;
            case 19 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:125: FALSE
                {
                mFALSE(); 

                }
                break;
            case 20 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:131: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 21 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:141: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 22 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:150: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 23 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:156: END
                {
                mEND(); 

                }
                break;
            case 24 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:160: IF
                {
                mIF(); 

                }
                break;
            case 25 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:163: THEN
                {
                mTHEN(); 

                }
                break;
            case 26 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:168: ELSE
                {
                mELSE(); 

                }
                break;
            case 27 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:173: WHILE
                {
                mWHILE(); 

                }
                break;
            case 28 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:179: DO
                {
                mDO(); 

                }
                break;
            case 29 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:182: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:189: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 31 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:195: FOR
                {
                mFOR(); 

                }
                break;
            case 32 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:199: TO
                {
                mTO(); 

                }
                break;
            case 33 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:202: DOWNTO
                {
                mDOWNTO(); 

                }
                break;
            case 34 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:209: BREAK
                {
                mBREAK(); 

                }
                break;
            case 35 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:215: AND
                {
                mAND(); 

                }
                break;
            case 36 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:219: OR
                {
                mOR(); 

                }
                break;
            case 37 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:222: XOR
                {
                mXOR(); 

                }
                break;
            case 38 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:226: NOT
                {
                mNOT(); 

                }
                break;
            case 39 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:230: DIV
                {
                mDIV(); 

                }
                break;
            case 40 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:234: MOD
                {
                mMOD(); 

                }
                break;
            case 41 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:238: PLUS
                {
                mPLUS(); 

                }
                break;
            case 42 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:243: MINUS
                {
                mMINUS(); 

                }
                break;
            case 43 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:249: STAR
                {
                mSTAR(); 

                }
                break;
            case 44 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:254: SLASH
                {
                mSLASH(); 

                }
                break;
            case 45 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:260: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 46 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:267: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 47 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:273: SEMI
                {
                mSEMI(); 

                }
                break;
            case 48 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:278: COLON
                {
                mCOLON(); 

                }
                break;
            case 49 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:284: DOTDOT
                {
                mDOTDOT(); 

                }
                break;
            case 50 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:291: DOT
                {
                mDOT(); 

                }
                break;
            case 51 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:295: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 52 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:301: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 53 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:311: LT
                {
                mLT(); 

                }
                break;
            case 54 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:314: LE
                {
                mLE(); 

                }
                break;
            case 55 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:317: GE
                {
                mGE(); 

                }
                break;
            case 56 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:320: GT
                {
                mGT(); 

                }
                break;
            case 57 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:323: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 58 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:330: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 59 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:337: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 60 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:344: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 61 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:351: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 62 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:358: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 63 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:365: WS
                {
                mWS(); 

                }
                break;
            case 64 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:368: COMMENT_0
                {
                mCOMMENT_0(); 

                }
                break;
            case 65 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:378: COMMENT_1
                {
                mCOMMENT_1(); 

                }
                break;
            case 66 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:388: COMMENT_2
                {
                mCOMMENT_2(); 

                }
                break;
            case 67 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:398: IDENT
                {
                mIDENT(); 

                }
                break;
            case 68 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:404: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 69 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:419: HEX_INT
                {
                mHEX_INT(); 

                }
                break;
            case 70 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:427: NUM_INT
                {
                mNUM_INT(); 

                }
                break;
            case 71 :
                // C:\\Users\\Dalibor\\workspace-diplomski\\Pascal\\src\\cohadar\\pascal\\grammar\\ALexer.g:1:435: NUM_REAL
                {
                mNUM_REAL(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA14_eotS =
        "\1\3\1\4\3\uffff\1\7\3\uffff";
    static final String DFA14_eofS =
        "\11\uffff";
    static final String DFA14_minS =
        "\1\56\1\60\3\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\2\145\3\uffff\1\145\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\5\1\6\1\1\1\uffff\1\4\1\2\1\3";
    static final String DFA14_specialS =
        "\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\5\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "",
            "\12\5\13\uffff\1\10\37\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "150:2: ( DOT | DOT ( DIGIT )+ | DOT ( DIGIT )+ EXPONENT | DOT EXPONENT | EXPONENT )?";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\22\45\3\uffff\1\112\1\115\4\uffff\1\120\1\122\1\124\3"+
        "\uffff\1\125\5\uffff\1\127\13\45\1\152\5\45\1\160\1\161\1\162\6"+
        "\45\1\172\5\45\20\uffff\14\45\1\u008c\4\45\1\uffff\1\u0092\4\45"+
        "\3\uffff\2\45\1\u0099\1\u009a\3\45\1\uffff\1\u009e\1\45\1\u00a0"+
        "\1\u00a1\1\u00a2\7\45\1\u00aa\4\45\1\uffff\2\45\1\u00b1\1\u00b2"+
        "\1\u00b3\1\uffff\6\45\2\uffff\1\u00ba\2\45\1\uffff\1\45\3\uffff"+
        "\3\45\1\u00c1\1\u00c2\1\u00c3\1\45\1\uffff\2\45\1\u00c7\1\u00c8"+
        "\2\45\3\uffff\1\45\1\u00cc\1\u00cd\1\45\1\u00cf\1\45\1\uffff\1\u00d1"+
        "\1\45\1\u00d3\1\u00d4\2\45\3\uffff\1\u00d7\1\u00d8\1\u00d9\2\uffff"+
        "\3\45\2\uffff\1\45\1\uffff\1\45\1\uffff\1\u00df\2\uffff\1\45\1\u00e1"+
        "\3\uffff\1\u00e2\1\45\1\u00e4\1\u00e5\1\45\1\uffff\1\45\2\uffff"+
        "\1\45\2\uffff\1\u00e9\1\u00ea\1\u00eb\3\uffff";
    static final String DFA18_eofS =
        "\u00ec\uffff";
    static final String DFA18_minS =
        "\1\11\1\145\1\157\1\145\1\156\1\162\1\150\1\141\1\145\2\146\1\141"+
        "\1\154\1\150\1\151\1\156\3\157\3\uffff\1\57\1\72\4\uffff\2\75\1"+
        "\52\3\uffff\1\0\5\uffff\1\56\1\141\1\155\1\142\2\141\1\162\1\144"+
        "\1\157\1\160\1\165\1\145\1\60\1\162\1\157\1\147\1\145\1\164\3\60"+
        "\1\154\1\156\1\162\1\144\1\163\1\151\1\60\1\166\1\164\1\162\1\164"+
        "\1\144\20\uffff\1\162\1\141\1\145\1\156\1\157\1\163\1\151\1\154"+
        "\1\157\1\145\1\151\1\141\1\60\1\143\2\145\1\156\1\uffff\1\60\1\154"+
        "\1\151\1\141\1\145\3\uffff\1\163\1\143\2\60\1\145\1\154\1\156\1"+
        "\uffff\1\60\1\151\3\60\1\145\1\160\1\147\1\144\1\162\1\164\1\157"+
        "\1\60\1\162\1\141\1\164\1\171\1\uffff\1\162\1\145\3\60\1\uffff\1"+
        "\145\1\156\1\153\1\147\1\145\1\164\2\uffff\1\60\1\145\1\164\1\uffff"+
        "\1\154\3\uffff\1\144\1\150\1\151\3\60\1\156\1\uffff\1\144\1\164"+
        "\2\60\1\141\1\144\3\uffff\1\141\2\60\1\145\1\60\1\151\1\uffff\1"+
        "\60\1\157\2\60\1\157\1\156\3\uffff\3\60\2\uffff\1\155\1\165\1\156"+
        "\2\uffff\1\162\1\uffff\1\157\1\uffff\1\60\2\uffff\1\162\1\60\3\uffff"+
        "\1\60\1\162\2\60\1\156\1\uffff\1\145\2\uffff\1\145\2\uffff\3\60"+
        "\3\uffff";
    static final String DFA18_maxS =
        "\1\175\1\150\1\157\1\145\1\167\1\162\1\171\1\141\1\162\1\156\1"+
        "\162\1\165\1\156\1\150\1\157\1\156\3\157\3\uffff\1\57\1\75\4\uffff"+
        "\1\76\1\75\1\52\3\uffff\1\uffff\5\uffff\1\145\1\141\1\155\1\156"+
        "\1\160\1\141\1\162\1\144\1\157\1\160\1\165\1\145\1\172\1\162\1\157"+
        "\1\147\1\145\1\164\3\172\1\154\1\156\1\162\1\144\1\163\1\151\1\172"+
        "\1\166\1\164\1\162\1\164\1\144\20\uffff\1\162\1\141\1\145\1\156"+
        "\1\157\1\163\1\151\1\154\1\157\1\145\1\151\1\141\1\172\1\147\2\145"+
        "\1\156\1\uffff\1\172\1\154\1\151\1\141\1\145\3\uffff\1\163\1\143"+
        "\2\172\1\145\1\154\1\156\1\uffff\1\172\1\151\3\172\1\145\1\160\1"+
        "\147\1\144\1\162\1\164\1\157\1\172\1\162\1\141\1\164\1\171\1\uffff"+
        "\1\162\1\145\3\172\1\uffff\1\145\1\156\1\153\1\147\1\145\1\164\2"+
        "\uffff\1\172\1\145\1\164\1\uffff\1\154\3\uffff\1\144\1\150\1\151"+
        "\3\172\1\156\1\uffff\1\144\1\164\2\172\1\141\1\144\3\uffff\1\141"+
        "\2\172\1\145\1\172\1\151\1\uffff\1\172\1\157\2\172\1\157\1\156\3"+
        "\uffff\3\172\2\uffff\1\155\1\165\1\156\2\uffff\1\162\1\uffff\1\157"+
        "\1\uffff\1\172\2\uffff\1\162\1\172\3\uffff\1\172\1\162\2\172\1\156"+
        "\1\uffff\1\145\2\uffff\1\145\2\uffff\3\172\3\uffff";
    static final String DFA18_acceptS =
        "\23\uffff\1\51\1\52\1\53\2\uffff\1\56\1\57\1\62\1\63\3\uffff\1"+
        "\72\1\73\1\74\1\uffff\1\76\1\77\1\103\1\104\1\105\41\uffff\1\100"+
        "\1\54\1\55\1\61\1\60\1\64\1\66\1\65\1\67\1\70\1\101\1\71\1\75\1"+
        "\102\1\106\1\107\21\uffff\1\40\5\uffff\1\30\1\20\1\44\7\uffff\1"+
        "\34\21\uffff\1\43\5\uffff\1\13\6\uffff\1\37\1\27\3\uffff\1\47\1"+
        "\uffff\1\45\1\46\1\50\7\uffff\1\16\6\uffff\1\12\1\22\1\31\6\uffff"+
        "\1\32\6\uffff\1\3\1\4\1\11\3\uffff\1\7\1\17\3\uffff\1\26\1\42\1"+
        "\uffff\1\23\1\uffff\1\33\1\uffff\1\36\1\1\2\uffff\1\6\1\21\1\35"+
        "\5\uffff\1\41\1\uffff\1\2\1\10\1\uffff\1\14\1\15\3\uffff\1\25\1"+
        "\5\1\24";
    static final String DFA18_specialS =
        "\42\uffff\1\0\u00c9\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\44\1\uffff\2\44\22\uffff\1\44\3\uffff\1\47\2\uffff\1\46"+
            "\1\36\1\37\1\25\1\23\1\30\1\24\1\32\1\26\12\50\1\27\1\31\1\34"+
            "\1\33\1\35\2\uffff\32\45\1\40\1\uffff\1\41\1\uffff\1\45\1\uffff"+
            "\1\4\1\10\1\2\1\16\1\14\1\13\2\45\1\11\3\45\1\22\1\21\1\12\1"+
            "\5\1\45\1\3\1\1\1\6\1\17\1\7\1\15\1\20\2\45\1\42\1\uffff\1\43",
            "\1\52\2\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\57\3\uffff\1\56\4\uffff\1\55",
            "\1\60",
            "\1\63\6\uffff\1\64\2\uffff\1\62\6\uffff\1\61",
            "\1\65",
            "\1\67\11\uffff\1\66\2\uffff\1\70",
            "\1\72\7\uffff\1\71",
            "\1\73\13\uffff\1\74",
            "\1\75\15\uffff\1\77\5\uffff\1\76",
            "\1\101\1\uffff\1\100",
            "\1\102",
            "\1\104\5\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "\1\111",
            "\1\114\2\uffff\1\113",
            "",
            "",
            "",
            "",
            "\1\117\1\116",
            "\1\121",
            "\1\123",
            "",
            "",
            "",
            "\0\126",
            "",
            "",
            "",
            "",
            "",
            "\1\130\1\uffff\12\50\13\uffff\1\130\37\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133\2\uffff\1\134\1\135\7\uffff\1\136",
            "\1\140\1\uffff\1\141\3\uffff\1\137\10\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\26\45\1\171\3\45",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
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
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008e\3\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\1\u00cb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ce",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d0",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "\1\u00dd",
            "",
            "\1\u00de",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00e0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            return "1:1: Tokens : ( SHARED | COBEGIN | COEND | COFOR | SEMAPHORE | REGION | AWAIT | PROGRAM | CONST | TYPE | VAR | BOOLEAN | INTEGER | REAL | ARRAY | OF | RECORD | TRUE | FALSE | PROCEDURE | FUNCTION | BEGIN | END | IF | THEN | ELSE | WHILE | DO | REPEAT | UNTIL | FOR | TO | DOWNTO | BREAK | AND | OR | XOR | NOT | DIV | MOD | PLUS | MINUS | STAR | SLASH | ASSIGN | COMMA | SEMI | COLON | DOTDOT | DOT | EQUAL | NOT_EQUAL | LT | LE | GE | GT | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | WS | COMMENT_0 | COMMENT_1 | COMMENT_2 | IDENT | STRING_LITERAL | HEX_INT | NUM_INT | NUM_REAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_34 = input.LA(1);

                        s = -1;
                        if ( ((LA18_34>='\u0000' && LA18_34<='\uFFFF')) ) {s = 86;}

                        else s = 85;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
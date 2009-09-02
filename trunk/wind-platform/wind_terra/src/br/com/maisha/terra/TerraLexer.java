// $ANTLR 3.1.2 /home/paulofreitas/Desktop/lang/TerraLexer.g 2009-08-31 22:38:52
 package br.com.maisha.terra; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraLexer extends Lexer {
    public static final int DOMAIN_OBJECT=10;
    public static final int INTEGER=16;
    public static final int SYMBOL=24;
    public static final int LETTER=19;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=18;
    public static final int WHITESPACE=29;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=17;
    public static final int SPACE=25;
    public static final int EOF=-1;
    public static final int TYPE=12;
    public static final int RIGHT_PAREN=6;
    public static final int NAME=21;
    public static final int IMPORT=11;
    public static final int STRING_LITERAL=23;
    public static final int NEWLINE=28;
    public static final int NONCONTROL_CHAR=22;
    public static final int PROPERTY=13;
    public static final int ASSIGN=4;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_PAREN=5;
    public static final int LOWER=26;
    public static final int DIGIT=20;
    public static final int OPERATION=14;
    public static final int OP_TYPE=15;
    public static final int UPPER=27;

    // delegates
    // delegators

    public TerraLexer() {;} 
    public TerraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TerraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/paulofreitas/Desktop/lang/TerraLexer.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:5:7: ( '=' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:5:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:6:11: ( '(' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:6:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:7:12: ( ')' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:7:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:8:13: ( '{' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:8:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:9:14: ( '}' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:9:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "ATTRIBUITION"
    public final void mATTRIBUITION() throws RecognitionException {
        try {
            int _type = ATTRIBUITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:11:13: ( ':' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:11:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTRIBUITION"

    // $ANTLR start "DOMAIN_OBJECT"
    public final void mDOMAIN_OBJECT() throws RecognitionException {
        try {
            int _type = DOMAIN_OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:12:14: ( 'domain_object' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:12:15: 'domain_object'
            {
            match("domain_object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN_OBJECT"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:13:7: ( 'import' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:13:8: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:6: ( 'int' | 'double' | 'float' | 'long' | 'short' | 'boolean' | 'String' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'd':
                {
                alt1=2;
                }
                break;
            case 'f':
                {
                alt1=3;
                }
                break;
            case 'l':
                {
                alt1=4;
                }
                break;
            case 's':
                {
                alt1=5;
                }
                break;
            case 'b':
                {
                alt1=6;
                }
                break;
            case 'S':
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:16: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:27: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:37: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 5 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:46: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 6 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:56: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 7 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:68: 'String'
                    {
                    match("String"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' )
            int alt2=16;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:69: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 7 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:84: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 8 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:97: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 9 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:112: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 10 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:127: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 11 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:137: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 12 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:146: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 13 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:159: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 14 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:171: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 15 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:180: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 16 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:190: 'height'
                    {
                    match("height"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPERTY"

    // $ANTLR start "OPERATION"
    public final void mOPERATION() throws RecognitionException {
        try {
            int _type = OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:10: ( 'operation' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:12: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATION"

    // $ANTLR start "OP_TYPE"
    public final void mOP_TYPE() throws RecognitionException {
        try {
            int _type = OP_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:8: ( 'java' | 'python' | 'groowy' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt3=1;
                }
                break;
            case 'p':
                {
                alt3=2;
                }
                break;
            case 'g':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:30: 'groowy'
                    {
                    match("groowy"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_TYPE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:19:7: ( INTEGER | FLOAT )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:19:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:19:19: FLOAT
                    {
                    mFLOAT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:29: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:29: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:21:17: ( '0' .. '9' ( '0' .. '9' )* )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:21:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:21:28: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:21:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:14: ( LETTER | DIGIT | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:
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
    // $ANTLR end "NAME"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:21: ( NONCONTROL_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\t'||(LA8_0>=' ' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='~')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:21: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "NONCONTROL_CHAR"
    public final void mNONCONTROL_CHAR() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:25:25: ( LETTER | DIGIT | SYMBOL | SPACE )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:
            {
            if ( input.LA(1)=='\t'||(input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='~') ) {
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
    // $ANTLR end "NONCONTROL_CHAR"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:26:16: ( LOWER | UPPER )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:27:15: ( 'a' .. 'z' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:27:17: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:28:15: ( 'A' .. 'Z' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:28:17: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:29:15: ( '0' .. '9' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:29:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:30:15: ( ' ' | '\\t' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
    // $ANTLR end "SPACE"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:32:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||(input.LA(1)>='[' && input.LA(1)<='`')||(input.LA(1)>='{' && input.LA(1)<='~') ) {
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
    // $ANTLR end "SYMBOL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:8: ( ( ( '\\r' )? '\\n' )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:10: ( ( '\\r' )? '\\n' )+
            {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:10: ( ( '\\r' )? '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:11: ( '\\r' )? '\\n'
            	    {
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:11: ( '\\r' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='\r') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:37:11: ( ( SPACE )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:37:13: ( SPACE )+
            {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:37:13: ( SPACE )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:37:13: SPACE
            	    {
            	    mSPACE(); 

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

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | IMPORT | TYPE | PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE )
        int alt12=17;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:17: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 3 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:28: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 4 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:40: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 5 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:53: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 6 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:67: ATTRIBUITION
                {
                mATTRIBUITION(); 

                }
                break;
            case 7 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:80: DOMAIN_OBJECT
                {
                mDOMAIN_OBJECT(); 

                }
                break;
            case 8 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:94: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 9 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:101: TYPE
                {
                mTYPE(); 

                }
                break;
            case 10 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:106: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 11 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:115: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 12 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:125: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 13 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:133: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 14 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:140: NAME
                {
                mNAME(); 

                }
                break;
            case 15 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:145: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 16 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:160: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 17 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:168: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA2_eotS =
        "\25\uffff";
    static final String DFA2_eofS =
        "\25\uffff";
    static final String DFA2_minS =
        "\1\143\3\uffff\1\141\1\uffff\2\141\11\uffff\1\163\3\uffff";
    static final String DFA2_maxS =
        "\1\171\3\uffff\1\157\1\uffff\2\151\11\uffff\1\170\3\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\2\uffff\1\14\1\16\1\17\1\20\1\4"+
        "\1\7\1\12\1\6\1\15\1\uffff\1\11\1\10\1\13";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\10\3\uffff\1\13\1\11\3\uffff\1\7\2\uffff\1\5\1\uffff"+
            "\1\4\3\uffff\1\6\1\12\1\1\1\2",
            "",
            "",
            "",
            "\1\16\3\uffff\1\15\11\uffff\1\14",
            "",
            "\1\17\7\uffff\1\20",
            "\1\21\7\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\4\uffff\1\23",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "15:1: PROPERTY : ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' );";
        }
    }
    static final String DFA4_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA4_maxS =
        "\3\71\2\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2",
            "\1\4\1\uffff\12\2",
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
            return "19:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA12_eotS =
        "\7\uffff\7\33\2\51\12\33\5\uffff\12\33\1\uffff\23\33\1\130\32\33"+
        "\1\uffff\1\51\1\33\1\130\14\33\1\51\4\33\1\u0084\5\33\2\130\5\33"+
        "\1\51\6\33\1\51\2\33\1\uffff\2\33\1\130\1\33\1\u009a\1\33\1\130"+
        "\4\33\1\u0084\4\33\1\51\1\33\1\u0084\2\33\1\uffff\1\130\2\51\3\33"+
        "\1\51\4\33\2\51\12\33\1\u00b8\2\33\3\51\1\uffff\4\33\1\u00bf\1\33"+
        "\1\uffff\3\33\1\51";
    static final String DFA12_eofS =
        "\u00c4\uffff";
    static final String DFA12_minS =
        "\1\11\6\uffff\1\151\1\143\1\154\1\157\1\150\1\157\1\164\2\60\1\157"+
        "\1\141\1\162\2\141\1\151\1\145\1\160\1\141\1\162\5\uffff\1\155\1"+
        "\163\1\160\1\164\2\157\1\156\2\157\1\162\1\uffff\1\154\1\167\1\161"+
        "\1\156\1\145\1\164\1\154\2\163\1\156\1\144\1\151\1\145\1\166\1\157"+
        "\1\141\1\142\1\141\1\157\1\60\1\156\1\141\1\147\1\162\1\154\1\151"+
        "\2\163\1\165\1\147\1\163\1\150\2\151\1\137\1\153\1\137\1\164\1\147"+
        "\1\162\1\141\1\157\1\151\1\154\1\142\1\162\1\uffff\1\60\1\164\1"+
        "\60\1\164\1\145\1\156\2\160\1\151\2\145\1\157\1\144\1\142\1\154"+
        "\1\60\1\154\2\150\1\141\1\60\1\167\1\156\1\145\1\154\1\164\2\60"+
        "\1\141\1\147\2\141\1\162\1\60\2\156\1\141\1\154\2\145\1\60\2\164"+
        "\1\uffff\1\171\1\137\1\60\1\145\1\60\1\156\1\60\2\156\1\145\1\164"+
        "\1\60\1\164\1\145\2\156\1\60\1\151\1\60\1\157\1\144\1\uffff\3\60"+
        "\1\144\1\141\1\151\1\60\2\147\1\157\1\142\2\60\1\164\1\157\2\164"+
        "\1\156\1\152\1\151\1\156\2\150\1\60\1\145\1\157\3\60\1\uffff\1\143"+
        "\1\156\1\164\1\137\1\60\1\164\1\uffff\1\171\1\160\1\145\1\60";
    static final String DFA12_maxS =
        "\1\175\6\uffff\1\157\1\156\1\154\1\157\1\150\1\157\1\164\2\172\2"+
        "\157\1\171\3\151\1\145\1\160\1\141\1\162\5\uffff\1\165\1\163\1\160"+
        "\1\164\2\157\1\156\2\157\1\162\1\uffff\1\154\1\167\1\161\1\156\1"+
        "\145\1\164\1\154\1\163\1\170\1\156\1\144\1\151\1\145\1\166\1\157"+
        "\1\141\1\142\1\141\1\157\1\172\1\156\1\141\1\147\1\162\1\154\1\151"+
        "\2\163\1\165\1\147\1\163\1\150\2\151\1\137\1\153\1\137\1\164\1\147"+
        "\1\162\1\141\1\157\1\151\1\154\1\142\1\162\1\uffff\1\172\1\164\1"+
        "\172\1\164\1\145\1\156\2\160\1\151\2\145\1\157\1\144\1\142\1\154"+
        "\1\172\1\154\2\150\1\141\1\172\1\167\1\156\1\145\1\154\1\164\2\172"+
        "\1\141\1\147\2\141\1\162\1\172\2\156\1\141\1\154\2\145\1\172\2\164"+
        "\1\uffff\1\171\1\137\1\172\1\145\1\172\1\156\1\172\2\156\1\145\1"+
        "\164\1\172\1\164\1\145\2\156\1\172\1\151\1\172\1\157\1\144\1\uffff"+
        "\3\172\1\144\1\141\1\151\1\172\2\147\1\157\1\142\2\172\1\164\1\157"+
        "\2\164\1\156\1\152\1\151\1\156\2\150\1\172\1\145\1\157\3\172\1\uffff"+
        "\1\143\1\156\1\164\1\137\1\172\1\164\1\uffff\1\171\1\160\1\145\1"+
        "\172";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\23\uffff\1\15\1\16\1\17\1\20\1"+
        "\21\12\uffff\1\12\56\uffff\1\11\53\uffff\1\14\25\uffff\1\10\35\uffff"+
        "\1\13\6\uffff\1\7\4\uffff";
    static final String DFA12_specialS =
        "\u00c4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\36\1\35\2\uffff\1\35\22\uffff\1\36\1\uffff\1\34\5\uffff\1"+
            "\2\1\3\6\uffff\12\32\1\6\2\uffff\1\1\3\uffff\22\33\1\15\7\33"+
            "\6\uffff\1\33\1\14\1\20\1\7\1\33\1\11\1\31\1\26\1\10\1\30\1"+
            "\33\1\12\1\24\1\33\1\27\1\22\1\33\1\21\1\13\2\33\1\23\1\25\1"+
            "\16\1\17\1\33\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\5\uffff\1\37",
            "\1\43\11\uffff\1\41\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\52",
            "\1\55\3\uffff\1\54\11\uffff\1\53",
            "\1\56\6\uffff\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62\7\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\71\7\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\4\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\163",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0099",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009b",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a4",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b9",
            "\1\u00ba",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | IMPORT | TYPE | PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE );";
        }
    }
 

}
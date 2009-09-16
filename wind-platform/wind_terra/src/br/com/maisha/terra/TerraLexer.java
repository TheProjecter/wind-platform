// $ANTLR 3.1.2 /home/paulofreitas/Desktop/lang/TerraLexer.g 2009-09-16 19:08:17
 package br.com.maisha.terra; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraLexer extends Lexer {
    public static final int DOMAIN_OBJECT=10;
    public static final int PACKAGE=11;
    public static final int INTEGER=19;
    public static final int SYMBOL=27;
    public static final int LETTER=22;
    public static final int ATTRIBUTE_PROPERTY=15;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=21;
    public static final int WHITESPACE=32;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=20;
    public static final int OPERATION_PROPERTY=16;
    public static final int SPACE=28;
    public static final int EOF=-1;
    public static final int TYPE=13;
    public static final int RIGHT_PAREN=6;
    public static final int NAME=24;
    public static final int IMPORT=12;
    public static final int STRING_LITERAL=26;
    public static final int NEWLINE=31;
    public static final int NONCONTROL_CHAR=25;
    public static final int PROPERTY=14;
    public static final int ASSIGN=4;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_PAREN=5;
    public static final int LOWER=29;
    public static final int DIGIT=23;
    public static final int OPERATION=17;
    public static final int OP_TYPE=18;
    public static final int UPPER=30;

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

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:13:8: ( 'package' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:13:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:7: ( 'import' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:14:8: 'import'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:6: ( 'int' | 'double' | 'float' | 'long' | 'short' | 'boolean' | 'String' )
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
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:16: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:27: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:37: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 5 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:46: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 6 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:56: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 7 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:15:68: 'String'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 'x':
                {
                alt2=1;
                }
                break;
            case 'y':
                {
                alt2=2;
                }
                break;
            case 'c':
                {
                alt2=3;
                }
                break;
            case 'r':
                {
                alt2=4;
                }
                break;
            case 'p':
                {
                alt2=5;
                }
                break;
            case 'd':
                {
                alt2=6;
                }
                break;
            case 'v':
                {
                alt2=7;
                }
                break;
            case 'i':
                {
                alt2=8;
                }
                break;
            case 'w':
                {
                alt2=9;
                }
                break;
            case 'h':
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:70: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 7 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:83: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 8 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:95: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 9 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:104: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 10 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:16:114: 'height'
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

    // $ANTLR start "ATTRIBUTE_PROPERTY"
    public final void mATTRIBUTE_PROPERTY() throws RecognitionException {
        try {
            int _type = ATTRIBUTE_PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:19: ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:21: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:36: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:49: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 4 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:64: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 5 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:79: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 6 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:89: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 7 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:17:98: 'event'
                    {
                    match("event"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTRIBUTE_PROPERTY"

    // $ANTLR start "OPERATION_PROPERTY"
    public final void mOPERATION_PROPERTY() throws RecognitionException {
        try {
            int _type = OPERATION_PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:18:19: ( 'class' | 'file' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='c') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:18:21: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:18:31: 'file'
                    {
                    match("file"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATION_PROPERTY"

    // $ANTLR start "OPERATION"
    public final void mOPERATION() throws RecognitionException {
        try {
            int _type = OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:19:10: ( 'operation' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:19:12: 'operation'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:8: ( 'java' | 'python' | 'groowy' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt5=1;
                }
                break;
            case 'p':
                {
                alt5=2;
                }
                break;
            case 'g':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:20:30: 'groowy'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:7: ( INTEGER | FLOAT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraLexer.g:22:19: FLOAT
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:29: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:23:29: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:24:17: ( '0' .. '9' ( '0' .. '9' )* )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:24:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:24:28: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:24:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:25:5: ( LETTER ( LETTER | DIGIT | '_' | '.' )* )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:25:7: LETTER ( LETTER | DIGIT | '_' | '.' )*
            {
            mLETTER(); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:25:14: ( LETTER | DIGIT | '_' | '.' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='.'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:26:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:26:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:26:21: ( NONCONTROL_CHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0>=' ' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='~')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:26:21: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:29:25: ( LETTER | DIGIT | SYMBOL | SPACE )
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:30:16: ( LOWER | UPPER )
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:31:15: ( 'a' .. 'z' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:31:17: 'a' .. 'z'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:32:15: ( 'A' .. 'Z' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:32:17: 'A' .. 'Z'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:33:15: ( '0' .. '9' )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:33:17: '0' .. '9'
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:34:15: ( ' ' | '\\t' )
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:36:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:8: ( ( ( '\\r' )? '\\n' )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:10: ( ( '\\r' )? '\\n' )+
            {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:10: ( ( '\\r' )? '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:11: ( '\\r' )? '\\n'
            	    {
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:11: ( '\\r' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0=='\r') ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /home/paulofreitas/Desktop/lang/TerraLexer.g:40:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:41:11: ( ( SPACE )+ )
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:41:13: ( SPACE )+
            {
            // /home/paulofreitas/Desktop/lang/TerraLexer.g:41:13: ( SPACE )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraLexer.g:41:13: SPACE
            	    {
            	    mSPACE(); 

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
        // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | TYPE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
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
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:94: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 9 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:102: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 10 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:109: TYPE
                {
                mTYPE(); 

                }
                break;
            case 11 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:114: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 12 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:123: ATTRIBUTE_PROPERTY
                {
                mATTRIBUTE_PROPERTY(); 

                }
                break;
            case 13 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:142: OPERATION_PROPERTY
                {
                mOPERATION_PROPERTY(); 

                }
                break;
            case 14 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:161: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 15 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:171: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 16 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:179: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 17 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:186: NAME
                {
                mNAME(); 

                }
                break;
            case 18 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:191: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 19 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:206: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 20 :
                // /home/paulofreitas/Desktop/lang/TerraLexer.g:1:214: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\145\1\uffff\2\141\3\uffff\1\163\3\uffff";
    static final String DFA3_maxS =
        "\1\166\1\uffff\1\145\1\151\3\uffff\1\170\3\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\2\1\5\1\uffff\1\4\1\3\1\6";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\7\uffff\1\3\4\uffff\1\2\3\uffff\1\1",
            "",
            "\1\6\3\uffff\1\5",
            "\1\7\7\uffff\1\10",
            "",
            "",
            "",
            "\1\12\4\uffff\1\11",
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
            return "17:1: ATTRIBUTE_PROPERTY : ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' );";
        }
    }
    static final String DFA6_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA6_maxS =
        "\3\71\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2",
            "\1\4\1\uffff\12\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "22:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA14_eotS =
        "\7\uffff\10\34\2\56\12\34\5\uffff\16\34\1\uffff\26\34\1\144\36\34"+
        "\1\uffff\1\56\1\34\1\u0084\1\144\15\34\1\u0092\3\34\1\u0096\10\34"+
        "\1\144\1\uffff\1\144\3\34\1\u0084\2\34\1\u0092\2\34\1\56\2\34\1"+
        "\uffff\1\34\1\u0092\1\34\1\uffff\2\34\1\144\3\34\1\u0096\1\u00af"+
        "\1\34\1\144\5\34\1\56\3\34\1\u0096\2\34\1\u00bb\1\34\1\uffff\1\144"+
        "\2\56\1\34\1\56\5\34\1\56\1\uffff\1\34\1\u0092\11\34\1\u00cd\2\34"+
        "\3\u0092\1\uffff\4\34\1\u00d4\1\34\1\uffff\3\34\1\56";
    static final String DFA14_eofS =
        "\u00d9\uffff";
    static final String DFA14_minS =
        "\1\11\6\uffff\1\151\1\141\1\143\1\151\1\157\1\150\1\157\1\164\2"+
        "\56\1\154\2\141\1\151\1\145\1\141\1\166\1\160\1\141\1\162\5\uffff"+
        "\1\155\1\163\1\143\1\145\1\164\1\160\1\164\2\157\1\154\1\156\2\157"+
        "\1\162\1\uffff\1\154\1\141\1\167\1\161\1\156\1\163\1\154\1\144\1"+
        "\151\1\163\1\156\2\145\1\166\1\157\1\141\1\142\1\141\1\153\1\163"+
        "\1\150\1\157\1\56\1\156\1\141\1\145\1\147\1\162\1\154\1\151\3\163"+
        "\1\165\1\147\2\151\1\164\1\147\1\137\1\153\1\137\1\156\1\162\1\141"+
        "\1\157\1\151\1\154\1\142\1\141\1\145\1\157\1\162\1\uffff\1\56\1"+
        "\164\2\56\1\164\1\145\1\156\1\160\1\163\1\160\1\151\1\145\1\142"+
        "\1\144\2\150\1\154\1\56\1\154\1\164\1\141\1\56\1\167\1\156\1\145"+
        "\1\154\1\147\2\156\1\164\1\56\1\uffff\1\56\1\141\1\147\1\141\1\56"+
        "\1\141\1\162\1\56\1\154\1\141\1\56\1\164\1\145\1\uffff\1\145\1\56"+
        "\1\164\1\uffff\1\171\1\137\1\56\2\145\1\164\2\56\1\156\1\56\2\156"+
        "\2\145\1\164\1\56\2\156\1\151\1\56\1\157\1\144\1\56\1\141\1\uffff"+
        "\3\56\1\144\1\56\1\151\2\147\1\157\1\142\1\56\1\uffff\1\164\1\56"+
        "\1\157\2\164\1\156\1\152\1\151\1\156\2\150\1\56\1\145\1\157\3\56"+
        "\1\uffff\1\143\1\156\1\164\1\137\1\56\1\164\1\uffff\1\171\1\160"+
        "\1\145\1\56";
    static final String DFA14_maxS =
        "\1\175\6\uffff\1\157\1\171\1\156\1\154\1\157\1\150\1\157\1\164\2"+
        "\172\2\157\2\151\1\145\1\151\1\166\1\160\1\141\1\162\5\uffff\1\165"+
        "\1\163\1\143\1\145\1\164\1\160\1\164\2\157\1\154\1\156\2\157\1\162"+
        "\1\uffff\1\154\1\141\1\167\1\161\1\156\1\163\1\154\1\144\1\151\1"+
        "\170\1\156\2\145\1\166\1\157\1\141\1\142\1\141\1\153\1\163\1\150"+
        "\1\157\1\172\1\156\1\141\1\145\1\147\1\162\1\154\1\151\3\163\1\165"+
        "\1\147\2\151\1\164\1\147\1\137\1\153\1\137\1\156\1\162\1\141\1\157"+
        "\1\151\1\154\1\142\1\141\1\145\1\157\1\162\1\uffff\1\172\1\164\2"+
        "\172\1\164\1\145\1\156\1\160\1\163\1\160\1\151\1\145\1\142\1\144"+
        "\2\150\1\154\1\172\1\154\1\164\1\141\1\172\1\167\1\156\1\145\1\154"+
        "\1\147\2\156\1\164\1\172\1\uffff\1\172\1\141\1\147\1\141\1\172\1"+
        "\141\1\162\1\172\1\154\1\141\1\172\1\164\1\145\1\uffff\1\145\1\172"+
        "\1\164\1\uffff\1\171\1\137\1\172\2\145\1\164\2\172\1\156\1\172\2"+
        "\156\2\145\1\164\1\172\2\156\1\151\1\172\1\157\1\144\1\172\1\141"+
        "\1\uffff\3\172\1\144\1\172\1\151\2\147\1\157\1\142\1\172\1\uffff"+
        "\1\164\1\172\1\157\2\164\1\156\1\152\1\151\1\156\2\150\1\172\1\145"+
        "\1\157\3\172\1\uffff\1\143\1\156\1\164\1\137\1\172\1\164\1\uffff"+
        "\1\171\1\160\1\145\1\172";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\24\uffff\1\20\1\21\1\22\1\23\1"+
        "\24\16\uffff\1\13\65\uffff\1\12\37\uffff\1\15\15\uffff\1\14\3\uffff"+
        "\1\17\30\uffff\1\11\13\uffff\1\10\21\uffff\1\16\6\uffff\1\7\4\uffff";
    static final String DFA14_specialS =
        "\u00d9\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\37\1\36\2\uffff\1\36\22\uffff\1\37\1\uffff\1\35\5\uffff\1"+
            "\2\1\3\6\uffff\12\33\1\6\2\uffff\1\1\3\uffff\22\34\1\16\7\34"+
            "\6\uffff\1\34\1\15\1\21\1\7\1\27\1\12\1\32\1\25\1\11\1\31\1"+
            "\34\1\13\1\26\1\34\1\30\1\10\1\34\1\22\1\14\2\34\1\23\1\24\1"+
            "\17\1\20\1\34\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\5\uffff\1\40",
            "\1\42\20\uffff\1\43\6\uffff\1\44",
            "\1\47\11\uffff\1\45\1\46",
            "\1\51\2\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\60\2\uffff\1\57",
            "\1\63\3\uffff\1\62\11\uffff\1\61",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70\7\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\76\7\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\4\uffff\1\126",
            "\1\130",
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
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
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
            "\1\163",
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
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0083",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a2",
            "\1\u00a3",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a4",
            "\1\u00a5",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b0",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b9",
            "\1\u00ba",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00bc",
            "",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00bd",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00c3",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ce",
            "\1\u00cf",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\34\1\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
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
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | TYPE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE );";
        }
    }
 

}
// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g 2010-06-10 15:10:16
 package br.com.maisha.terra; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraLexer extends Lexer {
    public static final int INTEGER=20;
    public static final int DOMAIN_OBJECT=10;
    public static final int PACKAGE=11;
    public static final int SYMBOL=29;
    public static final int LETTER=23;
    public static final int ATTRIBUTE_PROPERTY=16;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=22;
    public static final int WHITESPACE=34;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=21;
    public static final int OPERATION_PROPERTY=17;
    public static final int VALIDATION_RULE=13;
    public static final int SPACE=30;
    public static final int EOF=-1;
    public static final int TYPE=14;
    public static final int RIGHT_PAREN=6;
    public static final int NAME=25;
    public static final int IMPORT=12;
    public static final int STRING_LITERAL=27;
    public static final int NEWLINE=33;
    public static final int NONCONTROL_CHAR=26;
    public static final int PROPERTY=15;
    public static final int ASSIGN=4;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_PAREN=5;
    public static final int LOWER=31;
    public static final int DIGIT=24;
    public static final int OPERATION=18;
    public static final int EXPRESSION=28;
    public static final int OP_TYPE=19;
    public static final int UPPER=32;

    // delegates
    // delegators

    public TerraLexer() {;} 
    public TerraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TerraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:5:7: ( '=' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:5:9: '='
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:6:11: ( '(' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:6:13: '('
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:7:12: ( ')' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:7:14: ')'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:8:13: ( '{' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:8:15: '{'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:9:14: ( '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:9:16: '}'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:11:13: ( ':' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:11:14: ':'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:12:14: ( 'domain_object' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:12:15: 'domain_object'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:13:8: ( 'package' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:13:9: 'package'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:14:7: ( 'import' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:14:8: 'import'
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

    // $ANTLR start "VALIDATION_RULE"
    public final void mVALIDATION_RULE() throws RecognitionException {
        try {
            int _type = VALIDATION_RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:15:16: ( 'validationRule' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:15:18: 'validationRule'
            {
            match("validationRule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDATION_RULE"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:6: ( 'Integer' | 'Double' | 'Float' | 'Long' | 'Short' | 'Boolean' | 'String' | 'Date' )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:8: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:20: 'Double'
                    {
                    match("Double"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:31: 'Float'
                    {
                    match("Float"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:41: 'Long'
                    {
                    match("Long"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:50: 'Short'
                    {
                    match("Short"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:60: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:72: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:16:83: 'Date'
                    {
                    match("Date"); 


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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' | 'tooltip' )
            int alt2=11;
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
            case 't':
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:70: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:83: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:95: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:104: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:114: 'height'
                    {
                    match("height"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:17:125: 'tooltip'
                    {
                    match("tooltip"); 


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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:19: ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:21: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:36: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:49: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:64: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:79: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:89: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:18:98: 'event'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:19:19: ( 'class' | 'file' | 'validWhen' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt4=1;
                }
                break;
            case 'f':
                {
                alt4=2;
                }
                break;
            case 'v':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:19:21: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:19:31: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:19:40: 'validWhen'
                    {
                    match("validWhen"); 


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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:20:10: ( 'operation' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:20:12: 'operation'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:22:8: ( 'java' | 'python' | 'groovy' )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:22:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:22:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:22:30: 'groovy'
                    {
                    match("groovy"); 


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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:24:7: ( INTEGER | FLOAT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:24:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:24:19: FLOAT
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:25:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:25:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:25:29: ( '0' .. '9' )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:25:29: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:26:17: ( '0' .. '9' ( '0' .. '9' )* )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:26:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:26:28: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:26:28: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:27:5: ( LETTER ( LETTER | DIGIT | '.' | '_' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:27:7: LETTER ( LETTER | DIGIT | '.' | '_' )+
            {
            mLETTER(); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:27:14: ( LETTER | DIGIT | '.' | '_' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='.'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:
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
    // $ANTLR end "NAME"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:28:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:28:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:28:21: ( NONCONTROL_CHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0>=' ' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='~')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:28:21: NONCONTROL_CHAR
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

    // $ANTLR start "EXPRESSION"
    public final void mEXPRESSION() throws RecognitionException {
        try {
            int _type = EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:31:2: ( '${' ( NONCONTROL_CHAR )+ '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:31:4: '${' ( NONCONTROL_CHAR )+ '}'
            {
            match("${"); 

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:31:8: ( NONCONTROL_CHAR )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='}') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='\t'||(LA11_1>=' ' && LA11_1<='!')||(LA11_1>='#' && LA11_1<='~')) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0=='\t'||(LA11_0>=' ' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='|')||LA11_0=='~') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:31:8: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

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

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPRESSION"

    // $ANTLR start "NONCONTROL_CHAR"
    public final void mNONCONTROL_CHAR() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:33:25: ( LETTER | DIGIT | SYMBOL | SPACE )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:34:16: ( LOWER | UPPER )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:35:15: ( 'a' .. 'z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:35:17: 'a' .. 'z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:36:15: ( 'A' .. 'Z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:36:17: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:37:15: ( '0' .. '9' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:37:17: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:38:15: ( ' ' | '\\t' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:40:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:8: ( ( ( '\\r' )? '\\n' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:10: ( ( '\\r' )? '\\n' )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:10: ( ( '\\r' )? '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:11: ( '\\r' )? '\\n'
            	    {
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:11: ( '\\r' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0=='\r') ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:44:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:45:11: ( ( SPACE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:45:13: ( SPACE )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:45:13: ( SPACE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:45:13: SPACE
            	    {
            	    mSPACE(); 

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
        // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | TYPE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | EXPRESSION | NEWLINE | WHITESPACE )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:17: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:28: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:40: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:53: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:67: ATTRIBUITION
                {
                mATTRIBUITION(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:80: DOMAIN_OBJECT
                {
                mDOMAIN_OBJECT(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:94: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:102: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:109: VALIDATION_RULE
                {
                mVALIDATION_RULE(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:125: TYPE
                {
                mTYPE(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:130: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:139: ATTRIBUTE_PROPERTY
                {
                mATTRIBUTE_PROPERTY(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:158: OPERATION_PROPERTY
                {
                mOPERATION_PROPERTY(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:177: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:187: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:195: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:202: NAME
                {
                mNAME(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:207: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:222: EXPRESSION
                {
                mEXPRESSION(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:233: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraLexer.g:1:241: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\1\102\1\uffff\1\141\2\uffff\1\150\5\uffff";
    static final String DFA1_maxS =
        "\1\123\1\uffff\1\157\2\uffff\1\164\5\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\6\1\2\1\10\1\5\1\7";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\1\uffff\1\2\1\uffff\1\3\2\uffff\1\1\2\uffff\1\4\6\uffff"+
            "\1\5",
            "",
            "\1\10\15\uffff\1\7",
            "",
            "",
            "\1\11\13\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "16:1: TYPE : ( 'Integer' | 'Double' | 'Float' | 'Long' | 'Short' | 'Boolean' | 'String' | 'Date' );";
        }
    }
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
            return "18:1: ATTRIBUTE_PROPERTY : ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' );";
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
            return "24:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA15_eotS =
        "\21\uffff\2\65\21\uffff\21\37\1\uffff\66\37\1\65\4\37\1\u0091\1"+
        "\37\1\u0091\14\37\1\u009f\2\37\1\u00a2\1\37\1\u00a4\13\37\1\uffff"+
        "\2\u0091\3\37\1\u00a2\2\37\1\u009f\1\65\3\37\1\uffff\1\37\1\u009f"+
        "\1\uffff\1\37\1\uffff\5\37\1\u00a4\1\u00c0\4\37\2\u0091\4\37\1\65"+
        "\4\37\1\u00a4\2\37\1\u00cf\1\37\1\uffff\2\37\1\65\2\u0091\2\65\1"+
        "\37\1\65\4\37\1\65\1\uffff\3\37\1\u009f\6\37\1\u00a2\2\37\1\u00e3"+
        "\2\37\3\u009f\1\uffff\6\37\1\u00ed\2\37\1\uffff\1\37\1\u00f1\1\37"+
        "\1\uffff\1\37\1\65";
    static final String DFA15_eofS =
        "\u00f4\uffff";
    static final String DFA15_minS =
        "\1\11\6\uffff\27\56\6\uffff\1\155\1\163\1\143\1\145\1\164\1\160"+
        "\1\157\1\154\1\163\1\164\1\165\1\164\1\157\1\156\1\157\1\162\1\157"+
        "\1\uffff\1\154\1\141\1\167\1\161\1\156\1\144\1\151\1\157\1\163\1"+
        "\156\1\145\1\154\1\145\1\166\1\157\2\141\1\153\1\163\1\150\1\157"+
        "\1\156\2\151\1\145\1\142\1\145\1\141\1\147\1\162\1\151\1\154\3\163"+
        "\1\165\1\147\1\164\1\147\1\154\1\137\1\153\1\137\1\156\1\145\1\162"+
        "\1\141\1\157\1\151\1\142\1\141\1\145\1\157\1\162\1\56\1\144\1\142"+
        "\1\147\1\154\1\56\1\164\1\56\1\164\1\156\1\145\1\160\1\163\1\160"+
        "\1\151\1\145\2\150\1\164\1\154\1\56\1\154\1\164\1\56\1\141\1\56"+
        "\1\166\1\156\1\154\1\147\2\156\1\164\1\127\1\154\2\145\1\uffff\2"+
        "\56\1\147\2\141\1\56\1\141\1\162\2\56\1\164\1\151\1\145\1\uffff"+
        "\1\145\1\56\1\uffff\1\164\1\uffff\1\171\1\137\2\145\1\164\2\56\1"+
        "\164\1\150\1\145\1\162\2\56\3\156\1\145\1\56\1\160\2\156\1\151\1"+
        "\56\1\157\1\144\1\56\1\141\1\uffff\1\151\1\145\5\56\1\144\1\56\2"+
        "\147\1\157\1\142\1\56\1\uffff\1\164\1\157\1\156\1\56\2\164\1\156"+
        "\1\152\1\151\1\156\1\56\2\150\1\56\1\145\1\157\3\56\1\uffff\1\143"+
        "\1\156\1\165\1\164\1\137\1\154\1\56\1\164\1\145\1\uffff\1\171\1"+
        "\56\1\160\1\uffff\1\145\1\56";
    static final String DFA15_maxS =
        "\1\175\6\uffff\27\172\6\uffff\1\155\1\163\1\143\1\145\1\164\1\160"+
        "\1\157\1\154\1\163\1\164\1\165\1\164\1\157\1\156\1\157\1\162\1\157"+
        "\1\uffff\1\154\1\141\1\167\1\161\1\156\1\144\1\151\1\157\1\170\1"+
        "\156\1\145\1\154\1\145\1\166\1\157\2\141\1\153\1\163\1\150\1\157"+
        "\1\156\2\151\1\145\1\142\1\145\1\141\1\147\1\162\1\151\1\154\3\163"+
        "\1\165\1\147\1\164\1\147\1\154\1\137\1\153\1\137\1\156\1\145\1\162"+
        "\1\141\1\157\1\151\1\142\1\141\1\145\1\157\1\162\1\172\1\144\1\142"+
        "\1\147\1\154\1\172\1\164\1\172\1\164\1\156\1\145\1\160\1\163\1\160"+
        "\1\151\1\145\2\150\1\164\1\154\1\172\1\154\1\164\1\172\1\141\1\172"+
        "\1\166\1\156\1\154\1\147\2\156\1\164\1\141\1\154\2\145\1\uffff\2"+
        "\172\1\147\2\141\1\172\1\141\1\162\2\172\1\164\1\151\1\145\1\uffff"+
        "\1\145\1\172\1\uffff\1\164\1\uffff\1\171\1\137\2\145\1\164\2\172"+
        "\1\164\1\150\1\145\1\162\2\172\3\156\1\145\1\172\1\160\2\156\1\151"+
        "\1\172\1\157\1\144\1\172\1\141\1\uffff\1\151\1\145\5\172\1\144\1"+
        "\172\2\147\1\157\1\142\1\172\1\uffff\1\164\1\157\1\156\1\172\2\164"+
        "\1\156\1\152\1\151\1\156\1\172\2\150\1\172\1\145\1\157\3\172\1\uffff"+
        "\1\143\1\156\1\165\1\164\1\137\1\154\1\172\1\164\1\145\1\uffff\1"+
        "\171\1\172\1\160\1\uffff\1\145\1\172";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\27\uffff\1\21\1\22\1\23\1\24\1"+
        "\25\1\26\21\uffff\1\14\133\uffff\1\13\15\uffff\1\15\2\uffff\1\16"+
        "\1\uffff\1\20\33\uffff\1\11\16\uffff\1\10\23\uffff\1\17\11\uffff"+
        "\1\7\3\uffff\1\12\2\uffff";
    static final String DFA15_specialS =
        "\u00f4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\43\1\42\2\uffff\1\42\22\uffff\1\43\1\uffff\1\40\1\uffff"+
            "\1\41\3\uffff\1\2\1\3\6\uffff\12\36\1\6\2\uffff\1\1\3\uffff"+
            "\1\37\1\20\1\37\1\14\1\37\1\15\2\37\1\13\2\37\1\16\6\37\1\17"+
            "\7\37\6\uffff\2\37\1\23\1\7\1\31\1\32\1\35\1\26\1\11\1\34\2"+
            "\37\1\30\1\37\1\33\1\10\1\37\1\24\1\37\1\27\1\37\1\12\1\25\1"+
            "\21\1\22\1\37\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\10"+
            "\37\1\45\5\37\1\44\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\46"+
            "\20\37\1\47\6\37\1\50\1\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\2\37"+
            "\1\52\11\37\1\51\15\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\53"+
            "\7\37\1\54\21\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\15"+
            "\37\1\55\14\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\57"+
            "\15\37\1\56\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\13"+
            "\37\1\60\16\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\16"+
            "\37\1\61\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\7\37"+
            "\1\62\13\37\1\63\6\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\16"+
            "\37\1\64\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\13"+
            "\37\1\67\2\37\1\66\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\72"+
            "\3\37\1\71\11\37\1\70\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\10"+
            "\37\1\73\21\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\4\37"+
            "\1\74\25\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\16"+
            "\37\1\75\13\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\76"+
            "\7\37\1\77\21\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\25"+
            "\37\1\100\4\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\10"+
            "\37\1\101\21\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\17"+
            "\37\1\102\12\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\1\103"+
            "\31\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\21"+
            "\37\1\104\10\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\4\uffff\1\136",
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
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u0092",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00a0",
            "\1\u00a1",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00a3",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ad\11\uffff\1\u00ac",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00b4",
            "\1\u00b5",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00cd",
            "\1\u00ce",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00d3",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00e1",
            "\1\u00e2",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00e4",
            "\1\u00e5",
            "\1\37\1\uffff\12\37\7\uffff\21\37\1\u00e6\10\37\4\uffff\1"+
            "\37\1\uffff\32\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\37\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32"+
            "\37"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | TYPE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | EXPRESSION | NEWLINE | WHITESPACE );";
        }
    }
 

}
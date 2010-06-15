// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g 2010-06-15 11:28:49
package br.com.maisha.terra;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraParserLexer extends Lexer {
    public static final int INTEGER=19;
    public static final int PACKAGE=11;
    public static final int DOMAIN_OBJECT=10;
    public static final int SYMBOL=29;
    public static final int LETTER=22;
    public static final int ATTRIBUTE_PROPERTY=15;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=21;
    public static final int WHITESPACE=34;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=20;
    public static final int OPERATION_PROPERTY=16;
    public static final int VALIDATION_RULE=13;
    public static final int EOF=-1;
    public static final int SPACE=30;
    public static final int RIGHT_PAREN=6;
    public static final int IMPORT=12;
    public static final int NAME=24;
    public static final int STRING_LITERAL=26;
    public static final int NEWLINE=33;
    public static final int NONCONTROL_CHAR=25;
    public static final int PROPERTY=14;
    public static final int RIGHT_BRACKET=8;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int TYPE2=27;
    public static final int DIGIT=23;
    public static final int LOWER=31;
    public static final int OPERATION=17;
    public static final int EXPRESSION=28;
    public static final int OP_TYPE=18;
    public static final int UPPER=32;

    // delegates
    // delegators

    public TerraParserLexer() {;} 
    public TerraParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TerraParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:39:7: ( '=' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:39:9: '='
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:40:11: ( '(' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:40:13: '('
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:41:12: ( ')' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:41:14: ')'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:42:13: ( '{' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:42:15: '{'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:14: ( '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:16: '}'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:45:13: ( ':' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:45:14: ':'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:46:14: ( 'domain_object' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:46:15: 'domain_object'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:47:8: ( 'package' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:47:9: 'package'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:48:7: ( 'import' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:48:8: 'import'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:49:16: ( 'validationRule' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:49:18: 'validationRule'
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

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' | 'tooltip' )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 'x':
                {
                alt1=1;
                }
                break;
            case 'y':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            case 'r':
                {
                alt1=4;
                }
                break;
            case 'p':
                {
                alt1=5;
                }
                break;
            case 'd':
                {
                alt1=6;
                }
                break;
            case 'v':
                {
                alt1=7;
                }
                break;
            case 'i':
                {
                alt1=8;
                }
                break;
            case 'w':
                {
                alt1=9;
                }
                break;
            case 'h':
                {
                alt1=10;
                }
                break;
            case 't':
                {
                alt1=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:70: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:83: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:95: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:104: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:114: 'height'
                    {
                    match("height"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:125: 'tooltip'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:19: ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:21: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:36: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:49: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:64: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:79: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:89: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:98: 'event'
                    {
                    match("event"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:108: 'toString'
                    {
                    match("toString"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:121: 'onetomany'
                    {
                    match("onetomany"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:135: 'manytoone'
                    {
                    match("manytoone"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:149: 'transient'
                    {
                    match("transient"); 


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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:19: ( 'class' | 'file' | 'validWhen' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt3=1;
                }
                break;
            case 'f':
                {
                alt3=2;
                }
                break;
            case 'v':
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:21: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:31: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:40: 'validWhen'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:10: ( 'operation' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:12: 'operation'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:8: ( 'java' | 'python' | 'groovy' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'j':
                {
                alt4=1;
                }
                break;
            case 'p':
                {
                alt4=2;
                }
                break;
            case 'g':
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:30: 'groovy'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:7: ( INTEGER | FLOAT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:19: FLOAT
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:58:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:58:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:58:29: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:58:29: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:17: ( '0' .. '9' ( '0' .. '9' )* )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:28: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:5: ( LETTER ( LETTER | DIGIT | '.' | '_' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:7: LETTER ( LETTER | DIGIT | '.' | '_' )+
            {
            mLETTER(); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:14: ( LETTER | DIGIT | '.' | '_' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:21: ( NONCONTROL_CHAR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||(LA9_0>=' ' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='~')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:21: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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

    // $ANTLR start "TYPE2"
    public final void mTYPE2() throws RecognitionException {
        try {
            int _type = TYPE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:7: ( ( LETTER )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:9: ( LETTER )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:9: ( LETTER )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:9: LETTER
            	    {
            	    mLETTER(); 

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
    // $ANTLR end "TYPE2"

    // $ANTLR start "EXPRESSION"
    public final void mEXPRESSION() throws RecognitionException {
        try {
            int _type = EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:66:2: ( '${' ( NONCONTROL_CHAR )+ '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:66:4: '${' ( NONCONTROL_CHAR )+ '}'
            {
            match("${"); 

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:66:8: ( NONCONTROL_CHAR )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:66:8: NONCONTROL_CHAR
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:68:25: ( LETTER | DIGIT | SYMBOL | SPACE )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:69:16: ( LOWER | UPPER )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:15: ( 'a' .. 'z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:17: 'a' .. 'z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:71:15: ( 'A' .. 'Z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:71:17: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:72:15: ( '0' .. '9' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:72:17: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:15: ( ' ' | '\\t' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:75:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:8: ( ( ( '\\r' )? '\\n' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:10: ( ( '\\r' )? '\\n' )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:10: ( ( '\\r' )? '\\n' )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:11: ( '\\r' )? '\\n'
            	    {
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:11: ( '\\r' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0=='\r') ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:79:11: '\\r'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:80:11: ( ( SPACE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:80:13: ( SPACE )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:80:13: ( SPACE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:80:13: SPACE
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
        // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:17: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:28: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:40: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:53: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:67: ATTRIBUITION
                {
                mATTRIBUITION(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:80: DOMAIN_OBJECT
                {
                mDOMAIN_OBJECT(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:94: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:102: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:109: VALIDATION_RULE
                {
                mVALIDATION_RULE(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:125: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:134: ATTRIBUTE_PROPERTY
                {
                mATTRIBUTE_PROPERTY(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:153: OPERATION_PROPERTY
                {
                mOPERATION_PROPERTY(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:172: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:182: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:190: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:197: NAME
                {
                mNAME(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:202: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:217: TYPE2
                {
                mTYPE2(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:223: EXPRESSION
                {
                mEXPRESSION(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:234: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:242: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA2_eotS =
        "\20\uffff";
    static final String DFA2_eofS =
        "\20\uffff";
    static final String DFA2_minS =
        "\1\145\1\uffff\2\141\1\uffff\1\157\3\uffff\1\156\6\uffff";
    static final String DFA2_maxS =
        "\1\166\1\uffff\1\145\1\151\1\uffff\1\162\3\uffff\1\170\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\2\uffff\1\7\1\uffff\1\11\1\2\1\5\1\uffff\1\4\1\10"+
        "\1\13\1\3\1\6\1\12";
    static final String DFA2_specialS =
        "\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\7\uffff\1\3\1\uffff\1\6\2\uffff\1\2\1\uffff\1\5\1\uffff"+
            "\1\1",
            "",
            "\1\10\3\uffff\1\7",
            "\1\11\7\uffff\1\12",
            "",
            "\1\13\2\uffff\1\14",
            "",
            "",
            "",
            "\1\17\4\uffff\1\16\4\uffff\1\15",
            "",
            "",
            "",
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
            return "51:1: ATTRIBUTE_PROPERTY : ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' );";
        }
    }
    static final String DFA5_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA5_maxS =
        "\3\71\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2",
            "\1\4\1\uffff\12\2",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "57:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA15_eotS =
        "\7\uffff\4\40\2\52\13\40\1\uffff\1\40\4\uffff\2\42\1\uffff\1\42"+
        "\1\uffff\7\42\1\uffff\64\42\1\52\15\42\1\u0089\5\42\1\u008f\1\u0090"+
        "\12\42\1\u008f\2\42\1\u0089\1\52\5\42\1\uffff\2\42\1\u0089\2\42"+
        "\2\uffff\5\42\1\u0090\1\u00ac\6\42\1\52\10\42\1\u0090\2\42\1\u00bd"+
        "\1\42\1\uffff\2\42\3\52\1\42\1\52\10\42\1\52\1\uffff\3\42\2\u0089"+
        "\11\42\1\u008f\1\u0089\1\42\1\u0089\1\42\1\u0089\1\u00d8\2\42\3"+
        "\u0089\1\uffff\6\42\1\u00e2\2\42\1\uffff\1\42\1\u00e6\1\42\1\uffff"+
        "\1\42\1\52";
    static final String DFA15_eofS =
        "\u00e9\uffff";
    static final String DFA15_minS =
        "\1\11\6\uffff\21\56\1\uffff\1\56\4\uffff\2\101\1\uffff\1\101\1"+
        "\uffff\7\101\1\uffff\64\101\1\56\14\101\1\154\1\56\1\101\1\154\3"+
        "\101\2\56\12\101\1\56\2\101\2\56\4\101\1\145\1\uffff\1\101\1\145"+
        "\1\56\2\101\2\uffff\5\101\2\56\6\101\1\56\3\101\1\156\1\101\1\156"+
        "\2\101\1\56\1\157\1\101\1\56\1\101\1\uffff\2\101\3\56\1\101\1\56"+
        "\2\101\1\147\1\101\1\147\2\101\1\142\1\56\1\uffff\3\101\2\56\1\101"+
        "\1\164\1\101\1\164\2\101\1\152\2\101\2\56\1\150\1\56\1\150\2\56"+
        "\1\145\1\101\3\56\1\uffff\1\143\2\101\1\164\2\101\1\56\1\164\1\101"+
        "\1\uffff\1\171\1\56\1\160\1\uffff\1\145\1\56";
    static final String DFA15_maxS =
        "\1\175\6\uffff\21\172\1\uffff\1\172\4\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\7\172\1\uffff\101\172\1\154\2\172\1\154\30\172\1\145\1"+
        "\uffff\1\172\1\145\3\172\2\uffff\21\172\1\156\1\172\1\156\3\172"+
        "\1\157\3\172\1\uffff\11\172\1\147\1\172\1\147\2\172\1\142\1\172"+
        "\1\uffff\6\172\1\164\1\172\1\164\2\172\1\152\4\172\1\150\1\172\1"+
        "\150\2\172\1\145\4\172\1\uffff\1\143\2\172\1\164\3\172\1\164\1\172"+
        "\1\uffff\1\171\1\172\1\160\1\uffff\1\145\1\172";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\21\uffff\1\20\1\uffff\1\22\1\24"+
        "\1\25\1\26\2\uffff\1\23\1\uffff\1\21\7\uffff\1\13\136\uffff\1\14"+
        "\5\uffff\1\15\1\17\33\uffff\1\11\20\uffff\1\10\32\uffff\1\16\11"+
        "\uffff\1\7\3\uffff\1\12\2\uffff";
    static final String DFA15_specialS =
        "\u00e9\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\35\1\34\2\uffff\1\34\22\uffff\1\35\1\uffff\1\32\1\uffff"+
            "\1\33\3\uffff\1\2\1\3\6\uffff\12\30\1\6\2\uffff\1\1\3\uffff"+
            "\32\31\6\uffff\2\31\1\15\1\7\1\23\1\25\1\27\1\20\1\11\1\26\2"+
            "\31\1\22\1\31\1\24\1\10\1\31\1\16\1\31\1\21\1\31\1\12\1\17\1"+
            "\13\1\14\1\31\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10"+
            "\41\1\37\5\41\1\36\13\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\43"+
            "\20\41\1\44\6\41\1\45\1\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\2\41"+
            "\1\47\11\41\1\46\15\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\50"+
            "\7\41\1\51\21\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\13"+
            "\41\1\54\2\41\1\53\13\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\57"+
            "\3\41\1\56\11\41\1\55\13\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10"+
            "\41\1\60\21\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\4\41"+
            "\1\61\25\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\16"+
            "\41\1\62\2\41\1\63\10\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\64"+
            "\7\41\1\65\21\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\25"+
            "\41\1\66\4\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\15"+
            "\41\1\67\1\41\1\70\12\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10"+
            "\41\1\71\21\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\72"+
            "\31\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\21"+
            "\41\1\73\10\41",
            "",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "",
            "",
            "",
            "",
            "\32\41\6\uffff\14\41\1\74\15\41",
            "\32\41\6\uffff\22\41\1\75\7\41",
            "",
            "\32\41\6\uffff\32\41",
            "",
            "\32\41\6\uffff\2\41\1\76\27\41",
            "\32\41\6\uffff\4\41\1\77\25\41",
            "\32\41\6\uffff\23\41\1\100\6\41",
            "\32\41\6\uffff\17\41\1\101\12\41",
            "\32\41\6\uffff\16\41\1\102\13\41",
            "\32\41\6\uffff\13\41\1\103\16\41",
            "\32\41\6\uffff\22\41\1\104\7\41",
            "",
            "\32\41\6\uffff\13\41\1\105\16\41",
            "\32\41\6\uffff\1\106\31\41",
            "\32\41\6\uffff\26\41\1\107\3\41",
            "\32\41\6\uffff\20\41\1\110\11\41",
            "\32\41\6\uffff\15\41\1\111\14\41",
            "\32\41\6\uffff\3\41\1\112\26\41",
            "\32\41\6\uffff\10\41\1\113\21\41",
            "\22\41\1\115\7\41\6\uffff\16\41\1\114\13\41",
            "\32\41\6\uffff\1\116\31\41",
            "\32\41\6\uffff\15\41\1\121\4\41\1\120\4\41\1\117\2\41",
            "\32\41\6\uffff\15\41\1\122\14\41",
            "\32\41\6\uffff\4\41\1\123\25\41",
            "\32\41\6\uffff\4\41\1\124\25\41",
            "\32\41\6\uffff\4\41\1\125\25\41",
            "\32\41\6\uffff\13\41\1\126\16\41",
            "\32\41\6\uffff\25\41\1\127\4\41",
            "\32\41\6\uffff\16\41\1\130\13\41",
            "\32\41\6\uffff\1\131\31\41",
            "\32\41\6\uffff\1\132\31\41",
            "\32\41\6\uffff\12\41\1\133\17\41",
            "\32\41\6\uffff\22\41\1\134\7\41",
            "\32\41\6\uffff\7\41\1\135\22\41",
            "\32\41\6\uffff\16\41\1\136\13\41",
            "\32\41\6\uffff\15\41\1\137\14\41",
            "\32\41\6\uffff\10\41\1\140\21\41",
            "\32\41\6\uffff\10\41\1\141\21\41",
            "\32\41\6\uffff\22\41\1\142\7\41",
            "\32\41\6\uffff\22\41\1\143\7\41",
            "\32\41\6\uffff\22\41\1\144\7\41",
            "\32\41\6\uffff\24\41\1\145\5\41",
            "\32\41\6\uffff\6\41\1\146\23\41",
            "\32\41\6\uffff\23\41\1\147\6\41",
            "\32\41\6\uffff\6\41\1\150\23\41",
            "\32\41\6\uffff\13\41\1\151\16\41",
            "\32\41\6\uffff\23\41\1\152\6\41",
            "\32\41\6\uffff\15\41\1\153\14\41",
            "\32\41\4\uffff\1\154\1\uffff\32\41",
            "\32\41\6\uffff\12\41\1\155\17\41",
            "\32\41\6\uffff\30\41\1\156\1\41",
            "\32\41\4\uffff\1\157\1\uffff\32\41",
            "\32\41\6\uffff\15\41\1\160\14\41",
            "\32\41\6\uffff\23\41\1\161\6\41",
            "\32\41\6\uffff\21\41\1\162\10\41",
            "\32\41\6\uffff\4\41\1\163\25\41",
            "\32\41\6\uffff\1\164\31\41",
            "\32\41\6\uffff\16\41\1\165\13\41",
            "\32\41\6\uffff\10\41\1\166\21\41",
            "\32\41\6\uffff\1\41\1\167\30\41",
            "\32\41\6\uffff\1\170\31\41",
            "\32\41\6\uffff\4\41\1\171\25\41",
            "\32\41\6\uffff\16\41\1\172\13\41",
            "\32\41\6\uffff\21\41\1\173\10\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\3\41\1\174\26\41",
            "\32\41\6\uffff\1\41\1\175\30\41",
            "\32\41\6\uffff\17\41\1\176\12\41",
            "\32\41\6\uffff\22\41\1\177\7\41",
            "\32\41\6\uffff\17\41\1\u0080\12\41",
            "\32\41\6\uffff\10\41\1\u0081\21\41",
            "\32\41\6\uffff\4\41\1\u0082\25\41",
            "\32\41\6\uffff\7\41\1\u0083\22\41",
            "\32\41\6\uffff\7\41\1\u0084\22\41",
            "\32\41\6\uffff\23\41\1\u0085\6\41",
            "\32\41\6\uffff\21\41\1\u0086\10\41",
            "\32\41\6\uffff\22\41\1\u0087\7\41",
            "\1\u0088",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\23\41\1\u008a\6\41",
            "\1\u008b",
            "\32\41\6\uffff\23\41\1\u008c\6\41",
            "\32\41\6\uffff\16\41\1\u008d\13\41",
            "\32\41\6\uffff\1\u008e\31\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\25\41\1\u0091\4\41",
            "\32\41\6\uffff\15\41\1\u0092\14\41",
            "\32\41\6\uffff\13\41\1\u0093\16\41",
            "\32\41\6\uffff\6\41\1\u0094\23\41",
            "\32\41\6\uffff\15\41\1\u0095\14\41",
            "\32\41\6\uffff\15\41\1\u0096\14\41",
            "\32\41\6\uffff\23\41\1\u0097\6\41",
            "\26\41\1\u0099\3\41\6\uffff\1\u0098\31\41",
            "\32\41\6\uffff\13\41\1\u009a\16\41",
            "\32\41\6\uffff\1\u009b\31\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\1\u009c\31\41",
            "\32\41\6\uffff\21\41\1\u009d\10\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\23\41\1\u009e\6\41",
            "\32\41\6\uffff\10\41\1\u009f\21\41",
            "\32\41\6\uffff\10\41\1\u00a0\21\41",
            "\32\41\6\uffff\10\41\1\u00a1\21\41",
            "\1\u00a2",
            "",
            "\32\41\6\uffff\16\41\1\u00a3\13\41",
            "\1\u00a4",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\14\41\1\u00a5\15\41",
            "\32\41\6\uffff\23\41\1\u00a6\6\41",
            "",
            "",
            "\32\41\6\uffff\30\41\1\u00a7\1\41",
            "\32\41\4\uffff\1\u00a8\1\uffff\32\41",
            "\32\41\6\uffff\4\41\1\u00a9\25\41",
            "\32\41\6\uffff\4\41\1\u00aa\25\41",
            "\32\41\6\uffff\23\41\1\u00ab\6\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\23\41\1\u00ad\6\41",
            "\32\41\6\uffff\7\41\1\u00ae\22\41",
            "\32\41\6\uffff\4\41\1\u00af\25\41",
            "\32\41\6\uffff\15\41\1\u00b0\14\41",
            "\32\41\6\uffff\15\41\1\u00b1\14\41",
            "\32\41\6\uffff\4\41\1\u00b2\25\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\17\41\1\u00b3\12\41",
            "\32\41\6\uffff\15\41\1\u00b4\14\41",
            "\32\41\6\uffff\4\41\1\u00b5\25\41",
            "\1\u00b6",
            "\32\41\6\uffff\16\41\1\u00b7\13\41",
            "\1\u00b8",
            "\32\41\6\uffff\1\u00b9\31\41",
            "\32\41\6\uffff\10\41\1\u00ba\21\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\u00bb",
            "\32\41\6\uffff\3\41\1\u00bc\26\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\1\u00be\31\41",
            "",
            "\32\41\6\uffff\10\41\1\u00bf\21\41",
            "\32\41\6\uffff\4\41\1\u00c0\25\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\3\41\1\u00c1\26\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\6\41\1\u00c2\23\41",
            "\32\41\6\uffff\15\41\1\u00c3\14\41",
            "\1\u00c4",
            "\32\41\6\uffff\15\41\1\u00c5\14\41",
            "\1\u00c6",
            "\32\41\6\uffff\15\41\1\u00c7\14\41",
            "\32\41\6\uffff\16\41\1\u00c8\13\41",
            "\1\u00c9",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "",
            "\32\41\6\uffff\23\41\1\u00ca\6\41",
            "\32\41\6\uffff\16\41\1\u00cb\13\41",
            "\32\41\6\uffff\15\41\1\u00cc\14\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\32\41\6\uffff\23\41\1\u00cd\6\41",
            "\1\u00ce",
            "\32\41\6\uffff\4\41\1\u00cf\25\41",
            "\1\u00d0",
            "\32\41\6\uffff\30\41\1\u00d1\1\41",
            "\32\41\6\uffff\15\41\1\u00d2\14\41",
            "\1\u00d3",
            "\32\41\6\uffff\10\41\1\u00d4\21\41",
            "\32\41\6\uffff\15\41\1\u00d5\14\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\u00d6",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\u00d7",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\u00d9",
            "\32\41\6\uffff\16\41\1\u00da\13\41",
            "\1\42\1\uffff\12\42\7\uffff\21\41\1\u00db\10\41\4\uffff\1"+
            "\42\1\uffff\32\41",
            "\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42",
            "\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42",
            "",
            "\1\u00dc",
            "\32\41\6\uffff\15\41\1\u00dd\14\41",
            "\32\41\6\uffff\24\41\1\u00de\5\41",
            "\1\u00df",
            "\32\41\4\uffff\1\u00e0\1\uffff\32\41",
            "\32\41\6\uffff\13\41\1\u00e1\16\41",
            "\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42",
            "\1\u00e3",
            "\32\41\6\uffff\4\41\1\u00e4\25\41",
            "",
            "\1\u00e5",
            "\1\42\1\uffff\12\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\42\1\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32"+
            "\42"
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
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE );";
        }
    }
 

}
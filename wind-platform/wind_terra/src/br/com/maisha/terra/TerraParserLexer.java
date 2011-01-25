// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g 2011-01-25 15:47:46
package br.com.maisha.terra;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int RIGHT_PAREN=6;
    public static final int LEFT_BRACKET=7;
    public static final int RIGHT_BRACKET=8;
    public static final int ATTRIBUITION=9;
    public static final int DOMAIN_OBJECT=10;
    public static final int PACKAGE=11;
    public static final int IMPORT=12;
    public static final int VALIDATION_RULE=13;
    public static final int PROPERTY=14;
    public static final int ATTRIBUTE_PROPERTY=15;
    public static final int OPERATION_PROPERTY=16;
    public static final int OBJECT_PROPERTY=17;
    public static final int OPERATION=18;
    public static final int OP_TYPE=19;
    public static final int INTEGER=20;
    public static final int FLOAT=21;
    public static final int NUMBER=22;
    public static final int LETTER=23;
    public static final int DIGIT=24;
    public static final int NAME=25;
    public static final int NONCONTROL_CHAR=26;
    public static final int STRING_LITERAL=27;
    public static final int TYPE2=28;
    public static final int EXPRESSION=29;
    public static final int SYMBOL=30;
    public static final int SPACE=31;
    public static final int LOWER=32;
    public static final int UPPER=33;
    public static final int NEWLINE=34;
    public static final int WHITESPACE=35;

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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:40:7: ( '=' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:40:9: '='
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:41:11: ( '(' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:41:13: '('
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:42:12: ( ')' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:42:14: ')'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:13: ( '{' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:15: '{'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:44:14: ( '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:44:16: '}'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:46:13: ( ':' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:46:14: ':'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:47:14: ( 'domain_object' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:47:15: 'domain_object'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:48:8: ( 'package' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:48:9: 'package'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:49:7: ( 'import' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:49:8: 'import'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:16: ( 'validationRule' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:50:18: 'validationRule'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' | 'tooltip' )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:70: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:83: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:95: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:104: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:114: 'height'
                    {
                    match("height"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:51:125: 'tooltip'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:19: ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:21: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:36: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:49: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:64: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:79: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:89: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:98: 'event'
                    {
                    match("event"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:108: 'toString'
                    {
                    match("toString"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:121: 'onetomany'
                    {
                    match("onetomany"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:135: 'manytoone'
                    {
                    match("manytoone"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:52:149: 'transient'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:19: ( 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:21: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:31: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:40: 'validWhen'
                    {
                    match("validWhen"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:54: 'is_filter'
                    {
                    match("is_filter"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:53:68: 'validate'
                    {
                    match("validate"); 


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

    // $ANTLR start "OBJECT_PROPERTY"
    public final void mOBJECT_PROPERTY() throws RecognitionException {
        try {
            int _type = OBJECT_PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:54:16: ( 'open_filtering' | 'event_handler' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='o') ) {
                alt4=1;
            }
            else if ( (LA4_0=='e') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:54:18: 'open_filtering'
                    {
                    match("open_filtering"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:54:37: 'event_handler'
                    {
                    match("event_handler"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT_PROPERTY"

    // $ANTLR start "OPERATION"
    public final void mOPERATION() throws RecognitionException {
        try {
            int _type = OPERATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:10: ( 'operation' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:55:12: 'operation'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:8: ( 'java' | 'python' | 'groovy' )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:30: 'groovy'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:7: ( INTEGER | FLOAT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:59:19: FLOAT
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:29: ( '0' .. '9' )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:60:29: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:17: ( '0' .. '9' ( '0' .. '9' )* )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:28: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:61:28: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:62:5: ( LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:62:7: LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+
            {
            mLETTER(); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:62:14: ( LETTER | DIGIT | '.' | '_' | '/' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='.' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            	    {
            	    if ( (input.LA(1)>='.' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:21: ( NONCONTROL_CHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0>=' ' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='~')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:21: NONCONTROL_CHAR
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

    // $ANTLR start "TYPE2"
    public final void mTYPE2() throws RecognitionException {
        try {
            int _type = TYPE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:65:7: ( ( LETTER )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:65:9: ( LETTER )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:65:9: ( LETTER )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:65:9: LETTER
            	    {
            	    mLETTER(); 

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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:68:2: ( '${' ( NONCONTROL_CHAR )+ '}' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:68:4: '${' ( NONCONTROL_CHAR )+ '}'
            {
            match("${"); 

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:68:8: ( NONCONTROL_CHAR )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='}') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='\t'||(LA12_1>=' ' && LA12_1<='!')||(LA12_1>='#' && LA12_1<='~')) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0=='\t'||(LA12_0>=' ' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='|')||LA12_0=='~') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:68:8: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:25: ( LETTER | DIGIT | SYMBOL | SPACE )
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:71:16: ( LOWER | UPPER )
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:72:15: ( 'a' .. 'z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:72:17: 'a' .. 'z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:15: ( 'A' .. 'Z' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:17: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:74:15: ( '0' .. '9' )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:74:17: '0' .. '9'
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:75:15: ( ' ' | '\\t' )
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:77:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:8: ( ( ( '\\r' )? '\\n' )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:10: ( ( '\\r' )? '\\n' )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:10: ( ( '\\r' )? '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:11: ( '\\r' )? '\\n'
            	    {
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:11: ( '\\r' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\r') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:81:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:82:11: ( ( SPACE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:82:13: ( SPACE )+
            {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:82:13: ( SPACE )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\t'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:82:13: SPACE
            	    {
            	    mSPACE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
        // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE )
        int alt16=23;
        alt16 = dfa16.predict(input);
        switch (alt16) {
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
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:172: OBJECT_PROPERTY
                {
                mOBJECT_PROPERTY(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:188: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:198: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:206: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:213: NAME
                {
                mNAME(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:218: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:233: TYPE2
                {
                mTYPE2(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:239: EXPRESSION
                {
                mEXPRESSION(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:250: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:1:258: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA16 dfa16 = new DFA16(this);
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
            return "52:1: ATTRIBUTE_PROPERTY : ( 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' );";
        }
    }
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\143\2\uffff\1\141\1\uffff\1\154\1\151\1\144\1\127\2\uffff";
    static final String DFA3_maxS =
        "\1\166\2\uffff\1\141\1\uffff\1\154\1\151\1\144\1\141\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3\1\5";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\2\uffff\1\2\2\uffff\1\4\14\uffff\1\3",
            "",
            "",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\11\uffff\1\12",
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
            return "53:1: OPERATION_PROPERTY : ( 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' );";
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
            return "59:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA16_eotS =
        "\7\uffff\4\40\2\53\13\40\1\uffff\1\40\4\uffff\2\42\1\uffff\1\42"+
        "\1\uffff\10\42\1\uffff\65\42\1\53\16\42\1\u008e\6\42\1\u0095\1\u0096"+
        "\13\42\1\u0095\2\42\1\u008e\1\53\5\42\1\uffff\2\42\1\u008e\3\42"+
        "\2\uffff\5\42\1\u0096\1\u00b5\7\42\1\53\12\42\1\u0096\2\42\1\u00c9"+
        "\1\42\1\uffff\3\42\3\53\1\42\1\53\12\42\1\53\1\uffff\3\42\1\u0095"+
        "\1\42\2\u008e\12\42\1\u0095\1\42\1\u0095\1\u008e\1\42\1\u008e\2"+
        "\42\1\u008e\1\42\1\u00ed\2\42\3\u008e\2\42\1\uffff\12\42\1\u00fd"+
        "\2\42\1\u0100\1\42\1\uffff\1\42\1\u0103\1\uffff\1\u0100\1\42\1\uffff"+
        "\1\42\1\53";
    static final String DFA16_eofS =
        "\u0106\uffff";
    static final String DFA16_minS =
        "\1\11\6\uffff\21\56\1\uffff\1\56\4\uffff\2\101\1\uffff\1\101\1"+
        "\uffff\10\101\1\uffff\30\101\1\146\34\101\1\56\1\151\14\101\1\154"+
        "\1\56\1\101\1\154\4\101\2\56\7\101\1\154\3\101\1\56\2\101\2\56\4"+
        "\101\1\145\1\uffff\1\101\1\145\1\56\1\101\1\146\1\101\2\uffff\5"+
        "\101\2\56\1\164\6\101\1\56\3\101\1\156\1\101\1\156\1\150\1\101\1"+
        "\151\1\101\1\56\1\157\1\101\1\56\1\101\1\uffff\1\145\2\101\3\56"+
        "\1\101\1\56\2\101\1\147\1\101\1\147\1\141\1\101\1\154\1\101\1\142"+
        "\1\56\1\uffff\1\101\1\162\1\101\1\56\1\101\2\56\1\101\1\164\1\101"+
        "\1\164\1\156\1\101\1\164\1\101\1\152\1\101\1\56\1\101\2\56\1\150"+
        "\1\56\1\150\1\144\1\56\1\145\1\56\1\145\1\101\3\56\1\154\1\162\1"+
        "\uffff\1\143\2\101\1\145\1\151\1\164\2\101\1\162\1\156\1\56\1\164"+
        "\1\101\1\56\1\147\1\uffff\1\171\1\56\1\uffff\1\56\1\160\1\uffff"+
        "\1\145\1\56";
    static final String DFA16_maxS =
        "\1\175\6\uffff\21\172\1\uffff\1\172\4\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\10\172\1\uffff\30\172\1\146\35\172\1\151\14\172\1\154\2"+
        "\172\1\154\15\172\1\154\14\172\1\145\1\uffff\1\172\1\145\2\172\1"+
        "\146\1\172\2\uffff\7\172\1\164\12\172\1\156\1\172\1\156\1\150\1"+
        "\172\1\151\2\172\1\157\3\172\1\uffff\1\145\11\172\1\147\1\172\1"+
        "\147\1\141\1\172\1\154\1\172\1\142\1\172\1\uffff\1\172\1\162\6\172"+
        "\1\164\1\172\1\164\1\156\1\172\1\164\1\172\1\152\5\172\1\150\1\172"+
        "\1\150\1\144\1\172\1\145\1\172\1\145\4\172\1\154\1\162\1\uffff\1"+
        "\143\2\172\1\145\1\151\1\164\2\172\1\162\1\156\1\172\1\164\2\172"+
        "\1\147\1\uffff\1\171\1\172\1\uffff\1\172\1\160\1\uffff\1\145\1\172";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\21\uffff\1\21\1\uffff\1\23\1\25"+
        "\1\26\1\27\2\uffff\1\24\1\uffff\1\22\10\uffff\1\13\142\uffff\1\14"+
        "\6\uffff\1\15\1\20\36\uffff\1\11\23\uffff\1\10\43\uffff\1\17\17"+
        "\uffff\1\7\2\uffff\1\16\2\uffff\1\12\2\uffff";
    static final String DFA16_specialS =
        "\u0106\uffff}>";
    static final String[] DFA16_transitionS = {
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
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10\41\1\37\5\41"+
            "\1\36\13\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\43\20\41\1\44"+
            "\6\41\1\45\1\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\2\41\1\47\11\41"+
            "\1\46\5\41\1\50\7\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\51\7\41\1\52\21"+
            "\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\13\41\1\55\2\41"+
            "\1\54\13\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\60\3\41\1\57\11"+
            "\41\1\56\13\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10\41\1\61\21\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\4\41\1\62\25\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\16\41\1\63\2\41"+
            "\1\64\10\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\65\7\41\1\66\21"+
            "\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\25\41\1\67\4\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\15\41\1\70\1\41"+
            "\1\71\12\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\10\41\1\72\21\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\1\73\31\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\21\41\1\74\10\41",
            "",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\32\41\6\uffff\14\41\1\75\15\41",
            "\32\41\6\uffff\22\41\1\76\7\41",
            "",
            "\32\41\6\uffff\32\41",
            "",
            "\32\41\6\uffff\2\41\1\77\27\41",
            "\32\41\6\uffff\4\41\1\100\25\41",
            "\32\41\6\uffff\23\41\1\101\6\41",
            "\32\41\6\uffff\17\41\1\102\12\41",
            "\32\41\6\uffff\16\41\1\103\13\41",
            "\32\41\4\uffff\1\104\1\uffff\32\41",
            "\32\41\6\uffff\13\41\1\105\16\41",
            "\32\41\6\uffff\22\41\1\106\7\41",
            "",
            "\32\41\6\uffff\13\41\1\107\16\41",
            "\32\41\6\uffff\1\110\31\41",
            "\32\41\6\uffff\26\41\1\111\3\41",
            "\32\41\6\uffff\20\41\1\112\11\41",
            "\32\41\6\uffff\15\41\1\113\14\41",
            "\32\41\6\uffff\3\41\1\114\26\41",
            "\32\41\6\uffff\10\41\1\115\21\41",
            "\22\41\1\117\7\41\6\uffff\16\41\1\116\13\41",
            "\32\41\6\uffff\1\120\31\41",
            "\32\41\6\uffff\15\41\1\123\4\41\1\122\4\41\1\121\2\41",
            "\32\41\6\uffff\15\41\1\124\14\41",
            "\32\41\6\uffff\4\41\1\125\25\41",
            "\32\41\6\uffff\4\41\1\126\25\41",
            "\32\41\6\uffff\4\41\1\127\25\41",
            "\32\41\6\uffff\13\41\1\130\16\41",
            "\32\41\6\uffff\25\41\1\131\4\41",
            "\32\41\6\uffff\16\41\1\132\13\41",
            "\32\41\6\uffff\1\133\31\41",
            "\32\41\6\uffff\1\134\31\41",
            "\32\41\6\uffff\12\41\1\135\17\41",
            "\32\41\6\uffff\22\41\1\136\7\41",
            "\32\41\6\uffff\7\41\1\137\22\41",
            "\32\41\6\uffff\16\41\1\140\13\41",
            "\32\41\6\uffff\15\41\1\141\14\41",
            "\1\142",
            "\32\41\6\uffff\10\41\1\143\21\41",
            "\32\41\6\uffff\10\41\1\144\21\41",
            "\32\41\6\uffff\22\41\1\145\7\41",
            "\32\41\6\uffff\22\41\1\146\7\41",
            "\32\41\6\uffff\22\41\1\147\7\41",
            "\32\41\6\uffff\24\41\1\150\5\41",
            "\32\41\6\uffff\6\41\1\151\23\41",
            "\32\41\6\uffff\23\41\1\152\6\41",
            "\32\41\6\uffff\6\41\1\153\23\41",
            "\32\41\6\uffff\13\41\1\154\16\41",
            "\32\41\6\uffff\23\41\1\155\6\41",
            "\32\41\6\uffff\15\41\1\156\14\41",
            "\32\41\4\uffff\1\157\1\uffff\32\41",
            "\32\41\6\uffff\12\41\1\160\17\41",
            "\32\41\6\uffff\30\41\1\161\1\41",
            "\32\41\4\uffff\1\162\1\uffff\32\41",
            "\32\41\6\uffff\15\41\1\163\14\41",
            "\32\41\6\uffff\23\41\1\164\6\41",
            "\32\41\6\uffff\15\41\1\165\3\41\1\166\10\41",
            "\32\41\6\uffff\4\41\1\167\25\41",
            "\32\41\6\uffff\1\170\31\41",
            "\32\41\6\uffff\16\41\1\171\13\41",
            "\32\41\6\uffff\10\41\1\172\21\41",
            "\32\41\6\uffff\1\41\1\173\30\41",
            "\32\41\6\uffff\1\174\31\41",
            "\32\41\6\uffff\4\41\1\175\25\41",
            "\32\41\6\uffff\16\41\1\176\13\41",
            "\32\41\6\uffff\21\41\1\177\10\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u0080",
            "\32\41\6\uffff\3\41\1\u0081\26\41",
            "\32\41\6\uffff\1\41\1\u0082\30\41",
            "\32\41\6\uffff\17\41\1\u0083\12\41",
            "\32\41\6\uffff\22\41\1\u0084\7\41",
            "\32\41\6\uffff\17\41\1\u0085\12\41",
            "\32\41\6\uffff\10\41\1\u0086\21\41",
            "\32\41\6\uffff\4\41\1\u0087\25\41",
            "\32\41\6\uffff\7\41\1\u0088\22\41",
            "\32\41\6\uffff\7\41\1\u0089\22\41",
            "\32\41\6\uffff\23\41\1\u008a\6\41",
            "\32\41\6\uffff\21\41\1\u008b\10\41",
            "\32\41\6\uffff\22\41\1\u008c\7\41",
            "\1\u008d",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\23\41\1\u008f\6\41",
            "\1\u0090",
            "\32\41\6\uffff\23\41\1\u0091\6\41",
            "\32\41\6\uffff\16\41\1\u0092\13\41",
            "\32\41\4\uffff\1\u0093\1\uffff\32\41",
            "\32\41\6\uffff\1\u0094\31\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\25\41\1\u0097\4\41",
            "\32\41\6\uffff\15\41\1\u0098\14\41",
            "\32\41\6\uffff\13\41\1\u0099\16\41",
            "\32\41\6\uffff\6\41\1\u009a\23\41",
            "\32\41\6\uffff\15\41\1\u009b\14\41",
            "\32\41\6\uffff\15\41\1\u009c\14\41",
            "\32\41\6\uffff\23\41\1\u009d\6\41",
            "\1\u009e",
            "\26\41\1\u00a0\3\41\6\uffff\1\u009f\31\41",
            "\32\41\6\uffff\13\41\1\u00a1\16\41",
            "\32\41\6\uffff\1\u00a2\31\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\1\u00a3\31\41",
            "\32\41\6\uffff\21\41\1\u00a4\10\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\23\41\1\u00a5\6\41",
            "\32\41\6\uffff\10\41\1\u00a6\21\41",
            "\32\41\6\uffff\10\41\1\u00a7\21\41",
            "\32\41\6\uffff\10\41\1\u00a8\21\41",
            "\1\u00a9",
            "",
            "\32\41\6\uffff\16\41\1\u00aa\13\41",
            "\1\u00ab",
            "\14\42\7\uffff\32\41\4\uffff\1\u00ac\1\uffff\32\41",
            "\32\41\6\uffff\14\41\1\u00ad\15\41",
            "\1\u00ae",
            "\32\41\6\uffff\23\41\1\u00af\6\41",
            "",
            "",
            "\32\41\6\uffff\30\41\1\u00b0\1\41",
            "\32\41\4\uffff\1\u00b1\1\uffff\32\41",
            "\32\41\6\uffff\4\41\1\u00b2\25\41",
            "\32\41\6\uffff\4\41\1\u00b3\25\41",
            "\32\41\6\uffff\23\41\1\u00b4\6\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00b6",
            "\32\41\6\uffff\23\41\1\u00b7\6\41",
            "\32\41\6\uffff\7\41\1\u00b8\22\41",
            "\32\41\6\uffff\4\41\1\u00b9\25\41",
            "\32\41\6\uffff\15\41\1\u00ba\14\41",
            "\32\41\6\uffff\15\41\1\u00bb\14\41",
            "\32\41\6\uffff\4\41\1\u00bc\25\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\17\41\1\u00bd\12\41",
            "\32\41\6\uffff\15\41\1\u00be\14\41",
            "\32\41\6\uffff\4\41\1\u00bf\25\41",
            "\1\u00c0",
            "\32\41\6\uffff\16\41\1\u00c1\13\41",
            "\1\u00c2",
            "\1\u00c3",
            "\32\41\6\uffff\1\u00c4\31\41",
            "\1\u00c5",
            "\32\41\6\uffff\10\41\1\u00c6\21\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00c7",
            "\32\41\6\uffff\3\41\1\u00c8\26\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\1\u00ca\31\41",
            "",
            "\1\u00cb",
            "\32\41\6\uffff\4\41\1\u00cd\3\41\1\u00cc\21\41",
            "\32\41\6\uffff\4\41\1\u00ce\25\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\3\41\1\u00cf\26\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\6\41\1\u00d0\23\41",
            "\32\41\6\uffff\15\41\1\u00d1\14\41",
            "\1\u00d2",
            "\32\41\6\uffff\15\41\1\u00d3\14\41",
            "\1\u00d4",
            "\1\u00d5",
            "\32\41\6\uffff\15\41\1\u00d6\14\41",
            "\1\u00d7",
            "\32\41\6\uffff\16\41\1\u00d8\13\41",
            "\1\u00d9",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\32\41\6\uffff\23\41\1\u00da\6\41",
            "\1\u00db",
            "\32\41\6\uffff\16\41\1\u00dc\13\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\15\41\1\u00dd\14\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\32\41\6\uffff\23\41\1\u00de\6\41",
            "\1\u00df",
            "\32\41\6\uffff\4\41\1\u00e0\25\41",
            "\1\u00e1",
            "\1\u00e2",
            "\32\41\6\uffff\30\41\1\u00e3\1\41",
            "\1\u00e4",
            "\32\41\6\uffff\15\41\1\u00e5\14\41",
            "\1\u00e6",
            "\32\41\6\uffff\10\41\1\u00e7\21\41",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\32\41\6\uffff\15\41\1\u00e8\14\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00e9",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00ea",
            "\1\u00eb",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00ec",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "\1\u00ee",
            "\32\41\6\uffff\16\41\1\u00ef\13\41",
            "\14\42\7\uffff\21\41\1\u00f0\10\41\4\uffff\1\42\1\uffff\32"+
            "\41",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\32\41\6\uffff\15\41\1\u00f4\14\41",
            "\32\41\6\uffff\24\41\1\u00f5\5\41",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\32\41\4\uffff\1\u00f9\1\uffff\32\41",
            "\32\41\6\uffff\13\41\1\u00fa\16\41",
            "\1\u00fb",
            "\1\u00fc",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00fe",
            "\32\41\6\uffff\4\41\1\u00ff\25\41",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0101",
            "",
            "\1\u0102",
            "\14\42\7\uffff\32\41\4\uffff\1\42\1\uffff\32\41",
            "",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0104",
            "",
            "\1\u0105",
            "\14\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE );";
        }
    }
 

}
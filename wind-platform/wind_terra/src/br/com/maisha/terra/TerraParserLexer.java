// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g 2011-05-10 13:12:29
package br.com.maisha.terra;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__38=38;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int RIGHT_PAREN=6;
    public static final int LEFT_BRACKET=7;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_BRACE=9;
    public static final int RIGHT_BRACE=10;
    public static final int ATTRIBUITION=11;
    public static final int DOMAIN_OBJECT=12;
    public static final int PACKAGE=13;
    public static final int IMPORT=14;
    public static final int VALIDATION_RULE=15;
    public static final int PROPERTY=16;
    public static final int ATTRIBUTE_PROPERTY=17;
    public static final int OPERATION_PROPERTY=18;
    public static final int OBJECT_PROPERTY=19;
    public static final int OPERATION=20;
    public static final int OP_TYPE=21;
    public static final int INTEGER=22;
    public static final int FLOAT=23;
    public static final int NUMBER=24;
    public static final int LETTER=25;
    public static final int DIGIT=26;
    public static final int NAME=27;
    public static final int NONCONTROL_CHAR=28;
    public static final int STRING_LITERAL=29;
    public static final int TYPE2=30;
    public static final int EXPRESSION=31;
    public static final int SYMBOL=32;
    public static final int SPACE=33;
    public static final int LOWER=34;
    public static final int UPPER=35;
    public static final int NEWLINE=36;
    public static final int WHITESPACE=37;

    // delegates
    // delegators

    public TerraParserLexer() {;} 
    public TerraParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TerraParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:3:7: ( ',' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:3:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:42:7: ( '=' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:42:9: '='
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:43:11: ( '(' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:43:13: '('
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:44:12: ( ')' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:44:14: ')'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:45:13: ( '{' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:45:15: '{'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:46:14: ( '}' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:46:16: '}'
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

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:47:11: ( '[' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:47:13: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:48:12: ( ']' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:48:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "ATTRIBUITION"
    public final void mATTRIBUITION() throws RecognitionException {
        try {
            int _type = ATTRIBUITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:50:13: ( ':' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:50:14: ':'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:51:14: ( 'domain_object' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:51:15: 'domain_object'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:52:8: ( 'package' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:52:9: 'package'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:53:7: ( 'import' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:53:8: 'import'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:54:16: ( 'validationRule' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:54:18: 'validationRule'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'disabled' | 'visible' | 'icon' | 'width' | 'height' | 'tooltip' )
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
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:70: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 7 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:83: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 8 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:95: 'icon'
                    {
                    match("icon"); 


                    }
                    break;
                case 9 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:104: 'width'
                    {
                    match("width"); 


                    }
                    break;
                case 10 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:114: 'height'
                    {
                    match("height"); 


                    }
                    break;
                case 11 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:55:125: 'tooltip'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:19: ( 'value' | 'validValues' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:21: 'value'
                    {
                    match("value"); 


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:31: 'validValues'
                    {
                    match("validValues"); 


                    }
                    break;
                case 3 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:47: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 4 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:62: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 5 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:75: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 6 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:90: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 7 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:105: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 8 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:115: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 9 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:124: 'event'
                    {
                    match("event"); 


                    }
                    break;
                case 10 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:134: 'toString'
                    {
                    match("toString"); 


                    }
                    break;
                case 11 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:147: 'onetomany'
                    {
                    match("onetomany"); 


                    }
                    break;
                case 12 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:161: 'manytoone'
                    {
                    match("manytoone"); 


                    }
                    break;
                case 13 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:56:175: 'transient'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:19: ( 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:21: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:31: 'file'
                    {
                    match("file"); 


                    }
                    break;
                case 3 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:40: 'validWhen'
                    {
                    match("validWhen"); 


                    }
                    break;
                case 4 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:54: 'is_filter'
                    {
                    match("is_filter"); 


                    }
                    break;
                case 5 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:57:68: 'validate'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:58:16: ( 'open_filtering' | 'event_handler' )
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
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:58:18: 'open_filtering'
                    {
                    match("open_filtering"); 


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:58:37: 'event_handler'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:59:10: ( 'operation' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:59:12: 'operation'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:61:8: ( 'java' | 'python' | 'groovy' )
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
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:61:10: 'java'
                    {
                    match("java"); 


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:61:19: 'python'
                    {
                    match("python"); 


                    }
                    break;
                case 3 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:61:30: 'groovy'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:63:7: ( INTEGER | FLOAT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:63:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:63:19: FLOAT
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:64:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:64:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:64:29: ( '0' .. '9' )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:64:29: '0' .. '9'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:65:17: ( '0' .. '9' ( '0' .. '9' )* )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:65:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:65:28: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:65:28: '0' .. '9'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:66:5: ( LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:66:7: LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+
            {
            mLETTER(); 
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:66:14: ( LETTER | DIGIT | '.' | '_' | '/' )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:67:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:67:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:67:21: ( NONCONTROL_CHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0>=' ' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='~')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:67:21: NONCONTROL_CHAR
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:69:7: ( ( LETTER )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:69:9: ( LETTER )+
            {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:69:9: ( LETTER )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:69:9: LETTER
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:72:2: ( '${' ( NONCONTROL_CHAR )+ '}' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:72:4: '${' ( NONCONTROL_CHAR )+ '}'
            {
            match("${"); 

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:72:8: ( NONCONTROL_CHAR )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:72:8: NONCONTROL_CHAR
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:74:25: ( LETTER | DIGIT | SYMBOL | SPACE )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:75:16: ( LOWER | UPPER )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:76:15: ( 'a' .. 'z' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:76:17: 'a' .. 'z'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:77:15: ( 'A' .. 'Z' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:77:17: 'A' .. 'Z'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:78:15: ( '0' .. '9' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:78:17: '0' .. '9'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:79:15: ( ' ' | '\\t' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:81:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:8: ( ( ( '\\r' )? '\\n' )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:10: ( ( '\\r' )? '\\n' )+
            {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:10: ( ( '\\r' )? '\\n' )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:11: ( '\\r' )? '\\n'
            	    {
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:11: ( '\\r' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\r') ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:85:11: '\\r'
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
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:86:11: ( ( SPACE )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:86:13: ( SPACE )+
            {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:86:13: ( SPACE )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:86:13: SPACE
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
        // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:8: ( T__38 | ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE )
        int alt16=26;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:16: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 3 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:23: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 4 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:34: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 5 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:46: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 6 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:59: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 7 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:73: LEFT_BRACE
                {
                mLEFT_BRACE(); 

                }
                break;
            case 8 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:84: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 

                }
                break;
            case 9 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:96: ATTRIBUITION
                {
                mATTRIBUITION(); 

                }
                break;
            case 10 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:109: DOMAIN_OBJECT
                {
                mDOMAIN_OBJECT(); 

                }
                break;
            case 11 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:123: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 12 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:131: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 13 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:138: VALIDATION_RULE
                {
                mVALIDATION_RULE(); 

                }
                break;
            case 14 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:154: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 15 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:163: ATTRIBUTE_PROPERTY
                {
                mATTRIBUTE_PROPERTY(); 

                }
                break;
            case 16 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:182: OPERATION_PROPERTY
                {
                mOPERATION_PROPERTY(); 

                }
                break;
            case 17 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:201: OBJECT_PROPERTY
                {
                mOBJECT_PROPERTY(); 

                }
                break;
            case 18 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:217: OPERATION
                {
                mOPERATION(); 

                }
                break;
            case 19 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:227: OP_TYPE
                {
                mOP_TYPE(); 

                }
                break;
            case 20 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:235: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 21 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:242: NAME
                {
                mNAME(); 

                }
                break;
            case 22 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:247: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 23 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:262: TYPE2
                {
                mTYPE2(); 

                }
                break;
            case 24 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:268: EXPRESSION
                {
                mEXPRESSION(); 

                }
                break;
            case 25 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:279: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 26 :
                // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:1:287: WHITESPACE
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
        "\27\uffff";
    static final String DFA2_eofS =
        "\27\uffff";
    static final String DFA2_minS =
        "\1\145\3\141\1\uffff\1\157\1\uffff\1\154\2\uffff\1\156\3\uffff"+
        "\1\151\4\uffff\1\144\1\126\2\uffff";
    static final String DFA2_maxS =
        "\1\166\1\141\1\145\1\151\1\uffff\1\162\1\uffff\1\154\2\uffff\1"+
        "\170\3\uffff\1\165\4\uffff\1\144\1\141\2\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\11\1\uffff\1\13\1\uffff\1\4\1\7\1\uffff\1\6\1\12\1\15"+
        "\1\uffff\1\5\1\10\1\14\1\1\2\uffff\1\2\1\3";
    static final String DFA2_specialS =
        "\27\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\7\uffff\1\3\1\uffff\1\6\2\uffff\1\2\1\uffff\1\5\1\uffff"+
            "\1\1",
            "\1\7",
            "\1\11\3\uffff\1\10",
            "\1\12\7\uffff\1\13",
            "",
            "\1\14\2\uffff\1\15",
            "",
            "\1\16",
            "",
            "",
            "\1\21\4\uffff\1\20\4\uffff\1\17",
            "",
            "",
            "",
            "\1\23\13\uffff\1\22",
            "",
            "",
            "",
            "",
            "\1\24",
            "\1\25\12\uffff\1\26",
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
            return "56:1: ATTRIBUTE_PROPERTY : ( 'value' | 'validValues' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' );";
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
            return "57:1: OPERATION_PROPERTY : ( 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' );";
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
            return "63:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA16_eotS =
        "\12\uffff\4\43\2\56\13\43\1\uffff\1\43\4\uffff\2\45\1\uffff\1\45"+
        "\1\uffff\10\45\1\uffff\65\45\1\56\17\45\1\u0093\6\45\1\u009a\1\u009b"+
        "\11\45\1\u0093\2\45\1\u009a\2\45\1\u0093\1\56\5\45\1\uffff\2\45"+
        "\1\u0093\3\45\2\uffff\5\45\1\u009b\1\u00bb\10\45\1\56\12\45\1\u009b"+
        "\2\45\1\u00d0\1\45\1\uffff\4\45\3\56\1\45\1\56\12\45\1\56\1\uffff"+
        "\3\45\1\u009a\2\45\2\u0093\12\45\1\u009a\2\45\1\u009a\1\u0093\1"+
        "\45\1\u0093\2\45\1\u0093\1\45\1\u00f7\2\45\1\u0093\1\45\2\u0093"+
        "\2\45\1\uffff\3\45\1\u0093\7\45\1\u0108\2\45\1\u010b\1\45\1\uffff"+
        "\1\45\1\u010e\1\uffff\1\u010b\1\45\1\uffff\1\45\1\56";
    static final String DFA16_eofS =
        "\u0111\uffff";
    static final String DFA16_minS =
        "\1\11\11\uffff\21\56\1\uffff\1\56\4\uffff\2\101\1\uffff\1\101\1"+
        "\uffff\10\101\1\uffff\30\101\1\146\34\101\1\56\1\151\15\101\1\154"+
        "\1\56\1\101\1\154\4\101\2\56\7\101\1\154\1\101\1\56\2\101\1\56\2"+
        "\101\2\56\4\101\1\145\1\uffff\1\101\1\145\1\56\1\101\1\146\1\101"+
        "\2\uffff\5\101\2\56\1\164\7\101\1\56\3\101\1\156\1\101\1\156\1\150"+
        "\1\101\1\151\1\101\1\56\1\157\1\101\1\56\1\101\1\uffff\1\145\3\101"+
        "\3\56\1\101\1\56\2\101\1\147\1\101\1\147\1\141\1\101\1\154\1\101"+
        "\1\142\1\56\1\uffff\1\101\1\162\1\101\1\56\2\101\2\56\1\101\1\164"+
        "\1\101\1\164\1\156\1\101\1\164\1\101\1\152\1\101\1\56\2\101\2\56"+
        "\1\150\1\56\1\150\1\144\1\56\1\145\1\56\1\145\1\101\1\56\1\101\2"+
        "\56\1\154\1\162\1\uffff\1\143\2\101\1\56\1\145\1\151\1\164\2\101"+
        "\1\162\1\156\1\56\1\164\1\101\1\56\1\147\1\uffff\1\171\1\56\1\uffff"+
        "\1\56\1\160\1\uffff\1\145\1\56";
    static final String DFA16_maxS =
        "\1\175\11\uffff\21\172\1\uffff\1\172\4\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\10\172\1\uffff\30\172\1\146\35\172\1\151\15\172\1\154\2"+
        "\172\1\154\15\172\1\154\15\172\1\145\1\uffff\1\172\1\145\2\172\1"+
        "\146\1\172\2\uffff\7\172\1\164\13\172\1\156\1\172\1\156\1\150\1"+
        "\172\1\151\2\172\1\157\3\172\1\uffff\1\145\12\172\1\147\1\172\1"+
        "\147\1\141\1\172\1\154\1\172\1\142\1\172\1\uffff\1\172\1\162\7\172"+
        "\1\164\1\172\1\164\1\156\1\172\1\164\1\172\1\152\6\172\1\150\1\172"+
        "\1\150\1\144\1\172\1\145\1\172\1\145\5\172\1\154\1\162\1\uffff\1"+
        "\143\3\172\1\145\1\151\1\164\2\172\1\162\1\156\1\172\1\164\2\172"+
        "\1\147\1\uffff\1\171\1\172\1\uffff\1\172\1\160\1\uffff\1\145\1\172";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\21\uffff\1\24\1"+
        "\uffff\1\26\1\30\1\31\1\32\2\uffff\1\27\1\uffff\1\25\10\uffff\1"+
        "\16\144\uffff\1\17\6\uffff\1\20\1\23\37\uffff\1\14\24\uffff\1\13"+
        "\46\uffff\1\22\20\uffff\1\12\2\uffff\1\21\2\uffff\1\15\2\uffff";
    static final String DFA16_specialS =
        "\u0111\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\40\1\37\2\uffff\1\37\22\uffff\1\40\1\uffff\1\35\1\uffff"+
            "\1\36\3\uffff\1\3\1\4\2\uffff\1\1\3\uffff\12\33\1\11\2\uffff"+
            "\1\2\3\uffff\32\34\1\7\1\uffff\1\10\3\uffff\2\34\1\20\1\12\1"+
            "\26\1\30\1\32\1\23\1\14\1\31\2\34\1\25\1\34\1\27\1\13\1\34\1"+
            "\21\1\34\1\24\1\34\1\15\1\22\1\16\1\17\1\34\1\5\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\42\5\44"+
            "\1\41\13\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\1\46\20\44\1\47"+
            "\6\44\1\50\1\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\2\44\1\52\11\44"+
            "\1\51\5\44\1\53\7\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\1\54\7\44\1\55\21"+
            "\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\13\44\1\60\2\44"+
            "\1\57\13\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\1\63\3\44\1\62\11"+
            "\44\1\61\13\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\64\21\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\4\44\1\65\25\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\16\44\1\66\2\44"+
            "\1\67\10\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\1\70\7\44\1\71\21"+
            "\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\25\44\1\72\4\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\15\44\1\73\1\44"+
            "\1\74\12\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\10\44\1\75\21\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\1\76\31\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\21\44\1\77\10\44",
            "",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\32\44\6\uffff\14\44\1\100\15\44",
            "\32\44\6\uffff\22\44\1\101\7\44",
            "",
            "\32\44\6\uffff\32\44",
            "",
            "\32\44\6\uffff\2\44\1\102\27\44",
            "\32\44\6\uffff\4\44\1\103\25\44",
            "\32\44\6\uffff\23\44\1\104\6\44",
            "\32\44\6\uffff\17\44\1\105\12\44",
            "\32\44\6\uffff\16\44\1\106\13\44",
            "\32\44\4\uffff\1\107\1\uffff\32\44",
            "\32\44\6\uffff\13\44\1\110\16\44",
            "\32\44\6\uffff\22\44\1\111\7\44",
            "",
            "\32\44\6\uffff\13\44\1\112\16\44",
            "\32\44\6\uffff\1\113\31\44",
            "\32\44\6\uffff\26\44\1\114\3\44",
            "\32\44\6\uffff\20\44\1\115\11\44",
            "\32\44\6\uffff\15\44\1\116\14\44",
            "\32\44\6\uffff\3\44\1\117\26\44",
            "\32\44\6\uffff\10\44\1\120\21\44",
            "\22\44\1\122\7\44\6\uffff\16\44\1\121\13\44",
            "\32\44\6\uffff\1\123\31\44",
            "\32\44\6\uffff\15\44\1\126\4\44\1\125\4\44\1\124\2\44",
            "\32\44\6\uffff\15\44\1\127\14\44",
            "\32\44\6\uffff\4\44\1\130\25\44",
            "\32\44\6\uffff\4\44\1\131\25\44",
            "\32\44\6\uffff\4\44\1\132\25\44",
            "\32\44\6\uffff\13\44\1\133\16\44",
            "\32\44\6\uffff\25\44\1\134\4\44",
            "\32\44\6\uffff\16\44\1\135\13\44",
            "\32\44\6\uffff\1\136\31\44",
            "\32\44\6\uffff\1\137\31\44",
            "\32\44\6\uffff\12\44\1\140\17\44",
            "\32\44\6\uffff\22\44\1\141\7\44",
            "\32\44\6\uffff\7\44\1\142\22\44",
            "\32\44\6\uffff\16\44\1\143\13\44",
            "\32\44\6\uffff\15\44\1\144\14\44",
            "\1\145",
            "\32\44\6\uffff\10\44\1\146\13\44\1\147\5\44",
            "\32\44\6\uffff\10\44\1\150\21\44",
            "\32\44\6\uffff\22\44\1\151\7\44",
            "\32\44\6\uffff\22\44\1\152\7\44",
            "\32\44\6\uffff\22\44\1\153\7\44",
            "\32\44\6\uffff\24\44\1\154\5\44",
            "\32\44\6\uffff\6\44\1\155\23\44",
            "\32\44\6\uffff\23\44\1\156\6\44",
            "\32\44\6\uffff\6\44\1\157\23\44",
            "\32\44\6\uffff\13\44\1\160\16\44",
            "\32\44\6\uffff\23\44\1\161\6\44",
            "\32\44\6\uffff\15\44\1\162\14\44",
            "\32\44\4\uffff\1\163\1\uffff\32\44",
            "\32\44\6\uffff\12\44\1\164\17\44",
            "\32\44\6\uffff\30\44\1\165\1\44",
            "\32\44\4\uffff\1\166\1\uffff\32\44",
            "\32\44\6\uffff\15\44\1\167\14\44",
            "\32\44\6\uffff\23\44\1\170\6\44",
            "\32\44\6\uffff\15\44\1\171\3\44\1\172\10\44",
            "\32\44\6\uffff\4\44\1\173\25\44",
            "\32\44\6\uffff\1\174\31\44",
            "\32\44\6\uffff\16\44\1\175\13\44",
            "\32\44\6\uffff\10\44\1\176\21\44",
            "\32\44\6\uffff\1\44\1\177\30\44",
            "\32\44\6\uffff\1\u0080\31\44",
            "\32\44\6\uffff\4\44\1\u0081\25\44",
            "\32\44\6\uffff\16\44\1\u0082\13\44",
            "\32\44\6\uffff\21\44\1\u0083\10\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u0084",
            "\32\44\6\uffff\3\44\1\u0085\26\44",
            "\32\44\6\uffff\4\44\1\u0086\25\44",
            "\32\44\6\uffff\1\44\1\u0087\30\44",
            "\32\44\6\uffff\17\44\1\u0088\12\44",
            "\32\44\6\uffff\22\44\1\u0089\7\44",
            "\32\44\6\uffff\17\44\1\u008a\12\44",
            "\32\44\6\uffff\10\44\1\u008b\21\44",
            "\32\44\6\uffff\4\44\1\u008c\25\44",
            "\32\44\6\uffff\7\44\1\u008d\22\44",
            "\32\44\6\uffff\7\44\1\u008e\22\44",
            "\32\44\6\uffff\23\44\1\u008f\6\44",
            "\32\44\6\uffff\21\44\1\u0090\10\44",
            "\32\44\6\uffff\22\44\1\u0091\7\44",
            "\1\u0092",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\23\44\1\u0094\6\44",
            "\1\u0095",
            "\32\44\6\uffff\23\44\1\u0096\6\44",
            "\32\44\6\uffff\16\44\1\u0097\13\44",
            "\32\44\4\uffff\1\u0098\1\uffff\32\44",
            "\32\44\6\uffff\1\u0099\31\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\25\44\1\u009c\4\44",
            "\32\44\6\uffff\15\44\1\u009d\14\44",
            "\32\44\6\uffff\13\44\1\u009e\16\44",
            "\32\44\6\uffff\6\44\1\u009f\23\44",
            "\32\44\6\uffff\15\44\1\u00a0\14\44",
            "\32\44\6\uffff\15\44\1\u00a1\14\44",
            "\32\44\6\uffff\23\44\1\u00a2\6\44",
            "\1\u00a3",
            "\25\44\1\u00a5\1\u00a6\3\44\6\uffff\1\u00a4\31\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\13\44\1\u00a7\16\44",
            "\32\44\6\uffff\1\u00a8\31\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\1\u00a9\31\44",
            "\32\44\6\uffff\21\44\1\u00aa\10\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\23\44\1\u00ab\6\44",
            "\32\44\6\uffff\10\44\1\u00ac\21\44",
            "\32\44\6\uffff\10\44\1\u00ad\21\44",
            "\32\44\6\uffff\10\44\1\u00ae\21\44",
            "\1\u00af",
            "",
            "\32\44\6\uffff\16\44\1\u00b0\13\44",
            "\1\u00b1",
            "\14\45\7\uffff\32\44\4\uffff\1\u00b2\1\uffff\32\44",
            "\32\44\6\uffff\14\44\1\u00b3\15\44",
            "\1\u00b4",
            "\32\44\6\uffff\23\44\1\u00b5\6\44",
            "",
            "",
            "\32\44\6\uffff\30\44\1\u00b6\1\44",
            "\32\44\4\uffff\1\u00b7\1\uffff\32\44",
            "\32\44\6\uffff\4\44\1\u00b8\25\44",
            "\32\44\6\uffff\4\44\1\u00b9\25\44",
            "\32\44\6\uffff\23\44\1\u00ba\6\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00bc",
            "\32\44\6\uffff\23\44\1\u00bd\6\44",
            "\32\44\6\uffff\1\u00be\31\44",
            "\32\44\6\uffff\7\44\1\u00bf\22\44",
            "\32\44\6\uffff\4\44\1\u00c0\25\44",
            "\32\44\6\uffff\15\44\1\u00c1\14\44",
            "\32\44\6\uffff\15\44\1\u00c2\14\44",
            "\32\44\6\uffff\4\44\1\u00c3\25\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\17\44\1\u00c4\12\44",
            "\32\44\6\uffff\15\44\1\u00c5\14\44",
            "\32\44\6\uffff\4\44\1\u00c6\25\44",
            "\1\u00c7",
            "\32\44\6\uffff\16\44\1\u00c8\13\44",
            "\1\u00c9",
            "\1\u00ca",
            "\32\44\6\uffff\1\u00cb\31\44",
            "\1\u00cc",
            "\32\44\6\uffff\10\44\1\u00cd\21\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00ce",
            "\32\44\6\uffff\3\44\1\u00cf\26\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\1\u00d1\31\44",
            "",
            "\1\u00d2",
            "\32\44\6\uffff\4\44\1\u00d4\3\44\1\u00d3\21\44",
            "\32\44\6\uffff\13\44\1\u00d5\16\44",
            "\32\44\6\uffff\4\44\1\u00d6\25\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\3\44\1\u00d7\26\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\6\44\1\u00d8\23\44",
            "\32\44\6\uffff\15\44\1\u00d9\14\44",
            "\1\u00da",
            "\32\44\6\uffff\15\44\1\u00db\14\44",
            "\1\u00dc",
            "\1\u00dd",
            "\32\44\6\uffff\15\44\1\u00de\14\44",
            "\1\u00df",
            "\32\44\6\uffff\16\44\1\u00e0\13\44",
            "\1\u00e1",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\32\44\6\uffff\23\44\1\u00e2\6\44",
            "\1\u00e3",
            "\32\44\6\uffff\16\44\1\u00e4\13\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\24\44\1\u00e5\5\44",
            "\32\44\6\uffff\15\44\1\u00e6\14\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\32\44\6\uffff\23\44\1\u00e7\6\44",
            "\1\u00e8",
            "\32\44\6\uffff\4\44\1\u00e9\25\44",
            "\1\u00ea",
            "\1\u00eb",
            "\32\44\6\uffff\30\44\1\u00ec\1\44",
            "\1\u00ed",
            "\32\44\6\uffff\15\44\1\u00ee\14\44",
            "\1\u00ef",
            "\32\44\6\uffff\10\44\1\u00f0\21\44",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\32\44\6\uffff\15\44\1\u00f1\14\44",
            "\32\44\6\uffff\4\44\1\u00f2\25\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00f3",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00f4",
            "\1\u00f5",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00f6",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u00f8",
            "\32\44\6\uffff\16\44\1\u00f9\13\44",
            "\14\45\7\uffff\21\44\1\u00fa\10\44\4\uffff\1\45\1\uffff\32"+
            "\44",
            "\32\44\6\uffff\22\44\1\u00fb\7\44",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\32\44\6\uffff\15\44\1\u00ff\14\44",
            "\32\44\6\uffff\24\44\1\u0100\5\44",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\32\44\4\uffff\1\u0104\1\uffff\32\44",
            "\32\44\6\uffff\13\44\1\u0105\16\44",
            "\1\u0106",
            "\1\u0107",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0109",
            "\32\44\6\uffff\4\44\1\u010a\25\44",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010c",
            "",
            "\1\u010d",
            "\14\45\7\uffff\32\44\4\uffff\1\45\1\uffff\32\44",
            "",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u010f",
            "",
            "\1\u0110",
            "\14\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45"
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
            return "1:1: Tokens : ( T__38 | ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY | OPERATION | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE );";
        }
    }
 

}
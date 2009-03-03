// $ANTLR 3.1.1 C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g 2009-03-02 21:43:33
 package br.com.maisha.terra; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TerraLexer extends Lexer {
    public static final int DOMAIN_OBJECT=10;
    public static final int INTEGER=14;
    public static final int SYMBOL=22;
    public static final int LETTER=17;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=16;
    public static final int WHITESPACE=27;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=15;
    public static final int SPACE=23;
    public static final int EOF=-1;
    public static final int TYPE=12;
    public static final int RIGHT_PAREN=6;
    public static final int IMPORT=11;
    public static final int NAME=19;
    public static final int STRING_LITERAL=21;
    public static final int NEWLINE=26;
    public static final int NONCONTROL_CHAR=20;
    public static final int PROPERTY=13;
    public static final int ASSIGN=4;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_PAREN=5;
    public static final int LOWER=24;
    public static final int DIGIT=18;
    public static final int UPPER=25;

    // delegates
    // delegators

    public TerraLexer() {;} 
    public TerraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TerraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:5:7: ( '=' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:5:9: '='
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:6:11: ( '(' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:6:13: '('
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:7:12: ( ')' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:7:14: ')'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:8:13: ( '{' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:8:15: '{'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:9:14: ( '}' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:9:16: '}'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:11:13: ( ':' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:11:14: ':'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:12:14: ( 'domain_object' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:12:15: 'domain_object'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:13:7: ( 'import' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:13:8: 'import'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:6: ( 'int' | 'double' | 'float' | 'long' | 'short' | 'boolean' | 'string' )
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
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='h') ) {
                    alt1=5;
                }
                else if ( (LA1_5=='t') ) {
                    alt1=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case 'b':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:16: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:27: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:37: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:46: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:56: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:14:68: 'string'
                    {
                    match("string"); 


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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'disabled' | 'visible' | 'icon' )
            int alt2=14;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:11: 'x'
                    {
                    match('x'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:17: 'y'
                    {
                    match('y'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:23: 'colspan'
                    {
                    match("colspan"); 


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:35: 'rowspan'
                    {
                    match("rowspan"); 


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:47: 'presentation_type'
                    {
                    match("presentation_type"); 


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:69: 'validation'
                    {
                    match("validation"); 


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:84: 'required'
                    {
                    match("required"); 


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:97: 'max_length'
                    {
                    match("max_length"); 


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:112: 'min_length'
                    {
                    match("min_length"); 


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:127: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:137: 'mask'
                    {
                    match("mask"); 


                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:146: 'disabled'
                    {
                    match("disabled"); 


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:159: 'visible'
                    {
                    match("visible"); 


                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:15:171: 'icon'
                    {
                    match("icon"); 


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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:17:7: ( INTEGER | FLOAT )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:17:9: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:17:19: FLOAT
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:18:15: ( INTEGER '.' ( '0' .. '9' )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:18:17: INTEGER '.' ( '0' .. '9' )+
            {
            mINTEGER(); 
            match('.'); 
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:18:29: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:18:29: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:19:17: ( '0' .. '9' ( '0' .. '9' )* )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:19:19: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:19:28: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:19:28: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:20:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:20:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:20:14: ( LETTER | DIGIT | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:
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
            	    break loop6;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:21:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:21:17: '\"' ( NONCONTROL_CHAR )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:21:21: ( NONCONTROL_CHAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||(LA7_0>=' ' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='~')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:21:21: NONCONTROL_CHAR
            	    {
            	    mNONCONTROL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:23:25: ( LETTER | DIGIT | SYMBOL | SPACE )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:24:16: ( LOWER | UPPER )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:25:15: ( 'a' .. 'z' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:25:17: 'a' .. 'z'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:26:15: ( 'A' .. 'Z' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:26:17: 'A' .. 'Z'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:27:15: ( '0' .. '9' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:27:17: '0' .. '9'
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:28:15: ( ' ' | '\\t' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:30:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:8: ( ( ( '\\r' )? '\\n' )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:10: ( ( '\\r' )? '\\n' )+
            {
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:10: ( ( '\\r' )? '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:11: ( '\\r' )? '\\n'
            	    {
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:11: ( '\\r' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='\r') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:34:11: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:35:11: ( ( SPACE )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:35:13: ( SPACE )+
            {
            // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:35:13: ( SPACE )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:35:13: SPACE
            	    {
            	    mSPACE(); 

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
        // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:8: ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | IMPORT | TYPE | PROPERTY | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:17: LEFT_PAREN
                {
                mLEFT_PAREN(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:28: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:40: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:53: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:67: ATTRIBUITION
                {
                mATTRIBUITION(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:80: DOMAIN_OBJECT
                {
                mDOMAIN_OBJECT(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:94: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:101: TYPE
                {
                mTYPE(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:106: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:115: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:122: NAME
                {
                mNAME(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:127: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:142: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Paulo\\Desktop\\TerraLexer.g:1:150: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA2_eotS =
        "\23\uffff";
    static final String DFA2_eofS =
        "\23\uffff";
    static final String DFA2_minS =
        "\1\143\3\uffff\1\141\1\uffff\2\141\7\uffff\1\163\3\uffff";
    static final String DFA2_maxS =
        "\1\171\3\uffff\1\157\1\uffff\2\151\7\uffff\1\170\3\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\2\uffff\1\14\1\16\1\4\1\7\1\12"+
        "\1\6\1\15\1\uffff\1\11\1\10\1\13";
    static final String DFA2_specialS =
        "\23\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\1\10\4\uffff\1\11\3\uffff\1\7\2\uffff\1\5\1\uffff\1\4"+
            "\3\uffff\1\6\1\uffff\1\1\1\2",
            "",
            "",
            "",
            "\1\14\3\uffff\1\13\11\uffff\1\12",
            "",
            "\1\15\7\uffff\1\16",
            "\1\17\7\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\4\uffff\1\21",
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
            return "15:1: PROPERTY : ( 'x' | 'y' | 'colspan' | 'rowspan' | 'presentation_type' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'disabled' | 'visible' | 'icon' );";
        }
    }
    static final String DFA3_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA3_maxS =
        "\3\71\2\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\1\4\1\uffff\12\2",
            "\1\4\1\uffff\12\2",
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
            return "17:1: NUMBER : ( INTEGER | FLOAT );";
        }
    }
    static final String DFA11_eotS =
        "\7\uffff\6\25\2\43\5\25\5\uffff\12\25\1\uffff\15\25\1\106\24\25"+
        "\1\uffff\1\43\1\25\1\106\13\25\1\43\5\25\2\106\5\25\1\43\6\25\1"+
        "\106\1\25\1\170\1\106\13\25\1\uffff\1\106\2\43\3\25\1\43\3\25\2"+
        "\43\13\25\3\43\4\25\1\u0099\1\25\1\uffff\3\25\1\43";
    static final String DFA11_eofS =
        "\u009e\uffff";
    static final String DFA11_minS =
        "\1\11\6\uffff\1\151\1\143\1\154\1\157\1\150\1\157\2\60\1\157\1"+
        "\141\1\162\2\141\5\uffff\1\155\1\163\1\160\1\164\2\157\1\156\1\157"+
        "\1\162\1\157\1\uffff\1\154\1\167\1\161\1\156\1\145\1\154\2\163\1"+
        "\156\1\141\1\142\1\141\1\157\1\60\1\156\1\141\1\147\1\162\1\151"+
        "\1\154\2\163\1\165\1\147\1\163\2\151\1\137\1\153\1\137\1\151\1\154"+
        "\1\142\1\162\1\uffff\1\60\1\164\1\60\1\164\1\156\1\145\2\160\1\151"+
        "\2\145\1\144\1\142\1\154\1\60\1\154\1\156\1\145\1\154\1\164\2\60"+
        "\1\147\3\141\1\162\1\60\1\156\1\141\1\154\2\145\1\137\1\60\1\145"+
        "\2\60\3\156\1\145\2\164\1\145\2\156\1\157\1\144\1\uffff\3\60\1\144"+
        "\1\141\1\151\1\60\2\147\1\142\2\60\1\164\1\157\2\164\1\152\1\151"+
        "\1\156\2\150\1\145\1\157\3\60\1\143\1\156\1\164\1\137\1\60\1\164"+
        "\1\uffff\1\171\1\160\1\145\1\60";
    static final String DFA11_maxS =
        "\1\175\6\uffff\1\157\1\156\1\154\1\157\1\164\1\157\2\172\2\157"+
        "\1\162\2\151\5\uffff\1\165\1\163\1\160\1\164\2\157\1\156\1\157\1"+
        "\162\1\157\1\uffff\1\154\1\167\1\161\1\156\1\145\1\154\1\163\1\170"+
        "\1\156\1\141\1\142\1\141\1\157\1\172\1\156\1\141\1\147\1\162\1\151"+
        "\1\154\2\163\1\165\1\147\1\163\2\151\1\137\1\153\1\137\1\151\1\154"+
        "\1\142\1\162\1\uffff\1\172\1\164\1\172\1\164\1\156\1\145\2\160\1"+
        "\151\2\145\1\144\1\142\1\154\1\172\1\154\1\156\1\145\1\154\1\164"+
        "\2\172\1\147\3\141\1\162\1\172\1\156\1\141\1\154\2\145\1\137\1\172"+
        "\1\145\2\172\3\156\1\145\2\164\1\145\2\156\1\157\1\144\1\uffff\3"+
        "\172\1\144\1\141\1\151\1\172\2\147\1\142\2\172\1\164\1\157\2\164"+
        "\1\152\1\151\1\156\2\150\1\145\1\157\3\172\1\143\1\156\1\164\1\137"+
        "\1\172\1\164\1\uffff\1\171\1\160\1\145\1\172";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\13\1\14\1\15\1\16\1"+
        "\17\12\uffff\1\12\42\uffff\1\11\61\uffff\1\10\40\uffff\1\7\4\uffff";
    static final String DFA11_specialS =
        "\u009e\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\30\1\27\2\uffff\1\27\22\uffff\1\30\1\uffff\1\26\5\uffff"+
            "\1\2\1\3\6\uffff\12\24\1\6\2\uffff\1\1\3\uffff\32\25\6\uffff"+
            "\1\25\1\14\1\17\1\7\1\25\1\11\2\25\1\10\2\25\1\12\1\23\2\25"+
            "\1\21\1\25\1\20\1\13\2\25\1\22\1\25\1\15\1\16\1\25\1\4\1\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\5\uffff\1\31",
            "\1\35\11\uffff\1\33\1\34",
            "\1\36",
            "\1\37",
            "\1\40\13\uffff\1\41",
            "\1\42",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\44",
            "\1\47\3\uffff\1\46\11\uffff\1\45",
            "\1\50",
            "\1\51\7\uffff\1\52",
            "\1\53\7\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "\1\55\7\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\4\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\167",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
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
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | ATTRIBUITION | DOMAIN_OBJECT | IMPORT | TYPE | PROPERTY | NUMBER | NAME | STRING_LITERAL | NEWLINE | WHITESPACE );";
        }
    }
 

}
// $ANTLR 3.3 Nov 30, 2010 12:50:56 /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g 2011-09-19 21:39:53
package br.com.maisha.terra;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class TerraParserLexer extends Lexer {
	public static final int EOF = -1;
	public static final int T__43 = 43;
	public static final int T__44 = 44;
	public static final int ASSIGN = 4;
	public static final int LEFT_PAREN = 5;
	public static final int RIGHT_PAREN = 6;
	public static final int LEFT_BRACKET = 7;
	public static final int RIGHT_BRACKET = 8;
	public static final int LEFT_BRACE = 9;
	public static final int RIGHT_BRACE = 10;
	public static final int ATTRIBUITION = 11;
	public static final int DOMAIN_OBJECT = 12;
	public static final int PACKAGE = 13;
	public static final int IMPORT = 14;
	public static final int VALIDATION_RULE = 15;
	public static final int PRESENTATION_TYPE = 16;
	public static final int SUPPORTED_PRESENTATION_TYPES = 17;
	public static final int PROPERTY = 18;
	public static final int ATTRIBUTE_PROPERTY = 19;
	public static final int OPERATION_PROPERTY = 20;
	public static final int OBJECT_PROPERTY = 21;
	public static final int FOLDER_PROPERTY = 22;
	public static final int GENERAL_PROPERTY = 23;
	public static final int OPERATION = 24;
	public static final int FOLDER = 25;
	public static final int OP_TYPE = 26;
	public static final int INTEGER = 27;
	public static final int FLOAT = 28;
	public static final int NUMBER = 29;
	public static final int LETTER = 30;
	public static final int DIGIT = 31;
	public static final int NAME = 32;
	public static final int NONCONTROL_CHAR = 33;
	public static final int STRING_LITERAL = 34;
	public static final int TYPE2 = 35;
	public static final int EXPRESSION = 36;
	public static final int SYMBOL = 37;
	public static final int SPACE = 38;
	public static final int LOWER = 39;
	public static final int UPPER = 40;
	public static final int NEWLINE = 41;
	public static final int WHITESPACE = 42;

	// delegates
	// delegators

	public TerraParserLexer() {
		;
	}

	public TerraParserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public TerraParserLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String getGrammarFileName() {
		return "/media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g";
	}

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:3:7: ( 'using' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:3:9: 'using'
			{
				match("using");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:4:7: ( ',' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:4:9: ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__44"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:46:7: ( '=' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:46:9: '='
			{
				match('=');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ASSIGN"

	// $ANTLR start "LEFT_PAREN"
	public final void mLEFT_PAREN() throws RecognitionException {
		try {
			int _type = LEFT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:47:11: ( '(' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:47:13: '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LEFT_PAREN"

	// $ANTLR start "RIGHT_PAREN"
	public final void mRIGHT_PAREN() throws RecognitionException {
		try {
			int _type = RIGHT_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:48:12: ( ')' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:48:14: ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RIGHT_PAREN"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:49:13: ( '{' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:49:15: '{'
			{
				match('{');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:50:14: ( '}' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:50:16: '}'
			{
				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "LEFT_BRACE"
	public final void mLEFT_BRACE() throws RecognitionException {
		try {
			int _type = LEFT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:51:11: ( '[' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:51:13: '['
			{
				match('[');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LEFT_BRACE"

	// $ANTLR start "RIGHT_BRACE"
	public final void mRIGHT_BRACE() throws RecognitionException {
		try {
			int _type = RIGHT_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:52:12: ( ']' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:52:14: ']'
			{
				match(']');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RIGHT_BRACE"

	// $ANTLR start "ATTRIBUITION"
	public final void mATTRIBUITION() throws RecognitionException {
		try {
			int _type = ATTRIBUITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:54:13: ( ':' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:54:14: ':'
			{
				match(':');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ATTRIBUITION"

	// $ANTLR start "DOMAIN_OBJECT"
	public final void mDOMAIN_OBJECT() throws RecognitionException {
		try {
			int _type = DOMAIN_OBJECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:55:14: ( 'domain_object' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:55:15: 'domain_object'
			{
				match("domain_object");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DOMAIN_OBJECT"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:56:8: ( 'package' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:56:9: 'package'
			{
				match("package");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PACKAGE"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:57:7: ( 'import' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:57:8: 'import'
			{
				match("import");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IMPORT"

	// $ANTLR start "VALIDATION_RULE"
	public final void mVALIDATION_RULE() throws RecognitionException {
		try {
			int _type = VALIDATION_RULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:58:16: ( 'validationRule' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:58:18: 'validationRule'
			{
				match("validationRule");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VALIDATION_RULE"

	// $ANTLR start "PRESENTATION_TYPE"
	public final void mPRESENTATION_TYPE() throws RecognitionException {
		try {
			int _type = PRESENTATION_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:59:18: ( 'presentation_type' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:59:20: 'presentation_type'
			{
				match("presentation_type");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PRESENTATION_TYPE"

	// $ANTLR start "SUPPORTED_PRESENTATION_TYPES"
	public final void mSUPPORTED_PRESENTATION_TYPES() throws RecognitionException {
		try {
			int _type = SUPPORTED_PRESENTATION_TYPES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:29: ( 'text' | 'radio' | 'checkbox' | 'combo' |
			// 'list' | 'textarea' | 'date' | 'related' | 'embedded_object' | 'group' )
			int alt1 = 10;
			alt1 = dfa1.predict(input);
			switch (alt1) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:31: 'text'
			{
				match("text");

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:40: 'radio'
			{
				match("radio");

			}
				break;
			case 3:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:50: 'checkbox'
			{
				match("checkbox");

			}
				break;
			case 4:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:63: 'combo'
			{
				match("combo");

			}
				break;
			case 5:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:73: 'list'
			{
				match("list");

			}
				break;
			case 6:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:82: 'textarea'
			{
				match("textarea");

			}
				break;
			case 7:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:95: 'date'
			{
				match("date");

			}
				break;
			case 8:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:104: 'related'
			{
				match("related");

			}
				break;
			case 9:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:116: 'embedded_object'
			{
				match("embedded_object");

			}
				break;
			case 10:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:60:136: 'group'
			{
				match("group");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SUPPORTED_PRESENTATION_TYPES"

	// $ANTLR start "PROPERTY"
	public final void mPROPERTY() throws RecognitionException {
		try {
			int _type = PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:9: ( 'x' | 'y' | 'colspan' | 'rowspan' | 'disabled'
			// | 'icon' | 'width' | 'height' | 'tooltip' )
			int alt2 = 9;
			switch (input.LA(1)) {
			case 'x': {
				alt2 = 1;
			}
				break;
			case 'y': {
				alt2 = 2;
			}
				break;
			case 'c': {
				alt2 = 3;
			}
				break;
			case 'r': {
				alt2 = 4;
			}
				break;
			case 'd': {
				alt2 = 5;
			}
				break;
			case 'i': {
				alt2 = 6;
			}
				break;
			case 'w': {
				alt2 = 7;
			}
				break;
			case 'h': {
				alt2 = 8;
			}
				break;
			case 't': {
				alt2 = 9;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

				throw nvae;
			}

			switch (alt2) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:11: 'x'
			{
				match('x');

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:17: 'y'
			{
				match('y');

			}
				break;
			case 3:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:23: 'colspan'
			{
				match("colspan");

			}
				break;
			case 4:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:35: 'rowspan'
			{
				match("rowspan");

			}
				break;
			case 5:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:48: 'disabled'
			{
				match("disabled");

			}
				break;
			case 6:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:62: 'icon'
			{
				match("icon");

			}
				break;
			case 7:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:71: 'width'
			{
				match("width");

			}
				break;
			case 8:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:81: 'height'
			{
				match("height");

			}
				break;
			case 9:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:61:92: 'tooltip'
			{
				match("tooltip");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PROPERTY"

	// $ANTLR start "ATTRIBUTE_PROPERTY"
	public final void mATTRIBUTE_PROPERTY() throws RecognitionException {
		try {
			int _type = ATTRIBUTE_PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:19: ( 'folder' | 'parent_group' |
			// 'visibleInEdition' | 'visibleInGrid' | 'content' | 'value' | 'validValues' | 'validation' | 'required' | 'max_length' |
			// 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' )
			int alt3 = 18;
			alt3 = dfa3.predict(input);
			switch (alt3) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:21: 'folder'
			{
				match("folder");

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:32: 'parent_group'
			{
				match("parent_group");

			}
				break;
			case 3:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:49: 'visibleInEdition'
			{
				match("visibleInEdition");

			}
				break;
			case 4:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:70: 'visibleInGrid'
			{
				match("visibleInGrid");

			}
				break;
			case 5:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:88: 'content'
			{
				match("content");

			}
				break;
			case 6:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:100: 'value'
			{
				match("value");

			}
				break;
			case 7:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:110: 'validValues'
			{
				match("validValues");

			}
				break;
			case 8:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:126: 'validation'
			{
				match("validation");

			}
				break;
			case 9:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:141: 'required'
			{
				match("required");

			}
				break;
			case 10:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:154: 'max_length'
			{
				match("max_length");

			}
				break;
			case 11:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:169: 'min_length'
			{
				match("min_length");

			}
				break;
			case 12:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:184: 'range'
			{
				match("range");

			}
				break;
			case 13:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:194: 'mask'
			{
				match("mask");

			}
				break;
			case 14:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:203: 'event'
			{
				match("event");

			}
				break;
			case 15:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:213: 'toString'
			{
				match("toString");

			}
				break;
			case 16:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:226: 'onetomany'
			{
				match("onetomany");

			}
				break;
			case 17:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:240: 'manytoone'
			{
				match("manytoone");

			}
				break;
			case 18:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:62:254: 'transient'
			{
				match("transient");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ATTRIBUTE_PROPERTY"

	// $ANTLR start "OPERATION_PROPERTY"
	public final void mOPERATION_PROPERTY() throws RecognitionException {
		try {
			int _type = OPERATION_PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:19: ( 'class' | 'file' | 'validWhen' | 'is_filter'
			// | 'validate' )
			int alt4 = 5;
			alt4 = dfa4.predict(input);
			switch (alt4) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:21: 'class'
			{
				match("class");

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:31: 'file'
			{
				match("file");

			}
				break;
			case 3:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:40: 'validWhen'
			{
				match("validWhen");

			}
				break;
			case 4:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:54: 'is_filter'
			{
				match("is_filter");

			}
				break;
			case 5:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:63:68: 'validate'
			{
				match("validate");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "OPERATION_PROPERTY"

	// $ANTLR start "OBJECT_PROPERTY"
	public final void mOBJECT_PROPERTY() throws RecognitionException {
		try {
			int _type = OBJECT_PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:64:16: ( 'open_filtering' | 'event_handler' )
			int alt5 = 2;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == 'o')) {
				alt5 = 1;
			} else if ((LA5_0 == 'e')) {
				alt5 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 5, 0, input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:64:18: 'open_filtering'
			{
				match("open_filtering");

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:64:37: 'event_handler'
			{
				match("event_handler");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "OBJECT_PROPERTY"

	// $ANTLR start "FOLDER_PROPERTY"
	public final void mFOLDER_PROPERTY() throws RecognitionException {
		try {
			int _type = FOLDER_PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:65:16: ( 'sequence' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:65:18: 'sequence'
			{
				match("sequence");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FOLDER_PROPERTY"

	// $ANTLR start "GENERAL_PROPERTY"
	public final void mGENERAL_PROPERTY() throws RecognitionException {
		try {
			int _type = GENERAL_PROPERTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:66:17: ( 'visible' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:66:19: 'visible'
			{
				match("visible");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GENERAL_PROPERTY"

	// $ANTLR start "OPERATION"
	public final void mOPERATION() throws RecognitionException {
		try {
			int _type = OPERATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:67:10: ( 'operation' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:67:12: 'operation'
			{
				match("operation");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "OPERATION"

	// $ANTLR start "FOLDER"
	public final void mFOLDER() throws RecognitionException {
		try {
			int _type = FOLDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:68:8: ( 'Folder' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:68:10: 'Folder'
			{
				match("Folder");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FOLDER"

	// $ANTLR start "OP_TYPE"
	public final void mOP_TYPE() throws RecognitionException {
		try {
			int _type = OP_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:70:8: ( 'java' | 'python' | 'groovy' )
			int alt6 = 3;
			switch (input.LA(1)) {
			case 'j': {
				alt6 = 1;
			}
				break;
			case 'p': {
				alt6 = 2;
			}
				break;
			case 'g': {
				alt6 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

				throw nvae;
			}

			switch (alt6) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:70:10: 'java'
			{
				match("java");

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:70:19: 'python'
			{
				match("python");

			}
				break;
			case 3:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:70:30: 'groovy'
			{
				match("groovy");

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "OP_TYPE"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:72:7: ( INTEGER | FLOAT )
			int alt7 = 2;
			alt7 = dfa7.predict(input);
			switch (alt7) {
			case 1:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:72:9: INTEGER
			{
				mINTEGER();

			}
				break;
			case 2:
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:72:19: FLOAT
			{
				mFLOAT();

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NUMBER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:73:15: ( INTEGER '.' ( '0' .. '9' )+ )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:73:17: INTEGER '.' ( '0' .. '9' )+
			{
				mINTEGER();
				match('.');
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:73:29: ( '0' .. '9' )+
				int cnt8 = 0;
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:73:29: '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt8 >= 1)
							break loop8;
						EarlyExitException eee = new EarlyExitException(8, input);
						throw eee;
					}
					cnt8++;
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end "FLOAT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:74:17: ( '0' .. '9' ( '0' .. '9' )* )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:74:19: '0' .. '9' ( '0' .. '9' )*
			{
				matchRange('0', '9');
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:74:28: ( '0' .. '9' )*
				loop9: do {
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
						alt9 = 1;
					}

					switch (alt9) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:74:28: '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						break loop9;
					}
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end "INTEGER"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:75:5: ( LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+ )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:75:7: LETTER ( LETTER | DIGIT | '.' | '_' | '/' )+
			{
				mLETTER();
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:75:14: ( LETTER | DIGIT | '.' | '_' | '/' )+
				int cnt10 = 0;
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if (((LA10_0 >= '.' && LA10_0 <= '9') || (LA10_0 >= 'A' && LA10_0 <= 'Z') || LA10_0 == '_' || (LA10_0 >= 'a' && LA10_0 <= 'z'))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
					{
						if ((input.LA(1) >= '.' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt10 >= 1)
							break loop10;
						EarlyExitException eee = new EarlyExitException(10, input);
						throw eee;
					}
					cnt10++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NAME"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:76:15: ( '\"' ( NONCONTROL_CHAR )* '\"' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:76:17: '\"' ( NONCONTROL_CHAR )* '\"'
			{
				match('\"');
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:76:21: ( NONCONTROL_CHAR )*
				loop11: do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == '\t' || (LA11_0 >= ' ' && LA11_0 <= '!') || (LA11_0 >= '#' && LA11_0 <= '~'))) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:76:21: NONCONTROL_CHAR
					{
						mNONCONTROL_CHAR();

					}
						break;

					default:
						break loop11;
					}
				} while (true);

				match('\"');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "TYPE2"
	public final void mTYPE2() throws RecognitionException {
		try {
			int _type = TYPE2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:78:7: ( ( LETTER )+ )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:78:9: ( LETTER )+
			{
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:78:9: ( LETTER )+
				int cnt12 = 0;
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if (((LA12_0 >= 'A' && LA12_0 <= 'Z') || (LA12_0 >= 'a' && LA12_0 <= 'z'))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:78:9: LETTER
					{
						mLETTER();

					}
						break;

					default:
						if (cnt12 >= 1)
							break loop12;
						EarlyExitException eee = new EarlyExitException(12, input);
						throw eee;
					}
					cnt12++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TYPE2"

	// $ANTLR start "EXPRESSION"
	public final void mEXPRESSION() throws RecognitionException {
		try {
			int _type = EXPRESSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:81:2: ( '${' ( NONCONTROL_CHAR )+ '}' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:81:4: '${' ( NONCONTROL_CHAR )+ '}'
			{
				match("${");

				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:81:8: ( NONCONTROL_CHAR )+
				int cnt13 = 0;
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == '}')) {
						int LA13_1 = input.LA(2);

						if ((LA13_1 == '\t' || (LA13_1 >= ' ' && LA13_1 <= '!') || (LA13_1 >= '#' && LA13_1 <= '~'))) {
							alt13 = 1;
						}

					} else if ((LA13_0 == '\t' || (LA13_0 >= ' ' && LA13_0 <= '!') || (LA13_0 >= '#' && LA13_0 <= '|') || LA13_0 == '~')) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:81:8: NONCONTROL_CHAR
					{
						mNONCONTROL_CHAR();

					}
						break;

					default:
						if (cnt13 >= 1)
							break loop13;
						EarlyExitException eee = new EarlyExitException(13, input);
						throw eee;
					}
					cnt13++;
				} while (true);

				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EXPRESSION"

	// $ANTLR start "NONCONTROL_CHAR"
	public final void mNONCONTROL_CHAR() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:83:25: ( LETTER | DIGIT | SYMBOL | SPACE )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
			{
				if (input.LA(1) == '\t' || (input.LA(1) >= ' ' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '~')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "NONCONTROL_CHAR"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:84:16: ( LOWER | UPPER )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "LETTER"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:85:15: ( 'a' .. 'z' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:85:17: 'a' .. 'z'
			{
				matchRange('a', 'z');

			}

		} finally {
		}
	}

	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:86:15: ( 'A' .. 'Z' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:86:17: 'A' .. 'Z'
			{
				matchRange('A', 'Z');

			}

		} finally {
		}
	}

	// $ANTLR end "UPPER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:87:15: ( '0' .. '9' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:87:17: '0' .. '9'
			{
				matchRange('0', '9');

			}

		} finally {
		}
	}

	// $ANTLR end "DIGIT"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:88:15: ( ' ' | '\\t' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
			{
				if (input.LA(1) == '\t' || input.LA(1) == ' ') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "SPACE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:90:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' |
			// '{' .. '~' )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
			{
				if (input.LA(1) == '!' || (input.LA(1) >= '#' && input.LA(1) <= '/') || (input.LA(1) >= ':' && input.LA(1) <= '@')
						|| (input.LA(1) >= '[' && input.LA(1) <= '`') || (input.LA(1) >= '{' && input.LA(1) <= '~')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "SYMBOL"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:8: ( ( ( '\\r' )? '\\n' )+ )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:10: ( ( '\\r' )? '\\n' )+
			{
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:10: ( ( '\\r' )? '\\n' )+
				int cnt15 = 0;
				loop15: do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if ((LA15_0 == '\n' || LA15_0 == '\r')) {
						alt15 = 1;
					}

					switch (alt15) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:11: ( '\\r' )? '\\n'
					{
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:11: ( '\\r' )?
						int alt14 = 2;
						int LA14_0 = input.LA(1);

						if ((LA14_0 == '\r')) {
							alt14 = 1;
						}
						switch (alt14) {
						case 1:
							// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:94:11: '\\r'
						{
							match('\r');

						}
							break;

						}

						match('\n');

					}
						break;

					default:
						if (cnt15 >= 1)
							break loop15;
						EarlyExitException eee = new EarlyExitException(15, input);
						throw eee;
					}
					cnt15++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NEWLINE"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:95:11: ( ( SPACE )+ )
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:95:13: ( SPACE )+
			{
				// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:95:13: ( SPACE )+
				int cnt16 = 0;
				loop16: do {
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if ((LA16_0 == '\t' || LA16_0 == ' ')) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
						// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:95:13: SPACE
					{
						mSPACE();

					}
						break;

					default:
						if (cnt16 >= 1)
							break loop16;
						EarlyExitException eee = new EarlyExitException(16, input);
						throw eee;
					}
					cnt16++;
				} while (true);

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WHITESPACE"

	public void mTokens() throws RecognitionException {
		// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:8: ( T__43 | T__44 | ASSIGN | LEFT_PAREN | RIGHT_PAREN |
		// LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE |
		// PRESENTATION_TYPE | SUPPORTED_PRESENTATION_TYPES | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY |
		// FOLDER_PROPERTY | GENERAL_PROPERTY | OPERATION | FOLDER | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE
		// | WHITESPACE )
		int alt17 = 32;
		alt17 = dfa17.predict(input);
		switch (alt17) {
		case 1:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:10: T__43
		{
			mT__43();

		}
			break;
		case 2:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:16: T__44
		{
			mT__44();

		}
			break;
		case 3:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:22: ASSIGN
		{
			mASSIGN();

		}
			break;
		case 4:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:29: LEFT_PAREN
		{
			mLEFT_PAREN();

		}
			break;
		case 5:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:40: RIGHT_PAREN
		{
			mRIGHT_PAREN();

		}
			break;
		case 6:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:52: LEFT_BRACKET
		{
			mLEFT_BRACKET();

		}
			break;
		case 7:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:65: RIGHT_BRACKET
		{
			mRIGHT_BRACKET();

		}
			break;
		case 8:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:79: LEFT_BRACE
		{
			mLEFT_BRACE();

		}
			break;
		case 9:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:90: RIGHT_BRACE
		{
			mRIGHT_BRACE();

		}
			break;
		case 10:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:102: ATTRIBUITION
		{
			mATTRIBUITION();

		}
			break;
		case 11:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:115: DOMAIN_OBJECT
		{
			mDOMAIN_OBJECT();

		}
			break;
		case 12:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:129: PACKAGE
		{
			mPACKAGE();

		}
			break;
		case 13:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:137: IMPORT
		{
			mIMPORT();

		}
			break;
		case 14:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:144: VALIDATION_RULE
		{
			mVALIDATION_RULE();

		}
			break;
		case 15:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:160: PRESENTATION_TYPE
		{
			mPRESENTATION_TYPE();

		}
			break;
		case 16:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:178: SUPPORTED_PRESENTATION_TYPES
		{
			mSUPPORTED_PRESENTATION_TYPES();

		}
			break;
		case 17:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:207: PROPERTY
		{
			mPROPERTY();

		}
			break;
		case 18:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:216: ATTRIBUTE_PROPERTY
		{
			mATTRIBUTE_PROPERTY();

		}
			break;
		case 19:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:235: OPERATION_PROPERTY
		{
			mOPERATION_PROPERTY();

		}
			break;
		case 20:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:254: OBJECT_PROPERTY
		{
			mOBJECT_PROPERTY();

		}
			break;
		case 21:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:270: FOLDER_PROPERTY
		{
			mFOLDER_PROPERTY();

		}
			break;
		case 22:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:286: GENERAL_PROPERTY
		{
			mGENERAL_PROPERTY();

		}
			break;
		case 23:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:303: OPERATION
		{
			mOPERATION();

		}
			break;
		case 24:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:313: FOLDER
		{
			mFOLDER();

		}
			break;
		case 25:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:320: OP_TYPE
		{
			mOP_TYPE();

		}
			break;
		case 26:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:328: NUMBER
		{
			mNUMBER();

		}
			break;
		case 27:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:335: NAME
		{
			mNAME();

		}
			break;
		case 28:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:340: STRING_LITERAL
		{
			mSTRING_LITERAL();

		}
			break;
		case 29:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:355: TYPE2
		{
			mTYPE2();

		}
			break;
		case 30:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:361: EXPRESSION
		{
			mEXPRESSION();

		}
			break;
		case 31:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:372: NEWLINE
		{
			mNEWLINE();

		}
			break;
		case 32:
			// /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:1:380: WHITESPACE
		{
			mWHITESPACE();

		}
			break;

		}

	}

	protected DFA1 dfa1 = new DFA1(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA4 dfa4 = new DFA4(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA1_eotS = "\16\uffff\1\20\2\uffff";
	static final String DFA1_eofS = "\21\uffff";
	static final String DFA1_minS = "\1\143\1\145\1\141\1\150\4\uffff\1\170\4\uffff\1\164\1\141\2\uffff";
	static final String DFA1_maxS = "\1\164\2\145\1\157\4\uffff\1\170\4\uffff\1\164\1\141\2\uffff";
	static final String DFA1_acceptS = "\4\uffff\1\5\1\7\1\11\1\12\1\uffff\1\2\1\10\1\3\1\4\2\uffff\1\6" + "\1\1";
	static final String DFA1_specialS = "\21\uffff}>";
	static final String[] DFA1_transitionS = { "\1\3\1\5\1\6\1\uffff\1\7\4\uffff\1\4\5\uffff\1\2\1\uffff\1\1", "\1\10",
			"\1\11\3\uffff\1\12", "\1\13\6\uffff\1\14", "", "", "", "", "\1\15", "", "", "", "", "\1\16", "\1\17", "", "" };

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
		for (int i = 0; i < numStates; i++) {
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
			return "60:1: SUPPORTED_PRESENTATION_TYPES : ( 'text' | 'radio' | 'checkbox' | 'combo' | 'list' | 'textarea' | 'date' | 'related' | 'embedded_object' | 'group' );";
		}
	}

	static final String DFA3_eotS = "\44\uffff";
	static final String DFA3_eofS = "\44\uffff";
	static final String DFA3_minS = "\1\143\2\uffff\1\141\1\uffff\2\141\1\uffff\1\157\1\uffff\1\163\1"
			+ "\154\2\uffff\1\156\3\uffff\2\151\3\uffff\1\142\1\uffff\1\144\1\154" + "\1\126\1\145\2\uffff\1\111\1\156\1\105\2\uffff";
	static final String DFA3_maxS = "\1\166\2\uffff\1\151\1\uffff\1\145\1\151\1\uffff\1\162\1\uffff\1"
			+ "\163\1\154\2\uffff\1\170\3\uffff\1\151\1\165\3\uffff\1\142\1\uffff"
			+ "\1\144\1\154\1\141\1\145\2\uffff\1\111\1\156\1\107\2\uffff";
	static final String DFA3_acceptS = "\1\uffff\1\1\1\2\1\uffff\1\5\2\uffff\1\16\1\uffff\1\20\2\uffff\1"
			+ "\11\1\14\1\uffff\1\13\1\17\1\22\2\uffff\1\12\1\15\1\21\1\uffff\1" + "\6\4\uffff\1\7\1\10\3\uffff\1\3\1\4";
	static final String DFA3_specialS = "\44\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\4\1\uffff\1\7\1\1\6\uffff\1\6\1\uffff\1\11\1\2\1\uffff\1" + "\5\1\uffff\1\10\1\uffff\1\3", "", "", "\1\13\7\uffff\1\12",
			"", "\1\15\3\uffff\1\14", "\1\16\7\uffff\1\17", "", "\1\20\2\uffff\1\21", "", "\1\22", "\1\23", "", "",
			"\1\26\4\uffff\1\25\4\uffff\1\24", "", "", "", "\1\27", "\1\31\13\uffff\1\30", "", "", "", "\1\32", "", "\1\33", "\1\34",
			"\1\35\12\uffff\1\36", "\1\37", "", "", "\1\40", "\1\41", "\1\42\1\uffff\1\43", "", "" };

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
		for (int i = 0; i < numStates; i++) {
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
			return "62:1: ATTRIBUTE_PROPERTY : ( 'folder' | 'parent_group' | 'visibleInEdition' | 'visibleInGrid' | 'content' | 'value' | 'validValues' | 'validation' | 'required' | 'max_length' | 'min_length' | 'range' | 'mask' | 'event' | 'toString' | 'onetomany' | 'manytoone' | 'transient' );";
		}
	}

	static final String DFA4_eotS = "\13\uffff";
	static final String DFA4_eofS = "\13\uffff";
	static final String DFA4_minS = "\1\143\2\uffff\1\141\1\uffff\1\154\1\151\1\144\1\127\2\uffff";
	static final String DFA4_maxS = "\1\166\2\uffff\1\141\1\uffff\1\154\1\151\1\144\1\141\2\uffff";
	static final String DFA4_acceptS = "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3\1\5";
	static final String DFA4_specialS = "\13\uffff}>";
	static final String[] DFA4_transitionS = { "\1\1\2\uffff\1\2\2\uffff\1\4\14\uffff\1\3", "", "", "\1\5", "", "\1\6", "\1\7", "\1\10",
			"\1\11\11\uffff\1\12", "", "" };

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
		for (int i = 0; i < numStates; i++) {
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
			return "63:1: OPERATION_PROPERTY : ( 'class' | 'file' | 'validWhen' | 'is_filter' | 'validate' );";
		}
	}

	static final String DFA7_eotS = "\1\uffff\2\3\2\uffff";
	static final String DFA7_eofS = "\5\uffff";
	static final String DFA7_minS = "\1\60\2\56\2\uffff";
	static final String DFA7_maxS = "\3\71\2\uffff";
	static final String DFA7_acceptS = "\3\uffff\1\1\1\2";
	static final String DFA7_specialS = "\5\uffff}>";
	static final String[] DFA7_transitionS = { "\12\1", "\1\4\1\uffff\12\2", "\1\4\1\uffff\12\2", "", "" };

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}

		public String getDescription() {
			return "72:1: NUMBER : ( INTEGER | FLOAT );";
		}
	}

	static final String DFA17_eotS = "\1\uffff\1\46\11\uffff\12\46\2\101\10\46\1\uffff\1\46\4\uffff\1"
			+ "\50\1\uffff\1\50\1\uffff\30\50\1\uffff\71\50\1\u00aa\6\50\1\101"
			+ "\4\50\1\u00aa\15\50\1\u00aa\7\50\1\u00ca\1\50\1\u00cc\7\50\1\u00d4"
			+ "\1\u00d5\1\50\1\uffff\10\50\1\u00cc\5\50\1\u00aa\1\u00cc\4\50\1"
			+ "\u00aa\2\50\1\u00ca\1\50\1\u00cc\1\u00aa\1\50\1\101\2\50\1\uffff"
			+ "\1\50\1\uffff\7\50\2\uffff\5\50\1\u00d4\1\u00fe\21\50\1\u00d4\1"
			+ "\101\1\u00cc\7\50\1\u0117\2\50\1\u011a\2\50\1\uffff\4\50\1\u0123"
			+ "\1\50\1\101\2\50\1\u00aa\1\50\1\101\1\50\1\101\1\u00cc\11\50\1\uffff"
			+ "\1\50\1\101\1\uffff\4\50\1\u00ca\3\50\1\uffff\1\u00aa\1\u00cc\1"
			+ "\50\1\u00cc\1\u00aa\10\50\1\u0143\3\50\1\u00ca\2\50\1\u00ca\1\50"
			+ "\1\u00cc\3\50\1\u00cc\1\50\1\u00cc\1\50\1\u0150\1\uffff\3\50\1\u00cc"
			+ "\5\50\2\u00cc\1\50\1\uffff\4\50\1\u00cc\6\50\1\u00cc\7\50\1\u016c"
			+ "\3\50\1\u00cc\1\50\1\u0171\1\50\1\uffff\1\50\1\u0174\2\50\1\uffff"
			+ "\1\u0171\1\50\1\uffff\1\50\1\u00aa\1\50\1\u00cc\1\u017a\1\uffff";
	static final String DFA17_eofS = "\u017b\uffff";
	static final String DFA17_minS = "\1\11\1\56\11\uffff\24\56\1\uffff\1\56\4\uffff\1\101\1\uffff\1\101"
			+ "\1\uffff\30\101\1\uffff\25\101\1\146\43\101\1\56\6\101\1\56\1\151"
			+ "\3\101\1\56\15\101\1\56\7\101\1\56\1\154\1\56\1\101\1\154\5\101"
			+ "\2\56\1\101\1\uffff\6\101\1\154\1\101\1\56\5\101\2\56\4\101\1\56"
			+ "\2\101\1\56\1\101\2\56\1\101\1\56\2\101\1\uffff\1\145\1\uffff\1"
			+ "\101\1\145\1\101\1\146\3\101\2\uffff\5\101\2\56\1\164\17\101\1\150"
			+ "\3\56\1\156\1\101\1\156\1\101\1\151\2\101\1\56\1\157\1\101\1\56"
			+ "\1\147\1\101\1\uffff\1\145\3\101\1\56\1\101\1\56\2\101\1\56\1\101"
			+ "\1\56\1\101\2\56\1\101\1\141\1\147\1\101\1\147\1\101\1\154\2\101"
			+ "\1\uffff\1\142\1\56\1\uffff\1\162\1\101\1\162\1\101\1\56\3\101\1"
			+ "\uffff\2\56\1\101\2\56\1\101\1\156\1\164\1\101\1\164\1\101\1\164"
			+ "\1\101\1\56\1\152\1\157\1\101\1\56\2\101\1\56\1\101\1\56\1\157\1"
			+ "\144\1\150\1\56\1\150\1\56\1\145\1\56\1\uffff\1\145\1\165\1\101"
			+ "\1\56\3\101\1\142\1\154\2\56\1\162\1\uffff\1\143\1\160\2\101\1\56"
			+ "\2\101\1\152\1\145\1\151\1\164\1\56\4\101\1\145\1\162\1\156\1\56"
			+ "\1\164\2\101\1\56\1\143\1\56\1\147\1\uffff\1\171\1\56\1\101\1\164"
			+ "\1\uffff\1\56\1\160\1\uffff\1\101\1\56\1\145\2\56\1\uffff";
	static final String DFA17_maxS = "\1\175\1\172\11\uffff\24\172\1\uffff\1\172\4\uffff\1\172\1\uffff"
			+ "\1\172\1\uffff\30\172\1\uffff\25\172\1\146\53\172\1\151\32\172\1"
			+ "\154\2\172\1\154\10\172\1\uffff\6\172\1\154\30\172\1\uffff\1\145"
			+ "\1\uffff\1\172\1\145\1\172\1\146\3\172\2\uffff\7\172\1\164\17\172"
			+ "\1\150\3\172\1\156\1\172\1\156\1\172\1\151\3\172\1\157\2\172\1\147"
			+ "\1\172\1\uffff\1\145\17\172\1\141\1\147\1\172\1\147\1\172\1\154"
			+ "\2\172\1\uffff\1\142\1\172\1\uffff\1\162\1\172\1\162\5\172\1\uffff"
			+ "\6\172\1\156\1\164\1\172\1\164\1\172\1\164\2\172\1\152\1\157\7\172"
			+ "\1\157\1\144\1\150\1\172\1\150\1\172\1\145\1\172\1\uffff\1\145\1"
			+ "\165\5\172\1\142\1\154\2\172\1\162\1\uffff\1\143\1\160\5\172\1\152"
			+ "\1\145\1\151\1\164\5\172\1\145\1\162\1\156\1\172\1\164\3\172\1\143"
			+ "\1\172\1\147\1\uffff\1\171\2\172\1\164\1\uffff\1\172\1\160\1\uffff" + "\2\172\1\145\2\172\1\uffff";
	static final String DFA17_acceptS = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\24\uffff\1\32\1"
			+ "\uffff\1\34\1\36\1\37\1\40\1\uffff\1\35\1\uffff\1\33\30\uffff\1"
			+ "\21\150\uffff\1\20\37\uffff\1\23\1\uffff\1\22\7\uffff\1\31\1\1\50"
			+ "\uffff\1\15\30\uffff\1\30\2\uffff\1\14\10\uffff\1\26\37\uffff\1"
			+ "\25\14\uffff\1\27\33\uffff\1\13\4\uffff\1\24\2\uffff\1\16\5\uffff" + "\1\17";
	static final String DFA17_specialS = "\u017b\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\44\1\43\2\uffff\1\43\22\uffff\1\44\1\uffff\1\41\1\uffff\1" + "\42\3\uffff\1\4\1\5\2\uffff\1\2\3\uffff\12\37\1\12\2\uffff\1"
					+ "\3\3\uffff\5\40\1\35\24\40\1\10\1\uffff\1\11\3\uffff\2\40\1"
					+ "\21\1\13\1\23\1\31\1\24\1\30\1\15\1\36\1\40\1\22\1\32\1\40\1"
					+ "\33\1\14\1\40\1\20\1\34\1\17\1\1\1\16\1\27\1\25\1\26\1\40\1" + "\6\1\uffff\1\7",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\22\47\1\45\7\47", "", "", "", "", "", "", "", "", "",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\52\7\47\1\53\5" + "\47\1\51\13\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\54\20\47\1\55\6" + "\47\1\56\1\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\2\47\1\60\11\47\1" + "\57\5\47\1\61\7\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\62\7\47\1\63\21" + "\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\64\11\47\1" + "\65\2\47\1\66\10\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\67\3\47\1\70\11" + "\47\1\71\13\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\7\47\1\72\3\47\1" + "\74\2\47\1\73\13\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\75\21\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\14\47\1\76\10\47" + "\1\77\4\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\21\47\1\100\10\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\102\21\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\103\25\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\10\47\1\105\5\47" + "\1\104\13\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\106\7\47\1\107" + "\21\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\15\47\1\110\1\47" + "\1\111\12\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\4\47\1\112\25\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\16\47\1\113\13\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\114\31\47", "", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "", "", "", "",
			"\32\47\6\uffff\10\47\1\115\21\47", "", "\32\47\6\uffff\32\47", "", "\32\47\6\uffff\14\47\1\116\15\47",
			"\32\47\6\uffff\23\47\1\117\6\47", "\32\47\6\uffff\22\47\1\120\7\47", "\32\47\6\uffff\2\47\1\121\16\47\1\122\10\47",
			"\32\47\6\uffff\4\47\1\123\25\47", "\32\47\6\uffff\23\47\1\124\6\47", "\32\47\6\uffff\17\47\1\125\12\47",
			"\32\47\6\uffff\16\47\1\126\13\47", "\32\47\4\uffff\1\127\1\uffff\32\47", "\32\47\6\uffff\13\47\1\130\16\47",
			"\32\47\6\uffff\22\47\1\131\7\47", "\32\47\6\uffff\27\47\1\132\2\47", "\22\47\1\134\7\47\6\uffff\16\47\1\133\13\47",
			"\32\47\6\uffff\1\135\31\47", "\32\47\6\uffff\3\47\1\136\11\47\1\137\14\47", "\32\47\6\uffff\13\47\1\140\4\47\1\141\11\47",
			"\32\47\6\uffff\26\47\1\142\3\47", "\32\47\6\uffff\4\47\1\143\25\47", "\32\47\6\uffff\13\47\1\145\1\144\1\146\14\47",
			"\32\47\6\uffff\1\147\31\47", "\32\47\6\uffff\22\47\1\150\7\47", "\32\47\6\uffff\1\47\1\151\30\47",
			"\32\47\6\uffff\4\47\1\152\25\47", "\32\47\6\uffff\16\47\1\153\13\47", "", "\32\47\6\uffff\3\47\1\154\26\47",
			"\32\47\6\uffff\10\47\1\155\21\47", "\32\47\6\uffff\13\47\1\156\16\47", "\32\47\6\uffff\13\47\1\157\16\47",
			"\32\47\6\uffff\15\47\1\162\4\47\1\161\4\47\1\160\2\47", "\32\47\6\uffff\15\47\1\163\14\47", "\32\47\6\uffff\4\47\1\164\25\47",
			"\32\47\6\uffff\4\47\1\165\25\47", "\32\47\6\uffff\20\47\1\166\11\47", "\32\47\6\uffff\13\47\1\167\16\47",
			"\32\47\6\uffff\25\47\1\170\4\47", "\32\47\6\uffff\15\47\1\171\14\47", "\32\47\6\uffff\1\172\31\47",
			"\32\47\6\uffff\4\47\1\173\25\47", "\32\47\6\uffff\1\174\31\47", "\32\47\6\uffff\12\47\1\175\17\47",
			"\32\47\6\uffff\4\47\1\176\25\47", "\32\47\6\uffff\22\47\1\177\7\47", "\32\47\6\uffff\7\47\1\u0080\22\47",
			"\32\47\6\uffff\16\47\1\u0081\13\47", "\32\47\6\uffff\15\47\1\u0082\14\47", "\1\u0083",
			"\32\47\6\uffff\10\47\1\u0084\13\47\1\u0085\5\47", "\32\47\6\uffff\10\47\1\u0086\21\47", "\32\47\6\uffff\23\47\1\u0087\6\47",
			"\32\47\6\uffff\13\47\1\u0088\16\47", "\32\47\6\uffff\23\47\1\u0089\6\47", "\32\47\6\uffff\15\47\1\u008a\14\47",
			"\32\47\6\uffff\10\47\1\u008b\21\47", "\32\47\6\uffff\6\47\1\u008c\23\47", "\32\47\6\uffff\1\u008d\31\47",
			"\32\47\6\uffff\24\47\1\u008e\5\47", "\32\47\6\uffff\22\47\1\u008f\7\47", "\32\47\6\uffff\2\47\1\u0090\27\47",
			"\32\47\6\uffff\1\47\1\u0091\30\47", "\32\47\6\uffff\22\47\1\u0092\7\47", "\32\47\6\uffff\23\47\1\u0093\6\47",
			"\32\47\6\uffff\22\47\1\u0094\7\47", "\32\47\6\uffff\23\47\1\u0095\6\47", "\32\47\6\uffff\4\47\1\u0096\25\47",
			"\32\47\6\uffff\15\47\1\u0097\14\47", "\32\47\6\uffff\16\47\1\u0099\5\47\1\u0098\5\47", "\32\47\6\uffff\23\47\1\u009a\6\47",
			"\32\47\6\uffff\6\47\1\u009b\23\47", "\32\47\6\uffff\3\47\1\u009c\26\47", "\32\47\6\uffff\4\47\1\u009d\25\47",
			"\32\47\4\uffff\1\u009e\1\uffff\32\47", "\32\47\6\uffff\12\47\1\u009f\17\47", "\32\47\6\uffff\30\47\1\u00a0\1\47",
			"\32\47\4\uffff\1\u00a1\1\uffff\32\47", "\32\47\6\uffff\23\47\1\u00a2\6\47", "\32\47\6\uffff\15\47\1\u00a3\3\47\1\u00a4\10\47",
			"\32\47\6\uffff\24\47\1\u00a5\5\47", "\32\47\6\uffff\3\47\1\u00a6\26\47", "\32\47\6\uffff\1\u00a7\31\47",
			"\32\47\6\uffff\6\47\1\u00a8\23\47", "\32\47\6\uffff\10\47\1\u00a9\21\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\1\47\1\u00ab\30\47", "\32\47\6\uffff\1\u00ac\31\47", "\32\47\6\uffff\15\47\1\u00ad\14\47",
			"\32\47\6\uffff\4\47\1\u00ae\25\47", "\32\47\6\uffff\16\47\1\u00af\13\47", "\32\47\6\uffff\21\47\1\u00b0\10\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u00b1", "\32\47\6\uffff\3\47\1\u00b2\26\47",
			"\32\47\6\uffff\4\47\1\u00b3\25\47", "\32\47\6\uffff\1\47\1\u00b4\30\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\1\u00b5\31\47", "\32\47\6\uffff\23\47\1\u00b6\6\47",
			"\32\47\6\uffff\21\47\1\u00b7\10\47", "\32\47\6\uffff\22\47\1\u00b8\7\47", "\32\47\6\uffff\16\47\1\u00b9\13\47",
			"\32\47\6\uffff\4\47\1\u00ba\25\47", "\32\47\6\uffff\23\47\1\u00bb\6\47", "\32\47\6\uffff\10\47\1\u00bc\21\47",
			"\32\47\6\uffff\17\47\1\u00bd\12\47", "\32\47\6\uffff\12\47\1\u00be\17\47", "\32\47\6\uffff\16\47\1\u00bf\13\47",
			"\32\47\6\uffff\17\47\1\u00c0\12\47", "\32\47\6\uffff\4\47\1\u00c1\25\47", "\32\47\6\uffff\22\47\1\u00c2\7\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\3\47\1\u00c3\26\47", "\32\47\6\uffff\23\47\1\u00c4\6\47",
			"\32\47\6\uffff\17\47\1\u00c5\12\47", "\32\47\6\uffff\25\47\1\u00c6\4\47", "\32\47\6\uffff\7\47\1\u00c7\22\47",
			"\32\47\6\uffff\7\47\1\u00c8\22\47", "\32\47\6\uffff\4\47\1\u00c9\25\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\1\u00cb", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\23\47\1\u00cd\6\47", "\1\u00ce",
			"\32\47\6\uffff\16\47\1\u00cf\13\47", "\32\47\4\uffff\1\u00d0\1\uffff\32\47", "\32\47\6\uffff\1\u00d1\31\47",
			"\32\47\6\uffff\4\47\1\u00d2\25\47", "\32\47\6\uffff\4\47\1\u00d3\25\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\15\47\1\u00d6\14\47", "",
			"\32\47\6\uffff\13\47\1\u00d7\16\47", "\32\47\6\uffff\6\47\1\u00d8\23\47", "\32\47\6\uffff\23\47\1\u00d9\6\47",
			"\32\47\6\uffff\15\47\1\u00da\14\47", "\32\47\6\uffff\15\47\1\u00db\14\47", "\32\47\6\uffff\23\47\1\u00dc\6\47", "\1\u00dd",
			"\25\47\1\u00df\1\u00e0\3\47\6\uffff\1\u00de\31\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\13\47\1\u00e1\16\47", "\32\47\6\uffff\21\47\1\u00e2\10\47", "\32\47\6\uffff\10\47\1\u00e3\21\47",
			"\32\47\6\uffff\10\47\1\u00e4\21\47", "\32\47\6\uffff\10\47\1\u00e5\21\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\4\47\1\u00e6\25\47", "\32\47\6\uffff\21\47\1\u00e7\10\47",
			"\32\47\6\uffff\1\u00e8\31\47", "\32\47\6\uffff\1\47\1\u00e9\30\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\1\u00ea\31\47", "\32\47\6\uffff\15\47\1\u00eb\14\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\3\47\1\u00ec\26\47", "\14\50\7\uffff\32\47\4\uffff\1\u00ed\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\30\47\1\u00ee\1\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\23\47\1\u00ef\6\47", "\32\47\6\uffff\21\47\1\u00f0\10\47",
			"", "\1\u00f1", "", "\32\47\6\uffff\16\47\1\u00f2\13\47", "\1\u00f3", "\32\47\6\uffff\14\47\1\u00f4\15\47", "\1\u00f5",
			"\32\47\6\uffff\23\47\1\u00f6\6\47", "\32\47\6\uffff\15\47\1\u00f7\14\47", "\32\47\6\uffff\21\47\1\u00f8\10\47", "", "",
			"\32\47\4\uffff\1\u00f9\1\uffff\32\47", "\32\47\6\uffff\4\47\1\u00fa\25\47", "\32\47\6\uffff\4\47\1\u00fb\25\47",
			"\32\47\4\uffff\1\u00fc\1\uffff\32\47", "\32\47\6\uffff\23\47\1\u00fd\6\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u00ff", "\32\47\6\uffff\23\47\1\u0100\6\47",
			"\32\47\6\uffff\1\u0101\31\47", "\32\47\6\uffff\7\47\1\u0102\22\47", "\32\47\6\uffff\4\47\1\u0103\25\47",
			"\32\47\6\uffff\4\47\1\u0104\25\47", "\32\47\6\uffff\17\47\1\u0105\12\47", "\32\47\6\uffff\15\47\1\u0106\14\47",
			"\32\47\6\uffff\4\47\1\u0107\25\47", "\32\47\6\uffff\3\47\1\u0108\26\47", "\32\47\6\uffff\4\47\1\u0109\25\47",
			"\32\47\6\uffff\15\47\1\u010a\14\47", "\32\47\6\uffff\16\47\1\u010b\13\47", "\32\47\6\uffff\15\47\1\u010c\14\47",
			"\32\47\6\uffff\23\47\1\u010d\6\47", "\32\47\6\uffff\4\47\1\u010e\25\47", "\1\u010f",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u0110", "\32\47\6\uffff\16\47\1\u0111\13\47", "\1\u0112",
			"\32\47\6\uffff\1\u0113\31\47", "\1\u0114", "\32\47\6\uffff\10\47\1\u0115\21\47", "\32\47\6\uffff\2\47\1\u0116\27\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u0118", "\32\47\6\uffff\3\47\1\u0119\26\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u011b", "\32\47\6\uffff\1\u011c\31\47", "", "\1\u011d",
			"\32\47\6\uffff\4\47\1\u011f\3\47\1\u011e\21\47", "\32\47\6\uffff\13\47\1\u0120\16\47", "\32\47\6\uffff\4\47\1\u0121\25\47",
			"\14\50\7\uffff\10\47\1\u0122\21\47\4\uffff\1\50\1\uffff\32" + "\47", "\32\47\6\uffff\1\u0124\31\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\6\47\1\u0125\23\47", "\32\47\6\uffff\15\47\1\u0126\14\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\3\47\1\u0127\26\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\27\47\1\u0128\2\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\3\47\1\u0129\26\47", "\1\u012a", "\1\u012b", "\32\47\6\uffff\15\47\1\u012c\14\47", "\1\u012d",
			"\32\47\6\uffff\15\47\1\u012e\14\47", "\1\u012f", "\32\47\6\uffff\16\47\1\u0130\13\47", "\32\47\6\uffff\4\47\1\u0131\25\47",
			"", "\1\u0132", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "", "\1\u0133", "\32\47\6\uffff\23\47\1\u0134\6\47",
			"\1\u0135", "\32\47\6\uffff\16\47\1\u0136\13\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\24\47\1\u0137\5\47", "\32\47\6\uffff\15\47\1\u0138\14\47", "\32\47\6\uffff\15\47\1\u0139\14\47", "",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\32\47\6\uffff\23\47\1\u013a\6\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\4\uffff\1\u013b\1\uffff\32\47", "\1\u013c", "\1\u013d",
			"\32\47\6\uffff\4\47\1\u013e\25\47", "\1\u013f", "\32\47\6\uffff\30\47\1\u0140\1\47", "\1\u0141",
			"\32\47\6\uffff\15\47\1\u0142\14\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u0144", "\1\u0145",
			"\32\47\6\uffff\10\47\1\u0146\21\47", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\32\47\6\uffff\15\47\1\u0147\14\47",
			"\32\47\6\uffff\4\47\1\u0148\25\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\4\47\1\u0149\1\47\1\u014a\23\47\6\uffff\32\47", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u014b", "\1\u014c",
			"\1\u014d", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u014e", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\1\u014f", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "", "\1\u0151", "\1\u0152",
			"\32\47\6\uffff\16\47\1\u0153\13\47", "\14\50\7\uffff\21\47\1\u0154\10\47\4\uffff\1\50\1\uffff\32" + "\47",
			"\32\47\6\uffff\22\47\1\u0155\7\47", "\32\47\6\uffff\3\47\1\u0156\26\47", "\32\47\6\uffff\21\47\1\u0157\10\47", "\1\u0158",
			"\1\u0159", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\1\u015a",
			"", "\1\u015b", "\1\u015c", "\32\47\6\uffff\15\47\1\u015d\14\47", "\32\47\6\uffff\24\47\1\u015e\5\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\10\47\1\u015f\21\47", "\32\47\6\uffff\10\47\1\u0160\21\47",
			"\1\u0161", "\1\u0162", "\1\u0163", "\1\u0164", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\32\47\4\uffff\1\u0165\1\uffff\32\47", "\32\47\6\uffff\13\47\1\u0166\16\47", "\32\47\6\uffff\23\47\1\u0167\6\47",
			"\32\47\6\uffff\3\47\1\u0168\26\47", "\1\u0169", "\1\u016a", "\1\u016b", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u016d", "\32\47\6\uffff\4\47\1\u016e\25\47", "\32\47\6\uffff\10\47\1\u016f\21\47",
			"\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\1\u0170", "\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\1\u0172",
			"", "\1\u0173", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47", "\32\47\6\uffff\16\47\1\u0175\13\47", "\1\u0176", "",
			"\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\1\u0177", "", "\32\47\6\uffff\15\47\1\u0178\14\47",
			"\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "\1\u0179", "\14\50\7\uffff\32\47\4\uffff\1\50\1\uffff\32\47",
			"\14\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50", "" };

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( T__43 | T__44 | ASSIGN | LEFT_PAREN | RIGHT_PAREN | LEFT_BRACKET | RIGHT_BRACKET | LEFT_BRACE | RIGHT_BRACE | ATTRIBUITION | DOMAIN_OBJECT | PACKAGE | IMPORT | VALIDATION_RULE | PRESENTATION_TYPE | SUPPORTED_PRESENTATION_TYPES | PROPERTY | ATTRIBUTE_PROPERTY | OPERATION_PROPERTY | OBJECT_PROPERTY | FOLDER_PROPERTY | GENERAL_PROPERTY | OPERATION | FOLDER | OP_TYPE | NUMBER | NAME | STRING_LITERAL | TYPE2 | EXPRESSION | NEWLINE | WHITESPACE );";
		}
	}

}
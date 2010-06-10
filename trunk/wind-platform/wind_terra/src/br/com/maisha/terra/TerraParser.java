// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g 2010-06-10 16:51:14
 
package br.com.maisha.terra; 
import java.util.HashMap;
import java.util.Map;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Validation;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.rcp.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TerraParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "VALIDATION_RULE", "TYPE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
    public static final int PACKAGE=11;
    public static final int DOMAIN_OBJECT=10;
    public static final int INTEGER=20;
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
    public static final int EOF=-1;
    public static final int SPACE=30;
    public static final int TYPE=14;
    public static final int RIGHT_PAREN=6;
    public static final int IMPORT=12;
    public static final int NAME=25;
    public static final int STRING_LITERAL=27;
    public static final int NEWLINE=33;
    public static final int NONCONTROL_CHAR=26;
    public static final int PROPERTY=15;
    public static final int RIGHT_BRACKET=8;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int DIGIT=24;
    public static final int LOWER=31;
    public static final int OPERATION=18;
    public static final int EXPRESSION=28;
    public static final int OP_TYPE=19;
    public static final int UPPER=32;

    // delegates
    // delegators


        public TerraParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TerraParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TerraParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g"; }


    public DomainObject domainObject = null;
    private String pckg = "";
    private List<Attribute> atts = new ArrayList<Attribute>();
    private List<Operation> ops = new ArrayList<Operation>();
    private Map<String, Property> props = new HashMap<String, Property>();
    private Map<String, Property> op_props = new HashMap<String, Property>();
    private List<Import> imports = new ArrayList<Import>();
    private List<Validation> validationRulz = new ArrayList<Validation>();
    private List<ValidationRule> validationRulzEntry = new ArrayList<ValidationRule>();


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:42:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
    public final TerraParser.domain_object_return domain_object() throws RecognitionException {
        TerraParser.domain_object_return retval = new TerraParser.domain_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOMAIN_OBJECT3=null;
        Token NAME4=null;
        Token STRING_LITERAL5=null;
        Token LEFT_BRACKET6=null;
        Token RIGHT_BRACKET8=null;
        TerraParser.package_declaration_return package_declaration1 = null;

        TerraParser.import_declaration_return import_declaration2 = null;

        TerraParser.body_return body7 = null;


        Object DOMAIN_OBJECT3_tree=null;
        Object NAME4_tree=null;
        Object STRING_LITERAL5_tree=null;
        Object LEFT_BRACKET6_tree=null;
        Object RIGHT_BRACKET8_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:4: ( package_declaration )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object58);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:27: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object62);
            	    import_declaration2=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT3=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object67); 
            DOMAIN_OBJECT3_tree = (Object)adaptor.create(DOMAIN_OBJECT3);
            adaptor.addChild(root_0, DOMAIN_OBJECT3_tree);

            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object69); 
            NAME4_tree = (Object)adaptor.create(NAME4);
            adaptor.addChild(root_0, NAME4_tree);

            STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object71); 
            STRING_LITERAL5_tree = (Object)adaptor.create(STRING_LITERAL5);
            adaptor.addChild(root_0, STRING_LITERAL5_tree);

            LEFT_BRACKET6=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object73); 
            LEFT_BRACKET6_tree = (Object)adaptor.create(LEFT_BRACKET6);
            adaptor.addChild(root_0, LEFT_BRACKET6_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=VALIDATION_RULE && LA2_0<=TYPE)||LA2_0==OPERATION||LA2_0==LETTER||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:43:96: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object75);
                    body7=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body7.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET8=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object78); 
            RIGHT_BRACKET8_tree = (Object)adaptor.create(RIGHT_BRACKET8);
            adaptor.addChild(root_0, RIGHT_BRACKET8_tree);


            		domainObject = new DomainObject((NAME4!=null?NAME4.getText():null), (STRING_LITERAL5!=null?STRING_LITERAL5.getText():null));
            		domainObject.setPckg(pckg);
            		domainObject.setAtts(atts);
            		domainObject.setOperations(ops);
            		domainObject.setImports(imports);
            		domainObject.setValidations(validationRulz);
            		atts = new ArrayList<Attribute>();
            		ops = new ArrayList<Operation>();
            		validationRulz = new ArrayList<Validation>();
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "domain_object"

    public static class package_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "package_declaration"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:56:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
    public final TerraParser.package_declaration_return package_declaration() throws RecognitionException {
        TerraParser.package_declaration_return retval = new TerraParser.package_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PACKAGE9=null;
        Token NAME10=null;
        Token NEWLINE11=null;

        Object PACKAGE9_tree=null;
        Object NAME10_tree=null;
        Object NEWLINE11_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:2: ( PACKAGE NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration90); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration92); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:17: ( NEWLINE )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:57:17: NEWLINE
            	    {
            	    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_package_declaration94); 
            	    NEWLINE11_tree = (Object)adaptor.create(NEWLINE11);
            	    adaptor.addChild(root_0, NEWLINE11_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            		pckg = (NAME10!=null?NAME10.getText():null);
            		
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "package_declaration"

    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declaration"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:63:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
    public final TerraParser.import_declaration_return import_declaration() throws RecognitionException {
        TerraParser.import_declaration_return retval = new TerraParser.import_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT12=null;
        Token NAME13=null;
        Token NEWLINE14=null;

        Object IMPORT12_tree=null;
        Object NAME13_tree=null;
        Object NEWLINE14_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:64:2: ( IMPORT NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:64:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration109); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration111); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:64:16: ( NEWLINE )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:64:16: NEWLINE
            	    {
            	    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration113); 
            	    NEWLINE14_tree = (Object)adaptor.create(NEWLINE14);
            	    adaptor.addChild(root_0, NEWLINE14_tree);


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


            		imports.add(new Import((NAME13!=null?NAME13.getText():null)) );
            		
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "import_declaration"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:1: body : ( attr | operation | validation_rulz )+ ;
    public final TerraParser.body_return body() throws RecognitionException {
        TerraParser.body_return retval = new TerraParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.attr_return attr15 = null;

        TerraParser.operation_return operation16 = null;

        TerraParser.validation_rulz_return validation_rulz17 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:6: ( ( attr | operation | validation_rulz )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:11: ( attr | operation | validation_rulz )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:11: ( attr | operation | validation_rulz )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case TYPE:
                case LETTER:
                    {
                    alt5=1;
                    }
                    break;
                case OPERATION:
                case NEWLINE:
                    {
                    alt5=2;
                    }
                    break;
                case VALIDATION_RULE:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body131);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body135);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:70:31: validation_rulz
            	    {
            	    pushFollow(FOLLOW_validation_rulz_in_body139);
            	    validation_rulz17=validation_rulz();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_rulz17.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class attr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:1: attr : ( TYPE | LETTER ( LETTER )+ ) NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParser.attr_return attr() throws RecognitionException {
        TerraParser.attr_return retval = new TerraParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE18=null;
        Token LETTER19=null;
        Token LETTER20=null;
        Token NAME21=null;
        Token STRING_LITERAL22=null;
        Token LEFT_BRACKET23=null;
        Token RIGHT_BRACKET25=null;
        TerraParser.attr_body_return attr_body24 = null;


        Object TYPE18_tree=null;
        Object LETTER19_tree=null;
        Object LETTER20_tree=null;
        Object NAME21_tree=null;
        Object STRING_LITERAL22_tree=null;
        Object LEFT_BRACKET23_tree=null;
        Object RIGHT_BRACKET25_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:6: ( ( TYPE | LETTER ( LETTER )+ ) NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:10: ( TYPE | LETTER ( LETTER )+ ) NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:10: ( TYPE | LETTER ( LETTER )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TYPE) ) {
                alt7=1;
            }
            else if ( (LA7_0==LETTER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:11: TYPE
                    {
                    TYPE18=(Token)match(input,TYPE,FOLLOW_TYPE_in_attr153); 
                    TYPE18_tree = (Object)adaptor.create(TYPE18);
                    adaptor.addChild(root_0, TYPE18_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:19: LETTER ( LETTER )+
                    {
                    LETTER19=(Token)match(input,LETTER,FOLLOW_LETTER_in_attr158); 
                    LETTER19_tree = (Object)adaptor.create(LETTER19);
                    adaptor.addChild(root_0, LETTER19_tree);

                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:25: ( LETTER )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==LETTER) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:73:26: LETTER
                    	    {
                    	    LETTER20=(Token)match(input,LETTER,FOLLOW_LETTER_in_attr160); 
                    	    LETTER20_tree = (Object)adaptor.create(LETTER20);
                    	    adaptor.addChild(root_0, LETTER20_tree);


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
                    break;

            }

            NAME21=(Token)match(input,NAME,FOLLOW_NAME_in_attr165); 
            NAME21_tree = (Object)adaptor.create(NAME21);
            adaptor.addChild(root_0, NAME21_tree);

            STRING_LITERAL22=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr167); 
            STRING_LITERAL22_tree = (Object)adaptor.create(STRING_LITERAL22);
            adaptor.addChild(root_0, STRING_LITERAL22_tree);

            LEFT_BRACKET23=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr169); 
            LEFT_BRACKET23_tree = (Object)adaptor.create(LEFT_BRACKET23);
            adaptor.addChild(root_0, LEFT_BRACKET23_tree);

            pushFollow(FOLLOW_attr_body_in_attr171);
            attr_body24=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body24.getTree());
            RIGHT_BRACKET25=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr173); 
            RIGHT_BRACKET25_tree = (Object)adaptor.create(RIGHT_BRACKET25);
            adaptor.addChild(root_0, RIGHT_BRACKET25_tree);


            		Attribute att = new Attribute((TYPE18!=null?TYPE18.getText():null), (NAME21!=null?NAME21.getText():null), (STRING_LITERAL22!=null?STRING_LITERAL22.getText():null));
            		att.setDomainObject(domainObject);		
            		att.setProperties(props);
            		atts.add(att);
            		props = new HashMap<String, Property>();

            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr"

    public static class attr_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_body"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:83:1: attr_body : ( property )+ ;
    public final TerraParser.attr_body_return attr_body() throws RecognitionException {
        TerraParser.attr_body_return retval = new TerraParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.property_return property26 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:83:11: ( ( property )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:83:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:83:14: ( property )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PROPERTY && LA8_0<=ATTRIBUTE_PROPERTY)||LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:83:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body186);
            	    property26=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property26.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_body"

    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParser.property_return property() throws RecognitionException {
        TerraParser.property_return retval = new TerraParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE27=null;
        Token ATTRIBUITION29=null;
        TerraParser.attr_prop_name_return attr_prop_name28 = null;

        TerraParser.value_return value30 = null;

        TerraParser.expression_return expression31 = null;


        Object NEWLINE27_tree=null;
        Object ATTRIBUITION29_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=PROPERTY && LA10_0<=ATTRIBUTE_PROPERTY)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property194); 
                    NEWLINE27_tree = (Object)adaptor.create(NEWLINE27);
                    adaptor.addChild(root_0, NEWLINE27_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:21: attr_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property198);
                    attr_prop_name28=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name28.getTree());
                    ATTRIBUITION29=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property200); 
                    ATTRIBUITION29_tree = (Object)adaptor.create(ATTRIBUITION29);
                    adaptor.addChild(root_0, ATTRIBUITION29_tree);

                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:49: ( value | expression )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NUMBER||LA9_0==NAME) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==EXPRESSION) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:50: value
                            {
                            pushFollow(FOLLOW_value_in_property203);
                            value30=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value30.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property205);
                            expression31=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression31.getTree());

                            }
                            break;

                    }


                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name28!=null?input.toString(attr_prop_name28.start,attr_prop_name28.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value30!=null?input.toString(value30.start,value30.stop):null));
                    		
                    		Property p = new Property((attr_prop_name28!=null?input.toString(attr_prop_name28.start,attr_prop_name28.stop):null), propValue);
                    		p.setExpression((expression31!=null?input.toString(expression31.start,expression31.stop):null));
                    		props.put((attr_prop_name28!=null?input.toString(attr_prop_name28.start,attr_prop_name28.stop):null), p);
                    	

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "property"

    public static class attr_prop_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_prop_name"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:98:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParser.attr_prop_name_return retval = new TerraParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;

        Object set32_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:98:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set32=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set32));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attr_prop_name"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:1: value : ( NUMBER | NAME ) ;
    public final TerraParser.value_return value() throws RecognitionException {
        TerraParser.value_return retval = new TerraParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;

        Object set33_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:7: ( ( NUMBER | NAME ) )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set33=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set33));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:100:1: expression : EXPRESSION ;
    public final TerraParser.expression_return expression() throws RecognitionException {
        TerraParser.expression_return retval = new TerraParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION34=null;

        Object EXPRESSION34_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:101:2: ( EXPRESSION )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:101:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION34=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression239); 
            EXPRESSION34_tree = (Object)adaptor.create(EXPRESSION34);
            adaptor.addChild(root_0, EXPRESSION34_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:104:1: operation : ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET );
    public final TerraParser.operation_return operation() throws RecognitionException {
        TerraParser.operation_return retval = new TerraParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE35=null;
        Token OPERATION36=null;
        Token OP_TYPE37=null;
        Token NAME38=null;
        Token STRING_LITERAL39=null;
        Token LEFT_BRACKET40=null;
        Token RIGHT_BRACKET42=null;
        TerraParser.op_body_return op_body41 = null;


        Object NEWLINE35_tree=null;
        Object OPERATION36_tree=null;
        Object OP_TYPE37_tree=null;
        Object NAME38_tree=null;
        Object STRING_LITERAL39_tree=null;
        Object LEFT_BRACKET40_tree=null;
        Object RIGHT_BRACKET42_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:104:10: ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE) ) {
                alt11=1;
            }
            else if ( (LA11_0==OPERATION) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:104:13: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_operation248); 
                    NEWLINE35_tree = (Object)adaptor.create(NEWLINE35);
                    adaptor.addChild(root_0, NEWLINE35_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:104:23: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    OPERATION36=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation252); 
                    OPERATION36_tree = (Object)adaptor.create(OPERATION36);
                    adaptor.addChild(root_0, OPERATION36_tree);

                    OP_TYPE37=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation254); 
                    OP_TYPE37_tree = (Object)adaptor.create(OP_TYPE37);
                    adaptor.addChild(root_0, OP_TYPE37_tree);

                    NAME38=(Token)match(input,NAME,FOLLOW_NAME_in_operation256); 
                    NAME38_tree = (Object)adaptor.create(NAME38);
                    adaptor.addChild(root_0, NAME38_tree);

                    STRING_LITERAL39=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation258); 
                    STRING_LITERAL39_tree = (Object)adaptor.create(STRING_LITERAL39);
                    adaptor.addChild(root_0, STRING_LITERAL39_tree);

                    LEFT_BRACKET40=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation260); 
                    LEFT_BRACKET40_tree = (Object)adaptor.create(LEFT_BRACKET40);
                    adaptor.addChild(root_0, LEFT_BRACKET40_tree);

                    pushFollow(FOLLOW_op_body_in_operation262);
                    op_body41=op_body();

                    state._fsp--;

                    adaptor.addChild(root_0, op_body41.getTree());
                    RIGHT_BRACKET42=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation264); 
                    RIGHT_BRACKET42_tree = (Object)adaptor.create(RIGHT_BRACKET42);
                    adaptor.addChild(root_0, RIGHT_BRACKET42_tree);


                    		Operation op = new Operation((OP_TYPE37!=null?OP_TYPE37.getText():null), (NAME38!=null?NAME38.getText():null), (STRING_LITERAL39!=null?STRING_LITERAL39.getText():null));
                    		op.setDomainObject(domainObject);
                    		op.setProperties(op_props);
                    		ops.add(op);
                    		op_props = new HashMap<String, Property>();
                    	

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class op_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_body"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:113:1: op_body : ( op_prop )+ ;
    public final TerraParser.op_body_return op_body() throws RecognitionException {
        TerraParser.op_body_return retval = new TerraParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.op_prop_return op_prop43 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:113:9: ( ( op_prop )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:113:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:113:11: ( op_prop )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==PROPERTY||LA12_0==OPERATION_PROPERTY||LA12_0==NEWLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:113:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body276);
            	    op_prop43=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop43.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "op_body"

    public static class op_prop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_prop"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParser.op_prop_return op_prop() throws RecognitionException {
        TerraParser.op_prop_return retval = new TerraParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE44=null;
        Token ATTRIBUITION46=null;
        TerraParser.op_prop_name_return op_prop_name45 = null;

        TerraParser.value_return value47 = null;


        Object NEWLINE44_tree=null;
        Object ATTRIBUITION46_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==PROPERTY||LA13_0==OPERATION_PROPERTY) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop284); 
                    NEWLINE44_tree = (Object)adaptor.create(NEWLINE44);
                    adaptor.addChild(root_0, NEWLINE44_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop288);
                    op_prop_name45=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name45.getTree());
                    ATTRIBUITION46=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop290); 
                    ATTRIBUITION46_tree = (Object)adaptor.create(ATTRIBUITION46);
                    adaptor.addChild(root_0, ATTRIBUITION46_tree);

                    pushFollow(FOLLOW_value_in_op_prop292);
                    value47=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value47.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name45!=null?input.toString(op_prop_name45.start,op_prop_name45.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value47!=null?input.toString(value47.start,value47.stop):null));
                    		
                    		Property p = new Property((op_prop_name45!=null?input.toString(op_prop_name45.start,op_prop_name45.stop):null), propValue);
                    		op_props.put((op_prop_name45!=null?input.toString(op_prop_name45.start,op_prop_name45.stop):null), p);
                    	

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "op_prop"

    public static class op_prop_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_prop_name"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:128:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParser.op_prop_name_return retval = new TerraParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set48=null;

        Object set48_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:128:14: ( PROPERTY | OPERATION_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set48=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set48));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "op_prop_name"

    public static class validation_rulz_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_rulz"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:131:1: validation_rulz : ( NEWLINE | VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET );
    public final TerraParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParser.validation_rulz_return retval = new TerraParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE49=null;
        Token VALIDATION_RULE50=null;
        Token NAME51=null;
        Token LEFT_BRACKET52=null;
        Token RIGHT_BRACKET54=null;
        TerraParser.validation_body_return validation_body53 = null;


        Object NEWLINE49_tree=null;
        Object VALIDATION_RULE50_tree=null;
        Object NAME51_tree=null;
        Object LEFT_BRACKET52_tree=null;
        Object RIGHT_BRACKET54_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:131:16: ( NEWLINE | VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NEWLINE) ) {
                alt14=1;
            }
            else if ( (LA14_0==VALIDATION_RULE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:131:18: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE49=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_rulz316); 
                    NEWLINE49_tree = (Object)adaptor.create(NEWLINE49);
                    adaptor.addChild(root_0, NEWLINE49_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:131:28: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    VALIDATION_RULE50=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz320); 
                    VALIDATION_RULE50_tree = (Object)adaptor.create(VALIDATION_RULE50);
                    adaptor.addChild(root_0, VALIDATION_RULE50_tree);

                    NAME51=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz322); 
                    NAME51_tree = (Object)adaptor.create(NAME51);
                    adaptor.addChild(root_0, NAME51_tree);

                    LEFT_BRACKET52=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz324); 
                    LEFT_BRACKET52_tree = (Object)adaptor.create(LEFT_BRACKET52);
                    adaptor.addChild(root_0, LEFT_BRACKET52_tree);

                    pushFollow(FOLLOW_validation_body_in_validation_rulz326);
                    validation_body53=validation_body();

                    state._fsp--;

                    adaptor.addChild(root_0, validation_body53.getTree());
                    RIGHT_BRACKET54=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz328); 
                    RIGHT_BRACKET54_tree = (Object)adaptor.create(RIGHT_BRACKET54);
                    adaptor.addChild(root_0, RIGHT_BRACKET54_tree);


                    		Validation validation = new Validation((NAME51!=null?NAME51.getText():null));
                    		validation.setRules(validationRulzEntry);
                    		validationRulz.add(validation);
                    		validationRulzEntry = new ArrayList<ValidationRule>();


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validation_rulz"

    public static class validation_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_body"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:138:1: validation_body : ( validation_entry )+ ;
    public final TerraParser.validation_body_return validation_body() throws RecognitionException {
        TerraParser.validation_body_return retval = new TerraParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.validation_entry_return validation_entry55 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:138:17: ( ( validation_entry )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:138:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:138:19: ( validation_entry )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==STRING_LITERAL||LA15_0==NEWLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:138:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body337);
            	    validation_entry55=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry55.getTree());

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


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validation_body"

    public static class validation_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_entry"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:140:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParser.validation_entry_return retval = new TerraParser.validation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE56=null;
        Token STRING_LITERAL57=null;
        Token ATTRIBUITION58=null;
        Token EXPRESSION59=null;

        Object NEWLINE56_tree=null;
        Object STRING_LITERAL57_tree=null;
        Object ATTRIBUITION58_tree=null;
        Object EXPRESSION59_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:140:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NEWLINE) ) {
                alt16=1;
            }
            else if ( (LA16_0==STRING_LITERAL) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:140:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry345); 
                    NEWLINE56_tree = (Object)adaptor.create(NEWLINE56);
                    adaptor.addChild(root_0, NEWLINE56_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:140:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL57=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry349); 
                    STRING_LITERAL57_tree = (Object)adaptor.create(STRING_LITERAL57);
                    adaptor.addChild(root_0, STRING_LITERAL57_tree);

                    ATTRIBUITION58=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry351); 
                    ATTRIBUITION58_tree = (Object)adaptor.create(ATTRIBUITION58);
                    adaptor.addChild(root_0, ATTRIBUITION58_tree);

                    EXPRESSION59=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry353); 
                    EXPRESSION59_tree = (Object)adaptor.create(EXPRESSION59);
                    adaptor.addChild(root_0, EXPRESSION59_tree);


                    		ValidationRule valRule = new ValidationRule((STRING_LITERAL57!=null?STRING_LITERAL57.getText():null), (EXPRESSION59!=null?EXPRESSION59.getText():null));
                    		validationRulzEntry.add(valRule);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validation_entry"

    // Delegated rules


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object58 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object62 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object67 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object69 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object73 = new BitSet(new long[]{0x0000000200846100L});
    public static final BitSet FOLLOW_body_in_domain_object75 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration90 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration92 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration94 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration109 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration111 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration113 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_attr_in_body131 = new BitSet(new long[]{0x0000000200846002L});
    public static final BitSet FOLLOW_operation_in_body135 = new BitSet(new long[]{0x0000000200846002L});
    public static final BitSet FOLLOW_validation_rulz_in_body139 = new BitSet(new long[]{0x0000000200846002L});
    public static final BitSet FOLLOW_TYPE_in_attr153 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LETTER_in_attr158 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LETTER_in_attr160 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_NAME_in_attr165 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr167 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr169 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_attr_body_in_attr171 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body186 = new BitSet(new long[]{0x0000000200018002L});
    public static final BitSet FOLLOW_NEWLINE_in_property194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property198 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property200 = new BitSet(new long[]{0x0000000012400000L});
    public static final BitSet FOLLOW_value_in_property203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_operation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation252 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation254 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_operation256 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation260 = new BitSet(new long[]{0x0000000200028000L});
    public static final BitSet FOLLOW_op_body_in_operation262 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body276 = new BitSet(new long[]{0x0000000200028002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop288 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop290 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_value_in_op_prop292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_rulz316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz320 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz322 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz324 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz326 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body337 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry351 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry353 = new BitSet(new long[]{0x0000000000000002L});

}
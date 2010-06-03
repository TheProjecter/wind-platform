// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/paulofreitas/Desktop/lang/TerraParser.g 2010-06-03 14:24:59
 
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
    public String getGrammarFileName() { return "/home/paulofreitas/Desktop/lang/TerraParser.g"; }


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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:42:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:4: ( package_declaration )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object58);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:43:27: import_declaration
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

            // /home/paulofreitas/Desktop/lang/TerraParser.g:43:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=VALIDATION_RULE && LA2_0<=TYPE)||LA2_0==OPERATION||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:43:96: body
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:56:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:57:2: ( PACKAGE NAME ( NEWLINE )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:57:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration90); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration92); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:57:17: ( NEWLINE )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:57:17: NEWLINE
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:63:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:2: ( IMPORT NAME ( NEWLINE )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration109); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration111); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:16: ( NEWLINE )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:64:16: NEWLINE
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:70:1: body : ( attr | operation | validation_rulz )+ ;
    public final TerraParser.body_return body() throws RecognitionException {
        TerraParser.body_return retval = new TerraParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.attr_return attr15 = null;

        TerraParser.operation_return operation16 = null;

        TerraParser.validation_rulz_return validation_rulz17 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:70:6: ( ( attr | operation | validation_rulz )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:70:11: ( attr | operation | validation_rulz )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:70:11: ( attr | operation | validation_rulz )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case TYPE:
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:70:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body131);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:70:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body135);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:70:31: validation_rulz
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:72:1: attr : TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParser.attr_return attr() throws RecognitionException {
        TerraParser.attr_return retval = new TerraParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE18=null;
        Token NAME19=null;
        Token STRING_LITERAL20=null;
        Token LEFT_BRACKET21=null;
        Token RIGHT_BRACKET23=null;
        TerraParser.attr_body_return attr_body22 = null;


        Object TYPE18_tree=null;
        Object NAME19_tree=null;
        Object STRING_LITERAL20_tree=null;
        Object LEFT_BRACKET21_tree=null;
        Object RIGHT_BRACKET23_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:72:6: ( TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:72:10: TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            TYPE18=(Token)match(input,TYPE,FOLLOW_TYPE_in_attr151); 
            TYPE18_tree = (Object)adaptor.create(TYPE18);
            adaptor.addChild(root_0, TYPE18_tree);

            NAME19=(Token)match(input,NAME,FOLLOW_NAME_in_attr153); 
            NAME19_tree = (Object)adaptor.create(NAME19);
            adaptor.addChild(root_0, NAME19_tree);

            STRING_LITERAL20=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr155); 
            STRING_LITERAL20_tree = (Object)adaptor.create(STRING_LITERAL20);
            adaptor.addChild(root_0, STRING_LITERAL20_tree);

            LEFT_BRACKET21=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr157); 
            LEFT_BRACKET21_tree = (Object)adaptor.create(LEFT_BRACKET21);
            adaptor.addChild(root_0, LEFT_BRACKET21_tree);

            pushFollow(FOLLOW_attr_body_in_attr159);
            attr_body22=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body22.getTree());
            RIGHT_BRACKET23=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr161); 
            RIGHT_BRACKET23_tree = (Object)adaptor.create(RIGHT_BRACKET23);
            adaptor.addChild(root_0, RIGHT_BRACKET23_tree);


            		Attribute att = new Attribute((TYPE18!=null?TYPE18.getText():null), (NAME19!=null?NAME19.getText():null), (STRING_LITERAL20!=null?STRING_LITERAL20.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:82:1: attr_body : ( property )+ ;
    public final TerraParser.attr_body_return attr_body() throws RecognitionException {
        TerraParser.attr_body_return retval = new TerraParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.property_return property24 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:82:11: ( ( property )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:82:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:82:14: ( property )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PROPERTY && LA6_0<=ATTRIBUTE_PROPERTY)||LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:82:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body174);
            	    property24=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property24.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParser.property_return property() throws RecognitionException {
        TerraParser.property_return retval = new TerraParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE25=null;
        Token ATTRIBUITION27=null;
        TerraParser.attr_prop_name_return attr_prop_name26 = null;

        TerraParser.value_return value28 = null;

        TerraParser.expression_return expression29 = null;


        Object NEWLINE25_tree=null;
        Object ATTRIBUITION27_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:84:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NEWLINE) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=PROPERTY && LA8_0<=ATTRIBUTE_PROPERTY)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property182); 
                    NEWLINE25_tree = (Object)adaptor.create(NEWLINE25);
                    adaptor.addChild(root_0, NEWLINE25_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:21: attr_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property186);
                    attr_prop_name26=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name26.getTree());
                    ATTRIBUITION27=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property188); 
                    ATTRIBUITION27_tree = (Object)adaptor.create(ATTRIBUITION27);
                    adaptor.addChild(root_0, ATTRIBUITION27_tree);

                    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:49: ( value | expression )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==NUMBER||LA7_0==NAME) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==EXPRESSION) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/paulofreitas/Desktop/lang/TerraParser.g:84:50: value
                            {
                            pushFollow(FOLLOW_value_in_property191);
                            value28=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value28.getTree());

                            }
                            break;
                        case 2 :
                            // /home/paulofreitas/Desktop/lang/TerraParser.g:84:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property193);
                            expression29=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression29.getTree());

                            }
                            break;

                    }


                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name26!=null?input.toString(attr_prop_name26.start,attr_prop_name26.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value28!=null?input.toString(value28.start,value28.stop):null));
                    		
                    		Property p = new Property((attr_prop_name26!=null?input.toString(attr_prop_name26.start,attr_prop_name26.stop):null), propValue);
                    		p.setExpression((expression29!=null?input.toString(expression29.start,expression29.stop):null));
                    		props.put((attr_prop_name26!=null?input.toString(attr_prop_name26.start,attr_prop_name26.stop):null), p);
                    	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:97:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParser.attr_prop_name_return retval = new TerraParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:97:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set30=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set30));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:98:1: value : ( NUMBER | NAME ) ;
    public final TerraParser.value_return value() throws RecognitionException {
        TerraParser.value_return retval = new TerraParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:98:7: ( ( NUMBER | NAME ) )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:98:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set31=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set31));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:99:1: expression : EXPRESSION ;
    public final TerraParser.expression_return expression() throws RecognitionException {
        TerraParser.expression_return retval = new TerraParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION32=null;

        Object EXPRESSION32_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:100:2: ( EXPRESSION )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:100:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION32=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression227); 
            EXPRESSION32_tree = (Object)adaptor.create(EXPRESSION32);
            adaptor.addChild(root_0, EXPRESSION32_tree);


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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:103:1: operation : ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET );
    public final TerraParser.operation_return operation() throws RecognitionException {
        TerraParser.operation_return retval = new TerraParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE33=null;
        Token OPERATION34=null;
        Token OP_TYPE35=null;
        Token NAME36=null;
        Token STRING_LITERAL37=null;
        Token LEFT_BRACKET38=null;
        Token RIGHT_BRACKET40=null;
        TerraParser.op_body_return op_body39 = null;


        Object NEWLINE33_tree=null;
        Object OPERATION34_tree=null;
        Object OP_TYPE35_tree=null;
        Object NAME36_tree=null;
        Object STRING_LITERAL37_tree=null;
        Object LEFT_BRACKET38_tree=null;
        Object RIGHT_BRACKET40_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:103:10: ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE) ) {
                alt9=1;
            }
            else if ( (LA9_0==OPERATION) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:103:13: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE33=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_operation236); 
                    NEWLINE33_tree = (Object)adaptor.create(NEWLINE33);
                    adaptor.addChild(root_0, NEWLINE33_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:103:23: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    OPERATION34=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation240); 
                    OPERATION34_tree = (Object)adaptor.create(OPERATION34);
                    adaptor.addChild(root_0, OPERATION34_tree);

                    OP_TYPE35=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation242); 
                    OP_TYPE35_tree = (Object)adaptor.create(OP_TYPE35);
                    adaptor.addChild(root_0, OP_TYPE35_tree);

                    NAME36=(Token)match(input,NAME,FOLLOW_NAME_in_operation244); 
                    NAME36_tree = (Object)adaptor.create(NAME36);
                    adaptor.addChild(root_0, NAME36_tree);

                    STRING_LITERAL37=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation246); 
                    STRING_LITERAL37_tree = (Object)adaptor.create(STRING_LITERAL37);
                    adaptor.addChild(root_0, STRING_LITERAL37_tree);

                    LEFT_BRACKET38=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation248); 
                    LEFT_BRACKET38_tree = (Object)adaptor.create(LEFT_BRACKET38);
                    adaptor.addChild(root_0, LEFT_BRACKET38_tree);

                    pushFollow(FOLLOW_op_body_in_operation250);
                    op_body39=op_body();

                    state._fsp--;

                    adaptor.addChild(root_0, op_body39.getTree());
                    RIGHT_BRACKET40=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation252); 
                    RIGHT_BRACKET40_tree = (Object)adaptor.create(RIGHT_BRACKET40);
                    adaptor.addChild(root_0, RIGHT_BRACKET40_tree);


                    		Operation op = new Operation((OP_TYPE35!=null?OP_TYPE35.getText():null), (NAME36!=null?NAME36.getText():null), (STRING_LITERAL37!=null?STRING_LITERAL37.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:112:1: op_body : ( op_prop )+ ;
    public final TerraParser.op_body_return op_body() throws RecognitionException {
        TerraParser.op_body_return retval = new TerraParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.op_prop_return op_prop41 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:112:9: ( ( op_prop )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:112:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:112:11: ( op_prop )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==PROPERTY||LA10_0==OPERATION_PROPERTY||LA10_0==NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:112:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body264);
            	    op_prop41=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop41.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:114:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParser.op_prop_return op_prop() throws RecognitionException {
        TerraParser.op_prop_return retval = new TerraParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE42=null;
        Token ATTRIBUITION44=null;
        TerraParser.op_prop_name_return op_prop_name43 = null;

        TerraParser.value_return value45 = null;


        Object NEWLINE42_tree=null;
        Object ATTRIBUITION44_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:114:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE) ) {
                alt11=1;
            }
            else if ( (LA11_0==PROPERTY||LA11_0==OPERATION_PROPERTY) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:114:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop272); 
                    NEWLINE42_tree = (Object)adaptor.create(NEWLINE42);
                    adaptor.addChild(root_0, NEWLINE42_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:114:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop276);
                    op_prop_name43=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name43.getTree());
                    ATTRIBUITION44=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop278); 
                    ATTRIBUITION44_tree = (Object)adaptor.create(ATTRIBUITION44);
                    adaptor.addChild(root_0, ATTRIBUITION44_tree);

                    pushFollow(FOLLOW_value_in_op_prop280);
                    value45=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value45.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name43!=null?input.toString(op_prop_name43.start,op_prop_name43.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value45!=null?input.toString(value45.start,value45.stop):null));
                    		
                    		Property p = new Property((op_prop_name43!=null?input.toString(op_prop_name43.start,op_prop_name43.stop):null), propValue);
                    		op_props.put((op_prop_name43!=null?input.toString(op_prop_name43.start,op_prop_name43.stop):null), p);
                    	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:127:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParser.op_prop_name_return retval = new TerraParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:127:14: ( PROPERTY | OPERATION_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set46));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:130:1: validation_rulz : ( NEWLINE | VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET );
    public final TerraParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParser.validation_rulz_return retval = new TerraParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE47=null;
        Token VALIDATION_RULE48=null;
        Token NAME49=null;
        Token LEFT_BRACKET50=null;
        Token RIGHT_BRACKET52=null;
        TerraParser.validation_body_return validation_body51 = null;


        Object NEWLINE47_tree=null;
        Object VALIDATION_RULE48_tree=null;
        Object NAME49_tree=null;
        Object LEFT_BRACKET50_tree=null;
        Object RIGHT_BRACKET52_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:130:16: ( NEWLINE | VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==VALIDATION_RULE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:130:18: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_rulz304); 
                    NEWLINE47_tree = (Object)adaptor.create(NEWLINE47);
                    adaptor.addChild(root_0, NEWLINE47_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:130:28: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    VALIDATION_RULE48=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz308); 
                    VALIDATION_RULE48_tree = (Object)adaptor.create(VALIDATION_RULE48);
                    adaptor.addChild(root_0, VALIDATION_RULE48_tree);

                    NAME49=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz310); 
                    NAME49_tree = (Object)adaptor.create(NAME49);
                    adaptor.addChild(root_0, NAME49_tree);

                    LEFT_BRACKET50=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz312); 
                    LEFT_BRACKET50_tree = (Object)adaptor.create(LEFT_BRACKET50);
                    adaptor.addChild(root_0, LEFT_BRACKET50_tree);

                    pushFollow(FOLLOW_validation_body_in_validation_rulz314);
                    validation_body51=validation_body();

                    state._fsp--;

                    adaptor.addChild(root_0, validation_body51.getTree());
                    RIGHT_BRACKET52=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz316); 
                    RIGHT_BRACKET52_tree = (Object)adaptor.create(RIGHT_BRACKET52);
                    adaptor.addChild(root_0, RIGHT_BRACKET52_tree);


                    		Validation validation = new Validation((NAME49!=null?NAME49.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:137:1: validation_body : ( validation_entry )+ ;
    public final TerraParser.validation_body_return validation_body() throws RecognitionException {
        TerraParser.validation_body_return retval = new TerraParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.validation_entry_return validation_entry53 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:137:17: ( ( validation_entry )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:137:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:137:19: ( validation_entry )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==STRING_LITERAL||LA13_0==NEWLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:137:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body325);
            	    validation_entry53=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry53.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:139:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParser.validation_entry_return retval = new TerraParser.validation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE54=null;
        Token STRING_LITERAL55=null;
        Token ATTRIBUITION56=null;
        Token EXPRESSION57=null;

        Object NEWLINE54_tree=null;
        Object STRING_LITERAL55_tree=null;
        Object ATTRIBUITION56_tree=null;
        Object EXPRESSION57_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:139:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NEWLINE) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING_LITERAL) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:139:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry333); 
                    NEWLINE54_tree = (Object)adaptor.create(NEWLINE54);
                    adaptor.addChild(root_0, NEWLINE54_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:139:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL55=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry337); 
                    STRING_LITERAL55_tree = (Object)adaptor.create(STRING_LITERAL55);
                    adaptor.addChild(root_0, STRING_LITERAL55_tree);

                    ATTRIBUITION56=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry339); 
                    ATTRIBUITION56_tree = (Object)adaptor.create(ATTRIBUITION56);
                    adaptor.addChild(root_0, ATTRIBUITION56_tree);

                    EXPRESSION57=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry341); 
                    EXPRESSION57_tree = (Object)adaptor.create(EXPRESSION57);
                    adaptor.addChild(root_0, EXPRESSION57_tree);


                    		ValidationRule valRule = new ValidationRule((STRING_LITERAL55!=null?STRING_LITERAL55.getText():null), (EXPRESSION57!=null?EXPRESSION57.getText():null));
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
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object73 = new BitSet(new long[]{0x0000000200046100L});
    public static final BitSet FOLLOW_body_in_domain_object75 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration90 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration92 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration94 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration109 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration111 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration113 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_attr_in_body131 = new BitSet(new long[]{0x0000000200046002L});
    public static final BitSet FOLLOW_operation_in_body135 = new BitSet(new long[]{0x0000000200046002L});
    public static final BitSet FOLLOW_validation_rulz_in_body139 = new BitSet(new long[]{0x0000000200046002L});
    public static final BitSet FOLLOW_TYPE_in_attr151 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_attr153 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr155 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr157 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_attr_body_in_attr159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body174 = new BitSet(new long[]{0x0000000200018002L});
    public static final BitSet FOLLOW_NEWLINE_in_property182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property186 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property188 = new BitSet(new long[]{0x0000000012400000L});
    public static final BitSet FOLLOW_value_in_property191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_operation236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation240 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation242 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_operation244 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation246 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation248 = new BitSet(new long[]{0x0000000200028000L});
    public static final BitSet FOLLOW_op_body_in_operation250 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body264 = new BitSet(new long[]{0x0000000200028002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop276 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop278 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_value_in_op_prop280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_rulz304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz308 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz310 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz312 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz314 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body325 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry337 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry339 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry341 = new BitSet(new long[]{0x0000000000000002L});

}
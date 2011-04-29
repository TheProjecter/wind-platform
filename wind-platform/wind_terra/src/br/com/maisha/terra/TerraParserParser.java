// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g 2011-04-29 15:58:15
 
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
import br.com.maisha.terra.lang.ValidValue;
import br.com.maisha.terra.lang.ValidationRule;
import br.com.maisha.terra.rcp.Activator;
import br.com.maisha.wind.common.converter.IConverterService;
import br.com.maisha.wind.common.factory.ServiceProvider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TerraParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "VALIDATION_RULE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OBJECT_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "TYPE2", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE", "','"
    };
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


        public TerraParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TerraParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TerraParserParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g"; }


    public DomainObject domainObject = null;
    private String pckg = "";
    private List<Attribute> atts = new ArrayList<Attribute>();
    private List<Operation> ops = new ArrayList<Operation>();
    private Map<String, Property> props = new HashMap<String, Property>();
    private Map<String, Property> op_props = new HashMap<String, Property>();
    private Map<String, Property> obj_props = new HashMap<String, Property>();
    private List<Import> imports = new ArrayList<Import>();
    private List<Validation> validationRulz = new ArrayList<Validation>();
    private List<ValidationRule> validationRulzEntry = new ArrayList<ValidationRule>();
    private List<ValidValue> validValues = new ArrayList<ValidValue>();


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:90:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
    public final TerraParserParser.domain_object_return domain_object() throws RecognitionException {
        TerraParserParser.domain_object_return retval = new TerraParserParser.domain_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOMAIN_OBJECT3=null;
        Token NAME4=null;
        Token STRING_LITERAL5=null;
        Token LEFT_BRACKET6=null;
        Token RIGHT_BRACKET8=null;
        TerraParserParser.package_declaration_return package_declaration1 = null;

        TerraParserParser.import_declaration_return import_declaration2 = null;

        TerraParserParser.body_return body7 = null;


        Object DOMAIN_OBJECT3_tree=null;
        Object NAME4_tree=null;
        Object STRING_LITERAL5_tree=null;
        Object LEFT_BRACKET6_tree=null;
        Object RIGHT_BRACKET8_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:4: ( package_declaration )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object503);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:27: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object507);
            	    import_declaration2=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT3=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object512); 
            DOMAIN_OBJECT3_tree = (Object)adaptor.create(DOMAIN_OBJECT3);
            adaptor.addChild(root_0, DOMAIN_OBJECT3_tree);

            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object514); 
            NAME4_tree = (Object)adaptor.create(NAME4);
            adaptor.addChild(root_0, NAME4_tree);

            STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object516); 
            STRING_LITERAL5_tree = (Object)adaptor.create(STRING_LITERAL5);
            adaptor.addChild(root_0, STRING_LITERAL5_tree);

            LEFT_BRACKET6=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object518); 
            LEFT_BRACKET6_tree = (Object)adaptor.create(LEFT_BRACKET6);
            adaptor.addChild(root_0, LEFT_BRACKET6_tree);

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VALIDATION_RULE||(LA2_0>=OBJECT_PROPERTY && LA2_0<=OPERATION)||LA2_0==NAME||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:91:96: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object520);
                    body7=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body7.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET8=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object523); 
            RIGHT_BRACKET8_tree = (Object)adaptor.create(RIGHT_BRACKET8);
            adaptor.addChild(root_0, RIGHT_BRACKET8_tree);


            		domainObject = new DomainObject((NAME4!=null?NAME4.getText():null), (STRING_LITERAL5!=null?STRING_LITERAL5.getText():null));
            		domainObject.setPckg(pckg);
            		domainObject.setAtts(atts);
            		domainObject.setOperations(ops);
            		domainObject.setImports(imports);
            		domainObject.setValidations(validationRulz);
            		domainObject.setProperties(obj_props);
            		atts = new ArrayList<Attribute>();
            		ops = new ArrayList<Operation>();
            		obj_props = new HashMap<String, Property>();
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:106:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
    public final TerraParserParser.package_declaration_return package_declaration() throws RecognitionException {
        TerraParserParser.package_declaration_return retval = new TerraParserParser.package_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PACKAGE9=null;
        Token NAME10=null;
        Token NEWLINE11=null;

        Object PACKAGE9_tree=null;
        Object NAME10_tree=null;
        Object NEWLINE11_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:107:2: ( PACKAGE NAME ( NEWLINE )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:107:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration535); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration537); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:107:17: ( NEWLINE )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:107:17: NEWLINE
            	    {
            	    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_package_declaration539); 
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:113:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
    public final TerraParserParser.import_declaration_return import_declaration() throws RecognitionException {
        TerraParserParser.import_declaration_return retval = new TerraParserParser.import_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT12=null;
        Token NAME13=null;
        Token NEWLINE14=null;

        Object IMPORT12_tree=null;
        Object NAME13_tree=null;
        Object NEWLINE14_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:114:2: ( IMPORT NAME ( NEWLINE )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:114:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration554); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration556); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:114:16: ( NEWLINE )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:114:16: NEWLINE
            	    {
            	    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration558); 
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:1: body : ( attr | operation | validation_rulz | obj_property | NEWLINE )+ ;
    public final TerraParserParser.body_return body() throws RecognitionException {
        TerraParserParser.body_return retval = new TerraParserParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE19=null;
        TerraParserParser.attr_return attr15 = null;

        TerraParserParser.operation_return operation16 = null;

        TerraParserParser.validation_rulz_return validation_rulz17 = null;

        TerraParserParser.obj_property_return obj_property18 = null;


        Object NEWLINE19_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:6: ( ( attr | operation | validation_rulz | obj_property | NEWLINE )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:11: ( attr | operation | validation_rulz | obj_property | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:11: ( attr | operation | validation_rulz | obj_property | NEWLINE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=6;
                switch ( input.LA(1) ) {
                case NAME:
                    {
                    alt5=1;
                    }
                    break;
                case OPERATION:
                    {
                    alt5=2;
                    }
                    break;
                case VALIDATION_RULE:
                    {
                    alt5=3;
                    }
                    break;
                case OBJECT_PROPERTY:
                    {
                    alt5=4;
                    }
                    break;
                case NEWLINE:
                    {
                    alt5=5;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body576);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body580);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:31: validation_rulz
            	    {
            	    pushFollow(FOLLOW_validation_rulz_in_body584);
            	    validation_rulz17=validation_rulz();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_rulz17.getTree());

            	    }
            	    break;
            	case 4 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:49: obj_property
            	    {
            	    pushFollow(FOLLOW_obj_property_in_body588);
            	    obj_property18=obj_property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, obj_property18.getTree());

            	    }
            	    break;
            	case 5 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:120:64: NEWLINE
            	    {
            	    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body592); 
            	    NEWLINE19_tree = (Object)adaptor.create(NEWLINE19);
            	    adaptor.addChild(root_0, NEWLINE19_tree);


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

    public static class obj_property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "obj_property"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:1: obj_property : OBJECT_PROPERTY ATTRIBUITION ( value | expression ) ;
    public final TerraParserParser.obj_property_return obj_property() throws RecognitionException {
        TerraParserParser.obj_property_return retval = new TerraParserParser.obj_property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OBJECT_PROPERTY20=null;
        Token ATTRIBUITION21=null;
        TerraParserParser.value_return value22 = null;

        TerraParserParser.expression_return expression23 = null;


        Object OBJECT_PROPERTY20_tree=null;
        Object ATTRIBUITION21_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:13: ( OBJECT_PROPERTY ATTRIBUITION ( value | expression ) )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:15: OBJECT_PROPERTY ATTRIBUITION ( value | expression )
            {
            root_0 = (Object)adaptor.nil();

            OBJECT_PROPERTY20=(Token)match(input,OBJECT_PROPERTY,FOLLOW_OBJECT_PROPERTY_in_obj_property601); 
            OBJECT_PROPERTY20_tree = (Object)adaptor.create(OBJECT_PROPERTY20);
            adaptor.addChild(root_0, OBJECT_PROPERTY20_tree);

            ATTRIBUITION21=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_obj_property603); 
            ATTRIBUITION21_tree = (Object)adaptor.create(ATTRIBUITION21);
            adaptor.addChild(root_0, ATTRIBUITION21_tree);

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:44: ( value | expression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NUMBER||LA6_0==NAME) ) {
                alt6=1;
            }
            else if ( (LA6_0==EXPRESSION) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:45: value
                    {
                    pushFollow(FOLLOW_value_in_obj_property606);
                    value22=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value22.getTree());

                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:122:51: expression
                    {
                    pushFollow(FOLLOW_expression_in_obj_property608);
                    expression23=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression23.getTree());

                    }
                    break;

            }


            		IConverterService convService = ServiceProvider.getInstance()
            				.getService(IConverterService.class,
            						Activator.getDefault().getBundleContext());
            						
            		Class<?> type = PropertyInfo.getPropertyInfo((OBJECT_PROPERTY20!=null?OBJECT_PROPERTY20.getText():null)).getType();
            		Object propValue = convService.convert(type, (value22!=null?input.toString(value22.start,value22.stop):null));
            		
            		Property p = new Property((OBJECT_PROPERTY20!=null?OBJECT_PROPERTY20.getText():null), propValue);
            		p.setExpression((expression23!=null?input.toString(expression23.start,expression23.stop):null));
            		obj_props.put((OBJECT_PROPERTY20!=null?OBJECT_PROPERTY20.getText():null), p);		


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
    // $ANTLR end "obj_property"

    public static class attr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:136:1: attr : type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParserParser.attr_return attr() throws RecognitionException {
        TerraParserParser.attr_return retval = new TerraParserParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token type=null;
        Token ref=null;
        Token STRING_LITERAL24=null;
        Token LEFT_BRACKET25=null;
        Token RIGHT_BRACKET27=null;
        TerraParserParser.attr_body_return attr_body26 = null;


        Object type_tree=null;
        Object ref_tree=null;
        Object STRING_LITERAL24_tree=null;
        Object LEFT_BRACKET25_tree=null;
        Object RIGHT_BRACKET27_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:136:6: (type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:136:10: type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            type=(Token)match(input,NAME,FOLLOW_NAME_in_attr624); 
            type_tree = (Object)adaptor.create(type);
            adaptor.addChild(root_0, type_tree);

            ref=(Token)match(input,NAME,FOLLOW_NAME_in_attr628); 
            ref_tree = (Object)adaptor.create(ref);
            adaptor.addChild(root_0, ref_tree);

            STRING_LITERAL24=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr630); 
            STRING_LITERAL24_tree = (Object)adaptor.create(STRING_LITERAL24);
            adaptor.addChild(root_0, STRING_LITERAL24_tree);

            LEFT_BRACKET25=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr632); 
            LEFT_BRACKET25_tree = (Object)adaptor.create(LEFT_BRACKET25);
            adaptor.addChild(root_0, LEFT_BRACKET25_tree);

            pushFollow(FOLLOW_attr_body_in_attr634);
            attr_body26=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body26.getTree());
            RIGHT_BRACKET27=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr636); 
            RIGHT_BRACKET27_tree = (Object)adaptor.create(RIGHT_BRACKET27);
            adaptor.addChild(root_0, RIGHT_BRACKET27_tree);


            		Attribute att = new Attribute((type!=null?type.getText():null), (ref!=null?ref.getText():null), (STRING_LITERAL24!=null?STRING_LITERAL24.getText():null));
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:148:1: attr_body : ( property )+ ;
    public final TerraParserParser.attr_body_return attr_body() throws RecognitionException {
        TerraParserParser.attr_body_return retval = new TerraParserParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.property_return property28 = null;



        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:148:11: ( ( property )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:148:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:148:14: ( property )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=PROPERTY && LA7_0<=ATTRIBUTE_PROPERTY)||LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:148:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body651);
            	    property28=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property28.getTree());

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression | array ) );
    public final TerraParserParser.property_return property() throws RecognitionException {
        TerraParserParser.property_return retval = new TerraParserParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE29=null;
        Token ATTRIBUITION31=null;
        TerraParserParser.attr_prop_name_return attr_prop_name30 = null;

        TerraParserParser.value_return value32 = null;

        TerraParserParser.expression_return expression33 = null;

        TerraParserParser.array_return array34 = null;


        Object NEWLINE29_tree=null;
        Object ATTRIBUITION31_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression | array ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=PROPERTY && LA9_0<=ATTRIBUTE_PROPERTY)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property659); 
                    NEWLINE29_tree = (Object)adaptor.create(NEWLINE29);
                    adaptor.addChild(root_0, NEWLINE29_tree);


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:21: attr_prop_name ATTRIBUITION ( value | expression | array )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property663);
                    attr_prop_name30=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name30.getTree());
                    ATTRIBUITION31=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property665); 
                    ATTRIBUITION31_tree = (Object)adaptor.create(ATTRIBUITION31);
                    adaptor.addChild(root_0, ATTRIBUITION31_tree);

                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:49: ( value | expression | array )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case NAME:
                        {
                        alt8=1;
                        }
                        break;
                    case EXPRESSION:
                        {
                        alt8=2;
                        }
                        break;
                    case LEFT_BRACE:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:50: value
                            {
                            pushFollow(FOLLOW_value_in_property668);
                            value32=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value32.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property670);
                            expression33=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression33.getTree());

                            }
                            break;
                        case 3 :
                            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:150:67: array
                            {
                            pushFollow(FOLLOW_array_in_property672);
                            array34=array();

                            state._fsp--;

                            adaptor.addChild(root_0, array34.getTree());

                            }
                            break;

                    }


                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name30!=null?input.toString(attr_prop_name30.start,attr_prop_name30.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value32!=null?input.toString(value32.start,value32.stop):null));
                    		
                    		Property p = new Property((attr_prop_name30!=null?input.toString(attr_prop_name30.start,attr_prop_name30.stop):null), propValue);
                    		p.setExpression((expression33!=null?input.toString(expression33.start,expression33.stop):null));
                    		p.setValidValues(validValues);
                    		props.put((attr_prop_name30!=null?input.toString(attr_prop_name30.start,attr_prop_name30.stop):null), p);
                    		validValues = new ArrayList<ValidValue>();
                    	

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:166:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParserParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParserParser.attr_prop_name_return retval = new TerraParserParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:166:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set35));
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:168:1: value : ( NUMBER | NAME ) ;
    public final TerraParserParser.value_return value() throws RecognitionException {
        TerraParserParser.value_return retval = new TerraParserParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set36=null;

        Object set36_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:168:7: ( ( NUMBER | NAME ) )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:168:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set36=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set36));
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:170:1: expression : EXPRESSION ;
    public final TerraParserParser.expression_return expression() throws RecognitionException {
        TerraParserParser.expression_return retval = new TerraParserParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION37=null;

        Object EXPRESSION37_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:171:2: ( EXPRESSION )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:171:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION37=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression710); 
            EXPRESSION37_tree = (Object)adaptor.create(EXPRESSION37);
            adaptor.addChild(root_0, EXPRESSION37_tree);


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

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:173:1: array : LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE ;
    public final TerraParserParser.array_return array() throws RecognitionException {
        TerraParserParser.array_return retval = new TerraParserParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_BRACE38=null;
        Token char_literal40=null;
        Token RIGHT_BRACE42=null;
        TerraParserParser.validValue_return validValue39 = null;

        TerraParserParser.validValue_return validValue41 = null;


        Object LEFT_BRACE38_tree=null;
        Object char_literal40_tree=null;
        Object RIGHT_BRACE42_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:173:7: ( LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:173:9: LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE
            {
            root_0 = (Object)adaptor.nil();

            LEFT_BRACE38=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_array719); 
            LEFT_BRACE38_tree = (Object)adaptor.create(LEFT_BRACE38);
            adaptor.addChild(root_0, LEFT_BRACE38_tree);

            pushFollow(FOLLOW_validValue_in_array721);
            validValue39=validValue();

            state._fsp--;

            adaptor.addChild(root_0, validValue39.getTree());
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:173:31: ( ',' validValue )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:173:32: ',' validValue
            	    {
            	    char_literal40=(Token)match(input,38,FOLLOW_38_in_array724); 
            	    char_literal40_tree = (Object)adaptor.create(char_literal40);
            	    adaptor.addChild(root_0, char_literal40_tree);

            	    pushFollow(FOLLOW_validValue_in_array726);
            	    validValue41=validValue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validValue41.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            RIGHT_BRACE42=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_array730); 
            RIGHT_BRACE42_tree = (Object)adaptor.create(RIGHT_BRACE42);
            adaptor.addChild(root_0, RIGHT_BRACE42_tree);


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
    // $ANTLR end "array"

    public static class validValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validValue"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:175:1: validValue : key= STRING_LITERAL ':' vValue= STRING_LITERAL ;
    public final TerraParserParser.validValue_return validValue() throws RecognitionException {
        TerraParserParser.validValue_return retval = new TerraParserParser.validValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token key=null;
        Token vValue=null;
        Token char_literal43=null;

        Object key_tree=null;
        Object vValue_tree=null;
        Object char_literal43_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:175:11: (key= STRING_LITERAL ':' vValue= STRING_LITERAL )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:175:13: key= STRING_LITERAL ':' vValue= STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            key=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validValue740); 
            key_tree = (Object)adaptor.create(key);
            adaptor.addChild(root_0, key_tree);

            char_literal43=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validValue742); 
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);

            vValue=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validValue746); 
            vValue_tree = (Object)adaptor.create(vValue);
            adaptor.addChild(root_0, vValue_tree);


                 ValidValue validValue = new ValidValue();
                 validValue.setKey((key!=null?key.getText():null));
                 validValue.setValue((vValue!=null?vValue.getText():null));
                 validValues.add(validValue);


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
    // $ANTLR end "validValue"

    public static class operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:182:1: operation : OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET ;
    public final TerraParserParser.operation_return operation() throws RecognitionException {
        TerraParserParser.operation_return retval = new TerraParserParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATION44=null;
        Token OP_TYPE45=null;
        Token NAME46=null;
        Token STRING_LITERAL47=null;
        Token LEFT_BRACKET48=null;
        Token RIGHT_BRACKET50=null;
        TerraParserParser.op_body_return op_body49 = null;


        Object OPERATION44_tree=null;
        Object OP_TYPE45_tree=null;
        Object NAME46_tree=null;
        Object STRING_LITERAL47_tree=null;
        Object LEFT_BRACKET48_tree=null;
        Object RIGHT_BRACKET50_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:182:10: ( OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:182:13: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPERATION44=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation755); 
            OPERATION44_tree = (Object)adaptor.create(OPERATION44);
            adaptor.addChild(root_0, OPERATION44_tree);

            OP_TYPE45=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation757); 
            OP_TYPE45_tree = (Object)adaptor.create(OP_TYPE45);
            adaptor.addChild(root_0, OP_TYPE45_tree);

            NAME46=(Token)match(input,NAME,FOLLOW_NAME_in_operation759); 
            NAME46_tree = (Object)adaptor.create(NAME46);
            adaptor.addChild(root_0, NAME46_tree);

            STRING_LITERAL47=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation761); 
            STRING_LITERAL47_tree = (Object)adaptor.create(STRING_LITERAL47);
            adaptor.addChild(root_0, STRING_LITERAL47_tree);

            LEFT_BRACKET48=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation763); 
            LEFT_BRACKET48_tree = (Object)adaptor.create(LEFT_BRACKET48);
            adaptor.addChild(root_0, LEFT_BRACKET48_tree);

            pushFollow(FOLLOW_op_body_in_operation765);
            op_body49=op_body();

            state._fsp--;

            adaptor.addChild(root_0, op_body49.getTree());
            RIGHT_BRACKET50=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation767); 
            RIGHT_BRACKET50_tree = (Object)adaptor.create(RIGHT_BRACKET50);
            adaptor.addChild(root_0, RIGHT_BRACKET50_tree);


            		Operation op = new Operation((OP_TYPE45!=null?OP_TYPE45.getText():null), (NAME46!=null?NAME46.getText():null), (STRING_LITERAL47!=null?STRING_LITERAL47.getText():null));
            		op.setDomainObject(domainObject);
            		op.setProperties(op_props);
            		ops.add(op);
            		op_props = new HashMap<String, Property>();
            	

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:191:1: op_body : ( op_prop )+ ;
    public final TerraParserParser.op_body_return op_body() throws RecognitionException {
        TerraParserParser.op_body_return retval = new TerraParserParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.op_prop_return op_prop51 = null;



        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:191:9: ( ( op_prop )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:191:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:191:11: ( op_prop )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PROPERTY||LA11_0==OPERATION_PROPERTY||LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:191:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body779);
            	    op_prop51=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop51.getTree());

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:193:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParserParser.op_prop_return op_prop() throws RecognitionException {
        TerraParserParser.op_prop_return retval = new TerraParserParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE52=null;
        Token ATTRIBUITION54=null;
        TerraParserParser.op_prop_name_return op_prop_name53 = null;

        TerraParserParser.value_return value55 = null;


        Object NEWLINE52_tree=null;
        Object ATTRIBUITION54_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:193:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==PROPERTY||LA12_0==OPERATION_PROPERTY) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:193:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE52=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop787); 
                    NEWLINE52_tree = (Object)adaptor.create(NEWLINE52);
                    adaptor.addChild(root_0, NEWLINE52_tree);


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:193:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop791);
                    op_prop_name53=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name53.getTree());
                    ATTRIBUITION54=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop793); 
                    ATTRIBUITION54_tree = (Object)adaptor.create(ATTRIBUITION54);
                    adaptor.addChild(root_0, ATTRIBUITION54_tree);

                    pushFollow(FOLLOW_value_in_op_prop795);
                    value55=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value55.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name53!=null?input.toString(op_prop_name53.start,op_prop_name53.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value55!=null?input.toString(value55.start,value55.stop):null));
                    		
                    		Property p = new Property((op_prop_name53!=null?input.toString(op_prop_name53.start,op_prop_name53.stop):null), propValue);
                    		op_props.put((op_prop_name53!=null?input.toString(op_prop_name53.start,op_prop_name53.stop):null), p);
                    	

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:206:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParserParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParserParser.op_prop_name_return retval = new TerraParserParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;

        Object set56_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:206:14: ( PROPERTY | OPERATION_PROPERTY )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set56=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set56));
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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:209:1: validation_rulz : VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET ;
    public final TerraParserParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParserParser.validation_rulz_return retval = new TerraParserParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VALIDATION_RULE57=null;
        Token NAME58=null;
        Token LEFT_BRACKET59=null;
        Token RIGHT_BRACKET61=null;
        TerraParserParser.validation_body_return validation_body60 = null;


        Object VALIDATION_RULE57_tree=null;
        Object NAME58_tree=null;
        Object LEFT_BRACKET59_tree=null;
        Object RIGHT_BRACKET61_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:209:16: ( VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:209:19: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            VALIDATION_RULE57=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz820); 
            VALIDATION_RULE57_tree = (Object)adaptor.create(VALIDATION_RULE57);
            adaptor.addChild(root_0, VALIDATION_RULE57_tree);

            NAME58=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz822); 
            NAME58_tree = (Object)adaptor.create(NAME58);
            adaptor.addChild(root_0, NAME58_tree);

            LEFT_BRACKET59=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz824); 
            LEFT_BRACKET59_tree = (Object)adaptor.create(LEFT_BRACKET59);
            adaptor.addChild(root_0, LEFT_BRACKET59_tree);

            pushFollow(FOLLOW_validation_body_in_validation_rulz826);
            validation_body60=validation_body();

            state._fsp--;

            adaptor.addChild(root_0, validation_body60.getTree());
            RIGHT_BRACKET61=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz828); 
            RIGHT_BRACKET61_tree = (Object)adaptor.create(RIGHT_BRACKET61);
            adaptor.addChild(root_0, RIGHT_BRACKET61_tree);


            		Validation validation = new Validation((NAME58!=null?NAME58.getText():null));
            		validation.setRules(validationRulzEntry);
            		validationRulz.add(validation);
            		validationRulzEntry = new ArrayList<ValidationRule>();


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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:216:1: validation_body : ( validation_entry )+ ;
    public final TerraParserParser.validation_body_return validation_body() throws RecognitionException {
        TerraParserParser.validation_body_return retval = new TerraParserParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.validation_entry_return validation_entry62 = null;



        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:216:17: ( ( validation_entry )+ )
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:216:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:216:19: ( validation_entry )+
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
            	    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:216:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body837);
            	    validation_entry62=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry62.getTree());

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
    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:218:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParserParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParserParser.validation_entry_return retval = new TerraParserParser.validation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE63=null;
        Token STRING_LITERAL64=null;
        Token ATTRIBUITION65=null;
        Token EXPRESSION66=null;

        Object NEWLINE63_tree=null;
        Object STRING_LITERAL64_tree=null;
        Object ATTRIBUITION65_tree=null;
        Object EXPRESSION66_tree=null;

        try {
            // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:218:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
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
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:218:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE63=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry845); 
                    NEWLINE63_tree = (Object)adaptor.create(NEWLINE63);
                    adaptor.addChild(root_0, NEWLINE63_tree);


                    }
                    break;
                case 2 :
                    // D:\\dev\\labs2\\wind2\\wind_terra\\src\\TerraParser.g:218:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL64=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry849); 
                    STRING_LITERAL64_tree = (Object)adaptor.create(STRING_LITERAL64);
                    adaptor.addChild(root_0, STRING_LITERAL64_tree);

                    ATTRIBUITION65=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry851); 
                    ATTRIBUITION65_tree = (Object)adaptor.create(ATTRIBUITION65);
                    adaptor.addChild(root_0, ATTRIBUITION65_tree);

                    EXPRESSION66=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry853); 
                    EXPRESSION66_tree = (Object)adaptor.create(EXPRESSION66);
                    adaptor.addChild(root_0, EXPRESSION66_tree);


                    		ValidationRule valRule = new ValidationRule((STRING_LITERAL64!=null?STRING_LITERAL64.getText():null), (EXPRESSION66!=null?EXPRESSION66.getText():null));
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


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object503 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object507 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object512 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object514 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object516 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object518 = new BitSet(new long[]{0x0000001008188100L});
    public static final BitSet FOLLOW_body_in_domain_object520 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration535 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration537 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration539 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration554 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration556 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration558 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_attr_in_body576 = new BitSet(new long[]{0x0000001008188002L});
    public static final BitSet FOLLOW_operation_in_body580 = new BitSet(new long[]{0x0000001008188002L});
    public static final BitSet FOLLOW_validation_rulz_in_body584 = new BitSet(new long[]{0x0000001008188002L});
    public static final BitSet FOLLOW_obj_property_in_body588 = new BitSet(new long[]{0x0000001008188002L});
    public static final BitSet FOLLOW_NEWLINE_in_body592 = new BitSet(new long[]{0x0000001008188002L});
    public static final BitSet FOLLOW_OBJECT_PROPERTY_in_obj_property601 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_obj_property603 = new BitSet(new long[]{0x0000000089000000L});
    public static final BitSet FOLLOW_value_in_obj_property606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_obj_property608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_attr624 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_attr628 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr630 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr632 = new BitSet(new long[]{0x0000001000030000L});
    public static final BitSet FOLLOW_attr_body_in_attr634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body651 = new BitSet(new long[]{0x0000001000030002L});
    public static final BitSet FOLLOW_NEWLINE_in_property659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property663 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property665 = new BitSet(new long[]{0x0000000089000200L});
    public static final BitSet FOLLOW_value_in_property668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_property672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_array719 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_validValue_in_array721 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_38_in_array724 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_validValue_in_array726 = new BitSet(new long[]{0x0000004000000400L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_array730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validValue740 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validValue742 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validValue746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation755 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation757 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_operation759 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation761 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation763 = new BitSet(new long[]{0x0000001000050000L});
    public static final BitSet FOLLOW_op_body_in_operation765 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body779 = new BitSet(new long[]{0x0000001000050002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop791 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop793 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_value_in_op_prop795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz820 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz822 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz824 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz826 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body837 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry849 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry851 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry853 = new BitSet(new long[]{0x0000000000000002L});

}
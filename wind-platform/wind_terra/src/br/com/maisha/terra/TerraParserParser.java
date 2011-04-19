// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g 2011-01-25 15:47:45
 
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

public class TerraParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "VALIDATION_RULE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OBJECT_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "TYPE2", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
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
    public String getGrammarFileName() { return "C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g"; }


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


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:86:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:4: ( package_declaration )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object487);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:27: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object491);
            	    import_declaration2=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT3=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object496); 
            DOMAIN_OBJECT3_tree = (Object)adaptor.create(DOMAIN_OBJECT3);
            adaptor.addChild(root_0, DOMAIN_OBJECT3_tree);

            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object498); 
            NAME4_tree = (Object)adaptor.create(NAME4);
            adaptor.addChild(root_0, NAME4_tree);

            STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object500); 
            STRING_LITERAL5_tree = (Object)adaptor.create(STRING_LITERAL5);
            adaptor.addChild(root_0, STRING_LITERAL5_tree);

            LEFT_BRACKET6=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object502); 
            LEFT_BRACKET6_tree = (Object)adaptor.create(LEFT_BRACKET6);
            adaptor.addChild(root_0, LEFT_BRACKET6_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VALIDATION_RULE||(LA2_0>=OBJECT_PROPERTY && LA2_0<=OPERATION)||LA2_0==NAME||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:87:96: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object504);
                    body7=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body7.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET8=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object507); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:102:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:103:2: ( PACKAGE NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:103:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration519); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration521); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:103:17: ( NEWLINE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:103:17: NEWLINE
            	    {
            	    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_package_declaration523); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:109:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:110:2: ( IMPORT NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:110:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration538); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration540); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:110:16: ( NEWLINE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:110:16: NEWLINE
            	    {
            	    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration542); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:1: body : ( attr | operation | validation_rulz | obj_property | NEWLINE )+ ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:6: ( ( attr | operation | validation_rulz | obj_property | NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:11: ( attr | operation | validation_rulz | obj_property | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:11: ( attr | operation | validation_rulz | obj_property | NEWLINE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body560);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body564);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:31: validation_rulz
            	    {
            	    pushFollow(FOLLOW_validation_rulz_in_body568);
            	    validation_rulz17=validation_rulz();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_rulz17.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:49: obj_property
            	    {
            	    pushFollow(FOLLOW_obj_property_in_body572);
            	    obj_property18=obj_property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, obj_property18.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:116:64: NEWLINE
            	    {
            	    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body576); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:1: obj_property : OBJECT_PROPERTY ATTRIBUITION ( value | expression ) ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:13: ( OBJECT_PROPERTY ATTRIBUITION ( value | expression ) )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:15: OBJECT_PROPERTY ATTRIBUITION ( value | expression )
            {
            root_0 = (Object)adaptor.nil();

            OBJECT_PROPERTY20=(Token)match(input,OBJECT_PROPERTY,FOLLOW_OBJECT_PROPERTY_in_obj_property585); 
            OBJECT_PROPERTY20_tree = (Object)adaptor.create(OBJECT_PROPERTY20);
            adaptor.addChild(root_0, OBJECT_PROPERTY20_tree);

            ATTRIBUITION21=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_obj_property587); 
            ATTRIBUITION21_tree = (Object)adaptor.create(ATTRIBUITION21);
            adaptor.addChild(root_0, ATTRIBUITION21_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:44: ( value | expression )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:45: value
                    {
                    pushFollow(FOLLOW_value_in_obj_property590);
                    value22=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value22.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:118:51: expression
                    {
                    pushFollow(FOLLOW_expression_in_obj_property592);
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:132:1: attr : type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:132:6: (type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:132:10: type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            type=(Token)match(input,NAME,FOLLOW_NAME_in_attr608); 
            type_tree = (Object)adaptor.create(type);
            adaptor.addChild(root_0, type_tree);

            ref=(Token)match(input,NAME,FOLLOW_NAME_in_attr612); 
            ref_tree = (Object)adaptor.create(ref);
            adaptor.addChild(root_0, ref_tree);

            STRING_LITERAL24=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr614); 
            STRING_LITERAL24_tree = (Object)adaptor.create(STRING_LITERAL24);
            adaptor.addChild(root_0, STRING_LITERAL24_tree);

            LEFT_BRACKET25=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr616); 
            LEFT_BRACKET25_tree = (Object)adaptor.create(LEFT_BRACKET25);
            adaptor.addChild(root_0, LEFT_BRACKET25_tree);

            pushFollow(FOLLOW_attr_body_in_attr618);
            attr_body26=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body26.getTree());
            RIGHT_BRACKET27=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr620); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:1: attr_body : ( property )+ ;
    public final TerraParserParser.attr_body_return attr_body() throws RecognitionException {
        TerraParserParser.attr_body_return retval = new TerraParserParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.property_return property28 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:11: ( ( property )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:14: ( property )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body635);
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParserParser.property_return property() throws RecognitionException {
        TerraParserParser.property_return retval = new TerraParserParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE29=null;
        Token ATTRIBUITION31=null;
        TerraParserParser.attr_prop_name_return attr_prop_name30 = null;

        TerraParserParser.value_return value32 = null;

        TerraParserParser.expression_return expression33 = null;


        Object NEWLINE29_tree=null;
        Object ATTRIBUITION31_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property643); 
                    NEWLINE29_tree = (Object)adaptor.create(NEWLINE29);
                    adaptor.addChild(root_0, NEWLINE29_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:21: attr_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property647);
                    attr_prop_name30=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name30.getTree());
                    ATTRIBUITION31=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property649); 
                    ATTRIBUITION31_tree = (Object)adaptor.create(ATTRIBUITION31);
                    adaptor.addChild(root_0, ATTRIBUITION31_tree);

                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:49: ( value | expression )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NUMBER||LA8_0==NAME) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==EXPRESSION) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:50: value
                            {
                            pushFollow(FOLLOW_value_in_property652);
                            value32=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value32.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:146:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property654);
                            expression33=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression33.getTree());

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
                    		props.put((attr_prop_name30!=null?input.toString(attr_prop_name30.start,attr_prop_name30.stop):null), p);
                    	

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParserParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParserParser.attr_prop_name_return retval = new TerraParserParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set34=null;

        Object set34_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set34=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set34));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:160:1: value : ( NUMBER | NAME ) ;
    public final TerraParserParser.value_return value() throws RecognitionException {
        TerraParserParser.value_return retval = new TerraParserParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:160:7: ( ( NUMBER | NAME ) )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:160:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
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
    // $ANTLR end "value"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:161:1: expression : EXPRESSION ;
    public final TerraParserParser.expression_return expression() throws RecognitionException {
        TerraParserParser.expression_return retval = new TerraParserParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION36=null;

        Object EXPRESSION36_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:162:2: ( EXPRESSION )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:162:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION36=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression688); 
            EXPRESSION36_tree = (Object)adaptor.create(EXPRESSION36);
            adaptor.addChild(root_0, EXPRESSION36_tree);


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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:165:1: operation : OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET ;
    public final TerraParserParser.operation_return operation() throws RecognitionException {
        TerraParserParser.operation_return retval = new TerraParserParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATION37=null;
        Token OP_TYPE38=null;
        Token NAME39=null;
        Token STRING_LITERAL40=null;
        Token LEFT_BRACKET41=null;
        Token RIGHT_BRACKET43=null;
        TerraParserParser.op_body_return op_body42 = null;


        Object OPERATION37_tree=null;
        Object OP_TYPE38_tree=null;
        Object NAME39_tree=null;
        Object STRING_LITERAL40_tree=null;
        Object LEFT_BRACKET41_tree=null;
        Object RIGHT_BRACKET43_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:165:10: ( OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:165:13: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPERATION37=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation697); 
            OPERATION37_tree = (Object)adaptor.create(OPERATION37);
            adaptor.addChild(root_0, OPERATION37_tree);

            OP_TYPE38=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation699); 
            OP_TYPE38_tree = (Object)adaptor.create(OP_TYPE38);
            adaptor.addChild(root_0, OP_TYPE38_tree);

            NAME39=(Token)match(input,NAME,FOLLOW_NAME_in_operation701); 
            NAME39_tree = (Object)adaptor.create(NAME39);
            adaptor.addChild(root_0, NAME39_tree);

            STRING_LITERAL40=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation703); 
            STRING_LITERAL40_tree = (Object)adaptor.create(STRING_LITERAL40);
            adaptor.addChild(root_0, STRING_LITERAL40_tree);

            LEFT_BRACKET41=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation705); 
            LEFT_BRACKET41_tree = (Object)adaptor.create(LEFT_BRACKET41);
            adaptor.addChild(root_0, LEFT_BRACKET41_tree);

            pushFollow(FOLLOW_op_body_in_operation707);
            op_body42=op_body();

            state._fsp--;

            adaptor.addChild(root_0, op_body42.getTree());
            RIGHT_BRACKET43=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation709); 
            RIGHT_BRACKET43_tree = (Object)adaptor.create(RIGHT_BRACKET43);
            adaptor.addChild(root_0, RIGHT_BRACKET43_tree);


            		Operation op = new Operation((OP_TYPE38!=null?OP_TYPE38.getText():null), (NAME39!=null?NAME39.getText():null), (STRING_LITERAL40!=null?STRING_LITERAL40.getText():null));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:174:1: op_body : ( op_prop )+ ;
    public final TerraParserParser.op_body_return op_body() throws RecognitionException {
        TerraParserParser.op_body_return retval = new TerraParserParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.op_prop_return op_prop44 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:174:9: ( ( op_prop )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:174:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:174:11: ( op_prop )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:174:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body721);
            	    op_prop44=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop44.getTree());

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:176:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParserParser.op_prop_return op_prop() throws RecognitionException {
        TerraParserParser.op_prop_return retval = new TerraParserParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE45=null;
        Token ATTRIBUITION47=null;
        TerraParserParser.op_prop_name_return op_prop_name46 = null;

        TerraParserParser.value_return value48 = null;


        Object NEWLINE45_tree=null;
        Object ATTRIBUITION47_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:176:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:176:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop729); 
                    NEWLINE45_tree = (Object)adaptor.create(NEWLINE45);
                    adaptor.addChild(root_0, NEWLINE45_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:176:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop733);
                    op_prop_name46=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name46.getTree());
                    ATTRIBUITION47=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop735); 
                    ATTRIBUITION47_tree = (Object)adaptor.create(ATTRIBUITION47);
                    adaptor.addChild(root_0, ATTRIBUITION47_tree);

                    pushFollow(FOLLOW_value_in_op_prop737);
                    value48=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value48.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name46!=null?input.toString(op_prop_name46.start,op_prop_name46.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value48!=null?input.toString(value48.start,value48.stop):null));
                    		
                    		Property p = new Property((op_prop_name46!=null?input.toString(op_prop_name46.start,op_prop_name46.stop):null), propValue);
                    		op_props.put((op_prop_name46!=null?input.toString(op_prop_name46.start,op_prop_name46.stop):null), p);
                    	

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:189:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParserParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParserParser.op_prop_name_return retval = new TerraParserParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:189:14: ( PROPERTY | OPERATION_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set49=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set49));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:192:1: validation_rulz : VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET ;
    public final TerraParserParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParserParser.validation_rulz_return retval = new TerraParserParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VALIDATION_RULE50=null;
        Token NAME51=null;
        Token LEFT_BRACKET52=null;
        Token RIGHT_BRACKET54=null;
        TerraParserParser.validation_body_return validation_body53 = null;


        Object VALIDATION_RULE50_tree=null;
        Object NAME51_tree=null;
        Object LEFT_BRACKET52_tree=null;
        Object RIGHT_BRACKET54_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:192:16: ( VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:192:19: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            VALIDATION_RULE50=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz762); 
            VALIDATION_RULE50_tree = (Object)adaptor.create(VALIDATION_RULE50);
            adaptor.addChild(root_0, VALIDATION_RULE50_tree);

            NAME51=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz764); 
            NAME51_tree = (Object)adaptor.create(NAME51);
            adaptor.addChild(root_0, NAME51_tree);

            LEFT_BRACKET52=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz766); 
            LEFT_BRACKET52_tree = (Object)adaptor.create(LEFT_BRACKET52);
            adaptor.addChild(root_0, LEFT_BRACKET52_tree);

            pushFollow(FOLLOW_validation_body_in_validation_rulz768);
            validation_body53=validation_body();

            state._fsp--;

            adaptor.addChild(root_0, validation_body53.getTree());
            RIGHT_BRACKET54=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz770); 
            RIGHT_BRACKET54_tree = (Object)adaptor.create(RIGHT_BRACKET54);
            adaptor.addChild(root_0, RIGHT_BRACKET54_tree);


            		Validation validation = new Validation((NAME51!=null?NAME51.getText():null));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:199:1: validation_body : ( validation_entry )+ ;
    public final TerraParserParser.validation_body_return validation_body() throws RecognitionException {
        TerraParserParser.validation_body_return retval = new TerraParserParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.validation_entry_return validation_entry55 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:199:17: ( ( validation_entry )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:199:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:199:19: ( validation_entry )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==STRING_LITERAL||LA12_0==NEWLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:199:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body779);
            	    validation_entry55=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry55.getTree());

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
    // $ANTLR end "validation_body"

    public static class validation_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_entry"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:201:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParserParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParserParser.validation_entry_return retval = new TerraParserParser.validation_entry_return();
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:201:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING_LITERAL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:201:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry787); 
                    NEWLINE56_tree = (Object)adaptor.create(NEWLINE56);
                    adaptor.addChild(root_0, NEWLINE56_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:201:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL57=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry791); 
                    STRING_LITERAL57_tree = (Object)adaptor.create(STRING_LITERAL57);
                    adaptor.addChild(root_0, STRING_LITERAL57_tree);

                    ATTRIBUITION58=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry793); 
                    ATTRIBUITION58_tree = (Object)adaptor.create(ATTRIBUITION58);
                    adaptor.addChild(root_0, ATTRIBUITION58_tree);

                    EXPRESSION59=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry795); 
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


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object487 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object491 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object496 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object498 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object500 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object502 = new BitSet(new long[]{0x0000000402062100L});
    public static final BitSet FOLLOW_body_in_domain_object504 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration519 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration523 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration538 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration540 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration542 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_attr_in_body560 = new BitSet(new long[]{0x0000000402062002L});
    public static final BitSet FOLLOW_operation_in_body564 = new BitSet(new long[]{0x0000000402062002L});
    public static final BitSet FOLLOW_validation_rulz_in_body568 = new BitSet(new long[]{0x0000000402062002L});
    public static final BitSet FOLLOW_obj_property_in_body572 = new BitSet(new long[]{0x0000000402062002L});
    public static final BitSet FOLLOW_NEWLINE_in_body576 = new BitSet(new long[]{0x0000000402062002L});
    public static final BitSet FOLLOW_OBJECT_PROPERTY_in_obj_property585 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_obj_property587 = new BitSet(new long[]{0x0000000022400000L});
    public static final BitSet FOLLOW_value_in_obj_property590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_obj_property592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_attr608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_attr612 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr614 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr616 = new BitSet(new long[]{0x000000040000C000L});
    public static final BitSet FOLLOW_attr_body_in_attr618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body635 = new BitSet(new long[]{0x000000040000C002L});
    public static final BitSet FOLLOW_NEWLINE_in_property643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property647 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property649 = new BitSet(new long[]{0x0000000022400000L});
    public static final BitSet FOLLOW_value_in_property652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation699 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_operation701 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation703 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation705 = new BitSet(new long[]{0x0000000400014000L});
    public static final BitSet FOLLOW_op_body_in_operation707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body721 = new BitSet(new long[]{0x0000000400014002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop733 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop735 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_value_in_op_prop737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz762 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz764 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz766 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz768 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body779 = new BitSet(new long[]{0x0000000408000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry791 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry793 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry795 = new BitSet(new long[]{0x0000000000000002L});

}
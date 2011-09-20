// $ANTLR 3.3 Nov 30, 2010 12:50:56 /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g 2011-09-19 21:39:53
 
package br.com.maisha.terra; 
import java.util.HashMap;
import java.util.Map;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Container;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "VALIDATION_RULE", "PRESENTATION_TYPE", "SUPPORTED_PRESENTATION_TYPES", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OBJECT_PROPERTY", "FOLDER_PROPERTY", "GENERAL_PROPERTY", "OPERATION", "FOLDER", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "TYPE2", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE", "'using'", "','"
    };
    public static final int EOF=-1;
    public static final int T__43=43;
    public static final int T__44=44;
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
    public static final int PRESENTATION_TYPE=16;
    public static final int SUPPORTED_PRESENTATION_TYPES=17;
    public static final int PROPERTY=18;
    public static final int ATTRIBUTE_PROPERTY=19;
    public static final int OPERATION_PROPERTY=20;
    public static final int OBJECT_PROPERTY=21;
    public static final int FOLDER_PROPERTY=22;
    public static final int GENERAL_PROPERTY=23;
    public static final int OPERATION=24;
    public static final int FOLDER=25;
    public static final int OP_TYPE=26;
    public static final int INTEGER=27;
    public static final int FLOAT=28;
    public static final int NUMBER=29;
    public static final int LETTER=30;
    public static final int DIGIT=31;
    public static final int NAME=32;
    public static final int NONCONTROL_CHAR=33;
    public static final int STRING_LITERAL=34;
    public static final int TYPE2=35;
    public static final int EXPRESSION=36;
    public static final int SYMBOL=37;
    public static final int SPACE=38;
    public static final int LOWER=39;
    public static final int UPPER=40;
    public static final int NEWLINE=41;
    public static final int WHITESPACE=42;

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
    public String getGrammarFileName() { return "/media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g"; }


    public DomainObject domainObject = null;
    private String pckg = "";
    private List<Attribute> atts = new ArrayList<Attribute>();
    private List<Operation> ops = new ArrayList<Operation>();
    private Map<String, Property> props = new HashMap<String, Property>();
    private Map<String, Property> op_props = new HashMap<String, Property>();
    private Map<String, Property> obj_props = new HashMap<String, Property>();
    private Map<String, Property> folder_props = new HashMap<String, Property>();
    private Map<String, Attribute> folder_atts = new HashMap<String, Attribute>();
    private Map<String, Container> folders = new HashMap<String, Container>();
    private List<Import> imports = new ArrayList<Import>();
    private List<Validation> validationRulz = new ArrayList<Validation>();
    private List<ValidationRule> validationRulzEntry = new ArrayList<ValidationRule>();
    private List<ValidValue> validValues = new ArrayList<ValidValue>();


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:99:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
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
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:4: ( package_declaration )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object592);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:27: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object596);
            	    import_declaration2=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT3=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object601); 
            DOMAIN_OBJECT3_tree = (Object)adaptor.create(DOMAIN_OBJECT3);
            adaptor.addChild(root_0, DOMAIN_OBJECT3_tree);

            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object603); 
            NAME4_tree = (Object)adaptor.create(NAME4);
            adaptor.addChild(root_0, NAME4_tree);

            STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object605); 
            STRING_LITERAL5_tree = (Object)adaptor.create(STRING_LITERAL5);
            adaptor.addChild(root_0, STRING_LITERAL5_tree);

            LEFT_BRACKET6=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object607); 
            LEFT_BRACKET6_tree = (Object)adaptor.create(LEFT_BRACKET6);
            adaptor.addChild(root_0, LEFT_BRACKET6_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VALIDATION_RULE||LA2_0==OBJECT_PROPERTY||(LA2_0>=OPERATION && LA2_0<=FOLDER)||LA2_0==NAME||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:100:96: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object609);
                    body7=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body7.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET8=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object612); 
            RIGHT_BRACKET8_tree = (Object)adaptor.create(RIGHT_BRACKET8);
            adaptor.addChild(root_0, RIGHT_BRACKET8_tree);


            		domainObject = new DomainObject((NAME4!=null?NAME4.getText():null), (STRING_LITERAL5!=null?STRING_LITERAL5.getText():null));
            		domainObject.setPckg(pckg);
            		domainObject.setAtts(atts);
            		domainObject.setOperations(ops);
            		domainObject.setImports(imports);
            		domainObject.setValidations(validationRulz);
            		domainObject.setProperties(obj_props);
            		domainObject.setContainers(folders);
            		folders = new HashMap<String, Container>();
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:117:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
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
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:118:2: ( PACKAGE NAME ( NEWLINE )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:118:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration624); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration626); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:118:17: ( NEWLINE )+
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
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:118:17: NEWLINE
            	    {
            	    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_package_declaration628); 
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:124:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:125:2: ( IMPORT NAME ( NEWLINE )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:125:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration643); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration645); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:125:16: ( NEWLINE )+
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
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:125:16: NEWLINE
            	    {
            	    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration647); 
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:1: body : ( attr | operation | validation_rulz | obj_property | folder | NEWLINE )+ ;
    public final TerraParserParser.body_return body() throws RecognitionException {
        TerraParserParser.body_return retval = new TerraParserParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE20=null;
        TerraParserParser.attr_return attr15 = null;

        TerraParserParser.operation_return operation16 = null;

        TerraParserParser.validation_rulz_return validation_rulz17 = null;

        TerraParserParser.obj_property_return obj_property18 = null;

        TerraParserParser.folder_return folder19 = null;


        Object NEWLINE20_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:6: ( ( attr | operation | validation_rulz | obj_property | folder | NEWLINE )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:11: ( attr | operation | validation_rulz | obj_property | folder | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:11: ( attr | operation | validation_rulz | obj_property | folder | NEWLINE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=7;
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
                case FOLDER:
                    {
                    alt5=5;
                    }
                    break;
                case NEWLINE:
                    {
                    alt5=6;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body665);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body669);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:31: validation_rulz
            	    {
            	    pushFollow(FOLLOW_validation_rulz_in_body673);
            	    validation_rulz17=validation_rulz();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_rulz17.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:49: obj_property
            	    {
            	    pushFollow(FOLLOW_obj_property_in_body677);
            	    obj_property18=obj_property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, obj_property18.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:64: folder
            	    {
            	    pushFollow(FOLLOW_folder_in_body681);
            	    folder19=folder();

            	    state._fsp--;

            	    adaptor.addChild(root_0, folder19.getTree());

            	    }
            	    break;
            	case 6 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:131:73: NEWLINE
            	    {
            	    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body685); 
            	    NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
            	    adaptor.addChild(root_0, NEWLINE20_tree);


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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:1: obj_property : OBJECT_PROPERTY ATTRIBUITION ( value | expression ) ;
    public final TerraParserParser.obj_property_return obj_property() throws RecognitionException {
        TerraParserParser.obj_property_return retval = new TerraParserParser.obj_property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OBJECT_PROPERTY21=null;
        Token ATTRIBUITION22=null;
        TerraParserParser.value_return value23 = null;

        TerraParserParser.expression_return expression24 = null;


        Object OBJECT_PROPERTY21_tree=null;
        Object ATTRIBUITION22_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:13: ( OBJECT_PROPERTY ATTRIBUITION ( value | expression ) )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:15: OBJECT_PROPERTY ATTRIBUITION ( value | expression )
            {
            root_0 = (Object)adaptor.nil();

            OBJECT_PROPERTY21=(Token)match(input,OBJECT_PROPERTY,FOLLOW_OBJECT_PROPERTY_in_obj_property694); 
            OBJECT_PROPERTY21_tree = (Object)adaptor.create(OBJECT_PROPERTY21);
            adaptor.addChild(root_0, OBJECT_PROPERTY21_tree);

            ATTRIBUITION22=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_obj_property696); 
            ATTRIBUITION22_tree = (Object)adaptor.create(ATTRIBUITION22);
            adaptor.addChild(root_0, ATTRIBUITION22_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:44: ( value | expression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NUMBER||LA6_0==NAME||LA6_0==STRING_LITERAL) ) {
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
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:45: value
                    {
                    pushFollow(FOLLOW_value_in_obj_property699);
                    value23=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value23.getTree());

                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:133:51: expression
                    {
                    pushFollow(FOLLOW_expression_in_obj_property701);
                    expression24=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression24.getTree());

                    }
                    break;

            }


            		IConverterService convService = ServiceProvider.getInstance()
            				.getService(IConverterService.class,
            						Activator.getDefault().getBundleContext());
            						
            		Class<?> type = PropertyInfo.getPropertyInfo((OBJECT_PROPERTY21!=null?OBJECT_PROPERTY21.getText():null)).getType();
            		Object propValue = convService.convert(type, (value23!=null?input.toString(value23.start,value23.stop):null));
            		
            		Property p = new Property((OBJECT_PROPERTY21!=null?OBJECT_PROPERTY21.getText():null), propValue);
            		p.setExpression((expression24!=null?input.toString(expression24.start,expression24.stop):null));
            		obj_props.put((OBJECT_PROPERTY21!=null?OBJECT_PROPERTY21.getText():null), p);		


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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:147:1: attr : type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET ( attr_body )+ RIGHT_BRACKET ;
    public final TerraParserParser.attr_return attr() throws RecognitionException {
        TerraParserParser.attr_return retval = new TerraParserParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token type=null;
        Token ref=null;
        Token STRING_LITERAL25=null;
        Token LEFT_BRACKET26=null;
        Token RIGHT_BRACKET28=null;
        TerraParserParser.attr_body_return attr_body27 = null;


        Object type_tree=null;
        Object ref_tree=null;
        Object STRING_LITERAL25_tree=null;
        Object LEFT_BRACKET26_tree=null;
        Object RIGHT_BRACKET28_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:147:6: (type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET ( attr_body )+ RIGHT_BRACKET )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:147:10: type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET ( attr_body )+ RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            type=(Token)match(input,NAME,FOLLOW_NAME_in_attr717); 
            type_tree = (Object)adaptor.create(type);
            adaptor.addChild(root_0, type_tree);

            ref=(Token)match(input,NAME,FOLLOW_NAME_in_attr721); 
            ref_tree = (Object)adaptor.create(ref);
            adaptor.addChild(root_0, ref_tree);

            STRING_LITERAL25=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr723); 
            STRING_LITERAL25_tree = (Object)adaptor.create(STRING_LITERAL25);
            adaptor.addChild(root_0, STRING_LITERAL25_tree);

            LEFT_BRACKET26=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr725); 
            LEFT_BRACKET26_tree = (Object)adaptor.create(LEFT_BRACKET26);
            adaptor.addChild(root_0, LEFT_BRACKET26_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:147:57: ( attr_body )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==PRESENTATION_TYPE||(LA7_0>=PROPERTY && LA7_0<=ATTRIBUTE_PROPERTY)||LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:147:57: attr_body
            	    {
            	    pushFollow(FOLLOW_attr_body_in_attr727);
            	    attr_body27=attr_body();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr_body27.getTree());

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

            RIGHT_BRACKET28=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr730); 
            RIGHT_BRACKET28_tree = (Object)adaptor.create(RIGHT_BRACKET28);
            adaptor.addChild(root_0, RIGHT_BRACKET28_tree);


            		Attribute att = new Attribute((type!=null?type.getText():null), (ref!=null?ref.getText():null), (STRING_LITERAL25!=null?STRING_LITERAL25.getText():null));
            		att.setDomainObject(domainObject);		
            		att.setProperties(props);
            		
            		String folder = att.getPropertyValue(PropertyInfo.FOLDER);
            		if(folder != null && folder.length() > 0){
                  Container c = folders.get(folder);
                  if(c != null){
                    c.addAttribute(att.getRef());
                  }
                }
            		
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:168:1: attr_body : ( NEWLINE | property | prstn_type );
    public final TerraParserParser.attr_body_return attr_body() throws RecognitionException {
        TerraParserParser.attr_body_return retval = new TerraParserParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE29=null;
        TerraParserParser.property_return property30 = null;

        TerraParserParser.prstn_type_return prstn_type31 = null;


        Object NEWLINE29_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:168:11: ( NEWLINE | property | prstn_type )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NEWLINE:
                {
                alt8=1;
                }
                break;
            case PROPERTY:
            case ATTRIBUTE_PROPERTY:
                {
                alt8=2;
                }
                break;
            case PRESENTATION_TYPE:
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
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:168:12: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE29=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_attr_body743); 
                    NEWLINE29_tree = (Object)adaptor.create(NEWLINE29);
                    adaptor.addChild(root_0, NEWLINE29_tree);


                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:168:22: property
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_property_in_attr_body747);
                    property30=property();

                    state._fsp--;

                    adaptor.addChild(root_0, property30.getTree());

                    }
                    break;
                case 3 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:168:35: prstn_type
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prstn_type_in_attr_body753);
                    prstn_type31=prstn_type();

                    state._fsp--;

                    adaptor.addChild(root_0, prstn_type31.getTree());

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
    // $ANTLR end "attr_body"

    public static class prstn_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prstn_type"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:1: prstn_type : PRESENTATION_TYPE ':' SUPPORTED_PRESENTATION_TYPES ( 'using' )* ( array )* ;
    public final TerraParserParser.prstn_type_return prstn_type() throws RecognitionException {
        TerraParserParser.prstn_type_return retval = new TerraParserParser.prstn_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRESENTATION_TYPE32=null;
        Token char_literal33=null;
        Token SUPPORTED_PRESENTATION_TYPES34=null;
        Token string_literal35=null;
        TerraParserParser.array_return array36 = null;


        Object PRESENTATION_TYPE32_tree=null;
        Object char_literal33_tree=null;
        Object SUPPORTED_PRESENTATION_TYPES34_tree=null;
        Object string_literal35_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:11: ( PRESENTATION_TYPE ':' SUPPORTED_PRESENTATION_TYPES ( 'using' )* ( array )* )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:13: PRESENTATION_TYPE ':' SUPPORTED_PRESENTATION_TYPES ( 'using' )* ( array )*
            {
            root_0 = (Object)adaptor.nil();

            PRESENTATION_TYPE32=(Token)match(input,PRESENTATION_TYPE,FOLLOW_PRESENTATION_TYPE_in_prstn_type762); 
            PRESENTATION_TYPE32_tree = (Object)adaptor.create(PRESENTATION_TYPE32);
            adaptor.addChild(root_0, PRESENTATION_TYPE32_tree);

            char_literal33=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_prstn_type764); 
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);

            SUPPORTED_PRESENTATION_TYPES34=(Token)match(input,SUPPORTED_PRESENTATION_TYPES,FOLLOW_SUPPORTED_PRESENTATION_TYPES_in_prstn_type766); 
            SUPPORTED_PRESENTATION_TYPES34_tree = (Object)adaptor.create(SUPPORTED_PRESENTATION_TYPES34);
            adaptor.addChild(root_0, SUPPORTED_PRESENTATION_TYPES34_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:64: ( 'using' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:64: 'using'
            	    {
            	    string_literal35=(Token)match(input,43,FOLLOW_43_in_prstn_type768); 
            	    string_literal35_tree = (Object)adaptor.create(string_literal35);
            	    adaptor.addChild(root_0, string_literal35_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:73: ( array )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LEFT_BRACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:170:73: array
            	    {
            	    pushFollow(FOLLOW_array_in_prstn_type771);
            	    array36=array();

            	    state._fsp--;

            	    adaptor.addChild(root_0, array36.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


                Property p = new Property((PRESENTATION_TYPE32!=null?PRESENTATION_TYPE32.getText():null), (SUPPORTED_PRESENTATION_TYPES34!=null?SUPPORTED_PRESENTATION_TYPES34.getText():null));
                p.setValidValues(validValues);
                props.put((PRESENTATION_TYPE32!=null?PRESENTATION_TYPE32.getText():null), p);
                validValues = new ArrayList<ValidValue>();


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
    // $ANTLR end "prstn_type"

    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:1: property : attr_prop_name ATTRIBUITION ( value | expression | array ) ;
    public final TerraParserParser.property_return property() throws RecognitionException {
        TerraParserParser.property_return retval = new TerraParserParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ATTRIBUITION38=null;
        TerraParserParser.attr_prop_name_return attr_prop_name37 = null;

        TerraParserParser.value_return value39 = null;

        TerraParserParser.expression_return expression40 = null;

        TerraParserParser.array_return array41 = null;


        Object ATTRIBUITION38_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:9: ( attr_prop_name ATTRIBUITION ( value | expression | array ) )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:12: attr_prop_name ATTRIBUITION ( value | expression | array )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_attr_prop_name_in_property784);
            attr_prop_name37=attr_prop_name();

            state._fsp--;

            adaptor.addChild(root_0, attr_prop_name37.getTree());
            ATTRIBUITION38=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property786); 
            ATTRIBUITION38_tree = (Object)adaptor.create(ATTRIBUITION38);
            adaptor.addChild(root_0, ATTRIBUITION38_tree);

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:40: ( value | expression | array )
            int alt11=3;
            switch ( input.LA(1) ) {
            case NUMBER:
            case NAME:
            case STRING_LITERAL:
                {
                alt11=1;
                }
                break;
            case EXPRESSION:
                {
                alt11=2;
                }
                break;
            case LEFT_BRACE:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:41: value
                    {
                    pushFollow(FOLLOW_value_in_property789);
                    value39=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value39.getTree());

                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:47: expression
                    {
                    pushFollow(FOLLOW_expression_in_property791);
                    expression40=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression40.getTree());

                    }
                    break;
                case 3 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:179:58: array
                    {
                    pushFollow(FOLLOW_array_in_property793);
                    array41=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array41.getTree());

                    }
                    break;

            }


            		IConverterService convService = ServiceProvider.getInstance()
            				.getService(IConverterService.class,
            						Activator.getDefault().getBundleContext());
            					
            		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name37!=null?input.toString(attr_prop_name37.start,attr_prop_name37.stop):null)).getType();
            		Object propValue = convService.convert(type, (value39!=null?input.toString(value39.start,value39.stop):null));
            		
            		Property p = new Property((attr_prop_name37!=null?input.toString(attr_prop_name37.start,attr_prop_name37.stop):null), propValue);
            		p.setExpression((expression40!=null?input.toString(expression40.start,expression40.stop):null));
            		p.setValidValues(validValues);
            		props.put((attr_prop_name37!=null?input.toString(attr_prop_name37.start,attr_prop_name37.stop):null), p);
            		validValues = new ArrayList<ValidValue>();
            	

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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:195:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParserParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParserParser.attr_prop_name_return retval = new TerraParserParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:195:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set42));
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:197:1: value : ( NUMBER | NAME | STRING_LITERAL ) ;
    public final TerraParserParser.value_return value() throws RecognitionException {
        TerraParserParser.value_return retval = new TerraParserParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:197:7: ( ( NUMBER | NAME | STRING_LITERAL ) )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:197:9: ( NUMBER | NAME | STRING_LITERAL )
            {
            root_0 = (Object)adaptor.nil();

            set43=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set43));
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:199:1: expression : EXPRESSION ;
    public final TerraParserParser.expression_return expression() throws RecognitionException {
        TerraParserParser.expression_return retval = new TerraParserParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION44=null;

        Object EXPRESSION44_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:200:2: ( EXPRESSION )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:200:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION44=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression834); 
            EXPRESSION44_tree = (Object)adaptor.create(EXPRESSION44);
            adaptor.addChild(root_0, EXPRESSION44_tree);


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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:202:1: array : LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE ;
    public final TerraParserParser.array_return array() throws RecognitionException {
        TerraParserParser.array_return retval = new TerraParserParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFT_BRACE45=null;
        Token char_literal47=null;
        Token RIGHT_BRACE49=null;
        TerraParserParser.validValue_return validValue46 = null;

        TerraParserParser.validValue_return validValue48 = null;


        Object LEFT_BRACE45_tree=null;
        Object char_literal47_tree=null;
        Object RIGHT_BRACE49_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:202:7: ( LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:202:9: LEFT_BRACE validValue ( ',' validValue )* RIGHT_BRACE
            {
            root_0 = (Object)adaptor.nil();

            LEFT_BRACE45=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_array843); 
            LEFT_BRACE45_tree = (Object)adaptor.create(LEFT_BRACE45);
            adaptor.addChild(root_0, LEFT_BRACE45_tree);

            pushFollow(FOLLOW_validValue_in_array845);
            validValue46=validValue();

            state._fsp--;

            adaptor.addChild(root_0, validValue46.getTree());
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:202:31: ( ',' validValue )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:202:32: ',' validValue
            	    {
            	    char_literal47=(Token)match(input,44,FOLLOW_44_in_array848); 
            	    char_literal47_tree = (Object)adaptor.create(char_literal47);
            	    adaptor.addChild(root_0, char_literal47_tree);

            	    pushFollow(FOLLOW_validValue_in_array850);
            	    validValue48=validValue();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validValue48.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            RIGHT_BRACE49=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_array854); 
            RIGHT_BRACE49_tree = (Object)adaptor.create(RIGHT_BRACE49);
            adaptor.addChild(root_0, RIGHT_BRACE49_tree);


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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:204:1: validValue : vValue= STRING_LITERAL ;
    public final TerraParserParser.validValue_return validValue() throws RecognitionException {
        TerraParserParser.validValue_return retval = new TerraParserParser.validValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token vValue=null;

        Object vValue_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:204:11: (vValue= STRING_LITERAL )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:204:13: vValue= STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            vValue=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validValue864); 
            vValue_tree = (Object)adaptor.create(vValue);
            adaptor.addChild(root_0, vValue_tree);


                 validValues.add(new ValidValue((vValue!=null?vValue.getText():null)));


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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:208:1: operation : OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET ;
    public final TerraParserParser.operation_return operation() throws RecognitionException {
        TerraParserParser.operation_return retval = new TerraParserParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATION50=null;
        Token OP_TYPE51=null;
        Token NAME52=null;
        Token STRING_LITERAL53=null;
        Token LEFT_BRACKET54=null;
        Token RIGHT_BRACKET56=null;
        TerraParserParser.op_body_return op_body55 = null;


        Object OPERATION50_tree=null;
        Object OP_TYPE51_tree=null;
        Object NAME52_tree=null;
        Object STRING_LITERAL53_tree=null;
        Object LEFT_BRACKET54_tree=null;
        Object RIGHT_BRACKET56_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:208:10: ( OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:208:13: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPERATION50=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation873); 
            OPERATION50_tree = (Object)adaptor.create(OPERATION50);
            adaptor.addChild(root_0, OPERATION50_tree);

            OP_TYPE51=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation875); 
            OP_TYPE51_tree = (Object)adaptor.create(OP_TYPE51);
            adaptor.addChild(root_0, OP_TYPE51_tree);

            NAME52=(Token)match(input,NAME,FOLLOW_NAME_in_operation877); 
            NAME52_tree = (Object)adaptor.create(NAME52);
            adaptor.addChild(root_0, NAME52_tree);

            STRING_LITERAL53=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation879); 
            STRING_LITERAL53_tree = (Object)adaptor.create(STRING_LITERAL53);
            adaptor.addChild(root_0, STRING_LITERAL53_tree);

            LEFT_BRACKET54=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation881); 
            LEFT_BRACKET54_tree = (Object)adaptor.create(LEFT_BRACKET54);
            adaptor.addChild(root_0, LEFT_BRACKET54_tree);

            pushFollow(FOLLOW_op_body_in_operation883);
            op_body55=op_body();

            state._fsp--;

            adaptor.addChild(root_0, op_body55.getTree());
            RIGHT_BRACKET56=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation885); 
            RIGHT_BRACKET56_tree = (Object)adaptor.create(RIGHT_BRACKET56);
            adaptor.addChild(root_0, RIGHT_BRACKET56_tree);


            		Operation op = new Operation((OP_TYPE51!=null?OP_TYPE51.getText():null), (NAME52!=null?NAME52.getText():null), (STRING_LITERAL53!=null?STRING_LITERAL53.getText():null));
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:217:1: op_body : ( op_prop )+ ;
    public final TerraParserParser.op_body_return op_body() throws RecognitionException {
        TerraParserParser.op_body_return retval = new TerraParserParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.op_prop_return op_prop57 = null;



        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:217:9: ( ( op_prop )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:217:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:217:11: ( op_prop )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PROPERTY||LA13_0==OPERATION_PROPERTY||LA13_0==GENERAL_PROPERTY||LA13_0==NEWLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:217:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body897);
            	    op_prop57=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop57.getTree());

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
    // $ANTLR end "op_body"

    public static class op_prop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_prop"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:219:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParserParser.op_prop_return op_prop() throws RecognitionException {
        TerraParserParser.op_prop_return retval = new TerraParserParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE58=null;
        Token ATTRIBUITION60=null;
        TerraParserParser.op_prop_name_return op_prop_name59 = null;

        TerraParserParser.value_return value61 = null;


        Object NEWLINE58_tree=null;
        Object ATTRIBUITION60_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:219:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NEWLINE) ) {
                alt14=1;
            }
            else if ( (LA14_0==PROPERTY||LA14_0==OPERATION_PROPERTY||LA14_0==GENERAL_PROPERTY) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:219:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE58=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop905); 
                    NEWLINE58_tree = (Object)adaptor.create(NEWLINE58);
                    adaptor.addChild(root_0, NEWLINE58_tree);


                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:219:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop909);
                    op_prop_name59=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name59.getTree());
                    ATTRIBUITION60=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop911); 
                    ATTRIBUITION60_tree = (Object)adaptor.create(ATTRIBUITION60);
                    adaptor.addChild(root_0, ATTRIBUITION60_tree);

                    pushFollow(FOLLOW_value_in_op_prop913);
                    value61=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value61.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name59!=null?input.toString(op_prop_name59.start,op_prop_name59.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value61!=null?input.toString(value61.start,value61.stop):null));
                    		
                    		Property p = new Property((op_prop_name59!=null?input.toString(op_prop_name59.start,op_prop_name59.stop):null), propValue);
                    		op_props.put((op_prop_name59!=null?input.toString(op_prop_name59.start,op_prop_name59.stop):null), p);
                    	

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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:232:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY | GENERAL_PROPERTY );
    public final TerraParserParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParserParser.op_prop_name_return retval = new TerraParserParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set62=null;

        Object set62_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:232:14: ( PROPERTY | OPERATION_PROPERTY | GENERAL_PROPERTY )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set62=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY||input.LA(1)==GENERAL_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set62));
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:235:1: validation_rulz : VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET ;
    public final TerraParserParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParserParser.validation_rulz_return retval = new TerraParserParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VALIDATION_RULE63=null;
        Token NAME64=null;
        Token LEFT_BRACKET65=null;
        Token RIGHT_BRACKET67=null;
        TerraParserParser.validation_body_return validation_body66 = null;


        Object VALIDATION_RULE63_tree=null;
        Object NAME64_tree=null;
        Object LEFT_BRACKET65_tree=null;
        Object RIGHT_BRACKET67_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:235:16: ( VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:235:19: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            VALIDATION_RULE63=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz942); 
            VALIDATION_RULE63_tree = (Object)adaptor.create(VALIDATION_RULE63);
            adaptor.addChild(root_0, VALIDATION_RULE63_tree);

            NAME64=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz944); 
            NAME64_tree = (Object)adaptor.create(NAME64);
            adaptor.addChild(root_0, NAME64_tree);

            LEFT_BRACKET65=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz946); 
            LEFT_BRACKET65_tree = (Object)adaptor.create(LEFT_BRACKET65);
            adaptor.addChild(root_0, LEFT_BRACKET65_tree);

            pushFollow(FOLLOW_validation_body_in_validation_rulz948);
            validation_body66=validation_body();

            state._fsp--;

            adaptor.addChild(root_0, validation_body66.getTree());
            RIGHT_BRACKET67=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz950); 
            RIGHT_BRACKET67_tree = (Object)adaptor.create(RIGHT_BRACKET67);
            adaptor.addChild(root_0, RIGHT_BRACKET67_tree);


            		Validation validation = new Validation((NAME64!=null?NAME64.getText():null));
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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:242:1: validation_body : ( validation_entry )+ ;
    public final TerraParserParser.validation_body_return validation_body() throws RecognitionException {
        TerraParserParser.validation_body_return retval = new TerraParserParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.validation_entry_return validation_entry68 = null;



        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:242:17: ( ( validation_entry )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:242:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:242:19: ( validation_entry )+
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
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:242:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body959);
            	    validation_entry68=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry68.getTree());

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
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:244:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParserParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParserParser.validation_entry_return retval = new TerraParserParser.validation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE69=null;
        Token STRING_LITERAL70=null;
        Token ATTRIBUITION71=null;
        Token EXPRESSION72=null;

        Object NEWLINE69_tree=null;
        Object STRING_LITERAL70_tree=null;
        Object ATTRIBUITION71_tree=null;
        Object EXPRESSION72_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:244:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
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
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:244:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE69=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry967); 
                    NEWLINE69_tree = (Object)adaptor.create(NEWLINE69);
                    adaptor.addChild(root_0, NEWLINE69_tree);


                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:244:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL70=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry971); 
                    STRING_LITERAL70_tree = (Object)adaptor.create(STRING_LITERAL70);
                    adaptor.addChild(root_0, STRING_LITERAL70_tree);

                    ATTRIBUITION71=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry973); 
                    ATTRIBUITION71_tree = (Object)adaptor.create(ATTRIBUITION71);
                    adaptor.addChild(root_0, ATTRIBUITION71_tree);

                    EXPRESSION72=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry975); 
                    EXPRESSION72_tree = (Object)adaptor.create(EXPRESSION72);
                    adaptor.addChild(root_0, EXPRESSION72_tree);


                    		ValidationRule valRule = new ValidationRule((STRING_LITERAL70!=null?STRING_LITERAL70.getText():null), (EXPRESSION72!=null?EXPRESSION72.getText():null));
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

    public static class folder_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "folder"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:249:1: folder : FOLDER NAME STRING_LITERAL LEFT_BRACKET folder_body RIGHT_BRACKET ;
    public final TerraParserParser.folder_return folder() throws RecognitionException {
        TerraParserParser.folder_return retval = new TerraParserParser.folder_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOLDER73=null;
        Token NAME74=null;
        Token STRING_LITERAL75=null;
        Token LEFT_BRACKET76=null;
        Token RIGHT_BRACKET78=null;
        TerraParserParser.folder_body_return folder_body77 = null;


        Object FOLDER73_tree=null;
        Object NAME74_tree=null;
        Object STRING_LITERAL75_tree=null;
        Object LEFT_BRACKET76_tree=null;
        Object RIGHT_BRACKET78_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:249:7: ( FOLDER NAME STRING_LITERAL LEFT_BRACKET folder_body RIGHT_BRACKET )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:249:9: FOLDER NAME STRING_LITERAL LEFT_BRACKET folder_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            FOLDER73=(Token)match(input,FOLDER,FOLLOW_FOLDER_in_folder984); 
            FOLDER73_tree = (Object)adaptor.create(FOLDER73);
            adaptor.addChild(root_0, FOLDER73_tree);

            NAME74=(Token)match(input,NAME,FOLLOW_NAME_in_folder986); 
            NAME74_tree = (Object)adaptor.create(NAME74);
            adaptor.addChild(root_0, NAME74_tree);

            STRING_LITERAL75=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_folder988); 
            STRING_LITERAL75_tree = (Object)adaptor.create(STRING_LITERAL75);
            adaptor.addChild(root_0, STRING_LITERAL75_tree);

            LEFT_BRACKET76=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_folder990); 
            LEFT_BRACKET76_tree = (Object)adaptor.create(LEFT_BRACKET76);
            adaptor.addChild(root_0, LEFT_BRACKET76_tree);

            pushFollow(FOLLOW_folder_body_in_folder992);
            folder_body77=folder_body();

            state._fsp--;

            adaptor.addChild(root_0, folder_body77.getTree());
            RIGHT_BRACKET78=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_folder994); 
            RIGHT_BRACKET78_tree = (Object)adaptor.create(RIGHT_BRACKET78);
            adaptor.addChild(root_0, RIGHT_BRACKET78_tree);


                Container f = new Container((NAME74!=null?NAME74.getText():null), (STRING_LITERAL75!=null?STRING_LITERAL75.getText():null));
                f.setDomainObject(domainObject);
                f.setProperties(folder_props);
                f.setType(Container.PresentationType.FOLDER);
                folders.put(f.getRef(), f);
                folder_props = new HashMap<String, Property>();


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
    // $ANTLR end "folder"

    public static class folder_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "folder_body"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:258:1: folder_body : ( folder_props )+ ;
    public final TerraParserParser.folder_body_return folder_body() throws RecognitionException {
        TerraParserParser.folder_body_return retval = new TerraParserParser.folder_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.folder_props_return folder_props79 = null;



        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:258:12: ( ( folder_props )+ )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:258:14: ( folder_props )+
            {
            root_0 = (Object)adaptor.nil();

            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:258:14: ( folder_props )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=FOLDER_PROPERTY && LA17_0<=GENERAL_PROPERTY)||LA17_0==NEWLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:258:14: folder_props
            	    {
            	    pushFollow(FOLLOW_folder_props_in_folder_body1003);
            	    folder_props79=folder_props();

            	    state._fsp--;

            	    adaptor.addChild(root_0, folder_props79.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "folder_body"

    public static class folder_prop_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "folder_prop_name"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:259:1: folder_prop_name : ( FOLDER_PROPERTY | GENERAL_PROPERTY );
    public final TerraParserParser.folder_prop_name_return folder_prop_name() throws RecognitionException {
        TerraParserParser.folder_prop_name_return retval = new TerraParserParser.folder_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set80=null;

        Object set80_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:259:17: ( FOLDER_PROPERTY | GENERAL_PROPERTY )
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set80=(Token)input.LT(1);
            if ( (input.LA(1)>=FOLDER_PROPERTY && input.LA(1)<=GENERAL_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set80));
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
    // $ANTLR end "folder_prop_name"

    public static class folder_props_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "folder_props"
    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:1: folder_props : ( NEWLINE | folder_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParserParser.folder_props_return folder_props() throws RecognitionException {
        TerraParserParser.folder_props_return retval = new TerraParserParser.folder_props_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE81=null;
        Token ATTRIBUITION83=null;
        TerraParserParser.folder_prop_name_return folder_prop_name82 = null;

        TerraParserParser.value_return value84 = null;

        TerraParserParser.expression_return expression85 = null;


        Object NEWLINE81_tree=null;
        Object ATTRIBUITION83_tree=null;

        try {
            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:13: ( NEWLINE | folder_prop_name ATTRIBUITION ( value | expression ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NEWLINE) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=FOLDER_PROPERTY && LA19_0<=GENERAL_PROPERTY)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:15: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE81=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_folder_props1021); 
                    NEWLINE81_tree = (Object)adaptor.create(NEWLINE81);
                    adaptor.addChild(root_0, NEWLINE81_tree);


                    }
                    break;
                case 2 :
                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:25: folder_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_folder_prop_name_in_folder_props1025);
                    folder_prop_name82=folder_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, folder_prop_name82.getTree());
                    ATTRIBUITION83=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_folder_props1027); 
                    ATTRIBUITION83_tree = (Object)adaptor.create(ATTRIBUITION83);
                    adaptor.addChild(root_0, ATTRIBUITION83_tree);

                    // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:55: ( value | expression )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NUMBER||LA18_0==NAME||LA18_0==STRING_LITERAL) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==EXPRESSION) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:56: value
                            {
                            pushFollow(FOLLOW_value_in_folder_props1030);
                            value84=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value84.getTree());

                            }
                            break;
                        case 2 :
                            // /media/drive/dev/java/workspaces/wind-rap/wind_terra/src/TerraParser.g:261:62: expression
                            {
                            pushFollow(FOLLOW_expression_in_folder_props1032);
                            expression85=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression85.getTree());

                            }
                            break;

                    }


                        IConverterService convService = ServiceProvider.getInstance()
                            .getService(IConverterService.class,
                                Activator.getDefault().getBundleContext());
                                
                        Class<?> type = PropertyInfo.getPropertyInfo((folder_prop_name82!=null?input.toString(folder_prop_name82.start,folder_prop_name82.stop):null)).getType();
                        Object propValue = convService.convert(type, (value84!=null?input.toString(value84.start,value84.stop):null));
                        
                        Property p = new Property((folder_prop_name82!=null?input.toString(folder_prop_name82.start,folder_prop_name82.stop):null), propValue);
                        p.setExpression((expression85!=null?input.toString(expression85.start,expression85.stop):null));
                        folder_props.put((folder_prop_name82!=null?input.toString(folder_prop_name82.start,folder_prop_name82.stop):null), p);


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
    // $ANTLR end "folder_props"

    // Delegated rules


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object592 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object596 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object601 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object603 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object605 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object607 = new BitSet(new long[]{0x0000020103208100L});
    public static final BitSet FOLLOW_body_in_domain_object609 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration624 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration626 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration628 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration643 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration645 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration647 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_attr_in_body665 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_operation_in_body669 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_validation_rulz_in_body673 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_obj_property_in_body677 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_folder_in_body681 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_NEWLINE_in_body685 = new BitSet(new long[]{0x0000020103208002L});
    public static final BitSet FOLLOW_OBJECT_PROPERTY_in_obj_property694 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_obj_property696 = new BitSet(new long[]{0x0000001520000000L});
    public static final BitSet FOLLOW_value_in_obj_property699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_obj_property701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_attr717 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_attr721 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr723 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr725 = new BitSet(new long[]{0x00000200000D0000L});
    public static final BitSet FOLLOW_attr_body_in_attr727 = new BitSet(new long[]{0x00000200000D0100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_attr_body743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prstn_type_in_attr_body753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRESENTATION_TYPE_in_prstn_type762 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_prstn_type764 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SUPPORTED_PRESENTATION_TYPES_in_prstn_type766 = new BitSet(new long[]{0x0000080000000202L});
    public static final BitSet FOLLOW_43_in_prstn_type768 = new BitSet(new long[]{0x0000080000000202L});
    public static final BitSet FOLLOW_array_in_prstn_type771 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_attr_prop_name_in_property784 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property786 = new BitSet(new long[]{0x0000001520000200L});
    public static final BitSet FOLLOW_value_in_property789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_property793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_array843 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_validValue_in_array845 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_44_in_array848 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_validValue_in_array850 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_array854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validValue864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation873 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation875 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_operation877 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation879 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation881 = new BitSet(new long[]{0x0000020000940000L});
    public static final BitSet FOLLOW_op_body_in_operation883 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body897 = new BitSet(new long[]{0x0000020000940002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop909 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop911 = new BitSet(new long[]{0x0000000520000000L});
    public static final BitSet FOLLOW_value_in_op_prop913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz942 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz944 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz946 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz948 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body959 = new BitSet(new long[]{0x0000020400000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry971 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry973 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOLDER_in_folder984 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NAME_in_folder986 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_folder988 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_folder990 = new BitSet(new long[]{0x0000020000C00000L});
    public static final BitSet FOLLOW_folder_body_in_folder992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_folder994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_folder_props_in_folder_body1003 = new BitSet(new long[]{0x0000020000C00002L});
    public static final BitSet FOLLOW_set_in_folder_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_folder_props1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_folder_prop_name_in_folder_props1025 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_folder_props1027 = new BitSet(new long[]{0x0000001520000000L});
    public static final BitSet FOLLOW_value_in_folder_props1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_folder_props1032 = new BitSet(new long[]{0x0000000000000002L});

}
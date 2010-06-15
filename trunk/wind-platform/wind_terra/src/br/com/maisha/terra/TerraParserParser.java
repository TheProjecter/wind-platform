// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g 2010-06-15 11:28:49
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "VALIDATION_RULE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "TYPE2", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
    public static final int DOMAIN_OBJECT=10;
    public static final int PACKAGE=11;
    public static final int INTEGER=19;
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
    public static final int SPACE=30;
    public static final int EOF=-1;
    public static final int RIGHT_PAREN=6;
    public static final int NAME=24;
    public static final int IMPORT=12;
    public static final int STRING_LITERAL=26;
    public static final int NEWLINE=33;
    public static final int NONCONTROL_CHAR=25;
    public static final int PROPERTY=14;
    public static final int ASSIGN=4;
    public static final int RIGHT_BRACKET=8;
    public static final int LEFT_PAREN=5;
    public static final int TYPE2=27;
    public static final int LOWER=31;
    public static final int DIGIT=23;
    public static final int OPERATION=17;
    public static final int EXPRESSION=28;
    public static final int OP_TYPE=18;
    public static final int UPPER=32;

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
    private List<Import> imports = new ArrayList<Import>();
    private List<Validation> validationRulz = new ArrayList<Validation>();
    private List<ValidationRule> validationRulzEntry = new ArrayList<ValidationRule>();


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:84:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:4: ( package_declaration )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object464);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:27: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object468);
            	    import_declaration2=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT3=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object473); 
            DOMAIN_OBJECT3_tree = (Object)adaptor.create(DOMAIN_OBJECT3);
            adaptor.addChild(root_0, DOMAIN_OBJECT3_tree);

            NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object475); 
            NAME4_tree = (Object)adaptor.create(NAME4);
            adaptor.addChild(root_0, NAME4_tree);

            STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object477); 
            STRING_LITERAL5_tree = (Object)adaptor.create(STRING_LITERAL5);
            adaptor.addChild(root_0, STRING_LITERAL5_tree);

            LEFT_BRACKET6=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object479); 
            LEFT_BRACKET6_tree = (Object)adaptor.create(LEFT_BRACKET6);
            adaptor.addChild(root_0, LEFT_BRACKET6_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VALIDATION_RULE||LA2_0==OPERATION||LA2_0==NAME||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:85:96: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object481);
                    body7=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body7.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET8=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object484); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:98:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:2: ( PACKAGE NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration496); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration498); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:17: ( NEWLINE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:99:17: NEWLINE
            	    {
            	    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_package_declaration500); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:105:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:106:2: ( IMPORT NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:106:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration515); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration517); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:106:16: ( NEWLINE )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:106:16: NEWLINE
            	    {
            	    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration519); 
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:1: body : ( attr | operation | validation_rulz | NEWLINE )+ ;
    public final TerraParserParser.body_return body() throws RecognitionException {
        TerraParserParser.body_return retval = new TerraParserParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE18=null;
        TerraParserParser.attr_return attr15 = null;

        TerraParserParser.operation_return operation16 = null;

        TerraParserParser.validation_rulz_return validation_rulz17 = null;


        Object NEWLINE18_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:6: ( ( attr | operation | validation_rulz | NEWLINE )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:11: ( attr | operation | validation_rulz | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:11: ( attr | operation | validation_rulz | NEWLINE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
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
                case NEWLINE:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body537);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body541);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:31: validation_rulz
            	    {
            	    pushFollow(FOLLOW_validation_rulz_in_body545);
            	    validation_rulz17=validation_rulz();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_rulz17.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:112:49: NEWLINE
            	    {
            	    NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_body549); 
            	    NEWLINE18_tree = (Object)adaptor.create(NEWLINE18);
            	    adaptor.addChild(root_0, NEWLINE18_tree);


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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:1: attr : type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParserParser.attr_return attr() throws RecognitionException {
        TerraParserParser.attr_return retval = new TerraParserParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token type=null;
        Token ref=null;
        Token STRING_LITERAL19=null;
        Token LEFT_BRACKET20=null;
        Token RIGHT_BRACKET22=null;
        TerraParserParser.attr_body_return attr_body21 = null;


        Object type_tree=null;
        Object ref_tree=null;
        Object STRING_LITERAL19_tree=null;
        Object LEFT_BRACKET20_tree=null;
        Object RIGHT_BRACKET22_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:6: (type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:115:10: type= NAME ref= NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            type=(Token)match(input,NAME,FOLLOW_NAME_in_attr564); 
            type_tree = (Object)adaptor.create(type);
            adaptor.addChild(root_0, type_tree);

            ref=(Token)match(input,NAME,FOLLOW_NAME_in_attr568); 
            ref_tree = (Object)adaptor.create(ref);
            adaptor.addChild(root_0, ref_tree);

            STRING_LITERAL19=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr570); 
            STRING_LITERAL19_tree = (Object)adaptor.create(STRING_LITERAL19);
            adaptor.addChild(root_0, STRING_LITERAL19_tree);

            LEFT_BRACKET20=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr572); 
            LEFT_BRACKET20_tree = (Object)adaptor.create(LEFT_BRACKET20);
            adaptor.addChild(root_0, LEFT_BRACKET20_tree);

            pushFollow(FOLLOW_attr_body_in_attr574);
            attr_body21=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body21.getTree());
            RIGHT_BRACKET22=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr576); 
            RIGHT_BRACKET22_tree = (Object)adaptor.create(RIGHT_BRACKET22);
            adaptor.addChild(root_0, RIGHT_BRACKET22_tree);


            		Attribute att = new Attribute((type!=null?type.getText():null), (ref!=null?ref.getText():null), (STRING_LITERAL19!=null?STRING_LITERAL19.getText():null));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:127:1: attr_body : ( property )+ ;
    public final TerraParserParser.attr_body_return attr_body() throws RecognitionException {
        TerraParserParser.attr_body_return retval = new TerraParserParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.property_return property23 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:127:11: ( ( property )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:127:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:127:14: ( property )+
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
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:127:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body591);
            	    property23=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property23.getTree());

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParserParser.property_return property() throws RecognitionException {
        TerraParserParser.property_return retval = new TerraParserParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE24=null;
        Token ATTRIBUITION26=null;
        TerraParserParser.attr_prop_name_return attr_prop_name25 = null;

        TerraParserParser.value_return value27 = null;

        TerraParserParser.expression_return expression28 = null;


        Object NEWLINE24_tree=null;
        Object ATTRIBUITION26_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) )
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
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property599); 
                    NEWLINE24_tree = (Object)adaptor.create(NEWLINE24);
                    adaptor.addChild(root_0, NEWLINE24_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:21: attr_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property603);
                    attr_prop_name25=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name25.getTree());
                    ATTRIBUITION26=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property605); 
                    ATTRIBUITION26_tree = (Object)adaptor.create(ATTRIBUITION26);
                    adaptor.addChild(root_0, ATTRIBUITION26_tree);

                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:49: ( value | expression )
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
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:50: value
                            {
                            pushFollow(FOLLOW_value_in_property608);
                            value27=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value27.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:129:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property610);
                            expression28=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression28.getTree());

                            }
                            break;

                    }


                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name25!=null?input.toString(attr_prop_name25.start,attr_prop_name25.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value27!=null?input.toString(value27.start,value27.stop):null));
                    		
                    		Property p = new Property((attr_prop_name25!=null?input.toString(attr_prop_name25.start,attr_prop_name25.stop):null), propValue);
                    		p.setExpression((expression28!=null?input.toString(expression28.start,expression28.stop):null));
                    		props.put((attr_prop_name25!=null?input.toString(attr_prop_name25.start,attr_prop_name25.stop):null), p);
                    	

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:142:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParserParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParserParser.attr_prop_name_return retval = new TerraParserParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set29=null;

        Object set29_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:142:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set29));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:143:1: value : ( NUMBER | NAME ) ;
    public final TerraParserParser.value_return value() throws RecognitionException {
        TerraParserParser.value_return retval = new TerraParserParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:143:7: ( ( NUMBER | NAME ) )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:143:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set30=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
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
    // $ANTLR end "value"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:144:1: expression : EXPRESSION ;
    public final TerraParserParser.expression_return expression() throws RecognitionException {
        TerraParserParser.expression_return retval = new TerraParserParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION31=null;

        Object EXPRESSION31_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:145:2: ( EXPRESSION )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:145:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION31=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression644); 
            EXPRESSION31_tree = (Object)adaptor.create(EXPRESSION31);
            adaptor.addChild(root_0, EXPRESSION31_tree);


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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:148:1: operation : OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET ;
    public final TerraParserParser.operation_return operation() throws RecognitionException {
        TerraParserParser.operation_return retval = new TerraParserParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATION32=null;
        Token OP_TYPE33=null;
        Token NAME34=null;
        Token STRING_LITERAL35=null;
        Token LEFT_BRACKET36=null;
        Token RIGHT_BRACKET38=null;
        TerraParserParser.op_body_return op_body37 = null;


        Object OPERATION32_tree=null;
        Object OP_TYPE33_tree=null;
        Object NAME34_tree=null;
        Object STRING_LITERAL35_tree=null;
        Object LEFT_BRACKET36_tree=null;
        Object RIGHT_BRACKET38_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:148:10: ( OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:148:13: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPERATION32=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation653); 
            OPERATION32_tree = (Object)adaptor.create(OPERATION32);
            adaptor.addChild(root_0, OPERATION32_tree);

            OP_TYPE33=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation655); 
            OP_TYPE33_tree = (Object)adaptor.create(OP_TYPE33);
            adaptor.addChild(root_0, OP_TYPE33_tree);

            NAME34=(Token)match(input,NAME,FOLLOW_NAME_in_operation657); 
            NAME34_tree = (Object)adaptor.create(NAME34);
            adaptor.addChild(root_0, NAME34_tree);

            STRING_LITERAL35=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation659); 
            STRING_LITERAL35_tree = (Object)adaptor.create(STRING_LITERAL35);
            adaptor.addChild(root_0, STRING_LITERAL35_tree);

            LEFT_BRACKET36=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation661); 
            LEFT_BRACKET36_tree = (Object)adaptor.create(LEFT_BRACKET36);
            adaptor.addChild(root_0, LEFT_BRACKET36_tree);

            pushFollow(FOLLOW_op_body_in_operation663);
            op_body37=op_body();

            state._fsp--;

            adaptor.addChild(root_0, op_body37.getTree());
            RIGHT_BRACKET38=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation665); 
            RIGHT_BRACKET38_tree = (Object)adaptor.create(RIGHT_BRACKET38);
            adaptor.addChild(root_0, RIGHT_BRACKET38_tree);


            		Operation op = new Operation((OP_TYPE33!=null?OP_TYPE33.getText():null), (NAME34!=null?NAME34.getText():null), (STRING_LITERAL35!=null?STRING_LITERAL35.getText():null));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:157:1: op_body : ( op_prop )+ ;
    public final TerraParserParser.op_body_return op_body() throws RecognitionException {
        TerraParserParser.op_body_return retval = new TerraParserParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.op_prop_return op_prop39 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:157:9: ( ( op_prop )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:157:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:157:11: ( op_prop )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==PROPERTY||LA9_0==OPERATION_PROPERTY||LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:157:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body677);
            	    op_prop39=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop39.getTree());

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParserParser.op_prop_return op_prop() throws RecognitionException {
        TerraParserParser.op_prop_return retval = new TerraParserParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE40=null;
        Token ATTRIBUITION42=null;
        TerraParserParser.op_prop_name_return op_prop_name41 = null;

        TerraParserParser.value_return value43 = null;


        Object NEWLINE40_tree=null;
        Object ATTRIBUITION42_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE) ) {
                alt10=1;
            }
            else if ( (LA10_0==PROPERTY||LA10_0==OPERATION_PROPERTY) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop685); 
                    NEWLINE40_tree = (Object)adaptor.create(NEWLINE40);
                    adaptor.addChild(root_0, NEWLINE40_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:159:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop689);
                    op_prop_name41=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name41.getTree());
                    ATTRIBUITION42=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop691); 
                    ATTRIBUITION42_tree = (Object)adaptor.create(ATTRIBUITION42);
                    adaptor.addChild(root_0, ATTRIBUITION42_tree);

                    pushFollow(FOLLOW_value_in_op_prop693);
                    value43=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value43.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name41!=null?input.toString(op_prop_name41.start,op_prop_name41.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value43!=null?input.toString(value43.start,value43.stop):null));
                    		
                    		Property p = new Property((op_prop_name41!=null?input.toString(op_prop_name41.start,op_prop_name41.stop):null), propValue);
                    		op_props.put((op_prop_name41!=null?input.toString(op_prop_name41.start,op_prop_name41.stop):null), p);
                    	

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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:172:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParserParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParserParser.op_prop_name_return retval = new TerraParserParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;

        Object set44_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:172:14: ( PROPERTY | OPERATION_PROPERTY )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set44=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set44));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:175:1: validation_rulz : VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET ;
    public final TerraParserParser.validation_rulz_return validation_rulz() throws RecognitionException {
        TerraParserParser.validation_rulz_return retval = new TerraParserParser.validation_rulz_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VALIDATION_RULE45=null;
        Token NAME46=null;
        Token LEFT_BRACKET47=null;
        Token RIGHT_BRACKET49=null;
        TerraParserParser.validation_body_return validation_body48 = null;


        Object VALIDATION_RULE45_tree=null;
        Object NAME46_tree=null;
        Object LEFT_BRACKET47_tree=null;
        Object RIGHT_BRACKET49_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:175:16: ( VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:175:19: VALIDATION_RULE NAME LEFT_BRACKET validation_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            VALIDATION_RULE45=(Token)match(input,VALIDATION_RULE,FOLLOW_VALIDATION_RULE_in_validation_rulz718); 
            VALIDATION_RULE45_tree = (Object)adaptor.create(VALIDATION_RULE45);
            adaptor.addChild(root_0, VALIDATION_RULE45_tree);

            NAME46=(Token)match(input,NAME,FOLLOW_NAME_in_validation_rulz720); 
            NAME46_tree = (Object)adaptor.create(NAME46);
            adaptor.addChild(root_0, NAME46_tree);

            LEFT_BRACKET47=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_validation_rulz722); 
            LEFT_BRACKET47_tree = (Object)adaptor.create(LEFT_BRACKET47);
            adaptor.addChild(root_0, LEFT_BRACKET47_tree);

            pushFollow(FOLLOW_validation_body_in_validation_rulz724);
            validation_body48=validation_body();

            state._fsp--;

            adaptor.addChild(root_0, validation_body48.getTree());
            RIGHT_BRACKET49=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_validation_rulz726); 
            RIGHT_BRACKET49_tree = (Object)adaptor.create(RIGHT_BRACKET49);
            adaptor.addChild(root_0, RIGHT_BRACKET49_tree);


            		Validation validation = new Validation((NAME46!=null?NAME46.getText():null));
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
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:182:1: validation_body : ( validation_entry )+ ;
    public final TerraParserParser.validation_body_return validation_body() throws RecognitionException {
        TerraParserParser.validation_body_return retval = new TerraParserParser.validation_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParserParser.validation_entry_return validation_entry50 = null;



        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:182:17: ( ( validation_entry )+ )
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:182:19: ( validation_entry )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:182:19: ( validation_entry )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==STRING_LITERAL||LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:182:19: validation_entry
            	    {
            	    pushFollow(FOLLOW_validation_entry_in_validation_body735);
            	    validation_entry50=validation_entry();

            	    state._fsp--;

            	    adaptor.addChild(root_0, validation_entry50.getTree());

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
    // $ANTLR end "validation_body"

    public static class validation_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validation_entry"
    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:184:1: validation_entry : ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION );
    public final TerraParserParser.validation_entry_return validation_entry() throws RecognitionException {
        TerraParserParser.validation_entry_return retval = new TerraParserParser.validation_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE51=null;
        Token STRING_LITERAL52=null;
        Token ATTRIBUITION53=null;
        Token EXPRESSION54=null;

        Object NEWLINE51_tree=null;
        Object STRING_LITERAL52_tree=null;
        Object ATTRIBUITION53_tree=null;
        Object EXPRESSION54_tree=null;

        try {
            // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:184:17: ( NEWLINE | STRING_LITERAL ATTRIBUITION EXPRESSION )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==STRING_LITERAL) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:184:19: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_validation_entry743); 
                    NEWLINE51_tree = (Object)adaptor.create(NEWLINE51);
                    adaptor.addChild(root_0, NEWLINE51_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\paulo.freitas\\Desktop\\terra\\TerraParser.g:184:29: STRING_LITERAL ATTRIBUITION EXPRESSION
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING_LITERAL52=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_validation_entry747); 
                    STRING_LITERAL52_tree = (Object)adaptor.create(STRING_LITERAL52);
                    adaptor.addChild(root_0, STRING_LITERAL52_tree);

                    ATTRIBUITION53=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_validation_entry749); 
                    ATTRIBUITION53_tree = (Object)adaptor.create(ATTRIBUITION53);
                    adaptor.addChild(root_0, ATTRIBUITION53_tree);

                    EXPRESSION54=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_validation_entry751); 
                    EXPRESSION54_tree = (Object)adaptor.create(EXPRESSION54);
                    adaptor.addChild(root_0, EXPRESSION54_tree);


                    		ValidationRule valRule = new ValidationRule((STRING_LITERAL52!=null?STRING_LITERAL52.getText():null), (EXPRESSION54!=null?EXPRESSION54.getText():null));
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


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object464 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object468 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object475 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object477 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object479 = new BitSet(new long[]{0x0000000201022100L});
    public static final BitSet FOLLOW_body_in_domain_object481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration496 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration498 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration500 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration515 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration517 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration519 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_attr_in_body537 = new BitSet(new long[]{0x0000000201022002L});
    public static final BitSet FOLLOW_operation_in_body541 = new BitSet(new long[]{0x0000000201022002L});
    public static final BitSet FOLLOW_validation_rulz_in_body545 = new BitSet(new long[]{0x0000000201022002L});
    public static final BitSet FOLLOW_NEWLINE_in_body549 = new BitSet(new long[]{0x0000000201022002L});
    public static final BitSet FOLLOW_NAME_in_attr564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_attr568 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr570 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr572 = new BitSet(new long[]{0x000000020000C000L});
    public static final BitSet FOLLOW_attr_body_in_attr574 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body591 = new BitSet(new long[]{0x000000020000C002L});
    public static final BitSet FOLLOW_NEWLINE_in_property599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property603 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property605 = new BitSet(new long[]{0x0000000011200000L});
    public static final BitSet FOLLOW_value_in_property608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation653 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation655 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_operation657 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation659 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation661 = new BitSet(new long[]{0x0000000200014000L});
    public static final BitSet FOLLOW_op_body_in_operation663 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body677 = new BitSet(new long[]{0x0000000200014002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop689 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop691 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_value_in_op_prop693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATION_RULE_in_validation_rulz718 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_validation_rulz720 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_validation_rulz722 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_validation_body_in_validation_rulz724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_validation_rulz726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validation_entry_in_validation_body735 = new BitSet(new long[]{0x0000000204000002L});
    public static final BitSet FOLLOW_NEWLINE_in_validation_entry743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_validation_entry747 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_validation_entry749 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EXPRESSION_in_validation_entry751 = new BitSet(new long[]{0x0000000000000002L});

}
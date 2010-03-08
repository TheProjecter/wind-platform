// $ANTLR 3.1.2 /home/paulofreitas/Desktop/lang/TerraParser.g 2010-03-05 21:17:22
 
package br.com.maisha.terra; 
import java.util.HashMap;
import java.util.Map;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "PACKAGE", "IMPORT", "TYPE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "EXPRESSION", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
    public static final int INTEGER=19;
    public static final int PACKAGE=11;
    public static final int DOMAIN_OBJECT=10;
    public static final int SYMBOL=28;
    public static final int LETTER=22;
    public static final int ATTRIBUTE_PROPERTY=15;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=21;
    public static final int WHITESPACE=33;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=20;
    public static final int OPERATION_PROPERTY=16;
    public static final int EOF=-1;
    public static final int SPACE=29;
    public static final int TYPE=13;
    public static final int RIGHT_PAREN=6;
    public static final int IMPORT=12;
    public static final int NAME=24;
    public static final int STRING_LITERAL=26;
    public static final int NEWLINE=32;
    public static final int NONCONTROL_CHAR=25;
    public static final int PROPERTY=14;
    public static final int RIGHT_BRACKET=8;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int DIGIT=23;
    public static final int LOWER=30;
    public static final int OPERATION=17;
    public static final int EXPRESSION=27;
    public static final int OP_TYPE=18;
    public static final int UPPER=31;

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


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // /home/paulofreitas/Desktop/lang/TerraParser.g:38:1: domain_object : ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:2: ( ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:4: ( package_declaration ) ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:4: ( package_declaration )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:5: package_declaration
            {
            pushFollow(FOLLOW_package_declaration_in_domain_object58);
            package_declaration1=package_declaration();

            state._fsp--;

            adaptor.addChild(root_0, package_declaration1.getTree());

            }

            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:26: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:39:27: import_declaration
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

            // /home/paulofreitas/Desktop/lang/TerraParser.g:39:96: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE||LA2_0==OPERATION||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:39:96: body
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
            		atts = new ArrayList<Attribute>();
            		ops = new ArrayList<Operation>();
            	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:50:1: package_declaration : PACKAGE NAME ( NEWLINE )+ ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:51:2: ( PACKAGE NAME ( NEWLINE )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:51:4: PACKAGE NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            PACKAGE9=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_package_declaration90); 
            PACKAGE9_tree = (Object)adaptor.create(PACKAGE9);
            adaptor.addChild(root_0, PACKAGE9_tree);

            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_package_declaration92); 
            NAME10_tree = (Object)adaptor.create(NAME10);
            adaptor.addChild(root_0, NAME10_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:51:17: ( NEWLINE )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:51:17: NEWLINE
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:57:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // /home/paulofreitas/Desktop/lang/TerraParser.g:58:2: ( IMPORT NAME ( NEWLINE )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:58:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration109); 
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            adaptor.addChild(root_0, IMPORT12_tree);

            NAME13=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration111); 
            NAME13_tree = (Object)adaptor.create(NAME13);
            adaptor.addChild(root_0, NAME13_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:58:16: ( NEWLINE )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:58:16: NEWLINE
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:64:1: body : ( attr | operation )+ ;
    public final TerraParser.body_return body() throws RecognitionException {
        TerraParser.body_return retval = new TerraParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.attr_return attr15 = null;

        TerraParser.operation_return operation16 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:6: ( ( attr | operation )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:11: ( attr | operation )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:64:11: ( attr | operation )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TYPE) ) {
                    alt5=1;
                }
                else if ( (LA5_0==OPERATION||LA5_0==NEWLINE) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:64:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body131);
            	    attr15=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:64:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body135);
            	    operation16=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation16.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:66:1: attr : TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParser.attr_return attr() throws RecognitionException {
        TerraParser.attr_return retval = new TerraParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE17=null;
        Token NAME18=null;
        Token STRING_LITERAL19=null;
        Token LEFT_BRACKET20=null;
        Token RIGHT_BRACKET22=null;
        TerraParser.attr_body_return attr_body21 = null;


        Object TYPE17_tree=null;
        Object NAME18_tree=null;
        Object STRING_LITERAL19_tree=null;
        Object LEFT_BRACKET20_tree=null;
        Object RIGHT_BRACKET22_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:66:6: ( TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:66:10: TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            TYPE17=(Token)match(input,TYPE,FOLLOW_TYPE_in_attr147); 
            TYPE17_tree = (Object)adaptor.create(TYPE17);
            adaptor.addChild(root_0, TYPE17_tree);

            NAME18=(Token)match(input,NAME,FOLLOW_NAME_in_attr149); 
            NAME18_tree = (Object)adaptor.create(NAME18);
            adaptor.addChild(root_0, NAME18_tree);

            STRING_LITERAL19=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr151); 
            STRING_LITERAL19_tree = (Object)adaptor.create(STRING_LITERAL19);
            adaptor.addChild(root_0, STRING_LITERAL19_tree);

            LEFT_BRACKET20=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr153); 
            LEFT_BRACKET20_tree = (Object)adaptor.create(LEFT_BRACKET20);
            adaptor.addChild(root_0, LEFT_BRACKET20_tree);

            pushFollow(FOLLOW_attr_body_in_attr155);
            attr_body21=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body21.getTree());
            RIGHT_BRACKET22=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr157); 
            RIGHT_BRACKET22_tree = (Object)adaptor.create(RIGHT_BRACKET22);
            adaptor.addChild(root_0, RIGHT_BRACKET22_tree);


            		Attribute att = new Attribute((TYPE17!=null?TYPE17.getText():null), (NAME18!=null?NAME18.getText():null), (STRING_LITERAL19!=null?STRING_LITERAL19.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:76:1: attr_body : ( property )+ ;
    public final TerraParser.attr_body_return attr_body() throws RecognitionException {
        TerraParser.attr_body_return retval = new TerraParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.property_return property23 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:76:11: ( ( property )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:76:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:76:14: ( property )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:76:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body170);
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:78:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) );
    public final TerraParser.property_return property() throws RecognitionException {
        TerraParser.property_return retval = new TerraParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE24=null;
        Token ATTRIBUITION26=null;
        TerraParser.attr_prop_name_return attr_prop_name25 = null;

        TerraParser.value_return value27 = null;

        TerraParser.expression_return expression28 = null;


        Object NEWLINE24_tree=null;
        Object ATTRIBUITION26_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:78:9: ( NEWLINE | attr_prop_name ATTRIBUITION ( value | expression ) )
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
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:78:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property178); 
                    NEWLINE24_tree = (Object)adaptor.create(NEWLINE24);
                    adaptor.addChild(root_0, NEWLINE24_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:78:21: attr_prop_name ATTRIBUITION ( value | expression )
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property182);
                    attr_prop_name25=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name25.getTree());
                    ATTRIBUITION26=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property184); 
                    ATTRIBUITION26_tree = (Object)adaptor.create(ATTRIBUITION26);
                    adaptor.addChild(root_0, ATTRIBUITION26_tree);

                    // /home/paulofreitas/Desktop/lang/TerraParser.g:78:49: ( value | expression )
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
                            // /home/paulofreitas/Desktop/lang/TerraParser.g:78:50: value
                            {
                            pushFollow(FOLLOW_value_in_property187);
                            value27=value();

                            state._fsp--;

                            adaptor.addChild(root_0, value27.getTree());

                            }
                            break;
                        case 2 :
                            // /home/paulofreitas/Desktop/lang/TerraParser.g:78:56: expression
                            {
                            pushFollow(FOLLOW_expression_in_property189);
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:91:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParser.attr_prop_name_return retval = new TerraParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set29=null;

        Object set29_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:91:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:92:1: value : ( NUMBER | NAME ) ;
    public final TerraParser.value_return value() throws RecognitionException {
        TerraParser.value_return retval = new TerraParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:92:7: ( ( NUMBER | NAME ) )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:92:9: ( NUMBER | NAME )
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:93:1: expression : EXPRESSION ;
    public final TerraParser.expression_return expression() throws RecognitionException {
        TerraParser.expression_return retval = new TerraParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXPRESSION31=null;

        Object EXPRESSION31_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:94:2: ( EXPRESSION )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:94:4: EXPRESSION
            {
            root_0 = (Object)adaptor.nil();

            EXPRESSION31=(Token)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression223); 
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:97:1: operation : ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET );
    public final TerraParser.operation_return operation() throws RecognitionException {
        TerraParser.operation_return retval = new TerraParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE32=null;
        Token OPERATION33=null;
        Token OP_TYPE34=null;
        Token NAME35=null;
        Token STRING_LITERAL36=null;
        Token LEFT_BRACKET37=null;
        Token RIGHT_BRACKET39=null;
        TerraParser.op_body_return op_body38 = null;


        Object NEWLINE32_tree=null;
        Object OPERATION33_tree=null;
        Object OP_TYPE34_tree=null;
        Object NAME35_tree=null;
        Object STRING_LITERAL36_tree=null;
        Object LEFT_BRACKET37_tree=null;
        Object RIGHT_BRACKET39_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:97:10: ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
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
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:97:13: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_operation232); 
                    NEWLINE32_tree = (Object)adaptor.create(NEWLINE32);
                    adaptor.addChild(root_0, NEWLINE32_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:97:23: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    OPERATION33=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation236); 
                    OPERATION33_tree = (Object)adaptor.create(OPERATION33);
                    adaptor.addChild(root_0, OPERATION33_tree);

                    OP_TYPE34=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation238); 
                    OP_TYPE34_tree = (Object)adaptor.create(OP_TYPE34);
                    adaptor.addChild(root_0, OP_TYPE34_tree);

                    NAME35=(Token)match(input,NAME,FOLLOW_NAME_in_operation240); 
                    NAME35_tree = (Object)adaptor.create(NAME35);
                    adaptor.addChild(root_0, NAME35_tree);

                    STRING_LITERAL36=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation242); 
                    STRING_LITERAL36_tree = (Object)adaptor.create(STRING_LITERAL36);
                    adaptor.addChild(root_0, STRING_LITERAL36_tree);

                    LEFT_BRACKET37=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation244); 
                    LEFT_BRACKET37_tree = (Object)adaptor.create(LEFT_BRACKET37);
                    adaptor.addChild(root_0, LEFT_BRACKET37_tree);

                    pushFollow(FOLLOW_op_body_in_operation246);
                    op_body38=op_body();

                    state._fsp--;

                    adaptor.addChild(root_0, op_body38.getTree());
                    RIGHT_BRACKET39=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation248); 
                    RIGHT_BRACKET39_tree = (Object)adaptor.create(RIGHT_BRACKET39);
                    adaptor.addChild(root_0, RIGHT_BRACKET39_tree);


                    		Operation op = new Operation((OP_TYPE34!=null?OP_TYPE34.getText():null), (NAME35!=null?NAME35.getText():null), (STRING_LITERAL36!=null?STRING_LITERAL36.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:106:1: op_body : ( op_prop )+ ;
    public final TerraParser.op_body_return op_body() throws RecognitionException {
        TerraParser.op_body_return retval = new TerraParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.op_prop_return op_prop40 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:106:9: ( ( op_prop )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:106:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:106:11: ( op_prop )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:106:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body260);
            	    op_prop40=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop40.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:108:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParser.op_prop_return op_prop() throws RecognitionException {
        TerraParser.op_prop_return retval = new TerraParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE41=null;
        Token ATTRIBUITION43=null;
        TerraParser.op_prop_name_return op_prop_name42 = null;

        TerraParser.value_return value44 = null;


        Object NEWLINE41_tree=null;
        Object ATTRIBUITION43_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:108:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
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
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:108:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop268); 
                    NEWLINE41_tree = (Object)adaptor.create(NEWLINE41);
                    adaptor.addChild(root_0, NEWLINE41_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:108:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop272);
                    op_prop_name42=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name42.getTree());
                    ATTRIBUITION43=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop274); 
                    ATTRIBUITION43_tree = (Object)adaptor.create(ATTRIBUITION43);
                    adaptor.addChild(root_0, ATTRIBUITION43_tree);

                    pushFollow(FOLLOW_value_in_op_prop276);
                    value44=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value44.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name42!=null?input.toString(op_prop_name42.start,op_prop_name42.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value44!=null?input.toString(value44.start,value44.stop):null));
                    		
                    		Property p = new Property((op_prop_name42!=null?input.toString(op_prop_name42.start,op_prop_name42.stop):null), propValue);
                    		op_props.put((op_prop_name42!=null?input.toString(op_prop_name42.start,op_prop_name42.stop):null), p);
                    	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:121:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParser.op_prop_name_return retval = new TerraParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:121:14: ( PROPERTY | OPERATION_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set45));
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

    // Delegated rules


 

    public static final BitSet FOLLOW_package_declaration_in_domain_object58 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_import_declaration_in_domain_object62 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object67 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_domain_object69 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object73 = new BitSet(new long[]{0x0000000100022100L});
    public static final BitSet FOLLOW_body_in_domain_object75 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_declaration90 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_package_declaration92 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_package_declaration94 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration109 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration111 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration113 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_attr_in_body131 = new BitSet(new long[]{0x0000000100022002L});
    public static final BitSet FOLLOW_operation_in_body135 = new BitSet(new long[]{0x0000000100022002L});
    public static final BitSet FOLLOW_TYPE_in_attr147 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_attr149 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr151 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr153 = new BitSet(new long[]{0x000000010000C000L});
    public static final BitSet FOLLOW_attr_body_in_attr155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body170 = new BitSet(new long[]{0x000000010000C002L});
    public static final BitSet FOLLOW_NEWLINE_in_property178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property184 = new BitSet(new long[]{0x0000000009200000L});
    public static final BitSet FOLLOW_value_in_property187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_property189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_operation232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation236 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation238 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_NAME_in_operation240 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation242 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation244 = new BitSet(new long[]{0x0000000100014000L});
    public static final BitSet FOLLOW_op_body_in_operation246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body260 = new BitSet(new long[]{0x0000000100014002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop274 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_value_in_op_prop276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});

}
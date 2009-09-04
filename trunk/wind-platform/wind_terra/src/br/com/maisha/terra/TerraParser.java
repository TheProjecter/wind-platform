// $ANTLR 3.1.2 /home/paulofreitas/Desktop/lang/TerraParser.g 2009-09-04 19:54:50
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "IMPORT", "TYPE", "PROPERTY", "ATTRIBUTE_PROPERTY", "OPERATION_PROPERTY", "OPERATION", "OP_TYPE", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
    public static final int INTEGER=18;
    public static final int DOMAIN_OBJECT=10;
    public static final int SYMBOL=26;
    public static final int LETTER=21;
    public static final int ATTRIBUTE_PROPERTY=14;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=20;
    public static final int WHITESPACE=31;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=19;
    public static final int OPERATION_PROPERTY=15;
    public static final int EOF=-1;
    public static final int SPACE=27;
    public static final int TYPE=12;
    public static final int RIGHT_PAREN=6;
    public static final int NAME=23;
    public static final int IMPORT=11;
    public static final int STRING_LITERAL=25;
    public static final int NEWLINE=30;
    public static final int NONCONTROL_CHAR=24;
    public static final int PROPERTY=13;
    public static final int RIGHT_BRACKET=8;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int DIGIT=22;
    public static final int LOWER=28;
    public static final int OPERATION=16;
    public static final int OP_TYPE=17;
    public static final int UPPER=29;

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:37:1: domain_object : ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET ;
    public final TerraParser.domain_object_return domain_object() throws RecognitionException {
        TerraParser.domain_object_return retval = new TerraParser.domain_object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOMAIN_OBJECT2=null;
        Token NAME3=null;
        Token STRING_LITERAL4=null;
        Token LEFT_BRACKET5=null;
        Token RIGHT_BRACKET7=null;
        TerraParser.import_declaration_return import_declaration1 = null;

        TerraParser.body_return body6 = null;


        Object DOMAIN_OBJECT2_tree=null;
        Object NAME3_tree=null;
        Object STRING_LITERAL4_tree=null;
        Object LEFT_BRACKET5_tree=null;
        Object RIGHT_BRACKET7_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:38:2: ( ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:38:4: ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET ( body )? RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:38:4: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:38:5: import_declaration
            	    {
            	    pushFollow(FOLLOW_import_declaration_in_domain_object58);
            	    import_declaration1=import_declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, import_declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            DOMAIN_OBJECT2=(Token)match(input,DOMAIN_OBJECT,FOLLOW_DOMAIN_OBJECT_in_domain_object63); 
            DOMAIN_OBJECT2_tree = (Object)adaptor.create(DOMAIN_OBJECT2);
            adaptor.addChild(root_0, DOMAIN_OBJECT2_tree);

            NAME3=(Token)match(input,NAME,FOLLOW_NAME_in_domain_object65); 
            NAME3_tree = (Object)adaptor.create(NAME3);
            adaptor.addChild(root_0, NAME3_tree);

            STRING_LITERAL4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_domain_object67); 
            STRING_LITERAL4_tree = (Object)adaptor.create(STRING_LITERAL4);
            adaptor.addChild(root_0, STRING_LITERAL4_tree);

            LEFT_BRACKET5=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_domain_object69); 
            LEFT_BRACKET5_tree = (Object)adaptor.create(LEFT_BRACKET5);
            adaptor.addChild(root_0, LEFT_BRACKET5_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:38:74: ( body )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==TYPE||LA2_0==OPERATION||LA2_0==NEWLINE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:38:74: body
                    {
                    pushFollow(FOLLOW_body_in_domain_object71);
                    body6=body();

                    state._fsp--;

                    adaptor.addChild(root_0, body6.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET7=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object74); 
            RIGHT_BRACKET7_tree = (Object)adaptor.create(RIGHT_BRACKET7);
            adaptor.addChild(root_0, RIGHT_BRACKET7_tree);


            		domainObject = new DomainObject((NAME3!=null?NAME3.getText():null), (STRING_LITERAL4!=null?STRING_LITERAL4.getText():null));
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

    public static class import_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_declaration"
    // /home/paulofreitas/Desktop/lang/TerraParser.g:48:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
    public final TerraParser.import_declaration_return import_declaration() throws RecognitionException {
        TerraParser.import_declaration_return retval = new TerraParser.import_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IMPORT8=null;
        Token NAME9=null;
        Token NEWLINE10=null;

        Object IMPORT8_tree=null;
        Object NAME9_tree=null;
        Object NEWLINE10_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:49:2: ( IMPORT NAME ( NEWLINE )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:49:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT8=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration87); 
            IMPORT8_tree = (Object)adaptor.create(IMPORT8);
            adaptor.addChild(root_0, IMPORT8_tree);

            NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration89); 
            NAME9_tree = (Object)adaptor.create(NAME9);
            adaptor.addChild(root_0, NAME9_tree);

            // /home/paulofreitas/Desktop/lang/TerraParser.g:49:16: ( NEWLINE )+
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
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:49:16: NEWLINE
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration91); 
            	    NEWLINE10_tree = (Object)adaptor.create(NEWLINE10);
            	    adaptor.addChild(root_0, NEWLINE10_tree);


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


            		imports.add(new Import((NAME9!=null?NAME9.getText():null)) );
            		
            	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:55:1: body : ( attr | operation )+ ;
    public final TerraParser.body_return body() throws RecognitionException {
        TerraParser.body_return retval = new TerraParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.attr_return attr11 = null;

        TerraParser.operation_return operation12 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:55:6: ( ( attr | operation )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:55:11: ( attr | operation )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:55:11: ( attr | operation )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==TYPE) ) {
                    alt4=1;
                }
                else if ( (LA4_0==OPERATION||LA4_0==NEWLINE) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:55:12: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body109);
            	    attr11=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr11.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:55:19: operation
            	    {
            	    pushFollow(FOLLOW_operation_in_body113);
            	    operation12=operation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operation12.getTree());

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:57:1: attr : TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET ;
    public final TerraParser.attr_return attr() throws RecognitionException {
        TerraParser.attr_return retval = new TerraParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE13=null;
        Token NAME14=null;
        Token STRING_LITERAL15=null;
        Token LEFT_BRACKET16=null;
        Token RIGHT_BRACKET18=null;
        TerraParser.attr_body_return attr_body17 = null;


        Object TYPE13_tree=null;
        Object NAME14_tree=null;
        Object STRING_LITERAL15_tree=null;
        Object LEFT_BRACKET16_tree=null;
        Object RIGHT_BRACKET18_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:57:6: ( TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:57:10: TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            TYPE13=(Token)match(input,TYPE,FOLLOW_TYPE_in_attr125); 
            TYPE13_tree = (Object)adaptor.create(TYPE13);
            adaptor.addChild(root_0, TYPE13_tree);

            NAME14=(Token)match(input,NAME,FOLLOW_NAME_in_attr127); 
            NAME14_tree = (Object)adaptor.create(NAME14);
            adaptor.addChild(root_0, NAME14_tree);

            STRING_LITERAL15=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr129); 
            STRING_LITERAL15_tree = (Object)adaptor.create(STRING_LITERAL15);
            adaptor.addChild(root_0, STRING_LITERAL15_tree);

            LEFT_BRACKET16=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr131); 
            LEFT_BRACKET16_tree = (Object)adaptor.create(LEFT_BRACKET16);
            adaptor.addChild(root_0, LEFT_BRACKET16_tree);

            pushFollow(FOLLOW_attr_body_in_attr133);
            attr_body17=attr_body();

            state._fsp--;

            adaptor.addChild(root_0, attr_body17.getTree());
            RIGHT_BRACKET18=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr135); 
            RIGHT_BRACKET18_tree = (Object)adaptor.create(RIGHT_BRACKET18);
            adaptor.addChild(root_0, RIGHT_BRACKET18_tree);


            		Attribute att = new Attribute((TYPE13!=null?TYPE13.getText():null), (NAME14!=null?NAME14.getText():null), (STRING_LITERAL15!=null?STRING_LITERAL15.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:66:1: attr_body : ( property )+ ;
    public final TerraParser.attr_body_return attr_body() throws RecognitionException {
        TerraParser.attr_body_return retval = new TerraParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.property_return property19 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:66:11: ( ( property )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:66:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:66:14: ( property )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=PROPERTY && LA5_0<=ATTRIBUTE_PROPERTY)||LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:66:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body148);
            	    property19=property();

            	    state._fsp--;

            	    adaptor.addChild(root_0, property19.getTree());

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
    // $ANTLR end "attr_body"

    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // /home/paulofreitas/Desktop/lang/TerraParser.g:68:1: property : ( NEWLINE | attr_prop_name ATTRIBUITION value );
    public final TerraParser.property_return property() throws RecognitionException {
        TerraParser.property_return retval = new TerraParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE20=null;
        Token ATTRIBUITION22=null;
        TerraParser.attr_prop_name_return attr_prop_name21 = null;

        TerraParser.value_return value23 = null;


        Object NEWLINE20_tree=null;
        Object ATTRIBUITION22_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:68:9: ( NEWLINE | attr_prop_name ATTRIBUITION value )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NEWLINE) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=PROPERTY && LA6_0<=ATTRIBUTE_PROPERTY)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:68:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property156); 
                    NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
                    adaptor.addChild(root_0, NEWLINE20_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:68:21: attr_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attr_prop_name_in_property160);
                    attr_prop_name21=attr_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_prop_name21.getTree());
                    ATTRIBUITION22=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property162); 
                    ATTRIBUITION22_tree = (Object)adaptor.create(ATTRIBUITION22);
                    adaptor.addChild(root_0, ATTRIBUITION22_tree);

                    pushFollow(FOLLOW_value_in_property164);
                    value23=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value23.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((attr_prop_name21!=null?input.toString(attr_prop_name21.start,attr_prop_name21.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value23!=null?input.toString(value23.start,value23.stop):null));
                    		
                    		Property p = new Property((attr_prop_name21!=null?input.toString(attr_prop_name21.start,attr_prop_name21.stop):null), propValue);
                    		props.put((attr_prop_name21!=null?input.toString(attr_prop_name21.start,attr_prop_name21.stop):null), p);
                    	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:80:1: attr_prop_name : ( PROPERTY | ATTRIBUTE_PROPERTY );
    public final TerraParser.attr_prop_name_return attr_prop_name() throws RecognitionException {
        TerraParser.attr_prop_name_return retval = new TerraParser.attr_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:80:15: ( PROPERTY | ATTRIBUTE_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set24=(Token)input.LT(1);
            if ( (input.LA(1)>=PROPERTY && input.LA(1)<=ATTRIBUTE_PROPERTY) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set24));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:81:1: value : ( NUMBER | NAME ) ;
    public final TerraParser.value_return value() throws RecognitionException {
        TerraParser.value_return retval = new TerraParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:81:7: ( ( NUMBER | NAME ) )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:81:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set25=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set25));
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

    public static class operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:1: operation : ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET );
    public final TerraParser.operation_return operation() throws RecognitionException {
        TerraParser.operation_return retval = new TerraParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE26=null;
        Token OPERATION27=null;
        Token OP_TYPE28=null;
        Token NAME29=null;
        Token STRING_LITERAL30=null;
        Token LEFT_BRACKET31=null;
        Token RIGHT_BRACKET33=null;
        TerraParser.op_body_return op_body32 = null;


        Object NEWLINE26_tree=null;
        Object OPERATION27_tree=null;
        Object OP_TYPE28_tree=null;
        Object NAME29_tree=null;
        Object STRING_LITERAL30_tree=null;
        Object LEFT_BRACKET31_tree=null;
        Object RIGHT_BRACKET33_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:84:10: ( NEWLINE | OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NEWLINE) ) {
                alt7=1;
            }
            else if ( (LA7_0==OPERATION) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:13: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE26=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_operation198); 
                    NEWLINE26_tree = (Object)adaptor.create(NEWLINE26);
                    adaptor.addChild(root_0, NEWLINE26_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:84:23: OPERATION OP_TYPE NAME STRING_LITERAL LEFT_BRACKET op_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    OPERATION27=(Token)match(input,OPERATION,FOLLOW_OPERATION_in_operation202); 
                    OPERATION27_tree = (Object)adaptor.create(OPERATION27);
                    adaptor.addChild(root_0, OPERATION27_tree);

                    OP_TYPE28=(Token)match(input,OP_TYPE,FOLLOW_OP_TYPE_in_operation204); 
                    OP_TYPE28_tree = (Object)adaptor.create(OP_TYPE28);
                    adaptor.addChild(root_0, OP_TYPE28_tree);

                    NAME29=(Token)match(input,NAME,FOLLOW_NAME_in_operation206); 
                    NAME29_tree = (Object)adaptor.create(NAME29);
                    adaptor.addChild(root_0, NAME29_tree);

                    STRING_LITERAL30=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_operation208); 
                    STRING_LITERAL30_tree = (Object)adaptor.create(STRING_LITERAL30);
                    adaptor.addChild(root_0, STRING_LITERAL30_tree);

                    LEFT_BRACKET31=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_operation210); 
                    LEFT_BRACKET31_tree = (Object)adaptor.create(LEFT_BRACKET31);
                    adaptor.addChild(root_0, LEFT_BRACKET31_tree);

                    pushFollow(FOLLOW_op_body_in_operation212);
                    op_body32=op_body();

                    state._fsp--;

                    adaptor.addChild(root_0, op_body32.getTree());
                    RIGHT_BRACKET33=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_operation214); 
                    RIGHT_BRACKET33_tree = (Object)adaptor.create(RIGHT_BRACKET33);
                    adaptor.addChild(root_0, RIGHT_BRACKET33_tree);


                    		Operation op = new Operation((OP_TYPE28!=null?OP_TYPE28.getText():null), (NAME29!=null?NAME29.getText():null), (STRING_LITERAL30!=null?STRING_LITERAL30.getText():null));
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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:92:1: op_body : ( op_prop )+ ;
    public final TerraParser.op_body_return op_body() throws RecognitionException {
        TerraParser.op_body_return retval = new TerraParser.op_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.op_prop_return op_prop34 = null;



        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:92:9: ( ( op_prop )+ )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:92:11: ( op_prop )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/paulofreitas/Desktop/lang/TerraParser.g:92:11: ( op_prop )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PROPERTY||LA8_0==OPERATION_PROPERTY||LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/paulofreitas/Desktop/lang/TerraParser.g:92:11: op_prop
            	    {
            	    pushFollow(FOLLOW_op_prop_in_op_body226);
            	    op_prop34=op_prop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, op_prop34.getTree());

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
    // $ANTLR end "op_body"

    public static class op_prop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "op_prop"
    // /home/paulofreitas/Desktop/lang/TerraParser.g:94:1: op_prop : ( NEWLINE | op_prop_name ATTRIBUITION value );
    public final TerraParser.op_prop_return op_prop() throws RecognitionException {
        TerraParser.op_prop_return retval = new TerraParser.op_prop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE35=null;
        Token ATTRIBUITION37=null;
        TerraParser.op_prop_name_return op_prop_name36 = null;

        TerraParser.value_return value38 = null;


        Object NEWLINE35_tree=null;
        Object ATTRIBUITION37_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:94:8: ( NEWLINE | op_prop_name ATTRIBUITION value )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NEWLINE) ) {
                alt9=1;
            }
            else if ( (LA9_0==PROPERTY||LA9_0==OPERATION_PROPERTY) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:94:10: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE35=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_op_prop234); 
                    NEWLINE35_tree = (Object)adaptor.create(NEWLINE35);
                    adaptor.addChild(root_0, NEWLINE35_tree);


                    }
                    break;
                case 2 :
                    // /home/paulofreitas/Desktop/lang/TerraParser.g:94:20: op_prop_name ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_op_prop_name_in_op_prop238);
                    op_prop_name36=op_prop_name();

                    state._fsp--;

                    adaptor.addChild(root_0, op_prop_name36.getTree());
                    ATTRIBUITION37=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_op_prop240); 
                    ATTRIBUITION37_tree = (Object)adaptor.create(ATTRIBUITION37);
                    adaptor.addChild(root_0, ATTRIBUITION37_tree);

                    pushFollow(FOLLOW_value_in_op_prop242);
                    value38=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value38.getTree());

                    		IConverterService convService = ServiceProvider.getInstance()
                    				.getService(IConverterService.class,
                    						Activator.getDefault().getBundle().getBundleContext());
                    						
                    		Class<?> type = PropertyInfo.getPropertyInfo((op_prop_name36!=null?input.toString(op_prop_name36.start,op_prop_name36.stop):null)).getType();
                    		Object propValue = convService.convert(type, (value38!=null?input.toString(value38.start,value38.stop):null));
                    		
                    		Property p = new Property((op_prop_name36!=null?input.toString(op_prop_name36.start,op_prop_name36.stop):null), propValue);
                    		op_props.put((op_prop_name36!=null?input.toString(op_prop_name36.start,op_prop_name36.stop):null), p);
                    	

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
    // /home/paulofreitas/Desktop/lang/TerraParser.g:107:1: op_prop_name : ( PROPERTY | OPERATION_PROPERTY );
    public final TerraParser.op_prop_name_return op_prop_name() throws RecognitionException {
        TerraParser.op_prop_name_return retval = new TerraParser.op_prop_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // /home/paulofreitas/Desktop/lang/TerraParser.g:107:14: ( PROPERTY | OPERATION_PROPERTY )
            // /home/paulofreitas/Desktop/lang/TerraParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set39=(Token)input.LT(1);
            if ( input.LA(1)==PROPERTY||input.LA(1)==OPERATION_PROPERTY ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set39));
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


 

    public static final BitSet FOLLOW_import_declaration_in_domain_object58 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object63 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAME_in_domain_object65 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object67 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object69 = new BitSet(new long[]{0x0000000040011100L});
    public static final BitSet FOLLOW_body_in_domain_object71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration87 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration89 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration91 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_attr_in_body109 = new BitSet(new long[]{0x0000000040011002L});
    public static final BitSet FOLLOW_operation_in_body113 = new BitSet(new long[]{0x0000000040011002L});
    public static final BitSet FOLLOW_TYPE_in_attr125 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAME_in_attr127 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr129 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr131 = new BitSet(new long[]{0x0000000040006000L});
    public static final BitSet FOLLOW_attr_body_in_attr133 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body148 = new BitSet(new long[]{0x0000000040006002L});
    public static final BitSet FOLLOW_NEWLINE_in_property156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attr_prop_name_in_property160 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property162 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_value_in_property164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_attr_prop_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_operation198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATION_in_operation202 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_OP_TYPE_in_operation204 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NAME_in_operation206 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_operation208 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_operation210 = new BitSet(new long[]{0x000000004000A000L});
    public static final BitSet FOLLOW_op_body_in_operation212 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_operation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_in_op_body226 = new BitSet(new long[]{0x000000004000A002L});
    public static final BitSet FOLLOW_NEWLINE_in_op_prop234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_prop_name_in_op_prop238 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_op_prop240 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_value_in_op_prop242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op_prop_name0 = new BitSet(new long[]{0x0000000000000002L});

}
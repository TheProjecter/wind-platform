// $ANTLR 3.1.2 C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g 2009-06-08 21:51:26
 
package br.com.maisha.terra; 
import java.util.HashMap;
import br.com.maisha.terra.lang.Import;
import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Property;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TerraParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", "ATTRIBUITION", "DOMAIN_OBJECT", "IMPORT", "TYPE", "PROPERTY", "INTEGER", "FLOAT", "NUMBER", "LETTER", "DIGIT", "NAME", "NONCONTROL_CHAR", "STRING_LITERAL", "SYMBOL", "SPACE", "LOWER", "UPPER", "NEWLINE", "WHITESPACE"
    };
    public static final int INTEGER=14;
    public static final int DOMAIN_OBJECT=10;
    public static final int SYMBOL=22;
    public static final int LETTER=17;
    public static final int LEFT_BRACKET=7;
    public static final int NUMBER=16;
    public static final int WHITESPACE=27;
    public static final int ATTRIBUITION=9;
    public static final int FLOAT=15;
    public static final int EOF=-1;
    public static final int SPACE=23;
    public static final int TYPE=12;
    public static final int RIGHT_PAREN=6;
    public static final int IMPORT=11;
    public static final int NAME=19;
    public static final int STRING_LITERAL=21;
    public static final int NEWLINE=26;
    public static final int NONCONTROL_CHAR=20;
    public static final int PROPERTY=13;
    public static final int RIGHT_BRACKET=8;
    public static final int ASSIGN=4;
    public static final int LEFT_PAREN=5;
    public static final int DIGIT=18;
    public static final int LOWER=24;
    public static final int UPPER=25;

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
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g"; }


    /** Map variable name to Integer object holding value */
    public HashMap<String, List<DomainObject>> memory = new HashMap<String, List<DomainObject>>();
    private List<Attribute> atts = new ArrayList<Attribute>();
    private List<Property> props = new ArrayList<Property>();
    private List<Import> imports = new ArrayList<Import>();


    public static class domain_object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_object"
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:30:1: domain_object : ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body RIGHT_BRACKET ;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:31:2: ( ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body RIGHT_BRACKET )
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:31:4: ( import_declaration )* DOMAIN_OBJECT NAME STRING_LITERAL LEFT_BRACKET body RIGHT_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:31:4: ( import_declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:31:5: import_declaration
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

            pushFollow(FOLLOW_body_in_domain_object71);
            body6=body();

            state._fsp--;

            adaptor.addChild(root_0, body6.getTree());
            RIGHT_BRACKET7=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_domain_object73); 
            RIGHT_BRACKET7_tree = (Object)adaptor.create(RIGHT_BRACKET7);
            adaptor.addChild(root_0, RIGHT_BRACKET7_tree);


            		List<DomainObject> l = memory.get("domain_object"); 
            		if(l == null) l = new ArrayList<DomainObject>();
            		DomainObject domainObj = new DomainObject((NAME3!=null?NAME3.getText():null), (STRING_LITERAL4!=null?STRING_LITERAL4.getText():null));
            		l.add(domainObj);
            		memory.put("domain_object", l);
            		domainObj.setAtts(atts);
            		domainObj.setImports(imports);
            		atts = new ArrayList<Attribute>();
            	

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
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:43:1: import_declaration : IMPORT NAME ( NEWLINE )+ ;
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
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:44:2: ( IMPORT NAME ( NEWLINE )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:44:4: IMPORT NAME ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            IMPORT8=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_import_declaration86); 
            IMPORT8_tree = (Object)adaptor.create(IMPORT8);
            adaptor.addChild(root_0, IMPORT8_tree);

            NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_import_declaration88); 
            NAME9_tree = (Object)adaptor.create(NAME9);
            adaptor.addChild(root_0, NAME9_tree);

            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:44:16: ( NEWLINE )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:44:16: NEWLINE
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_import_declaration90); 
            	    NEWLINE10_tree = (Object)adaptor.create(NEWLINE10);
            	    adaptor.addChild(root_0, NEWLINE10_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:50:1: body : ( attr )+ ;
    public final TerraParser.body_return body() throws RecognitionException {
        TerraParser.body_return retval = new TerraParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.attr_return attr11 = null;



        try {
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:50:6: ( ( attr )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:50:11: ( attr )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:50:11: ( attr )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TYPE||LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:50:11: attr
            	    {
            	    pushFollow(FOLLOW_attr_in_body107);
            	    attr11=attr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attr11.getTree());

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
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:52:1: attr : ( NEWLINE | TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET );
    public final TerraParser.attr_return attr() throws RecognitionException {
        TerraParser.attr_return retval = new TerraParser.attr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE12=null;
        Token TYPE13=null;
        Token NAME14=null;
        Token STRING_LITERAL15=null;
        Token LEFT_BRACKET16=null;
        Token RIGHT_BRACKET18=null;
        TerraParser.attr_body_return attr_body17 = null;


        Object NEWLINE12_tree=null;
        Object TYPE13_tree=null;
        Object NAME14_tree=null;
        Object STRING_LITERAL15_tree=null;
        Object LEFT_BRACKET16_tree=null;
        Object RIGHT_BRACKET18_tree=null;

        try {
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:52:6: ( NEWLINE | TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NEWLINE) ) {
                alt4=1;
            }
            else if ( (LA4_0==TYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:52:8: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_attr118); 
                    NEWLINE12_tree = (Object)adaptor.create(NEWLINE12);
                    adaptor.addChild(root_0, NEWLINE12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:52:18: TYPE NAME STRING_LITERAL LEFT_BRACKET attr_body RIGHT_BRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPE13=(Token)match(input,TYPE,FOLLOW_TYPE_in_attr122); 
                    TYPE13_tree = (Object)adaptor.create(TYPE13);
                    adaptor.addChild(root_0, TYPE13_tree);

                    NAME14=(Token)match(input,NAME,FOLLOW_NAME_in_attr124); 
                    NAME14_tree = (Object)adaptor.create(NAME14);
                    adaptor.addChild(root_0, NAME14_tree);

                    STRING_LITERAL15=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attr126); 
                    STRING_LITERAL15_tree = (Object)adaptor.create(STRING_LITERAL15);
                    adaptor.addChild(root_0, STRING_LITERAL15_tree);

                    LEFT_BRACKET16=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_attr128); 
                    LEFT_BRACKET16_tree = (Object)adaptor.create(LEFT_BRACKET16);
                    adaptor.addChild(root_0, LEFT_BRACKET16_tree);

                    pushFollow(FOLLOW_attr_body_in_attr130);
                    attr_body17=attr_body();

                    state._fsp--;

                    adaptor.addChild(root_0, attr_body17.getTree());
                    RIGHT_BRACKET18=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_attr132); 
                    RIGHT_BRACKET18_tree = (Object)adaptor.create(RIGHT_BRACKET18);
                    adaptor.addChild(root_0, RIGHT_BRACKET18_tree);


                    		Attribute att = new Attribute((TYPE13!=null?TYPE13.getText():null), (NAME14!=null?NAME14.getText():null), (STRING_LITERAL15!=null?STRING_LITERAL15.getText():null));
                    		att.setProps(props);
                    		atts.add(att);
                    		props = new ArrayList<Property>();

                    	

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
    // $ANTLR end "attr"

    public static class attr_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attr_body"
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:61:1: attr_body : ( property )+ ;
    public final TerraParser.attr_body_return attr_body() throws RecognitionException {
        TerraParser.attr_body_return retval = new TerraParser.attr_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TerraParser.property_return property19 = null;



        try {
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:61:11: ( ( property )+ )
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:61:14: ( property )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:61:14: ( property )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PROPERTY||LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:61:14: property
            	    {
            	    pushFollow(FOLLOW_property_in_attr_body145);
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
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:63:1: property : ( NEWLINE | PROPERTY ATTRIBUITION value );
    public final TerraParser.property_return property() throws RecognitionException {
        TerraParser.property_return retval = new TerraParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE20=null;
        Token PROPERTY21=null;
        Token ATTRIBUITION22=null;
        TerraParser.value_return value23 = null;


        Object NEWLINE20_tree=null;
        Object PROPERTY21_tree=null;
        Object ATTRIBUITION22_tree=null;

        try {
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:63:9: ( NEWLINE | PROPERTY ATTRIBUITION value )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NEWLINE) ) {
                alt6=1;
            }
            else if ( (LA6_0==PROPERTY) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:63:11: NEWLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_property153); 
                    NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
                    adaptor.addChild(root_0, NEWLINE20_tree);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:63:21: PROPERTY ATTRIBUITION value
                    {
                    root_0 = (Object)adaptor.nil();

                    PROPERTY21=(Token)match(input,PROPERTY,FOLLOW_PROPERTY_in_property157); 
                    PROPERTY21_tree = (Object)adaptor.create(PROPERTY21);
                    adaptor.addChild(root_0, PROPERTY21_tree);

                    ATTRIBUITION22=(Token)match(input,ATTRIBUITION,FOLLOW_ATTRIBUITION_in_property159); 
                    ATTRIBUITION22_tree = (Object)adaptor.create(ATTRIBUITION22);
                    adaptor.addChild(root_0, ATTRIBUITION22_tree);

                    pushFollow(FOLLOW_value_in_property161);
                    value23=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value23.getTree());

                    		Property p = new Property((PROPERTY21!=null?PROPERTY21.getText():null), (value23!=null?input.toString(value23.start,value23.stop):null));
                    		props.add(p);
                    	

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

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:69:1: value : ( NUMBER | NAME ) ;
    public final TerraParser.value_return value() throws RecognitionException {
        TerraParser.value_return retval = new TerraParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:69:7: ( ( NUMBER | NAME ) )
            // C:\\Documents and Settings\\Paulo\\Desktop\\antlr\\TerraParser.g:69:9: ( NUMBER | NAME )
            {
            root_0 = (Object)adaptor.nil();

            set24=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==NAME ) {
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
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_import_declaration_in_domain_object58 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_DOMAIN_OBJECT_in_domain_object63 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_domain_object65 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_domain_object67 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_domain_object69 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_body_in_domain_object71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_domain_object73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_import_declaration86 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_import_declaration88 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NEWLINE_in_import_declaration90 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_attr_in_body107 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_NEWLINE_in_attr118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_attr122 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NAME_in_attr124 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attr126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_attr128 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_attr_body_in_attr130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_attr132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_attr_body145 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_NEWLINE_in_property153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_in_property157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ATTRIBUITION_in_property159 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_value_in_property161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value174 = new BitSet(new long[]{0x0000000000000002L});

}
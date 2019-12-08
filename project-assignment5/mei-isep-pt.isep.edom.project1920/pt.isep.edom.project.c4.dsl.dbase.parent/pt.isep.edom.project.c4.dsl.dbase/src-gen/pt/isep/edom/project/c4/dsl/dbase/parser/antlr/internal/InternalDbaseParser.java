package pt.isep.edom.project.c4.dsl.dbase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DbaseModel'", "'{'", "'tables'", "','", "'}'", "'Table'", "'entity'", "'columns'", "'constraint'", "'Column'", "'type'", "'Constraint'", "'constraintType'", "'column'", "'relationship'", "'Relationship'", "'cardinalityType'", "'table'", "'VARCHAR'", "'INTEGER'", "'REAL'", "'BOOL'", "'PK'", "'UNIQUE'", "'NOTNULL'", "'FK'", "'OneToOne'", "'OneToMany'", "'ManyToMany'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDbase.g"; }



     	private DbaseGrammarAccess grammarAccess;

        public InternalDbaseParser(TokenStream input, DbaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DbaseModel";
       	}

       	@Override
       	protected DbaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDbaseModel"
    // InternalDbase.g:65:1: entryRuleDbaseModel returns [EObject current=null] : iv_ruleDbaseModel= ruleDbaseModel EOF ;
    public final EObject entryRuleDbaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbaseModel = null;


        try {
            // InternalDbase.g:65:51: (iv_ruleDbaseModel= ruleDbaseModel EOF )
            // InternalDbase.g:66:2: iv_ruleDbaseModel= ruleDbaseModel EOF
            {
             newCompositeNode(grammarAccess.getDbaseModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDbaseModel=ruleDbaseModel();

            state._fsp--;

             current =iv_ruleDbaseModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDbaseModel"


    // $ANTLR start "ruleDbaseModel"
    // InternalDbase.g:72:1: ruleDbaseModel returns [EObject current=null] : ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDbaseModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_tables_6_0 = null;

        EObject lv_tables_8_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:78:2: ( ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDbase.g:79:2: ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDbase.g:79:2: ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDbase.g:80:3: () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDbase.g:80:3: ()
            // InternalDbase.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDbaseModelAccess().getDbaseModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1());
            		
            // InternalDbase.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDbase.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDbase.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDbase.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDbaseModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbase.g:114:3: (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDbase.g:115:4: otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDbase.g:123:4: ( (lv_tables_6_0= ruleTable ) )
                    // InternalDbase.g:124:5: (lv_tables_6_0= ruleTable )
                    {
                    // InternalDbase.g:124:5: (lv_tables_6_0= ruleTable )
                    // InternalDbase.g:125:6: lv_tables_6_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tables_6_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDbaseModelRule());
                    						}
                    						add(
                    							current,
                    							"tables",
                    							lv_tables_6_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:142:4: (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDbase.g:143:5: otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDbase.g:147:5: ( (lv_tables_8_0= ruleTable ) )
                    	    // InternalDbase.g:148:6: (lv_tables_8_0= ruleTable )
                    	    {
                    	    // InternalDbase.g:148:6: (lv_tables_8_0= ruleTable )
                    	    // InternalDbase.g:149:7: lv_tables_8_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_tables_8_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDbaseModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tables",
                    	    								lv_tables_8_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDbaseModel"


    // $ANTLR start "entryRuleEString"
    // InternalDbase.g:180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDbase.g:180:47: (iv_ruleEString= ruleEString EOF )
            // InternalDbase.g:181:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDbase.g:187:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDbase.g:193:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDbase.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDbase.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDbase.g:195:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDbase.g:203:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalDbase.g:214:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalDbase.g:214:46: (iv_ruleTable= ruleTable EOF )
            // InternalDbase.g:215:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbase.g:221:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_entity_5_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_10_0 = null;

        EObject lv_constraint_14_0 = null;

        EObject lv_constraint_16_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:227:2: ( ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalDbase.g:228:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalDbase.g:228:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalDbase.g:229:3: () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalDbase.g:229:3: ()
            // InternalDbase.g:230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            // InternalDbase.g:240:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDbase.g:241:4: (lv_name_2_0= ruleEString )
            {
            // InternalDbase.g:241:4: (lv_name_2_0= ruleEString )
            // InternalDbase.g:242:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbase.g:263:3: (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbase.g:264:4: otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getEntityKeyword_4_0());
                    			
                    // InternalDbase.g:268:4: ( (lv_entity_5_0= ruleEString ) )
                    // InternalDbase.g:269:5: (lv_entity_5_0= ruleEString )
                    {
                    // InternalDbase.g:269:5: (lv_entity_5_0= ruleEString )
                    // InternalDbase.g:270:6: lv_entity_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_entity_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"entity",
                    							lv_entity_5_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDbase.g:288:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbase.g:289:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDbase.g:297:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalDbase.g:298:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalDbase.g:298:5: (lv_columns_8_0= ruleColumn )
                    // InternalDbase.g:299:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_columns_8_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_8_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:316:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDbase.g:317:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTableAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDbase.g:321:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalDbase.g:322:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalDbase.g:322:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalDbase.g:323:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_columns_10_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_10_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDbase.g:346:3: (otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbase.g:347:4: otherlv_12= 'constraint' otherlv_13= '{' ( (lv_constraint_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getTableAccess().getConstraintKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDbase.g:355:4: ( (lv_constraint_14_0= ruleConstraint ) )
                    // InternalDbase.g:356:5: (lv_constraint_14_0= ruleConstraint )
                    {
                    // InternalDbase.g:356:5: (lv_constraint_14_0= ruleConstraint )
                    // InternalDbase.g:357:6: lv_constraint_14_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_constraint_14_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"constraint",
                    							lv_constraint_14_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:374:4: (otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDbase.g:375:5: otherlv_15= ',' ( (lv_constraint_16_0= ruleConstraint ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTableAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDbase.g:379:5: ( (lv_constraint_16_0= ruleConstraint ) )
                    	    // InternalDbase.g:380:6: (lv_constraint_16_0= ruleConstraint )
                    	    {
                    	    // InternalDbase.g:380:6: (lv_constraint_16_0= ruleConstraint )
                    	    // InternalDbase.g:381:7: lv_constraint_16_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_constraint_16_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraint",
                    	    								lv_constraint_16_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalDbase.g:412:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDbase.g:412:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDbase.g:413:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbase.g:419:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:425:2: ( ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )? otherlv_6= '}' ) )
            // InternalDbase.g:426:2: ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )? otherlv_6= '}' )
            {
            // InternalDbase.g:426:2: ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )? otherlv_6= '}' )
            // InternalDbase.g:427:3: () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )? otherlv_6= '}'
            {
            // InternalDbase.g:427:3: ()
            // InternalDbase.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalDbase.g:438:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDbase.g:439:4: (lv_name_2_0= ruleEString )
            {
            // InternalDbase.g:439:4: (lv_name_2_0= ruleEString )
            // InternalDbase.g:440:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbase.g:461:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDbase.g:462:4: otherlv_4= 'type' ( (lv_type_5_0= ruleColumnType ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getTypeKeyword_4_0());
                    			
                    // InternalDbase.g:466:4: ( (lv_type_5_0= ruleColumnType ) )
                    // InternalDbase.g:467:5: (lv_type_5_0= ruleColumnType )
                    {
                    // InternalDbase.g:467:5: (lv_type_5_0= ruleColumnType )
                    // InternalDbase.g:468:6: lv_type_5_0= ruleColumnType
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_5_0=ruleColumnType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.ColumnType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstraint"
    // InternalDbase.g:494:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDbase.g:494:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDbase.g:495:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDbase.g:501:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )? otherlv_5= 'column' ( (lv_column_6_0= ruleColumn ) ) (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_constraintType_4_0 = null;

        EObject lv_column_6_0 = null;

        EObject lv_relationship_9_0 = null;

        EObject lv_relationship_11_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:507:2: ( (otherlv_0= 'Constraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )? otherlv_5= 'column' ( (lv_column_6_0= ruleColumn ) ) (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalDbase.g:508:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )? otherlv_5= 'column' ( (lv_column_6_0= ruleColumn ) ) (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalDbase.g:508:2: (otherlv_0= 'Constraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )? otherlv_5= 'column' ( (lv_column_6_0= ruleColumn ) ) (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalDbase.g:509:3: otherlv_0= 'Constraint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )? otherlv_5= 'column' ( (lv_column_6_0= ruleColumn ) ) (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalDbase.g:513:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDbase.g:514:4: (lv_name_1_0= ruleEString )
            {
            // InternalDbase.g:514:4: (lv_name_1_0= ruleEString )
            // InternalDbase.g:515:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDbase.g:536:3: (otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDbase.g:537:4: otherlv_3= 'constraintType' ( (lv_constraintType_4_0= ruleConstraintType ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getConstraintTypeKeyword_3_0());
                    			
                    // InternalDbase.g:541:4: ( (lv_constraintType_4_0= ruleConstraintType ) )
                    // InternalDbase.g:542:5: (lv_constraintType_4_0= ruleConstraintType )
                    {
                    // InternalDbase.g:542:5: (lv_constraintType_4_0= ruleConstraintType )
                    // InternalDbase.g:543:6: lv_constraintType_4_0= ruleConstraintType
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_constraintType_4_0=ruleConstraintType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"constraintType",
                    							lv_constraintType_4_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.ConstraintType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColumnKeyword_4());
            		
            // InternalDbase.g:565:3: ( (lv_column_6_0= ruleColumn ) )
            // InternalDbase.g:566:4: (lv_column_6_0= ruleColumn )
            {
            // InternalDbase.g:566:4: (lv_column_6_0= ruleColumn )
            // InternalDbase.g:567:5: lv_column_6_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getColumnColumnParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_column_6_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_6_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDbase.g:584:3: (otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDbase.g:585:4: otherlv_7= 'relationship' otherlv_8= '{' ( (lv_relationship_9_0= ruleRelationship ) ) (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getRelationshipKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDbase.g:593:4: ( (lv_relationship_9_0= ruleRelationship ) )
                    // InternalDbase.g:594:5: (lv_relationship_9_0= ruleRelationship )
                    {
                    // InternalDbase.g:594:5: (lv_relationship_9_0= ruleRelationship )
                    // InternalDbase.g:595:6: lv_relationship_9_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_relationship_9_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						add(
                    							current,
                    							"relationship",
                    							lv_relationship_9_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:612:4: (otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDbase.g:613:5: otherlv_10= ',' ( (lv_relationship_11_0= ruleRelationship ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDbase.g:617:5: ( (lv_relationship_11_0= ruleRelationship ) )
                    	    // InternalDbase.g:618:6: (lv_relationship_11_0= ruleRelationship )
                    	    {
                    	    // InternalDbase.g:618:6: (lv_relationship_11_0= ruleRelationship )
                    	    // InternalDbase.g:619:7: lv_relationship_11_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_relationship_11_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationship",
                    	    								lv_relationship_11_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelationship"
    // InternalDbase.g:650:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalDbase.g:650:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalDbase.g:651:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalDbase.g:657:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'Relationship' otherlv_1= '{' (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )? otherlv_4= 'table' ( (lv_table_5_0= ruleTable ) ) otherlv_6= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_cardinalityType_3_0 = null;

        EObject lv_table_5_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:663:2: ( (otherlv_0= 'Relationship' otherlv_1= '{' (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )? otherlv_4= 'table' ( (lv_table_5_0= ruleTable ) ) otherlv_6= '}' ) )
            // InternalDbase.g:664:2: (otherlv_0= 'Relationship' otherlv_1= '{' (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )? otherlv_4= 'table' ( (lv_table_5_0= ruleTable ) ) otherlv_6= '}' )
            {
            // InternalDbase.g:664:2: (otherlv_0= 'Relationship' otherlv_1= '{' (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )? otherlv_4= 'table' ( (lv_table_5_0= ruleTable ) ) otherlv_6= '}' )
            // InternalDbase.g:665:3: otherlv_0= 'Relationship' otherlv_1= '{' (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )? otherlv_4= 'table' ( (lv_table_5_0= ruleTable ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getRelationshipKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDbase.g:673:3: (otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDbase.g:674:4: otherlv_2= 'cardinalityType' ( (lv_cardinalityType_3_0= ruleCardinalityType ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getCardinalityTypeKeyword_2_0());
                    			
                    // InternalDbase.g:678:4: ( (lv_cardinalityType_3_0= ruleCardinalityType ) )
                    // InternalDbase.g:679:5: (lv_cardinalityType_3_0= ruleCardinalityType )
                    {
                    // InternalDbase.g:679:5: (lv_cardinalityType_3_0= ruleCardinalityType )
                    // InternalDbase.g:680:6: lv_cardinalityType_3_0= ruleCardinalityType
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getCardinalityTypeCardinalityTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_cardinalityType_3_0=ruleCardinalityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						set(
                    							current,
                    							"cardinalityType",
                    							lv_cardinalityType_3_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.CardinalityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getTableKeyword_3());
            		
            // InternalDbase.g:702:3: ( (lv_table_5_0= ruleTable ) )
            // InternalDbase.g:703:4: (lv_table_5_0= ruleTable )
            {
            // InternalDbase.g:703:4: (lv_table_5_0= ruleTable )
            // InternalDbase.g:704:5: lv_table_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_table_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_5_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "ruleColumnType"
    // InternalDbase.g:729:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDbase.g:735:2: ( ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) )
            // InternalDbase.g:736:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            {
            // InternalDbase.g:736:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDbase.g:737:3: (enumLiteral_0= 'VARCHAR' )
                    {
                    // InternalDbase.g:737:3: (enumLiteral_0= 'VARCHAR' )
                    // InternalDbase.g:738:4: enumLiteral_0= 'VARCHAR'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:745:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalDbase.g:745:3: (enumLiteral_1= 'INTEGER' )
                    // InternalDbase.g:746:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:753:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDbase.g:753:3: (enumLiteral_2= 'REAL' )
                    // InternalDbase.g:754:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDbase.g:761:3: (enumLiteral_3= 'BOOL' )
                    {
                    // InternalDbase.g:761:3: (enumLiteral_3= 'BOOL' )
                    // InternalDbase.g:762:4: enumLiteral_3= 'BOOL'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getBOOLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBOOLEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "ruleConstraintType"
    // InternalDbase.g:772:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'PK' ) | (enumLiteral_1= 'UNIQUE' ) | (enumLiteral_2= 'NOTNULL' ) | (enumLiteral_3= 'FK' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDbase.g:778:2: ( ( (enumLiteral_0= 'PK' ) | (enumLiteral_1= 'UNIQUE' ) | (enumLiteral_2= 'NOTNULL' ) | (enumLiteral_3= 'FK' ) ) )
            // InternalDbase.g:779:2: ( (enumLiteral_0= 'PK' ) | (enumLiteral_1= 'UNIQUE' ) | (enumLiteral_2= 'NOTNULL' ) | (enumLiteral_3= 'FK' ) )
            {
            // InternalDbase.g:779:2: ( (enumLiteral_0= 'PK' ) | (enumLiteral_1= 'UNIQUE' ) | (enumLiteral_2= 'NOTNULL' ) | (enumLiteral_3= 'FK' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDbase.g:780:3: (enumLiteral_0= 'PK' )
                    {
                    // InternalDbase.g:780:3: (enumLiteral_0= 'PK' )
                    // InternalDbase.g:781:4: enumLiteral_0= 'PK'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getPKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getPKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:788:3: (enumLiteral_1= 'UNIQUE' )
                    {
                    // InternalDbase.g:788:3: (enumLiteral_1= 'UNIQUE' )
                    // InternalDbase.g:789:4: enumLiteral_1= 'UNIQUE'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getUNIQUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getUNIQUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:796:3: (enumLiteral_2= 'NOTNULL' )
                    {
                    // InternalDbase.g:796:3: (enumLiteral_2= 'NOTNULL' )
                    // InternalDbase.g:797:4: enumLiteral_2= 'NOTNULL'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getNOTNULLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConstraintTypeAccess().getNOTNULLEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDbase.g:804:3: (enumLiteral_3= 'FK' )
                    {
                    // InternalDbase.g:804:3: (enumLiteral_3= 'FK' )
                    // InternalDbase.g:805:4: enumLiteral_3= 'FK'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeAccess().getFKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getConstraintTypeAccess().getFKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleCardinalityType"
    // InternalDbase.g:815:1: ruleCardinalityType returns [Enumerator current=null] : ( (enumLiteral_0= 'OneToOne' ) | (enumLiteral_1= 'OneToMany' ) | (enumLiteral_2= 'ManyToMany' ) ) ;
    public final Enumerator ruleCardinalityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDbase.g:821:2: ( ( (enumLiteral_0= 'OneToOne' ) | (enumLiteral_1= 'OneToMany' ) | (enumLiteral_2= 'ManyToMany' ) ) )
            // InternalDbase.g:822:2: ( (enumLiteral_0= 'OneToOne' ) | (enumLiteral_1= 'OneToMany' ) | (enumLiteral_2= 'ManyToMany' ) )
            {
            // InternalDbase.g:822:2: ( (enumLiteral_0= 'OneToOne' ) | (enumLiteral_1= 'OneToMany' ) | (enumLiteral_2= 'ManyToMany' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDbase.g:823:3: (enumLiteral_0= 'OneToOne' )
                    {
                    // InternalDbase.g:823:3: (enumLiteral_0= 'OneToOne' )
                    // InternalDbase.g:824:4: enumLiteral_0= 'OneToOne'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:831:3: (enumLiteral_1= 'OneToMany' )
                    {
                    // InternalDbase.g:831:3: (enumLiteral_1= 'OneToMany' )
                    // InternalDbase.g:832:4: enumLiteral_1= 'OneToMany'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:839:3: (enumLiteral_2= 'ManyToMany' )
                    {
                    // InternalDbase.g:839:3: (enumLiteral_2= 'ManyToMany' )
                    // InternalDbase.g:840:4: enumLiteral_2= 'ManyToMany'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getManyToManyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityTypeAccess().getManyToManyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});

}
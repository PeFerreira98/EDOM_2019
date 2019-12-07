package pt.isep.edom.project.c3.dsl.parser.antlr.internal;

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
import pt.isep.edom.project.c3.dsl.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DomainModel'", "'{'", "'entities'", "','", "'}'", "'valueobject'", "'root'", "'Entity'", "'fields'", "'references'", "'isId'", "'ValueObject'", "'field'", "'Field'", "'type'", "'Reference'", "'upperBound'", "'lowerBound'", "'entity'", "'-'", "'STRING'", "'INTEGER'", "'REAL'", "'BOOL'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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


        public InternalDomainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomain.g"; }



     	private DomainGrammarAccess grammarAccess;

        public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected DomainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalDomain.g:65:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalDomain.g:65:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalDomain.g:66:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomain.g:72:1: ruleDomainModel returns [EObject current=null] : ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_6_0 = null;

        EObject lv_entities_8_0 = null;

        EObject lv_valueobject_12_0 = null;

        EObject lv_valueobject_14_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:78:2: ( ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalDomain.g:79:2: ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalDomain.g:79:2: ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalDomain.g:80:3: () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalDomain.g:80:3: ()
            // InternalDomain.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainModelAccess().getDomainModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainModelAccess().getDomainModelKeyword_1());
            		
            // InternalDomain.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:114:3: (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomain.g:115:4: otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDomain.g:123:4: ( (lv_entities_6_0= ruleEntity ) )
                    // InternalDomain.g:124:5: (lv_entities_6_0= ruleEntity )
                    {
                    // InternalDomain.g:124:5: (lv_entities_6_0= ruleEntity )
                    // InternalDomain.g:125:6: lv_entities_6_0= ruleEntity
                    {

                    						newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_entities_6_0=ruleEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    						}
                    						add(
                    							current,
                    							"entities",
                    							lv_entities_6_0,
                    							"pt.isep.edom.project.c3.dsl.Domain.Entity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:142:4: (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDomain.g:143:5: otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDomain.g:147:5: ( (lv_entities_8_0= ruleEntity ) )
                    	    // InternalDomain.g:148:6: (lv_entities_8_0= ruleEntity )
                    	    {
                    	    // InternalDomain.g:148:6: (lv_entities_8_0= ruleEntity )
                    	    // InternalDomain.g:149:7: lv_entities_8_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_entities_8_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entities",
                    	    								lv_entities_8_0,
                    	    								"pt.isep.edom.project.c3.dsl.Domain.Entity");
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

                    				newLeafNode(otherlv_9, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDomain.g:172:3: (otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomain.g:173:4: otherlv_10= 'valueobject' otherlv_11= '{' ( (lv_valueobject_12_0= ruleValueObject ) ) (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getValueobjectKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDomain.g:181:4: ( (lv_valueobject_12_0= ruleValueObject ) )
                    // InternalDomain.g:182:5: (lv_valueobject_12_0= ruleValueObject )
                    {
                    // InternalDomain.g:182:5: (lv_valueobject_12_0= ruleValueObject )
                    // InternalDomain.g:183:6: lv_valueobject_12_0= ruleValueObject
                    {

                    						newCompositeNode(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_valueobject_12_0=ruleValueObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    						}
                    						add(
                    							current,
                    							"valueobject",
                    							lv_valueobject_12_0,
                    							"pt.isep.edom.project.c3.dsl.Domain.ValueObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:200:4: (otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDomain.g:201:5: otherlv_13= ',' ( (lv_valueobject_14_0= ruleValueObject ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDomainModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDomain.g:205:5: ( (lv_valueobject_14_0= ruleValueObject ) )
                    	    // InternalDomain.g:206:6: (lv_valueobject_14_0= ruleValueObject )
                    	    {
                    	    // InternalDomain.g:206:6: (lv_valueobject_14_0= ruleValueObject )
                    	    // InternalDomain.g:207:7: lv_valueobject_14_0= ruleValueObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_valueobject_14_0=ruleValueObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"valueobject",
                    	    								lv_valueobject_14_0,
                    	    								"pt.isep.edom.project.c3.dsl.Domain.ValueObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEString"
    // InternalDomain.g:238:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDomain.g:238:47: (iv_ruleEString= ruleEString EOF )
            // InternalDomain.g:239:2: iv_ruleEString= ruleEString EOF
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
    // InternalDomain.g:245:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDomain.g:251:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDomain.g:252:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDomain.g:252:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomain.g:253:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:261:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEntity"
    // InternalDomain.g:272:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomain.g:272:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomain.g:273:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomain.g:279:1: ruleEntity returns [EObject current=null] : ( ( (lv_root_0_0= 'root' ) ) otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_root_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_references_12_0 = null;

        EObject lv_references_14_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:285:2: ( ( ( (lv_root_0_0= 'root' ) ) otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalDomain.g:286:2: ( ( (lv_root_0_0= 'root' ) ) otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalDomain.g:286:2: ( ( (lv_root_0_0= 'root' ) ) otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalDomain.g:287:3: ( (lv_root_0_0= 'root' ) ) otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalDomain.g:287:3: ( (lv_root_0_0= 'root' ) )
            // InternalDomain.g:288:4: (lv_root_0_0= 'root' )
            {
            // InternalDomain.g:288:4: (lv_root_0_0= 'root' )
            // InternalDomain.g:289:5: lv_root_0_0= 'root'
            {
            lv_root_0_0=(Token)match(input,17,FOLLOW_11); 

            					newLeafNode(lv_root_0_0, grammarAccess.getEntityAccess().getRootRootKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(current, "root", true, "root");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalDomain.g:305:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:306:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:306:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:307:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:328:3: (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:329:4: otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDomain.g:337:4: ( (lv_fields_6_0= ruleField ) )
                    // InternalDomain.g:338:5: (lv_fields_6_0= ruleField )
                    {
                    // InternalDomain.g:338:5: (lv_fields_6_0= ruleField )
                    // InternalDomain.g:339:6: lv_fields_6_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fields_6_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_6_0,
                    							"pt.isep.edom.project.c3.dsl.Domain.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:356:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDomain.g:357:5: otherlv_7= ',' ( (lv_fields_8_0= ruleField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDomain.g:361:5: ( (lv_fields_8_0= ruleField ) )
                    	    // InternalDomain.g:362:6: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalDomain.g:362:6: (lv_fields_8_0= ruleField )
                    	    // InternalDomain.g:363:7: lv_fields_8_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_fields_8_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_8_0,
                    	    								"pt.isep.edom.project.c3.dsl.Domain.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDomain.g:386:3: (otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomain.g:387:4: otherlv_10= 'references' otherlv_11= '{' ( (lv_references_12_0= ruleReference ) ) (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getReferencesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDomain.g:395:4: ( (lv_references_12_0= ruleReference ) )
                    // InternalDomain.g:396:5: (lv_references_12_0= ruleReference )
                    {
                    // InternalDomain.g:396:5: (lv_references_12_0= ruleReference )
                    // InternalDomain.g:397:6: lv_references_12_0= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_references_12_0=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"references",
                    							lv_references_12_0,
                    							"pt.isep.edom.project.c3.dsl.Domain.Reference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:414:4: (otherlv_13= ',' ( (lv_references_14_0= ruleReference ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDomain.g:415:5: otherlv_13= ',' ( (lv_references_14_0= ruleReference ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDomain.g:419:5: ( (lv_references_14_0= ruleReference ) )
                    	    // InternalDomain.g:420:6: (lv_references_14_0= ruleReference )
                    	    {
                    	    // InternalDomain.g:420:6: (lv_references_14_0= ruleReference )
                    	    // InternalDomain.g:421:7: lv_references_14_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_references_14_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_14_0,
                    	    								"pt.isep.edom.project.c3.dsl.Domain.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleValueObject"
    // InternalDomain.g:452:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // InternalDomain.g:452:52: (iv_ruleValueObject= ruleValueObject EOF )
            // InternalDomain.g:453:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // InternalDomain.g:459:1: ruleValueObject returns [EObject current=null] : ( ( (lv_isId_0_0= 'isId' ) ) otherlv_1= 'ValueObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'field' ( (lv_field_5_0= ruleField ) ) otherlv_6= '}' ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        Token lv_isId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_field_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:465:2: ( ( ( (lv_isId_0_0= 'isId' ) ) otherlv_1= 'ValueObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'field' ( (lv_field_5_0= ruleField ) ) otherlv_6= '}' ) )
            // InternalDomain.g:466:2: ( ( (lv_isId_0_0= 'isId' ) ) otherlv_1= 'ValueObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'field' ( (lv_field_5_0= ruleField ) ) otherlv_6= '}' )
            {
            // InternalDomain.g:466:2: ( ( (lv_isId_0_0= 'isId' ) ) otherlv_1= 'ValueObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'field' ( (lv_field_5_0= ruleField ) ) otherlv_6= '}' )
            // InternalDomain.g:467:3: ( (lv_isId_0_0= 'isId' ) ) otherlv_1= 'ValueObject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'field' ( (lv_field_5_0= ruleField ) ) otherlv_6= '}'
            {
            // InternalDomain.g:467:3: ( (lv_isId_0_0= 'isId' ) )
            // InternalDomain.g:468:4: (lv_isId_0_0= 'isId' )
            {
            // InternalDomain.g:468:4: (lv_isId_0_0= 'isId' )
            // InternalDomain.g:469:5: lv_isId_0_0= 'isId'
            {
            lv_isId_0_0=(Token)match(input,21,FOLLOW_16); 

            					newLeafNode(lv_isId_0_0, grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueObjectRule());
            					}
            					setWithLastConsumed(current, "isId", true, "isId");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValueObjectAccess().getValueObjectKeyword_1());
            		
            // InternalDomain.g:485:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:486:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:486:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:487:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueObjectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getValueObjectAccess().getFieldKeyword_4());
            		
            // InternalDomain.g:512:3: ( (lv_field_5_0= ruleField ) )
            // InternalDomain.g:513:4: (lv_field_5_0= ruleField )
            {
            // InternalDomain.g:513:4: (lv_field_5_0= ruleField )
            // InternalDomain.g:514:5: lv_field_5_0= ruleField
            {

            					newCompositeNode(grammarAccess.getValueObjectAccess().getFieldFieldParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_field_5_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueObjectRule());
            					}
            					set(
            						current,
            						"field",
            						lv_field_5_0,
            						"pt.isep.edom.project.c3.dsl.Domain.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleField"
    // InternalDomain.g:539:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalDomain.g:539:46: (iv_ruleField= ruleField EOF )
            // InternalDomain.g:540:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalDomain.g:546:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:552:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' ) )
            // InternalDomain.g:553:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' )
            {
            // InternalDomain.g:553:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' )
            // InternalDomain.g:554:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}'
            {
            // InternalDomain.g:554:3: ()
            // InternalDomain.g:555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalDomain.g:565:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:566:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:566:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:567:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:588:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomain.g:589:4: otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
                    			
                    // InternalDomain.g:593:4: ( (lv_type_5_0= ruleFieldType ) )
                    // InternalDomain.g:594:5: (lv_type_5_0= ruleFieldType )
                    {
                    // InternalDomain.g:594:5: (lv_type_5_0= ruleFieldType )
                    // InternalDomain.g:595:6: lv_type_5_0= ruleFieldType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_5_0=ruleFieldType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"pt.isep.edom.project.c3.dsl.Domain.FieldType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleReference"
    // InternalDomain.g:621:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDomain.g:621:50: (iv_ruleReference= ruleReference EOF )
            // InternalDomain.g:622:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomain.g:628:1: ruleReference returns [EObject current=null] : (otherlv_0= 'Reference' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upperBound' ( (lv_upperBound_4_0= ruleEInt ) ) otherlv_5= 'lowerBound' ( (lv_lowerBound_6_0= ruleEInt ) ) (otherlv_7= 'entity' ( ( ruleEString ) ) )? (otherlv_9= 'valueobject' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_6_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:634:2: ( (otherlv_0= 'Reference' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upperBound' ( (lv_upperBound_4_0= ruleEInt ) ) otherlv_5= 'lowerBound' ( (lv_lowerBound_6_0= ruleEInt ) ) (otherlv_7= 'entity' ( ( ruleEString ) ) )? (otherlv_9= 'valueobject' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalDomain.g:635:2: (otherlv_0= 'Reference' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upperBound' ( (lv_upperBound_4_0= ruleEInt ) ) otherlv_5= 'lowerBound' ( (lv_lowerBound_6_0= ruleEInt ) ) (otherlv_7= 'entity' ( ( ruleEString ) ) )? (otherlv_9= 'valueobject' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalDomain.g:635:2: (otherlv_0= 'Reference' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upperBound' ( (lv_upperBound_4_0= ruleEInt ) ) otherlv_5= 'lowerBound' ( (lv_lowerBound_6_0= ruleEInt ) ) (otherlv_7= 'entity' ( ( ruleEString ) ) )? (otherlv_9= 'valueobject' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // InternalDomain.g:636:3: otherlv_0= 'Reference' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'upperBound' ( (lv_upperBound_4_0= ruleEInt ) ) otherlv_5= 'lowerBound' ( (lv_lowerBound_6_0= ruleEInt ) ) (otherlv_7= 'entity' ( ( ruleEString ) ) )? (otherlv_9= 'valueobject' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferenceKeyword_0());
            		
            // InternalDomain.g:640:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDomain.g:641:4: (lv_name_1_0= ruleEString )
            {
            // InternalDomain.g:641:4: (lv_name_1_0= ruleEString )
            // InternalDomain.g:642:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getUpperBoundKeyword_3());
            		
            // InternalDomain.g:667:3: ( (lv_upperBound_4_0= ruleEInt ) )
            // InternalDomain.g:668:4: (lv_upperBound_4_0= ruleEInt )
            {
            // InternalDomain.g:668:4: (lv_upperBound_4_0= ruleEInt )
            // InternalDomain.g:669:5: lv_upperBound_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_upperBound_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_4_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getLowerBoundKeyword_5());
            		
            // InternalDomain.g:690:3: ( (lv_lowerBound_6_0= ruleEInt ) )
            // InternalDomain.g:691:4: (lv_lowerBound_6_0= ruleEInt )
            {
            // InternalDomain.g:691:4: (lv_lowerBound_6_0= ruleEInt )
            // InternalDomain.g:692:5: lv_lowerBound_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_lowerBound_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_6_0,
            						"pt.isep.edom.project.c3.dsl.Domain.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:709:3: (otherlv_7= 'entity' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomain.g:710:4: otherlv_7= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getEntityKeyword_7_0());
                    			
                    // InternalDomain.g:714:4: ( ( ruleEString ) )
                    // InternalDomain.g:715:5: ( ruleEString )
                    {
                    // InternalDomain.g:715:5: ( ruleEString )
                    // InternalDomain.g:716:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:731:3: (otherlv_9= 'valueobject' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomain.g:732:4: otherlv_9= 'valueobject' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getReferenceAccess().getValueobjectKeyword_8_0());
                    			
                    // InternalDomain.g:736:4: ( ( ruleEString ) )
                    // InternalDomain.g:737:5: ( ruleEString )
                    {
                    // InternalDomain.g:737:5: ( ruleEString )
                    // InternalDomain.g:738:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getValueobjectValueObjectCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalDomain.g:761:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDomain.g:761:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDomain.g:762:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDomain.g:768:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDomain.g:774:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDomain.g:775:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDomain.g:775:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDomain.g:776:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDomain.g:776:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomain.g:777:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFieldType"
    // InternalDomain.g:794:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomain.g:800:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) )
            // InternalDomain.g:801:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            {
            // InternalDomain.g:801:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 34:
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
                    // InternalDomain.g:802:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalDomain.g:802:3: (enumLiteral_0= 'STRING' )
                    // InternalDomain.g:803:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:810:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalDomain.g:810:3: (enumLiteral_1= 'INTEGER' )
                    // InternalDomain.g:811:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:818:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDomain.g:818:3: (enumLiteral_2= 'REAL' )
                    // InternalDomain.g:819:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:826:3: (enumLiteral_3= 'BOOL' )
                    {
                    // InternalDomain.g:826:3: (enumLiteral_3= 'BOOL' )
                    // InternalDomain.g:827:4: enumLiteral_3= 'BOOL'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}
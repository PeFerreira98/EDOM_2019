package pt.isep.edom.project.c4.dsl.dbase.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VARCHAR'", "'INTEGER'", "'REAL'", "'BOOL'", "'PK'", "'UNIQUE'", "'NOTNULL'", "'FK'", "'OneToOne'", "'OneToMany'", "'ManyToMany'", "'DbaseModel'", "'{'", "'}'", "'tables'", "','", "'Table'", "'entity'", "'columns'", "'constraint'", "'Column'", "'type'", "'Constraint'", "'column'", "'constraintType'", "'relationship'", "'Relationship'", "'table'", "'cardinalityType'"
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

    	public void setGrammarAccess(DbaseGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDbaseModel"
    // InternalDbase.g:53:1: entryRuleDbaseModel : ruleDbaseModel EOF ;
    public final void entryRuleDbaseModel() throws RecognitionException {
        try {
            // InternalDbase.g:54:1: ( ruleDbaseModel EOF )
            // InternalDbase.g:55:1: ruleDbaseModel EOF
            {
             before(grammarAccess.getDbaseModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDbaseModel();

            state._fsp--;

             after(grammarAccess.getDbaseModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDbaseModel"


    // $ANTLR start "ruleDbaseModel"
    // InternalDbase.g:62:1: ruleDbaseModel : ( ( rule__DbaseModel__Group__0 ) ) ;
    public final void ruleDbaseModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:66:2: ( ( ( rule__DbaseModel__Group__0 ) ) )
            // InternalDbase.g:67:2: ( ( rule__DbaseModel__Group__0 ) )
            {
            // InternalDbase.g:67:2: ( ( rule__DbaseModel__Group__0 ) )
            // InternalDbase.g:68:3: ( rule__DbaseModel__Group__0 )
            {
             before(grammarAccess.getDbaseModelAccess().getGroup()); 
            // InternalDbase.g:69:3: ( rule__DbaseModel__Group__0 )
            // InternalDbase.g:69:4: rule__DbaseModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDbaseModel"


    // $ANTLR start "entryRuleEString"
    // InternalDbase.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDbase.g:79:1: ( ruleEString EOF )
            // InternalDbase.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDbase.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDbase.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDbase.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDbase.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDbase.g:94:3: ( rule__EString__Alternatives )
            // InternalDbase.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalDbase.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalDbase.g:104:1: ( ruleTable EOF )
            // InternalDbase.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbase.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalDbase.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalDbase.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalDbase.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalDbase.g:119:3: ( rule__Table__Group__0 )
            // InternalDbase.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalDbase.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalDbase.g:129:1: ( ruleColumn EOF )
            // InternalDbase.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbase.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalDbase.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalDbase.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalDbase.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalDbase.g:144:3: ( rule__Column__Group__0 )
            // InternalDbase.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstraint"
    // InternalDbase.g:153:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDbase.g:154:1: ( ruleConstraint EOF )
            // InternalDbase.g:155:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDbase.g:162:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:166:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDbase.g:167:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDbase.g:167:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDbase.g:168:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalDbase.g:169:3: ( rule__Constraint__Group__0 )
            // InternalDbase.g:169:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelationship"
    // InternalDbase.g:178:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalDbase.g:179:1: ( ruleRelationship EOF )
            // InternalDbase.g:180:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalDbase.g:187:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:191:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalDbase.g:192:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalDbase.g:192:2: ( ( rule__Relationship__Group__0 ) )
            // InternalDbase.g:193:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalDbase.g:194:3: ( rule__Relationship__Group__0 )
            // InternalDbase.g:194:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "ruleColumnType"
    // InternalDbase.g:203:1: ruleColumnType : ( ( rule__ColumnType__Alternatives ) ) ;
    public final void ruleColumnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:207:1: ( ( ( rule__ColumnType__Alternatives ) ) )
            // InternalDbase.g:208:2: ( ( rule__ColumnType__Alternatives ) )
            {
            // InternalDbase.g:208:2: ( ( rule__ColumnType__Alternatives ) )
            // InternalDbase.g:209:3: ( rule__ColumnType__Alternatives )
            {
             before(grammarAccess.getColumnTypeAccess().getAlternatives()); 
            // InternalDbase.g:210:3: ( rule__ColumnType__Alternatives )
            // InternalDbase.g:210:4: rule__ColumnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "ruleConstraintType"
    // InternalDbase.g:219:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:223:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // InternalDbase.g:224:2: ( ( rule__ConstraintType__Alternatives ) )
            {
            // InternalDbase.g:224:2: ( ( rule__ConstraintType__Alternatives ) )
            // InternalDbase.g:225:3: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // InternalDbase.g:226:3: ( rule__ConstraintType__Alternatives )
            // InternalDbase.g:226:4: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleCardinalityType"
    // InternalDbase.g:235:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:239:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalDbase.g:240:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalDbase.g:240:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalDbase.g:241:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalDbase.g:242:3: ( rule__CardinalityType__Alternatives )
            // InternalDbase.g:242:4: rule__CardinalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDbase.g:250:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:254:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDbase.g:255:2: ( RULE_STRING )
                    {
                    // InternalDbase.g:255:2: ( RULE_STRING )
                    // InternalDbase.g:256:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:261:2: ( RULE_ID )
                    {
                    // InternalDbase.g:261:2: ( RULE_ID )
                    // InternalDbase.g:262:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ColumnType__Alternatives"
    // InternalDbase.g:271:1: rule__ColumnType__Alternatives : ( ( ( 'VARCHAR' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) );
    public final void rule__ColumnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:275:1: ( ( ( 'VARCHAR' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDbase.g:276:2: ( ( 'VARCHAR' ) )
                    {
                    // InternalDbase.g:276:2: ( ( 'VARCHAR' ) )
                    // InternalDbase.g:277:3: ( 'VARCHAR' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalDbase.g:278:3: ( 'VARCHAR' )
                    // InternalDbase.g:278:4: 'VARCHAR'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:282:2: ( ( 'INTEGER' ) )
                    {
                    // InternalDbase.g:282:2: ( ( 'INTEGER' ) )
                    // InternalDbase.g:283:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalDbase.g:284:3: ( 'INTEGER' )
                    // InternalDbase.g:284:4: 'INTEGER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:288:2: ( ( 'REAL' ) )
                    {
                    // InternalDbase.g:288:2: ( ( 'REAL' ) )
                    // InternalDbase.g:289:3: ( 'REAL' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDbase.g:290:3: ( 'REAL' )
                    // InternalDbase.g:290:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDbase.g:294:2: ( ( 'BOOL' ) )
                    {
                    // InternalDbase.g:294:2: ( ( 'BOOL' ) )
                    // InternalDbase.g:295:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getBOOLEnumLiteralDeclaration_3()); 
                    // InternalDbase.g:296:3: ( 'BOOL' )
                    // InternalDbase.g:296:4: 'BOOL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getBOOLEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnType__Alternatives"


    // $ANTLR start "rule__ConstraintType__Alternatives"
    // InternalDbase.g:304:1: rule__ConstraintType__Alternatives : ( ( ( 'PK' ) ) | ( ( 'UNIQUE' ) ) | ( ( 'NOTNULL' ) ) | ( ( 'FK' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:308:1: ( ( ( 'PK' ) ) | ( ( 'UNIQUE' ) ) | ( ( 'NOTNULL' ) ) | ( ( 'FK' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDbase.g:309:2: ( ( 'PK' ) )
                    {
                    // InternalDbase.g:309:2: ( ( 'PK' ) )
                    // InternalDbase.g:310:3: ( 'PK' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getPKEnumLiteralDeclaration_0()); 
                    // InternalDbase.g:311:3: ( 'PK' )
                    // InternalDbase.g:311:4: 'PK'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getPKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:315:2: ( ( 'UNIQUE' ) )
                    {
                    // InternalDbase.g:315:2: ( ( 'UNIQUE' ) )
                    // InternalDbase.g:316:3: ( 'UNIQUE' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getUNIQUEEnumLiteralDeclaration_1()); 
                    // InternalDbase.g:317:3: ( 'UNIQUE' )
                    // InternalDbase.g:317:4: 'UNIQUE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getUNIQUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:321:2: ( ( 'NOTNULL' ) )
                    {
                    // InternalDbase.g:321:2: ( ( 'NOTNULL' ) )
                    // InternalDbase.g:322:3: ( 'NOTNULL' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getNOTNULLEnumLiteralDeclaration_2()); 
                    // InternalDbase.g:323:3: ( 'NOTNULL' )
                    // InternalDbase.g:323:4: 'NOTNULL'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getNOTNULLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDbase.g:327:2: ( ( 'FK' ) )
                    {
                    // InternalDbase.g:327:2: ( ( 'FK' ) )
                    // InternalDbase.g:328:3: ( 'FK' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getFKEnumLiteralDeclaration_3()); 
                    // InternalDbase.g:329:3: ( 'FK' )
                    // InternalDbase.g:329:4: 'FK'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getFKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintType__Alternatives"


    // $ANTLR start "rule__CardinalityType__Alternatives"
    // InternalDbase.g:337:1: rule__CardinalityType__Alternatives : ( ( ( 'OneToOne' ) ) | ( ( 'OneToMany' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:341:1: ( ( ( 'OneToOne' ) ) | ( ( 'OneToMany' ) ) | ( ( 'ManyToMany' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDbase.g:342:2: ( ( 'OneToOne' ) )
                    {
                    // InternalDbase.g:342:2: ( ( 'OneToOne' ) )
                    // InternalDbase.g:343:3: ( 'OneToOne' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0()); 
                    // InternalDbase.g:344:3: ( 'OneToOne' )
                    // InternalDbase.g:344:4: 'OneToOne'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:348:2: ( ( 'OneToMany' ) )
                    {
                    // InternalDbase.g:348:2: ( ( 'OneToMany' ) )
                    // InternalDbase.g:349:3: ( 'OneToMany' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1()); 
                    // InternalDbase.g:350:3: ( 'OneToMany' )
                    // InternalDbase.g:350:4: 'OneToMany'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:354:2: ( ( 'ManyToMany' ) )
                    {
                    // InternalDbase.g:354:2: ( ( 'ManyToMany' ) )
                    // InternalDbase.g:355:3: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyToManyEnumLiteralDeclaration_2()); 
                    // InternalDbase.g:356:3: ( 'ManyToMany' )
                    // InternalDbase.g:356:4: 'ManyToMany'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getManyToManyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityType__Alternatives"


    // $ANTLR start "rule__DbaseModel__Group__0"
    // InternalDbase.g:364:1: rule__DbaseModel__Group__0 : rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 ;
    public final void rule__DbaseModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:368:1: ( rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 )
            // InternalDbase.g:369:2: rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DbaseModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__0"


    // $ANTLR start "rule__DbaseModel__Group__0__Impl"
    // InternalDbase.g:376:1: rule__DbaseModel__Group__0__Impl : ( () ) ;
    public final void rule__DbaseModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:380:1: ( ( () ) )
            // InternalDbase.g:381:1: ( () )
            {
            // InternalDbase.g:381:1: ( () )
            // InternalDbase.g:382:2: ()
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelAction_0()); 
            // InternalDbase.g:383:2: ()
            // InternalDbase.g:383:3: 
            {
            }

             after(grammarAccess.getDbaseModelAccess().getDbaseModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group__1"
    // InternalDbase.g:391:1: rule__DbaseModel__Group__1 : rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 ;
    public final void rule__DbaseModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:395:1: ( rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 )
            // InternalDbase.g:396:2: rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DbaseModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__1"


    // $ANTLR start "rule__DbaseModel__Group__1__Impl"
    // InternalDbase.g:403:1: rule__DbaseModel__Group__1__Impl : ( 'DbaseModel' ) ;
    public final void rule__DbaseModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:407:1: ( ( 'DbaseModel' ) )
            // InternalDbase.g:408:1: ( 'DbaseModel' )
            {
            // InternalDbase.g:408:1: ( 'DbaseModel' )
            // InternalDbase.g:409:2: 'DbaseModel'
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__1__Impl"


    // $ANTLR start "rule__DbaseModel__Group__2"
    // InternalDbase.g:418:1: rule__DbaseModel__Group__2 : rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 ;
    public final void rule__DbaseModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:422:1: ( rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 )
            // InternalDbase.g:423:2: rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DbaseModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__2"


    // $ANTLR start "rule__DbaseModel__Group__2__Impl"
    // InternalDbase.g:430:1: rule__DbaseModel__Group__2__Impl : ( ( rule__DbaseModel__NameAssignment_2 ) ) ;
    public final void rule__DbaseModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:434:1: ( ( ( rule__DbaseModel__NameAssignment_2 ) ) )
            // InternalDbase.g:435:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            {
            // InternalDbase.g:435:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            // InternalDbase.g:436:2: ( rule__DbaseModel__NameAssignment_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getNameAssignment_2()); 
            // InternalDbase.g:437:2: ( rule__DbaseModel__NameAssignment_2 )
            // InternalDbase.g:437:3: rule__DbaseModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__2__Impl"


    // $ANTLR start "rule__DbaseModel__Group__3"
    // InternalDbase.g:445:1: rule__DbaseModel__Group__3 : rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 ;
    public final void rule__DbaseModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:449:1: ( rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 )
            // InternalDbase.g:450:2: rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DbaseModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__3"


    // $ANTLR start "rule__DbaseModel__Group__3__Impl"
    // InternalDbase.g:457:1: rule__DbaseModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:461:1: ( ( '{' ) )
            // InternalDbase.g:462:1: ( '{' )
            {
            // InternalDbase.g:462:1: ( '{' )
            // InternalDbase.g:463:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__3__Impl"


    // $ANTLR start "rule__DbaseModel__Group__4"
    // InternalDbase.g:472:1: rule__DbaseModel__Group__4 : rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 ;
    public final void rule__DbaseModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:476:1: ( rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 )
            // InternalDbase.g:477:2: rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DbaseModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__4"


    // $ANTLR start "rule__DbaseModel__Group__4__Impl"
    // InternalDbase.g:484:1: rule__DbaseModel__Group__4__Impl : ( ( rule__DbaseModel__Group_4__0 )? ) ;
    public final void rule__DbaseModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:488:1: ( ( ( rule__DbaseModel__Group_4__0 )? ) )
            // InternalDbase.g:489:1: ( ( rule__DbaseModel__Group_4__0 )? )
            {
            // InternalDbase.g:489:1: ( ( rule__DbaseModel__Group_4__0 )? )
            // InternalDbase.g:490:2: ( rule__DbaseModel__Group_4__0 )?
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4()); 
            // InternalDbase.g:491:2: ( rule__DbaseModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbase.g:491:3: rule__DbaseModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DbaseModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDbaseModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__4__Impl"


    // $ANTLR start "rule__DbaseModel__Group__5"
    // InternalDbase.g:499:1: rule__DbaseModel__Group__5 : rule__DbaseModel__Group__5__Impl ;
    public final void rule__DbaseModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:503:1: ( rule__DbaseModel__Group__5__Impl )
            // InternalDbase.g:504:2: rule__DbaseModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__5"


    // $ANTLR start "rule__DbaseModel__Group__5__Impl"
    // InternalDbase.g:510:1: rule__DbaseModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:514:1: ( ( '}' ) )
            // InternalDbase.g:515:1: ( '}' )
            {
            // InternalDbase.g:515:1: ( '}' )
            // InternalDbase.g:516:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__5__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__0"
    // InternalDbase.g:526:1: rule__DbaseModel__Group_4__0 : rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 ;
    public final void rule__DbaseModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:530:1: ( rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 )
            // InternalDbase.g:531:2: rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DbaseModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__0"


    // $ANTLR start "rule__DbaseModel__Group_4__0__Impl"
    // InternalDbase.g:538:1: rule__DbaseModel__Group_4__0__Impl : ( 'tables' ) ;
    public final void rule__DbaseModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:542:1: ( ( 'tables' ) )
            // InternalDbase.g:543:1: ( 'tables' )
            {
            // InternalDbase.g:543:1: ( 'tables' )
            // InternalDbase.g:544:2: 'tables'
            {
             before(grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__1"
    // InternalDbase.g:553:1: rule__DbaseModel__Group_4__1 : rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 ;
    public final void rule__DbaseModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:557:1: ( rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 )
            // InternalDbase.g:558:2: rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__DbaseModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__1"


    // $ANTLR start "rule__DbaseModel__Group_4__1__Impl"
    // InternalDbase.g:565:1: rule__DbaseModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:569:1: ( ( '{' ) )
            // InternalDbase.g:570:1: ( '{' )
            {
            // InternalDbase.g:570:1: ( '{' )
            // InternalDbase.g:571:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__1__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__2"
    // InternalDbase.g:580:1: rule__DbaseModel__Group_4__2 : rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 ;
    public final void rule__DbaseModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:584:1: ( rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 )
            // InternalDbase.g:585:2: rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DbaseModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__2"


    // $ANTLR start "rule__DbaseModel__Group_4__2__Impl"
    // InternalDbase.g:592:1: rule__DbaseModel__Group_4__2__Impl : ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) ;
    public final void rule__DbaseModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:596:1: ( ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) )
            // InternalDbase.g:597:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            {
            // InternalDbase.g:597:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            // InternalDbase.g:598:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_2()); 
            // InternalDbase.g:599:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            // InternalDbase.g:599:3: rule__DbaseModel__TablesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__TablesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__2__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__3"
    // InternalDbase.g:607:1: rule__DbaseModel__Group_4__3 : rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 ;
    public final void rule__DbaseModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:611:1: ( rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 )
            // InternalDbase.g:612:2: rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DbaseModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__3"


    // $ANTLR start "rule__DbaseModel__Group_4__3__Impl"
    // InternalDbase.g:619:1: rule__DbaseModel__Group_4__3__Impl : ( ( rule__DbaseModel__Group_4_3__0 )* ) ;
    public final void rule__DbaseModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:623:1: ( ( ( rule__DbaseModel__Group_4_3__0 )* ) )
            // InternalDbase.g:624:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            {
            // InternalDbase.g:624:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            // InternalDbase.g:625:2: ( rule__DbaseModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4_3()); 
            // InternalDbase.g:626:2: ( rule__DbaseModel__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDbase.g:626:3: rule__DbaseModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DbaseModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDbaseModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__3__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__4"
    // InternalDbase.g:634:1: rule__DbaseModel__Group_4__4 : rule__DbaseModel__Group_4__4__Impl ;
    public final void rule__DbaseModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:638:1: ( rule__DbaseModel__Group_4__4__Impl )
            // InternalDbase.g:639:2: rule__DbaseModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__4"


    // $ANTLR start "rule__DbaseModel__Group_4__4__Impl"
    // InternalDbase.g:645:1: rule__DbaseModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:649:1: ( ( '}' ) )
            // InternalDbase.g:650:1: ( '}' )
            {
            // InternalDbase.g:650:1: ( '}' )
            // InternalDbase.g:651:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4__4__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4_3__0"
    // InternalDbase.g:661:1: rule__DbaseModel__Group_4_3__0 : rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 ;
    public final void rule__DbaseModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:665:1: ( rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 )
            // InternalDbase.g:666:2: rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DbaseModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4_3__0"


    // $ANTLR start "rule__DbaseModel__Group_4_3__0__Impl"
    // InternalDbase.g:673:1: rule__DbaseModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DbaseModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:677:1: ( ( ',' ) )
            // InternalDbase.g:678:1: ( ',' )
            {
            // InternalDbase.g:678:1: ( ',' )
            // InternalDbase.g:679:2: ','
            {
             before(grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4_3__1"
    // InternalDbase.g:688:1: rule__DbaseModel__Group_4_3__1 : rule__DbaseModel__Group_4_3__1__Impl ;
    public final void rule__DbaseModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:692:1: ( rule__DbaseModel__Group_4_3__1__Impl )
            // InternalDbase.g:693:2: rule__DbaseModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4_3__1"


    // $ANTLR start "rule__DbaseModel__Group_4_3__1__Impl"
    // InternalDbase.g:699:1: rule__DbaseModel__Group_4_3__1__Impl : ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) ;
    public final void rule__DbaseModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:703:1: ( ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) )
            // InternalDbase.g:704:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            {
            // InternalDbase.g:704:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            // InternalDbase.g:705:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_3_1()); 
            // InternalDbase.g:706:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            // InternalDbase.g:706:3: rule__DbaseModel__TablesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__TablesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalDbase.g:715:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:719:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDbase.g:720:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalDbase.g:727:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:731:1: ( ( () ) )
            // InternalDbase.g:732:1: ( () )
            {
            // InternalDbase.g:732:1: ( () )
            // InternalDbase.g:733:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalDbase.g:734:2: ()
            // InternalDbase.g:734:3: 
            {
            }

             after(grammarAccess.getTableAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalDbase.g:742:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:746:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalDbase.g:747:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalDbase.g:754:1: rule__Table__Group__1__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:758:1: ( ( 'Table' ) )
            // InternalDbase.g:759:1: ( 'Table' )
            {
            // InternalDbase.g:759:1: ( 'Table' )
            // InternalDbase.g:760:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalDbase.g:769:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:773:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalDbase.g:774:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalDbase.g:781:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:785:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalDbase.g:786:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalDbase.g:786:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalDbase.g:787:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalDbase.g:788:2: ( rule__Table__NameAssignment_2 )
            // InternalDbase.g:788:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalDbase.g:796:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:800:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalDbase.g:801:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalDbase.g:808:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:812:1: ( ( '{' ) )
            // InternalDbase.g:813:1: ( '{' )
            {
            // InternalDbase.g:813:1: ( '{' )
            // InternalDbase.g:814:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalDbase.g:823:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:827:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalDbase.g:828:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalDbase.g:835:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:839:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalDbase.g:840:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalDbase.g:840:1: ( ( rule__Table__Group_4__0 )? )
            // InternalDbase.g:841:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalDbase.g:842:2: ( rule__Table__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDbase.g:842:3: rule__Table__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalDbase.g:850:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:854:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalDbase.g:855:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalDbase.g:862:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:866:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalDbase.g:867:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalDbase.g:867:1: ( ( rule__Table__Group_5__0 )? )
            // InternalDbase.g:868:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalDbase.g:869:2: ( rule__Table__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbase.g:869:3: rule__Table__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalDbase.g:877:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:881:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalDbase.g:882:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalDbase.g:889:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:893:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // InternalDbase.g:894:1: ( ( rule__Table__Group_6__0 )? )
            {
            // InternalDbase.g:894:1: ( ( rule__Table__Group_6__0 )? )
            // InternalDbase.g:895:2: ( rule__Table__Group_6__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_6()); 
            // InternalDbase.g:896:2: ( rule__Table__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDbase.g:896:3: rule__Table__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // InternalDbase.g:904:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:908:1: ( rule__Table__Group__7__Impl )
            // InternalDbase.g:909:2: rule__Table__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // InternalDbase.g:915:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:919:1: ( ( '}' ) )
            // InternalDbase.g:920:1: ( '}' )
            {
            // InternalDbase.g:920:1: ( '}' )
            // InternalDbase.g:921:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalDbase.g:931:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:935:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalDbase.g:936:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalDbase.g:943:1: rule__Table__Group_4__0__Impl : ( 'entity' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:947:1: ( ( 'entity' ) )
            // InternalDbase.g:948:1: ( 'entity' )
            {
            // InternalDbase.g:948:1: ( 'entity' )
            // InternalDbase.g:949:2: 'entity'
            {
             before(grammarAccess.getTableAccess().getEntityKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEntityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalDbase.g:958:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:962:1: ( rule__Table__Group_4__1__Impl )
            // InternalDbase.g:963:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalDbase.g:969:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__EntityAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:973:1: ( ( ( rule__Table__EntityAssignment_4_1 ) ) )
            // InternalDbase.g:974:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            {
            // InternalDbase.g:974:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            // InternalDbase.g:975:2: ( rule__Table__EntityAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getEntityAssignment_4_1()); 
            // InternalDbase.g:976:2: ( rule__Table__EntityAssignment_4_1 )
            // InternalDbase.g:976:3: rule__Table__EntityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__EntityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getEntityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group_5__0"
    // InternalDbase.g:985:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:989:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalDbase.g:990:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__0"


    // $ANTLR start "rule__Table__Group_5__0__Impl"
    // InternalDbase.g:997:1: rule__Table__Group_5__0__Impl : ( 'columns' ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1001:1: ( ( 'columns' ) )
            // InternalDbase.g:1002:1: ( 'columns' )
            {
            // InternalDbase.g:1002:1: ( 'columns' )
            // InternalDbase.g:1003:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColumnsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__0__Impl"


    // $ANTLR start "rule__Table__Group_5__1"
    // InternalDbase.g:1012:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl rule__Table__Group_5__2 ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1016:1: ( rule__Table__Group_5__1__Impl rule__Table__Group_5__2 )
            // InternalDbase.g:1017:2: rule__Table__Group_5__1__Impl rule__Table__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__1"


    // $ANTLR start "rule__Table__Group_5__1__Impl"
    // InternalDbase.g:1024:1: rule__Table__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1028:1: ( ( '{' ) )
            // InternalDbase.g:1029:1: ( '{' )
            {
            // InternalDbase.g:1029:1: ( '{' )
            // InternalDbase.g:1030:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__1__Impl"


    // $ANTLR start "rule__Table__Group_5__2"
    // InternalDbase.g:1039:1: rule__Table__Group_5__2 : rule__Table__Group_5__2__Impl rule__Table__Group_5__3 ;
    public final void rule__Table__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1043:1: ( rule__Table__Group_5__2__Impl rule__Table__Group_5__3 )
            // InternalDbase.g:1044:2: rule__Table__Group_5__2__Impl rule__Table__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__2"


    // $ANTLR start "rule__Table__Group_5__2__Impl"
    // InternalDbase.g:1051:1: rule__Table__Group_5__2__Impl : ( ( rule__Table__ColumnsAssignment_5_2 ) ) ;
    public final void rule__Table__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1055:1: ( ( ( rule__Table__ColumnsAssignment_5_2 ) ) )
            // InternalDbase.g:1056:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            {
            // InternalDbase.g:1056:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            // InternalDbase.g:1057:2: ( rule__Table__ColumnsAssignment_5_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_2()); 
            // InternalDbase.g:1058:2: ( rule__Table__ColumnsAssignment_5_2 )
            // InternalDbase.g:1058:3: rule__Table__ColumnsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__2__Impl"


    // $ANTLR start "rule__Table__Group_5__3"
    // InternalDbase.g:1066:1: rule__Table__Group_5__3 : rule__Table__Group_5__3__Impl rule__Table__Group_5__4 ;
    public final void rule__Table__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1070:1: ( rule__Table__Group_5__3__Impl rule__Table__Group_5__4 )
            // InternalDbase.g:1071:2: rule__Table__Group_5__3__Impl rule__Table__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__3"


    // $ANTLR start "rule__Table__Group_5__3__Impl"
    // InternalDbase.g:1078:1: rule__Table__Group_5__3__Impl : ( ( rule__Table__Group_5_3__0 )* ) ;
    public final void rule__Table__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1082:1: ( ( ( rule__Table__Group_5_3__0 )* ) )
            // InternalDbase.g:1083:1: ( ( rule__Table__Group_5_3__0 )* )
            {
            // InternalDbase.g:1083:1: ( ( rule__Table__Group_5_3__0 )* )
            // InternalDbase.g:1084:2: ( rule__Table__Group_5_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_3()); 
            // InternalDbase.g:1085:2: ( rule__Table__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDbase.g:1085:3: rule__Table__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__3__Impl"


    // $ANTLR start "rule__Table__Group_5__4"
    // InternalDbase.g:1093:1: rule__Table__Group_5__4 : rule__Table__Group_5__4__Impl ;
    public final void rule__Table__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1097:1: ( rule__Table__Group_5__4__Impl )
            // InternalDbase.g:1098:2: rule__Table__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__4"


    // $ANTLR start "rule__Table__Group_5__4__Impl"
    // InternalDbase.g:1104:1: rule__Table__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1108:1: ( ( '}' ) )
            // InternalDbase.g:1109:1: ( '}' )
            {
            // InternalDbase.g:1109:1: ( '}' )
            // InternalDbase.g:1110:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5__4__Impl"


    // $ANTLR start "rule__Table__Group_5_3__0"
    // InternalDbase.g:1120:1: rule__Table__Group_5_3__0 : rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 ;
    public final void rule__Table__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1124:1: ( rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 )
            // InternalDbase.g:1125:2: rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5_3__0"


    // $ANTLR start "rule__Table__Group_5_3__0__Impl"
    // InternalDbase.g:1132:1: rule__Table__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1136:1: ( ( ',' ) )
            // InternalDbase.g:1137:1: ( ',' )
            {
            // InternalDbase.g:1137:1: ( ',' )
            // InternalDbase.g:1138:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5_3__0__Impl"


    // $ANTLR start "rule__Table__Group_5_3__1"
    // InternalDbase.g:1147:1: rule__Table__Group_5_3__1 : rule__Table__Group_5_3__1__Impl ;
    public final void rule__Table__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1151:1: ( rule__Table__Group_5_3__1__Impl )
            // InternalDbase.g:1152:2: rule__Table__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5_3__1"


    // $ANTLR start "rule__Table__Group_5_3__1__Impl"
    // InternalDbase.g:1158:1: rule__Table__Group_5_3__1__Impl : ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) ;
    public final void rule__Table__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1162:1: ( ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) )
            // InternalDbase.g:1163:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            {
            // InternalDbase.g:1163:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            // InternalDbase.g:1164:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_3_1()); 
            // InternalDbase.g:1165:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            // InternalDbase.g:1165:3: rule__Table__ColumnsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_5_3__1__Impl"


    // $ANTLR start "rule__Table__Group_6__0"
    // InternalDbase.g:1174:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1178:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // InternalDbase.g:1179:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0"


    // $ANTLR start "rule__Table__Group_6__0__Impl"
    // InternalDbase.g:1186:1: rule__Table__Group_6__0__Impl : ( 'constraint' ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1190:1: ( ( 'constraint' ) )
            // InternalDbase.g:1191:1: ( 'constraint' )
            {
            // InternalDbase.g:1191:1: ( 'constraint' )
            // InternalDbase.g:1192:2: 'constraint'
            {
             before(grammarAccess.getTableAccess().getConstraintKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getConstraintKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0__Impl"


    // $ANTLR start "rule__Table__Group_6__1"
    // InternalDbase.g:1201:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl rule__Table__Group_6__2 ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1205:1: ( rule__Table__Group_6__1__Impl rule__Table__Group_6__2 )
            // InternalDbase.g:1206:2: rule__Table__Group_6__1__Impl rule__Table__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Table__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1"


    // $ANTLR start "rule__Table__Group_6__1__Impl"
    // InternalDbase.g:1213:1: rule__Table__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1217:1: ( ( '{' ) )
            // InternalDbase.g:1218:1: ( '{' )
            {
            // InternalDbase.g:1218:1: ( '{' )
            // InternalDbase.g:1219:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1__Impl"


    // $ANTLR start "rule__Table__Group_6__2"
    // InternalDbase.g:1228:1: rule__Table__Group_6__2 : rule__Table__Group_6__2__Impl rule__Table__Group_6__3 ;
    public final void rule__Table__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1232:1: ( rule__Table__Group_6__2__Impl rule__Table__Group_6__3 )
            // InternalDbase.g:1233:2: rule__Table__Group_6__2__Impl rule__Table__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__2"


    // $ANTLR start "rule__Table__Group_6__2__Impl"
    // InternalDbase.g:1240:1: rule__Table__Group_6__2__Impl : ( ( rule__Table__ConstraintAssignment_6_2 ) ) ;
    public final void rule__Table__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1244:1: ( ( ( rule__Table__ConstraintAssignment_6_2 ) ) )
            // InternalDbase.g:1245:1: ( ( rule__Table__ConstraintAssignment_6_2 ) )
            {
            // InternalDbase.g:1245:1: ( ( rule__Table__ConstraintAssignment_6_2 ) )
            // InternalDbase.g:1246:2: ( rule__Table__ConstraintAssignment_6_2 )
            {
             before(grammarAccess.getTableAccess().getConstraintAssignment_6_2()); 
            // InternalDbase.g:1247:2: ( rule__Table__ConstraintAssignment_6_2 )
            // InternalDbase.g:1247:3: rule__Table__ConstraintAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ConstraintAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getConstraintAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__2__Impl"


    // $ANTLR start "rule__Table__Group_6__3"
    // InternalDbase.g:1255:1: rule__Table__Group_6__3 : rule__Table__Group_6__3__Impl rule__Table__Group_6__4 ;
    public final void rule__Table__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1259:1: ( rule__Table__Group_6__3__Impl rule__Table__Group_6__4 )
            // InternalDbase.g:1260:2: rule__Table__Group_6__3__Impl rule__Table__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__3"


    // $ANTLR start "rule__Table__Group_6__3__Impl"
    // InternalDbase.g:1267:1: rule__Table__Group_6__3__Impl : ( ( rule__Table__Group_6_3__0 )* ) ;
    public final void rule__Table__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1271:1: ( ( ( rule__Table__Group_6_3__0 )* ) )
            // InternalDbase.g:1272:1: ( ( rule__Table__Group_6_3__0 )* )
            {
            // InternalDbase.g:1272:1: ( ( rule__Table__Group_6_3__0 )* )
            // InternalDbase.g:1273:2: ( rule__Table__Group_6_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_6_3()); 
            // InternalDbase.g:1274:2: ( rule__Table__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDbase.g:1274:3: rule__Table__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__3__Impl"


    // $ANTLR start "rule__Table__Group_6__4"
    // InternalDbase.g:1282:1: rule__Table__Group_6__4 : rule__Table__Group_6__4__Impl ;
    public final void rule__Table__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1286:1: ( rule__Table__Group_6__4__Impl )
            // InternalDbase.g:1287:2: rule__Table__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__4"


    // $ANTLR start "rule__Table__Group_6__4__Impl"
    // InternalDbase.g:1293:1: rule__Table__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1297:1: ( ( '}' ) )
            // InternalDbase.g:1298:1: ( '}' )
            {
            // InternalDbase.g:1298:1: ( '}' )
            // InternalDbase.g:1299:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__4__Impl"


    // $ANTLR start "rule__Table__Group_6_3__0"
    // InternalDbase.g:1309:1: rule__Table__Group_6_3__0 : rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1 ;
    public final void rule__Table__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1313:1: ( rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1 )
            // InternalDbase.g:1314:2: rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Table__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_3__0"


    // $ANTLR start "rule__Table__Group_6_3__0__Impl"
    // InternalDbase.g:1321:1: rule__Table__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1325:1: ( ( ',' ) )
            // InternalDbase.g:1326:1: ( ',' )
            {
            // InternalDbase.g:1326:1: ( ',' )
            // InternalDbase.g:1327:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_3__0__Impl"


    // $ANTLR start "rule__Table__Group_6_3__1"
    // InternalDbase.g:1336:1: rule__Table__Group_6_3__1 : rule__Table__Group_6_3__1__Impl ;
    public final void rule__Table__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1340:1: ( rule__Table__Group_6_3__1__Impl )
            // InternalDbase.g:1341:2: rule__Table__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_3__1"


    // $ANTLR start "rule__Table__Group_6_3__1__Impl"
    // InternalDbase.g:1347:1: rule__Table__Group_6_3__1__Impl : ( ( rule__Table__ConstraintAssignment_6_3_1 ) ) ;
    public final void rule__Table__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1351:1: ( ( ( rule__Table__ConstraintAssignment_6_3_1 ) ) )
            // InternalDbase.g:1352:1: ( ( rule__Table__ConstraintAssignment_6_3_1 ) )
            {
            // InternalDbase.g:1352:1: ( ( rule__Table__ConstraintAssignment_6_3_1 ) )
            // InternalDbase.g:1353:2: ( rule__Table__ConstraintAssignment_6_3_1 )
            {
             before(grammarAccess.getTableAccess().getConstraintAssignment_6_3_1()); 
            // InternalDbase.g:1354:2: ( rule__Table__ConstraintAssignment_6_3_1 )
            // InternalDbase.g:1354:3: rule__Table__ConstraintAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ConstraintAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getConstraintAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6_3__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalDbase.g:1363:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1367:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalDbase.g:1368:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalDbase.g:1375:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1379:1: ( ( () ) )
            // InternalDbase.g:1380:1: ( () )
            {
            // InternalDbase.g:1380:1: ( () )
            // InternalDbase.g:1381:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalDbase.g:1382:2: ()
            // InternalDbase.g:1382:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalDbase.g:1390:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1394:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalDbase.g:1395:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalDbase.g:1402:1: rule__Column__Group__1__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1406:1: ( ( 'Column' ) )
            // InternalDbase.g:1407:1: ( 'Column' )
            {
            // InternalDbase.g:1407:1: ( 'Column' )
            // InternalDbase.g:1408:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalDbase.g:1417:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1421:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalDbase.g:1422:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalDbase.g:1429:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1433:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalDbase.g:1434:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalDbase.g:1434:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalDbase.g:1435:2: ( rule__Column__NameAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            // InternalDbase.g:1436:2: ( rule__Column__NameAssignment_2 )
            // InternalDbase.g:1436:3: rule__Column__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalDbase.g:1444:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1448:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalDbase.g:1449:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalDbase.g:1456:1: rule__Column__Group__3__Impl : ( '{' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1460:1: ( ( '{' ) )
            // InternalDbase.g:1461:1: ( '{' )
            {
            // InternalDbase.g:1461:1: ( '{' )
            // InternalDbase.g:1462:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalDbase.g:1471:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1475:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalDbase.g:1476:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalDbase.g:1483:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1487:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalDbase.g:1488:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalDbase.g:1488:1: ( ( rule__Column__Group_4__0 )? )
            // InternalDbase.g:1489:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalDbase.g:1490:2: ( rule__Column__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDbase.g:1490:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalDbase.g:1498:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1502:1: ( rule__Column__Group__5__Impl )
            // InternalDbase.g:1503:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalDbase.g:1509:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1513:1: ( ( '}' ) )
            // InternalDbase.g:1514:1: ( '}' )
            {
            // InternalDbase.g:1514:1: ( '}' )
            // InternalDbase.g:1515:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalDbase.g:1525:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1529:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalDbase.g:1530:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalDbase.g:1537:1: rule__Column__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1541:1: ( ( 'type' ) )
            // InternalDbase.g:1542:1: ( 'type' )
            {
            // InternalDbase.g:1542:1: ( 'type' )
            // InternalDbase.g:1543:2: 'type'
            {
             before(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalDbase.g:1552:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1556:1: ( rule__Column__Group_4__1__Impl )
            // InternalDbase.g:1557:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalDbase.g:1563:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__TypeAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1567:1: ( ( ( rule__Column__TypeAssignment_4_1 ) ) )
            // InternalDbase.g:1568:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            {
            // InternalDbase.g:1568:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            // InternalDbase.g:1569:2: ( rule__Column__TypeAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 
            // InternalDbase.g:1570:2: ( rule__Column__TypeAssignment_4_1 )
            // InternalDbase.g:1570:3: rule__Column__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalDbase.g:1579:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1583:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDbase.g:1584:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalDbase.g:1591:1: rule__Constraint__Group__0__Impl : ( 'Constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1595:1: ( ( 'Constraint' ) )
            // InternalDbase.g:1596:1: ( 'Constraint' )
            {
            // InternalDbase.g:1596:1: ( 'Constraint' )
            // InternalDbase.g:1597:2: 'Constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalDbase.g:1606:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1610:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDbase.g:1611:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalDbase.g:1618:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1622:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDbase.g:1623:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDbase.g:1623:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDbase.g:1624:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDbase.g:1625:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDbase.g:1625:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalDbase.g:1633:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1637:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDbase.g:1638:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalDbase.g:1645:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1649:1: ( ( '{' ) )
            // InternalDbase.g:1650:1: ( '{' )
            {
            // InternalDbase.g:1650:1: ( '{' )
            // InternalDbase.g:1651:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalDbase.g:1660:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1664:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDbase.g:1665:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalDbase.g:1672:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__Group_3__0 )? ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1676:1: ( ( ( rule__Constraint__Group_3__0 )? ) )
            // InternalDbase.g:1677:1: ( ( rule__Constraint__Group_3__0 )? )
            {
            // InternalDbase.g:1677:1: ( ( rule__Constraint__Group_3__0 )? )
            // InternalDbase.g:1678:2: ( rule__Constraint__Group_3__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_3()); 
            // InternalDbase.g:1679:2: ( rule__Constraint__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDbase.g:1679:3: rule__Constraint__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalDbase.g:1687:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1691:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalDbase.g:1692:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalDbase.g:1699:1: rule__Constraint__Group__4__Impl : ( 'column' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1703:1: ( ( 'column' ) )
            // InternalDbase.g:1704:1: ( 'column' )
            {
            // InternalDbase.g:1704:1: ( 'column' )
            // InternalDbase.g:1705:2: 'column'
            {
             before(grammarAccess.getConstraintAccess().getColumnKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColumnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // InternalDbase.g:1714:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1718:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // InternalDbase.g:1719:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // InternalDbase.g:1726:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__ColumnAssignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1730:1: ( ( ( rule__Constraint__ColumnAssignment_5 ) ) )
            // InternalDbase.g:1731:1: ( ( rule__Constraint__ColumnAssignment_5 ) )
            {
            // InternalDbase.g:1731:1: ( ( rule__Constraint__ColumnAssignment_5 ) )
            // InternalDbase.g:1732:2: ( rule__Constraint__ColumnAssignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getColumnAssignment_5()); 
            // InternalDbase.g:1733:2: ( rule__Constraint__ColumnAssignment_5 )
            // InternalDbase.g:1733:3: rule__Constraint__ColumnAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ColumnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getColumnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // InternalDbase.g:1741:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1745:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // InternalDbase.g:1746:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // InternalDbase.g:1753:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__Group_6__0 )? ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1757:1: ( ( ( rule__Constraint__Group_6__0 )? ) )
            // InternalDbase.g:1758:1: ( ( rule__Constraint__Group_6__0 )? )
            {
            // InternalDbase.g:1758:1: ( ( rule__Constraint__Group_6__0 )? )
            // InternalDbase.g:1759:2: ( rule__Constraint__Group_6__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_6()); 
            // InternalDbase.g:1760:2: ( rule__Constraint__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDbase.g:1760:3: rule__Constraint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__Constraint__Group__7"
    // InternalDbase.g:1768:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1772:1: ( rule__Constraint__Group__7__Impl )
            // InternalDbase.g:1773:2: rule__Constraint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7"


    // $ANTLR start "rule__Constraint__Group__7__Impl"
    // InternalDbase.g:1779:1: rule__Constraint__Group__7__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1783:1: ( ( '}' ) )
            // InternalDbase.g:1784:1: ( '}' )
            {
            // InternalDbase.g:1784:1: ( '}' )
            // InternalDbase.g:1785:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7__Impl"


    // $ANTLR start "rule__Constraint__Group_3__0"
    // InternalDbase.g:1795:1: rule__Constraint__Group_3__0 : rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 ;
    public final void rule__Constraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1799:1: ( rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 )
            // InternalDbase.g:1800:2: rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Constraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__0"


    // $ANTLR start "rule__Constraint__Group_3__0__Impl"
    // InternalDbase.g:1807:1: rule__Constraint__Group_3__0__Impl : ( 'constraintType' ) ;
    public final void rule__Constraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1811:1: ( ( 'constraintType' ) )
            // InternalDbase.g:1812:1: ( 'constraintType' )
            {
            // InternalDbase.g:1812:1: ( 'constraintType' )
            // InternalDbase.g:1813:2: 'constraintType'
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__0__Impl"


    // $ANTLR start "rule__Constraint__Group_3__1"
    // InternalDbase.g:1822:1: rule__Constraint__Group_3__1 : rule__Constraint__Group_3__1__Impl ;
    public final void rule__Constraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1826:1: ( rule__Constraint__Group_3__1__Impl )
            // InternalDbase.g:1827:2: rule__Constraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__1"


    // $ANTLR start "rule__Constraint__Group_3__1__Impl"
    // InternalDbase.g:1833:1: rule__Constraint__Group_3__1__Impl : ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) ) ;
    public final void rule__Constraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1837:1: ( ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) ) )
            // InternalDbase.g:1838:1: ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) )
            {
            // InternalDbase.g:1838:1: ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) )
            // InternalDbase.g:1839:2: ( rule__Constraint__ConstraintTypeAssignment_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_3_1()); 
            // InternalDbase.g:1840:2: ( rule__Constraint__ConstraintTypeAssignment_3_1 )
            // InternalDbase.g:1840:3: rule__Constraint__ConstraintTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConstraintTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__1__Impl"


    // $ANTLR start "rule__Constraint__Group_6__0"
    // InternalDbase.g:1849:1: rule__Constraint__Group_6__0 : rule__Constraint__Group_6__0__Impl rule__Constraint__Group_6__1 ;
    public final void rule__Constraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1853:1: ( rule__Constraint__Group_6__0__Impl rule__Constraint__Group_6__1 )
            // InternalDbase.g:1854:2: rule__Constraint__Group_6__0__Impl rule__Constraint__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__0"


    // $ANTLR start "rule__Constraint__Group_6__0__Impl"
    // InternalDbase.g:1861:1: rule__Constraint__Group_6__0__Impl : ( 'relationship' ) ;
    public final void rule__Constraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1865:1: ( ( 'relationship' ) )
            // InternalDbase.g:1866:1: ( 'relationship' )
            {
            // InternalDbase.g:1866:1: ( 'relationship' )
            // InternalDbase.g:1867:2: 'relationship'
            {
             before(grammarAccess.getConstraintAccess().getRelationshipKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRelationshipKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__0__Impl"


    // $ANTLR start "rule__Constraint__Group_6__1"
    // InternalDbase.g:1876:1: rule__Constraint__Group_6__1 : rule__Constraint__Group_6__1__Impl rule__Constraint__Group_6__2 ;
    public final void rule__Constraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1880:1: ( rule__Constraint__Group_6__1__Impl rule__Constraint__Group_6__2 )
            // InternalDbase.g:1881:2: rule__Constraint__Group_6__1__Impl rule__Constraint__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__1"


    // $ANTLR start "rule__Constraint__Group_6__1__Impl"
    // InternalDbase.g:1888:1: rule__Constraint__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Constraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1892:1: ( ( '{' ) )
            // InternalDbase.g:1893:1: ( '{' )
            {
            // InternalDbase.g:1893:1: ( '{' )
            // InternalDbase.g:1894:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__1__Impl"


    // $ANTLR start "rule__Constraint__Group_6__2"
    // InternalDbase.g:1903:1: rule__Constraint__Group_6__2 : rule__Constraint__Group_6__2__Impl rule__Constraint__Group_6__3 ;
    public final void rule__Constraint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1907:1: ( rule__Constraint__Group_6__2__Impl rule__Constraint__Group_6__3 )
            // InternalDbase.g:1908:2: rule__Constraint__Group_6__2__Impl rule__Constraint__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Constraint__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__2"


    // $ANTLR start "rule__Constraint__Group_6__2__Impl"
    // InternalDbase.g:1915:1: rule__Constraint__Group_6__2__Impl : ( ( rule__Constraint__RelationshipAssignment_6_2 ) ) ;
    public final void rule__Constraint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1919:1: ( ( ( rule__Constraint__RelationshipAssignment_6_2 ) ) )
            // InternalDbase.g:1920:1: ( ( rule__Constraint__RelationshipAssignment_6_2 ) )
            {
            // InternalDbase.g:1920:1: ( ( rule__Constraint__RelationshipAssignment_6_2 ) )
            // InternalDbase.g:1921:2: ( rule__Constraint__RelationshipAssignment_6_2 )
            {
             before(grammarAccess.getConstraintAccess().getRelationshipAssignment_6_2()); 
            // InternalDbase.g:1922:2: ( rule__Constraint__RelationshipAssignment_6_2 )
            // InternalDbase.g:1922:3: rule__Constraint__RelationshipAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__RelationshipAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRelationshipAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__2__Impl"


    // $ANTLR start "rule__Constraint__Group_6__3"
    // InternalDbase.g:1930:1: rule__Constraint__Group_6__3 : rule__Constraint__Group_6__3__Impl rule__Constraint__Group_6__4 ;
    public final void rule__Constraint__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1934:1: ( rule__Constraint__Group_6__3__Impl rule__Constraint__Group_6__4 )
            // InternalDbase.g:1935:2: rule__Constraint__Group_6__3__Impl rule__Constraint__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Constraint__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__3"


    // $ANTLR start "rule__Constraint__Group_6__3__Impl"
    // InternalDbase.g:1942:1: rule__Constraint__Group_6__3__Impl : ( ( rule__Constraint__Group_6_3__0 )* ) ;
    public final void rule__Constraint__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1946:1: ( ( ( rule__Constraint__Group_6_3__0 )* ) )
            // InternalDbase.g:1947:1: ( ( rule__Constraint__Group_6_3__0 )* )
            {
            // InternalDbase.g:1947:1: ( ( rule__Constraint__Group_6_3__0 )* )
            // InternalDbase.g:1948:2: ( rule__Constraint__Group_6_3__0 )*
            {
             before(grammarAccess.getConstraintAccess().getGroup_6_3()); 
            // InternalDbase.g:1949:2: ( rule__Constraint__Group_6_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDbase.g:1949:3: rule__Constraint__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Constraint__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__3__Impl"


    // $ANTLR start "rule__Constraint__Group_6__4"
    // InternalDbase.g:1957:1: rule__Constraint__Group_6__4 : rule__Constraint__Group_6__4__Impl ;
    public final void rule__Constraint__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1961:1: ( rule__Constraint__Group_6__4__Impl )
            // InternalDbase.g:1962:2: rule__Constraint__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__4"


    // $ANTLR start "rule__Constraint__Group_6__4__Impl"
    // InternalDbase.g:1968:1: rule__Constraint__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1972:1: ( ( '}' ) )
            // InternalDbase.g:1973:1: ( '}' )
            {
            // InternalDbase.g:1973:1: ( '}' )
            // InternalDbase.g:1974:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6__4__Impl"


    // $ANTLR start "rule__Constraint__Group_6_3__0"
    // InternalDbase.g:1984:1: rule__Constraint__Group_6_3__0 : rule__Constraint__Group_6_3__0__Impl rule__Constraint__Group_6_3__1 ;
    public final void rule__Constraint__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1988:1: ( rule__Constraint__Group_6_3__0__Impl rule__Constraint__Group_6_3__1 )
            // InternalDbase.g:1989:2: rule__Constraint__Group_6_3__0__Impl rule__Constraint__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6_3__0"


    // $ANTLR start "rule__Constraint__Group_6_3__0__Impl"
    // InternalDbase.g:1996:1: rule__Constraint__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2000:1: ( ( ',' ) )
            // InternalDbase.g:2001:1: ( ',' )
            {
            // InternalDbase.g:2001:1: ( ',' )
            // InternalDbase.g:2002:2: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_6_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6_3__0__Impl"


    // $ANTLR start "rule__Constraint__Group_6_3__1"
    // InternalDbase.g:2011:1: rule__Constraint__Group_6_3__1 : rule__Constraint__Group_6_3__1__Impl ;
    public final void rule__Constraint__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2015:1: ( rule__Constraint__Group_6_3__1__Impl )
            // InternalDbase.g:2016:2: rule__Constraint__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6_3__1"


    // $ANTLR start "rule__Constraint__Group_6_3__1__Impl"
    // InternalDbase.g:2022:1: rule__Constraint__Group_6_3__1__Impl : ( ( rule__Constraint__RelationshipAssignment_6_3_1 ) ) ;
    public final void rule__Constraint__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2026:1: ( ( ( rule__Constraint__RelationshipAssignment_6_3_1 ) ) )
            // InternalDbase.g:2027:1: ( ( rule__Constraint__RelationshipAssignment_6_3_1 ) )
            {
            // InternalDbase.g:2027:1: ( ( rule__Constraint__RelationshipAssignment_6_3_1 ) )
            // InternalDbase.g:2028:2: ( rule__Constraint__RelationshipAssignment_6_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getRelationshipAssignment_6_3_1()); 
            // InternalDbase.g:2029:2: ( rule__Constraint__RelationshipAssignment_6_3_1 )
            // InternalDbase.g:2029:3: rule__Constraint__RelationshipAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__RelationshipAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRelationshipAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_6_3__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalDbase.g:2038:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2042:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalDbase.g:2043:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalDbase.g:2050:1: rule__Relationship__Group__0__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2054:1: ( ( 'Relationship' ) )
            // InternalDbase.g:2055:1: ( 'Relationship' )
            {
            // InternalDbase.g:2055:1: ( 'Relationship' )
            // InternalDbase.g:2056:2: 'Relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRelationshipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalDbase.g:2065:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2069:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalDbase.g:2070:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalDbase.g:2077:1: rule__Relationship__Group__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2081:1: ( ( '{' ) )
            // InternalDbase.g:2082:1: ( '{' )
            {
            // InternalDbase.g:2082:1: ( '{' )
            // InternalDbase.g:2083:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalDbase.g:2092:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2096:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalDbase.g:2097:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalDbase.g:2104:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__Group_2__0 )? ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2108:1: ( ( ( rule__Relationship__Group_2__0 )? ) )
            // InternalDbase.g:2109:1: ( ( rule__Relationship__Group_2__0 )? )
            {
            // InternalDbase.g:2109:1: ( ( rule__Relationship__Group_2__0 )? )
            // InternalDbase.g:2110:2: ( rule__Relationship__Group_2__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_2()); 
            // InternalDbase.g:2111:2: ( rule__Relationship__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDbase.g:2111:3: rule__Relationship__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relationship__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalDbase.g:2119:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2123:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalDbase.g:2124:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalDbase.g:2131:1: rule__Relationship__Group__3__Impl : ( 'table' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2135:1: ( ( 'table' ) )
            // InternalDbase.g:2136:1: ( 'table' )
            {
            // InternalDbase.g:2136:1: ( 'table' )
            // InternalDbase.g:2137:2: 'table'
            {
             before(grammarAccess.getRelationshipAccess().getTableKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getTableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalDbase.g:2146:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2150:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalDbase.g:2151:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Relationship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalDbase.g:2158:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TableAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2162:1: ( ( ( rule__Relationship__TableAssignment_4 ) ) )
            // InternalDbase.g:2163:1: ( ( rule__Relationship__TableAssignment_4 ) )
            {
            // InternalDbase.g:2163:1: ( ( rule__Relationship__TableAssignment_4 ) )
            // InternalDbase.g:2164:2: ( rule__Relationship__TableAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTableAssignment_4()); 
            // InternalDbase.g:2165:2: ( rule__Relationship__TableAssignment_4 )
            // InternalDbase.g:2165:3: rule__Relationship__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalDbase.g:2173:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2177:1: ( rule__Relationship__Group__5__Impl )
            // InternalDbase.g:2178:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalDbase.g:2184:1: rule__Relationship__Group__5__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2188:1: ( ( '}' ) )
            // InternalDbase.g:2189:1: ( '}' )
            {
            // InternalDbase.g:2189:1: ( '}' )
            // InternalDbase.g:2190:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group_2__0"
    // InternalDbase.g:2200:1: rule__Relationship__Group_2__0 : rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1 ;
    public final void rule__Relationship__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2204:1: ( rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1 )
            // InternalDbase.g:2205:2: rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Relationship__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_2__0"


    // $ANTLR start "rule__Relationship__Group_2__0__Impl"
    // InternalDbase.g:2212:1: rule__Relationship__Group_2__0__Impl : ( 'cardinalityType' ) ;
    public final void rule__Relationship__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2216:1: ( ( 'cardinalityType' ) )
            // InternalDbase.g:2217:1: ( 'cardinalityType' )
            {
            // InternalDbase.g:2217:1: ( 'cardinalityType' )
            // InternalDbase.g:2218:2: 'cardinalityType'
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityTypeKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCardinalityTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_2__0__Impl"


    // $ANTLR start "rule__Relationship__Group_2__1"
    // InternalDbase.g:2227:1: rule__Relationship__Group_2__1 : rule__Relationship__Group_2__1__Impl ;
    public final void rule__Relationship__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2231:1: ( rule__Relationship__Group_2__1__Impl )
            // InternalDbase.g:2232:2: rule__Relationship__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_2__1"


    // $ANTLR start "rule__Relationship__Group_2__1__Impl"
    // InternalDbase.g:2238:1: rule__Relationship__Group_2__1__Impl : ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) ) ;
    public final void rule__Relationship__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2242:1: ( ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) ) )
            // InternalDbase.g:2243:1: ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) )
            {
            // InternalDbase.g:2243:1: ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) )
            // InternalDbase.g:2244:2: ( rule__Relationship__CardinalityTypeAssignment_2_1 )
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityTypeAssignment_2_1()); 
            // InternalDbase.g:2245:2: ( rule__Relationship__CardinalityTypeAssignment_2_1 )
            // InternalDbase.g:2245:3: rule__Relationship__CardinalityTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__CardinalityTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getCardinalityTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_2__1__Impl"


    // $ANTLR start "rule__DbaseModel__NameAssignment_2"
    // InternalDbase.g:2254:1: rule__DbaseModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DbaseModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2258:1: ( ( ruleEString ) )
            // InternalDbase.g:2259:2: ( ruleEString )
            {
            // InternalDbase.g:2259:2: ( ruleEString )
            // InternalDbase.g:2260:3: ruleEString
            {
             before(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__NameAssignment_2"


    // $ANTLR start "rule__DbaseModel__TablesAssignment_4_2"
    // InternalDbase.g:2269:1: rule__DbaseModel__TablesAssignment_4_2 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2273:1: ( ( ruleTable ) )
            // InternalDbase.g:2274:2: ( ruleTable )
            {
            // InternalDbase.g:2274:2: ( ruleTable )
            // InternalDbase.g:2275:3: ruleTable
            {
             before(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__TablesAssignment_4_2"


    // $ANTLR start "rule__DbaseModel__TablesAssignment_4_3_1"
    // InternalDbase.g:2284:1: rule__DbaseModel__TablesAssignment_4_3_1 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2288:1: ( ( ruleTable ) )
            // InternalDbase.g:2289:2: ( ruleTable )
            {
            // InternalDbase.g:2289:2: ( ruleTable )
            // InternalDbase.g:2290:3: ruleTable
            {
             before(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__TablesAssignment_4_3_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalDbase.g:2299:1: rule__Table__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2303:1: ( ( ruleEString ) )
            // InternalDbase.g:2304:2: ( ruleEString )
            {
            // InternalDbase.g:2304:2: ( ruleEString )
            // InternalDbase.g:2305:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__EntityAssignment_4_1"
    // InternalDbase.g:2314:1: rule__Table__EntityAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Table__EntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2318:1: ( ( ruleEString ) )
            // InternalDbase.g:2319:2: ( ruleEString )
            {
            // InternalDbase.g:2319:2: ( ruleEString )
            // InternalDbase.g:2320:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__EntityAssignment_4_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_2"
    // InternalDbase.g:2329:1: rule__Table__ColumnsAssignment_5_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2333:1: ( ( ruleColumn ) )
            // InternalDbase.g:2334:2: ( ruleColumn )
            {
            // InternalDbase.g:2334:2: ( ruleColumn )
            // InternalDbase.g:2335:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_5_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_3_1"
    // InternalDbase.g:2344:1: rule__Table__ColumnsAssignment_5_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2348:1: ( ( ruleColumn ) )
            // InternalDbase.g:2349:2: ( ruleColumn )
            {
            // InternalDbase.g:2349:2: ( ruleColumn )
            // InternalDbase.g:2350:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_5_3_1"


    // $ANTLR start "rule__Table__ConstraintAssignment_6_2"
    // InternalDbase.g:2359:1: rule__Table__ConstraintAssignment_6_2 : ( ruleConstraint ) ;
    public final void rule__Table__ConstraintAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2363:1: ( ( ruleConstraint ) )
            // InternalDbase.g:2364:2: ( ruleConstraint )
            {
            // InternalDbase.g:2364:2: ( ruleConstraint )
            // InternalDbase.g:2365:3: ruleConstraint
            {
             before(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ConstraintAssignment_6_2"


    // $ANTLR start "rule__Table__ConstraintAssignment_6_3_1"
    // InternalDbase.g:2374:1: rule__Table__ConstraintAssignment_6_3_1 : ( ruleConstraint ) ;
    public final void rule__Table__ConstraintAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2378:1: ( ( ruleConstraint ) )
            // InternalDbase.g:2379:2: ( ruleConstraint )
            {
            // InternalDbase.g:2379:2: ( ruleConstraint )
            // InternalDbase.g:2380:3: ruleConstraint
            {
             before(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getTableAccess().getConstraintConstraintParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ConstraintAssignment_6_3_1"


    // $ANTLR start "rule__Column__NameAssignment_2"
    // InternalDbase.g:2389:1: rule__Column__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2393:1: ( ( ruleEString ) )
            // InternalDbase.g:2394:2: ( ruleEString )
            {
            // InternalDbase.g:2394:2: ( ruleEString )
            // InternalDbase.g:2395:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_2"


    // $ANTLR start "rule__Column__TypeAssignment_4_1"
    // InternalDbase.g:2404:1: rule__Column__TypeAssignment_4_1 : ( ruleColumnType ) ;
    public final void rule__Column__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2408:1: ( ( ruleColumnType ) )
            // InternalDbase.g:2409:2: ( ruleColumnType )
            {
            // InternalDbase.g:2409:2: ( ruleColumnType )
            // InternalDbase.g:2410:3: ruleColumnType
            {
             before(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_4_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalDbase.g:2419:1: rule__Constraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2423:1: ( ( ruleEString ) )
            // InternalDbase.g:2424:2: ( ruleEString )
            {
            // InternalDbase.g:2424:2: ( ruleEString )
            // InternalDbase.g:2425:3: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__ConstraintTypeAssignment_3_1"
    // InternalDbase.g:2434:1: rule__Constraint__ConstraintTypeAssignment_3_1 : ( ruleConstraintType ) ;
    public final void rule__Constraint__ConstraintTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2438:1: ( ( ruleConstraintType ) )
            // InternalDbase.g:2439:2: ( ruleConstraintType )
            {
            // InternalDbase.g:2439:2: ( ruleConstraintType )
            // InternalDbase.g:2440:3: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConstraintTypeAssignment_3_1"


    // $ANTLR start "rule__Constraint__ColumnAssignment_5"
    // InternalDbase.g:2449:1: rule__Constraint__ColumnAssignment_5 : ( ruleColumn ) ;
    public final void rule__Constraint__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2453:1: ( ( ruleColumn ) )
            // InternalDbase.g:2454:2: ( ruleColumn )
            {
            // InternalDbase.g:2454:2: ( ruleColumn )
            // InternalDbase.g:2455:3: ruleColumn
            {
             before(grammarAccess.getConstraintAccess().getColumnColumnParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getColumnColumnParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ColumnAssignment_5"


    // $ANTLR start "rule__Constraint__RelationshipAssignment_6_2"
    // InternalDbase.g:2464:1: rule__Constraint__RelationshipAssignment_6_2 : ( ruleRelationship ) ;
    public final void rule__Constraint__RelationshipAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2468:1: ( ( ruleRelationship ) )
            // InternalDbase.g:2469:2: ( ruleRelationship )
            {
            // InternalDbase.g:2469:2: ( ruleRelationship )
            // InternalDbase.g:2470:3: ruleRelationship
            {
             before(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__RelationshipAssignment_6_2"


    // $ANTLR start "rule__Constraint__RelationshipAssignment_6_3_1"
    // InternalDbase.g:2479:1: rule__Constraint__RelationshipAssignment_6_3_1 : ( ruleRelationship ) ;
    public final void rule__Constraint__RelationshipAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2483:1: ( ( ruleRelationship ) )
            // InternalDbase.g:2484:2: ( ruleRelationship )
            {
            // InternalDbase.g:2484:2: ( ruleRelationship )
            // InternalDbase.g:2485:3: ruleRelationship
            {
             before(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__RelationshipAssignment_6_3_1"


    // $ANTLR start "rule__Relationship__CardinalityTypeAssignment_2_1"
    // InternalDbase.g:2494:1: rule__Relationship__CardinalityTypeAssignment_2_1 : ( ruleCardinalityType ) ;
    public final void rule__Relationship__CardinalityTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2498:1: ( ( ruleCardinalityType ) )
            // InternalDbase.g:2499:2: ( ruleCardinalityType )
            {
            // InternalDbase.g:2499:2: ( ruleCardinalityType )
            // InternalDbase.g:2500:3: ruleCardinalityType
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityTypeCardinalityTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityType();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getCardinalityTypeCardinalityTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__CardinalityTypeAssignment_2_1"


    // $ANTLR start "rule__Relationship__TableAssignment_4"
    // InternalDbase.g:2509:1: rule__Relationship__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__Relationship__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2513:1: ( ( ruleTable ) )
            // InternalDbase.g:2514:2: ( ruleTable )
            {
            // InternalDbase.g:2514:2: ( ruleTable )
            // InternalDbase.g:2515:3: ruleTable
            {
             before(grammarAccess.getRelationshipAccess().getTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getTableTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__TableAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000380000L});

}
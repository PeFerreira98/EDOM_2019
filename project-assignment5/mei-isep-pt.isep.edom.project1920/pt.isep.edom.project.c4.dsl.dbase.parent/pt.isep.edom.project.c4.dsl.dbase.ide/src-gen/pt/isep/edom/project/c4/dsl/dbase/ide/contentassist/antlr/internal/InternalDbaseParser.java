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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VARCHAR'", "'INTEGER'", "'REAL'", "'BOOL'", "'PKFK'", "'UNIQUE'", "'NOTNULL'", "'OneToOne'", "'OneToMany'", "'ManyToMany'", "'DbaseModel'", "'{'", "'}'", "'tables'", "','", "'Table'", "'entity'", "'columns'", "'constraint'", "'Column'", "'type'", "'Constraint'", "'column'", "'relationship'", "'constraintType'", "'Relationship'", "'table'", "'cardinalityType'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    // InternalDbase.g:304:1: rule__ConstraintType__Alternatives : ( ( ( 'PKFK' ) ) | ( ( 'UNIQUE' ) ) | ( ( 'NOTNULL' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:308:1: ( ( ( 'PKFK' ) ) | ( ( 'UNIQUE' ) ) | ( ( 'NOTNULL' ) ) )
            int alt3=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDbase.g:309:2: ( ( 'PKFK' ) )
                    {
                    // InternalDbase.g:309:2: ( ( 'PKFK' ) )
                    // InternalDbase.g:310:3: ( 'PKFK' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getPKFKEnumLiteralDeclaration_0()); 
                    // InternalDbase.g:311:3: ( 'PKFK' )
                    // InternalDbase.g:311:4: 'PKFK'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getPKFKEnumLiteralDeclaration_0()); 

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
    // InternalDbase.g:331:1: rule__CardinalityType__Alternatives : ( ( ( 'OneToOne' ) ) | ( ( 'OneToMany' ) ) | ( ( 'ManyToMany' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:335:1: ( ( ( 'OneToOne' ) ) | ( ( 'OneToMany' ) ) | ( ( 'ManyToMany' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
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
                    // InternalDbase.g:336:2: ( ( 'OneToOne' ) )
                    {
                    // InternalDbase.g:336:2: ( ( 'OneToOne' ) )
                    // InternalDbase.g:337:3: ( 'OneToOne' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0()); 
                    // InternalDbase.g:338:3: ( 'OneToOne' )
                    // InternalDbase.g:338:4: 'OneToOne'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneToOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:342:2: ( ( 'OneToMany' ) )
                    {
                    // InternalDbase.g:342:2: ( ( 'OneToMany' ) )
                    // InternalDbase.g:343:3: ( 'OneToMany' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1()); 
                    // InternalDbase.g:344:3: ( 'OneToMany' )
                    // InternalDbase.g:344:4: 'OneToMany'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneToManyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:348:2: ( ( 'ManyToMany' ) )
                    {
                    // InternalDbase.g:348:2: ( ( 'ManyToMany' ) )
                    // InternalDbase.g:349:3: ( 'ManyToMany' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyToManyEnumLiteralDeclaration_2()); 
                    // InternalDbase.g:350:3: ( 'ManyToMany' )
                    // InternalDbase.g:350:4: 'ManyToMany'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalDbase.g:358:1: rule__DbaseModel__Group__0 : rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 ;
    public final void rule__DbaseModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:362:1: ( rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 )
            // InternalDbase.g:363:2: rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1
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
    // InternalDbase.g:370:1: rule__DbaseModel__Group__0__Impl : ( () ) ;
    public final void rule__DbaseModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:374:1: ( ( () ) )
            // InternalDbase.g:375:1: ( () )
            {
            // InternalDbase.g:375:1: ( () )
            // InternalDbase.g:376:2: ()
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelAction_0()); 
            // InternalDbase.g:377:2: ()
            // InternalDbase.g:377:3: 
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
    // InternalDbase.g:385:1: rule__DbaseModel__Group__1 : rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 ;
    public final void rule__DbaseModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:389:1: ( rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 )
            // InternalDbase.g:390:2: rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2
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
    // InternalDbase.g:397:1: rule__DbaseModel__Group__1__Impl : ( 'DbaseModel' ) ;
    public final void rule__DbaseModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:401:1: ( ( 'DbaseModel' ) )
            // InternalDbase.g:402:1: ( 'DbaseModel' )
            {
            // InternalDbase.g:402:1: ( 'DbaseModel' )
            // InternalDbase.g:403:2: 'DbaseModel'
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDbase.g:412:1: rule__DbaseModel__Group__2 : rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 ;
    public final void rule__DbaseModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:416:1: ( rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 )
            // InternalDbase.g:417:2: rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3
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
    // InternalDbase.g:424:1: rule__DbaseModel__Group__2__Impl : ( ( rule__DbaseModel__NameAssignment_2 ) ) ;
    public final void rule__DbaseModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:428:1: ( ( ( rule__DbaseModel__NameAssignment_2 ) ) )
            // InternalDbase.g:429:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            {
            // InternalDbase.g:429:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            // InternalDbase.g:430:2: ( rule__DbaseModel__NameAssignment_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getNameAssignment_2()); 
            // InternalDbase.g:431:2: ( rule__DbaseModel__NameAssignment_2 )
            // InternalDbase.g:431:3: rule__DbaseModel__NameAssignment_2
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
    // InternalDbase.g:439:1: rule__DbaseModel__Group__3 : rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 ;
    public final void rule__DbaseModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:443:1: ( rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 )
            // InternalDbase.g:444:2: rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4
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
    // InternalDbase.g:451:1: rule__DbaseModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:455:1: ( ( '{' ) )
            // InternalDbase.g:456:1: ( '{' )
            {
            // InternalDbase.g:456:1: ( '{' )
            // InternalDbase.g:457:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:466:1: rule__DbaseModel__Group__4 : rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 ;
    public final void rule__DbaseModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:470:1: ( rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 )
            // InternalDbase.g:471:2: rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5
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
    // InternalDbase.g:478:1: rule__DbaseModel__Group__4__Impl : ( ( rule__DbaseModel__Group_4__0 )? ) ;
    public final void rule__DbaseModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:482:1: ( ( ( rule__DbaseModel__Group_4__0 )? ) )
            // InternalDbase.g:483:1: ( ( rule__DbaseModel__Group_4__0 )? )
            {
            // InternalDbase.g:483:1: ( ( rule__DbaseModel__Group_4__0 )? )
            // InternalDbase.g:484:2: ( rule__DbaseModel__Group_4__0 )?
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4()); 
            // InternalDbase.g:485:2: ( rule__DbaseModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbase.g:485:3: rule__DbaseModel__Group_4__0
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
    // InternalDbase.g:493:1: rule__DbaseModel__Group__5 : rule__DbaseModel__Group__5__Impl ;
    public final void rule__DbaseModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:497:1: ( rule__DbaseModel__Group__5__Impl )
            // InternalDbase.g:498:2: rule__DbaseModel__Group__5__Impl
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
    // InternalDbase.g:504:1: rule__DbaseModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:508:1: ( ( '}' ) )
            // InternalDbase.g:509:1: ( '}' )
            {
            // InternalDbase.g:509:1: ( '}' )
            // InternalDbase.g:510:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:520:1: rule__DbaseModel__Group_4__0 : rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 ;
    public final void rule__DbaseModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:524:1: ( rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 )
            // InternalDbase.g:525:2: rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1
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
    // InternalDbase.g:532:1: rule__DbaseModel__Group_4__0__Impl : ( 'tables' ) ;
    public final void rule__DbaseModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:536:1: ( ( 'tables' ) )
            // InternalDbase.g:537:1: ( 'tables' )
            {
            // InternalDbase.g:537:1: ( 'tables' )
            // InternalDbase.g:538:2: 'tables'
            {
             before(grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDbase.g:547:1: rule__DbaseModel__Group_4__1 : rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 ;
    public final void rule__DbaseModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:551:1: ( rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 )
            // InternalDbase.g:552:2: rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2
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
    // InternalDbase.g:559:1: rule__DbaseModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:563:1: ( ( '{' ) )
            // InternalDbase.g:564:1: ( '{' )
            {
            // InternalDbase.g:564:1: ( '{' )
            // InternalDbase.g:565:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:574:1: rule__DbaseModel__Group_4__2 : rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 ;
    public final void rule__DbaseModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:578:1: ( rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 )
            // InternalDbase.g:579:2: rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3
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
    // InternalDbase.g:586:1: rule__DbaseModel__Group_4__2__Impl : ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) ;
    public final void rule__DbaseModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:590:1: ( ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) )
            // InternalDbase.g:591:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            {
            // InternalDbase.g:591:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            // InternalDbase.g:592:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_2()); 
            // InternalDbase.g:593:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            // InternalDbase.g:593:3: rule__DbaseModel__TablesAssignment_4_2
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
    // InternalDbase.g:601:1: rule__DbaseModel__Group_4__3 : rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 ;
    public final void rule__DbaseModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:605:1: ( rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 )
            // InternalDbase.g:606:2: rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4
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
    // InternalDbase.g:613:1: rule__DbaseModel__Group_4__3__Impl : ( ( rule__DbaseModel__Group_4_3__0 )* ) ;
    public final void rule__DbaseModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:617:1: ( ( ( rule__DbaseModel__Group_4_3__0 )* ) )
            // InternalDbase.g:618:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            {
            // InternalDbase.g:618:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            // InternalDbase.g:619:2: ( rule__DbaseModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4_3()); 
            // InternalDbase.g:620:2: ( rule__DbaseModel__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDbase.g:620:3: rule__DbaseModel__Group_4_3__0
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
    // InternalDbase.g:628:1: rule__DbaseModel__Group_4__4 : rule__DbaseModel__Group_4__4__Impl ;
    public final void rule__DbaseModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:632:1: ( rule__DbaseModel__Group_4__4__Impl )
            // InternalDbase.g:633:2: rule__DbaseModel__Group_4__4__Impl
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
    // InternalDbase.g:639:1: rule__DbaseModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:643:1: ( ( '}' ) )
            // InternalDbase.g:644:1: ( '}' )
            {
            // InternalDbase.g:644:1: ( '}' )
            // InternalDbase.g:645:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:655:1: rule__DbaseModel__Group_4_3__0 : rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 ;
    public final void rule__DbaseModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:659:1: ( rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 )
            // InternalDbase.g:660:2: rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1
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
    // InternalDbase.g:667:1: rule__DbaseModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DbaseModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:671:1: ( ( ',' ) )
            // InternalDbase.g:672:1: ( ',' )
            {
            // InternalDbase.g:672:1: ( ',' )
            // InternalDbase.g:673:2: ','
            {
             before(grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDbase.g:682:1: rule__DbaseModel__Group_4_3__1 : rule__DbaseModel__Group_4_3__1__Impl ;
    public final void rule__DbaseModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:686:1: ( rule__DbaseModel__Group_4_3__1__Impl )
            // InternalDbase.g:687:2: rule__DbaseModel__Group_4_3__1__Impl
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
    // InternalDbase.g:693:1: rule__DbaseModel__Group_4_3__1__Impl : ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) ;
    public final void rule__DbaseModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:697:1: ( ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) )
            // InternalDbase.g:698:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            {
            // InternalDbase.g:698:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            // InternalDbase.g:699:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_3_1()); 
            // InternalDbase.g:700:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            // InternalDbase.g:700:3: rule__DbaseModel__TablesAssignment_4_3_1
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
    // InternalDbase.g:709:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:713:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDbase.g:714:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalDbase.g:721:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:725:1: ( ( () ) )
            // InternalDbase.g:726:1: ( () )
            {
            // InternalDbase.g:726:1: ( () )
            // InternalDbase.g:727:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalDbase.g:728:2: ()
            // InternalDbase.g:728:3: 
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
    // InternalDbase.g:736:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:740:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalDbase.g:741:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalDbase.g:748:1: rule__Table__Group__1__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:752:1: ( ( 'Table' ) )
            // InternalDbase.g:753:1: ( 'Table' )
            {
            // InternalDbase.g:753:1: ( 'Table' )
            // InternalDbase.g:754:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDbase.g:763:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:767:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalDbase.g:768:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalDbase.g:775:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:779:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalDbase.g:780:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalDbase.g:780:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalDbase.g:781:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalDbase.g:782:2: ( rule__Table__NameAssignment_2 )
            // InternalDbase.g:782:3: rule__Table__NameAssignment_2
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
    // InternalDbase.g:790:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:794:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalDbase.g:795:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalDbase.g:802:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:806:1: ( ( '{' ) )
            // InternalDbase.g:807:1: ( '{' )
            {
            // InternalDbase.g:807:1: ( '{' )
            // InternalDbase.g:808:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:817:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:821:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalDbase.g:822:2: rule__Table__Group__4__Impl rule__Table__Group__5
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
    // InternalDbase.g:829:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:833:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalDbase.g:834:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalDbase.g:834:1: ( ( rule__Table__Group_4__0 )? )
            // InternalDbase.g:835:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalDbase.g:836:2: ( rule__Table__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDbase.g:836:3: rule__Table__Group_4__0
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
    // InternalDbase.g:844:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:848:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalDbase.g:849:2: rule__Table__Group__5__Impl rule__Table__Group__6
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
    // InternalDbase.g:856:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:860:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalDbase.g:861:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalDbase.g:861:1: ( ( rule__Table__Group_5__0 )? )
            // InternalDbase.g:862:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalDbase.g:863:2: ( rule__Table__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbase.g:863:3: rule__Table__Group_5__0
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
    // InternalDbase.g:871:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:875:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // InternalDbase.g:876:2: rule__Table__Group__6__Impl rule__Table__Group__7
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
    // InternalDbase.g:883:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )? ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:887:1: ( ( ( rule__Table__Group_6__0 )? ) )
            // InternalDbase.g:888:1: ( ( rule__Table__Group_6__0 )? )
            {
            // InternalDbase.g:888:1: ( ( rule__Table__Group_6__0 )? )
            // InternalDbase.g:889:2: ( rule__Table__Group_6__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_6()); 
            // InternalDbase.g:890:2: ( rule__Table__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDbase.g:890:3: rule__Table__Group_6__0
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
    // InternalDbase.g:898:1: rule__Table__Group__7 : rule__Table__Group__7__Impl ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:902:1: ( rule__Table__Group__7__Impl )
            // InternalDbase.g:903:2: rule__Table__Group__7__Impl
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
    // InternalDbase.g:909:1: rule__Table__Group__7__Impl : ( '}' ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:913:1: ( ( '}' ) )
            // InternalDbase.g:914:1: ( '}' )
            {
            // InternalDbase.g:914:1: ( '}' )
            // InternalDbase.g:915:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:925:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:929:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalDbase.g:930:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
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
    // InternalDbase.g:937:1: rule__Table__Group_4__0__Impl : ( 'entity' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:941:1: ( ( 'entity' ) )
            // InternalDbase.g:942:1: ( 'entity' )
            {
            // InternalDbase.g:942:1: ( 'entity' )
            // InternalDbase.g:943:2: 'entity'
            {
             before(grammarAccess.getTableAccess().getEntityKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDbase.g:952:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:956:1: ( rule__Table__Group_4__1__Impl )
            // InternalDbase.g:957:2: rule__Table__Group_4__1__Impl
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
    // InternalDbase.g:963:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__EntityAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:967:1: ( ( ( rule__Table__EntityAssignment_4_1 ) ) )
            // InternalDbase.g:968:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            {
            // InternalDbase.g:968:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            // InternalDbase.g:969:2: ( rule__Table__EntityAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getEntityAssignment_4_1()); 
            // InternalDbase.g:970:2: ( rule__Table__EntityAssignment_4_1 )
            // InternalDbase.g:970:3: rule__Table__EntityAssignment_4_1
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
    // InternalDbase.g:979:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:983:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalDbase.g:984:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
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
    // InternalDbase.g:991:1: rule__Table__Group_5__0__Impl : ( 'columns' ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:995:1: ( ( 'columns' ) )
            // InternalDbase.g:996:1: ( 'columns' )
            {
            // InternalDbase.g:996:1: ( 'columns' )
            // InternalDbase.g:997:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDbase.g:1006:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl rule__Table__Group_5__2 ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1010:1: ( rule__Table__Group_5__1__Impl rule__Table__Group_5__2 )
            // InternalDbase.g:1011:2: rule__Table__Group_5__1__Impl rule__Table__Group_5__2
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
    // InternalDbase.g:1018:1: rule__Table__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1022:1: ( ( '{' ) )
            // InternalDbase.g:1023:1: ( '{' )
            {
            // InternalDbase.g:1023:1: ( '{' )
            // InternalDbase.g:1024:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:1033:1: rule__Table__Group_5__2 : rule__Table__Group_5__2__Impl rule__Table__Group_5__3 ;
    public final void rule__Table__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1037:1: ( rule__Table__Group_5__2__Impl rule__Table__Group_5__3 )
            // InternalDbase.g:1038:2: rule__Table__Group_5__2__Impl rule__Table__Group_5__3
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
    // InternalDbase.g:1045:1: rule__Table__Group_5__2__Impl : ( ( rule__Table__ColumnsAssignment_5_2 ) ) ;
    public final void rule__Table__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1049:1: ( ( ( rule__Table__ColumnsAssignment_5_2 ) ) )
            // InternalDbase.g:1050:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            {
            // InternalDbase.g:1050:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            // InternalDbase.g:1051:2: ( rule__Table__ColumnsAssignment_5_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_2()); 
            // InternalDbase.g:1052:2: ( rule__Table__ColumnsAssignment_5_2 )
            // InternalDbase.g:1052:3: rule__Table__ColumnsAssignment_5_2
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
    // InternalDbase.g:1060:1: rule__Table__Group_5__3 : rule__Table__Group_5__3__Impl rule__Table__Group_5__4 ;
    public final void rule__Table__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1064:1: ( rule__Table__Group_5__3__Impl rule__Table__Group_5__4 )
            // InternalDbase.g:1065:2: rule__Table__Group_5__3__Impl rule__Table__Group_5__4
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
    // InternalDbase.g:1072:1: rule__Table__Group_5__3__Impl : ( ( rule__Table__Group_5_3__0 )* ) ;
    public final void rule__Table__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1076:1: ( ( ( rule__Table__Group_5_3__0 )* ) )
            // InternalDbase.g:1077:1: ( ( rule__Table__Group_5_3__0 )* )
            {
            // InternalDbase.g:1077:1: ( ( rule__Table__Group_5_3__0 )* )
            // InternalDbase.g:1078:2: ( rule__Table__Group_5_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_3()); 
            // InternalDbase.g:1079:2: ( rule__Table__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDbase.g:1079:3: rule__Table__Group_5_3__0
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
    // InternalDbase.g:1087:1: rule__Table__Group_5__4 : rule__Table__Group_5__4__Impl ;
    public final void rule__Table__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1091:1: ( rule__Table__Group_5__4__Impl )
            // InternalDbase.g:1092:2: rule__Table__Group_5__4__Impl
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
    // InternalDbase.g:1098:1: rule__Table__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1102:1: ( ( '}' ) )
            // InternalDbase.g:1103:1: ( '}' )
            {
            // InternalDbase.g:1103:1: ( '}' )
            // InternalDbase.g:1104:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:1114:1: rule__Table__Group_5_3__0 : rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 ;
    public final void rule__Table__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1118:1: ( rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 )
            // InternalDbase.g:1119:2: rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1
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
    // InternalDbase.g:1126:1: rule__Table__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1130:1: ( ( ',' ) )
            // InternalDbase.g:1131:1: ( ',' )
            {
            // InternalDbase.g:1131:1: ( ',' )
            // InternalDbase.g:1132:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDbase.g:1141:1: rule__Table__Group_5_3__1 : rule__Table__Group_5_3__1__Impl ;
    public final void rule__Table__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1145:1: ( rule__Table__Group_5_3__1__Impl )
            // InternalDbase.g:1146:2: rule__Table__Group_5_3__1__Impl
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
    // InternalDbase.g:1152:1: rule__Table__Group_5_3__1__Impl : ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) ;
    public final void rule__Table__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1156:1: ( ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) )
            // InternalDbase.g:1157:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            {
            // InternalDbase.g:1157:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            // InternalDbase.g:1158:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_3_1()); 
            // InternalDbase.g:1159:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            // InternalDbase.g:1159:3: rule__Table__ColumnsAssignment_5_3_1
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
    // InternalDbase.g:1168:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1172:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // InternalDbase.g:1173:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
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
    // InternalDbase.g:1180:1: rule__Table__Group_6__0__Impl : ( 'constraint' ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1184:1: ( ( 'constraint' ) )
            // InternalDbase.g:1185:1: ( 'constraint' )
            {
            // InternalDbase.g:1185:1: ( 'constraint' )
            // InternalDbase.g:1186:2: 'constraint'
            {
             before(grammarAccess.getTableAccess().getConstraintKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDbase.g:1195:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl rule__Table__Group_6__2 ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1199:1: ( rule__Table__Group_6__1__Impl rule__Table__Group_6__2 )
            // InternalDbase.g:1200:2: rule__Table__Group_6__1__Impl rule__Table__Group_6__2
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
    // InternalDbase.g:1207:1: rule__Table__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1211:1: ( ( '{' ) )
            // InternalDbase.g:1212:1: ( '{' )
            {
            // InternalDbase.g:1212:1: ( '{' )
            // InternalDbase.g:1213:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:1222:1: rule__Table__Group_6__2 : rule__Table__Group_6__2__Impl rule__Table__Group_6__3 ;
    public final void rule__Table__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1226:1: ( rule__Table__Group_6__2__Impl rule__Table__Group_6__3 )
            // InternalDbase.g:1227:2: rule__Table__Group_6__2__Impl rule__Table__Group_6__3
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
    // InternalDbase.g:1234:1: rule__Table__Group_6__2__Impl : ( ( rule__Table__ConstraintAssignment_6_2 ) ) ;
    public final void rule__Table__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1238:1: ( ( ( rule__Table__ConstraintAssignment_6_2 ) ) )
            // InternalDbase.g:1239:1: ( ( rule__Table__ConstraintAssignment_6_2 ) )
            {
            // InternalDbase.g:1239:1: ( ( rule__Table__ConstraintAssignment_6_2 ) )
            // InternalDbase.g:1240:2: ( rule__Table__ConstraintAssignment_6_2 )
            {
             before(grammarAccess.getTableAccess().getConstraintAssignment_6_2()); 
            // InternalDbase.g:1241:2: ( rule__Table__ConstraintAssignment_6_2 )
            // InternalDbase.g:1241:3: rule__Table__ConstraintAssignment_6_2
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
    // InternalDbase.g:1249:1: rule__Table__Group_6__3 : rule__Table__Group_6__3__Impl rule__Table__Group_6__4 ;
    public final void rule__Table__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1253:1: ( rule__Table__Group_6__3__Impl rule__Table__Group_6__4 )
            // InternalDbase.g:1254:2: rule__Table__Group_6__3__Impl rule__Table__Group_6__4
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
    // InternalDbase.g:1261:1: rule__Table__Group_6__3__Impl : ( ( rule__Table__Group_6_3__0 )* ) ;
    public final void rule__Table__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1265:1: ( ( ( rule__Table__Group_6_3__0 )* ) )
            // InternalDbase.g:1266:1: ( ( rule__Table__Group_6_3__0 )* )
            {
            // InternalDbase.g:1266:1: ( ( rule__Table__Group_6_3__0 )* )
            // InternalDbase.g:1267:2: ( rule__Table__Group_6_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_6_3()); 
            // InternalDbase.g:1268:2: ( rule__Table__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDbase.g:1268:3: rule__Table__Group_6_3__0
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
    // InternalDbase.g:1276:1: rule__Table__Group_6__4 : rule__Table__Group_6__4__Impl ;
    public final void rule__Table__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1280:1: ( rule__Table__Group_6__4__Impl )
            // InternalDbase.g:1281:2: rule__Table__Group_6__4__Impl
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
    // InternalDbase.g:1287:1: rule__Table__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1291:1: ( ( '}' ) )
            // InternalDbase.g:1292:1: ( '}' )
            {
            // InternalDbase.g:1292:1: ( '}' )
            // InternalDbase.g:1293:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:1303:1: rule__Table__Group_6_3__0 : rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1 ;
    public final void rule__Table__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1307:1: ( rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1 )
            // InternalDbase.g:1308:2: rule__Table__Group_6_3__0__Impl rule__Table__Group_6_3__1
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
    // InternalDbase.g:1315:1: rule__Table__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1319:1: ( ( ',' ) )
            // InternalDbase.g:1320:1: ( ',' )
            {
            // InternalDbase.g:1320:1: ( ',' )
            // InternalDbase.g:1321:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_6_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDbase.g:1330:1: rule__Table__Group_6_3__1 : rule__Table__Group_6_3__1__Impl ;
    public final void rule__Table__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1334:1: ( rule__Table__Group_6_3__1__Impl )
            // InternalDbase.g:1335:2: rule__Table__Group_6_3__1__Impl
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
    // InternalDbase.g:1341:1: rule__Table__Group_6_3__1__Impl : ( ( rule__Table__ConstraintAssignment_6_3_1 ) ) ;
    public final void rule__Table__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1345:1: ( ( ( rule__Table__ConstraintAssignment_6_3_1 ) ) )
            // InternalDbase.g:1346:1: ( ( rule__Table__ConstraintAssignment_6_3_1 ) )
            {
            // InternalDbase.g:1346:1: ( ( rule__Table__ConstraintAssignment_6_3_1 ) )
            // InternalDbase.g:1347:2: ( rule__Table__ConstraintAssignment_6_3_1 )
            {
             before(grammarAccess.getTableAccess().getConstraintAssignment_6_3_1()); 
            // InternalDbase.g:1348:2: ( rule__Table__ConstraintAssignment_6_3_1 )
            // InternalDbase.g:1348:3: rule__Table__ConstraintAssignment_6_3_1
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
    // InternalDbase.g:1357:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1361:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalDbase.g:1362:2: rule__Column__Group__0__Impl rule__Column__Group__1
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
    // InternalDbase.g:1369:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1373:1: ( ( () ) )
            // InternalDbase.g:1374:1: ( () )
            {
            // InternalDbase.g:1374:1: ( () )
            // InternalDbase.g:1375:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalDbase.g:1376:2: ()
            // InternalDbase.g:1376:3: 
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
    // InternalDbase.g:1384:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1388:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalDbase.g:1389:2: rule__Column__Group__1__Impl rule__Column__Group__2
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
    // InternalDbase.g:1396:1: rule__Column__Group__1__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1400:1: ( ( 'Column' ) )
            // InternalDbase.g:1401:1: ( 'Column' )
            {
            // InternalDbase.g:1401:1: ( 'Column' )
            // InternalDbase.g:1402:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDbase.g:1411:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1415:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalDbase.g:1416:2: rule__Column__Group__2__Impl rule__Column__Group__3
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
    // InternalDbase.g:1423:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1427:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalDbase.g:1428:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalDbase.g:1428:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalDbase.g:1429:2: ( rule__Column__NameAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            // InternalDbase.g:1430:2: ( rule__Column__NameAssignment_2 )
            // InternalDbase.g:1430:3: rule__Column__NameAssignment_2
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
    // InternalDbase.g:1438:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1442:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalDbase.g:1443:2: rule__Column__Group__3__Impl rule__Column__Group__4
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
    // InternalDbase.g:1450:1: rule__Column__Group__3__Impl : ( '{' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1454:1: ( ( '{' ) )
            // InternalDbase.g:1455:1: ( '{' )
            {
            // InternalDbase.g:1455:1: ( '{' )
            // InternalDbase.g:1456:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:1465:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1469:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalDbase.g:1470:2: rule__Column__Group__4__Impl rule__Column__Group__5
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
    // InternalDbase.g:1477:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1481:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalDbase.g:1482:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalDbase.g:1482:1: ( ( rule__Column__Group_4__0 )? )
            // InternalDbase.g:1483:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalDbase.g:1484:2: ( rule__Column__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDbase.g:1484:3: rule__Column__Group_4__0
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
    // InternalDbase.g:1492:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1496:1: ( rule__Column__Group__5__Impl )
            // InternalDbase.g:1497:2: rule__Column__Group__5__Impl
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
    // InternalDbase.g:1503:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1507:1: ( ( '}' ) )
            // InternalDbase.g:1508:1: ( '}' )
            {
            // InternalDbase.g:1508:1: ( '}' )
            // InternalDbase.g:1509:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:1519:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1523:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalDbase.g:1524:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
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
    // InternalDbase.g:1531:1: rule__Column__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1535:1: ( ( 'type' ) )
            // InternalDbase.g:1536:1: ( 'type' )
            {
            // InternalDbase.g:1536:1: ( 'type' )
            // InternalDbase.g:1537:2: 'type'
            {
             before(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDbase.g:1546:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1550:1: ( rule__Column__Group_4__1__Impl )
            // InternalDbase.g:1551:2: rule__Column__Group_4__1__Impl
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
    // InternalDbase.g:1557:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__TypeAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1561:1: ( ( ( rule__Column__TypeAssignment_4_1 ) ) )
            // InternalDbase.g:1562:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            {
            // InternalDbase.g:1562:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            // InternalDbase.g:1563:2: ( rule__Column__TypeAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 
            // InternalDbase.g:1564:2: ( rule__Column__TypeAssignment_4_1 )
            // InternalDbase.g:1564:3: rule__Column__TypeAssignment_4_1
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
    // InternalDbase.g:1573:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1577:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDbase.g:1578:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalDbase.g:1585:1: rule__Constraint__Group__0__Impl : ( 'Constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1589:1: ( ( 'Constraint' ) )
            // InternalDbase.g:1590:1: ( 'Constraint' )
            {
            // InternalDbase.g:1590:1: ( 'Constraint' )
            // InternalDbase.g:1591:2: 'Constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDbase.g:1600:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1604:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDbase.g:1605:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalDbase.g:1612:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1616:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDbase.g:1617:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDbase.g:1617:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDbase.g:1618:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalDbase.g:1619:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDbase.g:1619:3: rule__Constraint__NameAssignment_1
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
    // InternalDbase.g:1627:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1631:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDbase.g:1632:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
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
    // InternalDbase.g:1639:1: rule__Constraint__Group__2__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1643:1: ( ( '{' ) )
            // InternalDbase.g:1644:1: ( '{' )
            {
            // InternalDbase.g:1644:1: ( '{' )
            // InternalDbase.g:1645:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:1654:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1658:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDbase.g:1659:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalDbase.g:1666:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__Group_3__0 )? ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1670:1: ( ( ( rule__Constraint__Group_3__0 )? ) )
            // InternalDbase.g:1671:1: ( ( rule__Constraint__Group_3__0 )? )
            {
            // InternalDbase.g:1671:1: ( ( rule__Constraint__Group_3__0 )? )
            // InternalDbase.g:1672:2: ( rule__Constraint__Group_3__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_3()); 
            // InternalDbase.g:1673:2: ( rule__Constraint__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDbase.g:1673:3: rule__Constraint__Group_3__0
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
    // InternalDbase.g:1681:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1685:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalDbase.g:1686:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
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
    // InternalDbase.g:1693:1: rule__Constraint__Group__4__Impl : ( 'column' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1697:1: ( ( 'column' ) )
            // InternalDbase.g:1698:1: ( 'column' )
            {
            // InternalDbase.g:1698:1: ( 'column' )
            // InternalDbase.g:1699:2: 'column'
            {
             before(grammarAccess.getConstraintAccess().getColumnKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDbase.g:1708:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1712:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // InternalDbase.g:1713:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
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
    // InternalDbase.g:1720:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__ColumnAssignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1724:1: ( ( ( rule__Constraint__ColumnAssignment_5 ) ) )
            // InternalDbase.g:1725:1: ( ( rule__Constraint__ColumnAssignment_5 ) )
            {
            // InternalDbase.g:1725:1: ( ( rule__Constraint__ColumnAssignment_5 ) )
            // InternalDbase.g:1726:2: ( rule__Constraint__ColumnAssignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getColumnAssignment_5()); 
            // InternalDbase.g:1727:2: ( rule__Constraint__ColumnAssignment_5 )
            // InternalDbase.g:1727:3: rule__Constraint__ColumnAssignment_5
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
    // InternalDbase.g:1735:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1739:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // InternalDbase.g:1740:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalDbase.g:1747:1: rule__Constraint__Group__6__Impl : ( 'relationship' ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1751:1: ( ( 'relationship' ) )
            // InternalDbase.g:1752:1: ( 'relationship' )
            {
            // InternalDbase.g:1752:1: ( 'relationship' )
            // InternalDbase.g:1753:2: 'relationship'
            {
             before(grammarAccess.getConstraintAccess().getRelationshipKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRelationshipKeyword_6()); 

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
    // InternalDbase.g:1762:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1766:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // InternalDbase.g:1767:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__8();

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
    // InternalDbase.g:1774:1: rule__Constraint__Group__7__Impl : ( ( rule__Constraint__RelationshipAssignment_7 ) ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1778:1: ( ( ( rule__Constraint__RelationshipAssignment_7 ) ) )
            // InternalDbase.g:1779:1: ( ( rule__Constraint__RelationshipAssignment_7 ) )
            {
            // InternalDbase.g:1779:1: ( ( rule__Constraint__RelationshipAssignment_7 ) )
            // InternalDbase.g:1780:2: ( rule__Constraint__RelationshipAssignment_7 )
            {
             before(grammarAccess.getConstraintAccess().getRelationshipAssignment_7()); 
            // InternalDbase.g:1781:2: ( rule__Constraint__RelationshipAssignment_7 )
            // InternalDbase.g:1781:3: rule__Constraint__RelationshipAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__RelationshipAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getRelationshipAssignment_7()); 

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


    // $ANTLR start "rule__Constraint__Group__8"
    // InternalDbase.g:1789:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1793:1: ( rule__Constraint__Group__8__Impl )
            // InternalDbase.g:1794:2: rule__Constraint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__8__Impl();

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
    // $ANTLR end "rule__Constraint__Group__8"


    // $ANTLR start "rule__Constraint__Group__8__Impl"
    // InternalDbase.g:1800:1: rule__Constraint__Group__8__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1804:1: ( ( '}' ) )
            // InternalDbase.g:1805:1: ( '}' )
            {
            // InternalDbase.g:1805:1: ( '}' )
            // InternalDbase.g:1806:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Constraint__Group__8__Impl"


    // $ANTLR start "rule__Constraint__Group_3__0"
    // InternalDbase.g:1816:1: rule__Constraint__Group_3__0 : rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 ;
    public final void rule__Constraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1820:1: ( rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 )
            // InternalDbase.g:1821:2: rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDbase.g:1828:1: rule__Constraint__Group_3__0__Impl : ( 'constraintType' ) ;
    public final void rule__Constraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1832:1: ( ( 'constraintType' ) )
            // InternalDbase.g:1833:1: ( 'constraintType' )
            {
            // InternalDbase.g:1833:1: ( 'constraintType' )
            // InternalDbase.g:1834:2: 'constraintType'
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
    // InternalDbase.g:1843:1: rule__Constraint__Group_3__1 : rule__Constraint__Group_3__1__Impl ;
    public final void rule__Constraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1847:1: ( rule__Constraint__Group_3__1__Impl )
            // InternalDbase.g:1848:2: rule__Constraint__Group_3__1__Impl
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
    // InternalDbase.g:1854:1: rule__Constraint__Group_3__1__Impl : ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) ) ;
    public final void rule__Constraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1858:1: ( ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) ) )
            // InternalDbase.g:1859:1: ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) )
            {
            // InternalDbase.g:1859:1: ( ( rule__Constraint__ConstraintTypeAssignment_3_1 ) )
            // InternalDbase.g:1860:2: ( rule__Constraint__ConstraintTypeAssignment_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_3_1()); 
            // InternalDbase.g:1861:2: ( rule__Constraint__ConstraintTypeAssignment_3_1 )
            // InternalDbase.g:1861:3: rule__Constraint__ConstraintTypeAssignment_3_1
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


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalDbase.g:1870:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1874:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalDbase.g:1875:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
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
    // InternalDbase.g:1882:1: rule__Relationship__Group__0__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1886:1: ( ( 'Relationship' ) )
            // InternalDbase.g:1887:1: ( 'Relationship' )
            {
            // InternalDbase.g:1887:1: ( 'Relationship' )
            // InternalDbase.g:1888:2: 'Relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDbase.g:1897:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1901:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalDbase.g:1902:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDbase.g:1909:1: rule__Relationship__Group__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1913:1: ( ( '{' ) )
            // InternalDbase.g:1914:1: ( '{' )
            {
            // InternalDbase.g:1914:1: ( '{' )
            // InternalDbase.g:1915:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDbase.g:1924:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1928:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalDbase.g:1929:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDbase.g:1936:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__Group_2__0 )? ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1940:1: ( ( ( rule__Relationship__Group_2__0 )? ) )
            // InternalDbase.g:1941:1: ( ( rule__Relationship__Group_2__0 )? )
            {
            // InternalDbase.g:1941:1: ( ( rule__Relationship__Group_2__0 )? )
            // InternalDbase.g:1942:2: ( rule__Relationship__Group_2__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_2()); 
            // InternalDbase.g:1943:2: ( rule__Relationship__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDbase.g:1943:3: rule__Relationship__Group_2__0
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
    // InternalDbase.g:1951:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1955:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalDbase.g:1956:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
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
    // InternalDbase.g:1963:1: rule__Relationship__Group__3__Impl : ( 'table' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1967:1: ( ( 'table' ) )
            // InternalDbase.g:1968:1: ( 'table' )
            {
            // InternalDbase.g:1968:1: ( 'table' )
            // InternalDbase.g:1969:2: 'table'
            {
             before(grammarAccess.getRelationshipAccess().getTableKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDbase.g:1978:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1982:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalDbase.g:1983:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDbase.g:1990:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TableAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1994:1: ( ( ( rule__Relationship__TableAssignment_4 ) ) )
            // InternalDbase.g:1995:1: ( ( rule__Relationship__TableAssignment_4 ) )
            {
            // InternalDbase.g:1995:1: ( ( rule__Relationship__TableAssignment_4 ) )
            // InternalDbase.g:1996:2: ( rule__Relationship__TableAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTableAssignment_4()); 
            // InternalDbase.g:1997:2: ( rule__Relationship__TableAssignment_4 )
            // InternalDbase.g:1997:3: rule__Relationship__TableAssignment_4
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
    // InternalDbase.g:2005:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2009:1: ( rule__Relationship__Group__5__Impl )
            // InternalDbase.g:2010:2: rule__Relationship__Group__5__Impl
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
    // InternalDbase.g:2016:1: rule__Relationship__Group__5__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2020:1: ( ( '}' ) )
            // InternalDbase.g:2021:1: ( '}' )
            {
            // InternalDbase.g:2021:1: ( '}' )
            // InternalDbase.g:2022:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDbase.g:2032:1: rule__Relationship__Group_2__0 : rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1 ;
    public final void rule__Relationship__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2036:1: ( rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1 )
            // InternalDbase.g:2037:2: rule__Relationship__Group_2__0__Impl rule__Relationship__Group_2__1
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
    // InternalDbase.g:2044:1: rule__Relationship__Group_2__0__Impl : ( 'cardinalityType' ) ;
    public final void rule__Relationship__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2048:1: ( ( 'cardinalityType' ) )
            // InternalDbase.g:2049:1: ( 'cardinalityType' )
            {
            // InternalDbase.g:2049:1: ( 'cardinalityType' )
            // InternalDbase.g:2050:2: 'cardinalityType'
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityTypeKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDbase.g:2059:1: rule__Relationship__Group_2__1 : rule__Relationship__Group_2__1__Impl ;
    public final void rule__Relationship__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2063:1: ( rule__Relationship__Group_2__1__Impl )
            // InternalDbase.g:2064:2: rule__Relationship__Group_2__1__Impl
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
    // InternalDbase.g:2070:1: rule__Relationship__Group_2__1__Impl : ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) ) ;
    public final void rule__Relationship__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2074:1: ( ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) ) )
            // InternalDbase.g:2075:1: ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) )
            {
            // InternalDbase.g:2075:1: ( ( rule__Relationship__CardinalityTypeAssignment_2_1 ) )
            // InternalDbase.g:2076:2: ( rule__Relationship__CardinalityTypeAssignment_2_1 )
            {
             before(grammarAccess.getRelationshipAccess().getCardinalityTypeAssignment_2_1()); 
            // InternalDbase.g:2077:2: ( rule__Relationship__CardinalityTypeAssignment_2_1 )
            // InternalDbase.g:2077:3: rule__Relationship__CardinalityTypeAssignment_2_1
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
    // InternalDbase.g:2086:1: rule__DbaseModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DbaseModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2090:1: ( ( ruleEString ) )
            // InternalDbase.g:2091:2: ( ruleEString )
            {
            // InternalDbase.g:2091:2: ( ruleEString )
            // InternalDbase.g:2092:3: ruleEString
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
    // InternalDbase.g:2101:1: rule__DbaseModel__TablesAssignment_4_2 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2105:1: ( ( ruleTable ) )
            // InternalDbase.g:2106:2: ( ruleTable )
            {
            // InternalDbase.g:2106:2: ( ruleTable )
            // InternalDbase.g:2107:3: ruleTable
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
    // InternalDbase.g:2116:1: rule__DbaseModel__TablesAssignment_4_3_1 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2120:1: ( ( ruleTable ) )
            // InternalDbase.g:2121:2: ( ruleTable )
            {
            // InternalDbase.g:2121:2: ( ruleTable )
            // InternalDbase.g:2122:3: ruleTable
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
    // InternalDbase.g:2131:1: rule__Table__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2135:1: ( ( ruleEString ) )
            // InternalDbase.g:2136:2: ( ruleEString )
            {
            // InternalDbase.g:2136:2: ( ruleEString )
            // InternalDbase.g:2137:3: ruleEString
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
    // InternalDbase.g:2146:1: rule__Table__EntityAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Table__EntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2150:1: ( ( ruleEString ) )
            // InternalDbase.g:2151:2: ( ruleEString )
            {
            // InternalDbase.g:2151:2: ( ruleEString )
            // InternalDbase.g:2152:3: ruleEString
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
    // InternalDbase.g:2161:1: rule__Table__ColumnsAssignment_5_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2165:1: ( ( ruleColumn ) )
            // InternalDbase.g:2166:2: ( ruleColumn )
            {
            // InternalDbase.g:2166:2: ( ruleColumn )
            // InternalDbase.g:2167:3: ruleColumn
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
    // InternalDbase.g:2176:1: rule__Table__ColumnsAssignment_5_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2180:1: ( ( ruleColumn ) )
            // InternalDbase.g:2181:2: ( ruleColumn )
            {
            // InternalDbase.g:2181:2: ( ruleColumn )
            // InternalDbase.g:2182:3: ruleColumn
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
    // InternalDbase.g:2191:1: rule__Table__ConstraintAssignment_6_2 : ( ruleConstraint ) ;
    public final void rule__Table__ConstraintAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2195:1: ( ( ruleConstraint ) )
            // InternalDbase.g:2196:2: ( ruleConstraint )
            {
            // InternalDbase.g:2196:2: ( ruleConstraint )
            // InternalDbase.g:2197:3: ruleConstraint
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
    // InternalDbase.g:2206:1: rule__Table__ConstraintAssignment_6_3_1 : ( ruleConstraint ) ;
    public final void rule__Table__ConstraintAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2210:1: ( ( ruleConstraint ) )
            // InternalDbase.g:2211:2: ( ruleConstraint )
            {
            // InternalDbase.g:2211:2: ( ruleConstraint )
            // InternalDbase.g:2212:3: ruleConstraint
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
    // InternalDbase.g:2221:1: rule__Column__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2225:1: ( ( ruleEString ) )
            // InternalDbase.g:2226:2: ( ruleEString )
            {
            // InternalDbase.g:2226:2: ( ruleEString )
            // InternalDbase.g:2227:3: ruleEString
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
    // InternalDbase.g:2236:1: rule__Column__TypeAssignment_4_1 : ( ruleColumnType ) ;
    public final void rule__Column__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2240:1: ( ( ruleColumnType ) )
            // InternalDbase.g:2241:2: ( ruleColumnType )
            {
            // InternalDbase.g:2241:2: ( ruleColumnType )
            // InternalDbase.g:2242:3: ruleColumnType
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
    // InternalDbase.g:2251:1: rule__Constraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2255:1: ( ( ruleEString ) )
            // InternalDbase.g:2256:2: ( ruleEString )
            {
            // InternalDbase.g:2256:2: ( ruleEString )
            // InternalDbase.g:2257:3: ruleEString
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
    // InternalDbase.g:2266:1: rule__Constraint__ConstraintTypeAssignment_3_1 : ( ruleConstraintType ) ;
    public final void rule__Constraint__ConstraintTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2270:1: ( ( ruleConstraintType ) )
            // InternalDbase.g:2271:2: ( ruleConstraintType )
            {
            // InternalDbase.g:2271:2: ( ruleConstraintType )
            // InternalDbase.g:2272:3: ruleConstraintType
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
    // InternalDbase.g:2281:1: rule__Constraint__ColumnAssignment_5 : ( ruleColumn ) ;
    public final void rule__Constraint__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2285:1: ( ( ruleColumn ) )
            // InternalDbase.g:2286:2: ( ruleColumn )
            {
            // InternalDbase.g:2286:2: ( ruleColumn )
            // InternalDbase.g:2287:3: ruleColumn
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


    // $ANTLR start "rule__Constraint__RelationshipAssignment_7"
    // InternalDbase.g:2296:1: rule__Constraint__RelationshipAssignment_7 : ( ruleRelationship ) ;
    public final void rule__Constraint__RelationshipAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2300:1: ( ( ruleRelationship ) )
            // InternalDbase.g:2301:2: ( ruleRelationship )
            {
            // InternalDbase.g:2301:2: ( ruleRelationship )
            // InternalDbase.g:2302:3: ruleRelationship
            {
             before(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getRelationshipRelationshipParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Constraint__RelationshipAssignment_7"


    // $ANTLR start "rule__Relationship__CardinalityTypeAssignment_2_1"
    // InternalDbase.g:2311:1: rule__Relationship__CardinalityTypeAssignment_2_1 : ( ruleCardinalityType ) ;
    public final void rule__Relationship__CardinalityTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2315:1: ( ( ruleCardinalityType ) )
            // InternalDbase.g:2316:2: ( ruleCardinalityType )
            {
            // InternalDbase.g:2316:2: ( ruleCardinalityType )
            // InternalDbase.g:2317:3: ruleCardinalityType
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
    // InternalDbase.g:2326:1: rule__Relationship__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__Relationship__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:2330:1: ( ( ruleTable ) )
            // InternalDbase.g:2331:2: ( ruleTable )
            {
            // InternalDbase.g:2331:2: ( ruleTable )
            // InternalDbase.g:2332:3: ruleTable
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000038800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000001C0000L});

}
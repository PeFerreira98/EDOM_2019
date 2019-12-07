package pt.isep.edom.project.c3.dsl.ide.contentassist.antlr.internal;

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
import pt.isep.edom.project.c3.dsl.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'INTEGER'", "'REAL'", "'BOOL'", "'DomainModel'", "'{'", "'}'", "'entities'", "','", "'valueobject'", "'Entity'", "'fields'", "'references'", "'ValueObject'", "'field'", "'Field'", "'type'", "'Reference'", "'upperBound'", "'lowerBound'", "'entity'", "'-'", "'root'", "'isId'"
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

    	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModel"
    // InternalDomain.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalDomain.g:54:1: ( ruleDomainModel EOF )
            // InternalDomain.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomain.g:62:1: ruleDomainModel : ( ( rule__DomainModel__Group__0 ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:66:2: ( ( ( rule__DomainModel__Group__0 ) ) )
            // InternalDomain.g:67:2: ( ( rule__DomainModel__Group__0 ) )
            {
            // InternalDomain.g:67:2: ( ( rule__DomainModel__Group__0 ) )
            // InternalDomain.g:68:3: ( rule__DomainModel__Group__0 )
            {
             before(grammarAccess.getDomainModelAccess().getGroup()); 
            // InternalDomain.g:69:3: ( rule__DomainModel__Group__0 )
            // InternalDomain.g:69:4: rule__DomainModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEString"
    // InternalDomain.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDomain.g:79:1: ( ruleEString EOF )
            // InternalDomain.g:80:1: ruleEString EOF
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
    // InternalDomain.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDomain.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDomain.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDomain.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDomain.g:94:3: ( rule__EString__Alternatives )
            // InternalDomain.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEntity"
    // InternalDomain.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomain.g:104:1: ( ruleEntity EOF )
            // InternalDomain.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomain.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomain.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomain.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomain.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomain.g:119:3: ( rule__Entity__Group__0 )
            // InternalDomain.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleValueObject"
    // InternalDomain.g:128:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // InternalDomain.g:129:1: ( ruleValueObject EOF )
            // InternalDomain.g:130:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // InternalDomain.g:137:1: ruleValueObject : ( ( rule__ValueObject__Group__0 ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:141:2: ( ( ( rule__ValueObject__Group__0 ) ) )
            // InternalDomain.g:142:2: ( ( rule__ValueObject__Group__0 ) )
            {
            // InternalDomain.g:142:2: ( ( rule__ValueObject__Group__0 ) )
            // InternalDomain.g:143:3: ( rule__ValueObject__Group__0 )
            {
             before(grammarAccess.getValueObjectAccess().getGroup()); 
            // InternalDomain.g:144:3: ( rule__ValueObject__Group__0 )
            // InternalDomain.g:144:4: rule__ValueObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleField"
    // InternalDomain.g:153:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalDomain.g:154:1: ( ruleField EOF )
            // InternalDomain.g:155:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalDomain.g:162:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:166:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalDomain.g:167:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalDomain.g:167:2: ( ( rule__Field__Group__0 ) )
            // InternalDomain.g:168:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalDomain.g:169:3: ( rule__Field__Group__0 )
            // InternalDomain.g:169:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleReference"
    // InternalDomain.g:178:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDomain.g:179:1: ( ruleReference EOF )
            // InternalDomain.g:180:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomain.g:187:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:191:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDomain.g:192:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDomain.g:192:2: ( ( rule__Reference__Group__0 ) )
            // InternalDomain.g:193:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDomain.g:194:3: ( rule__Reference__Group__0 )
            // InternalDomain.g:194:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalDomain.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDomain.g:204:1: ( ruleEInt EOF )
            // InternalDomain.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDomain.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDomain.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDomain.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalDomain.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDomain.g:219:3: ( rule__EInt__Group__0 )
            // InternalDomain.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFieldType"
    // InternalDomain.g:228:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:232:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalDomain.g:233:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalDomain.g:233:2: ( ( rule__FieldType__Alternatives ) )
            // InternalDomain.g:234:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalDomain.g:235:3: ( rule__FieldType__Alternatives )
            // InternalDomain.g:235:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDomain.g:243:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:247:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDomain.g:248:2: ( RULE_STRING )
                    {
                    // InternalDomain.g:248:2: ( RULE_STRING )
                    // InternalDomain.g:249:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:254:2: ( RULE_ID )
                    {
                    // InternalDomain.g:254:2: ( RULE_ID )
                    // InternalDomain.g:255:3: RULE_ID
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


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalDomain.g:264:1: rule__FieldType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:268:1: ( ( ( 'STRING' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) )
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
                    // InternalDomain.g:269:2: ( ( 'STRING' ) )
                    {
                    // InternalDomain.g:269:2: ( ( 'STRING' ) )
                    // InternalDomain.g:270:3: ( 'STRING' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalDomain.g:271:3: ( 'STRING' )
                    // InternalDomain.g:271:4: 'STRING'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:275:2: ( ( 'INTEGER' ) )
                    {
                    // InternalDomain.g:275:2: ( ( 'INTEGER' ) )
                    // InternalDomain.g:276:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalDomain.g:277:3: ( 'INTEGER' )
                    // InternalDomain.g:277:4: 'INTEGER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:281:2: ( ( 'REAL' ) )
                    {
                    // InternalDomain.g:281:2: ( ( 'REAL' ) )
                    // InternalDomain.g:282:3: ( 'REAL' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDomain.g:283:3: ( 'REAL' )
                    // InternalDomain.g:283:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:287:2: ( ( 'BOOL' ) )
                    {
                    // InternalDomain.g:287:2: ( ( 'BOOL' ) )
                    // InternalDomain.g:288:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3()); 
                    // InternalDomain.g:289:3: ( 'BOOL' )
                    // InternalDomain.g:289:4: 'BOOL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBOOLEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__DomainModel__Group__0"
    // InternalDomain.g:297:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:301:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // InternalDomain.g:302:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__1();

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
    // $ANTLR end "rule__DomainModel__Group__0"


    // $ANTLR start "rule__DomainModel__Group__0__Impl"
    // InternalDomain.g:309:1: rule__DomainModel__Group__0__Impl : ( () ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:313:1: ( ( () ) )
            // InternalDomain.g:314:1: ( () )
            {
            // InternalDomain.g:314:1: ( () )
            // InternalDomain.g:315:2: ()
            {
             before(grammarAccess.getDomainModelAccess().getDomainModelAction_0()); 
            // InternalDomain.g:316:2: ()
            // InternalDomain.g:316:3: 
            {
            }

             after(grammarAccess.getDomainModelAccess().getDomainModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__0__Impl"


    // $ANTLR start "rule__DomainModel__Group__1"
    // InternalDomain.g:324:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:328:1: ( rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 )
            // InternalDomain.g:329:2: rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DomainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__2();

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
    // $ANTLR end "rule__DomainModel__Group__1"


    // $ANTLR start "rule__DomainModel__Group__1__Impl"
    // InternalDomain.g:336:1: rule__DomainModel__Group__1__Impl : ( 'DomainModel' ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:340:1: ( ( 'DomainModel' ) )
            // InternalDomain.g:341:1: ( 'DomainModel' )
            {
            // InternalDomain.g:341:1: ( 'DomainModel' )
            // InternalDomain.g:342:2: 'DomainModel'
            {
             before(grammarAccess.getDomainModelAccess().getDomainModelKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getDomainModelKeyword_1()); 

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
    // $ANTLR end "rule__DomainModel__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__Group__2"
    // InternalDomain.g:351:1: rule__DomainModel__Group__2 : rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 ;
    public final void rule__DomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:355:1: ( rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 )
            // InternalDomain.g:356:2: rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DomainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__3();

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
    // $ANTLR end "rule__DomainModel__Group__2"


    // $ANTLR start "rule__DomainModel__Group__2__Impl"
    // InternalDomain.g:363:1: rule__DomainModel__Group__2__Impl : ( ( rule__DomainModel__NameAssignment_2 ) ) ;
    public final void rule__DomainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:367:1: ( ( ( rule__DomainModel__NameAssignment_2 ) ) )
            // InternalDomain.g:368:1: ( ( rule__DomainModel__NameAssignment_2 ) )
            {
            // InternalDomain.g:368:1: ( ( rule__DomainModel__NameAssignment_2 ) )
            // InternalDomain.g:369:2: ( rule__DomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getDomainModelAccess().getNameAssignment_2()); 
            // InternalDomain.g:370:2: ( rule__DomainModel__NameAssignment_2 )
            // InternalDomain.g:370:3: rule__DomainModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DomainModel__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__Group__3"
    // InternalDomain.g:378:1: rule__DomainModel__Group__3 : rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 ;
    public final void rule__DomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:382:1: ( rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 )
            // InternalDomain.g:383:2: rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DomainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__4();

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
    // $ANTLR end "rule__DomainModel__Group__3"


    // $ANTLR start "rule__DomainModel__Group__3__Impl"
    // InternalDomain.g:390:1: rule__DomainModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:394:1: ( ( '{' ) )
            // InternalDomain.g:395:1: ( '{' )
            {
            // InternalDomain.g:395:1: ( '{' )
            // InternalDomain.g:396:2: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DomainModel__Group__3__Impl"


    // $ANTLR start "rule__DomainModel__Group__4"
    // InternalDomain.g:405:1: rule__DomainModel__Group__4 : rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 ;
    public final void rule__DomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:409:1: ( rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 )
            // InternalDomain.g:410:2: rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DomainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__5();

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
    // $ANTLR end "rule__DomainModel__Group__4"


    // $ANTLR start "rule__DomainModel__Group__4__Impl"
    // InternalDomain.g:417:1: rule__DomainModel__Group__4__Impl : ( ( rule__DomainModel__Group_4__0 )? ) ;
    public final void rule__DomainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:421:1: ( ( ( rule__DomainModel__Group_4__0 )? ) )
            // InternalDomain.g:422:1: ( ( rule__DomainModel__Group_4__0 )? )
            {
            // InternalDomain.g:422:1: ( ( rule__DomainModel__Group_4__0 )? )
            // InternalDomain.g:423:2: ( rule__DomainModel__Group_4__0 )?
            {
             before(grammarAccess.getDomainModelAccess().getGroup_4()); 
            // InternalDomain.g:424:2: ( rule__DomainModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomain.g:424:3: rule__DomainModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DomainModel__Group__4__Impl"


    // $ANTLR start "rule__DomainModel__Group__5"
    // InternalDomain.g:432:1: rule__DomainModel__Group__5 : rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 ;
    public final void rule__DomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:436:1: ( rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6 )
            // InternalDomain.g:437:2: rule__DomainModel__Group__5__Impl rule__DomainModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DomainModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__6();

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
    // $ANTLR end "rule__DomainModel__Group__5"


    // $ANTLR start "rule__DomainModel__Group__5__Impl"
    // InternalDomain.g:444:1: rule__DomainModel__Group__5__Impl : ( ( rule__DomainModel__Group_5__0 )? ) ;
    public final void rule__DomainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:448:1: ( ( ( rule__DomainModel__Group_5__0 )? ) )
            // InternalDomain.g:449:1: ( ( rule__DomainModel__Group_5__0 )? )
            {
            // InternalDomain.g:449:1: ( ( rule__DomainModel__Group_5__0 )? )
            // InternalDomain.g:450:2: ( rule__DomainModel__Group_5__0 )?
            {
             before(grammarAccess.getDomainModelAccess().getGroup_5()); 
            // InternalDomain.g:451:2: ( rule__DomainModel__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomain.g:451:3: rule__DomainModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DomainModel__Group__5__Impl"


    // $ANTLR start "rule__DomainModel__Group__6"
    // InternalDomain.g:459:1: rule__DomainModel__Group__6 : rule__DomainModel__Group__6__Impl ;
    public final void rule__DomainModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:463:1: ( rule__DomainModel__Group__6__Impl )
            // InternalDomain.g:464:2: rule__DomainModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__6__Impl();

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
    // $ANTLR end "rule__DomainModel__Group__6"


    // $ANTLR start "rule__DomainModel__Group__6__Impl"
    // InternalDomain.g:470:1: rule__DomainModel__Group__6__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:474:1: ( ( '}' ) )
            // InternalDomain.g:475:1: ( '}' )
            {
            // InternalDomain.g:475:1: ( '}' )
            // InternalDomain.g:476:2: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DomainModel__Group__6__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__0"
    // InternalDomain.g:486:1: rule__DomainModel__Group_4__0 : rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1 ;
    public final void rule__DomainModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:490:1: ( rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1 )
            // InternalDomain.g:491:2: rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DomainModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__1();

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
    // $ANTLR end "rule__DomainModel__Group_4__0"


    // $ANTLR start "rule__DomainModel__Group_4__0__Impl"
    // InternalDomain.g:498:1: rule__DomainModel__Group_4__0__Impl : ( 'entities' ) ;
    public final void rule__DomainModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:502:1: ( ( 'entities' ) )
            // InternalDomain.g:503:1: ( 'entities' )
            {
            // InternalDomain.g:503:1: ( 'entities' )
            // InternalDomain.g:504:2: 'entities'
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__1"
    // InternalDomain.g:513:1: rule__DomainModel__Group_4__1 : rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2 ;
    public final void rule__DomainModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:517:1: ( rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2 )
            // InternalDomain.g:518:2: rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__DomainModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__2();

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
    // $ANTLR end "rule__DomainModel__Group_4__1"


    // $ANTLR start "rule__DomainModel__Group_4__1__Impl"
    // InternalDomain.g:525:1: rule__DomainModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:529:1: ( ( '{' ) )
            // InternalDomain.g:530:1: ( '{' )
            {
            // InternalDomain.g:530:1: ( '{' )
            // InternalDomain.g:531:2: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__1__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__2"
    // InternalDomain.g:540:1: rule__DomainModel__Group_4__2 : rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3 ;
    public final void rule__DomainModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:544:1: ( rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3 )
            // InternalDomain.g:545:2: rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__3();

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
    // $ANTLR end "rule__DomainModel__Group_4__2"


    // $ANTLR start "rule__DomainModel__Group_4__2__Impl"
    // InternalDomain.g:552:1: rule__DomainModel__Group_4__2__Impl : ( ( rule__DomainModel__EntitiesAssignment_4_2 ) ) ;
    public final void rule__DomainModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:556:1: ( ( ( rule__DomainModel__EntitiesAssignment_4_2 ) ) )
            // InternalDomain.g:557:1: ( ( rule__DomainModel__EntitiesAssignment_4_2 ) )
            {
            // InternalDomain.g:557:1: ( ( rule__DomainModel__EntitiesAssignment_4_2 ) )
            // InternalDomain.g:558:2: ( rule__DomainModel__EntitiesAssignment_4_2 )
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_2()); 
            // InternalDomain.g:559:2: ( rule__DomainModel__EntitiesAssignment_4_2 )
            // InternalDomain.g:559:3: rule__DomainModel__EntitiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__EntitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_2()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__2__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__3"
    // InternalDomain.g:567:1: rule__DomainModel__Group_4__3 : rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4 ;
    public final void rule__DomainModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:571:1: ( rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4 )
            // InternalDomain.g:572:2: rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__4();

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
    // $ANTLR end "rule__DomainModel__Group_4__3"


    // $ANTLR start "rule__DomainModel__Group_4__3__Impl"
    // InternalDomain.g:579:1: rule__DomainModel__Group_4__3__Impl : ( ( rule__DomainModel__Group_4_3__0 )* ) ;
    public final void rule__DomainModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:583:1: ( ( ( rule__DomainModel__Group_4_3__0 )* ) )
            // InternalDomain.g:584:1: ( ( rule__DomainModel__Group_4_3__0 )* )
            {
            // InternalDomain.g:584:1: ( ( rule__DomainModel__Group_4_3__0 )* )
            // InternalDomain.g:585:2: ( rule__DomainModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDomainModelAccess().getGroup_4_3()); 
            // InternalDomain.g:586:2: ( rule__DomainModel__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomain.g:586:3: rule__DomainModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__3__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__4"
    // InternalDomain.g:594:1: rule__DomainModel__Group_4__4 : rule__DomainModel__Group_4__4__Impl ;
    public final void rule__DomainModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:598:1: ( rule__DomainModel__Group_4__4__Impl )
            // InternalDomain.g:599:2: rule__DomainModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__4__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_4__4"


    // $ANTLR start "rule__DomainModel__Group_4__4__Impl"
    // InternalDomain.g:605:1: rule__DomainModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:609:1: ( ( '}' ) )
            // InternalDomain.g:610:1: ( '}' )
            {
            // InternalDomain.g:610:1: ( '}' )
            // InternalDomain.g:611:2: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__4__Impl"


    // $ANTLR start "rule__DomainModel__Group_4_3__0"
    // InternalDomain.g:621:1: rule__DomainModel__Group_4_3__0 : rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1 ;
    public final void rule__DomainModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:625:1: ( rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1 )
            // InternalDomain.g:626:2: rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4_3__1();

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
    // $ANTLR end "rule__DomainModel__Group_4_3__0"


    // $ANTLR start "rule__DomainModel__Group_4_3__0__Impl"
    // InternalDomain.g:633:1: rule__DomainModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DomainModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:637:1: ( ( ',' ) )
            // InternalDomain.g:638:1: ( ',' )
            {
            // InternalDomain.g:638:1: ( ',' )
            // InternalDomain.g:639:2: ','
            {
             before(grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_4_3__1"
    // InternalDomain.g:648:1: rule__DomainModel__Group_4_3__1 : rule__DomainModel__Group_4_3__1__Impl ;
    public final void rule__DomainModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:652:1: ( rule__DomainModel__Group_4_3__1__Impl )
            // InternalDomain.g:653:2: rule__DomainModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_4_3__1"


    // $ANTLR start "rule__DomainModel__Group_4_3__1__Impl"
    // InternalDomain.g:659:1: rule__DomainModel__Group_4_3__1__Impl : ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) ) ;
    public final void rule__DomainModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:663:1: ( ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) ) )
            // InternalDomain.g:664:1: ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) )
            {
            // InternalDomain.g:664:1: ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) )
            // InternalDomain.g:665:2: ( rule__DomainModel__EntitiesAssignment_4_3_1 )
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_3_1()); 
            // InternalDomain.g:666:2: ( rule__DomainModel__EntitiesAssignment_4_3_1 )
            // InternalDomain.g:666:3: rule__DomainModel__EntitiesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__EntitiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__DomainModel__Group_5__0"
    // InternalDomain.g:675:1: rule__DomainModel__Group_5__0 : rule__DomainModel__Group_5__0__Impl rule__DomainModel__Group_5__1 ;
    public final void rule__DomainModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:679:1: ( rule__DomainModel__Group_5__0__Impl rule__DomainModel__Group_5__1 )
            // InternalDomain.g:680:2: rule__DomainModel__Group_5__0__Impl rule__DomainModel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__DomainModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5__1();

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
    // $ANTLR end "rule__DomainModel__Group_5__0"


    // $ANTLR start "rule__DomainModel__Group_5__0__Impl"
    // InternalDomain.g:687:1: rule__DomainModel__Group_5__0__Impl : ( 'valueobject' ) ;
    public final void rule__DomainModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:691:1: ( ( 'valueobject' ) )
            // InternalDomain.g:692:1: ( 'valueobject' )
            {
            // InternalDomain.g:692:1: ( 'valueobject' )
            // InternalDomain.g:693:2: 'valueobject'
            {
             before(grammarAccess.getDomainModelAccess().getValueobjectKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getValueobjectKeyword_5_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_5__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_5__1"
    // InternalDomain.g:702:1: rule__DomainModel__Group_5__1 : rule__DomainModel__Group_5__1__Impl rule__DomainModel__Group_5__2 ;
    public final void rule__DomainModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:706:1: ( rule__DomainModel__Group_5__1__Impl rule__DomainModel__Group_5__2 )
            // InternalDomain.g:707:2: rule__DomainModel__Group_5__1__Impl rule__DomainModel__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__DomainModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5__2();

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
    // $ANTLR end "rule__DomainModel__Group_5__1"


    // $ANTLR start "rule__DomainModel__Group_5__1__Impl"
    // InternalDomain.g:714:1: rule__DomainModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:718:1: ( ( '{' ) )
            // InternalDomain.g:719:1: ( '{' )
            {
            // InternalDomain.g:719:1: ( '{' )
            // InternalDomain.g:720:2: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_5__1__Impl"


    // $ANTLR start "rule__DomainModel__Group_5__2"
    // InternalDomain.g:729:1: rule__DomainModel__Group_5__2 : rule__DomainModel__Group_5__2__Impl rule__DomainModel__Group_5__3 ;
    public final void rule__DomainModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:733:1: ( rule__DomainModel__Group_5__2__Impl rule__DomainModel__Group_5__3 )
            // InternalDomain.g:734:2: rule__DomainModel__Group_5__2__Impl rule__DomainModel__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5__3();

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
    // $ANTLR end "rule__DomainModel__Group_5__2"


    // $ANTLR start "rule__DomainModel__Group_5__2__Impl"
    // InternalDomain.g:741:1: rule__DomainModel__Group_5__2__Impl : ( ( rule__DomainModel__ValueobjectAssignment_5_2 ) ) ;
    public final void rule__DomainModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:745:1: ( ( ( rule__DomainModel__ValueobjectAssignment_5_2 ) ) )
            // InternalDomain.g:746:1: ( ( rule__DomainModel__ValueobjectAssignment_5_2 ) )
            {
            // InternalDomain.g:746:1: ( ( rule__DomainModel__ValueobjectAssignment_5_2 ) )
            // InternalDomain.g:747:2: ( rule__DomainModel__ValueobjectAssignment_5_2 )
            {
             before(grammarAccess.getDomainModelAccess().getValueobjectAssignment_5_2()); 
            // InternalDomain.g:748:2: ( rule__DomainModel__ValueobjectAssignment_5_2 )
            // InternalDomain.g:748:3: rule__DomainModel__ValueobjectAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__ValueobjectAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getValueobjectAssignment_5_2()); 

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
    // $ANTLR end "rule__DomainModel__Group_5__2__Impl"


    // $ANTLR start "rule__DomainModel__Group_5__3"
    // InternalDomain.g:756:1: rule__DomainModel__Group_5__3 : rule__DomainModel__Group_5__3__Impl rule__DomainModel__Group_5__4 ;
    public final void rule__DomainModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:760:1: ( rule__DomainModel__Group_5__3__Impl rule__DomainModel__Group_5__4 )
            // InternalDomain.g:761:2: rule__DomainModel__Group_5__3__Impl rule__DomainModel__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5__4();

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
    // $ANTLR end "rule__DomainModel__Group_5__3"


    // $ANTLR start "rule__DomainModel__Group_5__3__Impl"
    // InternalDomain.g:768:1: rule__DomainModel__Group_5__3__Impl : ( ( rule__DomainModel__Group_5_3__0 )* ) ;
    public final void rule__DomainModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:772:1: ( ( ( rule__DomainModel__Group_5_3__0 )* ) )
            // InternalDomain.g:773:1: ( ( rule__DomainModel__Group_5_3__0 )* )
            {
            // InternalDomain.g:773:1: ( ( rule__DomainModel__Group_5_3__0 )* )
            // InternalDomain.g:774:2: ( rule__DomainModel__Group_5_3__0 )*
            {
             before(grammarAccess.getDomainModelAccess().getGroup_5_3()); 
            // InternalDomain.g:775:2: ( rule__DomainModel__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomain.g:775:3: rule__DomainModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__DomainModel__Group_5__3__Impl"


    // $ANTLR start "rule__DomainModel__Group_5__4"
    // InternalDomain.g:783:1: rule__DomainModel__Group_5__4 : rule__DomainModel__Group_5__4__Impl ;
    public final void rule__DomainModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:787:1: ( rule__DomainModel__Group_5__4__Impl )
            // InternalDomain.g:788:2: rule__DomainModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_5__4"


    // $ANTLR start "rule__DomainModel__Group_5__4__Impl"
    // InternalDomain.g:794:1: rule__DomainModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:798:1: ( ( '}' ) )
            // InternalDomain.g:799:1: ( '}' )
            {
            // InternalDomain.g:799:1: ( '}' )
            // InternalDomain.g:800:2: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__DomainModel__Group_5__4__Impl"


    // $ANTLR start "rule__DomainModel__Group_5_3__0"
    // InternalDomain.g:810:1: rule__DomainModel__Group_5_3__0 : rule__DomainModel__Group_5_3__0__Impl rule__DomainModel__Group_5_3__1 ;
    public final void rule__DomainModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:814:1: ( rule__DomainModel__Group_5_3__0__Impl rule__DomainModel__Group_5_3__1 )
            // InternalDomain.g:815:2: rule__DomainModel__Group_5_3__0__Impl rule__DomainModel__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__DomainModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5_3__1();

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
    // $ANTLR end "rule__DomainModel__Group_5_3__0"


    // $ANTLR start "rule__DomainModel__Group_5_3__0__Impl"
    // InternalDomain.g:822:1: rule__DomainModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__DomainModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:826:1: ( ( ',' ) )
            // InternalDomain.g:827:1: ( ',' )
            {
            // InternalDomain.g:827:1: ( ',' )
            // InternalDomain.g:828:2: ','
            {
             before(grammarAccess.getDomainModelAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_5_3__1"
    // InternalDomain.g:837:1: rule__DomainModel__Group_5_3__1 : rule__DomainModel__Group_5_3__1__Impl ;
    public final void rule__DomainModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:841:1: ( rule__DomainModel__Group_5_3__1__Impl )
            // InternalDomain.g:842:2: rule__DomainModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_5_3__1"


    // $ANTLR start "rule__DomainModel__Group_5_3__1__Impl"
    // InternalDomain.g:848:1: rule__DomainModel__Group_5_3__1__Impl : ( ( rule__DomainModel__ValueobjectAssignment_5_3_1 ) ) ;
    public final void rule__DomainModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:852:1: ( ( ( rule__DomainModel__ValueobjectAssignment_5_3_1 ) ) )
            // InternalDomain.g:853:1: ( ( rule__DomainModel__ValueobjectAssignment_5_3_1 ) )
            {
            // InternalDomain.g:853:1: ( ( rule__DomainModel__ValueobjectAssignment_5_3_1 ) )
            // InternalDomain.g:854:2: ( rule__DomainModel__ValueobjectAssignment_5_3_1 )
            {
             before(grammarAccess.getDomainModelAccess().getValueobjectAssignment_5_3_1()); 
            // InternalDomain.g:855:2: ( rule__DomainModel__ValueobjectAssignment_5_3_1 )
            // InternalDomain.g:855:3: rule__DomainModel__ValueobjectAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__ValueobjectAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getValueobjectAssignment_5_3_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomain.g:864:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:868:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomain.g:869:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomain.g:876:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__RootAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:880:1: ( ( ( rule__Entity__RootAssignment_0 ) ) )
            // InternalDomain.g:881:1: ( ( rule__Entity__RootAssignment_0 ) )
            {
            // InternalDomain.g:881:1: ( ( rule__Entity__RootAssignment_0 ) )
            // InternalDomain.g:882:2: ( rule__Entity__RootAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getRootAssignment_0()); 
            // InternalDomain.g:883:2: ( rule__Entity__RootAssignment_0 )
            // InternalDomain.g:883:3: rule__Entity__RootAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__RootAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getRootAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomain.g:891:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:895:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomain.g:896:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomain.g:903:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:907:1: ( ( 'Entity' ) )
            // InternalDomain.g:908:1: ( 'Entity' )
            {
            // InternalDomain.g:908:1: ( 'Entity' )
            // InternalDomain.g:909:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomain.g:918:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:922:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomain.g:923:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomain.g:930:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:934:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalDomain.g:935:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalDomain.g:935:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalDomain.g:936:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalDomain.g:937:2: ( rule__Entity__NameAssignment_2 )
            // InternalDomain.g:937:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomain.g:945:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:949:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomain.g:950:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomain.g:957:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:961:1: ( ( '{' ) )
            // InternalDomain.g:962:1: ( '{' )
            {
            // InternalDomain.g:962:1: ( '{' )
            // InternalDomain.g:963:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomain.g:972:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:976:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomain.g:977:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomain.g:984:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:988:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalDomain.g:989:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalDomain.g:989:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalDomain.g:990:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalDomain.g:991:2: ( rule__Entity__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:991:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomain.g:999:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1003:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDomain.g:1004:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomain.g:1011:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1015:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // InternalDomain.g:1016:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // InternalDomain.g:1016:1: ( ( rule__Entity__Group_5__0 )? )
            // InternalDomain.g:1017:2: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // InternalDomain.g:1018:2: ( rule__Entity__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomain.g:1018:3: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDomain.g:1026:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1030:1: ( rule__Entity__Group__6__Impl )
            // InternalDomain.g:1031:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDomain.g:1037:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1041:1: ( ( '}' ) )
            // InternalDomain.g:1042:1: ( '}' )
            {
            // InternalDomain.g:1042:1: ( '}' )
            // InternalDomain.g:1043:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalDomain.g:1053:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1057:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalDomain.g:1058:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalDomain.g:1065:1: rule__Entity__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1069:1: ( ( 'fields' ) )
            // InternalDomain.g:1070:1: ( 'fields' )
            {
            // InternalDomain.g:1070:1: ( 'fields' )
            // InternalDomain.g:1071:2: 'fields'
            {
             before(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 

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
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalDomain.g:1080:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1084:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalDomain.g:1085:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalDomain.g:1092:1: rule__Entity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1096:1: ( ( '{' ) )
            // InternalDomain.g:1097:1: ( '{' )
            {
            // InternalDomain.g:1097:1: ( '{' )
            // InternalDomain.g:1098:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalDomain.g:1107:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1111:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalDomain.g:1112:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__3();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalDomain.g:1119:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__FieldsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1123:1: ( ( ( rule__Entity__FieldsAssignment_4_2 ) ) )
            // InternalDomain.g:1124:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            {
            // InternalDomain.g:1124:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            // InternalDomain.g:1125:2: ( rule__Entity__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 
            // InternalDomain.g:1126:2: ( rule__Entity__FieldsAssignment_4_2 )
            // InternalDomain.g:1126:3: rule__Entity__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 

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
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // InternalDomain.g:1134:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1138:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalDomain.g:1139:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4();

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
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // InternalDomain.g:1146:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1150:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // InternalDomain.g:1151:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // InternalDomain.g:1151:1: ( ( rule__Entity__Group_4_3__0 )* )
            // InternalDomain.g:1152:2: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // InternalDomain.g:1153:2: ( rule__Entity__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomain.g:1153:3: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // InternalDomain.g:1161:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1165:1: ( rule__Entity__Group_4__4__Impl )
            // InternalDomain.g:1166:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // InternalDomain.g:1172:1: rule__Entity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1176:1: ( ( '}' ) )
            // InternalDomain.g:1177:1: ( '}' )
            {
            // InternalDomain.g:1177:1: ( '}' )
            // InternalDomain.g:1178:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__0"
    // InternalDomain.g:1188:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1192:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // InternalDomain.g:1193:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1();

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
    // $ANTLR end "rule__Entity__Group_4_3__0"


    // $ANTLR start "rule__Entity__Group_4_3__0__Impl"
    // InternalDomain.g:1200:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1204:1: ( ( ',' ) )
            // InternalDomain.g:1205:1: ( ',' )
            {
            // InternalDomain.g:1205:1: ( ',' )
            // InternalDomain.g:1206:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__1"
    // InternalDomain.g:1215:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1219:1: ( rule__Entity__Group_4_3__1__Impl )
            // InternalDomain.g:1220:2: rule__Entity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_3__1"


    // $ANTLR start "rule__Entity__Group_4_3__1__Impl"
    // InternalDomain.g:1226:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1230:1: ( ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) )
            // InternalDomain.g:1231:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            {
            // InternalDomain.g:1231:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            // InternalDomain.g:1232:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 
            // InternalDomain.g:1233:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            // InternalDomain.g:1233:3: rule__Entity__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // InternalDomain.g:1242:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1246:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // InternalDomain.g:1247:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // InternalDomain.g:1254:1: rule__Entity__Group_5__0__Impl : ( 'references' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1258:1: ( ( 'references' ) )
            // InternalDomain.g:1259:1: ( 'references' )
            {
            // InternalDomain.g:1259:1: ( 'references' )
            // InternalDomain.g:1260:2: 'references'
            {
             before(grammarAccess.getEntityAccess().getReferencesKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getReferencesKeyword_5_0()); 

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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // InternalDomain.g:1269:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1273:1: ( rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 )
            // InternalDomain.g:1274:2: rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__2();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // InternalDomain.g:1281:1: rule__Entity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1285:1: ( ( '{' ) )
            // InternalDomain.g:1286:1: ( '{' )
            {
            // InternalDomain.g:1286:1: ( '{' )
            // InternalDomain.g:1287:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__2"
    // InternalDomain.g:1296:1: rule__Entity__Group_5__2 : rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 ;
    public final void rule__Entity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1300:1: ( rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 )
            // InternalDomain.g:1301:2: rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__3();

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
    // $ANTLR end "rule__Entity__Group_5__2"


    // $ANTLR start "rule__Entity__Group_5__2__Impl"
    // InternalDomain.g:1308:1: rule__Entity__Group_5__2__Impl : ( ( rule__Entity__ReferencesAssignment_5_2 ) ) ;
    public final void rule__Entity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1312:1: ( ( ( rule__Entity__ReferencesAssignment_5_2 ) ) )
            // InternalDomain.g:1313:1: ( ( rule__Entity__ReferencesAssignment_5_2 ) )
            {
            // InternalDomain.g:1313:1: ( ( rule__Entity__ReferencesAssignment_5_2 ) )
            // InternalDomain.g:1314:2: ( rule__Entity__ReferencesAssignment_5_2 )
            {
             before(grammarAccess.getEntityAccess().getReferencesAssignment_5_2()); 
            // InternalDomain.g:1315:2: ( rule__Entity__ReferencesAssignment_5_2 )
            // InternalDomain.g:1315:3: rule__Entity__ReferencesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ReferencesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getReferencesAssignment_5_2()); 

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
    // $ANTLR end "rule__Entity__Group_5__2__Impl"


    // $ANTLR start "rule__Entity__Group_5__3"
    // InternalDomain.g:1323:1: rule__Entity__Group_5__3 : rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 ;
    public final void rule__Entity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1327:1: ( rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 )
            // InternalDomain.g:1328:2: rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4();

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
    // $ANTLR end "rule__Entity__Group_5__3"


    // $ANTLR start "rule__Entity__Group_5__3__Impl"
    // InternalDomain.g:1335:1: rule__Entity__Group_5__3__Impl : ( ( rule__Entity__Group_5_3__0 )* ) ;
    public final void rule__Entity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1339:1: ( ( ( rule__Entity__Group_5_3__0 )* ) )
            // InternalDomain.g:1340:1: ( ( rule__Entity__Group_5_3__0 )* )
            {
            // InternalDomain.g:1340:1: ( ( rule__Entity__Group_5_3__0 )* )
            // InternalDomain.g:1341:2: ( rule__Entity__Group_5_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_5_3()); 
            // InternalDomain.g:1342:2: ( rule__Entity__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomain.g:1342:3: rule__Entity__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Entity__Group_5__3__Impl"


    // $ANTLR start "rule__Entity__Group_5__4"
    // InternalDomain.g:1350:1: rule__Entity__Group_5__4 : rule__Entity__Group_5__4__Impl ;
    public final void rule__Entity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1354:1: ( rule__Entity__Group_5__4__Impl )
            // InternalDomain.g:1355:2: rule__Entity__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__4"


    // $ANTLR start "rule__Entity__Group_5__4__Impl"
    // InternalDomain.g:1361:1: rule__Entity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1365:1: ( ( '}' ) )
            // InternalDomain.g:1366:1: ( '}' )
            {
            // InternalDomain.g:1366:1: ( '}' )
            // InternalDomain.g:1367:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Entity__Group_5__4__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__0"
    // InternalDomain.g:1377:1: rule__Entity__Group_5_3__0 : rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 ;
    public final void rule__Entity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1381:1: ( rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 )
            // InternalDomain.g:1382:2: rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1();

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
    // $ANTLR end "rule__Entity__Group_5_3__0"


    // $ANTLR start "rule__Entity__Group_5_3__0__Impl"
    // InternalDomain.g:1389:1: rule__Entity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1393:1: ( ( ',' ) )
            // InternalDomain.g:1394:1: ( ',' )
            {
            // InternalDomain.g:1394:1: ( ',' )
            // InternalDomain.g:1395:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_5_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__1"
    // InternalDomain.g:1404:1: rule__Entity__Group_5_3__1 : rule__Entity__Group_5_3__1__Impl ;
    public final void rule__Entity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1408:1: ( rule__Entity__Group_5_3__1__Impl )
            // InternalDomain.g:1409:2: rule__Entity__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5_3__1"


    // $ANTLR start "rule__Entity__Group_5_3__1__Impl"
    // InternalDomain.g:1415:1: rule__Entity__Group_5_3__1__Impl : ( ( rule__Entity__ReferencesAssignment_5_3_1 ) ) ;
    public final void rule__Entity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1419:1: ( ( ( rule__Entity__ReferencesAssignment_5_3_1 ) ) )
            // InternalDomain.g:1420:1: ( ( rule__Entity__ReferencesAssignment_5_3_1 ) )
            {
            // InternalDomain.g:1420:1: ( ( rule__Entity__ReferencesAssignment_5_3_1 ) )
            // InternalDomain.g:1421:2: ( rule__Entity__ReferencesAssignment_5_3_1 )
            {
             before(grammarAccess.getEntityAccess().getReferencesAssignment_5_3_1()); 
            // InternalDomain.g:1422:2: ( rule__Entity__ReferencesAssignment_5_3_1 )
            // InternalDomain.g:1422:3: rule__Entity__ReferencesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ReferencesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getReferencesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_5_3__1__Impl"


    // $ANTLR start "rule__ValueObject__Group__0"
    // InternalDomain.g:1431:1: rule__ValueObject__Group__0 : rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 ;
    public final void rule__ValueObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1435:1: ( rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 )
            // InternalDomain.g:1436:2: rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ValueObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__1();

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
    // $ANTLR end "rule__ValueObject__Group__0"


    // $ANTLR start "rule__ValueObject__Group__0__Impl"
    // InternalDomain.g:1443:1: rule__ValueObject__Group__0__Impl : ( ( rule__ValueObject__IsIdAssignment_0 ) ) ;
    public final void rule__ValueObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1447:1: ( ( ( rule__ValueObject__IsIdAssignment_0 ) ) )
            // InternalDomain.g:1448:1: ( ( rule__ValueObject__IsIdAssignment_0 ) )
            {
            // InternalDomain.g:1448:1: ( ( rule__ValueObject__IsIdAssignment_0 ) )
            // InternalDomain.g:1449:2: ( rule__ValueObject__IsIdAssignment_0 )
            {
             before(grammarAccess.getValueObjectAccess().getIsIdAssignment_0()); 
            // InternalDomain.g:1450:2: ( rule__ValueObject__IsIdAssignment_0 )
            // InternalDomain.g:1450:3: rule__ValueObject__IsIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__IsIdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getIsIdAssignment_0()); 

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
    // $ANTLR end "rule__ValueObject__Group__0__Impl"


    // $ANTLR start "rule__ValueObject__Group__1"
    // InternalDomain.g:1458:1: rule__ValueObject__Group__1 : rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 ;
    public final void rule__ValueObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1462:1: ( rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 )
            // InternalDomain.g:1463:2: rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ValueObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__2();

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
    // $ANTLR end "rule__ValueObject__Group__1"


    // $ANTLR start "rule__ValueObject__Group__1__Impl"
    // InternalDomain.g:1470:1: rule__ValueObject__Group__1__Impl : ( 'ValueObject' ) ;
    public final void rule__ValueObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1474:1: ( ( 'ValueObject' ) )
            // InternalDomain.g:1475:1: ( 'ValueObject' )
            {
            // InternalDomain.g:1475:1: ( 'ValueObject' )
            // InternalDomain.g:1476:2: 'ValueObject'
            {
             before(grammarAccess.getValueObjectAccess().getValueObjectKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getValueObjectKeyword_1()); 

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
    // $ANTLR end "rule__ValueObject__Group__1__Impl"


    // $ANTLR start "rule__ValueObject__Group__2"
    // InternalDomain.g:1485:1: rule__ValueObject__Group__2 : rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 ;
    public final void rule__ValueObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1489:1: ( rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 )
            // InternalDomain.g:1490:2: rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ValueObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__3();

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
    // $ANTLR end "rule__ValueObject__Group__2"


    // $ANTLR start "rule__ValueObject__Group__2__Impl"
    // InternalDomain.g:1497:1: rule__ValueObject__Group__2__Impl : ( ( rule__ValueObject__NameAssignment_2 ) ) ;
    public final void rule__ValueObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1501:1: ( ( ( rule__ValueObject__NameAssignment_2 ) ) )
            // InternalDomain.g:1502:1: ( ( rule__ValueObject__NameAssignment_2 ) )
            {
            // InternalDomain.g:1502:1: ( ( rule__ValueObject__NameAssignment_2 ) )
            // InternalDomain.g:1503:2: ( rule__ValueObject__NameAssignment_2 )
            {
             before(grammarAccess.getValueObjectAccess().getNameAssignment_2()); 
            // InternalDomain.g:1504:2: ( rule__ValueObject__NameAssignment_2 )
            // InternalDomain.g:1504:3: rule__ValueObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ValueObject__Group__2__Impl"


    // $ANTLR start "rule__ValueObject__Group__3"
    // InternalDomain.g:1512:1: rule__ValueObject__Group__3 : rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 ;
    public final void rule__ValueObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1516:1: ( rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 )
            // InternalDomain.g:1517:2: rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ValueObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__4();

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
    // $ANTLR end "rule__ValueObject__Group__3"


    // $ANTLR start "rule__ValueObject__Group__3__Impl"
    // InternalDomain.g:1524:1: rule__ValueObject__Group__3__Impl : ( '{' ) ;
    public final void rule__ValueObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1528:1: ( ( '{' ) )
            // InternalDomain.g:1529:1: ( '{' )
            {
            // InternalDomain.g:1529:1: ( '{' )
            // InternalDomain.g:1530:2: '{'
            {
             before(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ValueObject__Group__3__Impl"


    // $ANTLR start "rule__ValueObject__Group__4"
    // InternalDomain.g:1539:1: rule__ValueObject__Group__4 : rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 ;
    public final void rule__ValueObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1543:1: ( rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 )
            // InternalDomain.g:1544:2: rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ValueObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__5();

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
    // $ANTLR end "rule__ValueObject__Group__4"


    // $ANTLR start "rule__ValueObject__Group__4__Impl"
    // InternalDomain.g:1551:1: rule__ValueObject__Group__4__Impl : ( 'field' ) ;
    public final void rule__ValueObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1555:1: ( ( 'field' ) )
            // InternalDomain.g:1556:1: ( 'field' )
            {
            // InternalDomain.g:1556:1: ( 'field' )
            // InternalDomain.g:1557:2: 'field'
            {
             before(grammarAccess.getValueObjectAccess().getFieldKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getFieldKeyword_4()); 

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
    // $ANTLR end "rule__ValueObject__Group__4__Impl"


    // $ANTLR start "rule__ValueObject__Group__5"
    // InternalDomain.g:1566:1: rule__ValueObject__Group__5 : rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 ;
    public final void rule__ValueObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1570:1: ( rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 )
            // InternalDomain.g:1571:2: rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ValueObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__6();

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
    // $ANTLR end "rule__ValueObject__Group__5"


    // $ANTLR start "rule__ValueObject__Group__5__Impl"
    // InternalDomain.g:1578:1: rule__ValueObject__Group__5__Impl : ( ( rule__ValueObject__FieldAssignment_5 ) ) ;
    public final void rule__ValueObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1582:1: ( ( ( rule__ValueObject__FieldAssignment_5 ) ) )
            // InternalDomain.g:1583:1: ( ( rule__ValueObject__FieldAssignment_5 ) )
            {
            // InternalDomain.g:1583:1: ( ( rule__ValueObject__FieldAssignment_5 ) )
            // InternalDomain.g:1584:2: ( rule__ValueObject__FieldAssignment_5 )
            {
             before(grammarAccess.getValueObjectAccess().getFieldAssignment_5()); 
            // InternalDomain.g:1585:2: ( rule__ValueObject__FieldAssignment_5 )
            // InternalDomain.g:1585:3: rule__ValueObject__FieldAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__FieldAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getFieldAssignment_5()); 

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
    // $ANTLR end "rule__ValueObject__Group__5__Impl"


    // $ANTLR start "rule__ValueObject__Group__6"
    // InternalDomain.g:1593:1: rule__ValueObject__Group__6 : rule__ValueObject__Group__6__Impl ;
    public final void rule__ValueObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1597:1: ( rule__ValueObject__Group__6__Impl )
            // InternalDomain.g:1598:2: rule__ValueObject__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__6__Impl();

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
    // $ANTLR end "rule__ValueObject__Group__6"


    // $ANTLR start "rule__ValueObject__Group__6__Impl"
    // InternalDomain.g:1604:1: rule__ValueObject__Group__6__Impl : ( '}' ) ;
    public final void rule__ValueObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1608:1: ( ( '}' ) )
            // InternalDomain.g:1609:1: ( '}' )
            {
            // InternalDomain.g:1609:1: ( '}' )
            // InternalDomain.g:1610:2: '}'
            {
             before(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ValueObject__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalDomain.g:1620:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1624:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalDomain.g:1625:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalDomain.g:1632:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1636:1: ( ( () ) )
            // InternalDomain.g:1637:1: ( () )
            {
            // InternalDomain.g:1637:1: ( () )
            // InternalDomain.g:1638:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalDomain.g:1639:2: ()
            // InternalDomain.g:1639:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalDomain.g:1647:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1651:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalDomain.g:1652:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalDomain.g:1659:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1663:1: ( ( 'Field' ) )
            // InternalDomain.g:1664:1: ( 'Field' )
            {
            // InternalDomain.g:1664:1: ( 'Field' )
            // InternalDomain.g:1665:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalDomain.g:1674:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1678:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalDomain.g:1679:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalDomain.g:1686:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1690:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalDomain.g:1691:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalDomain.g:1691:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalDomain.g:1692:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalDomain.g:1693:2: ( rule__Field__NameAssignment_2 )
            // InternalDomain.g:1693:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalDomain.g:1701:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1705:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalDomain.g:1706:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalDomain.g:1713:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1717:1: ( ( '{' ) )
            // InternalDomain.g:1718:1: ( '{' )
            {
            // InternalDomain.g:1718:1: ( '{' )
            // InternalDomain.g:1719:2: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalDomain.g:1728:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1732:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalDomain.g:1733:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalDomain.g:1740:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1744:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // InternalDomain.g:1745:1: ( ( rule__Field__Group_4__0 )? )
            {
            // InternalDomain.g:1745:1: ( ( rule__Field__Group_4__0 )? )
            // InternalDomain.g:1746:2: ( rule__Field__Group_4__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_4()); 
            // InternalDomain.g:1747:2: ( rule__Field__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomain.g:1747:3: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalDomain.g:1755:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1759:1: ( rule__Field__Group__5__Impl )
            // InternalDomain.g:1760:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__5__Impl();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalDomain.g:1766:1: rule__Field__Group__5__Impl : ( '}' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1770:1: ( ( '}' ) )
            // InternalDomain.g:1771:1: ( '}' )
            {
            // InternalDomain.g:1771:1: ( '}' )
            // InternalDomain.g:1772:2: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group_4__0"
    // InternalDomain.g:1782:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1786:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // InternalDomain.g:1787:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Field__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1();

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
    // $ANTLR end "rule__Field__Group_4__0"


    // $ANTLR start "rule__Field__Group_4__0__Impl"
    // InternalDomain.g:1794:1: rule__Field__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1798:1: ( ( 'type' ) )
            // InternalDomain.g:1799:1: ( 'type' )
            {
            // InternalDomain.g:1799:1: ( 'type' )
            // InternalDomain.g:1800:2: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Field__Group_4__0__Impl"


    // $ANTLR start "rule__Field__Group_4__1"
    // InternalDomain.g:1809:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1813:1: ( rule__Field__Group_4__1__Impl )
            // InternalDomain.g:1814:2: rule__Field__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1__Impl();

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
    // $ANTLR end "rule__Field__Group_4__1"


    // $ANTLR start "rule__Field__Group_4__1__Impl"
    // InternalDomain.g:1820:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__TypeAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1824:1: ( ( ( rule__Field__TypeAssignment_4_1 ) ) )
            // InternalDomain.g:1825:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            {
            // InternalDomain.g:1825:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            // InternalDomain.g:1826:2: ( rule__Field__TypeAssignment_4_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 
            // InternalDomain.g:1827:2: ( rule__Field__TypeAssignment_4_1 )
            // InternalDomain.g:1827:3: rule__Field__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Field__Group_4__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDomain.g:1836:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1840:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDomain.g:1841:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDomain.g:1848:1: rule__Reference__Group__0__Impl : ( 'Reference' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1852:1: ( ( 'Reference' ) )
            // InternalDomain.g:1853:1: ( 'Reference' )
            {
            // InternalDomain.g:1853:1: ( 'Reference' )
            // InternalDomain.g:1854:2: 'Reference'
            {
             before(grammarAccess.getReferenceAccess().getReferenceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getReferenceKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDomain.g:1863:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1867:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDomain.g:1868:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDomain.g:1875:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1879:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // InternalDomain.g:1880:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // InternalDomain.g:1880:1: ( ( rule__Reference__NameAssignment_1 ) )
            // InternalDomain.g:1881:2: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // InternalDomain.g:1882:2: ( rule__Reference__NameAssignment_1 )
            // InternalDomain.g:1882:3: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalDomain.g:1890:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1894:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDomain.g:1895:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalDomain.g:1902:1: rule__Reference__Group__2__Impl : ( '{' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1906:1: ( ( '{' ) )
            // InternalDomain.g:1907:1: ( '{' )
            {
            // InternalDomain.g:1907:1: ( '{' )
            // InternalDomain.g:1908:2: '{'
            {
             before(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalDomain.g:1917:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1921:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalDomain.g:1922:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalDomain.g:1929:1: rule__Reference__Group__3__Impl : ( 'upperBound' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1933:1: ( ( 'upperBound' ) )
            // InternalDomain.g:1934:1: ( 'upperBound' )
            {
            // InternalDomain.g:1934:1: ( 'upperBound' )
            // InternalDomain.g:1935:2: 'upperBound'
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getUpperBoundKeyword_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalDomain.g:1944:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1948:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalDomain.g:1949:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalDomain.g:1956:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__UpperBoundAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1960:1: ( ( ( rule__Reference__UpperBoundAssignment_4 ) ) )
            // InternalDomain.g:1961:1: ( ( rule__Reference__UpperBoundAssignment_4 ) )
            {
            // InternalDomain.g:1961:1: ( ( rule__Reference__UpperBoundAssignment_4 ) )
            // InternalDomain.g:1962:2: ( rule__Reference__UpperBoundAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4()); 
            // InternalDomain.g:1963:2: ( rule__Reference__UpperBoundAssignment_4 )
            // InternalDomain.g:1963:3: rule__Reference__UpperBoundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reference__UpperBoundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalDomain.g:1971:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1975:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalDomain.g:1976:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalDomain.g:1983:1: rule__Reference__Group__5__Impl : ( 'lowerBound' ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1987:1: ( ( 'lowerBound' ) )
            // InternalDomain.g:1988:1: ( 'lowerBound' )
            {
            // InternalDomain.g:1988:1: ( 'lowerBound' )
            // InternalDomain.g:1989:2: 'lowerBound'
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLowerBoundKeyword_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalDomain.g:1998:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl rule__Reference__Group__7 ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2002:1: ( rule__Reference__Group__6__Impl rule__Reference__Group__7 )
            // InternalDomain.g:2003:2: rule__Reference__Group__6__Impl rule__Reference__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Reference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__7();

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
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalDomain.g:2010:1: rule__Reference__Group__6__Impl : ( ( rule__Reference__LowerBoundAssignment_6 ) ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2014:1: ( ( ( rule__Reference__LowerBoundAssignment_6 ) ) )
            // InternalDomain.g:2015:1: ( ( rule__Reference__LowerBoundAssignment_6 ) )
            {
            // InternalDomain.g:2015:1: ( ( rule__Reference__LowerBoundAssignment_6 ) )
            // InternalDomain.g:2016:2: ( rule__Reference__LowerBoundAssignment_6 )
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundAssignment_6()); 
            // InternalDomain.g:2017:2: ( rule__Reference__LowerBoundAssignment_6 )
            // InternalDomain.g:2017:3: rule__Reference__LowerBoundAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Reference__LowerBoundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getLowerBoundAssignment_6()); 

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
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group__7"
    // InternalDomain.g:2025:1: rule__Reference__Group__7 : rule__Reference__Group__7__Impl rule__Reference__Group__8 ;
    public final void rule__Reference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2029:1: ( rule__Reference__Group__7__Impl rule__Reference__Group__8 )
            // InternalDomain.g:2030:2: rule__Reference__Group__7__Impl rule__Reference__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Reference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__8();

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
    // $ANTLR end "rule__Reference__Group__7"


    // $ANTLR start "rule__Reference__Group__7__Impl"
    // InternalDomain.g:2037:1: rule__Reference__Group__7__Impl : ( ( rule__Reference__Group_7__0 )? ) ;
    public final void rule__Reference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2041:1: ( ( ( rule__Reference__Group_7__0 )? ) )
            // InternalDomain.g:2042:1: ( ( rule__Reference__Group_7__0 )? )
            {
            // InternalDomain.g:2042:1: ( ( rule__Reference__Group_7__0 )? )
            // InternalDomain.g:2043:2: ( rule__Reference__Group_7__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_7()); 
            // InternalDomain.g:2044:2: ( rule__Reference__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomain.g:2044:3: rule__Reference__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Reference__Group__7__Impl"


    // $ANTLR start "rule__Reference__Group__8"
    // InternalDomain.g:2052:1: rule__Reference__Group__8 : rule__Reference__Group__8__Impl rule__Reference__Group__9 ;
    public final void rule__Reference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2056:1: ( rule__Reference__Group__8__Impl rule__Reference__Group__9 )
            // InternalDomain.g:2057:2: rule__Reference__Group__8__Impl rule__Reference__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Reference__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__9();

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
    // $ANTLR end "rule__Reference__Group__8"


    // $ANTLR start "rule__Reference__Group__8__Impl"
    // InternalDomain.g:2064:1: rule__Reference__Group__8__Impl : ( ( rule__Reference__Group_8__0 )? ) ;
    public final void rule__Reference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2068:1: ( ( ( rule__Reference__Group_8__0 )? ) )
            // InternalDomain.g:2069:1: ( ( rule__Reference__Group_8__0 )? )
            {
            // InternalDomain.g:2069:1: ( ( rule__Reference__Group_8__0 )? )
            // InternalDomain.g:2070:2: ( rule__Reference__Group_8__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_8()); 
            // InternalDomain.g:2071:2: ( rule__Reference__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomain.g:2071:3: rule__Reference__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Reference__Group__8__Impl"


    // $ANTLR start "rule__Reference__Group__9"
    // InternalDomain.g:2079:1: rule__Reference__Group__9 : rule__Reference__Group__9__Impl ;
    public final void rule__Reference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2083:1: ( rule__Reference__Group__9__Impl )
            // InternalDomain.g:2084:2: rule__Reference__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__9__Impl();

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
    // $ANTLR end "rule__Reference__Group__9"


    // $ANTLR start "rule__Reference__Group__9__Impl"
    // InternalDomain.g:2090:1: rule__Reference__Group__9__Impl : ( '}' ) ;
    public final void rule__Reference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2094:1: ( ( '}' ) )
            // InternalDomain.g:2095:1: ( '}' )
            {
            // InternalDomain.g:2095:1: ( '}' )
            // InternalDomain.g:2096:2: '}'
            {
             before(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Reference__Group__9__Impl"


    // $ANTLR start "rule__Reference__Group_7__0"
    // InternalDomain.g:2106:1: rule__Reference__Group_7__0 : rule__Reference__Group_7__0__Impl rule__Reference__Group_7__1 ;
    public final void rule__Reference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2110:1: ( rule__Reference__Group_7__0__Impl rule__Reference__Group_7__1 )
            // InternalDomain.g:2111:2: rule__Reference__Group_7__0__Impl rule__Reference__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_7__1();

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
    // $ANTLR end "rule__Reference__Group_7__0"


    // $ANTLR start "rule__Reference__Group_7__0__Impl"
    // InternalDomain.g:2118:1: rule__Reference__Group_7__0__Impl : ( 'entity' ) ;
    public final void rule__Reference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2122:1: ( ( 'entity' ) )
            // InternalDomain.g:2123:1: ( 'entity' )
            {
            // InternalDomain.g:2123:1: ( 'entity' )
            // InternalDomain.g:2124:2: 'entity'
            {
             before(grammarAccess.getReferenceAccess().getEntityKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getEntityKeyword_7_0()); 

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
    // $ANTLR end "rule__Reference__Group_7__0__Impl"


    // $ANTLR start "rule__Reference__Group_7__1"
    // InternalDomain.g:2133:1: rule__Reference__Group_7__1 : rule__Reference__Group_7__1__Impl ;
    public final void rule__Reference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2137:1: ( rule__Reference__Group_7__1__Impl )
            // InternalDomain.g:2138:2: rule__Reference__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_7__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_7__1"


    // $ANTLR start "rule__Reference__Group_7__1__Impl"
    // InternalDomain.g:2144:1: rule__Reference__Group_7__1__Impl : ( ( rule__Reference__EntityAssignment_7_1 ) ) ;
    public final void rule__Reference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2148:1: ( ( ( rule__Reference__EntityAssignment_7_1 ) ) )
            // InternalDomain.g:2149:1: ( ( rule__Reference__EntityAssignment_7_1 ) )
            {
            // InternalDomain.g:2149:1: ( ( rule__Reference__EntityAssignment_7_1 ) )
            // InternalDomain.g:2150:2: ( rule__Reference__EntityAssignment_7_1 )
            {
             before(grammarAccess.getReferenceAccess().getEntityAssignment_7_1()); 
            // InternalDomain.g:2151:2: ( rule__Reference__EntityAssignment_7_1 )
            // InternalDomain.g:2151:3: rule__Reference__EntityAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__EntityAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getEntityAssignment_7_1()); 

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
    // $ANTLR end "rule__Reference__Group_7__1__Impl"


    // $ANTLR start "rule__Reference__Group_8__0"
    // InternalDomain.g:2160:1: rule__Reference__Group_8__0 : rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 ;
    public final void rule__Reference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2164:1: ( rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1 )
            // InternalDomain.g:2165:2: rule__Reference__Group_8__0__Impl rule__Reference__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_8__1();

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
    // $ANTLR end "rule__Reference__Group_8__0"


    // $ANTLR start "rule__Reference__Group_8__0__Impl"
    // InternalDomain.g:2172:1: rule__Reference__Group_8__0__Impl : ( 'valueobject' ) ;
    public final void rule__Reference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2176:1: ( ( 'valueobject' ) )
            // InternalDomain.g:2177:1: ( 'valueobject' )
            {
            // InternalDomain.g:2177:1: ( 'valueobject' )
            // InternalDomain.g:2178:2: 'valueobject'
            {
             before(grammarAccess.getReferenceAccess().getValueobjectKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getValueobjectKeyword_8_0()); 

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
    // $ANTLR end "rule__Reference__Group_8__0__Impl"


    // $ANTLR start "rule__Reference__Group_8__1"
    // InternalDomain.g:2187:1: rule__Reference__Group_8__1 : rule__Reference__Group_8__1__Impl ;
    public final void rule__Reference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2191:1: ( rule__Reference__Group_8__1__Impl )
            // InternalDomain.g:2192:2: rule__Reference__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_8__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_8__1"


    // $ANTLR start "rule__Reference__Group_8__1__Impl"
    // InternalDomain.g:2198:1: rule__Reference__Group_8__1__Impl : ( ( rule__Reference__ValueobjectAssignment_8_1 ) ) ;
    public final void rule__Reference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2202:1: ( ( ( rule__Reference__ValueobjectAssignment_8_1 ) ) )
            // InternalDomain.g:2203:1: ( ( rule__Reference__ValueobjectAssignment_8_1 ) )
            {
            // InternalDomain.g:2203:1: ( ( rule__Reference__ValueobjectAssignment_8_1 ) )
            // InternalDomain.g:2204:2: ( rule__Reference__ValueobjectAssignment_8_1 )
            {
             before(grammarAccess.getReferenceAccess().getValueobjectAssignment_8_1()); 
            // InternalDomain.g:2205:2: ( rule__Reference__ValueobjectAssignment_8_1 )
            // InternalDomain.g:2205:3: rule__Reference__ValueobjectAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ValueobjectAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getValueobjectAssignment_8_1()); 

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
    // $ANTLR end "rule__Reference__Group_8__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDomain.g:2214:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2218:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDomain.g:2219:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDomain.g:2226:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2230:1: ( ( ( '-' )? ) )
            // InternalDomain.g:2231:1: ( ( '-' )? )
            {
            // InternalDomain.g:2231:1: ( ( '-' )? )
            // InternalDomain.g:2232:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDomain.g:2233:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomain.g:2233:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDomain.g:2241:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2245:1: ( rule__EInt__Group__1__Impl )
            // InternalDomain.g:2246:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDomain.g:2252:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2256:1: ( ( RULE_INT ) )
            // InternalDomain.g:2257:1: ( RULE_INT )
            {
            // InternalDomain.g:2257:1: ( RULE_INT )
            // InternalDomain.g:2258:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__NameAssignment_2"
    // InternalDomain.g:2268:1: rule__DomainModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2272:1: ( ( ruleEString ) )
            // InternalDomain.g:2273:2: ( ruleEString )
            {
            // InternalDomain.g:2273:2: ( ruleEString )
            // InternalDomain.g:2274:3: ruleEString
            {
             before(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DomainModel__NameAssignment_2"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment_4_2"
    // InternalDomain.g:2283:1: rule__DomainModel__EntitiesAssignment_4_2 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2287:1: ( ( ruleEntity ) )
            // InternalDomain.g:2288:2: ( ruleEntity )
            {
            // InternalDomain.g:2288:2: ( ruleEntity )
            // InternalDomain.g:2289:3: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DomainModel__EntitiesAssignment_4_2"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment_4_3_1"
    // InternalDomain.g:2298:1: rule__DomainModel__EntitiesAssignment_4_3_1 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2302:1: ( ( ruleEntity ) )
            // InternalDomain.g:2303:2: ( ruleEntity )
            {
            // InternalDomain.g:2303:2: ( ruleEntity )
            // InternalDomain.g:2304:3: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__DomainModel__EntitiesAssignment_4_3_1"


    // $ANTLR start "rule__DomainModel__ValueobjectAssignment_5_2"
    // InternalDomain.g:2313:1: rule__DomainModel__ValueobjectAssignment_5_2 : ( ruleValueObject ) ;
    public final void rule__DomainModel__ValueobjectAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2317:1: ( ( ruleValueObject ) )
            // InternalDomain.g:2318:2: ( ruleValueObject )
            {
            // InternalDomain.g:2318:2: ( ruleValueObject )
            // InternalDomain.g:2319:3: ruleValueObject
            {
             before(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__DomainModel__ValueobjectAssignment_5_2"


    // $ANTLR start "rule__DomainModel__ValueobjectAssignment_5_3_1"
    // InternalDomain.g:2328:1: rule__DomainModel__ValueobjectAssignment_5_3_1 : ( ruleValueObject ) ;
    public final void rule__DomainModel__ValueobjectAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2332:1: ( ( ruleValueObject ) )
            // InternalDomain.g:2333:2: ( ruleValueObject )
            {
            // InternalDomain.g:2333:2: ( ruleValueObject )
            // InternalDomain.g:2334:3: ruleValueObject
            {
             before(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getValueobjectValueObjectParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__DomainModel__ValueobjectAssignment_5_3_1"


    // $ANTLR start "rule__Entity__RootAssignment_0"
    // InternalDomain.g:2343:1: rule__Entity__RootAssignment_0 : ( ( 'root' ) ) ;
    public final void rule__Entity__RootAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2347:1: ( ( ( 'root' ) ) )
            // InternalDomain.g:2348:2: ( ( 'root' ) )
            {
            // InternalDomain.g:2348:2: ( ( 'root' ) )
            // InternalDomain.g:2349:3: ( 'root' )
            {
             before(grammarAccess.getEntityAccess().getRootRootKeyword_0_0()); 
            // InternalDomain.g:2350:3: ( 'root' )
            // InternalDomain.g:2351:4: 'root'
            {
             before(grammarAccess.getEntityAccess().getRootRootKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRootRootKeyword_0_0()); 

            }

             after(grammarAccess.getEntityAccess().getRootRootKeyword_0_0()); 

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
    // $ANTLR end "rule__Entity__RootAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalDomain.g:2362:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2366:1: ( ( ruleEString ) )
            // InternalDomain.g:2367:2: ( ruleEString )
            {
            // InternalDomain.g:2367:2: ( ruleEString )
            // InternalDomain.g:2368:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_2"
    // InternalDomain.g:2377:1: rule__Entity__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2381:1: ( ( ruleField ) )
            // InternalDomain.g:2382:2: ( ruleField )
            {
            // InternalDomain.g:2382:2: ( ruleField )
            // InternalDomain.g:2383:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Entity__FieldsAssignment_4_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_3_1"
    // InternalDomain.g:2392:1: rule__Entity__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2396:1: ( ( ruleField ) )
            // InternalDomain.g:2397:2: ( ruleField )
            {
            // InternalDomain.g:2397:2: ( ruleField )
            // InternalDomain.g:2398:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Entity__FieldsAssignment_4_3_1"


    // $ANTLR start "rule__Entity__ReferencesAssignment_5_2"
    // InternalDomain.g:2407:1: rule__Entity__ReferencesAssignment_5_2 : ( ruleReference ) ;
    public final void rule__Entity__ReferencesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2411:1: ( ( ruleReference ) )
            // InternalDomain.g:2412:2: ( ruleReference )
            {
            // InternalDomain.g:2412:2: ( ruleReference )
            // InternalDomain.g:2413:3: ruleReference
            {
             before(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_5_2"


    // $ANTLR start "rule__Entity__ReferencesAssignment_5_3_1"
    // InternalDomain.g:2422:1: rule__Entity__ReferencesAssignment_5_3_1 : ( ruleReference ) ;
    public final void rule__Entity__ReferencesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2426:1: ( ( ruleReference ) )
            // InternalDomain.g:2427:2: ( ruleReference )
            {
            // InternalDomain.g:2427:2: ( ruleReference )
            // InternalDomain.g:2428:3: ruleReference
            {
             before(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_5_3_1"


    // $ANTLR start "rule__ValueObject__IsIdAssignment_0"
    // InternalDomain.g:2437:1: rule__ValueObject__IsIdAssignment_0 : ( ( 'isId' ) ) ;
    public final void rule__ValueObject__IsIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2441:1: ( ( ( 'isId' ) ) )
            // InternalDomain.g:2442:2: ( ( 'isId' ) )
            {
            // InternalDomain.g:2442:2: ( ( 'isId' ) )
            // InternalDomain.g:2443:3: ( 'isId' )
            {
             before(grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0()); 
            // InternalDomain.g:2444:3: ( 'isId' )
            // InternalDomain.g:2445:4: 'isId'
            {
             before(grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0()); 

            }

             after(grammarAccess.getValueObjectAccess().getIsIdIsIdKeyword_0_0()); 

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
    // $ANTLR end "rule__ValueObject__IsIdAssignment_0"


    // $ANTLR start "rule__ValueObject__NameAssignment_2"
    // InternalDomain.g:2456:1: rule__ValueObject__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ValueObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2460:1: ( ( ruleEString ) )
            // InternalDomain.g:2461:2: ( ruleEString )
            {
            // InternalDomain.g:2461:2: ( ruleEString )
            // InternalDomain.g:2462:3: ruleEString
            {
             before(grammarAccess.getValueObjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ValueObject__NameAssignment_2"


    // $ANTLR start "rule__ValueObject__FieldAssignment_5"
    // InternalDomain.g:2471:1: rule__ValueObject__FieldAssignment_5 : ( ruleField ) ;
    public final void rule__ValueObject__FieldAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2475:1: ( ( ruleField ) )
            // InternalDomain.g:2476:2: ( ruleField )
            {
            // InternalDomain.g:2476:2: ( ruleField )
            // InternalDomain.g:2477:3: ruleField
            {
             before(grammarAccess.getValueObjectAccess().getFieldFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getFieldFieldParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ValueObject__FieldAssignment_5"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalDomain.g:2486:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2490:1: ( ( ruleEString ) )
            // InternalDomain.g:2491:2: ( ruleEString )
            {
            // InternalDomain.g:2491:2: ( ruleEString )
            // InternalDomain.g:2492:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__TypeAssignment_4_1"
    // InternalDomain.g:2501:1: rule__Field__TypeAssignment_4_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2505:1: ( ( ruleFieldType ) )
            // InternalDomain.g:2506:2: ( ruleFieldType )
            {
            // InternalDomain.g:2506:2: ( ruleFieldType )
            // InternalDomain.g:2507:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_4_1"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // InternalDomain.g:2516:1: rule__Reference__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2520:1: ( ( ruleEString ) )
            // InternalDomain.g:2521:2: ( ruleEString )
            {
            // InternalDomain.g:2521:2: ( ruleEString )
            // InternalDomain.g:2522:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__UpperBoundAssignment_4"
    // InternalDomain.g:2531:1: rule__Reference__UpperBoundAssignment_4 : ( ruleEInt ) ;
    public final void rule__Reference__UpperBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2535:1: ( ( ruleEInt ) )
            // InternalDomain.g:2536:2: ( ruleEInt )
            {
            // InternalDomain.g:2536:2: ( ruleEInt )
            // InternalDomain.g:2537:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Reference__UpperBoundAssignment_4"


    // $ANTLR start "rule__Reference__LowerBoundAssignment_6"
    // InternalDomain.g:2546:1: rule__Reference__LowerBoundAssignment_6 : ( ruleEInt ) ;
    public final void rule__Reference__LowerBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2550:1: ( ( ruleEInt ) )
            // InternalDomain.g:2551:2: ( ruleEInt )
            {
            // InternalDomain.g:2551:2: ( ruleEInt )
            // InternalDomain.g:2552:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Reference__LowerBoundAssignment_6"


    // $ANTLR start "rule__Reference__EntityAssignment_7_1"
    // InternalDomain.g:2561:1: rule__Reference__EntityAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Reference__EntityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2565:1: ( ( ( ruleEString ) ) )
            // InternalDomain.g:2566:2: ( ( ruleEString ) )
            {
            // InternalDomain.g:2566:2: ( ( ruleEString ) )
            // InternalDomain.g:2567:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_7_1_0()); 
            // InternalDomain.g:2568:3: ( ruleEString )
            // InternalDomain.g:2569:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getEntityEntityEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Reference__EntityAssignment_7_1"


    // $ANTLR start "rule__Reference__ValueobjectAssignment_8_1"
    // InternalDomain.g:2580:1: rule__Reference__ValueobjectAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Reference__ValueobjectAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2584:1: ( ( ( ruleEString ) ) )
            // InternalDomain.g:2585:2: ( ( ruleEString ) )
            {
            // InternalDomain.g:2585:2: ( ( ruleEString ) )
            // InternalDomain.g:2586:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getValueobjectValueObjectCrossReference_8_1_0()); 
            // InternalDomain.g:2587:3: ( ruleEString )
            // InternalDomain.g:2588:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getValueobjectValueObjectEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getValueobjectValueObjectEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getValueobjectValueObjectCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__Reference__ValueobjectAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080120000L});

}
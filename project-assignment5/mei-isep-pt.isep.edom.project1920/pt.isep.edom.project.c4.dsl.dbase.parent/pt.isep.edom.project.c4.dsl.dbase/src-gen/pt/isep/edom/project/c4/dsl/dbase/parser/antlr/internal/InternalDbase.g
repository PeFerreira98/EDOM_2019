/*
 * generated by Xtext 2.12.0
 */
grammar InternalDbase;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package pt.isep.edom.project.c4.dsl.dbase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDbaseModel
entryRuleDbaseModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDbaseModelRule()); }
	iv_ruleDbaseModel=ruleDbaseModel
	{ $current=$iv_ruleDbaseModel.current; }
	EOF;

// Rule DbaseModel
ruleDbaseModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDbaseModelAccess().getDbaseModelAction_0(),
					$current);
			}
		)
		otherlv_1='DbaseModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDbaseModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='tables'
			{
				newLeafNode(otherlv_4, grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0());
					}
					lv_tables_6_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDbaseModelRule());
						}
						add(
							$current,
							"tables",
							lv_tables_6_0,
							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0());
						}
						lv_tables_8_0=ruleTable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDbaseModelRule());
							}
							add(
								$current,
								"tables",
								lv_tables_8_0,
								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTableAccess().getTableAction_0(),
					$current);
			}
		)
		otherlv_1='Table'
		{
			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='entity'
			{
				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getEntityKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0());
					}
					lv_entity_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						set(
							$current,
							"entity",
							lv_entity_5_0,
							"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='columns'
			{
				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getColumnsKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0());
					}
					lv_columns_8_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTableRule());
						}
						add(
							$current,
							"columns",
							lv_columns_8_0,
							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getTableAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0());
						}
						lv_columns_10_0=ruleColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTableRule());
							}
							add(
								$current,
								"columns",
								lv_columns_10_0,
								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getColumnAccess().getColumnAction_0(),
					$current);
			}
		)
		(
			(
				lv_key_1_0='key'
				{
					newLeafNode(lv_key_1_0, grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnRule());
					}
					setWithLastConsumed($current, "key", true, "key");
				}
			)
		)?
		otherlv_2='Column'
		{
			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='type'
			{
				newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getTypeKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_5_1_0());
					}
					lv_type_6_0=ruleColumnType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColumnRule());
						}
						set(
							$current,
							"type",
							lv_type_6_0,
							"pt.isep.edom.project.c4.dsl.dbase.Dbase.ColumnType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='foreignKey'
			{
				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getForeignKeyKeyword_6_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_2_0());
					}
					lv_foreignKey_9_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColumnRule());
						}
						add(
							$current,
							"foreignKey",
							lv_foreignKey_9_0,
							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_3_1_0());
						}
						lv_foreignKey_11_0=ruleColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getColumnRule());
							}
							add(
								$current,
								"foreignKey",
								lv_foreignKey_11_0,
								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Rule ColumnType
ruleColumnType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='VARCHAR'
			{
				$current = grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='INTEGER'
			{
				$current = grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='REAL'
			{
				$current = grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

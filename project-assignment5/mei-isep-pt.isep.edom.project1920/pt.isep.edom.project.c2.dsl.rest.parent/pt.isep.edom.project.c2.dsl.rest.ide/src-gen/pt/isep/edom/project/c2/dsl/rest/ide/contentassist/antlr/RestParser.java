/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pt.isep.edom.project.c2.dsl.rest.ide.contentassist.antlr.internal.InternalRestParser;
import pt.isep.edom.project.c2.dsl.rest.services.RestGrammarAccess;

public class RestParser extends AbstractContentAssistParser {

	@Inject
	private RestGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRestParser createParser() {
		InternalRestParser result = new InternalRestParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getRestModelAccess().getGroup(), "rule__RestModel__Group__0");
					put(grammarAccess.getRestModelAccess().getGroup_4(), "rule__RestModel__Group_4__0");
					put(grammarAccess.getRestModelAccess().getGroup_5(), "rule__RestModel__Group_5__0");
					put(grammarAccess.getRestModelAccess().getGroup_5_3(), "rule__RestModel__Group_5_3__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getResourceAccess().getGroup_8(), "rule__Resource__Group_8__0");
					put(grammarAccess.getResourceAccess().getGroup_9(), "rule__Resource__Group_9__0");
					put(grammarAccess.getResourceAccess().getGroup_9_3(), "rule__Resource__Group_9_3__0");
					put(grammarAccess.getResourceAccess().getGroup_10(), "rule__Resource__Group_10__0");
					put(grammarAccess.getResourceAccess().getGroup_10_3(), "rule__Resource__Group_10_3__0");
					put(grammarAccess.getRestModelAccess().getNameAssignment_2(), "rule__RestModel__NameAssignment_2");
					put(grammarAccess.getRestModelAccess().getUrlAssignment_4_1(), "rule__RestModel__UrlAssignment_4_1");
					put(grammarAccess.getRestModelAccess().getResourcesAssignment_5_2(), "rule__RestModel__ResourcesAssignment_5_2");
					put(grammarAccess.getRestModelAccess().getResourcesAssignment_5_3_1(), "rule__RestModel__ResourcesAssignment_5_3_1");
					put(grammarAccess.getResourceAccess().getPutAssignment_1(), "rule__Resource__PutAssignment_1");
					put(grammarAccess.getResourceAccess().getPostAssignment_2(), "rule__Resource__PostAssignment_2");
					put(grammarAccess.getResourceAccess().getDeleteAssignment_3(), "rule__Resource__DeleteAssignment_3");
					put(grammarAccess.getResourceAccess().getGetAssignment_4(), "rule__Resource__GetAssignment_4");
					put(grammarAccess.getResourceAccess().getNameAssignment_6(), "rule__Resource__NameAssignment_6");
					put(grammarAccess.getResourceAccess().getEntityAssignment_8_1(), "rule__Resource__EntityAssignment_8_1");
					put(grammarAccess.getResourceAccess().getReferenceAssignment_9_2(), "rule__Resource__ReferenceAssignment_9_2");
					put(grammarAccess.getResourceAccess().getReferenceAssignment_9_3_1(), "rule__Resource__ReferenceAssignment_9_3_1");
					put(grammarAccess.getResourceAccess().getSubresourceAssignment_10_2(), "rule__Resource__SubresourceAssignment_10_2");
					put(grammarAccess.getResourceAccess().getSubresourceAssignment_10_3_1(), "rule__Resource__SubresourceAssignment_10_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.mmapdsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import mindmap.Map;
import mindmap.MapElement;
import mindmap.Topic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import pt.isep.edom.mmapdsl.services.MMapDslGrammarAccess;

@SuppressWarnings("all")
public class MMapDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MMapDslGrammarAccess _mMapDslGrammarAccess;
  
  protected void _format(final Map map, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(map).keyword(this._mMapDslGrammarAccess.getMapAccess().getLeftCurlyBracketKeyword_4_1());
    final ISemanticRegion close = this.textRegionExtensions.regionFor(map).keyword(this._mMapDslGrammarAccess.getMapAccess().getRightCurlyBracketKeyword_4_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    EList<MapElement> _elements = map.getElements();
    for (final MapElement mapElement : _elements) {
      {
        document.<MapElement>format(mapElement);
        final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<MapElement>append(mapElement, _function_2);
      }
    }
  }
  
  protected void _format(final Topic topic, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(topic).keyword("{");
    final ISemanticRegion close = this.textRegionExtensions.regionFor(topic).keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
  }
  
  public void format(final Object topic, final IFormattableDocument document) {
    if (topic instanceof XtextResource) {
      _format((XtextResource)topic, document);
      return;
    } else if (topic instanceof Topic) {
      _format((Topic)topic, document);
      return;
    } else if (topic instanceof Map) {
      _format((Map)topic, document);
      return;
    } else if (topic instanceof EObject) {
      _format((EObject)topic, document);
      return;
    } else if (topic == null) {
      _format((Void)null, document);
      return;
    } else if (topic != null) {
      _format(topic, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(topic, document).toString());
    }
  }
}

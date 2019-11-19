/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import pt.isep.edom.project.c2.dsl.rest.ui.internal.RestActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RestExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RestActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RestActivator.getInstance().getInjector(RestActivator.PT_ISEP_EDOM_PROJECT_C2_DSL_REST_REST);
	}
	
}

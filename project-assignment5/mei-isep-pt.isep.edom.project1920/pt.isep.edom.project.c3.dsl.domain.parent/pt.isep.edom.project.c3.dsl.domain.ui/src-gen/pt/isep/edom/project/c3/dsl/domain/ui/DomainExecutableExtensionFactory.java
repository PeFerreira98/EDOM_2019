/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c3.dsl.domain.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import pt.isep.edom.project.c3.dsl.domain.ui.internal.DomainActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DomainExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DomainActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DomainActivator.getInstance().getInjector(DomainActivator.PT_ISEP_EDOM_PROJECT_C3_DSL_DOMAIN_DOMAIN);
	}
	
}

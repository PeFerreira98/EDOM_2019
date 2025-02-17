/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c0.dsl.usecase.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import pt.isep.edom.project.c0.dsl.usecase.ui.internal.UsecaseActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UseCaseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UsecaseActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UsecaseActivator.getInstance().getInjector(UsecaseActivator.PT_ISEP_EDOM_PROJECT_C0_DSL_USECASE_USECASE);
	}
	
}

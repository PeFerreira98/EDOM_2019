/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c2.dsl.rest;

import pt.isep.edom.project.c2.dsl.rest.RestStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RestStandaloneSetup extends RestStandaloneSetupGenerated {
  public static void doSetup() {
    new RestStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

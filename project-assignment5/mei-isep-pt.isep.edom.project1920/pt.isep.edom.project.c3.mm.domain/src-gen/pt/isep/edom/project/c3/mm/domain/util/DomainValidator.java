/**
 */
package pt.isep.edom.project.c3.mm.domain.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.isep.edom.project.c3.mm.domain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage
 * @generated
 */
public class DomainValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomainValidator INSTANCE = new DomainValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.isep.edom.project.c3.mm.domain";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return DomainPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case DomainPackage.DOMAIN_MODEL:
			return validateDomainModel((DomainModel) value, diagnostics, context);
		case DomainPackage.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		case DomainPackage.FIELD:
			return validateField((Field) value, diagnostics, context);
		case DomainPackage.REFERENCE:
			return validateReference((Reference) value, diagnostics, context);
		case DomainPackage.VALUE_OBJECT:
			return validateValueObject((ValueObject) value, diagnostics, context);
		case DomainPackage.FIELD_TYPE:
			return validateFieldType((FieldType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_mustCheckRoot(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_merda(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_mustHaveDescription(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustCheckRoot constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_CHECK_ROOT__EEXPRESSION = "root = true or root = false";

	/**
	 * Validates the mustCheckRoot constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_mustCheckRoot(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustCheckRoot",
				ENTITY__MUST_CHECK_ROOT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the merda constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MERDA__EEXPRESSION = "self.oclType().allInstances() -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the merda constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_merda(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "merda", ENTITY__MERDA__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not name.oclIsInvalid()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_mustHaveDescription(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				ENTITY__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueObject(ValueObject valueObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DomainValidator

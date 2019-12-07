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
		if (!validate_NoCircularContainment(domainModel, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDomainModel_valueObjectNameNotEqual(domainModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the valueObjectNameNotEqual constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOMAIN_MODEL__VALUE_OBJECT_NAME_NOT_EQUAL__EEXPRESSION = "self.valueobject -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the valueObjectNameNotEqual constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_valueObjectNameNotEqual(DomainModel domainModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.DOMAIN_MODEL, domainModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "valueObjectNameNotEqual",
				DOMAIN_MODEL__VALUE_OBJECT_NAME_NOT_EQUAL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
			result &= validateEntity_mustHaveDifferentName(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_mustHaveDescription(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_mustNotHaveRootReference(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_referenceNameNotEqual(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_fieldNameNotEqual(entity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntity_mustHaveDifferentFieldName(entity, diagnostics, context);
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
	 * The cached validation expression for the mustHaveDifferentName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_HAVE_DIFFERENT_NAME__EEXPRESSION = "self.oclType().allInstances() -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the mustHaveDifferentName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_mustHaveDifferentName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDifferentName",
				ENTITY__MUST_HAVE_DIFFERENT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_HAVE_DESCRIPTION__EEXPRESSION = "name.oclIsInvalid() = false";

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
	 * The cached validation expression for the mustNotHaveRootReference constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_NOT_HAVE_ROOT_REFERENCE__EEXPRESSION = "self.root = 'true' implies self.references -> one(Entity.root = 'true') = false";

	/**
	 * Validates the mustNotHaveRootReference constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_mustNotHaveRootReference(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustNotHaveRootReference",
				ENTITY__MUST_NOT_HAVE_ROOT_REFERENCE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the referenceNameNotEqual constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__REFERENCE_NAME_NOT_EQUAL__EEXPRESSION = "self.references -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the referenceNameNotEqual constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_referenceNameNotEqual(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "referenceNameNotEqual",
				ENTITY__REFERENCE_NAME_NOT_EQUAL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the fieldNameNotEqual constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__FIELD_NAME_NOT_EQUAL__EEXPRESSION = "self.fields -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the fieldNameNotEqual constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_fieldNameNotEqual(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "fieldNameNotEqual",
				ENTITY__FIELD_NAME_NOT_EQUAL__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDifferentFieldName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__MUST_HAVE_DIFFERENT_FIELD_NAME__EEXPRESSION = "self.fields -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the mustHaveDifferentFieldName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_mustHaveDifferentFieldName(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.ENTITY, entity, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDifferentFieldName",
				ENTITY__MUST_HAVE_DIFFERENT_FIELD_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
		if (!validate_NoCircularContainment(reference, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_mustHaveValueObjectOrEntity(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_needsName(reference, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateReference_mustHaveDifferentReferenceName(reference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveValueObjectOrEntity constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__MUST_HAVE_VALUE_OBJECT_OR_ENTITY__EEXPRESSION = "entity.oclIsUndefined() <> valueobject.oclIsUndefined()";

	/**
	 * Validates the mustHaveValueObjectOrEntity constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_mustHaveValueObjectOrEntity(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveValueObjectOrEntity",
				REFERENCE__MUST_HAVE_VALUE_OBJECT_OR_ENTITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the needsName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__NEEDS_NAME__EEXPRESSION = "name.oclIsUndefined() = false";

	/**
	 * Validates the needsName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_needsName(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "needsName", REFERENCE__NEEDS_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDifferentReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__MUST_HAVE_DIFFERENT_REFERENCE_NAME__EEXPRESSION = "self.oclType().allInstances() -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the mustHaveDifferentReferenceName constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_mustHaveDifferentReferenceName(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DomainPackage.Literals.REFERENCE, reference, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDifferentReferenceName",
				REFERENCE__MUST_HAVE_DIFFERENT_REFERENCE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueObject(ValueObject valueObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueObject, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(valueObject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValueObject_mustHaveDifferentValueObjectName(valueObject, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveDifferentValueObjectName constraint of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_OBJECT__MUST_HAVE_DIFFERENT_VALUE_OBJECT_NAME__EEXPRESSION = "self.oclType().allInstances() -> exists(r | self <> r  and  self.name =  r.name) = false";

	/**
	 * Validates the mustHaveDifferentValueObjectName constraint of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueObject_mustHaveDifferentValueObjectName(ValueObject valueObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DomainPackage.Literals.VALUE_OBJECT, valueObject, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDifferentValueObjectName",
				VALUE_OBJECT__MUST_HAVE_DIFFERENT_VALUE_OBJECT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
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

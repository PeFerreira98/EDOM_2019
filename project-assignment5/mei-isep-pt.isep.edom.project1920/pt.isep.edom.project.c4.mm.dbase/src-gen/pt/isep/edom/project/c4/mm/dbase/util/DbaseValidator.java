/**
 */
package pt.isep.edom.project.c4.mm.dbase.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.isep.edom.project.c4.mm.dbase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage
 * @generated
 */
public class DbaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DbaseValidator INSTANCE = new DbaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.isep.edom.project.c4.mm.dbase";

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
	public DbaseValidator() {
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
		return DbasePackage.eINSTANCE;
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
		case DbasePackage.DBASE_MODEL:
			return validateDbaseModel((DbaseModel) value, diagnostics, context);
		case DbasePackage.TABLE:
			return validateTable((Table) value, diagnostics, context);
		case DbasePackage.COLUMN:
			return validateColumn((Column) value, diagnostics, context);
		case DbasePackage.CONSTRAINT:
			return validateConstraint((Constraint) value, diagnostics, context);
		case DbasePackage.RELATIONSHIP:
			return validateRelationship((Relationship) value, diagnostics, context);
		case DbasePackage.COLUMN_TYPE:
			return validateColumnType((ColumnType) value, diagnostics, context);
		case DbasePackage.CARDINALITY_TYPE:
			return validateCardinalityType((CardinalityType) value, diagnostics, context);
		case DbasePackage.CONSTRAINT_TYPE:
			return validateConstraintType((ConstraintType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel(DbaseModel dbaseModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dbaseModel, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_haveDBModelName(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_validDBModelName(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_containTables(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_uniqueTableName(dbaseModel, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDbaseModel_uniqueEntitieName(dbaseModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the haveDBModelName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__HAVE_DB_MODEL_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the haveDBModelName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_haveDBModelName(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "haveDBModelName",
				DBASE_MODEL__HAVE_DB_MODEL_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the validDBModelName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__VALID_DB_MODEL_NAME__EEXPRESSION = "name.matches('[a-zA-Z]*')";

	/**
	 * Validates the validDBModelName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_validDBModelName(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validDBModelName",
				DBASE_MODEL__VALID_DB_MODEL_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the containTables constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__CONTAIN_TABLES__EEXPRESSION = "self.tables->notEmpty()";

	/**
	 * Validates the containTables constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_containTables(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "containTables",
				DBASE_MODEL__CONTAIN_TABLES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the uniqueTableName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__UNIQUE_TABLE_NAME__EEXPRESSION = "self.tables->isUnique(name)";

	/**
	 * Validates the uniqueTableName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_uniqueTableName(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueTableName",
				DBASE_MODEL__UNIQUE_TABLE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the uniqueEntitieName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DBASE_MODEL__UNIQUE_ENTITIE_NAME__EEXPRESSION = "self.tables->isUnique(entity)";

	/**
	 * Validates the uniqueEntitieName constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbaseModel_uniqueEntitieName(DbaseModel dbaseModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.DBASE_MODEL, dbaseModel, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueEntitieName",
				DBASE_MODEL__UNIQUE_ENTITIE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_haveTableName(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_validTableName(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_containColumns(table, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTable_uniqueTableColumnsName(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the haveTableName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__HAVE_TABLE_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the haveTableName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_haveTableName(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "haveTableName", TABLE__HAVE_TABLE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the validTableName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__VALID_TABLE_NAME__EEXPRESSION = "name.matches('[a-zA-Z]*')";

	/**
	 * Validates the validTableName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_validTableName(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validTableName",
				TABLE__VALID_TABLE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the containColumns constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__CONTAIN_COLUMNS__EEXPRESSION = "self.columns->notEmpty()";

	/**
	 * Validates the containColumns constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_containColumns(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "containColumns",
				TABLE__CONTAIN_COLUMNS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the uniqueTableColumnsName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__UNIQUE_TABLE_COLUMNS_NAME__EEXPRESSION = "self.columns->isUnique(Column.name)";

	/**
	 * Validates the uniqueTableColumnsName constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_uniqueTableColumnsName(Table table, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.TABLE, table, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueTableColumnsName",
				TABLE__UNIQUE_TABLE_COLUMNS_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(column, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_haveColumnName(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_validColumnName(column, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColumn_containType(column, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the haveColumnName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__HAVE_COLUMN_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the haveColumnName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_haveColumnName(Column column, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "haveColumnName",
				COLUMN__HAVE_COLUMN_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the validColumnName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__VALID_COLUMN_NAME__EEXPRESSION = "name.matches('[a-zA-Z]*')";

	/**
	 * Validates the validColumnName constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_validColumnName(Column column, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validColumnName",
				COLUMN__VALID_COLUMN_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the containType constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLUMN__CONTAIN_TYPE__EEXPRESSION = "self.type->notEmpty()";

	/**
	 * Validates the containType constraint of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn_containType(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(DbasePackage.Literals.COLUMN, column, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "containType", COLUMN__CONTAIN_TYPE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraint, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConstraint_constraintPKIsIntegerType(constraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the constraintPKIsIntegerType constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINT__CONSTRAINT_PK_IS_INTEGER_TYPE__EEXPRESSION = "self.constraintType = 0 implies self.column.type = 1";

	/**
	 * Validates the constraintPKIsIntegerType constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_constraintPKIsIntegerType(Constraint constraint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.CONSTRAINT, constraint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "constraintPKIsIntegerType",
				CONSTRAINT__CONSTRAINT_PK_IS_INTEGER_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRelationship_validRelationTable(relationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the validRelationTable constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__VALID_RELATION_TABLE__EEXPRESSION = "self.table->notEmpty()";

	/**
	 * Validates the validRelationTable constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_validRelationTable(Relationship relationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(DbasePackage.Literals.RELATIONSHIP, relationship, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validRelationTable",
				RELATIONSHIP__VALID_RELATION_TABLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityType(CardinalityType cardinalityType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintType(ConstraintType constraintType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

} //DbaseValidator

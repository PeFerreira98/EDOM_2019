/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c4.mm.dbase.DbaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DbasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dbase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbasePackage eINSTANCE = pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.DbaseModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbaseModelImpl
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getDbaseModel()
	 * @generated
	 */
	int DBASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASE_MODEL__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.TableImpl
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.ColumnImpl
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RELATIONSHIP = 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Cardinality Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CARDINALITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.ColumnType <em>Column Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 5;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.CardinalityType <em>Cardinality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.CardinalityType
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getCardinalityType()
	 * @generated
	 */
	int CARDINALITY_TYPE = 6;

	/**
	 * The meta object id for the '{@link pt.isep.edom.project.c4.mm.dbase.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.edom.project.c4.mm.dbase.ConstraintType
	 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbaseModel
	 * @generated
	 */
	EClass getDbaseModel();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbaseModel#getName()
	 * @see #getDbaseModel()
	 * @generated
	 */
	EAttribute getDbaseModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c4.mm.dbase.DbaseModel#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbaseModel#getTables()
	 * @see #getDbaseModel()
	 * @generated
	 */
	EReference getDbaseModel_Tables();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c4.mm.dbase.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c4.mm.dbase.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Table#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Table#getEntity()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c4.mm.dbase.Table#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Table#getConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraint();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c4.mm.dbase.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c4.mm.dbase.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Constraint#getConstraintType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ConstraintType();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Constraint#getColumn()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Constraint#getRelationship()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Relationship();

	/**
	 * Returns the meta object for class '{@link pt.isep.edom.project.c4.mm.dbase.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getCardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Relationship#getCardinalityType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_CardinalityType();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.Relationship#getTable()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Table();

	/**
	 * Returns the meta object for enum '{@link pt.isep.edom.project.c4.mm.dbase.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Column Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @generated
	 */
	EEnum getColumnType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.edom.project.c4.mm.dbase.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.CardinalityType
	 * @generated
	 */
	EEnum getCardinalityType();

	/**
	 * Returns the meta object for enum '{@link pt.isep.edom.project.c4.mm.dbase.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see pt.isep.edom.project.c4.mm.dbase.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbaseFactory getDbaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.DbaseModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbaseModelImpl
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getDbaseModel()
		 * @generated
		 */
		EClass DBASE_MODEL = eINSTANCE.getDbaseModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBASE_MODEL__NAME = eINSTANCE.getDbaseModel_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBASE_MODEL__TABLES = eINSTANCE.getDbaseModel_Tables();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.TableImpl
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ENTITY = eINSTANCE.getTable_Entity();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINT = eINSTANCE.getTable_Constraint();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.ColumnImpl
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getConstraint_ConstraintType();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__COLUMN = eINSTANCE.getConstraint_Column();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__RELATIONSHIP = eINSTANCE.getConstraint_Relationship();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Cardinality Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CARDINALITY_TYPE = eINSTANCE.getRelationship_CardinalityType();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TABLE = eINSTANCE.getRelationship_Table();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.ColumnType <em>Column Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getColumnType()
		 * @generated
		 */
		EEnum COLUMN_TYPE = eINSTANCE.getColumnType();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.CardinalityType <em>Cardinality Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.CardinalityType
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getCardinalityType()
		 * @generated
		 */
		EEnum CARDINALITY_TYPE = eINSTANCE.getCardinalityType();

		/**
		 * The meta object literal for the '{@link pt.isep.edom.project.c4.mm.dbase.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.edom.project.c4.mm.dbase.ConstraintType
		 * @see pt.isep.edom.project.c4.mm.dbase.impl.DbasePackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

	}

} //DbasePackage

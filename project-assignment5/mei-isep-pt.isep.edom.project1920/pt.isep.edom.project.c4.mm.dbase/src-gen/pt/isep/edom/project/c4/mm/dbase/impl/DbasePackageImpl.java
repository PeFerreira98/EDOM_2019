/**
 */
package pt.isep.edom.project.c4.mm.dbase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import pt.isep.edom.project.c4.mm.dbase.CardinalityType;
import pt.isep.edom.project.c4.mm.dbase.Column;
import pt.isep.edom.project.c4.mm.dbase.ColumnType;
import pt.isep.edom.project.c4.mm.dbase.Constraint;
import pt.isep.edom.project.c4.mm.dbase.ConstraintType;
import pt.isep.edom.project.c4.mm.dbase.DbaseFactory;
import pt.isep.edom.project.c4.mm.dbase.DbaseModel;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;
import pt.isep.edom.project.c4.mm.dbase.Relationship;
import pt.isep.edom.project.c4.mm.dbase.Table;
import pt.isep.edom.project.c4.mm.dbase.util.DbaseValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbasePackageImpl extends EPackageImpl implements DbasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum columnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbasePackageImpl() {
		super(eNS_URI, DbaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DbasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbasePackage init() {
		if (isInited)
			return (DbasePackage) EPackage.Registry.INSTANCE.getEPackage(DbasePackage.eNS_URI);

		// Obtain or create and register package
		DbasePackageImpl theDbasePackage = (DbasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DbasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DbasePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDbasePackage.createPackageContents();

		// Initialize created meta-data
		theDbasePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDbasePackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return DbaseValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDbasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbasePackage.eNS_URI, theDbasePackage);
		return theDbasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbaseModel() {
		return dbaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbaseModel_Name() {
		return (EAttribute) dbaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbaseModel_Tables() {
		return (EReference) dbaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Name() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Entity() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Constraint() {
		return (EReference) tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Name() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Type() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ConstraintType() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Column() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Relationship() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_CardinalityType() {
		return (EAttribute) relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Table() {
		return (EReference) relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColumnType() {
		return columnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalityType() {
		return cardinalityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbaseFactory getDbaseFactory() {
		return (DbaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dbaseModelEClass = createEClass(DBASE_MODEL);
		createEAttribute(dbaseModelEClass, DBASE_MODEL__NAME);
		createEReference(dbaseModelEClass, DBASE_MODEL__TABLES);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__NAME);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEAttribute(tableEClass, TABLE__ENTITY);
		createEReference(tableEClass, TABLE__CONSTRAINT);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__TYPE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEAttribute(constraintEClass, CONSTRAINT__CONSTRAINT_TYPE);
		createEReference(constraintEClass, CONSTRAINT__COLUMN);
		createEReference(constraintEClass, CONSTRAINT__RELATIONSHIP);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__CARDINALITY_TYPE);
		createEReference(relationshipEClass, RELATIONSHIP__TABLE);

		// Create enums
		columnTypeEEnum = createEEnum(COLUMN_TYPE);
		cardinalityTypeEEnum = createEEnum(CARDINALITY_TYPE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dbaseModelEClass, DbaseModel.class, "DbaseModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbaseModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DbaseModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDbaseModel_Tables(), this.getTable(), null, "tables", null, 0, -1, DbaseModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTable_Entity(), ecorePackage.getEString(), "entity", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, Table.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Type(), this.getColumnType(), "type", null, 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_ConstraintType(), this.getConstraintType(), "constraintType", null, 0, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Column(), this.getColumn(), null, "column", null, 1, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Relationship(), this.getRelationship(), null, "relationship", null, 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_CardinalityType(), this.getCardinalityType(), "cardinalityType", null, 0, 1,
				Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Table(), this.getTable(), null, "table", null, 1, 1, Relationship.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(columnTypeEEnum, ColumnType.class, "ColumnType");
		addEEnumLiteral(columnTypeEEnum, ColumnType.VARCHAR);
		addEEnumLiteral(columnTypeEEnum, ColumnType.INTEGER);
		addEEnumLiteral(columnTypeEEnum, ColumnType.REAL);
		addEEnumLiteral(columnTypeEEnum, ColumnType.BOOL);

		initEEnum(cardinalityTypeEEnum, CardinalityType.class, "CardinalityType");
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ONE_TO_ONE);
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.ONE_TO_MANY);
		addEEnumLiteral(cardinalityTypeEEnum, CardinalityType.MANY_TO_MANY);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.PKFK);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.UNIQUE);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.NOTNULL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(dbaseModelEClass, source, new String[] { "constraints",
				"haveDBModelName validDBModelName containTables uniqueTableName uniqueEntitieName" });
		addAnnotation(tableEClass, source,
				new String[] { "constraints", "haveTableName validTableName containColumns uniqueTableColumnsName" });
		addAnnotation(columnEClass, source,
				new String[] { "constraints", "haveColumnName validColumnName containType" });
		addAnnotation(constraintEClass, source, new String[] { "constraints", "constraintPKIsIntegerType" });
		addAnnotation(relationshipEClass, source, new String[] { "constraints", "validRelationTable" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(dbaseModelEClass, source,
				new String[] { "haveDBModelName", "not name.oclIsUndefined()", "validDBModelName",
						"name.matches(\'[a-zA-Z]*\')", "containTables", "self.tables->notEmpty()", "uniqueTableName",
						"self.tables->isUnique(name)", "uniqueEntitieName", "self.tables->isUnique(entity)" });
		addAnnotation(tableEClass, source,
				new String[] { "haveTableName", "not name.oclIsUndefined()", "validTableName",
						"name.matches(\'[a-zA-Z]*\')", "containColumns", "self.columns->notEmpty()",
						"uniqueTableColumnsName", "self.columns->isUnique(Column.name)" });
		addAnnotation(columnEClass, source, new String[] { "haveColumnName", "not name.oclIsUndefined()",
				"validColumnName", "name.matches(\'[a-zA-Z]*\')", "containType", "self.type->notEmpty()" });
		addAnnotation(constraintEClass, source,
				new String[] { "constraintPKIsIntegerType", "self.constraintType = 0 implies self.column.type = 1" });
		addAnnotation(relationshipEClass, source, new String[] { "validRelationTable", "self.table->notEmpty()" });
	}

} //DbasePackageImpl

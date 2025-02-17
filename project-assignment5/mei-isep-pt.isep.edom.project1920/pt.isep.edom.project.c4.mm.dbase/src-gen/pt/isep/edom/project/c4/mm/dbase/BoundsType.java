/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bounds Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getBoundsType()
 * @model
 * @generated
 */
public enum BoundsType implements Enumerator {
	/**
	 * The '<em><b>One To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE(0, "OneToOne", "OneToOne"),

	/**
	 * The '<em><b>One To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_MANY(1, "OneToMany", "OneToMany"),

	/**
	 * The '<em><b>Many To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY_TO_MANY(2, "ManyToMany", "ManyToMany");

	/**
	 * The '<em><b>One To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE
	 * @model name="OneToOne"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE_VALUE = 0;

	/**
	 * The '<em><b>One To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY
	 * @model name="OneToMany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_MANY_VALUE = 1;

	/**
	 * The '<em><b>Many To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many To Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY
	 * @model name="ManyToMany"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TO_MANY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Bounds Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BoundsType[] VALUES_ARRAY = new BoundsType[] { ONE_TO_ONE, ONE_TO_MANY, MANY_TO_MANY, };

	/**
	 * A public read-only list of all the '<em><b>Bounds Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BoundsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bounds Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoundsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bounds Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BoundsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bounds Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BoundsType get(int value) {
		switch (value) {
		case ONE_TO_ONE_VALUE:
			return ONE_TO_ONE;
		case ONE_TO_MANY_VALUE:
			return ONE_TO_MANY;
		case MANY_TO_MANY_VALUE:
			return MANY_TO_MANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BoundsType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BoundsType

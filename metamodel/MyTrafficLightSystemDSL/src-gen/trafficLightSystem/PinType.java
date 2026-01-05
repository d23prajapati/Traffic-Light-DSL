/**
 */
package trafficLightSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trafficLightSystem.TrafficLightSystemPackage#getPinType()
 * @model
 * @generated
 */
public enum PinType implements Enumerator {
	/**
	 * The '<em><b>DIGITAL IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_IN(0, "DIGITAL_IN", "DIGITAL_IN"),

	/**
	 * The '<em><b>DIGITAL OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_OUT(1, "DIGITAL_OUT", "DIGITAL_OUT"),

	/**
	 * The '<em><b>ANALOG IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_IN(2, "ANALOG_IN", "ANALOG_IN"),

	/**
	 * The '<em><b>ANALOG OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_OUT(3, "ANALOG_OUT", "ANALOG_OUT"),

	/**
	 * The '<em><b>INTERRUPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT_VALUE
	 * @generated
	 * @ordered
	 */
	INTERRUPT(4, "INTERRUPT", "INTERRUPT"),

	/**
	 * The '<em><b>GND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GND_VALUE
	 * @generated
	 * @ordered
	 */
	GND(5, "GND", "GND"),

	/**
	 * The '<em><b>VCC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC_VALUE
	 * @generated
	 * @ordered
	 */
	VCC(6, "VCC", "VCC");

	/**
	 * The '<em><b>DIGITAL IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_IN_VALUE = 0;

	/**
	 * The '<em><b>DIGITAL OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_OUT_VALUE = 1;

	/**
	 * The '<em><b>ANALOG IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_IN_VALUE = 2;

	/**
	 * The '<em><b>ANALOG OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_OUT_VALUE = 3;

	/**
	 * The '<em><b>INTERRUPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERRUPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERRUPT_VALUE = 4;

	/**
	 * The '<em><b>GND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GND_VALUE = 5;

	/**
	 * The '<em><b>VCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VCC_VALUE = 6;

	/**
	 * An array of all the '<em><b>Pin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PinType[] VALUES_ARRAY = new PinType[] { DIGITAL_IN, DIGITAL_OUT, ANALOG_IN, ANALOG_OUT,
			INTERRUPT, GND, VCC, };

	/**
	 * A public read-only list of all the '<em><b>Pin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pin Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PinType get(int value) {
		switch (value) {
		case DIGITAL_IN_VALUE:
			return DIGITAL_IN;
		case DIGITAL_OUT_VALUE:
			return DIGITAL_OUT;
		case ANALOG_IN_VALUE:
			return ANALOG_IN;
		case ANALOG_OUT_VALUE:
			return ANALOG_OUT;
		case INTERRUPT_VALUE:
			return INTERRUPT;
		case GND_VALUE:
			return GND;
		case VCC_VALUE:
			return VCC;
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
	private PinType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //PinType

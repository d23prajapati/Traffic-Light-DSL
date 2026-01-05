/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.Pin#getPinNr <em>Pin Nr</em>}</li>
 *   <li>{@link trafficLightSystem.Pin#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.Pin#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Nr</em>' attribute.
	 * @see #setPinNr(int)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPin_PinNr()
	 * @model
	 * @generated
	 */
	int getPinNr();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Pin#getPinNr <em>Pin Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Nr</em>' attribute.
	 * @see #getPinNr()
	 * @generated
	 */
	void setPinNr(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Pin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.PinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see trafficLightSystem.PinType
	 * @see #setType(PinType)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPin_Type()
	 * @model
	 * @generated
	 */
	PinType getType();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Pin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see trafficLightSystem.PinType
	 * @see #getType()
	 * @generated
	 */
	void setType(PinType value);

} // Pin

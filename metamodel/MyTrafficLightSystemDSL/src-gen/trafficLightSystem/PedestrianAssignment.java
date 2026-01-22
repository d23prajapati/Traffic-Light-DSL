/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedestrian Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.PedestrianAssignment#getColor <em>Color</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianAssignment#getLed <em>Led</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianAssignment#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianAssignment()
 * @model
 * @generated
 */
public interface PedestrianAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianAssignment_Color()
	 * @model
	 * @generated
	 */
	LightColor getColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianAssignment#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(LightColor value);

	/**
	 * Returns the value of the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led</em>' reference.
	 * @see #setLed(LED)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianAssignment_Led()
	 * @model
	 * @generated
	 */
	LED getLed();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianAssignment#getLed <em>Led</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led</em>' reference.
	 * @see #getLed()
	 * @generated
	 */
	void setLed(LED value);

	/**
	 * Returns the value of the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' reference.
	 * @see #setButton(Button)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianAssignment_Button()
	 * @model
	 * @generated
	 */
	Button getButton();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianAssignment#getButton <em>Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Button value);

} // PedestrianAssignment

/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedestrian Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.PedestrianController#getRequestState <em>Request State</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianController#getRedLED <em>Red LED</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianController#getGreenLED <em>Green LED</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianController#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianController()
 * @model
 * @generated
 */
public interface PedestrianController extends EObject {
	/**
	 * Returns the value of the '<em><b>Request State</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request State</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianController_RequestState()
	 * @model required="true"
	 * @generated
	 */
	EList<TrafficState> getRequestState();

	/**
	 * Returns the value of the '<em><b>Red LED</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red LED</em>' reference.
	 * @see #setRedLED(LED)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianController_RedLED()
	 * @model required="true"
	 * @generated
	 */
	LED getRedLED();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianController#getRedLED <em>Red LED</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red LED</em>' reference.
	 * @see #getRedLED()
	 * @generated
	 */
	void setRedLED(LED value);

	/**
	 * Returns the value of the '<em><b>Green LED</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green LED</em>' reference.
	 * @see #setGreenLED(LED)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianController_GreenLED()
	 * @model required="true"
	 * @generated
	 */
	LED getGreenLED();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianController#getGreenLED <em>Green LED</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green LED</em>' reference.
	 * @see #getGreenLED()
	 * @generated
	 */
	void setGreenLED(LED value);

	/**
	 * Returns the value of the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' reference.
	 * @see #setButton(Button)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianController_Button()
	 * @model
	 * @generated
	 */
	Button getButton();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianController#getButton <em>Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Button value);

} // PedestrianController

/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedestrian Light State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.PedestrianLightState#getLed <em>Led</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianLightState#getButton <em>Button</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianLightState#getActivePedestrianColor <em>Active Pedestrian Color</em>}</li>
 *   <li>{@link trafficLightSystem.PedestrianLightState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianLightState()
 * @model
 * @generated
 */
public interface PedestrianLightState extends EObject {
	/**
	 * Returns the value of the '<em><b>Led</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.LED}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianLightState_Led()
	 * @model upper="2"
	 * @generated
	 */
	EList<LED> getLed();

	/**
	 * Returns the value of the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' reference.
	 * @see #setButton(Button)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianLightState_Button()
	 * @model
	 * @generated
	 */
	Button getButton();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianLightState#getButton <em>Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Button value);

	/**
	 * Returns the value of the '<em><b>Active Pedestrian Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Pedestrian Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setActivePedestrianColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianLightState_ActivePedestrianColor()
	 * @model
	 * @generated
	 */
	LightColor getActivePedestrianColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianLightState#getActivePedestrianColor <em>Active Pedestrian Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Pedestrian Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getActivePedestrianColor()
	 * @generated
	 */
	void setActivePedestrianColor(LightColor value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPedestrianLightState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.PedestrianLightState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PedestrianLightState

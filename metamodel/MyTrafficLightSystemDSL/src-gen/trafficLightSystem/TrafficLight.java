/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficLight#getDirection <em>Direction</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLight#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLight()
 * @model
 * @generated
 */
public interface TrafficLight extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see trafficLightSystem.Direction
	 * @see #setDirection(Direction)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLight_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLight#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see trafficLightSystem.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficLightModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLight_Module()
	 * @model
	 * @generated
	 */
	EList<TrafficLightModule> getModule();

} // TrafficLight

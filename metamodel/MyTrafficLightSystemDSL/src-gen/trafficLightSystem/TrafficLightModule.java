/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficLightModule#getPinGroups <em>Pin Groups</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightModule#getDirection <em>Direction</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightModule#getRedPin <em>Red Pin</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightModule#getYellowPin <em>Yellow Pin</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightModule#getGreenPin <em>Green Pin</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule()
 * @model
 * @generated
 */
public interface TrafficLightModule extends Component {
	/**
	 * Returns the value of the '<em><b>Pin Groups</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Groups</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_PinGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPinGroups();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see trafficLightSystem.Direction
	 * @see #setDirection(Direction)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see trafficLightSystem.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Red Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Pin</em>' reference.
	 * @see #setRedPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_RedPin()
	 * @model
	 * @generated
	 */
	Pin getRedPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getRedPin <em>Red Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Pin</em>' reference.
	 * @see #getRedPin()
	 * @generated
	 */
	void setRedPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Yellow Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow Pin</em>' reference.
	 * @see #setYellowPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_YellowPin()
	 * @model
	 * @generated
	 */
	Pin getYellowPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getYellowPin <em>Yellow Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow Pin</em>' reference.
	 * @see #getYellowPin()
	 * @generated
	 */
	void setYellowPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Green Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Pin</em>' reference.
	 * @see #setGreenPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_GreenPin()
	 * @model
	 * @generated
	 */
	Pin getGreenPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getGreenPin <em>Green Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Pin</em>' reference.
	 * @see #getGreenPin()
	 * @generated
	 */
	void setGreenPin(Pin value);

} // TrafficLightModule

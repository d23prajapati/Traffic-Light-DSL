/**
 */
package trafficLightSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
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
	 * Returns the value of the '<em><b>Red Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Pin</em>' containment reference.
	 * @see #setRedPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_RedPin()
	 * @model containment="true"
	 * @generated
	 */
	Pin getRedPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getRedPin <em>Red Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Pin</em>' containment reference.
	 * @see #getRedPin()
	 * @generated
	 */
	void setRedPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Yellow Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow Pin</em>' containment reference.
	 * @see #setYellowPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_YellowPin()
	 * @model containment="true"
	 * @generated
	 */
	Pin getYellowPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getYellowPin <em>Yellow Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow Pin</em>' containment reference.
	 * @see #getYellowPin()
	 * @generated
	 */
	void setYellowPin(Pin value);

	/**
	 * Returns the value of the '<em><b>Green Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Pin</em>' containment reference.
	 * @see #setGreenPin(Pin)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightModule_GreenPin()
	 * @model containment="true"
	 * @generated
	 */
	Pin getGreenPin();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightModule#getGreenPin <em>Green Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Pin</em>' containment reference.
	 * @see #getGreenPin()
	 * @generated
	 */
	void setGreenPin(Pin value);

} // TrafficLightModule

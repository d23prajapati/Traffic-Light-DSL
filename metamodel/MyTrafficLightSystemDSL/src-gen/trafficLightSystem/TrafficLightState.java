/**
 */
package trafficLightSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficLightState#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightState#getActiveColor <em>Active Color</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightState#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightState#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightState()
 * @model
 * @generated
 */
public interface TrafficLightState extends State {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightState_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightState#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Active Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setActiveColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightState_ActiveColor()
	 * @model
	 * @generated
	 */
	LightColor getActiveColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightState#getActiveColor <em>Active Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getActiveColor()
	 * @generated
	 */
	void setActiveColor(LightColor value);

	/**
	 * Returns the value of the '<em><b>Traffic Light Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Light Module</em>' reference.
	 * @see #setTrafficLightModule(TrafficLightModule)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightState_TrafficLightModule()
	 * @model
	 * @generated
	 */
	TrafficLightModule getTrafficLightModule();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightState#getTrafficLightModule <em>Traffic Light Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Light Module</em>' reference.
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	void setTrafficLightModule(TrafficLightModule value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightState_Board()
	 * @model
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightState#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

} // TrafficLightState

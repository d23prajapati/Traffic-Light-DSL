/**
 */
package trafficLightSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.LED#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getLED()
 * @model
 * @generated
 */
public interface LED extends Component {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getLED_Color()
	 * @model
	 * @generated
	 */
	LightColor getColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.LED#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(LightColor value);

} // LED

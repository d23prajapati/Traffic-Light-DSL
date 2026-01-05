/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.Button#getPinGroups <em>Pin Groups</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Component {
	/**
	 * Returns the value of the '<em><b>Pin Groups</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Groups</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getButton_PinGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPinGroups();

} // Button

/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficCycle#getTrafficstate <em>Trafficstate</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficCycle()
 * @model
 * @generated
 */
public interface TrafficCycle extends EObject {
	/**
	 * Returns the value of the '<em><b>Trafficstate</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafficstate</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficCycle_Trafficstate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TrafficState> getTrafficstate();

} // TrafficCycle

/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficController#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficController#getTrafficLights <em>Traffic Lights</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficController#getCycle <em>Cycle</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficController#getPedestrianControllers <em>Pedestrian Controllers</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficController()
 * @model
 * @generated
 */
public interface TrafficController extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Traffic Lights</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficLight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Lights</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficController_TrafficLights()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<TrafficLight> getTrafficLights();

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' containment reference.
	 * @see #setCycle(TrafficCycle)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficController_Cycle()
	 * @model containment="true"
	 * @generated
	 */
	TrafficCycle getCycle();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficController#getCycle <em>Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' containment reference.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(TrafficCycle value);

	/**
	 * Returns the value of the '<em><b>Pedestrian Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.PedestrianController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedestrian Controllers</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficController_PedestrianControllers()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<PedestrianController> getPedestrianControllers();

} // TrafficController

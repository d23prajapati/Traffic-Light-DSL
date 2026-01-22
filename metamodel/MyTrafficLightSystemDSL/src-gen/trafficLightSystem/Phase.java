/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.Phase#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.Phase#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.Phase#getTrafficLightAssignments <em>Traffic Light Assignments</em>}</li>
 *   <li>{@link trafficLightSystem.Phase#getPedestrianAssignments <em>Pedestrian Assignments</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getPhase()
 * @model
 * @generated
 */
public interface Phase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPhase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Phase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPhase_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Phase#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Traffic Light Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficLightAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Light Assignments</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPhase_TrafficLightAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrafficLightAssignment> getTrafficLightAssignments();

	/**
	 * Returns the value of the '<em><b>Pedestrian Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.PedestrianAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedestrian Assignments</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getPhase_PedestrianAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<PedestrianAssignment> getPedestrianAssignments();

} // Phase

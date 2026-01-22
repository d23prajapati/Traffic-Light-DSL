/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junction Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.JunctionController#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.JunctionController#getTrafficLightModules <em>Traffic Light Modules</em>}</li>
 *   <li>{@link trafficLightSystem.JunctionController#getPhases <em>Phases</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getJunctionController()
 * @model
 * @generated
 */
public interface JunctionController extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getJunctionController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.JunctionController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Traffic Light Modules</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficLightModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Light Modules</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getJunctionController_TrafficLightModules()
	 * @model upper="4"
	 * @generated
	 */
	EList<TrafficLightModule> getTrafficLightModules();

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.Phase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getJunctionController_Phases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phase> getPhases();

} // JunctionController

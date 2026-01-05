/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficLightSystem#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightSystem#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightSystem#getTrafficControllers <em>Traffic Controllers</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightSystem()
 * @model
 * @generated
 */
public interface TrafficLightSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Systemstructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemstructure</em>' containment reference.
	 * @see #setSystemstructure(SystemStructure)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightSystem_Systemstructure()
	 * @model containment="true"
	 * @generated
	 */
	SystemStructure getSystemstructure();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightSystem#getSystemstructure <em>Systemstructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemstructure</em>' containment reference.
	 * @see #getSystemstructure()
	 * @generated
	 */
	void setSystemstructure(SystemStructure value);

	/**
	 * Returns the value of the '<em><b>Traffic Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Controllers</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightSystem_TrafficControllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrafficController> getTrafficControllers();

} // TrafficLightSystem

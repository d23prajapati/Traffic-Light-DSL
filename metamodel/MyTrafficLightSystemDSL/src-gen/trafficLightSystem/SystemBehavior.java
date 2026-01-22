/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.SystemBehavior#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.SystemBehavior#getJunctionController <em>Junction Controller</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getSystemBehavior()
 * @model
 * @generated
 */
public interface SystemBehavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getSystemBehavior_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.SystemBehavior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Junction Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junction Controller</em>' containment reference.
	 * @see #setJunctionController(JunctionController)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getSystemBehavior_JunctionController()
	 * @model containment="true"
	 * @generated
	 */
	JunctionController getJunctionController();

	/**
	 * Sets the value of the '{@link trafficLightSystem.SystemBehavior#getJunctionController <em>Junction Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Junction Controller</em>' containment reference.
	 * @see #getJunctionController()
	 * @generated
	 */
	void setJunctionController(JunctionController value);

} // SystemBehavior

/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.Component#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.Component#getPinGroups <em>Pin Groups</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pin Groups</b></em>' containment reference list.
	 * The list contents are of type {@link trafficLightSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Groups</em>' containment reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getComponent_PinGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPinGroups();

} // Component

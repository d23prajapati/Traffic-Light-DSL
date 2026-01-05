/**
 */
package trafficLightSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficState#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficState#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficState#getActiveTrafficLights <em>Active Traffic Lights</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficState#getActiveColor <em>Active Color</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficState#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState()
 * @model
 * @generated
 */
public interface TrafficState extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficState#getName <em>Name</em>}' attribute.
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
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficState#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Active Traffic Lights</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficLight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Traffic Lights</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState_ActiveTrafficLights()
	 * @model required="true"
	 * @generated
	 */
	EList<TrafficLight> getActiveTrafficLights();

	/**
	 * Returns the value of the '<em><b>Active Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setActiveColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState_ActiveColor()
	 * @model
	 * @generated
	 */
	LightColor getActiveColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficState#getActiveColor <em>Active Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getActiveColor()
	 * @generated
	 */
	void setActiveColor(LightColor value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link trafficLightSystem.TrafficState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficState_Next()
	 * @model
	 * @generated
	 */
	EList<TrafficState> getNext();

} // TrafficState

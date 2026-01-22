/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Light Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.TrafficLightAssignment#getColor <em>Color</em>}</li>
 *   <li>{@link trafficLightSystem.TrafficLightAssignment#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightAssignment()
 * @model
 * @generated
 */
public interface TrafficLightAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link trafficLightSystem.LightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #setColor(LightColor)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightAssignment_Color()
	 * @model
	 * @generated
	 */
	LightColor getColor();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightAssignment#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see trafficLightSystem.LightColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(LightColor value);

	/**
	 * Returns the value of the '<em><b>Traffic Light Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Light Module</em>' reference.
	 * @see #setTrafficLightModule(TrafficLightModule)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getTrafficLightAssignment_TrafficLightModule()
	 * @model
	 * @generated
	 */
	TrafficLightModule getTrafficLightModule();

	/**
	 * Sets the value of the '{@link trafficLightSystem.TrafficLightAssignment#getTrafficLightModule <em>Traffic Light Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Light Module</em>' reference.
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	void setTrafficLightModule(TrafficLightModule value);

} // TrafficLightAssignment

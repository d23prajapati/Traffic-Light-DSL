/**
 */
package trafficLightSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.OpaqueBehavior#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link trafficLightSystem.OpaqueBehavior#isIsMain <em>Is Main</em>}</li>
 * </ul>
 *
 * @see trafficLightSystem.TrafficLightSystemPackage#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Line</em>' attribute.
	 * @see #setCommandLine(String)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getOpaqueBehavior_CommandLine()
	 * @model
	 * @generated
	 */
	String getCommandLine();

	/**
	 * Sets the value of the '{@link trafficLightSystem.OpaqueBehavior#getCommandLine <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Line</em>' attribute.
	 * @see #getCommandLine()
	 * @generated
	 */
	void setCommandLine(String value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see trafficLightSystem.TrafficLightSystemPackage#getOpaqueBehavior_IsMain()
	 * @model
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link trafficLightSystem.OpaqueBehavior#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

} // OpaqueBehavior

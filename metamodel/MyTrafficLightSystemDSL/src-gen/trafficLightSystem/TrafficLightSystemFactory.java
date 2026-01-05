/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trafficLightSystem.TrafficLightSystemPackage
 * @generated
 */
public interface TrafficLightSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafficLightSystemFactory eINSTANCE = trafficLightSystem.impl.TrafficLightSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traffic Light System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Light System</em>'.
	 * @generated
	 */
	TrafficLightSystem createTrafficLightSystem();

	/**
	 * Returns a new object of class '<em>System Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Structure</em>'.
	 * @generated
	 */
	SystemStructure createSystemStructure();

	/**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
	Board createBoard();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Traffic Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Controller</em>'.
	 * @generated
	 */
	TrafficController createTrafficController();

	/**
	 * Returns a new object of class '<em>Traffic Light Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Light Module</em>'.
	 * @generated
	 */
	TrafficLightModule createTrafficLightModule();

	/**
	 * Returns a new object of class '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LED</em>'.
	 * @generated
	 */
	LED createLED();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Traffic Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Light</em>'.
	 * @generated
	 */
	TrafficLight createTrafficLight();

	/**
	 * Returns a new object of class '<em>Traffic Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Cycle</em>'.
	 * @generated
	 */
	TrafficCycle createTrafficCycle();

	/**
	 * Returns a new object of class '<em>Pedestrian Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedestrian Controller</em>'.
	 * @generated
	 */
	PedestrianController createPedestrianController();

	/**
	 * Returns a new object of class '<em>Traffic State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic State</em>'.
	 * @generated
	 */
	TrafficState createTrafficState();

	/**
	 * Returns a new object of class '<em>Pin Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin Group</em>'.
	 * @generated
	 */
	PinGroup createPinGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrafficLightSystemPackage getTrafficLightSystemPackage();

} //TrafficLightSystemFactory

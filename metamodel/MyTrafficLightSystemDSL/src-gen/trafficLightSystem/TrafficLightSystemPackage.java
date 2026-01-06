/**
 */
package trafficLightSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trafficLightSystem.TrafficLightSystemFactory
 * @model kind="package"
 * @generated
 */
public interface TrafficLightSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trafficLightSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/trafficLightSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trafficLightSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrafficLightSystemPackage eINSTANCE = trafficLightSystem.impl.TrafficLightSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightSystemImpl <em>Traffic Light System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightSystemImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightSystem()
	 * @generated
	 */
	int TRAFFIC_LIGHT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Systemstructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Traffic Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS = 2;

	/**
	 * The number of structural features of the '<em>Traffic Light System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Traffic Light System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.SystemStructureImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getSystemStructure()
	 * @generated
	 */
	int SYSTEM_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__CONNECTIONS = 3;

	/**
	 * The number of structural features of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.BoardImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PIN_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.ComponentImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PIN_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PinImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 4;

	/**
	 * The feature id for the '<em><b>Pin Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PIN_NR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.ConnectionImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficControllerImpl <em>Traffic Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficControllerImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficController()
	 * @generated
	 */
	int TRAFFIC_CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Traffic Lights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS = 1;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER__CYCLE = 2;

	/**
	 * The feature id for the '<em><b>Pedestrian Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS = 3;

	/**
	 * The number of structural features of the '<em>Traffic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Traffic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightModuleImpl <em>Traffic Light Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightModuleImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightModule()
	 * @generated
	 */
	int TRAFFIC_LIGHT_MODULE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__PIN_GROUPS = COMPONENT__PIN_GROUPS;

	/**
	 * The number of structural features of the '<em>Traffic Light Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traffic Light Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.LEDImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getLED()
	 * @generated
	 */
	int LED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN_GROUPS = COMPONENT__PIN_GROUPS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COLOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.ButtonImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN_GROUPS = COMPONENT__PIN_GROUPS;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightImpl <em>Traffic Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLight()
	 * @generated
	 */
	int TRAFFIC_LIGHT = 10;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT__MODULE = 1;

	/**
	 * The number of structural features of the '<em>Traffic Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traffic Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficCycleImpl <em>Traffic Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficCycleImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficCycle()
	 * @generated
	 */
	int TRAFFIC_CYCLE = 11;

	/**
	 * The feature id for the '<em><b>Trafficstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CYCLE__TRAFFICSTATE = 0;

	/**
	 * The number of structural features of the '<em>Traffic Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CYCLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traffic Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_CYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PedestrianControllerImpl <em>Pedestrian Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PedestrianControllerImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPedestrianController()
	 * @generated
	 */
	int PEDESTRIAN_CONTROLLER = 12;

	/**
	 * The feature id for the '<em><b>Request State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER__REQUEST_STATE = 0;

	/**
	 * The feature id for the '<em><b>Red LED</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER__RED_LED = 1;

	/**
	 * The feature id for the '<em><b>Green LED</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER__GREEN_LED = 2;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER__BUTTON = 3;

	/**
	 * The number of structural features of the '<em>Pedestrian Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pedestrian Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficStateImpl <em>Traffic State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficStateImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficState()
	 * @generated
	 */
	int TRAFFIC_STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Active Traffic Lights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS = 2;

	/**
	 * The feature id for the '<em><b>Active Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE__ACTIVE_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE__NEXT = 4;

	/**
	 * The number of structural features of the '<em>Traffic State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Traffic State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PinGroupImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinGroup()
	 * @generated
	 */
	int PIN_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__PINS = 0;

	/**
	 * The number of structural features of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.PinType
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 15;

	/**
	 * The meta object id for the '{@link trafficLightSystem.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.Direction
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 16;

	/**
	 * The meta object id for the '{@link trafficLightSystem.LightColor <em>Light Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.LightColor
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getLightColor()
	 * @generated
	 */
	int LIGHT_COLOR = 17;

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLightSystem <em>Traffic Light System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light System</em>'.
	 * @see trafficLightSystem.TrafficLightSystem
	 * @generated
	 */
	EClass getTrafficLightSystem();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLightSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.TrafficLightSystem#getName()
	 * @see #getTrafficLightSystem()
	 * @generated
	 */
	EAttribute getTrafficLightSystem_Name();

	/**
	 * Returns the meta object for the containment reference '{@link trafficLightSystem.TrafficLightSystem#getSystemstructure <em>Systemstructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemstructure</em>'.
	 * @see trafficLightSystem.TrafficLightSystem#getSystemstructure()
	 * @see #getTrafficLightSystem()
	 * @generated
	 */
	EReference getTrafficLightSystem_Systemstructure();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficLightSystem#getTrafficControllers <em>Traffic Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traffic Controllers</em>'.
	 * @see trafficLightSystem.TrafficLightSystem#getTrafficControllers()
	 * @see #getTrafficLightSystem()
	 * @generated
	 */
	EReference getTrafficLightSystem_TrafficControllers();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.SystemStructure <em>System Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Structure</em>'.
	 * @see trafficLightSystem.SystemStructure
	 * @generated
	 */
	EClass getSystemStructure();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.SystemStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.SystemStructure#getName()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EAttribute getSystemStructure_Name();

	/**
	 * Returns the meta object for the containment reference '{@link trafficLightSystem.SystemStructure#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see trafficLightSystem.SystemStructure#getBoard()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.SystemStructure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see trafficLightSystem.SystemStructure#getComponents()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.SystemStructure#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see trafficLightSystem.SystemStructure#getConnections()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Connections();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see trafficLightSystem.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.Board#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see trafficLightSystem.Board#getPinGroups()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_PinGroups();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see trafficLightSystem.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.Component#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see trafficLightSystem.Component#getPinGroups()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_PinGroups();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see trafficLightSystem.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Pin#getPinNr <em>Pin Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Nr</em>'.
	 * @see trafficLightSystem.Pin#getPinNr()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_PinNr();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Pin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see trafficLightSystem.Pin#getType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Type();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see trafficLightSystem.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.Connection#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see trafficLightSystem.Connection#getSrc()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Src();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see trafficLightSystem.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficController <em>Traffic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Controller</em>'.
	 * @see trafficLightSystem.TrafficController
	 * @generated
	 */
	EClass getTrafficController();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.TrafficController#getName()
	 * @see #getTrafficController()
	 * @generated
	 */
	EAttribute getTrafficController_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficController#getTrafficLights <em>Traffic Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traffic Lights</em>'.
	 * @see trafficLightSystem.TrafficController#getTrafficLights()
	 * @see #getTrafficController()
	 * @generated
	 */
	EReference getTrafficController_TrafficLights();

	/**
	 * Returns the meta object for the containment reference '{@link trafficLightSystem.TrafficController#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cycle</em>'.
	 * @see trafficLightSystem.TrafficController#getCycle()
	 * @see #getTrafficController()
	 * @generated
	 */
	EReference getTrafficController_Cycle();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficController#getPedestrianControllers <em>Pedestrian Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pedestrian Controllers</em>'.
	 * @see trafficLightSystem.TrafficController#getPedestrianControllers()
	 * @see #getTrafficController()
	 * @generated
	 */
	EReference getTrafficController_PedestrianControllers();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light Module</em>'.
	 * @see trafficLightSystem.TrafficLightModule
	 * @generated
	 */
	EClass getTrafficLightModule();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see trafficLightSystem.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.LED#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see trafficLightSystem.LED#getColor()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Color();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see trafficLightSystem.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLight <em>Traffic Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light</em>'.
	 * @see trafficLightSystem.TrafficLight
	 * @generated
	 */
	EClass getTrafficLight();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLight#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see trafficLightSystem.TrafficLight#getDirection()
	 * @see #getTrafficLight()
	 * @generated
	 */
	EAttribute getTrafficLight_Direction();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.TrafficLight#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Module</em>'.
	 * @see trafficLightSystem.TrafficLight#getModule()
	 * @see #getTrafficLight()
	 * @generated
	 */
	EReference getTrafficLight_Module();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficCycle <em>Traffic Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Cycle</em>'.
	 * @see trafficLightSystem.TrafficCycle
	 * @generated
	 */
	EClass getTrafficCycle();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficCycle#getTrafficstate <em>Trafficstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trafficstate</em>'.
	 * @see trafficLightSystem.TrafficCycle#getTrafficstate()
	 * @see #getTrafficCycle()
	 * @generated
	 */
	EReference getTrafficCycle_Trafficstate();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.PedestrianController <em>Pedestrian Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian Controller</em>'.
	 * @see trafficLightSystem.PedestrianController
	 * @generated
	 */
	EClass getPedestrianController();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.PedestrianController#getRequestState <em>Request State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request State</em>'.
	 * @see trafficLightSystem.PedestrianController#getRequestState()
	 * @see #getPedestrianController()
	 * @generated
	 */
	EReference getPedestrianController_RequestState();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.PedestrianController#getRedLED <em>Red LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Red LED</em>'.
	 * @see trafficLightSystem.PedestrianController#getRedLED()
	 * @see #getPedestrianController()
	 * @generated
	 */
	EReference getPedestrianController_RedLED();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.PedestrianController#getGreenLED <em>Green LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Green LED</em>'.
	 * @see trafficLightSystem.PedestrianController#getGreenLED()
	 * @see #getPedestrianController()
	 * @generated
	 */
	EReference getPedestrianController_GreenLED();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.PedestrianController#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Button</em>'.
	 * @see trafficLightSystem.PedestrianController#getButton()
	 * @see #getPedestrianController()
	 * @generated
	 */
	EReference getPedestrianController_Button();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficState <em>Traffic State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic State</em>'.
	 * @see trafficLightSystem.TrafficState
	 * @generated
	 */
	EClass getTrafficState();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.TrafficState#getName()
	 * @see #getTrafficState()
	 * @generated
	 */
	EAttribute getTrafficState_Name();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficState#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see trafficLightSystem.TrafficState#getDuration()
	 * @see #getTrafficState()
	 * @generated
	 */
	EAttribute getTrafficState_Duration();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.TrafficState#getActiveTrafficLights <em>Active Traffic Lights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Traffic Lights</em>'.
	 * @see trafficLightSystem.TrafficState#getActiveTrafficLights()
	 * @see #getTrafficState()
	 * @generated
	 */
	EReference getTrafficState_ActiveTrafficLights();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficState#getActiveColor <em>Active Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Color</em>'.
	 * @see trafficLightSystem.TrafficState#getActiveColor()
	 * @see #getTrafficState()
	 * @generated
	 */
	EAttribute getTrafficState_ActiveColor();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.TrafficState#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see trafficLightSystem.TrafficState#getNext()
	 * @see #getTrafficState()
	 * @generated
	 */
	EReference getTrafficState_Next();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.PinGroup <em>Pin Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Group</em>'.
	 * @see trafficLightSystem.PinGroup
	 * @generated
	 */
	EClass getPinGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.PinGroup#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see trafficLightSystem.PinGroup#getPins()
	 * @see #getPinGroup()
	 * @generated
	 */
	EReference getPinGroup_Pins();

	/**
	 * Returns the meta object for enum '{@link trafficLightSystem.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Type</em>'.
	 * @see trafficLightSystem.PinType
	 * @generated
	 */
	EEnum getPinType();

	/**
	 * Returns the meta object for enum '{@link trafficLightSystem.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see trafficLightSystem.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link trafficLightSystem.LightColor <em>Light Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Light Color</em>'.
	 * @see trafficLightSystem.LightColor
	 * @generated
	 */
	EEnum getLightColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrafficLightSystemFactory getTrafficLightSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightSystemImpl <em>Traffic Light System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightSystemImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightSystem()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT_SYSTEM = eINSTANCE.getTrafficLightSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT_SYSTEM__NAME = eINSTANCE.getTrafficLightSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Systemstructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE = eINSTANCE.getTrafficLightSystem_Systemstructure();

		/**
		 * The meta object literal for the '<em><b>Traffic Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS = eINSTANCE.getTrafficLightSystem_TrafficControllers();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.SystemStructureImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getSystemStructure()
		 * @generated
		 */
		EClass SYSTEM_STRUCTURE = eINSTANCE.getSystemStructure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_STRUCTURE__NAME = eINSTANCE.getSystemStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__BOARD = eINSTANCE.getSystemStructure_Board();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__COMPONENTS = eINSTANCE.getSystemStructure_Components();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__CONNECTIONS = eINSTANCE.getSystemStructure_Connections();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.BoardImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PIN_GROUPS = eINSTANCE.getBoard_PinGroups();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.ComponentImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PIN_GROUPS = eINSTANCE.getComponent_PinGroups();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.PinImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Pin Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__PIN_NR = eINSTANCE.getPin_PinNr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__TYPE = eINSTANCE.getPin_Type();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.ConnectionImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SRC = eINSTANCE.getConnection_Src();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficControllerImpl <em>Traffic Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficControllerImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficController()
		 * @generated
		 */
		EClass TRAFFIC_CONTROLLER = eINSTANCE.getTrafficController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_CONTROLLER__NAME = eINSTANCE.getTrafficController_Name();

		/**
		 * The meta object literal for the '<em><b>Traffic Lights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS = eINSTANCE.getTrafficController_TrafficLights();

		/**
		 * The meta object literal for the '<em><b>Cycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_CONTROLLER__CYCLE = eINSTANCE.getTrafficController_Cycle();

		/**
		 * The meta object literal for the '<em><b>Pedestrian Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS = eINSTANCE.getTrafficController_PedestrianControllers();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightModuleImpl <em>Traffic Light Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightModuleImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightModule()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT_MODULE = eINSTANCE.getTrafficLightModule();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.LEDImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__COLOR = eINSTANCE.getLED_Color();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.ButtonImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightImpl <em>Traffic Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLight()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT = eINSTANCE.getTrafficLight();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT__DIRECTION = eINSTANCE.getTrafficLight_Direction();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT__MODULE = eINSTANCE.getTrafficLight_Module();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficCycleImpl <em>Traffic Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficCycleImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficCycle()
		 * @generated
		 */
		EClass TRAFFIC_CYCLE = eINSTANCE.getTrafficCycle();

		/**
		 * The meta object literal for the '<em><b>Trafficstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_CYCLE__TRAFFICSTATE = eINSTANCE.getTrafficCycle_Trafficstate();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.PedestrianControllerImpl <em>Pedestrian Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.PedestrianControllerImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPedestrianController()
		 * @generated
		 */
		EClass PEDESTRIAN_CONTROLLER = eINSTANCE.getPedestrianController();

		/**
		 * The meta object literal for the '<em><b>Request State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_CONTROLLER__REQUEST_STATE = eINSTANCE.getPedestrianController_RequestState();

		/**
		 * The meta object literal for the '<em><b>Red LED</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_CONTROLLER__RED_LED = eINSTANCE.getPedestrianController_RedLED();

		/**
		 * The meta object literal for the '<em><b>Green LED</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_CONTROLLER__GREEN_LED = eINSTANCE.getPedestrianController_GreenLED();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_CONTROLLER__BUTTON = eINSTANCE.getPedestrianController_Button();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficStateImpl <em>Traffic State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficStateImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficState()
		 * @generated
		 */
		EClass TRAFFIC_STATE = eINSTANCE.getTrafficState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_STATE__NAME = eINSTANCE.getTrafficState_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_STATE__DURATION = eINSTANCE.getTrafficState_Duration();

		/**
		 * The meta object literal for the '<em><b>Active Traffic Lights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS = eINSTANCE.getTrafficState_ActiveTrafficLights();

		/**
		 * The meta object literal for the '<em><b>Active Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_STATE__ACTIVE_COLOR = eINSTANCE.getTrafficState_ActiveColor();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_STATE__NEXT = eINSTANCE.getTrafficState_Next();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.PinGroupImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinGroup()
		 * @generated
		 */
		EClass PIN_GROUP = eINSTANCE.getPinGroup();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_GROUP__PINS = eINSTANCE.getPinGroup_Pins();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.PinType <em>Pin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.PinType
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinType()
		 * @generated
		 */
		EEnum PIN_TYPE = eINSTANCE.getPinType();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.Direction
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.LightColor <em>Light Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.LightColor
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getLightColor()
		 * @generated
		 */
		EEnum LIGHT_COLOR = eINSTANCE.getLightColor();

	}

} //TrafficLightSystemPackage

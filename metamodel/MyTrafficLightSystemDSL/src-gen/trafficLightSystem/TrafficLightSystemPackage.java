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
	 * The feature id for the '<em><b>System Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_SYSTEM__SYSTEM_BEHAVIORS = 2;

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
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

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
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightModuleImpl <em>Traffic Light Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightModuleImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightModule()
	 * @generated
	 */
	int TRAFFIC_LIGHT_MODULE = 6;

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
	int TRAFFIC_LIGHT_MODULE__PIN_GROUPS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traffic Light Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

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
	int LED = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COLOR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN_GROUPS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

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
	int BUTTON = 8;

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
	int BUTTON__PIN_GROUPS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PinGroupImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinGroup()
	 * @generated
	 */
	int PIN_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__PINS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.SystemBehaviorImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getSystemBehavior()
	 * @generated
	 */
	int SYSTEM_BEHAVIOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__BEHAVIORS = 1;

	/**
	 * The number of structural features of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.BehaviorImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.OpaqueBehaviorImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Command Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__COMMAND_LINE = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_MAIN = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.StateImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getState()
	 * @generated
	 */
	int STATE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightStateImpl <em>Traffic Light State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightStateImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightState()
	 * @generated
	 */
	int TRAFFIC_LIGHT_STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Is Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__IS_INITIAL_STATE = STATE__IS_INITIAL_STATE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__BEHAVIOR = STATE__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__DURATION = STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__ACTIVE_COLOR = STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Traffic Light Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE = STATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE__BOARD = STATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Traffic Light State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Traffic Light State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.StateMachineImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITIONS = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TransitionImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.PinType
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 17;

	/**
	 * The meta object id for the '{@link trafficLightSystem.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.Direction
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 18;

	/**
	 * The meta object id for the '{@link trafficLightSystem.LightColor <em>Light Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.LightColor
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getLightColor()
	 * @generated
	 */
	int LIGHT_COLOR = 19;

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
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficLightSystem#getSystemBehaviors <em>System Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Behaviors</em>'.
	 * @see trafficLightSystem.TrafficLightSystem#getSystemBehaviors()
	 * @see #getTrafficLightSystem()
	 * @generated
	 */
	EReference getTrafficLightSystem_SystemBehaviors();

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
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light Module</em>'.
	 * @see trafficLightSystem.TrafficLightModule
	 * @generated
	 */
	EClass getTrafficLightModule();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.TrafficLightModule#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see trafficLightSystem.TrafficLightModule#getPinGroups()
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	EReference getTrafficLightModule_PinGroups();

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
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.LED#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see trafficLightSystem.LED#getPinGroups()
	 * @see #getLED()
	 * @generated
	 */
	EReference getLED_PinGroups();

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
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.Button#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see trafficLightSystem.Button#getPinGroups()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_PinGroups();

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
	 * Returns the meta object for the attribute '{@link trafficLightSystem.PinGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.PinGroup#getName()
	 * @see #getPinGroup()
	 * @generated
	 */
	EAttribute getPinGroup_Name();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.SystemBehavior <em>System Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Behavior</em>'.
	 * @see trafficLightSystem.SystemBehavior
	 * @generated
	 */
	EClass getSystemBehavior();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.SystemBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.SystemBehavior#getName()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EAttribute getSystemBehavior_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.SystemBehavior#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see trafficLightSystem.SystemBehavior#getBehaviors()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EReference getSystemBehavior_Behaviors();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see trafficLightSystem.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Behavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.Behavior#getName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Name();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see trafficLightSystem.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.OpaqueBehavior#getCommandLine <em>Command Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Line</em>'.
	 * @see trafficLightSystem.OpaqueBehavior#getCommandLine()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_CommandLine();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.OpaqueBehavior#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see trafficLightSystem.OpaqueBehavior#isIsMain()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_IsMain();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLightState <em>Traffic Light State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light State</em>'.
	 * @see trafficLightSystem.TrafficLightState
	 * @generated
	 */
	EClass getTrafficLightState();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLightState#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see trafficLightSystem.TrafficLightState#getDuration()
	 * @see #getTrafficLightState()
	 * @generated
	 */
	EAttribute getTrafficLightState_Duration();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLightState#getActiveColor <em>Active Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Color</em>'.
	 * @see trafficLightSystem.TrafficLightState#getActiveColor()
	 * @see #getTrafficLightState()
	 * @generated
	 */
	EAttribute getTrafficLightState_ActiveColor();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightState#getTrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traffic Light Module</em>'.
	 * @see trafficLightSystem.TrafficLightState#getTrafficLightModule()
	 * @see #getTrafficLightState()
	 * @generated
	 */
	EReference getTrafficLightState_TrafficLightModule();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightState#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see trafficLightSystem.TrafficLightState#getBoard()
	 * @see #getTrafficLightState()
	 * @generated
	 */
	EReference getTrafficLightState_Board();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see trafficLightSystem.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see trafficLightSystem.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see trafficLightSystem.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see trafficLightSystem.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see trafficLightSystem.Transition#getSrc()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Src();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see trafficLightSystem.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see trafficLightSystem.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.State#isIsInitialState <em>Is Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial State</em>'.
	 * @see trafficLightSystem.State#isIsInitialState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitialState();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.State#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see trafficLightSystem.State#getBehavior()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Behavior();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see trafficLightSystem.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

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
		 * The meta object literal for the '<em><b>System Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_SYSTEM__SYSTEM_BEHAVIORS = eINSTANCE.getTrafficLightSystem_SystemBehaviors();

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
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightModuleImpl <em>Traffic Light Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightModuleImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightModule()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT_MODULE = eINSTANCE.getTrafficLightModule();

		/**
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_MODULE__PIN_GROUPS = eINSTANCE.getTrafficLightModule_PinGroups();

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
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LED__PIN_GROUPS = eINSTANCE.getLED_PinGroups();

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
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__PIN_GROUPS = eINSTANCE.getButton_PinGroups();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_GROUP__NAME = eINSTANCE.getPinGroup_Name();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.SystemBehaviorImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getSystemBehavior()
		 * @generated
		 */
		EClass SYSTEM_BEHAVIOR = eINSTANCE.getSystemBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_BEHAVIOR__NAME = eINSTANCE.getSystemBehavior_Name();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BEHAVIOR__BEHAVIORS = eINSTANCE.getSystemBehavior_Behaviors();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.BehaviorImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.OpaqueBehaviorImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '<em><b>Command Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__COMMAND_LINE = eINSTANCE.getOpaqueBehavior_CommandLine();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__IS_MAIN = eINSTANCE.getOpaqueBehavior_IsMain();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightStateImpl <em>Traffic Light State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightStateImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightState()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT_STATE = eINSTANCE.getTrafficLightState();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT_STATE__DURATION = eINSTANCE.getTrafficLightState_Duration();

		/**
		 * The meta object literal for the '<em><b>Active Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT_STATE__ACTIVE_COLOR = eINSTANCE.getTrafficLightState_ActiveColor();

		/**
		 * The meta object literal for the '<em><b>Traffic Light Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE = eINSTANCE.getTrafficLightState_TrafficLightModule();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_STATE__BOARD = eINSTANCE.getTrafficLightState_Board();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.StateMachineImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TransitionImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SRC = eINSTANCE.getTransition_Src();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.StateImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL_STATE = eINSTANCE.getState_IsInitialState();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BEHAVIOR = eINSTANCE.getState_Behavior();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

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

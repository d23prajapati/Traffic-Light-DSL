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
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__DIRECTION = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Red Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__RED_PIN = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Yellow Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__YELLOW_PIN = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Green Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE__GREEN_PIN = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Traffic Light Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_MODULE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Junction Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__JUNCTION_CONTROLLER = 1;

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
	 * The meta object id for the '{@link trafficLightSystem.impl.JunctionControllerImpl <em>Junction Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.JunctionControllerImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getJunctionController()
	 * @generated
	 */
	int JUNCTION_CONTROLLER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_CONTROLLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Traffic Light Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES = 1;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_CONTROLLER__PHASES = 2;

	/**
	 * The number of structural features of the '<em>Junction Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Junction Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PhaseImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Traffic Light Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__TRAFFIC_LIGHT_ASSIGNMENTS = 2;

	/**
	 * The feature id for the '<em><b>Pedestrian Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PEDESTRIAN_ASSIGNMENTS = 3;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.TrafficLightAssignmentImpl <em>Traffic Light Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.TrafficLightAssignmentImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightAssignment()
	 * @generated
	 */
	int TRAFFIC_LIGHT_ASSIGNMENT = 13;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_ASSIGNMENT__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Traffic Light Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE = 1;

	/**
	 * The number of structural features of the '<em>Traffic Light Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Traffic Light Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_LIGHT_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trafficLightSystem.impl.PedestrianAssignmentImpl <em>Pedestrian Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trafficLightSystem.impl.PedestrianAssignmentImpl
	 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPedestrianAssignment()
	 * @generated
	 */
	int PEDESTRIAN_ASSIGNMENT = 14;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_ASSIGNMENT__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_ASSIGNMENT__LED = 1;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_ASSIGNMENT__BUTTON = 2;

	/**
	 * The number of structural features of the '<em>Pedestrian Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pedestrian Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_ASSIGNMENT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLightModule#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see trafficLightSystem.TrafficLightModule#getDirection()
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	EAttribute getTrafficLightModule_Direction();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightModule#getRedPin <em>Red Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Red Pin</em>'.
	 * @see trafficLightSystem.TrafficLightModule#getRedPin()
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	EReference getTrafficLightModule_RedPin();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightModule#getYellowPin <em>Yellow Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Yellow Pin</em>'.
	 * @see trafficLightSystem.TrafficLightModule#getYellowPin()
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	EReference getTrafficLightModule_YellowPin();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightModule#getGreenPin <em>Green Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Green Pin</em>'.
	 * @see trafficLightSystem.TrafficLightModule#getGreenPin()
	 * @see #getTrafficLightModule()
	 * @generated
	 */
	EReference getTrafficLightModule_GreenPin();

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
	 * Returns the meta object for the containment reference '{@link trafficLightSystem.SystemBehavior#getJunctionController <em>Junction Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Junction Controller</em>'.
	 * @see trafficLightSystem.SystemBehavior#getJunctionController()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EReference getSystemBehavior_JunctionController();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.JunctionController <em>Junction Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Controller</em>'.
	 * @see trafficLightSystem.JunctionController
	 * @generated
	 */
	EClass getJunctionController();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.JunctionController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.JunctionController#getName()
	 * @see #getJunctionController()
	 * @generated
	 */
	EAttribute getJunctionController_Name();

	/**
	 * Returns the meta object for the reference list '{@link trafficLightSystem.JunctionController#getTrafficLightModules <em>Traffic Light Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traffic Light Modules</em>'.
	 * @see trafficLightSystem.JunctionController#getTrafficLightModules()
	 * @see #getJunctionController()
	 * @generated
	 */
	EReference getJunctionController_TrafficLightModules();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.JunctionController#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see trafficLightSystem.JunctionController#getPhases()
	 * @see #getJunctionController()
	 * @generated
	 */
	EReference getJunctionController_Phases();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see trafficLightSystem.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trafficLightSystem.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.Phase#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see trafficLightSystem.Phase#getDuration()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.Phase#getTrafficLightAssignments <em>Traffic Light Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traffic Light Assignments</em>'.
	 * @see trafficLightSystem.Phase#getTrafficLightAssignments()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_TrafficLightAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link trafficLightSystem.Phase#getPedestrianAssignments <em>Pedestrian Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pedestrian Assignments</em>'.
	 * @see trafficLightSystem.Phase#getPedestrianAssignments()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_PedestrianAssignments();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.TrafficLightAssignment <em>Traffic Light Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Light Assignment</em>'.
	 * @see trafficLightSystem.TrafficLightAssignment
	 * @generated
	 */
	EClass getTrafficLightAssignment();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.TrafficLightAssignment#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see trafficLightSystem.TrafficLightAssignment#getColor()
	 * @see #getTrafficLightAssignment()
	 * @generated
	 */
	EAttribute getTrafficLightAssignment_Color();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.TrafficLightAssignment#getTrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Traffic Light Module</em>'.
	 * @see trafficLightSystem.TrafficLightAssignment#getTrafficLightModule()
	 * @see #getTrafficLightAssignment()
	 * @generated
	 */
	EReference getTrafficLightAssignment_TrafficLightModule();

	/**
	 * Returns the meta object for class '{@link trafficLightSystem.PedestrianAssignment <em>Pedestrian Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian Assignment</em>'.
	 * @see trafficLightSystem.PedestrianAssignment
	 * @generated
	 */
	EClass getPedestrianAssignment();

	/**
	 * Returns the meta object for the attribute '{@link trafficLightSystem.PedestrianAssignment#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see trafficLightSystem.PedestrianAssignment#getColor()
	 * @see #getPedestrianAssignment()
	 * @generated
	 */
	EAttribute getPedestrianAssignment_Color();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.PedestrianAssignment#getLed <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Led</em>'.
	 * @see trafficLightSystem.PedestrianAssignment#getLed()
	 * @see #getPedestrianAssignment()
	 * @generated
	 */
	EReference getPedestrianAssignment_Led();

	/**
	 * Returns the meta object for the reference '{@link trafficLightSystem.PedestrianAssignment#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Button</em>'.
	 * @see trafficLightSystem.PedestrianAssignment#getButton()
	 * @see #getPedestrianAssignment()
	 * @generated
	 */
	EReference getPedestrianAssignment_Button();

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
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT_MODULE__DIRECTION = eINSTANCE.getTrafficLightModule_Direction();

		/**
		 * The meta object literal for the '<em><b>Red Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_MODULE__RED_PIN = eINSTANCE.getTrafficLightModule_RedPin();

		/**
		 * The meta object literal for the '<em><b>Yellow Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_MODULE__YELLOW_PIN = eINSTANCE.getTrafficLightModule_YellowPin();

		/**
		 * The meta object literal for the '<em><b>Green Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_MODULE__GREEN_PIN = eINSTANCE.getTrafficLightModule_GreenPin();

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
		 * The meta object literal for the '<em><b>Junction Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BEHAVIOR__JUNCTION_CONTROLLER = eINSTANCE.getSystemBehavior_JunctionController();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.JunctionControllerImpl <em>Junction Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.JunctionControllerImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getJunctionController()
		 * @generated
		 */
		EClass JUNCTION_CONTROLLER = eINSTANCE.getJunctionController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTION_CONTROLLER__NAME = eINSTANCE.getJunctionController_Name();

		/**
		 * The meta object literal for the '<em><b>Traffic Light Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES = eINSTANCE.getJunctionController_TrafficLightModules();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTION_CONTROLLER__PHASES = eINSTANCE.getJunctionController_Phases();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.PhaseImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__DURATION = eINSTANCE.getPhase_Duration();

		/**
		 * The meta object literal for the '<em><b>Traffic Light Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__TRAFFIC_LIGHT_ASSIGNMENTS = eINSTANCE.getPhase_TrafficLightAssignments();

		/**
		 * The meta object literal for the '<em><b>Pedestrian Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__PEDESTRIAN_ASSIGNMENTS = eINSTANCE.getPhase_PedestrianAssignments();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.TrafficLightAssignmentImpl <em>Traffic Light Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.TrafficLightAssignmentImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getTrafficLightAssignment()
		 * @generated
		 */
		EClass TRAFFIC_LIGHT_ASSIGNMENT = eINSTANCE.getTrafficLightAssignment();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_LIGHT_ASSIGNMENT__COLOR = eINSTANCE.getTrafficLightAssignment_Color();

		/**
		 * The meta object literal for the '<em><b>Traffic Light Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE = eINSTANCE
				.getTrafficLightAssignment_TrafficLightModule();

		/**
		 * The meta object literal for the '{@link trafficLightSystem.impl.PedestrianAssignmentImpl <em>Pedestrian Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trafficLightSystem.impl.PedestrianAssignmentImpl
		 * @see trafficLightSystem.impl.TrafficLightSystemPackageImpl#getPedestrianAssignment()
		 * @generated
		 */
		EClass PEDESTRIAN_ASSIGNMENT = eINSTANCE.getPedestrianAssignment();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDESTRIAN_ASSIGNMENT__COLOR = eINSTANCE.getPedestrianAssignment_Color();

		/**
		 * The meta object literal for the '<em><b>Led</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_ASSIGNMENT__LED = eINSTANCE.getPedestrianAssignment_Led();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDESTRIAN_ASSIGNMENT__BUTTON = eINSTANCE.getPedestrianAssignment_Button();

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

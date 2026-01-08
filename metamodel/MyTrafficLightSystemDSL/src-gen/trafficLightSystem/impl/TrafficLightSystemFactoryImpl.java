/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trafficLightSystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficLightSystemFactoryImpl extends EFactoryImpl implements TrafficLightSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrafficLightSystemFactory init() {
		try {
			TrafficLightSystemFactory theTrafficLightSystemFactory = (TrafficLightSystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(TrafficLightSystemPackage.eNS_URI);
			if (theTrafficLightSystemFactory != null) {
				return theTrafficLightSystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrafficLightSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM:
			return createTrafficLightSystem();
		case TrafficLightSystemPackage.SYSTEM_STRUCTURE:
			return createSystemStructure();
		case TrafficLightSystemPackage.BOARD:
			return createBoard();
		case TrafficLightSystemPackage.PIN:
			return createPin();
		case TrafficLightSystemPackage.CONNECTION:
			return createConnection();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE:
			return createTrafficLightModule();
		case TrafficLightSystemPackage.LED:
			return createLED();
		case TrafficLightSystemPackage.BUTTON:
			return createButton();
		case TrafficLightSystemPackage.PIN_GROUP:
			return createPinGroup();
		case TrafficLightSystemPackage.SYSTEM_BEHAVIOR:
			return createSystemBehavior();
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR:
			return createOpaqueBehavior();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE:
			return createTrafficLightState();
		case TrafficLightSystemPackage.STATE_MACHINE:
			return createStateMachine();
		case TrafficLightSystemPackage.TRANSITION:
			return createTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TrafficLightSystemPackage.PIN_TYPE:
			return createPinTypeFromString(eDataType, initialValue);
		case TrafficLightSystemPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		case TrafficLightSystemPackage.LIGHT_COLOR:
			return createLightColorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TrafficLightSystemPackage.PIN_TYPE:
			return convertPinTypeToString(eDataType, instanceValue);
		case TrafficLightSystemPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		case TrafficLightSystemPackage.LIGHT_COLOR:
			return convertLightColorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSystem createTrafficLightSystem() {
		TrafficLightSystemImpl trafficLightSystem = new TrafficLightSystemImpl();
		return trafficLightSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStructure createSystemStructure() {
		SystemStructureImpl systemStructure = new SystemStructureImpl();
		return systemStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightModule createTrafficLightModule() {
		TrafficLightModuleImpl trafficLightModule = new TrafficLightModuleImpl();
		return trafficLightModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PinGroup createPinGroup() {
		PinGroupImpl pinGroup = new PinGroupImpl();
		return pinGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBehavior createSystemBehavior() {
		SystemBehaviorImpl systemBehavior = new SystemBehaviorImpl();
		return systemBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpaqueBehavior createOpaqueBehavior() {
		OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
		return opaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightState createTrafficLightState() {
		TrafficLightStateImpl trafficLightState = new TrafficLightStateImpl();
		return trafficLightState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinType createPinTypeFromString(EDataType eDataType, String initialValue) {
		PinType result = PinType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightColor createLightColorFromString(EDataType eDataType, String initialValue) {
		LightColor result = LightColor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSystemPackage getTrafficLightSystemPackage() {
		return (TrafficLightSystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrafficLightSystemPackage getPackage() {
		return TrafficLightSystemPackage.eINSTANCE;
	}

} //TrafficLightSystemFactoryImpl

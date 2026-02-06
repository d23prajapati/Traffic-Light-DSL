/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import trafficLightSystem.Board;
import trafficLightSystem.Button;
import trafficLightSystem.Component;
import trafficLightSystem.Connection;
import trafficLightSystem.Direction;
import trafficLightSystem.JunctionController;
import trafficLightSystem.LightColor;
import trafficLightSystem.PedestrianAssignment;
import trafficLightSystem.Phase;
import trafficLightSystem.Pin;
import trafficLightSystem.PinGroup;
import trafficLightSystem.PinType;
import trafficLightSystem.SystemBehavior;
import trafficLightSystem.SystemStructure;
import trafficLightSystem.TrafficLightAssignment;
import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightSystem;
import trafficLightSystem.TrafficLightSystemFactory;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficLightSystemPackageImpl extends EPackageImpl implements TrafficLightSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficLightSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficLightModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficLightAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedestrianAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightColorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see trafficLightSystem.TrafficLightSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrafficLightSystemPackageImpl() {
		super(eNS_URI, TrafficLightSystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TrafficLightSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrafficLightSystemPackage init() {
		if (isInited)
			return (TrafficLightSystemPackage) EPackage.Registry.INSTANCE
					.getEPackage(TrafficLightSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrafficLightSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrafficLightSystemPackageImpl theTrafficLightSystemPackage = registeredTrafficLightSystemPackage instanceof TrafficLightSystemPackageImpl
				? (TrafficLightSystemPackageImpl) registeredTrafficLightSystemPackage
				: new TrafficLightSystemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTrafficLightSystemPackage.createPackageContents();

		// Initialize created meta-data
		theTrafficLightSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrafficLightSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrafficLightSystemPackage.eNS_URI, theTrafficLightSystemPackage);
		return theTrafficLightSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafficLightSystem() {
		return trafficLightSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafficLightSystem_Name() {
		return (EAttribute) trafficLightSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightSystem_Systemstructure() {
		return (EReference) trafficLightSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightSystem_SystemBehaviors() {
		return (EReference) trafficLightSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemStructure() {
		return systemStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemStructure_Name() {
		return (EAttribute) systemStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Board() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Components() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Connections() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoard_Name() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoard_PinGroups() {
		return (EReference) boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Direction() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_PinNr() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Name() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Type() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Src() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Target() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafficLightModule() {
		return trafficLightModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightModule_RedPin() {
		return (EReference) trafficLightModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightModule_YellowPin() {
		return (EReference) trafficLightModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightModule_GreenPin() {
		return (EReference) trafficLightModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLED_Color() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLED_PinGroups() {
		return (EReference) ledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButton_PinGroups() {
		return (EReference) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPinGroup() {
		return pinGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPinGroup_Pins() {
		return (EReference) pinGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPinGroup_Name() {
		return (EAttribute) pinGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemBehavior() {
		return systemBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemBehavior_Name() {
		return (EAttribute) systemBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBehavior_JunctionController() {
		return (EReference) systemBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJunctionController() {
		return junctionControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJunctionController_Name() {
		return (EAttribute) junctionControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJunctionController_TrafficLightModules() {
		return (EReference) junctionControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJunctionController_Phases() {
		return (EReference) junctionControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhase() {
		return phaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhase_Name() {
		return (EAttribute) phaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhase_Duration() {
		return (EAttribute) phaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhase_TrafficLightAssignments() {
		return (EReference) phaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhase_PedestrianAssignments() {
		return (EReference) phaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafficLightAssignment() {
		return trafficLightAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafficLightAssignment_Color() {
		return (EAttribute) trafficLightAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrafficLightAssignment_TrafficLightModule() {
		return (EReference) trafficLightAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPedestrianAssignment() {
		return pedestrianAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPedestrianAssignment_Color() {
		return (EAttribute) pedestrianAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedestrianAssignment_Led() {
		return (EReference) pedestrianAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedestrianAssignment_Button() {
		return (EReference) pedestrianAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPinType() {
		return pinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLightColor() {
		return lightColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightSystemFactory getTrafficLightSystemFactory() {
		return (TrafficLightSystemFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		trafficLightSystemEClass = createEClass(TRAFFIC_LIGHT_SYSTEM);
		createEAttribute(trafficLightSystemEClass, TRAFFIC_LIGHT_SYSTEM__NAME);
		createEReference(trafficLightSystemEClass, TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE);
		createEReference(trafficLightSystemEClass, TRAFFIC_LIGHT_SYSTEM__SYSTEM_BEHAVIORS);

		systemStructureEClass = createEClass(SYSTEM_STRUCTURE);
		createEAttribute(systemStructureEClass, SYSTEM_STRUCTURE__NAME);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__BOARD);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__COMPONENTS);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__CONNECTIONS);

		boardEClass = createEClass(BOARD);
		createEAttribute(boardEClass, BOARD__NAME);
		createEReference(boardEClass, BOARD__PIN_GROUPS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__DIRECTION);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__PIN_NR);
		createEAttribute(pinEClass, PIN__NAME);
		createEAttribute(pinEClass, PIN__TYPE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SRC);
		createEReference(connectionEClass, CONNECTION__TARGET);

		trafficLightModuleEClass = createEClass(TRAFFIC_LIGHT_MODULE);
		createEReference(trafficLightModuleEClass, TRAFFIC_LIGHT_MODULE__RED_PIN);
		createEReference(trafficLightModuleEClass, TRAFFIC_LIGHT_MODULE__YELLOW_PIN);
		createEReference(trafficLightModuleEClass, TRAFFIC_LIGHT_MODULE__GREEN_PIN);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__COLOR);
		createEReference(ledEClass, LED__PIN_GROUPS);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__PIN_GROUPS);

		pinGroupEClass = createEClass(PIN_GROUP);
		createEReference(pinGroupEClass, PIN_GROUP__PINS);
		createEAttribute(pinGroupEClass, PIN_GROUP__NAME);

		systemBehaviorEClass = createEClass(SYSTEM_BEHAVIOR);
		createEAttribute(systemBehaviorEClass, SYSTEM_BEHAVIOR__NAME);
		createEReference(systemBehaviorEClass, SYSTEM_BEHAVIOR__JUNCTION_CONTROLLER);

		junctionControllerEClass = createEClass(JUNCTION_CONTROLLER);
		createEAttribute(junctionControllerEClass, JUNCTION_CONTROLLER__NAME);
		createEReference(junctionControllerEClass, JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES);
		createEReference(junctionControllerEClass, JUNCTION_CONTROLLER__PHASES);

		phaseEClass = createEClass(PHASE);
		createEAttribute(phaseEClass, PHASE__NAME);
		createEAttribute(phaseEClass, PHASE__DURATION);
		createEReference(phaseEClass, PHASE__TRAFFIC_LIGHT_ASSIGNMENTS);
		createEReference(phaseEClass, PHASE__PEDESTRIAN_ASSIGNMENTS);

		trafficLightAssignmentEClass = createEClass(TRAFFIC_LIGHT_ASSIGNMENT);
		createEAttribute(trafficLightAssignmentEClass, TRAFFIC_LIGHT_ASSIGNMENT__COLOR);
		createEReference(trafficLightAssignmentEClass, TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE);

		pedestrianAssignmentEClass = createEClass(PEDESTRIAN_ASSIGNMENT);
		createEAttribute(pedestrianAssignmentEClass, PEDESTRIAN_ASSIGNMENT__COLOR);
		createEReference(pedestrianAssignmentEClass, PEDESTRIAN_ASSIGNMENT__LED);
		createEReference(pedestrianAssignmentEClass, PEDESTRIAN_ASSIGNMENT__BUTTON);

		// Create enums
		pinTypeEEnum = createEEnum(PIN_TYPE);
		directionEEnum = createEEnum(DIRECTION);
		lightColorEEnum = createEEnum(LIGHT_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		trafficLightModuleEClass.getESuperTypes().add(this.getComponent());
		ledEClass.getESuperTypes().add(this.getComponent());
		buttonEClass.getESuperTypes().add(this.getComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(trafficLightSystemEClass, TrafficLightSystem.class, "TrafficLightSystem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafficLightSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				TrafficLightSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficLightSystem_Systemstructure(), this.getSystemStructure(), null, "systemstructure",
				null, 0, 1, TrafficLightSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficLightSystem_SystemBehaviors(), this.getSystemBehavior(), null, "systemBehaviors", null,
				0, -1, TrafficLightSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemStructureEClass, SystemStructure.class, "SystemStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemStructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemStructure_Board(), this.getBoard(), null, "board", null, 0, 1, SystemStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemStructure_Components(), this.getComponent(), null, "components", null, 0, -1,
				SystemStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemStructure_Connections(), this.getConnection(), null, "connections", null, 0, -1,
				SystemStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoard_Name(), ecorePackage.getEString(), "name", null, 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_PinGroups(), this.getPinGroup(), null, "pinGroups", null, 0, -1, Board.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Direction(), this.getDirection(), "direction", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_PinNr(), ecorePackage.getEInt(), "pinNr", null, 0, 1, Pin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Type(), this.getPinType(), "type", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Src(), this.getPin(), null, "src", null, 0, 1, Connection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConnection_Target(), this.getPin(), null, "target", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafficLightModuleEClass, TrafficLightModule.class, "TrafficLightModule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrafficLightModule_RedPin(), this.getPin(), null, "redPin", null, 0, 1,
				TrafficLightModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficLightModule_YellowPin(), this.getPin(), null, "yellowPin", null, 0, 1,
				TrafficLightModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficLightModule_GreenPin(), this.getPin(), null, "greenPin", null, 0, 1,
				TrafficLightModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, trafficLightSystem.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Color(), this.getLightColor(), "color", null, 0, 1, trafficLightSystem.LED.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLED_PinGroups(), this.getPinGroup(), null, "pinGroups", null, 0, -1,
				trafficLightSystem.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_PinGroups(), this.getPinGroup(), null, "pinGroups", null, 0, -1, Button.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinGroupEClass, PinGroup.class, "PinGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPinGroup_Pins(), this.getPin(), null, "pins", null, 0, -1, PinGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPinGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, PinGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemBehaviorEClass, SystemBehavior.class, "SystemBehavior", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemBehavior_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemBehavior.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBehavior_JunctionController(), this.getJunctionController(), null, "junctionController",
				null, 0, 1, SystemBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(junctionControllerEClass, JunctionController.class, "JunctionController", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJunctionController_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				JunctionController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getJunctionController_TrafficLightModules(), this.getTrafficLightModule(), null,
				"trafficLightModules", null, 0, 4, JunctionController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJunctionController_Phases(), this.getPhase(), null, "phases", null, 0, -1,
				JunctionController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Phase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhase_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Phase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_TrafficLightAssignments(), this.getTrafficLightAssignment(), null,
				"trafficLightAssignments", null, 0, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhase_PedestrianAssignments(), this.getPedestrianAssignment(), null, "pedestrianAssignments",
				null, 0, -1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafficLightAssignmentEClass, TrafficLightAssignment.class, "TrafficLightAssignment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafficLightAssignment_Color(), this.getLightColor(), "color", null, 0, 1,
				TrafficLightAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficLightAssignment_TrafficLightModule(), this.getTrafficLightModule(), null,
				"trafficLightModule", null, 0, 1, TrafficLightAssignment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pedestrianAssignmentEClass, PedestrianAssignment.class, "PedestrianAssignment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedestrianAssignment_Color(), this.getLightColor(), "color", null, 0, 1,
				PedestrianAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedestrianAssignment_Led(), this.getLED(), null, "led", null, 0, 1,
				PedestrianAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPedestrianAssignment_Button(), this.getButton(), null, "button", null, 0, 1,
				PedestrianAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pinTypeEEnum, PinType.class, "PinType");
		addEEnumLiteral(pinTypeEEnum, PinType.DIGITAL_IN);
		addEEnumLiteral(pinTypeEEnum, PinType.DIGITAL_OUT);
		addEEnumLiteral(pinTypeEEnum, PinType.ANALOG_IN);
		addEEnumLiteral(pinTypeEEnum, PinType.ANALOG_OUT);
		addEEnumLiteral(pinTypeEEnum, PinType.INTERRUPT);
		addEEnumLiteral(pinTypeEEnum, PinType.GND);
		addEEnumLiteral(pinTypeEEnum, PinType.VCC);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.NORTH_SOUTH);
		addEEnumLiteral(directionEEnum, Direction.EAST_WEST);

		initEEnum(lightColorEEnum, LightColor.class, "LightColor");
		addEEnumLiteral(lightColorEEnum, LightColor.RED);
		addEEnumLiteral(lightColorEEnum, LightColor.YELLOW);
		addEEnumLiteral(lightColorEEnum, LightColor.GREEN);
		addEEnumLiteral(lightColorEEnum, LightColor.RED_YELLOW);

		// Create resource
		createResource(eNS_URI);
	}

} //TrafficLightSystemPackageImpl

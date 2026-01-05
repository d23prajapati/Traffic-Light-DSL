/**
 */
package trafficLightSystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trafficLightSystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trafficLightSystem.TrafficLightSystemPackage
 * @generated
 */
public class TrafficLightSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TrafficLightSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TrafficLightSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightSystemSwitch<Adapter> modelSwitch = new TrafficLightSystemSwitch<Adapter>() {
		@Override
		public Adapter caseTrafficLightSystem(TrafficLightSystem object) {
			return createTrafficLightSystemAdapter();
		}

		@Override
		public Adapter caseSystemStructure(SystemStructure object) {
			return createSystemStructureAdapter();
		}

		@Override
		public Adapter caseBoard(Board object) {
			return createBoardAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter casePin(Pin object) {
			return createPinAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseTrafficController(TrafficController object) {
			return createTrafficControllerAdapter();
		}

		@Override
		public Adapter caseTrafficLightModule(TrafficLightModule object) {
			return createTrafficLightModuleAdapter();
		}

		@Override
		public Adapter caseLED(LED object) {
			return createLEDAdapter();
		}

		@Override
		public Adapter caseButton(Button object) {
			return createButtonAdapter();
		}

		@Override
		public Adapter caseTrafficLight(TrafficLight object) {
			return createTrafficLightAdapter();
		}

		@Override
		public Adapter caseTrafficCycle(TrafficCycle object) {
			return createTrafficCycleAdapter();
		}

		@Override
		public Adapter casePedestrianController(PedestrianController object) {
			return createPedestrianControllerAdapter();
		}

		@Override
		public Adapter caseTrafficState(TrafficState object) {
			return createTrafficStateAdapter();
		}

		@Override
		public Adapter casePinGroup(PinGroup object) {
			return createPinGroupAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficLightSystem <em>Traffic Light System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficLightSystem
	 * @generated
	 */
	public Adapter createTrafficLightSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.SystemStructure <em>System Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.SystemStructure
	 * @generated
	 */
	public Adapter createSystemStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficController <em>Traffic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficController
	 * @generated
	 */
	public Adapter createTrafficControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficLightModule <em>Traffic Light Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficLightModule
	 * @generated
	 */
	public Adapter createTrafficLightModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.LED
	 * @generated
	 */
	public Adapter createLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficLight <em>Traffic Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficLight
	 * @generated
	 */
	public Adapter createTrafficLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficCycle <em>Traffic Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficCycle
	 * @generated
	 */
	public Adapter createTrafficCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.PedestrianController <em>Pedestrian Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.PedestrianController
	 * @generated
	 */
	public Adapter createPedestrianControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.TrafficState <em>Traffic State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.TrafficState
	 * @generated
	 */
	public Adapter createTrafficStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trafficLightSystem.PinGroup <em>Pin Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trafficLightSystem.PinGroup
	 * @generated
	 */
	public Adapter createPinGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TrafficLightSystemAdapterFactory

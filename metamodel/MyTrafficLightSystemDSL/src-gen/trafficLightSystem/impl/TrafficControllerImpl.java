/**
 */
package trafficLightSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trafficLightSystem.PedestrianController;
import trafficLightSystem.TrafficController;
import trafficLightSystem.TrafficCycle;
import trafficLightSystem.TrafficLight;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficControllerImpl#getTrafficLights <em>Traffic Lights</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficControllerImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficControllerImpl#getPedestrianControllers <em>Pedestrian Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficControllerImpl extends MinimalEObjectImpl.Container implements TrafficController {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrafficLights() <em>Traffic Lights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLights()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficLight> trafficLights;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected TrafficCycle cycle;

	/**
	 * The cached value of the '{@link #getPedestrianControllers() <em>Pedestrian Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedestrianControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<PedestrianController> pedestrianControllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_CONTROLLER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficLight> getTrafficLights() {
		if (trafficLights == null) {
			trafficLights = new EObjectContainmentEList<TrafficLight>(TrafficLight.class, this,
					TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS);
		}
		return trafficLights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficCycle getCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycle(TrafficCycle newCycle, NotificationChain msgs) {
		TrafficCycle oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE, oldCycle, newCycle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCycle(TrafficCycle newCycle) {
		if (newCycle != cycle) {
			NotificationChain msgs = null;
			if (cycle != null)
				msgs = ((InternalEObject) cycle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE, null, msgs);
			if (newCycle != null)
				msgs = ((InternalEObject) newCycle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE, null, msgs);
			msgs = basicSetCycle(newCycle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE,
					newCycle, newCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PedestrianController> getPedestrianControllers() {
		if (pedestrianControllers == null) {
			pedestrianControllers = new EObjectContainmentEList<PedestrianController>(PedestrianController.class, this,
					TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS);
		}
		return pedestrianControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS:
			return ((InternalEList<?>) getTrafficLights()).basicRemove(otherEnd, msgs);
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE:
			return basicSetCycle(null, msgs);
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS:
			return ((InternalEList<?>) getPedestrianControllers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__NAME:
			return getName();
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS:
			return getTrafficLights();
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE:
			return getCycle();
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS:
			return getPedestrianControllers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__NAME:
			setName((String) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS:
			getTrafficLights().clear();
			getTrafficLights().addAll((Collection<? extends TrafficLight>) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE:
			setCycle((TrafficCycle) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS:
			getPedestrianControllers().clear();
			getPedestrianControllers().addAll((Collection<? extends PedestrianController>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS:
			getTrafficLights().clear();
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE:
			setCycle((TrafficCycle) null);
			return;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS:
			getPedestrianControllers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__TRAFFIC_LIGHTS:
			return trafficLights != null && !trafficLights.isEmpty();
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__CYCLE:
			return cycle != null;
		case TrafficLightSystemPackage.TRAFFIC_CONTROLLER__PEDESTRIAN_CONTROLLERS:
			return pedestrianControllers != null && !pedestrianControllers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TrafficControllerImpl

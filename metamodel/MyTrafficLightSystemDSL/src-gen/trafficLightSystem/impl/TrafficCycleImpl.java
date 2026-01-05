/**
 */
package trafficLightSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trafficLightSystem.TrafficCycle;
import trafficLightSystem.TrafficLightSystemPackage;
import trafficLightSystem.TrafficState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficCycleImpl#getTrafficstate <em>Trafficstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficCycleImpl extends MinimalEObjectImpl.Container implements TrafficCycle {
	/**
	 * The cached value of the '{@link #getTrafficstate() <em>Trafficstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficstate()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficState> trafficstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficCycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_CYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficState> getTrafficstate() {
		if (trafficstate == null) {
			trafficstate = new EObjectContainmentEList<TrafficState>(TrafficState.class, this,
					TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE);
		}
		return trafficstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE:
			return ((InternalEList<?>) getTrafficstate()).basicRemove(otherEnd, msgs);
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
		case TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE:
			return getTrafficstate();
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
		case TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE:
			getTrafficstate().clear();
			getTrafficstate().addAll((Collection<? extends TrafficState>) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE:
			getTrafficstate().clear();
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
		case TrafficLightSystemPackage.TRAFFIC_CYCLE__TRAFFICSTATE:
			return trafficstate != null && !trafficstate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrafficCycleImpl

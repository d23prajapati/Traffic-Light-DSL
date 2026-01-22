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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trafficLightSystem.JunctionController;
import trafficLightSystem.Phase;
import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Junction Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.JunctionControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.impl.JunctionControllerImpl#getTrafficLightModules <em>Traffic Light Modules</em>}</li>
 *   <li>{@link trafficLightSystem.impl.JunctionControllerImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JunctionControllerImpl extends MinimalEObjectImpl.Container implements JunctionController {
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
	 * The cached value of the '{@link #getTrafficLightModules() <em>Traffic Light Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLightModules()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficLightModule> trafficLightModules;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunctionControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.JUNCTION_CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.JUNCTION_CONTROLLER__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficLightModule> getTrafficLightModules() {
		if (trafficLightModules == null) {
			trafficLightModules = new EObjectResolvingEList<TrafficLightModule>(TrafficLightModule.class, this,
					TrafficLightSystemPackage.JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES);
		}
		return trafficLightModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Phase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentEList<Phase>(Phase.class, this,
					TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES:
			return ((InternalEList<?>) getPhases()).basicRemove(otherEnd, msgs);
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
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__NAME:
			return getName();
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES:
			return getTrafficLightModules();
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES:
			return getPhases();
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
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__NAME:
			setName((String) newValue);
			return;
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES:
			getTrafficLightModules().clear();
			getTrafficLightModules().addAll((Collection<? extends TrafficLightModule>) newValue);
			return;
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES:
			getPhases().clear();
			getPhases().addAll((Collection<? extends Phase>) newValue);
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
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES:
			getTrafficLightModules().clear();
			return;
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES:
			getPhases().clear();
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
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__TRAFFIC_LIGHT_MODULES:
			return trafficLightModules != null && !trafficLightModules.isEmpty();
		case TrafficLightSystemPackage.JUNCTION_CONTROLLER__PHASES:
			return phases != null && !phases.isEmpty();
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

} //JunctionControllerImpl

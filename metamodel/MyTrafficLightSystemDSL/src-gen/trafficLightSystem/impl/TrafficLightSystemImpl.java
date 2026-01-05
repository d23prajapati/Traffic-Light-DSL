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

import trafficLightSystem.SystemStructure;
import trafficLightSystem.TrafficController;
import trafficLightSystem.TrafficLightSystem;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficLightSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightSystemImpl#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightSystemImpl#getTrafficControllers <em>Traffic Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightSystemImpl extends MinimalEObjectImpl.Container implements TrafficLightSystem {
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
	 * The cached value of the '{@link #getSystemstructure() <em>Systemstructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemstructure()
	 * @generated
	 * @ordered
	 */
	protected SystemStructure systemstructure;

	/**
	 * The cached value of the '{@link #getTrafficControllers() <em>Traffic Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficController> trafficControllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStructure getSystemstructure() {
		return systemstructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemstructure(SystemStructure newSystemstructure, NotificationChain msgs) {
		SystemStructure oldSystemstructure = systemstructure;
		systemstructure = newSystemstructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE, oldSystemstructure,
					newSystemstructure);
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
	public void setSystemstructure(SystemStructure newSystemstructure) {
		if (newSystemstructure != systemstructure) {
			NotificationChain msgs = null;
			if (systemstructure != null)
				msgs = ((InternalEObject) systemstructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE, null,
						msgs);
			if (newSystemstructure != null)
				msgs = ((InternalEObject) newSystemstructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE, null,
						msgs);
			msgs = basicSetSystemstructure(newSystemstructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE, newSystemstructure,
					newSystemstructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficController> getTrafficControllers() {
		if (trafficControllers == null) {
			trafficControllers = new EObjectContainmentEList<TrafficController>(TrafficController.class, this,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS);
		}
		return trafficControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE:
			return basicSetSystemstructure(null, msgs);
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS:
			return ((InternalEList<?>) getTrafficControllers()).basicRemove(otherEnd, msgs);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__NAME:
			return getName();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE:
			return getSystemstructure();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS:
			return getTrafficControllers();
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE:
			setSystemstructure((SystemStructure) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS:
			getTrafficControllers().clear();
			getTrafficControllers().addAll((Collection<? extends TrafficController>) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE:
			setSystemstructure((SystemStructure) null);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS:
			getTrafficControllers().clear();
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__SYSTEMSTRUCTURE:
			return systemstructure != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_SYSTEM__TRAFFIC_CONTROLLERS:
			return trafficControllers != null && !trafficControllers.isEmpty();
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

} //TrafficLightSystemImpl

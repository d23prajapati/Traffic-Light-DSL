/**
 */
package trafficLightSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trafficLightSystem.LightColor;
import trafficLightSystem.TrafficLight;
import trafficLightSystem.TrafficLightSystemPackage;
import trafficLightSystem.TrafficState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficStateImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficStateImpl#getActiveTrafficLights <em>Active Traffic Lights</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficStateImpl#getActiveColor <em>Active Color</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficStateImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficStateImpl extends MinimalEObjectImpl.Container implements TrafficState {
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveTrafficLights() <em>Active Traffic Lights</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTrafficLights()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficLight> activeTrafficLights;

	/**
	 * The default value of the '{@link #getActiveColor() <em>Active Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveColor()
	 * @generated
	 * @ordered
	 */
	protected static final LightColor ACTIVE_COLOR_EDEFAULT = LightColor.RED;

	/**
	 * The cached value of the '{@link #getActiveColor() <em>Active Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveColor()
	 * @generated
	 * @ordered
	 */
	protected LightColor activeColor = ACTIVE_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficState> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_STATE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_STATE__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficLight> getActiveTrafficLights() {
		if (activeTrafficLights == null) {
			activeTrafficLights = new EObjectResolvingEList<TrafficLight>(TrafficLight.class, this,
					TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS);
		}
		return activeTrafficLights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightColor getActiveColor() {
		return activeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveColor(LightColor newActiveColor) {
		LightColor oldActiveColor = activeColor;
		activeColor = newActiveColor == null ? ACTIVE_COLOR_EDEFAULT : newActiveColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_COLOR,
					oldActiveColor, activeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficState> getNext() {
		if (next == null) {
			next = new EObjectResolvingEList<TrafficState>(TrafficState.class, this,
					TrafficLightSystemPackage.TRAFFIC_STATE__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_STATE__NAME:
			return getName();
		case TrafficLightSystemPackage.TRAFFIC_STATE__DURATION:
			return getDuration();
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS:
			return getActiveTrafficLights();
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_COLOR:
			return getActiveColor();
		case TrafficLightSystemPackage.TRAFFIC_STATE__NEXT:
			return getNext();
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
		case TrafficLightSystemPackage.TRAFFIC_STATE__NAME:
			setName((String) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__DURATION:
			setDuration((Integer) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS:
			getActiveTrafficLights().clear();
			getActiveTrafficLights().addAll((Collection<? extends TrafficLight>) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_COLOR:
			setActiveColor((LightColor) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends TrafficState>) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS:
			getActiveTrafficLights().clear();
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_COLOR:
			setActiveColor(ACTIVE_COLOR_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_STATE__NEXT:
			getNext().clear();
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
		case TrafficLightSystemPackage.TRAFFIC_STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficLightSystemPackage.TRAFFIC_STATE__DURATION:
			return duration != DURATION_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_TRAFFIC_LIGHTS:
			return activeTrafficLights != null && !activeTrafficLights.isEmpty();
		case TrafficLightSystemPackage.TRAFFIC_STATE__ACTIVE_COLOR:
			return activeColor != ACTIVE_COLOR_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_STATE__NEXT:
			return next != null && !next.isEmpty();
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
		result.append(", duration: ");
		result.append(duration);
		result.append(", activeColor: ");
		result.append(activeColor);
		result.append(')');
		return result.toString();
	}

} //TrafficStateImpl

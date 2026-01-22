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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trafficLightSystem.Direction;
import trafficLightSystem.Pin;
import trafficLightSystem.PinGroup;
import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getPinGroups <em>Pin Groups</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getRedPin <em>Red Pin</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getYellowPin <em>Yellow Pin</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getGreenPin <em>Green Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightModuleImpl extends ComponentImpl implements TrafficLightModule {
	/**
	 * The cached value of the '{@link #getPinGroups() <em>Pin Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PinGroup> pinGroups;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.NORTH_SOUTH;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedPin() <em>Red Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedPin()
	 * @generated
	 * @ordered
	 */
	protected Pin redPin;

	/**
	 * The cached value of the '{@link #getYellowPin() <em>Yellow Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowPin()
	 * @generated
	 * @ordered
	 */
	protected Pin yellowPin;

	/**
	 * The cached value of the '{@link #getGreenPin() <em>Green Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenPin()
	 * @generated
	 * @ordered
	 */
	protected Pin greenPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PinGroup> getPinGroups() {
		if (pinGroups == null) {
			pinGroups = new EObjectContainmentEList<PinGroup>(PinGroup.class, this,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS);
		}
		return pinGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getRedPin() {
		if (redPin != null && redPin.eIsProxy()) {
			InternalEObject oldRedPin = (InternalEObject) redPin;
			redPin = (Pin) eResolveProxy(oldRedPin);
			if (redPin != oldRedPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, oldRedPin, redPin));
			}
		}
		return redPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetRedPin() {
		return redPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedPin(Pin newRedPin) {
		Pin oldRedPin = redPin;
		redPin = newRedPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, oldRedPin, redPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getYellowPin() {
		if (yellowPin != null && yellowPin.eIsProxy()) {
			InternalEObject oldYellowPin = (InternalEObject) yellowPin;
			yellowPin = (Pin) eResolveProxy(oldYellowPin);
			if (yellowPin != oldYellowPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, oldYellowPin, yellowPin));
			}
		}
		return yellowPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetYellowPin() {
		return yellowPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYellowPin(Pin newYellowPin) {
		Pin oldYellowPin = yellowPin;
		yellowPin = newYellowPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, oldYellowPin, yellowPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getGreenPin() {
		if (greenPin != null && greenPin.eIsProxy()) {
			InternalEObject oldGreenPin = (InternalEObject) greenPin;
			greenPin = (Pin) eResolveProxy(oldGreenPin);
			if (greenPin != oldGreenPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, oldGreenPin, greenPin));
			}
		}
		return greenPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetGreenPin() {
		return greenPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreenPin(Pin newGreenPin) {
		Pin oldGreenPin = greenPin;
		greenPin = newGreenPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, oldGreenPin, greenPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS:
			return ((InternalEList<?>) getPinGroups()).basicRemove(otherEnd, msgs);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS:
			return getPinGroups();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION:
			return getDirection();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			if (resolve)
				return getRedPin();
			return basicGetRedPin();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			if (resolve)
				return getYellowPin();
			return basicGetYellowPin();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			if (resolve)
				return getGreenPin();
			return basicGetGreenPin();
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS:
			getPinGroups().clear();
			getPinGroups().addAll((Collection<? extends PinGroup>) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			setRedPin((Pin) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			setYellowPin((Pin) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			setGreenPin((Pin) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS:
			getPinGroups().clear();
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			setRedPin((Pin) null);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			setYellowPin((Pin) null);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			setGreenPin((Pin) null);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__PIN_GROUPS:
			return pinGroups != null && !pinGroups.isEmpty();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			return redPin != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			return yellowPin != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			return greenPin != null;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //TrafficLightModuleImpl

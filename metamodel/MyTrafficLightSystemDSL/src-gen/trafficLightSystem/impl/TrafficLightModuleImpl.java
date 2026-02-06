/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trafficLightSystem.Pin;
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
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getRedPin <em>Red Pin</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getYellowPin <em>Yellow Pin</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightModuleImpl#getGreenPin <em>Green Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightModuleImpl extends ComponentImpl implements TrafficLightModule {
	/**
	 * The cached value of the '{@link #getRedPin() <em>Red Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedPin()
	 * @generated
	 * @ordered
	 */
	protected Pin redPin;

	/**
	 * The cached value of the '{@link #getYellowPin() <em>Yellow Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowPin()
	 * @generated
	 * @ordered
	 */
	protected Pin yellowPin;

	/**
	 * The cached value of the '{@link #getGreenPin() <em>Green Pin</em>}' containment reference.
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
	public Pin getRedPin() {
		return redPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedPin(Pin newRedPin, NotificationChain msgs) {
		Pin oldRedPin = redPin;
		redPin = newRedPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, oldRedPin, newRedPin);
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
	public void setRedPin(Pin newRedPin) {
		if (newRedPin != redPin) {
			NotificationChain msgs = null;
			if (redPin != null)
				msgs = ((InternalEObject) redPin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, null, msgs);
			if (newRedPin != null)
				msgs = ((InternalEObject) newRedPin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, null, msgs);
			msgs = basicSetRedPin(newRedPin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN, newRedPin, newRedPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getYellowPin() {
		return yellowPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYellowPin(Pin newYellowPin, NotificationChain msgs) {
		Pin oldYellowPin = yellowPin;
		yellowPin = newYellowPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, oldYellowPin, newYellowPin);
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
	public void setYellowPin(Pin newYellowPin) {
		if (newYellowPin != yellowPin) {
			NotificationChain msgs = null;
			if (yellowPin != null)
				msgs = ((InternalEObject) yellowPin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, null,
						msgs);
			if (newYellowPin != null)
				msgs = ((InternalEObject) newYellowPin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, null,
						msgs);
			msgs = basicSetYellowPin(newYellowPin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, newYellowPin, newYellowPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin getGreenPin() {
		return greenPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenPin(Pin newGreenPin, NotificationChain msgs) {
		Pin oldGreenPin = greenPin;
		greenPin = newGreenPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, oldGreenPin, newGreenPin);
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
	public void setGreenPin(Pin newGreenPin) {
		if (newGreenPin != greenPin) {
			NotificationChain msgs = null;
			if (greenPin != null)
				msgs = ((InternalEObject) greenPin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, null, msgs);
			if (newGreenPin != null)
				msgs = ((InternalEObject) newGreenPin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, null, msgs);
			msgs = basicSetGreenPin(newGreenPin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN, newGreenPin, newGreenPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			return basicSetRedPin(null, msgs);
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			return basicSetYellowPin(null, msgs);
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			return basicSetGreenPin(null, msgs);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			return getRedPin();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			return getYellowPin();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			return getGreenPin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
			return redPin != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
			return yellowPin != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
			return greenPin != null;
		}
		return super.eIsSet(featureID);
	}

} //TrafficLightModuleImpl

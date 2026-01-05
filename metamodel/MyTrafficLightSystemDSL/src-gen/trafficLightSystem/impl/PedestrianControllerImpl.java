/**
 */
package trafficLightSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import trafficLightSystem.Button;
import trafficLightSystem.LED;
import trafficLightSystem.PedestrianController;
import trafficLightSystem.TrafficLightSystemPackage;
import trafficLightSystem.TrafficState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedestrian Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.PedestrianControllerImpl#getRequestState <em>Request State</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianControllerImpl#getRedLED <em>Red LED</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianControllerImpl#getGreenLED <em>Green LED</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianControllerImpl#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedestrianControllerImpl extends MinimalEObjectImpl.Container implements PedestrianController {
	/**
	 * The cached value of the '{@link #getRequestState() <em>Request State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestState()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficState> requestState;

	/**
	 * The cached value of the '{@link #getRedLED() <em>Red LED</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedLED()
	 * @generated
	 * @ordered
	 */
	protected LED redLED;

	/**
	 * The cached value of the '{@link #getGreenLED() <em>Green LED</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenLED()
	 * @generated
	 * @ordered
	 */
	protected LED greenLED;

	/**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected Button button;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedestrianControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.PEDESTRIAN_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficState> getRequestState() {
		if (requestState == null) {
			requestState = new EObjectResolvingEList<TrafficState>(TrafficState.class, this,
					TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__REQUEST_STATE);
		}
		return requestState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LED getRedLED() {
		if (redLED != null && redLED.eIsProxy()) {
			InternalEObject oldRedLED = (InternalEObject) redLED;
			redLED = (LED) eResolveProxy(oldRedLED);
			if (redLED != oldRedLED) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED, oldRedLED, redLED));
			}
		}
		return redLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED basicGetRedLED() {
		return redLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedLED(LED newRedLED) {
		LED oldRedLED = redLED;
		redLED = newRedLED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED, oldRedLED, redLED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LED getGreenLED() {
		if (greenLED != null && greenLED.eIsProxy()) {
			InternalEObject oldGreenLED = (InternalEObject) greenLED;
			greenLED = (LED) eResolveProxy(oldGreenLED);
			if (greenLED != oldGreenLED) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED, oldGreenLED, greenLED));
			}
		}
		return greenLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED basicGetGreenLED() {
		return greenLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreenLED(LED newGreenLED) {
		LED oldGreenLED = greenLED;
		greenLED = newGreenLED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED, oldGreenLED, greenLED));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button getButton() {
		if (button != null && button.eIsProxy()) {
			InternalEObject oldButton = (InternalEObject) button;
			button = (Button) eResolveProxy(oldButton);
			if (button != oldButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON, oldButton, button));
			}
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button basicGetButton() {
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setButton(Button newButton) {
		Button oldButton = button;
		button = newButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON, oldButton, button));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__REQUEST_STATE:
			return getRequestState();
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED:
			if (resolve)
				return getRedLED();
			return basicGetRedLED();
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED:
			if (resolve)
				return getGreenLED();
			return basicGetGreenLED();
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON:
			if (resolve)
				return getButton();
			return basicGetButton();
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
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__REQUEST_STATE:
			getRequestState().clear();
			getRequestState().addAll((Collection<? extends TrafficState>) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED:
			setRedLED((LED) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED:
			setGreenLED((LED) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON:
			setButton((Button) newValue);
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
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__REQUEST_STATE:
			getRequestState().clear();
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED:
			setRedLED((LED) null);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED:
			setGreenLED((LED) null);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON:
			setButton((Button) null);
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
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__REQUEST_STATE:
			return requestState != null && !requestState.isEmpty();
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__RED_LED:
			return redLED != null;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__GREEN_LED:
			return greenLED != null;
		case TrafficLightSystemPackage.PEDESTRIAN_CONTROLLER__BUTTON:
			return button != null;
		}
		return super.eIsSet(featureID);
	}

} //PedestrianControllerImpl

/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trafficLightSystem.Button;
import trafficLightSystem.LED;
import trafficLightSystem.LightColor;
import trafficLightSystem.PedestrianAssignment;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedestrian Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.PedestrianAssignmentImpl#getColor <em>Color</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianAssignmentImpl#getLed <em>Led</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianAssignmentImpl#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedestrianAssignmentImpl extends MinimalEObjectImpl.Container implements PedestrianAssignment {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final LightColor COLOR_EDEFAULT = LightColor.RED;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected LightColor color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLed() <em>Led</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLed()
	 * @generated
	 * @ordered
	 */
	protected LED led;

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
	protected PedestrianAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.PEDESTRIAN_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(LightColor newColor) {
		LightColor oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LED getLed() {
		if (led != null && led.eIsProxy()) {
			InternalEObject oldLed = (InternalEObject) led;
			led = (LED) eResolveProxy(oldLed);
			if (led != oldLed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED, oldLed, led));
			}
		}
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED basicGetLed() {
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLed(LED newLed) {
		LED oldLed = led;
		led = newLed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED,
					oldLed, led));
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
							TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON, oldButton, button));
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
					TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON, oldButton, button));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__COLOR:
			return getColor();
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED:
			if (resolve)
				return getLed();
			return basicGetLed();
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__COLOR:
			setColor((LightColor) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED:
			setLed((LED) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON:
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
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED:
			setLed((LED) null);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON:
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
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__COLOR:
			return color != COLOR_EDEFAULT;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__LED:
			return led != null;
		case TrafficLightSystemPackage.PEDESTRIAN_ASSIGNMENT__BUTTON:
			return button != null;
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
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //PedestrianAssignmentImpl

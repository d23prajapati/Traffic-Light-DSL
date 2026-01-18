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
import trafficLightSystem.LightColor;
import trafficLightSystem.PedestrianLightState;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedestrian Light State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.PedestrianLightStateImpl#getLed <em>Led</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianLightStateImpl#getButton <em>Button</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianLightStateImpl#getActivePedestrianColor <em>Active Pedestrian Color</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PedestrianLightStateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PedestrianLightStateImpl extends MinimalEObjectImpl.Container implements PedestrianLightState {
	/**
	 * The cached value of the '{@link #getLed() <em>Led</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLed()
	 * @generated
	 * @ordered
	 */
	protected EList<LED> led;

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
	 * The default value of the '{@link #getActivePedestrianColor() <em>Active Pedestrian Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePedestrianColor()
	 * @generated
	 * @ordered
	 */
	protected static final LightColor ACTIVE_PEDESTRIAN_COLOR_EDEFAULT = LightColor.RED;

	/**
	 * The cached value of the '{@link #getActivePedestrianColor() <em>Active Pedestrian Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePedestrianColor()
	 * @generated
	 * @ordered
	 */
	protected LightColor activePedestrianColor = ACTIVE_PEDESTRIAN_COLOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedestrianLightStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.PEDESTRIAN_LIGHT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LED> getLed() {
		if (led == null) {
			led = new EObjectResolvingEList<LED>(LED.class, this,
					TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__LED);
		}
		return led;
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
							TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON, oldButton, button));
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
					TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON, oldButton, button));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightColor getActivePedestrianColor() {
		return activePedestrianColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivePedestrianColor(LightColor newActivePedestrianColor) {
		LightColor oldActivePedestrianColor = activePedestrianColor;
		activePedestrianColor = newActivePedestrianColor == null ? ACTIVE_PEDESTRIAN_COLOR_EDEFAULT
				: newActivePedestrianColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR, oldActivePedestrianColor,
					activePedestrianColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__LED:
			return getLed();
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON:
			if (resolve)
				return getButton();
			return basicGetButton();
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR:
			return getActivePedestrianColor();
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME:
			return getName();
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
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__LED:
			getLed().clear();
			getLed().addAll((Collection<? extends LED>) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON:
			setButton((Button) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR:
			setActivePedestrianColor((LightColor) newValue);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME:
			setName((String) newValue);
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
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__LED:
			getLed().clear();
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON:
			setButton((Button) null);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR:
			setActivePedestrianColor(ACTIVE_PEDESTRIAN_COLOR_EDEFAULT);
			return;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME:
			setName(NAME_EDEFAULT);
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
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__LED:
			return led != null && !led.isEmpty();
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__BUTTON:
			return button != null;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR:
			return activePedestrianColor != ACTIVE_PEDESTRIAN_COLOR_EDEFAULT;
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (activePedestrianColor: ");
		result.append(activePedestrianColor);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PedestrianLightStateImpl

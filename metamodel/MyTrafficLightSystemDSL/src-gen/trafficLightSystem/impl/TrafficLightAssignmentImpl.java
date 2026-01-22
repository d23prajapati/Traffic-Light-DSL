/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import trafficLightSystem.LightColor;
import trafficLightSystem.TrafficLightAssignment;
import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficLightAssignmentImpl#getColor <em>Color</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightAssignmentImpl#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightAssignmentImpl extends MinimalEObjectImpl.Container implements TrafficLightAssignment {
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
	 * The cached value of the '{@link #getTrafficLightModule() <em>Traffic Light Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLightModule()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightModule trafficLightModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_ASSIGNMENT;
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
					TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrafficLightModule getTrafficLightModule() {
		if (trafficLightModule != null && trafficLightModule.eIsProxy()) {
			InternalEObject oldTrafficLightModule = (InternalEObject) trafficLightModule;
			trafficLightModule = (TrafficLightModule) eResolveProxy(oldTrafficLightModule);
			if (trafficLightModule != oldTrafficLightModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE,
							oldTrafficLightModule, trafficLightModule));
			}
		}
		return trafficLightModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightModule basicGetTrafficLightModule() {
		return trafficLightModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafficLightModule(TrafficLightModule newTrafficLightModule) {
		TrafficLightModule oldTrafficLightModule = trafficLightModule;
		trafficLightModule = newTrafficLightModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE, oldTrafficLightModule,
					trafficLightModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__COLOR:
			return getColor();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE:
			if (resolve)
				return getTrafficLightModule();
			return basicGetTrafficLightModule();
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__COLOR:
			setColor((LightColor) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE:
			setTrafficLightModule((TrafficLightModule) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE:
			setTrafficLightModule((TrafficLightModule) null);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__COLOR:
			return color != COLOR_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_ASSIGNMENT__TRAFFIC_LIGHT_MODULE:
			return trafficLightModule != null;
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

} //TrafficLightAssignmentImpl

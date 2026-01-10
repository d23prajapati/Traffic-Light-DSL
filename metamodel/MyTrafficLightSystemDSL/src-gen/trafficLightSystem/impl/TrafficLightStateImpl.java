/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trafficLightSystem.Board;
import trafficLightSystem.LightColor;
import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightState;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Light State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.TrafficLightStateImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightStateImpl#getActiveColor <em>Active Color</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightStateImpl#getTrafficLightModule <em>Traffic Light Module</em>}</li>
 *   <li>{@link trafficLightSystem.impl.TrafficLightStateImpl#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficLightStateImpl extends StateImpl implements TrafficLightState {
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
	 * The cached value of the '{@link #getTrafficLightModule() <em>Traffic Light Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLightModule()
	 * @generated
	 * @ordered
	 */
	protected TrafficLightModule trafficLightModule;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficLightStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR, oldActiveColor, activeColor));
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
							TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE, oldTrafficLightModule,
							trafficLightModule));
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
					TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE, oldTrafficLightModule,
					trafficLightModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject) board;
			board = (Board) eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoard(Board newBoard) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD,
					oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION:
			return getDuration();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR:
			return getActiveColor();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE:
			if (resolve)
				return getTrafficLightModule();
			return basicGetTrafficLightModule();
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD:
			if (resolve)
				return getBoard();
			return basicGetBoard();
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION:
			setDuration((Integer) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR:
			setActiveColor((LightColor) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE:
			setTrafficLightModule((TrafficLightModule) newValue);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD:
			setBoard((Board) newValue);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR:
			setActiveColor(ACTIVE_COLOR_EDEFAULT);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE:
			setTrafficLightModule((TrafficLightModule) null);
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD:
			setBoard((Board) null);
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
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION:
			return duration != DURATION_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR:
			return activeColor != ACTIVE_COLOR_EDEFAULT;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE:
			return trafficLightModule != null;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__BOARD:
			return board != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", activeColor: ");
		result.append(activeColor);
		result.append(')');
		return result.toString();
	}

} //TrafficLightStateImpl

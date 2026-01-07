/**
 */
package trafficLightSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trafficLightSystem.OpaqueBehavior;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.OpaqueBehaviorImpl#getCommandLine <em>Command Line</em>}</li>
 *   <li>{@link trafficLightSystem.impl.OpaqueBehaviorImpl#isIsMain <em>Is Main</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueBehaviorImpl extends BehaviorImpl implements OpaqueBehavior {
	/**
	 * The default value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandLine() <em>Command Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandLine()
	 * @generated
	 * @ordered
	 */
	protected String commandLine = COMMAND_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.OPAQUE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommandLine() {
		return commandLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandLine(String newCommandLine) {
		String oldCommandLine = commandLine;
		commandLine = newCommandLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TrafficLightSystemPackage.OPAQUE_BEHAVIOR__COMMAND_LINE, oldCommandLine, commandLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMain() {
		return isMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMain(boolean newIsMain) {
		boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.OPAQUE_BEHAVIOR__IS_MAIN,
					oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__COMMAND_LINE:
			return getCommandLine();
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__IS_MAIN:
			return isIsMain();
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
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__COMMAND_LINE:
			setCommandLine((String) newValue);
			return;
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__IS_MAIN:
			setIsMain((Boolean) newValue);
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
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__COMMAND_LINE:
			setCommandLine(COMMAND_LINE_EDEFAULT);
			return;
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__IS_MAIN:
			setIsMain(IS_MAIN_EDEFAULT);
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
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__COMMAND_LINE:
			return COMMAND_LINE_EDEFAULT == null ? commandLine != null : !COMMAND_LINE_EDEFAULT.equals(commandLine);
		case TrafficLightSystemPackage.OPAQUE_BEHAVIOR__IS_MAIN:
			return isMain != IS_MAIN_EDEFAULT;
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
		result.append(" (commandLine: ");
		result.append(commandLine);
		result.append(", isMain: ");
		result.append(isMain);
		result.append(')');
		return result.toString();
	}

} //OpaqueBehaviorImpl

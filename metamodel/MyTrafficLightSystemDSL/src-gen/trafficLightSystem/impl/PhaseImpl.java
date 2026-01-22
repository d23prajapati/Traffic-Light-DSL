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

import trafficLightSystem.PedestrianAssignment;
import trafficLightSystem.Phase;
import trafficLightSystem.TrafficLightAssignment;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trafficLightSystem.impl.PhaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PhaseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PhaseImpl#getTrafficLightAssignments <em>Traffic Light Assignments</em>}</li>
 *   <li>{@link trafficLightSystem.impl.PhaseImpl#getPedestrianAssignments <em>Pedestrian Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpl extends MinimalEObjectImpl.Container implements Phase {
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
	 * The cached value of the '{@link #getTrafficLightAssignments() <em>Traffic Light Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficLightAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficLightAssignment> trafficLightAssignments;

	/**
	 * The cached value of the '{@link #getPedestrianAssignments() <em>Pedestrian Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedestrianAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<PedestrianAssignment> pedestrianAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrafficLightSystemPackage.Literals.PHASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.PHASE__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficLightSystemPackage.PHASE__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrafficLightAssignment> getTrafficLightAssignments() {
		if (trafficLightAssignments == null) {
			trafficLightAssignments = new EObjectContainmentEList<TrafficLightAssignment>(TrafficLightAssignment.class,
					this, TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS);
		}
		return trafficLightAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PedestrianAssignment> getPedestrianAssignments() {
		if (pedestrianAssignments == null) {
			pedestrianAssignments = new EObjectContainmentEList<PedestrianAssignment>(PedestrianAssignment.class, this,
					TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS);
		}
		return pedestrianAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS:
			return ((InternalEList<?>) getTrafficLightAssignments()).basicRemove(otherEnd, msgs);
		case TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS:
			return ((InternalEList<?>) getPedestrianAssignments()).basicRemove(otherEnd, msgs);
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
		case TrafficLightSystemPackage.PHASE__NAME:
			return getName();
		case TrafficLightSystemPackage.PHASE__DURATION:
			return getDuration();
		case TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS:
			return getTrafficLightAssignments();
		case TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS:
			return getPedestrianAssignments();
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
		case TrafficLightSystemPackage.PHASE__NAME:
			setName((String) newValue);
			return;
		case TrafficLightSystemPackage.PHASE__DURATION:
			setDuration((Integer) newValue);
			return;
		case TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS:
			getTrafficLightAssignments().clear();
			getTrafficLightAssignments().addAll((Collection<? extends TrafficLightAssignment>) newValue);
			return;
		case TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS:
			getPedestrianAssignments().clear();
			getPedestrianAssignments().addAll((Collection<? extends PedestrianAssignment>) newValue);
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
		case TrafficLightSystemPackage.PHASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficLightSystemPackage.PHASE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS:
			getTrafficLightAssignments().clear();
			return;
		case TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS:
			getPedestrianAssignments().clear();
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
		case TrafficLightSystemPackage.PHASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficLightSystemPackage.PHASE__DURATION:
			return duration != DURATION_EDEFAULT;
		case TrafficLightSystemPackage.PHASE__TRAFFIC_LIGHT_ASSIGNMENTS:
			return trafficLightAssignments != null && !trafficLightAssignments.isEmpty();
		case TrafficLightSystemPackage.PHASE__PEDESTRIAN_ASSIGNMENTS:
			return pedestrianAssignments != null && !pedestrianAssignments.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PhaseImpl

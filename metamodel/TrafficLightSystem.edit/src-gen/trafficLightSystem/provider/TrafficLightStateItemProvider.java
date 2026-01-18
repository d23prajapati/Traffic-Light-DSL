/**
 */
package trafficLightSystem.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trafficLightSystem.TrafficLightState;
import trafficLightSystem.TrafficLightSystemFactory;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * This is the item provider adapter for a {@link trafficLightSystem.TrafficLightState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficLightStateItemProvider extends StateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightStateItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDurationPropertyDescriptor(object);
			addActiveColorPropertyDescriptor(object);
			addTrafficLightModulePropertyDescriptor(object);
			addPedestrianLightStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TrafficLightState_duration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightState_duration_feature",
						"_UI_TrafficLightState_type"),
				TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__DURATION, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Active Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightState_activeColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightState_activeColor_feature",
								"_UI_TrafficLightState_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Traffic Light Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrafficLightModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightState_trafficLightModule_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TrafficLightState_trafficLightModule_feature", "_UI_TrafficLightState_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__TRAFFIC_LIGHT_MODULE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Pedestrian Light State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPedestrianLightStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightState_pedestrianLightState_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_TrafficLightState_pedestrianLightState_feature", "_UI_TrafficLightState_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__PEDESTRIAN_LIGHT_STATE, true, false,
						true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__PEDESTRIAN_LIGHT_STATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TrafficLightState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TrafficLightState"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TrafficLightState) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TrafficLightState_type")
				: getString("_UI_TrafficLightState_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TrafficLightState.class)) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__DURATION:
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__ACTIVE_COLOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_STATE__PEDESTRIAN_LIGHT_STATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_STATE__PEDESTRIAN_LIGHT_STATE,
						TrafficLightSystemFactory.eINSTANCE.createPedestrianLightState()));
	}

}

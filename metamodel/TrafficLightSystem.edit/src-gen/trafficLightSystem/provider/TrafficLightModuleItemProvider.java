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

import trafficLightSystem.TrafficLightModule;
import trafficLightSystem.TrafficLightSystemFactory;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * This is the item provider adapter for a {@link trafficLightSystem.TrafficLightModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficLightModuleItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficLightModuleItemProvider(AdapterFactory adapterFactory) {
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

			addDirectionPropertyDescriptor(object);
			addRedPinPropertyDescriptor(object);
			addYellowPinPropertyDescriptor(object);
			addGreenPinPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightModule_direction_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightModule_direction_feature",
								"_UI_TrafficLightModule_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__DIRECTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Red Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TrafficLightModule_redPin_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightModule_redPin_feature",
						"_UI_TrafficLightModule_type"),
				TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__RED_PIN, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Yellow Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYellowPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightModule_yellowPin_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightModule_yellowPin_feature",
								"_UI_TrafficLightModule_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__YELLOW_PIN, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Green Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGreenPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TrafficLightModule_greenPin_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TrafficLightModule_greenPin_feature",
								"_UI_TrafficLightModule_type"),
						TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__GREEN_PIN, true, false, true, null,
						null, null));
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
			childrenFeatures.add(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__RED_PIN);
			childrenFeatures.add(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__YELLOW_PIN);
			childrenFeatures.add(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__GREEN_PIN);
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
	 * This returns TrafficLightModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TrafficLightModule"));
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
		String label = ((TrafficLightModule) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TrafficLightModule_type")
				: getString("_UI_TrafficLightModule_type") + " " + label;
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

		switch (notification.getFeatureID(TrafficLightModule.class)) {
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__DIRECTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__RED_PIN:
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__YELLOW_PIN:
		case TrafficLightSystemPackage.TRAFFIC_LIGHT_MODULE__GREEN_PIN:
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

		newChildDescriptors.add(createChildParameter(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__RED_PIN,
				TrafficLightSystemFactory.eINSTANCE.createPin()));

		newChildDescriptors
				.add(createChildParameter(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__YELLOW_PIN,
						TrafficLightSystemFactory.eINSTANCE.createPin()));

		newChildDescriptors.add(createChildParameter(TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__GREEN_PIN,
				TrafficLightSystemFactory.eINSTANCE.createPin()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__RED_PIN
				|| childFeature == TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__YELLOW_PIN
				|| childFeature == TrafficLightSystemPackage.Literals.TRAFFIC_LIGHT_MODULE__GREEN_PIN;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

/**
 */
package trafficLightSystem.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trafficLightSystem.PedestrianLightState;
import trafficLightSystem.TrafficLightSystemPackage;

/**
 * This is the item provider adapter for a {@link trafficLightSystem.PedestrianLightState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PedestrianLightStateItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedestrianLightStateItemProvider(AdapterFactory adapterFactory) {
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

			addLedPropertyDescriptor(object);
			addButtonPropertyDescriptor(object);
			addActivePedestrianColorPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Led feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PedestrianLightState_led_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PedestrianLightState_led_feature",
						"_UI_PedestrianLightState_type"),
				TrafficLightSystemPackage.Literals.PEDESTRIAN_LIGHT_STATE__LED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Button feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addButtonPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PedestrianLightState_button_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PedestrianLightState_button_feature",
								"_UI_PedestrianLightState_type"),
						TrafficLightSystemPackage.Literals.PEDESTRIAN_LIGHT_STATE__BUTTON, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Active Pedestrian Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePedestrianColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PedestrianLightState_activePedestrianColor_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PedestrianLightState_activePedestrianColor_feature", "_UI_PedestrianLightState_type"),
				TrafficLightSystemPackage.Literals.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PedestrianLightState_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PedestrianLightState_name_feature",
								"_UI_PedestrianLightState_type"),
						TrafficLightSystemPackage.Literals.PEDESTRIAN_LIGHT_STATE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PedestrianLightState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PedestrianLightState"));
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
		String label = ((PedestrianLightState) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PedestrianLightState_type")
				: getString("_UI_PedestrianLightState_type") + " " + label;
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

		switch (notification.getFeatureID(PedestrianLightState.class)) {
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__ACTIVE_PEDESTRIAN_COLOR:
		case TrafficLightSystemPackage.PEDESTRIAN_LIGHT_STATE__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TrafficLightSystemEditPlugin.INSTANCE;
	}

}

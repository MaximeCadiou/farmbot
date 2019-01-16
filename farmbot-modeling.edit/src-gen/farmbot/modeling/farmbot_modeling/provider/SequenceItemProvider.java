/**
 */
package farmbot.modeling.farmbot_modeling.provider;

import farmbot.modeling.farmbot_modeling.Farmbot_modelingFactory;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.Sequence;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link farmbot.modeling.farmbot_modeling.Sequence} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_Sequence_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Sequence_name_feature",
								"_UI_Sequence_type"),
						Farmbot_modelingPackage.Literals.SEQUENCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(Farmbot_modelingPackage.Literals.SEQUENCE__IF);
			childrenFeatures.add(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION);
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
	 * This returns Sequence.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sequence"));
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
		String label = ((Sequence) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Sequence_type")
				: getString("_UI_Sequence_type") + " " + label;
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

		switch (notification.getFeatureID(Sequence.class)) {
		case Farmbot_modelingPackage.SEQUENCE__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Farmbot_modelingPackage.SEQUENCE__IF:
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
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

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__IF,
				Farmbot_modelingFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createTurnOn()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createTurnOff()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createMoveRelative()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createFindHome()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createMoveAbsolute()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createExecuteSequence()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createWait()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createIsToolOn()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createSendMessage()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createRunFarmware()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createTakePhoto()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createSchedule()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createListPeripherals()));

		newChildDescriptors.add(createChildParameter(Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION,
				Farmbot_modelingFactory.eINSTANCE.createListSequences()));
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

		boolean qualify = childFeature == Farmbot_modelingPackage.Literals.SEQUENCE__IF
				|| childFeature == Farmbot_modelingPackage.Literals.SEQUENCE__SEQUENCEINSTRUCTION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

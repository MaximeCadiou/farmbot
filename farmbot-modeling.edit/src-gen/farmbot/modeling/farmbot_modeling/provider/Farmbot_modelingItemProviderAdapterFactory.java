/**
 */
package farmbot.modeling.farmbot_modeling.provider;

import farmbot.modeling.farmbot_modeling.util.Farmbot_modelingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Farmbot_modelingItemProviderAdapterFactory extends Farmbot_modelingAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.Farmbot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FarmbotItemProvider farmbotItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.Farmbot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFarmbotAdapter() {
		if (farmbotItemProvider == null) {
			farmbotItemProvider = new FarmbotItemProvider(this);
		}

		return farmbotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.TurnOn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnOnItemProvider turnOnItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.TurnOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurnOnAdapter() {
		if (turnOnItemProvider == null) {
			turnOnItemProvider = new TurnOnItemProvider(this);
		}

		return turnOnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.TurnOff} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnOffItemProvider turnOffItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.TurnOff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurnOffAdapter() {
		if (turnOffItemProvider == null) {
			turnOffItemProvider = new TurnOffItemProvider(this);
		}

		return turnOffItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.MoveRelative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveRelativeItemProvider moveRelativeItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.MoveRelative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveRelativeAdapter() {
		if (moveRelativeItemProvider == null) {
			moveRelativeItemProvider = new MoveRelativeItemProvider(this);
		}

		return moveRelativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.FindHome} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindHomeItemProvider findHomeItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.FindHome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindHomeAdapter() {
		if (findHomeItemProvider == null) {
			findHomeItemProvider = new FindHomeItemProvider(this);
		}

		return findHomeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.MoveAbsolute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveAbsoluteItemProvider moveAbsoluteItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.MoveAbsolute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveAbsoluteAdapter() {
		if (moveAbsoluteItemProvider == null) {
			moveAbsoluteItemProvider = new MoveAbsoluteItemProvider(this);
		}

		return moveAbsoluteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.ExecuteSequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteSequenceItemProvider executeSequenceItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.ExecuteSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecuteSequenceAdapter() {
		if (executeSequenceItemProvider == null) {
			executeSequenceItemProvider = new ExecuteSequenceItemProvider(this);
		}

		return executeSequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.Wait} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitItemProvider waitItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.Wait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitAdapter() {
		if (waitItemProvider == null) {
			waitItemProvider = new WaitItemProvider(this);
		}

		return waitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.SendMessage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageItemProvider sendMessageItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.SendMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendMessageAdapter() {
		if (sendMessageItemProvider == null) {
			sendMessageItemProvider = new SendMessageItemProvider(this);
		}

		return sendMessageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.RunFarmware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunFarmwareItemProvider runFarmwareItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.RunFarmware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunFarmwareAdapter() {
		if (runFarmwareItemProvider == null) {
			runFarmwareItemProvider = new RunFarmwareItemProvider(this);
		}

		return runFarmwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.TakePhoto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TakePhotoItemProvider takePhotoItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.TakePhoto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTakePhotoAdapter() {
		if (takePhotoItemProvider == null) {
			takePhotoItemProvider = new TakePhotoItemProvider(this);
		}

		return takePhotoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.IsEqualTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsEqualToItemProvider isEqualToItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.IsEqualTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsEqualToAdapter() {
		if (isEqualToItemProvider == null) {
			isEqualToItemProvider = new IsEqualToItemProvider(this);
		}

		return isEqualToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.IsNotEqualTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsNotEqualToItemProvider isNotEqualToItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.IsNotEqualTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsNotEqualToAdapter() {
		if (isNotEqualToItemProvider == null) {
			isNotEqualToItemProvider = new IsNotEqualToItemProvider(this);
		}

		return isNotEqualToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.IsGreaterThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsGreaterThanItemProvider isGreaterThanItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.IsGreaterThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsGreaterThanAdapter() {
		if (isGreaterThanItemProvider == null) {
			isGreaterThanItemProvider = new IsGreaterThanItemProvider(this);
		}

		return isGreaterThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.IsLowerThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsLowerThanItemProvider isLowerThanItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.IsLowerThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsLowerThanAdapter() {
		if (isLowerThanItemProvider == null) {
			isLowerThanItemProvider = new IsLowerThanItemProvider(this);
		}

		return isLowerThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.Schedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleItemProvider scheduleItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleAdapter() {
		if (scheduleItemProvider == null) {
			scheduleItemProvider = new ScheduleItemProvider(this);
		}

		return scheduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link farmbot.modeling.farmbot_modeling.ListSequences} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListSequencesItemProvider listSequencesItemProvider;

	/**
	 * This creates an adapter for a {@link farmbot.modeling.farmbot_modeling.ListSequences}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListSequencesAdapter() {
		if (listSequencesItemProvider == null) {
			listSequencesItemProvider = new ListSequencesItemProvider(this);
		}

		return listSequencesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (farmbotItemProvider != null)
			farmbotItemProvider.dispose();
		if (turnOnItemProvider != null)
			turnOnItemProvider.dispose();
		if (turnOffItemProvider != null)
			turnOffItemProvider.dispose();
		if (moveRelativeItemProvider != null)
			moveRelativeItemProvider.dispose();
		if (findHomeItemProvider != null)
			findHomeItemProvider.dispose();
		if (sequenceItemProvider != null)
			sequenceItemProvider.dispose();
		if (ifItemProvider != null)
			ifItemProvider.dispose();
		if (moveAbsoluteItemProvider != null)
			moveAbsoluteItemProvider.dispose();
		if (executeSequenceItemProvider != null)
			executeSequenceItemProvider.dispose();
		if (waitItemProvider != null)
			waitItemProvider.dispose();
		if (sendMessageItemProvider != null)
			sendMessageItemProvider.dispose();
		if (runFarmwareItemProvider != null)
			runFarmwareItemProvider.dispose();
		if (takePhotoItemProvider != null)
			takePhotoItemProvider.dispose();
		if (isEqualToItemProvider != null)
			isEqualToItemProvider.dispose();
		if (isNotEqualToItemProvider != null)
			isNotEqualToItemProvider.dispose();
		if (isGreaterThanItemProvider != null)
			isGreaterThanItemProvider.dispose();
		if (isLowerThanItemProvider != null)
			isLowerThanItemProvider.dispose();
		if (scheduleItemProvider != null)
			scheduleItemProvider.dispose();
		if (listSequencesItemProvider != null)
			listSequencesItemProvider.dispose();
	}

}

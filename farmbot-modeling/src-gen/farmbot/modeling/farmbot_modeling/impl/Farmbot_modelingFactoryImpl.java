/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Farmbot_modelingFactoryImpl extends EFactoryImpl implements Farmbot_modelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Farmbot_modelingFactory init() {
		try {
			Farmbot_modelingFactory theFarmbot_modelingFactory = (Farmbot_modelingFactory) EPackage.Registry.INSTANCE
					.getEFactory(Farmbot_modelingPackage.eNS_URI);
			if (theFarmbot_modelingFactory != null) {
				return theFarmbot_modelingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Farmbot_modelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Farmbot_modelingPackage.FARMBOT:
			return createFarmbot();
		case Farmbot_modelingPackage.TURN_ON_DIGITAL:
			return createTurnOnDigital();
		case Farmbot_modelingPackage.TURN_OFF:
			return createTurnOff();
		case Farmbot_modelingPackage.MOVE_RELATIVE:
			return createMoveRelative();
		case Farmbot_modelingPackage.FIND_HOME:
			return createFindHome();
		case Farmbot_modelingPackage.SEQUENCE:
			return createSequence();
		case Farmbot_modelingPackage.IF:
			return createIf();
		case Farmbot_modelingPackage.MOVE_ABSOLUTE:
			return createMoveAbsolute();
		case Farmbot_modelingPackage.EXECUTE_SEQUENCE:
			return createExecuteSequence();
		case Farmbot_modelingPackage.WAIT:
			return createWait();
		case Farmbot_modelingPackage.SEND_MESSAGE:
			return createSendMessage();
		case Farmbot_modelingPackage.RUN_FARMWARE:
			return createRunFarmware();
		case Farmbot_modelingPackage.TAKE_PHOTO:
			return createTakePhoto();
		case Farmbot_modelingPackage.IS_EQUAL_TO:
			return createIsEqualTo();
		case Farmbot_modelingPackage.IS_NOT_EQUAL_TO:
			return createIsNotEqualTo();
		case Farmbot_modelingPackage.IS_GREATER_THAN:
			return createIsGreaterThan();
		case Farmbot_modelingPackage.IS_LOWER_THAN:
			return createIsLowerThan();
		case Farmbot_modelingPackage.SCHEDULE:
			return createSchedule();
		case Farmbot_modelingPackage.LIST_SEQUENCES:
			return createListSequences();
		case Farmbot_modelingPackage.LIST_SCHEDULED_EVENTS:
			return createListScheduledEvents();
		case Farmbot_modelingPackage.TURN_ON_ANALOG:
			return createTurnOnAnalog();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot createFarmbot() {
		FarmbotImpl farmbot = new FarmbotImpl();
		return farmbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOnDigital createTurnOnDigital() {
		TurnOnDigitalImpl turnOnDigital = new TurnOnDigitalImpl();
		return turnOnDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOff createTurnOff() {
		TurnOffImpl turnOff = new TurnOffImpl();
		return turnOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveRelative createMoveRelative() {
		MoveRelativeImpl moveRelative = new MoveRelativeImpl();
		return moveRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindHome createFindHome() {
		FindHomeImpl findHome = new FindHomeImpl();
		return findHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAbsolute createMoveAbsolute() {
		MoveAbsoluteImpl moveAbsolute = new MoveAbsoluteImpl();
		return moveAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteSequence createExecuteSequence() {
		ExecuteSequenceImpl executeSequence = new ExecuteSequenceImpl();
		return executeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage createSendMessage() {
		SendMessageImpl sendMessage = new SendMessageImpl();
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunFarmware createRunFarmware() {
		RunFarmwareImpl runFarmware = new RunFarmwareImpl();
		return runFarmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TakePhoto createTakePhoto() {
		TakePhotoImpl takePhoto = new TakePhotoImpl();
		return takePhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsEqualTo createIsEqualTo() {
		IsEqualToImpl isEqualTo = new IsEqualToImpl();
		return isEqualTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNotEqualTo createIsNotEqualTo() {
		IsNotEqualToImpl isNotEqualTo = new IsNotEqualToImpl();
		return isNotEqualTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsGreaterThan createIsGreaterThan() {
		IsGreaterThanImpl isGreaterThan = new IsGreaterThanImpl();
		return isGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsLowerThan createIsLowerThan() {
		IsLowerThanImpl isLowerThan = new IsLowerThanImpl();
		return isLowerThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSequences createListSequences() {
		ListSequencesImpl listSequences = new ListSequencesImpl();
		return listSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListScheduledEvents createListScheduledEvents() {
		ListScheduledEventsImpl listScheduledEvents = new ListScheduledEventsImpl();
		return listScheduledEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnOnAnalog createTurnOnAnalog() {
		TurnOnAnalogImpl turnOnAnalog = new TurnOnAnalogImpl();
		return turnOnAnalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingPackage getFarmbot_modelingPackage() {
		return (Farmbot_modelingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Farmbot_modelingPackage getPackage() {
		return Farmbot_modelingPackage.eINSTANCE;
	}

} //Farmbot_modelingFactoryImpl

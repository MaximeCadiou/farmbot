/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.BooleanExpression;
import farmbot.modeling.farmbot_modeling.Command;
import farmbot.modeling.farmbot_modeling.ExecuteSequence;
import farmbot.modeling.farmbot_modeling.Farmbot;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingFactory;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.FindHome;
import farmbot.modeling.farmbot_modeling.If;
import farmbot.modeling.farmbot_modeling.Instruction;
import farmbot.modeling.farmbot_modeling.IsEqualTo;
import farmbot.modeling.farmbot_modeling.IsGreaterThan;
import farmbot.modeling.farmbot_modeling.IsLowerThan;
import farmbot.modeling.farmbot_modeling.IsNotEqualTo;
import farmbot.modeling.farmbot_modeling.ListScheduledEvents;
import farmbot.modeling.farmbot_modeling.ListSequences;
import farmbot.modeling.farmbot_modeling.Move;
import farmbot.modeling.farmbot_modeling.MoveAbsolute;
import farmbot.modeling.farmbot_modeling.MoveRelative;
import farmbot.modeling.farmbot_modeling.RunFarmware;
import farmbot.modeling.farmbot_modeling.Schedule;
import farmbot.modeling.farmbot_modeling.SendMessage;
import farmbot.modeling.farmbot_modeling.Sequence;
import farmbot.modeling.farmbot_modeling.SequenceCommand;
import farmbot.modeling.farmbot_modeling.SequenceInstruction;
import farmbot.modeling.farmbot_modeling.TakePhoto;
import farmbot.modeling.farmbot_modeling.TurnOff;
import farmbot.modeling.farmbot_modeling.TurnOnAnalog;
import farmbot.modeling.farmbot_modeling.TurnOnDigital;
import farmbot.modeling.farmbot_modeling.Wait;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Farmbot_modelingPackageImpl extends EPackageImpl implements Farmbot_modelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass farmbotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnOnDigitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveRelativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findHomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveAbsoluteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runFarmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass takePhotoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEqualToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isNotEqualToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isGreaterThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isLowerThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSequencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listScheduledEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnOnAnalogEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Farmbot_modelingPackageImpl() {
		super(eNS_URI, Farmbot_modelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Farmbot_modelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Farmbot_modelingPackage init() {
		if (isInited)
			return (Farmbot_modelingPackage) EPackage.Registry.INSTANCE.getEPackage(Farmbot_modelingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFarmbot_modelingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Farmbot_modelingPackageImpl theFarmbot_modelingPackage = registeredFarmbot_modelingPackage instanceof Farmbot_modelingPackageImpl
				? (Farmbot_modelingPackageImpl) registeredFarmbot_modelingPackage
				: new Farmbot_modelingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFarmbot_modelingPackage.createPackageContents();

		// Initialize created meta-data
		theFarmbot_modelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFarmbot_modelingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Farmbot_modelingPackage.eNS_URI, theFarmbot_modelingPackage);
		return theFarmbot_modelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFarmbot() {
		return farmbotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarmbot_Instructions() {
		return (EReference) farmbotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceCommand() {
		return sequenceCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_X() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Y() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Z() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Speed() {
		return (EAttribute) moveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnOnDigital() {
		return turnOnDigitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnOnDigital_Pin() {
		return (EAttribute) turnOnDigitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnOff() {
		return turnOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnOff_Pin() {
		return (EAttribute) turnOffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveRelative() {
		return moveRelativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindHome() {
		return findHomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFindHome_Axis() {
		return (EAttribute) findHomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Name() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_SequenceInstructions() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_BooleanExpression() {
		return (EReference) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Then() {
		return (EReference) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Else() {
		return (EReference) ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveAbsolute() {
		return moveAbsoluteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteSequence() {
		return executeSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteSequence_Id() {
		return (EAttribute) executeSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Duration() {
		return (EAttribute) waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Value() {
		return (EAttribute) booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Axe() {
		return (EAttribute) booleanExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_PinNumber() {
		return (EAttribute) booleanExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessage() {
		return sendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessage_Message() {
		return (EAttribute) sendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessage_MessageType() {
		return (EAttribute) sendMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunFarmware() {
		return runFarmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunFarmware_Name() {
		return (EAttribute) runFarmwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTakePhoto() {
		return takePhotoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceInstruction() {
		return sequenceInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsEqualTo() {
		return isEqualToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsNotEqualTo() {
		return isNotEqualToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsGreaterThan() {
		return isGreaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsLowerThan() {
		return isLowerThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Sequence() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_StartDate() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_StartTime() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Repeat() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_RepeatFrequency() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_RepeatUnit() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_EndDate() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_EndTime() {
		return (EAttribute) scheduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListSequences() {
		return listSequencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListScheduledEvents() {
		return listScheduledEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnOnAnalog() {
		return turnOnAnalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnOnAnalog_Pin() {
		return (EAttribute) turnOnAnalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnOnAnalog_Value() {
		return (EAttribute) turnOnAnalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingFactory getFarmbot_modelingFactory() {
		return (Farmbot_modelingFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		farmbotEClass = createEClass(FARMBOT);
		createEReference(farmbotEClass, FARMBOT__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		sequenceCommandEClass = createEClass(SEQUENCE_COMMAND);

		moveEClass = createEClass(MOVE);
		createEAttribute(moveEClass, MOVE__X);
		createEAttribute(moveEClass, MOVE__Y);
		createEAttribute(moveEClass, MOVE__Z);
		createEAttribute(moveEClass, MOVE__SPEED);

		turnOnDigitalEClass = createEClass(TURN_ON_DIGITAL);
		createEAttribute(turnOnDigitalEClass, TURN_ON_DIGITAL__PIN);

		turnOffEClass = createEClass(TURN_OFF);
		createEAttribute(turnOffEClass, TURN_OFF__PIN);

		moveRelativeEClass = createEClass(MOVE_RELATIVE);

		findHomeEClass = createEClass(FIND_HOME);
		createEAttribute(findHomeEClass, FIND_HOME__AXIS);

		sequenceEClass = createEClass(SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__NAME);
		createEReference(sequenceEClass, SEQUENCE__SEQUENCE_INSTRUCTIONS);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__BOOLEAN_EXPRESSION);
		createEReference(ifEClass, IF__THEN);
		createEReference(ifEClass, IF__ELSE);

		moveAbsoluteEClass = createEClass(MOVE_ABSOLUTE);

		executeSequenceEClass = createEClass(EXECUTE_SEQUENCE);
		createEAttribute(executeSequenceEClass, EXECUTE_SEQUENCE__ID);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__DURATION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__VALUE);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__AXE);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__PIN_NUMBER);

		sendMessageEClass = createEClass(SEND_MESSAGE);
		createEAttribute(sendMessageEClass, SEND_MESSAGE__MESSAGE);
		createEAttribute(sendMessageEClass, SEND_MESSAGE__MESSAGE_TYPE);

		runFarmwareEClass = createEClass(RUN_FARMWARE);
		createEAttribute(runFarmwareEClass, RUN_FARMWARE__NAME);

		takePhotoEClass = createEClass(TAKE_PHOTO);

		sequenceInstructionEClass = createEClass(SEQUENCE_INSTRUCTION);

		isEqualToEClass = createEClass(IS_EQUAL_TO);

		isNotEqualToEClass = createEClass(IS_NOT_EQUAL_TO);

		isGreaterThanEClass = createEClass(IS_GREATER_THAN);

		isLowerThanEClass = createEClass(IS_LOWER_THAN);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__SEQUENCE);
		createEAttribute(scheduleEClass, SCHEDULE__START_DATE);
		createEAttribute(scheduleEClass, SCHEDULE__START_TIME);
		createEAttribute(scheduleEClass, SCHEDULE__REPEAT);
		createEAttribute(scheduleEClass, SCHEDULE__REPEAT_FREQUENCY);
		createEAttribute(scheduleEClass, SCHEDULE__REPEAT_UNIT);
		createEAttribute(scheduleEClass, SCHEDULE__END_DATE);
		createEAttribute(scheduleEClass, SCHEDULE__END_TIME);

		commandEClass = createEClass(COMMAND);

		listSequencesEClass = createEClass(LIST_SEQUENCES);

		listScheduledEventsEClass = createEClass(LIST_SCHEDULED_EVENTS);

		turnOnAnalogEClass = createEClass(TURN_ON_ANALOG);
		createEAttribute(turnOnAnalogEClass, TURN_ON_ANALOG__PIN);
		createEAttribute(turnOnAnalogEClass, TURN_ON_ANALOG__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequenceCommandEClass.getESuperTypes().add(this.getCommand());
		sequenceCommandEClass.getESuperTypes().add(this.getSequenceInstruction());
		moveEClass.getESuperTypes().add(this.getSequenceCommand());
		turnOnDigitalEClass.getESuperTypes().add(this.getSequenceCommand());
		turnOffEClass.getESuperTypes().add(this.getSequenceCommand());
		moveRelativeEClass.getESuperTypes().add(this.getMove());
		findHomeEClass.getESuperTypes().add(this.getSequenceCommand());
		sequenceEClass.getESuperTypes().add(this.getInstruction());
		ifEClass.getESuperTypes().add(this.getSequenceInstruction());
		moveAbsoluteEClass.getESuperTypes().add(this.getMove());
		executeSequenceEClass.getESuperTypes().add(this.getSequenceCommand());
		waitEClass.getESuperTypes().add(this.getSequenceCommand());
		sendMessageEClass.getESuperTypes().add(this.getSequenceCommand());
		runFarmwareEClass.getESuperTypes().add(this.getSequenceCommand());
		takePhotoEClass.getESuperTypes().add(this.getSequenceCommand());
		sequenceInstructionEClass.getESuperTypes().add(this.getInstruction());
		isEqualToEClass.getESuperTypes().add(this.getBooleanExpression());
		isNotEqualToEClass.getESuperTypes().add(this.getBooleanExpression());
		isGreaterThanEClass.getESuperTypes().add(this.getBooleanExpression());
		isLowerThanEClass.getESuperTypes().add(this.getBooleanExpression());
		scheduleEClass.getESuperTypes().add(this.getCommand());
		commandEClass.getESuperTypes().add(this.getInstruction());
		listSequencesEClass.getESuperTypes().add(this.getCommand());
		listScheduledEventsEClass.getESuperTypes().add(this.getCommand());
		turnOnAnalogEClass.getESuperTypes().add(this.getSequenceCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(farmbotEClass, Farmbot.class, "Farmbot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFarmbot_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1,
				Farmbot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceCommandEClass, SequenceCommand.class, "SequenceCommand", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveEClass, Move.class, "Move", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMove_X(), ecorePackage.getEInt(), "x", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Z(), ecorePackage.getEInt(), "z", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Move.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnOnDigitalEClass, TurnOnDigital.class, "TurnOnDigital", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnOnDigital_Pin(), ecorePackage.getEInt(), "pin", null, 0, 1, TurnOnDigital.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnOffEClass, TurnOff.class, "TurnOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnOff_Pin(), ecorePackage.getEInt(), "pin", null, 0, 1, TurnOff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveRelativeEClass, MoveRelative.class, "MoveRelative", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(findHomeEClass, FindHome.class, "FindHome", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFindHome_Axis(), ecorePackage.getEString(), "axis", null, 0, 1, FindHome.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequence_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequence_SequenceInstructions(), this.getSequenceInstruction(), null, "sequenceInstructions",
				null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_BooleanExpression(), this.getBooleanExpression(), null, "booleanExpression", null, 1, 1,
				If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_Then(), this.getExecuteSequence(), null, "then", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIf_Else(), this.getExecuteSequence(), null, "else", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(moveAbsoluteEClass, MoveAbsolute.class, "MoveAbsolute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executeSequenceEClass, ExecuteSequence.class, "ExecuteSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecuteSequence_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ExecuteSequence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Wait.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1,
				BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanExpression_Axe(), ecorePackage.getEString(), "axe", null, 0, 1,
				BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanExpression_PinNumber(), ecorePackage.getEInt(), "pinNumber", null, 0, 1,
				BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sendMessageEClass, SendMessage.class, "SendMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, SendMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendMessage_MessageType(), ecorePackage.getEString(), "messageType", null, 0, 1,
				SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(runFarmwareEClass, RunFarmware.class, "RunFarmware", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunFarmware_Name(), ecorePackage.getEString(), "name", null, 0, 1, RunFarmware.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(takePhotoEClass, TakePhoto.class, "TakePhoto", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceInstructionEClass, SequenceInstruction.class, "SequenceInstruction", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isEqualToEClass, IsEqualTo.class, "IsEqualTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(isNotEqualToEClass, IsNotEqualTo.class, "IsNotEqualTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(isGreaterThanEClass, IsGreaterThan.class, "IsGreaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(isLowerThanEClass, IsLowerThan.class, "IsLowerThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Repeat(), ecorePackage.getEBoolean(), "repeat", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_RepeatFrequency(), ecorePackage.getEInt(), "repeatFrequency", null, 0, 1,
				Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_RepeatUnit(), ecorePackage.getEString(), "repeatUnit", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, Schedule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listSequencesEClass, ListSequences.class, "ListSequences", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(listScheduledEventsEClass, ListScheduledEvents.class, "ListScheduledEvents", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnOnAnalogEClass, TurnOnAnalog.class, "TurnOnAnalog", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnOnAnalog_Pin(), ecorePackage.getEInt(), "pin", null, 0, 1, TurnOnAnalog.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurnOnAnalog_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TurnOnAnalog.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Farmbot_modelingPackageImpl

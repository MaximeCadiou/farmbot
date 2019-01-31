/**
 */
package farmbot.modeling.farmbot_modeling.util;

import farmbot.modeling.farmbot_modeling.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage
 * @generated
 */
public class Farmbot_modelingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Farmbot_modelingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingSwitch() {
		if (modelPackage == null) {
			modelPackage = Farmbot_modelingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Farmbot_modelingPackage.FARMBOT: {
			Farmbot farmbot = (Farmbot) theEObject;
			T result = caseFarmbot(farmbot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.SEQUENCE_COMMAND: {
			SequenceCommand sequenceCommand = (SequenceCommand) theEObject;
			T result = caseSequenceCommand(sequenceCommand);
			if (result == null)
				result = caseCommand(sequenceCommand);
			if (result == null)
				result = caseSequenceInstruction(sequenceCommand);
			if (result == null)
				result = caseInstruction(sequenceCommand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.MOVE: {
			Move move = (Move) theEObject;
			T result = caseMove(move);
			if (result == null)
				result = caseSequenceCommand(move);
			if (result == null)
				result = caseCommand(move);
			if (result == null)
				result = caseSequenceInstruction(move);
			if (result == null)
				result = caseInstruction(move);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.TURN_ON_DIGITAL: {
			TurnOnDigital turnOnDigital = (TurnOnDigital) theEObject;
			T result = caseTurnOnDigital(turnOnDigital);
			if (result == null)
				result = caseSequenceCommand(turnOnDigital);
			if (result == null)
				result = caseCommand(turnOnDigital);
			if (result == null)
				result = caseSequenceInstruction(turnOnDigital);
			if (result == null)
				result = caseInstruction(turnOnDigital);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.TURN_OFF: {
			TurnOff turnOff = (TurnOff) theEObject;
			T result = caseTurnOff(turnOff);
			if (result == null)
				result = caseSequenceCommand(turnOff);
			if (result == null)
				result = caseCommand(turnOff);
			if (result == null)
				result = caseSequenceInstruction(turnOff);
			if (result == null)
				result = caseInstruction(turnOff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.MOVE_RELATIVE: {
			MoveRelative moveRelative = (MoveRelative) theEObject;
			T result = caseMoveRelative(moveRelative);
			if (result == null)
				result = caseMove(moveRelative);
			if (result == null)
				result = caseSequenceCommand(moveRelative);
			if (result == null)
				result = caseCommand(moveRelative);
			if (result == null)
				result = caseSequenceInstruction(moveRelative);
			if (result == null)
				result = caseInstruction(moveRelative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.FIND_HOME: {
			FindHome findHome = (FindHome) theEObject;
			T result = caseFindHome(findHome);
			if (result == null)
				result = caseSequenceCommand(findHome);
			if (result == null)
				result = caseCommand(findHome);
			if (result == null)
				result = caseSequenceInstruction(findHome);
			if (result == null)
				result = caseInstruction(findHome);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.SEQUENCE: {
			Sequence sequence = (Sequence) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = caseInstruction(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseSequenceInstruction(if_);
			if (result == null)
				result = caseInstruction(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.MOVE_ABSOLUTE: {
			MoveAbsolute moveAbsolute = (MoveAbsolute) theEObject;
			T result = caseMoveAbsolute(moveAbsolute);
			if (result == null)
				result = caseMove(moveAbsolute);
			if (result == null)
				result = caseSequenceCommand(moveAbsolute);
			if (result == null)
				result = caseCommand(moveAbsolute);
			if (result == null)
				result = caseSequenceInstruction(moveAbsolute);
			if (result == null)
				result = caseInstruction(moveAbsolute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.EXECUTE_SEQUENCE: {
			ExecuteSequence executeSequence = (ExecuteSequence) theEObject;
			T result = caseExecuteSequence(executeSequence);
			if (result == null)
				result = caseSequenceCommand(executeSequence);
			if (result == null)
				result = caseCommand(executeSequence);
			if (result == null)
				result = caseSequenceInstruction(executeSequence);
			if (result == null)
				result = caseInstruction(executeSequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.WAIT: {
			Wait wait = (Wait) theEObject;
			T result = caseWait(wait);
			if (result == null)
				result = caseSequenceCommand(wait);
			if (result == null)
				result = caseCommand(wait);
			if (result == null)
				result = caseSequenceInstruction(wait);
			if (result == null)
				result = caseInstruction(wait);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION: {
			BooleanExpression booleanExpression = (BooleanExpression) theEObject;
			T result = caseBooleanExpression(booleanExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.SEND_MESSAGE: {
			SendMessage sendMessage = (SendMessage) theEObject;
			T result = caseSendMessage(sendMessage);
			if (result == null)
				result = caseSequenceCommand(sendMessage);
			if (result == null)
				result = caseCommand(sendMessage);
			if (result == null)
				result = caseSequenceInstruction(sendMessage);
			if (result == null)
				result = caseInstruction(sendMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.RUN_FARMWARE: {
			RunFarmware runFarmware = (RunFarmware) theEObject;
			T result = caseRunFarmware(runFarmware);
			if (result == null)
				result = caseSequenceCommand(runFarmware);
			if (result == null)
				result = caseCommand(runFarmware);
			if (result == null)
				result = caseSequenceInstruction(runFarmware);
			if (result == null)
				result = caseInstruction(runFarmware);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.TAKE_PHOTO: {
			TakePhoto takePhoto = (TakePhoto) theEObject;
			T result = caseTakePhoto(takePhoto);
			if (result == null)
				result = caseSequenceCommand(takePhoto);
			if (result == null)
				result = caseCommand(takePhoto);
			if (result == null)
				result = caseSequenceInstruction(takePhoto);
			if (result == null)
				result = caseInstruction(takePhoto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.SEQUENCE_INSTRUCTION: {
			SequenceInstruction sequenceInstruction = (SequenceInstruction) theEObject;
			T result = caseSequenceInstruction(sequenceInstruction);
			if (result == null)
				result = caseInstruction(sequenceInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.IS_EQUAL_TO: {
			IsEqualTo isEqualTo = (IsEqualTo) theEObject;
			T result = caseIsEqualTo(isEqualTo);
			if (result == null)
				result = caseBooleanExpression(isEqualTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.IS_NOT_EQUAL_TO: {
			IsNotEqualTo isNotEqualTo = (IsNotEqualTo) theEObject;
			T result = caseIsNotEqualTo(isNotEqualTo);
			if (result == null)
				result = caseBooleanExpression(isNotEqualTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.IS_GREATER_THAN: {
			IsGreaterThan isGreaterThan = (IsGreaterThan) theEObject;
			T result = caseIsGreaterThan(isGreaterThan);
			if (result == null)
				result = caseBooleanExpression(isGreaterThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.IS_LOWER_THAN: {
			IsLowerThan isLowerThan = (IsLowerThan) theEObject;
			T result = caseIsLowerThan(isLowerThan);
			if (result == null)
				result = caseBooleanExpression(isLowerThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.SCHEDULE: {
			Schedule schedule = (Schedule) theEObject;
			T result = caseSchedule(schedule);
			if (result == null)
				result = caseCommand(schedule);
			if (result == null)
				result = caseInstruction(schedule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = caseInstruction(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.LIST_SEQUENCES: {
			ListSequences listSequences = (ListSequences) theEObject;
			T result = caseListSequences(listSequences);
			if (result == null)
				result = caseCommand(listSequences);
			if (result == null)
				result = caseInstruction(listSequences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.LIST_SCHEDULED_EVENTS: {
			ListScheduledEvents listScheduledEvents = (ListScheduledEvents) theEObject;
			T result = caseListScheduledEvents(listScheduledEvents);
			if (result == null)
				result = caseCommand(listScheduledEvents);
			if (result == null)
				result = caseInstruction(listScheduledEvents);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farmbot_modelingPackage.TURN_ON_ANALOG: {
			TurnOnAnalog turnOnAnalog = (TurnOnAnalog) theEObject;
			T result = caseTurnOnAnalog(turnOnAnalog);
			if (result == null)
				result = caseSequenceCommand(turnOnAnalog);
			if (result == null)
				result = caseCommand(turnOnAnalog);
			if (result == null)
				result = caseSequenceInstruction(turnOnAnalog);
			if (result == null)
				result = caseInstruction(turnOnAnalog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Farmbot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Farmbot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFarmbot(Farmbot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceCommand(SequenceCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn On Digital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn On Digital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOnDigital(TurnOnDigital object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOff(TurnOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Relative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Relative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveRelative(MoveRelative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find Home</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find Home</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindHome(FindHome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Absolute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveAbsolute(MoveAbsolute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteSequence(ExecuteSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessage(SendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Farmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Farmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunFarmware(RunFarmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Take Photo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Take Photo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTakePhoto(TakePhoto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceInstruction(SequenceInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Equal To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Equal To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsEqualTo(IsEqualTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Not Equal To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Not Equal To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsNotEqualTo(IsNotEqualTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsGreaterThan(IsGreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Lower Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Lower Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsLowerThan(IsLowerThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Sequences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Sequences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSequences(ListSequences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Scheduled Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Scheduled Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListScheduledEvents(ListScheduledEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn On Analog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn On Analog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnOnAnalog(TurnOnAnalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Farmbot_modelingSwitch

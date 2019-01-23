/**
 */
package farmbot.modeling.farmbot_modeling.util;

import farmbot.modeling.farmbot_modeling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage
 * @generated
 */
public class Farmbot_modelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Farmbot_modelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmbot_modelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Farmbot_modelingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Farmbot_modelingSwitch<Adapter> modelSwitch = new Farmbot_modelingSwitch<Adapter>() {
		@Override
		public Adapter caseFarmbot(Farmbot object) {
			return createFarmbotAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseSequenceCommand(SequenceCommand object) {
			return createSequenceCommandAdapter();
		}

		@Override
		public Adapter caseMove(Move object) {
			return createMoveAdapter();
		}

		@Override
		public Adapter caseTurnOn(TurnOn object) {
			return createTurnOnAdapter();
		}

		@Override
		public Adapter caseTurnOff(TurnOff object) {
			return createTurnOffAdapter();
		}

		@Override
		public Adapter caseMoveRelative(MoveRelative object) {
			return createMoveRelativeAdapter();
		}

		@Override
		public Adapter caseFindHome(FindHome object) {
			return createFindHomeAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter caseIf(If object) {
			return createIfAdapter();
		}

		@Override
		public Adapter caseMoveAbsolute(MoveAbsolute object) {
			return createMoveAbsoluteAdapter();
		}

		@Override
		public Adapter caseExecuteSequence(ExecuteSequence object) {
			return createExecuteSequenceAdapter();
		}

		@Override
		public Adapter caseWait(Wait object) {
			return createWaitAdapter();
		}

		@Override
		public Adapter caseBooleanExpression(BooleanExpression object) {
			return createBooleanExpressionAdapter();
		}

		@Override
		public Adapter caseIsToolOn(IsToolOn object) {
			return createIsToolOnAdapter();
		}

		@Override
		public Adapter caseSendMessage(SendMessage object) {
			return createSendMessageAdapter();
		}

		@Override
		public Adapter caseRunFarmware(RunFarmware object) {
			return createRunFarmwareAdapter();
		}

		@Override
		public Adapter caseTakePhoto(TakePhoto object) {
			return createTakePhotoAdapter();
		}

		@Override
		public Adapter caseSequenceInstruction(SequenceInstruction object) {
			return createSequenceInstructionAdapter();
		}

		@Override
		public Adapter caseIsEqualTo(IsEqualTo object) {
			return createIsEqualToAdapter();
		}

		@Override
		public Adapter caseIsNotEqualTo(IsNotEqualTo object) {
			return createIsNotEqualToAdapter();
		}

		@Override
		public Adapter caseIsGreaterThan(IsGreaterThan object) {
			return createIsGreaterThanAdapter();
		}

		@Override
		public Adapter caseIsLowerThan(IsLowerThan object) {
			return createIsLowerThanAdapter();
		}

		@Override
		public Adapter caseSchedule(Schedule object) {
			return createScheduleAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseListPeripherals(ListPeripherals object) {
			return createListPeripheralsAdapter();
		}

		@Override
		public Adapter caseListSequences(ListSequences object) {
			return createListSequencesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Farmbot <em>Farmbot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot
	 * @generated
	 */
	public Adapter createFarmbotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.SequenceCommand <em>Sequence Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.SequenceCommand
	 * @generated
	 */
	public Adapter createSequenceCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.TurnOn <em>Turn On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.TurnOn
	 * @generated
	 */
	public Adapter createTurnOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.TurnOff <em>Turn Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.TurnOff
	 * @generated
	 */
	public Adapter createTurnOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.MoveRelative <em>Move Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.MoveRelative
	 * @generated
	 */
	public Adapter createMoveRelativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.FindHome <em>Find Home</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.FindHome
	 * @generated
	 */
	public Adapter createFindHomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.MoveAbsolute <em>Move Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.MoveAbsolute
	 * @generated
	 */
	public Adapter createMoveAbsoluteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.ExecuteSequence <em>Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.ExecuteSequence
	 * @generated
	 */
	public Adapter createExecuteSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.IsToolOn <em>Is Tool On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.IsToolOn
	 * @generated
	 */
	public Adapter createIsToolOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.SendMessage
	 * @generated
	 */
	public Adapter createSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.RunFarmware <em>Run Farmware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.RunFarmware
	 * @generated
	 */
	public Adapter createRunFarmwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.TakePhoto <em>Take Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.TakePhoto
	 * @generated
	 */
	public Adapter createTakePhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.SequenceInstruction <em>Sequence Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.SequenceInstruction
	 * @generated
	 */
	public Adapter createSequenceInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.IsEqualTo <em>Is Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.IsEqualTo
	 * @generated
	 */
	public Adapter createIsEqualToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.IsNotEqualTo <em>Is Not Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.IsNotEqualTo
	 * @generated
	 */
	public Adapter createIsNotEqualToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.IsGreaterThan <em>Is Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.IsGreaterThan
	 * @generated
	 */
	public Adapter createIsGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.IsLowerThan <em>Is Lower Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.IsLowerThan
	 * @generated
	 */
	public Adapter createIsLowerThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Schedule
	 * @generated
	 */
	public Adapter createScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.ListPeripherals <em>List Peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.ListPeripherals
	 * @generated
	 */
	public Adapter createListPeripheralsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farmbot.modeling.farmbot_modeling.ListSequences <em>List Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farmbot.modeling.farmbot_modeling.ListSequences
	 * @generated
	 */
	public Adapter createListSequencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Farmbot_modelingAdapterFactory

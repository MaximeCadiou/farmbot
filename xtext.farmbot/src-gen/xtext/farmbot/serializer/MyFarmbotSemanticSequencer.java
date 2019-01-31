/*
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.serializer;

import com.google.inject.Inject;
import farmbot.modeling.farmbot_modeling.ExecuteSequence;
import farmbot.modeling.farmbot_modeling.Farmbot;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.FindHome;
import farmbot.modeling.farmbot_modeling.If;
import farmbot.modeling.farmbot_modeling.IsEqualTo;
import farmbot.modeling.farmbot_modeling.IsGreaterThan;
import farmbot.modeling.farmbot_modeling.IsLowerThan;
import farmbot.modeling.farmbot_modeling.IsNotEqualTo;
import farmbot.modeling.farmbot_modeling.ListSequences;
import farmbot.modeling.farmbot_modeling.MoveAbsolute;
import farmbot.modeling.farmbot_modeling.MoveRelative;
import farmbot.modeling.farmbot_modeling.RunFarmware;
import farmbot.modeling.farmbot_modeling.Schedule;
import farmbot.modeling.farmbot_modeling.SendMessage;
import farmbot.modeling.farmbot_modeling.Sequence;
import farmbot.modeling.farmbot_modeling.TakePhoto;
import farmbot.modeling.farmbot_modeling.TurnOff;
import farmbot.modeling.farmbot_modeling.TurnOn;
import farmbot.modeling.farmbot_modeling.Wait;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import xtext.farmbot.services.MyFarmbotGrammarAccess;

@SuppressWarnings("all")
public class MyFarmbotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyFarmbotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Farmbot_modelingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Farmbot_modelingPackage.EXECUTE_SEQUENCE:
				sequence_ExecuteSequence(context, (ExecuteSequence) semanticObject); 
				return; 
			case Farmbot_modelingPackage.FARMBOT:
				sequence_Farmbot(context, (Farmbot) semanticObject); 
				return; 
			case Farmbot_modelingPackage.FIND_HOME:
				sequence_FindHome(context, (FindHome) semanticObject); 
				return; 
			case Farmbot_modelingPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case Farmbot_modelingPackage.IS_EQUAL_TO:
				sequence_IsEqualTo(context, (IsEqualTo) semanticObject); 
				return; 
			case Farmbot_modelingPackage.IS_GREATER_THAN:
				sequence_IsGreaterThan(context, (IsGreaterThan) semanticObject); 
				return; 
			case Farmbot_modelingPackage.IS_LOWER_THAN:
				sequence_IsLowerThan(context, (IsLowerThan) semanticObject); 
				return; 
			case Farmbot_modelingPackage.IS_NOT_EQUAL_TO:
				sequence_IsNotEqualTo(context, (IsNotEqualTo) semanticObject); 
				return; 
			case Farmbot_modelingPackage.LIST_SEQUENCES:
				sequence_ListSequences(context, (ListSequences) semanticObject); 
				return; 
			case Farmbot_modelingPackage.MOVE_ABSOLUTE:
				sequence_MoveAbsolute(context, (MoveAbsolute) semanticObject); 
				return; 
			case Farmbot_modelingPackage.MOVE_RELATIVE:
				sequence_MoveRelative(context, (MoveRelative) semanticObject); 
				return; 
			case Farmbot_modelingPackage.RUN_FARMWARE:
				sequence_RunFarmware(context, (RunFarmware) semanticObject); 
				return; 
			case Farmbot_modelingPackage.SCHEDULE:
				sequence_Schedule(context, (Schedule) semanticObject); 
				return; 
			case Farmbot_modelingPackage.SEND_MESSAGE:
				sequence_SendMessage(context, (SendMessage) semanticObject); 
				return; 
			case Farmbot_modelingPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case Farmbot_modelingPackage.TAKE_PHOTO:
				sequence_TakePhoto(context, (TakePhoto) semanticObject); 
				return; 
			case Farmbot_modelingPackage.TURN_OFF:
				sequence_TurnOff(context, (TurnOff) semanticObject); 
				return; 
			case Farmbot_modelingPackage.TURN_ON:
				sequence_TurnOn(context, (TurnOn) semanticObject); 
				return; 
			case Farmbot_modelingPackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instruction returns ExecuteSequence
	 *     SequenceCommand returns ExecuteSequence
	 *     SequenceInstruction returns ExecuteSequence
	 *     ExecuteSequence returns ExecuteSequence
	 *
	 * Constraint:
	 *     id=INT
	 */
	protected void sequence_ExecuteSequence(ISerializationContext context, ExecuteSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.EXECUTE_SEQUENCE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.EXECUTE_SEQUENCE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExecuteSequenceAccess().getIdINTTerminalRuleCall_5_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Farmbot returns Farmbot
	 *
	 * Constraint:
	 *     instructions+=Instruction+
	 */
	protected void sequence_Farmbot(ISerializationContext context, Farmbot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns FindHome
	 *     SequenceCommand returns FindHome
	 *     SequenceInstruction returns FindHome
	 *     FindHome returns FindHome
	 *
	 * Constraint:
	 *     (findX=EBoolean findY=EBoolean findZ=EBoolean)
	 */
	protected void sequence_FindHome(ISerializationContext context, FindHome semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_X));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_Y));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.FIND_HOME__FIND_Z));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFindHomeAccess().getFindXEBooleanParserRuleCall_4_0(), semanticObject.isFindX());
		feeder.accept(grammarAccess.getFindHomeAccess().getFindYEBooleanParserRuleCall_8_0(), semanticObject.isFindY());
		feeder.accept(grammarAccess.getFindHomeAccess().getFindZEBooleanParserRuleCall_12_0(), semanticObject.isFindZ());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns If
	 *     SequenceInstruction returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (booleanExpression=BooleanExpression then=ExecuteSequence? else=ExecuteSequence?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanExpression returns IsEqualTo
	 *     IsEqualTo returns IsEqualTo
	 *
	 * Constraint:
	 *     ((axe=STRING | pinNumber=INT) value=INT)
	 */
	protected void sequence_IsEqualTo(ISerializationContext context, IsEqualTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanExpression returns IsGreaterThan
	 *     IsGreaterThan returns IsGreaterThan
	 *
	 * Constraint:
	 *     ((axe=STRING | pinNumber=INT) value=INT)
	 */
	protected void sequence_IsGreaterThan(ISerializationContext context, IsGreaterThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanExpression returns IsLowerThan
	 *     IsLowerThan returns IsLowerThan
	 *
	 * Constraint:
	 *     ((axe=STRING | pinNumber=INT) value=INT)
	 */
	protected void sequence_IsLowerThan(ISerializationContext context, IsLowerThan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanExpression returns IsNotEqualTo
	 *     IsNotEqualTo returns IsNotEqualTo
	 *
	 * Constraint:
	 *     ((axe=STRING | pinNumber=INT) value=INT)
	 */
	protected void sequence_IsNotEqualTo(ISerializationContext context, IsNotEqualTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns ListSequences
	 *     Command returns ListSequences
	 *     ListSequences returns ListSequences
	 *
	 * Constraint:
	 *     {ListSequences}
	 */
	protected void sequence_ListSequences(ISerializationContext context, ListSequences semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns MoveAbsolute
	 *     SequenceCommand returns MoveAbsolute
	 *     SequenceInstruction returns MoveAbsolute
	 *     MoveAbsolute returns MoveAbsolute
	 *
	 * Constraint:
	 *     (x=INT y=INT z=INT speed=INT)
	 */
	protected void sequence_MoveAbsolute(ISerializationContext context, MoveAbsolute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__X));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Y));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Z));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__SPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAbsoluteAccess().getXINTTerminalRuleCall_4_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getMoveAbsoluteAccess().getYINTTerminalRuleCall_8_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getMoveAbsoluteAccess().getZINTTerminalRuleCall_12_0(), semanticObject.getZ());
		feeder.accept(grammarAccess.getMoveAbsoluteAccess().getSpeedINTTerminalRuleCall_16_0(), semanticObject.getSpeed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns MoveRelative
	 *     SequenceCommand returns MoveRelative
	 *     SequenceInstruction returns MoveRelative
	 *     MoveRelative returns MoveRelative
	 *
	 * Constraint:
	 *     (x=INT y=INT z=INT speed=INT)
	 */
	protected void sequence_MoveRelative(ISerializationContext context, MoveRelative semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__X));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Y));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__Z));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.MOVE__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.MOVE__SPEED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveRelativeAccess().getXINTTerminalRuleCall_4_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getMoveRelativeAccess().getYINTTerminalRuleCall_8_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getMoveRelativeAccess().getZINTTerminalRuleCall_12_0(), semanticObject.getZ());
		feeder.accept(grammarAccess.getMoveRelativeAccess().getSpeedINTTerminalRuleCall_16_0(), semanticObject.getSpeed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns RunFarmware
	 *     SequenceCommand returns RunFarmware
	 *     SequenceInstruction returns RunFarmware
	 *     RunFarmware returns RunFarmware
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_RunFarmware(ISerializationContext context, RunFarmware semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.RUN_FARMWARE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.RUN_FARMWARE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRunFarmwareAccess().getNameSTRINGTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Schedule
	 *     Command returns Schedule
	 *     Schedule returns Schedule
	 *
	 * Constraint:
	 *     (
	 *         sequence=STRING 
	 *         startDate=STRING 
	 *         startTime=STRING 
	 *         repeat=EBoolean 
	 *         repeatFrequency=INT 
	 *         repeatUnit=STRING 
	 *         endDate=STRING 
	 *         endTime=STRING
	 *     )
	 */
	protected void sequence_Schedule(ISerializationContext context, Schedule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__SEQUENCE));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__START_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__START_DATE));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__START_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__START_TIME));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT_FREQUENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT_FREQUENCY));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__REPEAT_UNIT));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__END_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__END_DATE));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__END_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SCHEDULE__END_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScheduleAccess().getSequenceSTRINGTerminalRuleCall_5_0(), semanticObject.getSequence());
		feeder.accept(grammarAccess.getScheduleAccess().getStartDateSTRINGTerminalRuleCall_9_0(), semanticObject.getStartDate());
		feeder.accept(grammarAccess.getScheduleAccess().getStartTimeSTRINGTerminalRuleCall_13_0(), semanticObject.getStartTime());
		feeder.accept(grammarAccess.getScheduleAccess().getRepeatEBooleanParserRuleCall_17_0(), semanticObject.isRepeat());
		feeder.accept(grammarAccess.getScheduleAccess().getRepeatFrequencyINTTerminalRuleCall_21_0(), semanticObject.getRepeatFrequency());
		feeder.accept(grammarAccess.getScheduleAccess().getRepeatUnitSTRINGTerminalRuleCall_25_0(), semanticObject.getRepeatUnit());
		feeder.accept(grammarAccess.getScheduleAccess().getEndDateSTRINGTerminalRuleCall_29_0(), semanticObject.getEndDate());
		feeder.accept(grammarAccess.getScheduleAccess().getEndTimeSTRINGTerminalRuleCall_33_0(), semanticObject.getEndTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns SendMessage
	 *     SequenceCommand returns SendMessage
	 *     SequenceInstruction returns SendMessage
	 *     SendMessage returns SendMessage
	 *
	 * Constraint:
	 *     (messageType=STRING message=STRING)
	 */
	protected void sequence_SendMessage(ISerializationContext context, SendMessage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SEND_MESSAGE__MESSAGE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SEND_MESSAGE__MESSAGE_TYPE));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.SEND_MESSAGE__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.SEND_MESSAGE__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSendMessageAccess().getMessageTypeSTRINGTerminalRuleCall_5_0(), semanticObject.getMessageType());
		feeder.accept(grammarAccess.getSendMessageAccess().getMessageSTRINGTerminalRuleCall_9_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Sequence
	 *     Sequence returns Sequence
	 *
	 * Constraint:
	 *     (name=STRING sequenceInstructions+=SequenceInstruction*)
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns TakePhoto
	 *     SequenceCommand returns TakePhoto
	 *     SequenceInstruction returns TakePhoto
	 *     TakePhoto returns TakePhoto
	 *
	 * Constraint:
	 *     {TakePhoto}
	 */
	protected void sequence_TakePhoto(ISerializationContext context, TakePhoto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns TurnOff
	 *     SequenceCommand returns TurnOff
	 *     SequenceInstruction returns TurnOff
	 *     TurnOff returns TurnOff
	 *
	 * Constraint:
	 *     (pin=INT mode=STRING)
	 */
	protected void sequence_TurnOff(ISerializationContext context, TurnOff semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.TURN_OFF__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.TURN_OFF__PIN));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.TURN_OFF__MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.TURN_OFF__MODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnOffAccess().getPinINTTerminalRuleCall_4_0(), semanticObject.getPin());
		feeder.accept(grammarAccess.getTurnOffAccess().getModeSTRINGTerminalRuleCall_8_0(), semanticObject.getMode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns TurnOn
	 *     SequenceCommand returns TurnOn
	 *     SequenceInstruction returns TurnOn
	 *     TurnOn returns TurnOn
	 *
	 * Constraint:
	 *     (pin=INT mode=STRING)
	 */
	protected void sequence_TurnOn(ISerializationContext context, TurnOn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.TURN_ON__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.TURN_ON__PIN));
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.TURN_ON__MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.TURN_ON__MODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTurnOnAccess().getPinINTTerminalRuleCall_4_0(), semanticObject.getPin());
		feeder.accept(grammarAccess.getTurnOnAccess().getModeSTRINGTerminalRuleCall_8_0(), semanticObject.getMode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Wait
	 *     SequenceCommand returns Wait
	 *     SequenceInstruction returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     duration=EDouble
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Farmbot_modelingPackage.Literals.WAIT__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Farmbot_modelingPackage.Literals.WAIT__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaitAccess().getDurationEDoubleParserRuleCall_5_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
}

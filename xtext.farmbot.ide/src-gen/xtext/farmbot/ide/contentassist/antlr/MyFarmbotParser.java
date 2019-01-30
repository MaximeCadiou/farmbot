/*
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.farmbot.ide.contentassist.antlr.internal.InternalMyFarmbotParser;
import xtext.farmbot.services.MyFarmbotGrammarAccess;

public class MyFarmbotParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyFarmbotGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyFarmbotGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getSequenceCommandAccess().getAlternatives(), "rule__SequenceCommand__Alternatives");
			builder.put(grammarAccess.getSequenceInstructionAccess().getAlternatives(), "rule__SequenceInstruction__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getFarmbotAccess().getGroup(), "rule__Farmbot__Group__0");
			builder.put(grammarAccess.getTurnOnAccess().getGroup(), "rule__TurnOn__Group__0");
			builder.put(grammarAccess.getTurnOffAccess().getGroup(), "rule__TurnOff__Group__0");
			builder.put(grammarAccess.getMoveRelativeAccess().getGroup(), "rule__MoveRelative__Group__0");
			builder.put(grammarAccess.getFindHomeAccess().getGroup(), "rule__FindHome__Group__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_5(), "rule__If__Group_5__0");
			builder.put(grammarAccess.getMoveAbsoluteAccess().getGroup(), "rule__MoveAbsolute__Group__0");
			builder.put(grammarAccess.getExecuteSequenceAccess().getGroup(), "rule__ExecuteSequence__Group__0");
			builder.put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
			builder.put(grammarAccess.getIsToolOnAccess().getGroup(), "rule__IsToolOn__Group__0");
			builder.put(grammarAccess.getSendMessageAccess().getGroup(), "rule__SendMessage__Group__0");
			builder.put(grammarAccess.getRunFarmwareAccess().getGroup(), "rule__RunFarmware__Group__0");
			builder.put(grammarAccess.getTakePhotoAccess().getGroup(), "rule__TakePhoto__Group__0");
			builder.put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
			builder.put(grammarAccess.getListPeripheralsAccess().getGroup(), "rule__ListPeripherals__Group__0");
			builder.put(grammarAccess.getListSequencesAccess().getGroup(), "rule__ListSequences__Group__0");
			builder.put(grammarAccess.getIsEqualToAccess().getGroup(), "rule__IsEqualTo__Group__0");
			builder.put(grammarAccess.getIsNotEqualToAccess().getGroup(), "rule__IsNotEqualTo__Group__0");
			builder.put(grammarAccess.getIsGreaterThanAccess().getGroup(), "rule__IsGreaterThan__Group__0");
			builder.put(grammarAccess.getIsLowerThanAccess().getGroup(), "rule__IsLowerThan__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getFarmbotAccess().getInstructionsAssignment_1(), "rule__Farmbot__InstructionsAssignment_1");
			builder.put(grammarAccess.getTurnOnAccess().getPinAssignment_4(), "rule__TurnOn__PinAssignment_4");
			builder.put(grammarAccess.getTurnOnAccess().getModeAssignment_8(), "rule__TurnOn__ModeAssignment_8");
			builder.put(grammarAccess.getTurnOffAccess().getPinAssignment_4(), "rule__TurnOff__PinAssignment_4");
			builder.put(grammarAccess.getTurnOffAccess().getModeAssignment_8(), "rule__TurnOff__ModeAssignment_8");
			builder.put(grammarAccess.getMoveRelativeAccess().getXAssignment_4(), "rule__MoveRelative__XAssignment_4");
			builder.put(grammarAccess.getMoveRelativeAccess().getYAssignment_8(), "rule__MoveRelative__YAssignment_8");
			builder.put(grammarAccess.getMoveRelativeAccess().getZAssignment_12(), "rule__MoveRelative__ZAssignment_12");
			builder.put(grammarAccess.getMoveRelativeAccess().getSpeedAssignment_16(), "rule__MoveRelative__SpeedAssignment_16");
			builder.put(grammarAccess.getFindHomeAccess().getFindXAssignment_4(), "rule__FindHome__FindXAssignment_4");
			builder.put(grammarAccess.getFindHomeAccess().getFindYAssignment_8(), "rule__FindHome__FindYAssignment_8");
			builder.put(grammarAccess.getFindHomeAccess().getFindZAssignment_12(), "rule__FindHome__FindZAssignment_12");
			builder.put(grammarAccess.getSequenceAccess().getNameAssignment_2(), "rule__Sequence__NameAssignment_2");
			builder.put(grammarAccess.getSequenceAccess().getSequenceInstructionsAssignment_3(), "rule__Sequence__SequenceInstructionsAssignment_3");
			builder.put(grammarAccess.getIfAccess().getBooleanExpressionAssignment_2(), "rule__If__BooleanExpressionAssignment_2");
			builder.put(grammarAccess.getIfAccess().getThenAssignment_4(), "rule__If__ThenAssignment_4");
			builder.put(grammarAccess.getIfAccess().getElseAssignment_5_1(), "rule__If__ElseAssignment_5_1");
			builder.put(grammarAccess.getMoveAbsoluteAccess().getXAssignment_4(), "rule__MoveAbsolute__XAssignment_4");
			builder.put(grammarAccess.getMoveAbsoluteAccess().getYAssignment_8(), "rule__MoveAbsolute__YAssignment_8");
			builder.put(grammarAccess.getMoveAbsoluteAccess().getZAssignment_12(), "rule__MoveAbsolute__ZAssignment_12");
			builder.put(grammarAccess.getMoveAbsoluteAccess().getSpeedAssignment_16(), "rule__MoveAbsolute__SpeedAssignment_16");
			builder.put(grammarAccess.getExecuteSequenceAccess().getIdAssignment_5(), "rule__ExecuteSequence__IdAssignment_5");
			builder.put(grammarAccess.getWaitAccess().getDurationAssignment_5(), "rule__Wait__DurationAssignment_5");
			builder.put(grammarAccess.getIsToolOnAccess().getPinAssignment_5(), "rule__IsToolOn__PinAssignment_5");
			builder.put(grammarAccess.getSendMessageAccess().getMessageTypeAssignment_5(), "rule__SendMessage__MessageTypeAssignment_5");
			builder.put(grammarAccess.getSendMessageAccess().getMessageAssignment_9(), "rule__SendMessage__MessageAssignment_9");
			builder.put(grammarAccess.getRunFarmwareAccess().getNameAssignment_5(), "rule__RunFarmware__NameAssignment_5");
			builder.put(grammarAccess.getScheduleAccess().getSequenceAssignment_5(), "rule__Schedule__SequenceAssignment_5");
			builder.put(grammarAccess.getScheduleAccess().getStartDateAssignment_9(), "rule__Schedule__StartDateAssignment_9");
			builder.put(grammarAccess.getScheduleAccess().getStartTimeAssignment_13(), "rule__Schedule__StartTimeAssignment_13");
			builder.put(grammarAccess.getScheduleAccess().getRepeatAssignment_17(), "rule__Schedule__RepeatAssignment_17");
			builder.put(grammarAccess.getScheduleAccess().getRepeatFrequencyAssignment_21(), "rule__Schedule__RepeatFrequencyAssignment_21");
			builder.put(grammarAccess.getScheduleAccess().getRepeatUnitAssignment_25(), "rule__Schedule__RepeatUnitAssignment_25");
			builder.put(grammarAccess.getScheduleAccess().getEndDateAssignment_29(), "rule__Schedule__EndDateAssignment_29");
			builder.put(grammarAccess.getScheduleAccess().getEndTimeAssignment_33(), "rule__Schedule__EndTimeAssignment_33");
			builder.put(grammarAccess.getIsEqualToAccess().getAxeAssignment_1(), "rule__IsEqualTo__AxeAssignment_1");
			builder.put(grammarAccess.getIsEqualToAccess().getValueAssignment_4(), "rule__IsEqualTo__ValueAssignment_4");
			builder.put(grammarAccess.getIsNotEqualToAccess().getAxeAssignment_1(), "rule__IsNotEqualTo__AxeAssignment_1");
			builder.put(grammarAccess.getIsNotEqualToAccess().getValueAssignment_5(), "rule__IsNotEqualTo__ValueAssignment_5");
			builder.put(grammarAccess.getIsGreaterThanAccess().getAxeAssignment_1(), "rule__IsGreaterThan__AxeAssignment_1");
			builder.put(grammarAccess.getIsGreaterThanAccess().getValueAssignment_4(), "rule__IsGreaterThan__ValueAssignment_4");
			builder.put(grammarAccess.getIsLowerThanAccess().getAxeAssignment_1(), "rule__IsLowerThan__AxeAssignment_1");
			builder.put(grammarAccess.getIsLowerThanAccess().getValueAssignment_4(), "rule__IsLowerThan__ValueAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyFarmbotGrammarAccess grammarAccess;

	@Override
	protected InternalMyFarmbotParser createParser() {
		InternalMyFarmbotParser result = new InternalMyFarmbotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyFarmbotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyFarmbotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

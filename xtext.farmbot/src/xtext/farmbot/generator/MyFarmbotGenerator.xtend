/*
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import farmbot.modeling.farmbot_modeling.Farmbot
import farmbot.modeling.farmbot_modeling.Instruction
import farmbot.modeling.farmbot_modeling.Command
import farmbot.modeling.farmbot_modeling.SequenceCommand
import farmbot.modeling.farmbot_modeling.SequenceInstruction
import farmbot.modeling.farmbot_modeling.BooleanExpression
import farmbot.modeling.farmbot_modeling.TurnOn
import farmbot.modeling.farmbot_modeling.TurnOff
import farmbot.modeling.farmbot_modeling.MoveRelative
import farmbot.modeling.farmbot_modeling.MoveAbsolute
import farmbot.modeling.farmbot_modeling.FindHome
import farmbot.modeling.farmbot_modeling.Sequence
import farmbot.modeling.farmbot_modeling.If
import farmbot.modeling.farmbot_modeling.ExecuteSequence
import farmbot.modeling.farmbot_modeling.Wait
import farmbot.modeling.farmbot_modeling.IsToolOn
import farmbot.modeling.farmbot_modeling.SendMessage
import farmbot.modeling.farmbot_modeling.RunFarmware
import farmbot.modeling.farmbot_modeling.TakePhoto
import farmbot.modeling.farmbot_modeling.Schedule
import farmbot.modeling.farmbot_modeling.ListPeripherals
import farmbot.modeling.farmbot_modeling.ListSequences
import farmbot.modeling.farmbot_modeling.IsEqualTo
import farmbot.modeling.farmbot_modeling.IsGreaterThan
import farmbot.modeling.farmbot_modeling.IsNotEqualTo
import farmbot.modeling.farmbot_modeling.IsLowerThan

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyFarmbotGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def dispatch compile(Farmbot farmbot) ''' 
	    package «farmbot»;
	        
	    public class «Farmbot»{
	    	«FOR inst:farmbot.instructions»
	            «inst.compile»
	        «ENDFOR»
	    }
	'''
	
	def dispatch compile(Instruction instruction) '''this expression is not supported: '''

	def dispatch compile(Command command) '''this expression is not supported: '''

	def dispatch compile(SequenceCommand sequenceCommad) '''this expression is not supported: '''

	def dispatch compile(SequenceInstruction sequenceInstruction) '''this expression is not supported: '''

	def dispatch compile(BooleanExpression booleanExpression) '''«booleanExpression.result»'''

	def dispatch compile(TurnOn turnon) '''this expression is not supported: '''

	def dispatch compile(TurnOff turnoff) '''this expression is not supported: '''

	def dispatch compile(MoveRelative moveRelative) '''this expression is not supported: '''

	def dispatch compile(MoveAbsolute moveAbsolute) '''this expression is not supported: '''
	
	def dispatch compile(FindHome findHome) '''this expression is not supported: '''
	
	def dispatch compile(Sequence sequence) '''this expression is not supported: '''

	def dispatch compile(If ifExpression) '''
		if («ifExpression.booleanExpression.compile») {
			«ifExpression.then.compile»
		} «IF ifExpression.getElse() !== null» else {
			«ifExpression.getElse().compile»
		«ENDIF»
		}
	'''

	def dispatch compile(ExecuteSequence executeSequence) '''this expression is not supported: '''

	def dispatch compile(Wait wait) '''this expression is not supported: '''

	def dispatch compile(IsToolOn isToolOn) '''this expression is not supported: '''

	def dispatch compile(SendMessage sendMessage) '''this expression is not supported: '''

	def dispatch compile(RunFarmware runFarmware) '''this expression is not supported: '''

	def dispatch compile(TakePhoto takePhoto) '''this expression is not supported: '''

	def dispatch compile(Schedule schedule) '''this expression is not supported: '''

	def dispatch compile(ListPeripherals listPeripherals) '''this expression is not supported: '''

	def dispatch compile(ListSequences listSequences) '''this expression is not supported: '''
	
	def dispatch compile(IsEqualTo isEqualTo){
		var x = 2;
		
		'''«x» == «isEqualTo.value»'''	
	}

	def dispatch compile(IsNotEqualTo isNotEqualTo){
		var x = 2;
		
		'''«x» != «isNotEqualTo.value»'''	
	}
	
	def dispatch compile(IsGreaterThan isGreaterThan){
		var x = 2;
		
		'''«x» > «isGreaterThan.value»'''	
	}

	def dispatch compile(IsLowerThan isLowerThan){
		var x = 2;
		
		'''«x» < «isLowerThan.value»'''	
	}


}

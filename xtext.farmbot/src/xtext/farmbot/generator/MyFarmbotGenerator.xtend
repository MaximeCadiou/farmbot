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
import farmbot.modeling.farmbot_modeling.Move

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyFarmbotGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('farmbot/Farmbot.java',
			resource.allContents
				.filter(Farmbot)
				.head
				.compile)
	}
	
	def dispatch compile(Farmbot farmbot) ''' 
	    package farmbot;
	    
	    import java.io.IOException;
	    import java.net.HttpURLConnection;
	    import java.net.MalformedURLException;
	    import java.net.URL;
	    import org.json.JSONObject;
	    import org.json.JSONArray;
	    import org.json.JSONException;
	    
	    public class Farmbot {
		    static final String TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJ1bmtub3duIiwic3ViIjo0NDAwLCJpYXQiOjE1NDgxNTMzMjcsImp0aSI6IjQ3NzBlZWQ3LWVmMzMtNDM4NC1iNmJlLWVmY2IzNzg4Y2UzMCIsImlzcyI6Ii8vbXkuZmFybWJvdC5pbzo0NDMiLCJleHAiOjE1NTE2MDkzMjcsIm1xdHQiOiJicmlzay1iZWFyLnJtcS5jbG91ZGFtcXAuY29tIiwiYm90IjoiZGV2aWNlXzQzOTUiLCJ2aG9zdCI6InZiemN4c3FyIiwibXF0dF93cyI6IndzczovL2JyaXNrLWJlYXIucm1xLmNsb3VkYW1xcC5jb206NDQzL3dzL21xdHQiLCJvc191cGRhdGVfc2VydmVyIjoiaHR0cHM6Ly9hcGkuZ2l0aHViLmNvbS9yZXBvcy9mYXJtYm90L2Zhcm1ib3Rfb3MvcmVsZWFzZXMvbGF0ZXN0IiwiZndfdXBkYXRlX3NlcnZlciI6IkRFUFJFQ0FURUQiLCJpbnRlcmltX2VtYWlsIjoiam9yZGhhbi5tYWRlY0BnbWFpbC5jb20iLCJiZXRhX29zX3VwZGF0ZV9zZXJ2ZXIiOiJodHRwczovL2FwaS5naXRodWIuY29tL3JlcG9zL0Zhcm1Cb3QvZmFybWJvdF9vcy9yZWxlYXNlcy8xNDU4MTg3MSJ9.WDBwreST76bU3MCybjV6WNY4EuZfcPuUzPcrNpZzpE448HmHwDjNrMTXJARostEVrafdVttlErA2B4AVJkuF9WFMCwJCu1wza6HyeucG8TBQLIrOQmunkIbXxzUKdXdb4A9egYlI24gupJha2CejpfhMj3ZWJiQsQ7gMK4vn5sAnETXimnumwtj8writ5uDsA5a74Gqur_kkRZEj_5YrsnCY9ggzWdkAvqizzdvjrI1fN3_LTFT_XrEYUbohECLCHZ-Qy3ibHQm6eMPFEv_4MVYHGg-yyYDBsc-M4itMLuIH_h7_hYbBuW_nQui7EdRR96v0cO0WBrOvswxczAQHiQ";
		    static final String API_URL = "https://my.farm.bot/api";
	     
	    	public static void main(String[] args) throws JSONException {
		    	«FOR instruction:farmbot.instructions»
		            «instruction.compile»
	    	    «ENDFOR»
	    	}
	    }
	'''
	
	def dispatch compile(Instruction instruction) '''this expression is not supported: '''

	def dispatch compile(Command command) '''this expression is not supported: '''

	def dispatch compile(SequenceCommand sequenceCommad) '''this expression is not supported: '''

	def dispatch compile(SequenceInstruction sequenceInstruction) '''this expression is not supported: '''

	def dispatch compile(BooleanExpression booleanExpression) '''«booleanExpression.result»'''

	def dispatch compile(TurnOn turnon) '''
		"I turned «turnon.pin» on with mode «turnon.mode»";
	'''

	def dispatch compile(TurnOff turnoff) '''
		"I turned «turnoff.pin» off with mode «turnoff.mode»";
	'''

	def dispatch compile(Move move) '''this expression is not supported: '''

	def dispatch compile(MoveRelative move) '''
		"I moved relatively with coordinates («move.x», «move.y», «move.z») at speed «move.speed»";
	'''

	def dispatch compile(MoveAbsolute move) '''
		"I moved absolutely with coordinates («move.x», «move.y», «move.z») at speed «move.speed»";
	'''
	
	def dispatch compile(FindHome findHome)'''
		«IF findHome.findX»
			System.out.println("I found home x coordinate: 0");
		«ENDIF»
		«IF findHome.findY»
			System.out.println("I found home y coordinate: 0");
		«ENDIF»
		«IF findHome.findZ»
			System.out.println("I found home z coordinate: 0");
		«ENDIF»
	'''
	
	def dispatch compile(Sequence sequence) '''
	    String body = new JSONObject()
        .put("name", "«sequence.name»")
        .put("body", new JSONArray() 
    
		«FOR instruction:sequence.sequenceInstructions»
			.put(«instruction.compile»)
        «ENDFOR»
    
    	).toString();    
    	
        System.out.println(body);
        
        URL url;
        HttpURLConnection con;
        try {
			url = new URL(API_URL + "/sequences");
			con = (HttpURLConnection) url.openConnection();
	        con.setRequestMethod("POST");
	        
	        con.setRequestProperty("Content-Type", "application/json");
	        con.setRequestProperty("Authorization", TOKEN);
	        
	        con.setDoOutput(true);
	        con.getOutputStream().write(body.getBytes());
	        con.getOutputStream().flush();
	        con.getOutputStream().close();
	        
            System.out.println(con.getResponseMessage());
	    } catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	'''

	def dispatch compile(If ifExpression) '''
		if («ifExpression.booleanExpression.compile») {
			«ifExpression.then.compile»
		} «IF ifExpression.getElse() !== null» else {
			«ifExpression.getElse().compile»
		«ENDIF»
		}
	'''

	def dispatch compile(ExecuteSequence executeSequence) '''
		System.out.println("I executed sequence «executeSequence.id»");
	'''

	def dispatch compile(Wait wait) '''
		new JSONObject()
			.put("kind", "wait")
			.put("args", new JSONObject()
				.put("milliseconds", «wait.duration»)
			)
	'''

	def dispatch compile(IsToolOn isToolOn) '''true'''

	def dispatch compile(SendMessage sendMessage) '''
		System.out.println("I sent the following message «sendMessage.message»");
	'''

	def dispatch compile(RunFarmware runFarmware) '''
		System.out.println("I ran the farmware «runFarmware.name»");
	'''

	def dispatch compile(TakePhoto takePhoto) '''
		System.out.println("I took a photo");
	'''
	
	def dispatch compile(Schedule schedule) '''
		System.out.println("I scheduled the sequence «schedule.sequence» on «schedule.startDate» at «schedule.startTime»");
		«IF schedule.repeat»
			System.out.println("It will repeat every «schedule.repeatFrequency» «schedule.repeatUnit» until «schedule.endDate» at «schedule.endTime»");
		«ENDIF»
	'''

	def dispatch compile(ListPeripherals listPeripherals) '''
		System.out.println("Here is a list of the peripherals");
	'''

	def dispatch compile(ListSequences listSequences) '''
		System.out.println("Here is a list of the sequences");
	 '''
	
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

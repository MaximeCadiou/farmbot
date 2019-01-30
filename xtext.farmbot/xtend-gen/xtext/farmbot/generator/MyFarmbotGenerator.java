/**
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.generator;

import com.google.common.collect.Iterators;
import farmbot.modeling.farmbot_modeling.BooleanExpression;
import farmbot.modeling.farmbot_modeling.Command;
import farmbot.modeling.farmbot_modeling.ExecuteSequence;
import farmbot.modeling.farmbot_modeling.Farmbot;
import farmbot.modeling.farmbot_modeling.FindHome;
import farmbot.modeling.farmbot_modeling.If;
import farmbot.modeling.farmbot_modeling.Instruction;
import farmbot.modeling.farmbot_modeling.IsEqualTo;
import farmbot.modeling.farmbot_modeling.IsGreaterThan;
import farmbot.modeling.farmbot_modeling.IsLowerThan;
import farmbot.modeling.farmbot_modeling.IsNotEqualTo;
import farmbot.modeling.farmbot_modeling.IsToolOn;
import farmbot.modeling.farmbot_modeling.ListPeripherals;
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
import farmbot.modeling.farmbot_modeling.TurnOn;
import farmbot.modeling.farmbot_modeling.Wait;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyFarmbotGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("farmbot/Farmbot.java", 
      this.compile(IteratorExtensions.<Farmbot>head(Iterators.<Farmbot>filter(resource.getAllContents(), Farmbot.class))));
  }
  
  protected CharSequence _compile(final Farmbot farmbot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package farmbot;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import java.net.HttpURLConnection;");
    _builder.newLine();
    _builder.append("import java.net.MalformedURLException;");
    _builder.newLine();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.append("import org.json.JSONObject;");
    _builder.newLine();
    _builder.append("import org.json.JSONArray;");
    _builder.newLine();
    _builder.append("import org.json.JSONException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Farmbot {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("static final String TOKEN = \"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJ1bmtub3duIiwic3ViIjo0NDAwLCJpYXQiOjE1NDgxNTMzMjcsImp0aSI6IjQ3NzBlZWQ3LWVmMzMtNDM4NC1iNmJlLWVmY2IzNzg4Y2UzMCIsImlzcyI6Ii8vbXkuZmFybWJvdC5pbzo0NDMiLCJleHAiOjE1NTE2MDkzMjcsIm1xdHQiOiJicmlzay1iZWFyLnJtcS5jbG91ZGFtcXAuY29tIiwiYm90IjoiZGV2aWNlXzQzOTUiLCJ2aG9zdCI6InZiemN4c3FyIiwibXF0dF93cyI6IndzczovL2JyaXNrLWJlYXIucm1xLmNsb3VkYW1xcC5jb206NDQzL3dzL21xdHQiLCJvc191cGRhdGVfc2VydmVyIjoiaHR0cHM6Ly9hcGkuZ2l0aHViLmNvbS9yZXBvcy9mYXJtYm90L2Zhcm1ib3Rfb3MvcmVsZWFzZXMvbGF0ZXN0IiwiZndfdXBkYXRlX3NlcnZlciI6IkRFUFJFQ0FURUQiLCJpbnRlcmltX2VtYWlsIjoiam9yZGhhbi5tYWRlY0BnbWFpbC5jb20iLCJiZXRhX29zX3VwZGF0ZV9zZXJ2ZXIiOiJodHRwczovL2FwaS5naXRodWIuY29tL3JlcG9zL0Zhcm1Cb3QvZmFybWJvdF9vcy9yZWxlYXNlcy8xNDU4MTg3MSJ9.WDBwreST76bU3MCybjV6WNY4EuZfcPuUzPcrNpZzpE448HmHwDjNrMTXJARostEVrafdVttlErA2B4AVJkuF9WFMCwJCu1wza6HyeucG8TBQLIrOQmunkIbXxzUKdXdb4A9egYlI24gupJha2CejpfhMj3ZWJiQsQ7gMK4vn5sAnETXimnumwtj8writ5uDsA5a74Gqur_kkRZEj_5YrsnCY9ggzWdkAvqizzdvjrI1fN3_LTFT_XrEYUbohECLCHZ-Qy3ibHQm6eMPFEv_4MVYHGg-yyYDBsc-M4itMLuIH_h7_hYbBuW_nQui7EdRR96v0cO0WBrOvswxczAQHiQ\";");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("static final String API_URL = \"https://my.farm.bot/api\";");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) throws JSONException {");
    _builder.newLine();
    {
      EList<Instruction> _instructions = farmbot.getInstructions();
      for(final Instruction instruction : _instructions) {
        Object _compile = this.compile(instruction);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Instruction instruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final Command command) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final SequenceCommand sequenceCommad) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final SequenceInstruction sequenceInstruction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final BooleanExpression booleanExpression) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isResult = booleanExpression.isResult();
    _builder.append(_isResult);
    return _builder;
  }
  
  protected CharSequence _compile(final TurnOn turnon) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"write_pin\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"pin_mode\", ");
    String _mode = turnon.getMode();
    _builder.append(_mode, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"pin_value\", 1)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"pin_number\", ");
    int _pin = turnon.getPin();
    _builder.append(_pin, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final TurnOff turnoff) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"kind\", \"write_pin\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"pin_mode\", ");
    String _mode = turnoff.getMode();
    _builder.append(_mode, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"pin_value\", 1)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"pin_number\", ");
    int _pin = turnoff.getPin();
    _builder.append(_pin, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Move move) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final MoveRelative move) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"move_relative\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"speed\", ");
    double _speed = move.getSpeed();
    _builder.append(_speed, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"x\", ");
    int _x = move.getX();
    _builder.append(_x, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"y\", ");
    int _y = move.getY();
    _builder.append(_y, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"z\", ");
    int _z = move.getZ();
    _builder.append(_z, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final MoveAbsolute move) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"move_absolute\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"speed\", ");
    double _speed = move.getSpeed();
    _builder.append(_speed, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"offset\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"kind\", \"coordinates\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"x\", ");
    int _x = move.getX();
    _builder.append(_x, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"y\", ");
    int _y = move.getY();
    _builder.append(_y, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"z\", ");
    int _z = move.getZ();
    _builder.append(_z, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"location\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"kind\", \"coordinates\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"x\", ");
    int _x_1 = move.getX();
    _builder.append(_x_1, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"y\", ");
    int _y_1 = move.getY();
    _builder.append(_y_1, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"z\", ");
    int _z_1 = move.getZ();
    _builder.append(_z_1, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final FindHome findHome) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"find_home\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"speed\", 100)");
    _builder.newLine();
    {
      boolean _isFindX = findHome.isFindX();
      if (_isFindX) {
        _builder.append("\t\t");
        _builder.append(".put(\"axis\": \"x\")");
        _builder.newLine();
      } else {
        boolean _isFindY = findHome.isFindY();
        if (_isFindY) {
          _builder.append("\t\t");
          _builder.append(".put(\"axis\": \"y\")");
          _builder.newLine();
        } else {
          boolean _isFindZ = findHome.isFindZ();
          if (_isFindZ) {
            _builder.append("\t\t");
            _builder.append(".put(\"axis\": \"z\")");
            _builder.newLine();
          } else {
            _builder.append("\t\t");
            _builder.append(".put(\"axis\": \"all\")");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Sequence sequence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t    ");
    _builder.append("String body = new JSONObject()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(".put(\"name\", \"");
    String _name = sequence.getName();
    _builder.append(_name, "        ");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append(".put(\"body\", new JSONArray() ");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<SequenceInstruction> _sequenceInstructions = sequence.getSequenceInstructions();
      for(final SequenceInstruction instruction : _sequenceInstructions) {
        _builder.append(".put(");
        Object _compile = this.compile(instruction);
        _builder.append(_compile);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append(").toString();    ");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(body);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("URL url;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("HttpURLConnection con;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("url = new URL(API_URL + \"/sequences\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("con = (HttpURLConnection) url.openConnection();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.setRequestMethod(\"POST\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.setRequestProperty(\"Content-Type\", \"application/json\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.setRequestProperty(\"Authorization\", TOKEN);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.setDoOutput(true);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.getOutputStream().write(body.getBytes());");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.getOutputStream().flush();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("con.getOutputStream().close();");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.out.println(con.getResponseMessage());");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("} catch (MalformedURLException e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final If ifExpression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    Object _compile = this.compile(ifExpression.getBooleanExpression());
    _builder.append(_compile);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _compile_1 = this.compile(ifExpression.getThen());
    _builder.append(_compile_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("} ");
    {
      ExecuteSequence _else = ifExpression.getElse();
      boolean _tripleNotEquals = (_else != null);
      if (_tripleNotEquals) {
        _builder.append(" else {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _compile_2 = this.compile(ifExpression.getElse());
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final ExecuteSequence executeSequence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"kind\", \"execute\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".put(\"sequence_id\", ");
    int _id = executeSequence.getId();
    _builder.append(_id, "\t\t\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Wait wait) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"wait\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"milliseconds\", ");
    double _duration = wait.getDuration();
    _builder.append(_duration, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final IsToolOn isToolOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("true");
    return _builder;
  }
  
  protected CharSequence _compile(final SendMessage message) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"send_message\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"message\", ");
    String _message = message.getMessage();
    _builder.append(_message, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".put(\"message_type\", success)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final RunFarmware farmware) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"kind\", \"execute_script\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".put(\"label\", ");
    String _name = farmware.getName();
    _builder.append(_name, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final TakePhoto takePhoto) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"kind\", \"take_photo\")");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".put(\"args\", new JSONObject()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final Schedule schedule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"I scheduled the sequence ");
    String _sequence = schedule.getSequence();
    _builder.append(_sequence);
    _builder.append(" on ");
    String _startDate = schedule.getStartDate();
    _builder.append(_startDate);
    _builder.append(" at ");
    String _startTime = schedule.getStartTime();
    _builder.append(_startTime);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      boolean _isRepeat = schedule.isRepeat();
      if (_isRepeat) {
        _builder.append("System.out.println(\"It will repeat every ");
        int _repeatFrequency = schedule.getRepeatFrequency();
        _builder.append(_repeatFrequency);
        _builder.append(" ");
        String _repeatUnit = schedule.getRepeatUnit();
        _builder.append(_repeatUnit);
        _builder.append(" until ");
        String _endDate = schedule.getEndDate();
        _builder.append(_endDate);
        _builder.append(" at ");
        String _endTime = schedule.getEndTime();
        _builder.append(_endTime);
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compile(final ListPeripherals listPeripherals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Here is a list of the peripherals\");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final ListSequences listSequences) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Here is a list of the sequences\");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final IsEqualTo isEqualTo) {
    CharSequence _xblockexpression = null;
    {
      int x = 2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(x);
      _builder.append(" == ");
      int _value = isEqualTo.getValue();
      _builder.append(_value);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final IsNotEqualTo isNotEqualTo) {
    CharSequence _xblockexpression = null;
    {
      int x = 2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(x);
      _builder.append(" != ");
      int _value = isNotEqualTo.getValue();
      _builder.append(_value);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final IsGreaterThan isGreaterThan) {
    CharSequence _xblockexpression = null;
    {
      int x = 2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(x);
      _builder.append(" > ");
      int _value = isGreaterThan.getValue();
      _builder.append(_value);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final IsLowerThan isLowerThan) {
    CharSequence _xblockexpression = null;
    {
      int x = 2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(x);
      _builder.append(" < ");
      int _value = isLowerThan.getValue();
      _builder.append(_value);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final EObject move) {
    if (move instanceof MoveAbsolute) {
      return _compile((MoveAbsolute)move);
    } else if (move instanceof MoveRelative) {
      return _compile((MoveRelative)move);
    } else if (move instanceof ExecuteSequence) {
      return _compile((ExecuteSequence)move);
    } else if (move instanceof FindHome) {
      return _compile((FindHome)move);
    } else if (move instanceof IsToolOn) {
      return _compile((IsToolOn)move);
    } else if (move instanceof Move) {
      return _compile((Move)move);
    } else if (move instanceof RunFarmware) {
      return _compile((RunFarmware)move);
    } else if (move instanceof SendMessage) {
      return _compile((SendMessage)move);
    } else if (move instanceof TakePhoto) {
      return _compile((TakePhoto)move);
    } else if (move instanceof TurnOff) {
      return _compile((TurnOff)move);
    } else if (move instanceof TurnOn) {
      return _compile((TurnOn)move);
    } else if (move instanceof Wait) {
      return _compile((Wait)move);
    } else if (move instanceof If) {
      return _compile((If)move);
    } else if (move instanceof ListPeripherals) {
      return _compile((ListPeripherals)move);
    } else if (move instanceof ListSequences) {
      return _compile((ListSequences)move);
    } else if (move instanceof Schedule) {
      return _compile((Schedule)move);
    } else if (move instanceof SequenceCommand) {
      return _compile((SequenceCommand)move);
    } else if (move instanceof Command) {
      return _compile((Command)move);
    } else if (move instanceof IsEqualTo) {
      return _compile((IsEqualTo)move);
    } else if (move instanceof IsGreaterThan) {
      return _compile((IsGreaterThan)move);
    } else if (move instanceof IsLowerThan) {
      return _compile((IsLowerThan)move);
    } else if (move instanceof IsNotEqualTo) {
      return _compile((IsNotEqualTo)move);
    } else if (move instanceof Sequence) {
      return _compile((Sequence)move);
    } else if (move instanceof SequenceInstruction) {
      return _compile((SequenceInstruction)move);
    } else if (move instanceof BooleanExpression) {
      return _compile((BooleanExpression)move);
    } else if (move instanceof Farmbot) {
      return _compile((Farmbot)move);
    } else if (move instanceof Instruction) {
      return _compile((Instruction)move);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(move).toString());
    }
  }
}

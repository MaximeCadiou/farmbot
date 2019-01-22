/**
 * generated by Xtext 2.15.0
 */
package xtext.farmbot.generator;

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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyFarmbotGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  protected CharSequence _compile(final Farmbot farmbot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(farmbot);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(Farmbot.class);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Instruction> _instructions = farmbot.getInstructions();
      for(final Instruction inst : _instructions) {
        Object _compile = this.compile(inst);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final TurnOff turnoff) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final MoveRelative moveRelative) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final MoveAbsolute moveAbsolute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final FindHome findHome) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final Sequence sequence) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
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
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final Wait wait) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final IsToolOn isToolOn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final SendMessage sendMessage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final RunFarmware runFarmware) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final TakePhoto takePhoto) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final Schedule schedule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final ListPeripherals listPeripherals) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
    return _builder;
  }
  
  protected CharSequence _compile(final ListSequences listSequences) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported: ");
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
  
  public CharSequence compile(final EObject moveAbsolute) {
    if (moveAbsolute instanceof MoveAbsolute) {
      return _compile((MoveAbsolute)moveAbsolute);
    } else if (moveAbsolute instanceof MoveRelative) {
      return _compile((MoveRelative)moveAbsolute);
    } else if (moveAbsolute instanceof ExecuteSequence) {
      return _compile((ExecuteSequence)moveAbsolute);
    } else if (moveAbsolute instanceof FindHome) {
      return _compile((FindHome)moveAbsolute);
    } else if (moveAbsolute instanceof IsToolOn) {
      return _compile((IsToolOn)moveAbsolute);
    } else if (moveAbsolute instanceof RunFarmware) {
      return _compile((RunFarmware)moveAbsolute);
    } else if (moveAbsolute instanceof SendMessage) {
      return _compile((SendMessage)moveAbsolute);
    } else if (moveAbsolute instanceof TakePhoto) {
      return _compile((TakePhoto)moveAbsolute);
    } else if (moveAbsolute instanceof TurnOff) {
      return _compile((TurnOff)moveAbsolute);
    } else if (moveAbsolute instanceof TurnOn) {
      return _compile((TurnOn)moveAbsolute);
    } else if (moveAbsolute instanceof Wait) {
      return _compile((Wait)moveAbsolute);
    } else if (moveAbsolute instanceof If) {
      return _compile((If)moveAbsolute);
    } else if (moveAbsolute instanceof ListPeripherals) {
      return _compile((ListPeripherals)moveAbsolute);
    } else if (moveAbsolute instanceof ListSequences) {
      return _compile((ListSequences)moveAbsolute);
    } else if (moveAbsolute instanceof Schedule) {
      return _compile((Schedule)moveAbsolute);
    } else if (moveAbsolute instanceof SequenceCommand) {
      return _compile((SequenceCommand)moveAbsolute);
    } else if (moveAbsolute instanceof Command) {
      return _compile((Command)moveAbsolute);
    } else if (moveAbsolute instanceof IsEqualTo) {
      return _compile((IsEqualTo)moveAbsolute);
    } else if (moveAbsolute instanceof IsGreaterThan) {
      return _compile((IsGreaterThan)moveAbsolute);
    } else if (moveAbsolute instanceof IsLowerThan) {
      return _compile((IsLowerThan)moveAbsolute);
    } else if (moveAbsolute instanceof IsNotEqualTo) {
      return _compile((IsNotEqualTo)moveAbsolute);
    } else if (moveAbsolute instanceof Sequence) {
      return _compile((Sequence)moveAbsolute);
    } else if (moveAbsolute instanceof SequenceInstruction) {
      return _compile((SequenceInstruction)moveAbsolute);
    } else if (moveAbsolute instanceof BooleanExpression) {
      return _compile((BooleanExpression)moveAbsolute);
    } else if (moveAbsolute instanceof Farmbot) {
      return _compile((Farmbot)moveAbsolute);
    } else if (moveAbsolute instanceof Instruction) {
      return _compile((Instruction)moveAbsolute);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(moveAbsolute).toString());
    }
  }
}

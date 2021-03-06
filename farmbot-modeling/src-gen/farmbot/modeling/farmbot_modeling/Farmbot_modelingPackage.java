/**
 */
package farmbot.modeling.farmbot_modeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingFactory
 * @model kind="package"
 * @generated
 */
public interface Farmbot_modelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "farmbot_modeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/farmbot_modeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "farmbot_modeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Farmbot_modelingPackage eINSTANCE = farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.FarmbotImpl <em>Farmbot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.FarmbotImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getFarmbot()
	 * @generated
	 */
	int FARMBOT = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMBOT__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Farmbot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMBOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Farmbot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.InstructionImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.CommandImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 23;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceCommandImpl <em>Sequence Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.SequenceCommandImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequenceCommand()
	 * @generated
	 */
	int SEQUENCE_COMMAND = 2;

	/**
	 * The number of structural features of the '<em>Sequence Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.MoveImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__X = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__Y = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__Z = SEQUENCE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = SEQUENCE_COMMAND_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOnDigitalImpl <em>Turn On Digital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.TurnOnDigitalImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOnDigital()
	 * @generated
	 */
	int TURN_ON_DIGITAL = 4;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_DIGITAL__PIN = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn On Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_DIGITAL_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn On Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_DIGITAL_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOffImpl <em>Turn Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.TurnOffImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOff()
	 * @generated
	 */
	int TURN_OFF = 5;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OFF__PIN = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OFF_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OFF_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveRelativeImpl <em>Move Relative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.MoveRelativeImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMoveRelative()
	 * @generated
	 */
	int MOVE_RELATIVE = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE__X = MOVE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE__Y = MOVE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE__Z = MOVE__Z;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE__SPEED = MOVE__SPEED;

	/**
	 * The number of structural features of the '<em>Move Relative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Relative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RELATIVE_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl <em>Find Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.FindHomeImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getFindHome()
	 * @generated
	 */
	int FIND_HOME = 7;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_HOME__AXIS = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Find Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_HOME_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Find Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_HOME_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.SequenceImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE_INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceInstructionImpl <em>Sequence Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.SequenceInstructionImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequenceInstruction()
	 * @generated
	 */
	int SEQUENCE_INSTRUCTION = 17;

	/**
	 * The number of structural features of the '<em>Sequence Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.IfImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIf()
	 * @generated
	 */
	int IF = 9;

	/**
	 * The feature id for the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BOOLEAN_EXPRESSION = SEQUENCE_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = SEQUENCE_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = SEQUENCE_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = SEQUENCE_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = SEQUENCE_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveAbsoluteImpl <em>Move Absolute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.MoveAbsoluteImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMoveAbsolute()
	 * @generated
	 */
	int MOVE_ABSOLUTE = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE__X = MOVE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE__Y = MOVE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE__Z = MOVE__Z;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE__SPEED = MOVE__SPEED;

	/**
	 * The number of structural features of the '<em>Move Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Absolute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ABSOLUTE_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.ExecuteSequenceImpl <em>Execute Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.ExecuteSequenceImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getExecuteSequence()
	 * @generated
	 */
	int EXECUTE_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_SEQUENCE__ID = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_SEQUENCE_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execute Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_SEQUENCE_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.WaitImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DURATION = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__AXE = 1;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__PIN_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.SendMessageImpl <em>Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.SendMessageImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSendMessage()
	 * @generated
	 */
	int SEND_MESSAGE = 14;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__MESSAGE = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__MESSAGE_TYPE = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.RunFarmwareImpl <em>Run Farmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.RunFarmwareImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getRunFarmware()
	 * @generated
	 */
	int RUN_FARMWARE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FARMWARE__NAME = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Run Farmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FARMWARE_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Run Farmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FARMWARE_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.TakePhotoImpl <em>Take Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.TakePhotoImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTakePhoto()
	 * @generated
	 */
	int TAKE_PHOTO = 16;

	/**
	 * The number of structural features of the '<em>Take Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PHOTO_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Take Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAKE_PHOTO_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.IsEqualToImpl <em>Is Equal To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.IsEqualToImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsEqualTo()
	 * @generated
	 */
	int IS_EQUAL_TO = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO__VALUE = BOOLEAN_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO__AXE = BOOLEAN_EXPRESSION__AXE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO__PIN_NUMBER = BOOLEAN_EXPRESSION__PIN_NUMBER;

	/**
	 * The number of structural features of the '<em>Is Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.IsNotEqualToImpl <em>Is Not Equal To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.IsNotEqualToImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsNotEqualTo()
	 * @generated
	 */
	int IS_NOT_EQUAL_TO = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_EQUAL_TO__VALUE = BOOLEAN_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_EQUAL_TO__AXE = BOOLEAN_EXPRESSION__AXE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_EQUAL_TO__PIN_NUMBER = BOOLEAN_EXPRESSION__PIN_NUMBER;

	/**
	 * The number of structural features of the '<em>Is Not Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_EQUAL_TO_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Not Equal To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_EQUAL_TO_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.IsGreaterThanImpl <em>Is Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.IsGreaterThanImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsGreaterThan()
	 * @generated
	 */
	int IS_GREATER_THAN = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN__VALUE = BOOLEAN_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN__AXE = BOOLEAN_EXPRESSION__AXE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN__PIN_NUMBER = BOOLEAN_EXPRESSION__PIN_NUMBER;

	/**
	 * The number of structural features of the '<em>Is Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.IsLowerThanImpl <em>Is Lower Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.IsLowerThanImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsLowerThan()
	 * @generated
	 */
	int IS_LOWER_THAN = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN__VALUE = BOOLEAN_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN__AXE = BOOLEAN_EXPRESSION__AXE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN__PIN_NUMBER = BOOLEAN_EXPRESSION__PIN_NUMBER;

	/**
	 * The number of structural features of the '<em>Is Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Lower Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.ScheduleImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 22;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__SEQUENCE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__START_DATE = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__START_TIME = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__REPEAT = COMMAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repeat Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__REPEAT_FREQUENCY = COMMAND_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Repeat Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__REPEAT_UNIT = COMMAND_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__END_DATE = COMMAND_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__END_TIME = COMMAND_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.ListSequencesImpl <em>List Sequences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.ListSequencesImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getListSequences()
	 * @generated
	 */
	int LIST_SEQUENCES = 24;

	/**
	 * The number of structural features of the '<em>List Sequences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SEQUENCES_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Sequences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SEQUENCES_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.ListScheduledEventsImpl <em>List Scheduled Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.ListScheduledEventsImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getListScheduledEvents()
	 * @generated
	 */
	int LIST_SCHEDULED_EVENTS = 25;

	/**
	 * The number of structural features of the '<em>List Scheduled Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SCHEDULED_EVENTS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Scheduled Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SCHEDULED_EVENTS_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOnAnalogImpl <em>Turn On Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farmbot.modeling.farmbot_modeling.impl.TurnOnAnalogImpl
	 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOnAnalog()
	 * @generated
	 */
	int TURN_ON_ANALOG = 26;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_ANALOG__PIN = SEQUENCE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_ANALOG__VALUE = SEQUENCE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turn On Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_ANALOG_FEATURE_COUNT = SEQUENCE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turn On Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ON_ANALOG_OPERATION_COUNT = SEQUENCE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Farmbot <em>Farmbot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Farmbot</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot
	 * @generated
	 */
	EClass getFarmbot();

	/**
	 * Returns the meta object for the containment reference list '{@link farmbot.modeling.farmbot_modeling.Farmbot#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot#getInstructions()
	 * @see #getFarmbot()
	 * @generated
	 */
	EReference getFarmbot_Instructions();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.SequenceCommand <em>Sequence Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Command</em>'.
	 * @see farmbot.modeling.farmbot_modeling.SequenceCommand
	 * @generated
	 */
	EClass getSequenceCommand();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Move#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Move#getX()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_X();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Move#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Move#getY()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Y();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Move#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Move#getZ()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Z();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Move#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Move#getSpeed()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Speed();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.TurnOnDigital <em>Turn On Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn On Digital</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOnDigital
	 * @generated
	 */
	EClass getTurnOnDigital();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.TurnOnDigital#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOnDigital#getPin()
	 * @see #getTurnOnDigital()
	 * @generated
	 */
	EAttribute getTurnOnDigital_Pin();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.TurnOff <em>Turn Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Off</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOff
	 * @generated
	 */
	EClass getTurnOff();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.TurnOff#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOff#getPin()
	 * @see #getTurnOff()
	 * @generated
	 */
	EAttribute getTurnOff_Pin();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.MoveRelative <em>Move Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Relative</em>'.
	 * @see farmbot.modeling.farmbot_modeling.MoveRelative
	 * @generated
	 */
	EClass getMoveRelative();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.FindHome <em>Find Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find Home</em>'.
	 * @see farmbot.modeling.farmbot_modeling.FindHome
	 * @generated
	 */
	EClass getFindHome();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.FindHome#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see farmbot.modeling.farmbot_modeling.FindHome#getAxis()
	 * @see #getFindHome()
	 * @generated
	 */
	EAttribute getFindHome_Axis();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link farmbot.modeling.farmbot_modeling.Sequence#getSequenceInstructions <em>Sequence Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Instructions</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Sequence#getSequenceInstructions()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_SequenceInstructions();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see farmbot.modeling.farmbot_modeling.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link farmbot.modeling.farmbot_modeling.If#getBooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Expression</em>'.
	 * @see farmbot.modeling.farmbot_modeling.If#getBooleanExpression()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_BooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link farmbot.modeling.farmbot_modeling.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see farmbot.modeling.farmbot_modeling.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link farmbot.modeling.farmbot_modeling.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see farmbot.modeling.farmbot_modeling.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.MoveAbsolute <em>Move Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Absolute</em>'.
	 * @see farmbot.modeling.farmbot_modeling.MoveAbsolute
	 * @generated
	 */
	EClass getMoveAbsolute();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.ExecuteSequence <em>Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Sequence</em>'.
	 * @see farmbot.modeling.farmbot_modeling.ExecuteSequence
	 * @generated
	 */
	EClass getExecuteSequence();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.ExecuteSequence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see farmbot.modeling.farmbot_modeling.ExecuteSequence#getId()
	 * @see #getExecuteSequence()
	 * @generated
	 */
	EAttribute getExecuteSequence_Id();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Wait#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Wait#getDuration()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Duration();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see farmbot.modeling.farmbot_modeling.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.BooleanExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see farmbot.modeling.farmbot_modeling.BooleanExpression#getValue()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Value();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.BooleanExpression#getAxe <em>Axe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axe</em>'.
	 * @see farmbot.modeling.farmbot_modeling.BooleanExpression#getAxe()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Axe();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.BooleanExpression#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see farmbot.modeling.farmbot_modeling.BooleanExpression#getPinNumber()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_PinNumber();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message</em>'.
	 * @see farmbot.modeling.farmbot_modeling.SendMessage
	 * @generated
	 */
	EClass getSendMessage();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.SendMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see farmbot.modeling.farmbot_modeling.SendMessage#getMessage()
	 * @see #getSendMessage()
	 * @generated
	 */
	EAttribute getSendMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.SendMessage#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see farmbot.modeling.farmbot_modeling.SendMessage#getMessageType()
	 * @see #getSendMessage()
	 * @generated
	 */
	EAttribute getSendMessage_MessageType();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.RunFarmware <em>Run Farmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Farmware</em>'.
	 * @see farmbot.modeling.farmbot_modeling.RunFarmware
	 * @generated
	 */
	EClass getRunFarmware();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.RunFarmware#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see farmbot.modeling.farmbot_modeling.RunFarmware#getName()
	 * @see #getRunFarmware()
	 * @generated
	 */
	EAttribute getRunFarmware_Name();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.TakePhoto <em>Take Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Take Photo</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TakePhoto
	 * @generated
	 */
	EClass getTakePhoto();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.SequenceInstruction <em>Sequence Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Instruction</em>'.
	 * @see farmbot.modeling.farmbot_modeling.SequenceInstruction
	 * @generated
	 */
	EClass getSequenceInstruction();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.IsEqualTo <em>Is Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Equal To</em>'.
	 * @see farmbot.modeling.farmbot_modeling.IsEqualTo
	 * @generated
	 */
	EClass getIsEqualTo();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.IsNotEqualTo <em>Is Not Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Not Equal To</em>'.
	 * @see farmbot.modeling.farmbot_modeling.IsNotEqualTo
	 * @generated
	 */
	EClass getIsNotEqualTo();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.IsGreaterThan <em>Is Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Greater Than</em>'.
	 * @see farmbot.modeling.farmbot_modeling.IsGreaterThan
	 * @generated
	 */
	EClass getIsGreaterThan();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.IsLowerThan <em>Is Lower Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Lower Than</em>'.
	 * @see farmbot.modeling.farmbot_modeling.IsLowerThan
	 * @generated
	 */
	EClass getIsLowerThan();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getSequence()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getStartDate()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getStartTime()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#isRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#isRepeat()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatFrequency <em>Repeat Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Frequency</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getRepeatFrequency()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_RepeatFrequency();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatUnit <em>Repeat Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Unit</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getRepeatUnit()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_RepeatUnit();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getEndDate()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.Schedule#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Schedule#getEndTime()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_EndTime();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see farmbot.modeling.farmbot_modeling.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.ListSequences <em>List Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Sequences</em>'.
	 * @see farmbot.modeling.farmbot_modeling.ListSequences
	 * @generated
	 */
	EClass getListSequences();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.ListScheduledEvents <em>List Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Scheduled Events</em>'.
	 * @see farmbot.modeling.farmbot_modeling.ListScheduledEvents
	 * @generated
	 */
	EClass getListScheduledEvents();

	/**
	 * Returns the meta object for class '{@link farmbot.modeling.farmbot_modeling.TurnOnAnalog <em>Turn On Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn On Analog</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOnAnalog
	 * @generated
	 */
	EClass getTurnOnAnalog();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.TurnOnAnalog#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOnAnalog#getPin()
	 * @see #getTurnOnAnalog()
	 * @generated
	 */
	EAttribute getTurnOnAnalog_Pin();

	/**
	 * Returns the meta object for the attribute '{@link farmbot.modeling.farmbot_modeling.TurnOnAnalog#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see farmbot.modeling.farmbot_modeling.TurnOnAnalog#getValue()
	 * @see #getTurnOnAnalog()
	 * @generated
	 */
	EAttribute getTurnOnAnalog_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Farmbot_modelingFactory getFarmbot_modelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.FarmbotImpl <em>Farmbot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.FarmbotImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getFarmbot()
		 * @generated
		 */
		EClass FARMBOT = eINSTANCE.getFarmbot();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARMBOT__INSTRUCTIONS = eINSTANCE.getFarmbot_Instructions();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.InstructionImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceCommandImpl <em>Sequence Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.SequenceCommandImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequenceCommand()
		 * @generated
		 */
		EClass SEQUENCE_COMMAND = eINSTANCE.getSequenceCommand();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.MoveImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__X = eINSTANCE.getMove_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__Y = eINSTANCE.getMove_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__Z = eINSTANCE.getMove_Z();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__SPEED = eINSTANCE.getMove_Speed();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOnDigitalImpl <em>Turn On Digital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.TurnOnDigitalImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOnDigital()
		 * @generated
		 */
		EClass TURN_ON_DIGITAL = eINSTANCE.getTurnOnDigital();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_ON_DIGITAL__PIN = eINSTANCE.getTurnOnDigital_Pin();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOffImpl <em>Turn Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.TurnOffImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOff()
		 * @generated
		 */
		EClass TURN_OFF = eINSTANCE.getTurnOff();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_OFF__PIN = eINSTANCE.getTurnOff_Pin();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveRelativeImpl <em>Move Relative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.MoveRelativeImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMoveRelative()
		 * @generated
		 */
		EClass MOVE_RELATIVE = eINSTANCE.getMoveRelative();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl <em>Find Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.FindHomeImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getFindHome()
		 * @generated
		 */
		EClass FIND_HOME = eINSTANCE.getFindHome();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIND_HOME__AXIS = eINSTANCE.getFindHome_Axis();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.SequenceImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Sequence Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE_INSTRUCTIONS = eINSTANCE.getSequence_SequenceInstructions();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.IfImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Boolean Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__BOOLEAN_EXPRESSION = eINSTANCE.getIf_BooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.MoveAbsoluteImpl <em>Move Absolute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.MoveAbsoluteImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getMoveAbsolute()
		 * @generated
		 */
		EClass MOVE_ABSOLUTE = eINSTANCE.getMoveAbsolute();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.ExecuteSequenceImpl <em>Execute Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.ExecuteSequenceImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getExecuteSequence()
		 * @generated
		 */
		EClass EXECUTE_SEQUENCE = eINSTANCE.getExecuteSequence();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_SEQUENCE__ID = eINSTANCE.getExecuteSequence_Id();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.WaitImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__DURATION = eINSTANCE.getWait_Duration();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__VALUE = eINSTANCE.getBooleanExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Axe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__AXE = eINSTANCE.getBooleanExpression_Axe();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__PIN_NUMBER = eINSTANCE.getBooleanExpression_PinNumber();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.SendMessageImpl <em>Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.SendMessageImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSendMessage()
		 * @generated
		 */
		EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE__MESSAGE = eINSTANCE.getSendMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE__MESSAGE_TYPE = eINSTANCE.getSendMessage_MessageType();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.RunFarmwareImpl <em>Run Farmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.RunFarmwareImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getRunFarmware()
		 * @generated
		 */
		EClass RUN_FARMWARE = eINSTANCE.getRunFarmware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_FARMWARE__NAME = eINSTANCE.getRunFarmware_Name();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.TakePhotoImpl <em>Take Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.TakePhotoImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTakePhoto()
		 * @generated
		 */
		EClass TAKE_PHOTO = eINSTANCE.getTakePhoto();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.SequenceInstructionImpl <em>Sequence Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.SequenceInstructionImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSequenceInstruction()
		 * @generated
		 */
		EClass SEQUENCE_INSTRUCTION = eINSTANCE.getSequenceInstruction();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.IsEqualToImpl <em>Is Equal To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.IsEqualToImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsEqualTo()
		 * @generated
		 */
		EClass IS_EQUAL_TO = eINSTANCE.getIsEqualTo();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.IsNotEqualToImpl <em>Is Not Equal To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.IsNotEqualToImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsNotEqualTo()
		 * @generated
		 */
		EClass IS_NOT_EQUAL_TO = eINSTANCE.getIsNotEqualTo();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.IsGreaterThanImpl <em>Is Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.IsGreaterThanImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsGreaterThan()
		 * @generated
		 */
		EClass IS_GREATER_THAN = eINSTANCE.getIsGreaterThan();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.IsLowerThanImpl <em>Is Lower Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.IsLowerThanImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getIsLowerThan()
		 * @generated
		 */
		EClass IS_LOWER_THAN = eINSTANCE.getIsLowerThan();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.ScheduleImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__SEQUENCE = eINSTANCE.getSchedule_Sequence();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__START_DATE = eINSTANCE.getSchedule_StartDate();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__START_TIME = eINSTANCE.getSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__REPEAT = eINSTANCE.getSchedule_Repeat();

		/**
		 * The meta object literal for the '<em><b>Repeat Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__REPEAT_FREQUENCY = eINSTANCE.getSchedule_RepeatFrequency();

		/**
		 * The meta object literal for the '<em><b>Repeat Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__REPEAT_UNIT = eINSTANCE.getSchedule_RepeatUnit();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__END_DATE = eINSTANCE.getSchedule_EndDate();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__END_TIME = eINSTANCE.getSchedule_EndTime();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.CommandImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.ListSequencesImpl <em>List Sequences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.ListSequencesImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getListSequences()
		 * @generated
		 */
		EClass LIST_SEQUENCES = eINSTANCE.getListSequences();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.ListScheduledEventsImpl <em>List Scheduled Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.ListScheduledEventsImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getListScheduledEvents()
		 * @generated
		 */
		EClass LIST_SCHEDULED_EVENTS = eINSTANCE.getListScheduledEvents();

		/**
		 * The meta object literal for the '{@link farmbot.modeling.farmbot_modeling.impl.TurnOnAnalogImpl <em>Turn On Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farmbot.modeling.farmbot_modeling.impl.TurnOnAnalogImpl
		 * @see farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingPackageImpl#getTurnOnAnalog()
		 * @generated
		 */
		EClass TURN_ON_ANALOG = eINSTANCE.getTurnOnAnalog();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_ON_ANALOG__PIN = eINSTANCE.getTurnOnAnalog_Pin();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_ON_ANALOG__VALUE = eINSTANCE.getTurnOnAnalog_Value();

	}

} //Farmbot_modelingPackage

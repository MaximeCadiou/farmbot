/**
 */
package farmbot.modeling.farmbot_modeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage
 * @generated
 */
public interface Farmbot_modelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Farmbot_modelingFactory eINSTANCE = farmbot.modeling.farmbot_modeling.impl.Farmbot_modelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Farmbot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Farmbot</em>'.
	 * @generated
	 */
	Farmbot createFarmbot();

	/**
	 * Returns a new object of class '<em>Turn On Digital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn On Digital</em>'.
	 * @generated
	 */
	TurnOnDigital createTurnOnDigital();

	/**
	 * Returns a new object of class '<em>Turn Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Off</em>'.
	 * @generated
	 */
	TurnOff createTurnOff();

	/**
	 * Returns a new object of class '<em>Move Relative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Relative</em>'.
	 * @generated
	 */
	MoveRelative createMoveRelative();

	/**
	 * Returns a new object of class '<em>Find Home</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find Home</em>'.
	 * @generated
	 */
	FindHome createFindHome();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Move Absolute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Absolute</em>'.
	 * @generated
	 */
	MoveAbsolute createMoveAbsolute();

	/**
	 * Returns a new object of class '<em>Execute Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Sequence</em>'.
	 * @generated
	 */
	ExecuteSequence createExecuteSequence();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message</em>'.
	 * @generated
	 */
	SendMessage createSendMessage();

	/**
	 * Returns a new object of class '<em>Run Farmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Farmware</em>'.
	 * @generated
	 */
	RunFarmware createRunFarmware();

	/**
	 * Returns a new object of class '<em>Take Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Take Photo</em>'.
	 * @generated
	 */
	TakePhoto createTakePhoto();

	/**
	 * Returns a new object of class '<em>Is Equal To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Equal To</em>'.
	 * @generated
	 */
	IsEqualTo createIsEqualTo();

	/**
	 * Returns a new object of class '<em>Is Not Equal To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Not Equal To</em>'.
	 * @generated
	 */
	IsNotEqualTo createIsNotEqualTo();

	/**
	 * Returns a new object of class '<em>Is Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Greater Than</em>'.
	 * @generated
	 */
	IsGreaterThan createIsGreaterThan();

	/**
	 * Returns a new object of class '<em>Is Lower Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Lower Than</em>'.
	 * @generated
	 */
	IsLowerThan createIsLowerThan();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>List Sequences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Sequences</em>'.
	 * @generated
	 */
	ListSequences createListSequences();

	/**
	 * Returns a new object of class '<em>List Scheduled Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Scheduled Events</em>'.
	 * @generated
	 */
	ListScheduledEvents createListScheduledEvents();

	/**
	 * Returns a new object of class '<em>Turn On Analog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn On Analog</em>'.
	 * @generated
	 */
	TurnOnAnalog createTurnOnAnalog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Farmbot_modelingPackage getFarmbot_modelingPackage();

} //Farmbot_modelingFactory

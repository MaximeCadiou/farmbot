/**
 */
package farmbot.modeling.farmbot_modeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Sequence#getIf <em>If</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Sequence#getSequenceinstruction <em>Sequenceinstruction</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSequence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link farmbot.modeling.farmbot_modeling.If}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSequence_If()
	 * @model containment="true"
	 * @generated
	 */
	EList<If> getIf();

	/**
	 * Returns the value of the '<em><b>Sequenceinstruction</b></em>' containment reference list.
	 * The list contents are of type {@link farmbot.modeling.farmbot_modeling.SequenceInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequenceinstruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequenceinstruction</em>' containment reference list.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSequence_Sequenceinstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceInstruction> getSequenceinstruction();

} // Sequence

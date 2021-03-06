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
 *   <li>{@link farmbot.modeling.farmbot_modeling.Sequence#getSequenceInstructions <em>Sequence Instructions</em>}</li>
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
	 * Returns the value of the '<em><b>Sequence Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link farmbot.modeling.farmbot_modeling.SequenceInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Instructions</em>' containment reference list.
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSequence_SequenceInstructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceInstruction> getSequenceInstructions();

} // Sequence

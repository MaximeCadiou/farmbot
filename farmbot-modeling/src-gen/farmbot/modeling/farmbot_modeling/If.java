/**
 */
package farmbot.modeling.farmbot_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.If#getBooleanexpression <em>Booleanexpression</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.If#getThen <em>Then</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.If#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIf()
 * @model
 * @generated
 */
public interface If extends SequenceInstruction {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanexpression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #setBooleanexpression(BooleanExpression)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIf_Booleanexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBooleanexpression();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.If#getBooleanexpression <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #getBooleanexpression()
	 * @generated
	 */
	void setBooleanexpression(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(ExecuteSequence)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIf_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecuteSequence getThen();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.If#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(ExecuteSequence value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ExecuteSequence)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIf_Else()
	 * @model containment="true"
	 * @generated
	 */
	ExecuteSequence getElse();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.If#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ExecuteSequence value);

} // If

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
 *   <li>{@link farmbot.modeling.farmbot_modeling.If#getBooleanExpression <em>Boolean Expression</em>}</li>
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
	 * Returns the value of the '<em><b>Boolean Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #setBooleanExpression(BooleanExpression)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIf_BooleanExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBooleanExpression();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.If#getBooleanExpression <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Expression</em>' containment reference.
	 * @see #getBooleanExpression()
	 * @generated
	 */
	void setBooleanExpression(BooleanExpression value);

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
	 * @model containment="true"
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

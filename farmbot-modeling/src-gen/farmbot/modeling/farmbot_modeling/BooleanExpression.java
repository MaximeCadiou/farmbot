/**
 */
package farmbot.modeling.farmbot_modeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.BooleanExpression#isResult <em>Result</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getBooleanExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(boolean)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getBooleanExpression_Result()
	 * @model
	 * @generated
	 */
	boolean isResult();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.BooleanExpression#isResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #isResult()
	 * @generated
	 */
	void setResult(boolean value);

} // BooleanExpression

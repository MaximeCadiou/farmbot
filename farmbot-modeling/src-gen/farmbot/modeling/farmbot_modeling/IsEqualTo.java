/**
 */
package farmbot.modeling.farmbot_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Equal To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.IsEqualTo#getValue <em>Value</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.IsEqualTo#getAxe <em>Axe</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIsEqualTo()
 * @model
 * @generated
 */
public interface IsEqualTo extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIsEqualTo_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.IsEqualTo#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axe</em>' attribute.
	 * @see #setAxe(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getIsEqualTo_Axe()
	 * @model
	 * @generated
	 */
	String getAxe();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.IsEqualTo#getAxe <em>Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axe</em>' attribute.
	 * @see #getAxe()
	 * @generated
	 */
	void setAxe(String value);

} // IsEqualTo

/**
 */
package farmbot.modeling.farmbot_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Farmware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.RunFarmware#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getRunFarmware()
 * @model
 * @generated
 */
public interface RunFarmware extends SequenceCommand {
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
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getRunFarmware_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.RunFarmware#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RunFarmware

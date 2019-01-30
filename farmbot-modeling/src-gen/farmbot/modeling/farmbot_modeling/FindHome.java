/**
 */
package farmbot.modeling.farmbot_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.FindHome#isFindX <em>Find X</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.FindHome#isFindY <em>Find Y</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.FindHome#isFindZ <em>Find Z</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.FindHome#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getFindHome()
 * @model
 * @generated
 */
public interface FindHome extends SequenceCommand {
	/**
	 * Returns the value of the '<em><b>Find X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find X</em>' attribute.
	 * @see #setFindX(boolean)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getFindHome_FindX()
	 * @model
	 * @generated
	 */
	boolean isFindX();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.FindHome#isFindX <em>Find X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find X</em>' attribute.
	 * @see #isFindX()
	 * @generated
	 */
	void setFindX(boolean value);

	/**
	 * Returns the value of the '<em><b>Find Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Y</em>' attribute.
	 * @see #setFindY(boolean)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getFindHome_FindY()
	 * @model
	 * @generated
	 */
	boolean isFindY();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.FindHome#isFindY <em>Find Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Y</em>' attribute.
	 * @see #isFindY()
	 * @generated
	 */
	void setFindY(boolean value);

	/**
	 * Returns the value of the '<em><b>Find Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Z</em>' attribute.
	 * @see #setFindZ(boolean)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getFindHome_FindZ()
	 * @model
	 * @generated
	 */
	boolean isFindZ();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.FindHome#isFindZ <em>Find Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Z</em>' attribute.
	 * @see #isFindZ()
	 * @generated
	 */
	void setFindZ(boolean value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getFindHome_Speed()
	 * @model
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.FindHome#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

} // FindHome

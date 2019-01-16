/**
 */
package farmbot.modeling.farmbot_modeling;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getSequence <em>Sequence</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#isReapeat <em>Reapeat</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatFrequency <em>Repeat Frequency</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getEndDate <em>End Date</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.Schedule#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends Command {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_Sequence()
	 * @model
	 * @generated
	 */
	String getSequence();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_StartDate()
	 * @model
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_StartTime()
	 * @model
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Reapeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reapeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reapeat</em>' attribute.
	 * @see #setReapeat(boolean)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_Reapeat()
	 * @model
	 * @generated
	 */
	boolean isReapeat();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#isReapeat <em>Reapeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reapeat</em>' attribute.
	 * @see #isReapeat()
	 * @generated
	 */
	void setReapeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Repeat Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Frequency</em>' attribute.
	 * @see #setRepeatFrequency(int)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_RepeatFrequency()
	 * @model
	 * @generated
	 */
	int getRepeatFrequency();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatFrequency <em>Repeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Frequency</em>' attribute.
	 * @see #getRepeatFrequency()
	 * @generated
	 */
	void setRepeatFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' attribute.
	 * @see #setRepeatUnit(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_RepeatUnit()
	 * @model
	 * @generated
	 */
	String getRepeatUnit();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getRepeatUnit <em>Repeat Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit</em>' attribute.
	 * @see #getRepeatUnit()
	 * @generated
	 */
	void setRepeatUnit(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_EndDate()
	 * @model
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage#getSchedule_EndTime()
	 * @model
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link farmbot.modeling.farmbot_modeling.Schedule#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

} // Schedule

/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.Schedule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#isReapeat <em>Reapeat</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getRepeatFrequency <em>Repeat Frequency</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getRepeatUnit <em>Repeat Unit</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.ScheduleImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends CommandImpl implements Schedule {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected String sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isReapeat() <em>Reapeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReapeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REAPEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReapeat() <em>Reapeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReapeat()
	 * @generated
	 * @ordered
	 */
	protected boolean reapeat = REAPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatFrequency() <em>Repeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int REPEAT_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepeatFrequency() <em>Repeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected int repeatFrequency = REPEAT_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatUnit() <em>Repeat Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatUnit() <em>Repeat Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatUnit()
	 * @generated
	 * @ordered
	 */
	protected String repeatUnit = REPEAT_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farmbot_modelingPackage.Literals.SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(String newSequence) {
		String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__SEQUENCE,
					oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__START_DATE,
					oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__START_TIME,
					oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReapeat() {
		return reapeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReapeat(boolean newReapeat) {
		boolean oldReapeat = reapeat;
		reapeat = newReapeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__REAPEAT, oldReapeat,
					reapeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepeatFrequency() {
		return repeatFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatFrequency(int newRepeatFrequency) {
		int oldRepeatFrequency = repeatFrequency;
		repeatFrequency = newRepeatFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__REPEAT_FREQUENCY,
					oldRepeatFrequency, repeatFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatUnit() {
		return repeatUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatUnit(String newRepeatUnit) {
		String oldRepeatUnit = repeatUnit;
		repeatUnit = newRepeatUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__REPEAT_UNIT,
					oldRepeatUnit, repeatUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__END_DATE,
					oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(String newEndTime) {
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SCHEDULE__END_TIME,
					oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farmbot_modelingPackage.SCHEDULE__SEQUENCE:
			return getSequence();
		case Farmbot_modelingPackage.SCHEDULE__START_DATE:
			return getStartDate();
		case Farmbot_modelingPackage.SCHEDULE__START_TIME:
			return getStartTime();
		case Farmbot_modelingPackage.SCHEDULE__REAPEAT:
			return isReapeat();
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_FREQUENCY:
			return getRepeatFrequency();
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_UNIT:
			return getRepeatUnit();
		case Farmbot_modelingPackage.SCHEDULE__END_DATE:
			return getEndDate();
		case Farmbot_modelingPackage.SCHEDULE__END_TIME:
			return getEndTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Farmbot_modelingPackage.SCHEDULE__SEQUENCE:
			setSequence((String) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__START_DATE:
			setStartDate((String) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__START_TIME:
			setStartTime((String) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REAPEAT:
			setReapeat((Boolean) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_FREQUENCY:
			setRepeatFrequency((Integer) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_UNIT:
			setRepeatUnit((String) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__END_DATE:
			setEndDate((String) newValue);
			return;
		case Farmbot_modelingPackage.SCHEDULE__END_TIME:
			setEndTime((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Farmbot_modelingPackage.SCHEDULE__SEQUENCE:
			setSequence(SEQUENCE_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REAPEAT:
			setReapeat(REAPEAT_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_FREQUENCY:
			setRepeatFrequency(REPEAT_FREQUENCY_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_UNIT:
			setRepeatUnit(REPEAT_UNIT_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SCHEDULE__END_TIME:
			setEndTime(END_TIME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Farmbot_modelingPackage.SCHEDULE__SEQUENCE:
			return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
		case Farmbot_modelingPackage.SCHEDULE__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case Farmbot_modelingPackage.SCHEDULE__START_TIME:
			return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
		case Farmbot_modelingPackage.SCHEDULE__REAPEAT:
			return reapeat != REAPEAT_EDEFAULT;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_FREQUENCY:
			return repeatFrequency != REPEAT_FREQUENCY_EDEFAULT;
		case Farmbot_modelingPackage.SCHEDULE__REPEAT_UNIT:
			return REPEAT_UNIT_EDEFAULT == null ? repeatUnit != null : !REPEAT_UNIT_EDEFAULT.equals(repeatUnit);
		case Farmbot_modelingPackage.SCHEDULE__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case Farmbot_modelingPackage.SCHEDULE__END_TIME:
			return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", reapeat: ");
		result.append(reapeat);
		result.append(", repeatFrequency: ");
		result.append(repeatFrequency);
		result.append(", repeatUnit: ");
		result.append(repeatUnit);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl

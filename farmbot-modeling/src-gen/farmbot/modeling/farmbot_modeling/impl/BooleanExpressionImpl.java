/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.BooleanExpression;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl#getAxe <em>Axe</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.BooleanExpressionImpl#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BooleanExpressionImpl extends MinimalEObjectImpl.Container implements BooleanExpression {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxe() <em>Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxe()
	 * @generated
	 * @ordered
	 */
	protected static final String AXE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxe() <em>Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxe()
	 * @generated
	 * @ordered
	 */
	protected String axe = AXE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected int pinNumber = PIN_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farmbot_modelingPackage.Literals.BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.BOOLEAN_EXPRESSION__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxe() {
		return axe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxe(String newAxe) {
		String oldAxe = axe;
		axe = newAxe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.BOOLEAN_EXPRESSION__AXE,
					oldAxe, axe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPinNumber() {
		return pinNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinNumber(int newPinNumber) {
		int oldPinNumber = pinNumber;
		pinNumber = newPinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Farmbot_modelingPackage.BOOLEAN_EXPRESSION__PIN_NUMBER, oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__VALUE:
			return getValue();
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__AXE:
			return getAxe();
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__PIN_NUMBER:
			return getPinNumber();
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
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__VALUE:
			setValue((Integer) newValue);
			return;
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__AXE:
			setAxe((String) newValue);
			return;
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__PIN_NUMBER:
			setPinNumber((Integer) newValue);
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
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__AXE:
			setAxe(AXE_EDEFAULT);
			return;
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__PIN_NUMBER:
			setPinNumber(PIN_NUMBER_EDEFAULT);
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
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__VALUE:
			return value != VALUE_EDEFAULT;
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__AXE:
			return AXE_EDEFAULT == null ? axe != null : !AXE_EDEFAULT.equals(axe);
		case Farmbot_modelingPackage.BOOLEAN_EXPRESSION__PIN_NUMBER:
			return pinNumber != PIN_NUMBER_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", axe: ");
		result.append(axe);
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(')');
		return result.toString();
	}

} //BooleanExpressionImpl

/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.FindHome;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl#isFindX <em>Find X</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl#isFindY <em>Find Y</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl#isFindZ <em>Find Z</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.FindHomeImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindHomeImpl extends SequenceCommandImpl implements FindHome {
	/**
	 * The default value of the '{@link #isFindX() <em>Find X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIND_X_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFindX() <em>Find X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindX()
	 * @generated
	 * @ordered
	 */
	protected boolean findX = FIND_X_EDEFAULT;

	/**
	 * The default value of the '{@link #isFindY() <em>Find Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindY()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIND_Y_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFindY() <em>Find Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindY()
	 * @generated
	 * @ordered
	 */
	protected boolean findY = FIND_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isFindZ() <em>Find Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindZ()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIND_Z_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFindZ() <em>Find Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFindZ()
	 * @generated
	 * @ordered
	 */
	protected boolean findZ = FIND_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindHomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farmbot_modelingPackage.Literals.FIND_HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFindX() {
		return findX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindX(boolean newFindX) {
		boolean oldFindX = findX;
		findX = newFindX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.FIND_HOME__FIND_X, oldFindX,
					findX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFindY() {
		return findY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindY(boolean newFindY) {
		boolean oldFindY = findY;
		findY = newFindY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.FIND_HOME__FIND_Y, oldFindY,
					findY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFindZ() {
		return findZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindZ(boolean newFindZ) {
		boolean oldFindZ = findZ;
		findZ = newFindZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.FIND_HOME__FIND_Z, oldFindZ,
					findZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.FIND_HOME__SPEED, oldSpeed,
					speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farmbot_modelingPackage.FIND_HOME__FIND_X:
			return isFindX();
		case Farmbot_modelingPackage.FIND_HOME__FIND_Y:
			return isFindY();
		case Farmbot_modelingPackage.FIND_HOME__FIND_Z:
			return isFindZ();
		case Farmbot_modelingPackage.FIND_HOME__SPEED:
			return getSpeed();
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
		case Farmbot_modelingPackage.FIND_HOME__FIND_X:
			setFindX((Boolean) newValue);
			return;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Y:
			setFindY((Boolean) newValue);
			return;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Z:
			setFindZ((Boolean) newValue);
			return;
		case Farmbot_modelingPackage.FIND_HOME__SPEED:
			setSpeed((Double) newValue);
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
		case Farmbot_modelingPackage.FIND_HOME__FIND_X:
			setFindX(FIND_X_EDEFAULT);
			return;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Y:
			setFindY(FIND_Y_EDEFAULT);
			return;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Z:
			setFindZ(FIND_Z_EDEFAULT);
			return;
		case Farmbot_modelingPackage.FIND_HOME__SPEED:
			setSpeed(SPEED_EDEFAULT);
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
		case Farmbot_modelingPackage.FIND_HOME__FIND_X:
			return findX != FIND_X_EDEFAULT;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Y:
			return findY != FIND_Y_EDEFAULT;
		case Farmbot_modelingPackage.FIND_HOME__FIND_Z:
			return findZ != FIND_Z_EDEFAULT;
		case Farmbot_modelingPackage.FIND_HOME__SPEED:
			return speed != SPEED_EDEFAULT;
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
		result.append(" (findX: ");
		result.append(findX);
		result.append(", findY: ");
		result.append(findY);
		result.append(", findZ: ");
		result.append(findZ);
		result.append(", speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} //FindHomeImpl

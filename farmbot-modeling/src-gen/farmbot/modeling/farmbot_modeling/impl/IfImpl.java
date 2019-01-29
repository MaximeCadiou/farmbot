/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.BooleanExpression;
import farmbot.modeling.farmbot_modeling.ExecuteSequence;
import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.If;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.IfImpl#getBooleanExpression <em>Boolean Expression</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.IfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.IfImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends SequenceInstructionImpl implements If {
	/**
	 * The cached value of the '{@link #getBooleanExpression() <em>Boolean Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanExpression;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected ExecuteSequence then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected ExecuteSequence else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farmbot_modelingPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getBooleanExpression() {
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanExpression(BooleanExpression newBooleanExpression, NotificationChain msgs) {
		BooleanExpression oldBooleanExpression = booleanExpression;
		booleanExpression = newBooleanExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION, oldBooleanExpression, newBooleanExpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanExpression(BooleanExpression newBooleanExpression) {
		if (newBooleanExpression != booleanExpression) {
			NotificationChain msgs = null;
			if (booleanExpression != null)
				msgs = ((InternalEObject) booleanExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION, null, msgs);
			if (newBooleanExpression != null)
				msgs = ((InternalEObject) newBooleanExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION, null, msgs);
			msgs = basicSetBooleanExpression(newBooleanExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION,
					newBooleanExpression, newBooleanExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteSequence getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(ExecuteSequence newThen, NotificationChain msgs) {
		ExecuteSequence oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Farmbot_modelingPackage.IF__THEN, oldThen, newThen);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(ExecuteSequence newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject) then).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject) newThen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.IF__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteSequence getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(ExecuteSequence newElse, NotificationChain msgs) {
		ExecuteSequence oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Farmbot_modelingPackage.IF__ELSE, oldElse, newElse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ExecuteSequence newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject) else_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject) newElse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Farmbot_modelingPackage.IF__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.IF__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION:
			return basicSetBooleanExpression(null, msgs);
		case Farmbot_modelingPackage.IF__THEN:
			return basicSetThen(null, msgs);
		case Farmbot_modelingPackage.IF__ELSE:
			return basicSetElse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION:
			return getBooleanExpression();
		case Farmbot_modelingPackage.IF__THEN:
			return getThen();
		case Farmbot_modelingPackage.IF__ELSE:
			return getElse();
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
		case Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION:
			setBooleanExpression((BooleanExpression) newValue);
			return;
		case Farmbot_modelingPackage.IF__THEN:
			setThen((ExecuteSequence) newValue);
			return;
		case Farmbot_modelingPackage.IF__ELSE:
			setElse((ExecuteSequence) newValue);
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
		case Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION:
			setBooleanExpression((BooleanExpression) null);
			return;
		case Farmbot_modelingPackage.IF__THEN:
			setThen((ExecuteSequence) null);
			return;
		case Farmbot_modelingPackage.IF__ELSE:
			setElse((ExecuteSequence) null);
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
		case Farmbot_modelingPackage.IF__BOOLEAN_EXPRESSION:
			return booleanExpression != null;
		case Farmbot_modelingPackage.IF__THEN:
			return then != null;
		case Farmbot_modelingPackage.IF__ELSE:
			return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl

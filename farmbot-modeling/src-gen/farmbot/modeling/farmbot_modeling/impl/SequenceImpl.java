/**
 */
package farmbot.modeling.farmbot_modeling.impl;

import farmbot.modeling.farmbot_modeling.Farmbot_modelingPackage;
import farmbot.modeling.farmbot_modeling.If;
import farmbot.modeling.farmbot_modeling.Sequence;
import farmbot.modeling.farmbot_modeling.SequenceInstruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.SequenceImpl#getIf <em>If</em>}</li>
 *   <li>{@link farmbot.modeling.farmbot_modeling.impl.SequenceImpl#getSequenceinstruction <em>Sequenceinstruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends InstructionImpl implements Sequence {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected EList<If> if_;

	/**
	 * The cached value of the '{@link #getSequenceinstruction() <em>Sequenceinstruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceinstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceInstruction> sequenceinstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farmbot_modelingPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farmbot_modelingPackage.SEQUENCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<If> getIf() {
		if (if_ == null) {
			if_ = new EObjectContainmentEList<If>(If.class, this, Farmbot_modelingPackage.SEQUENCE__IF);
		}
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceInstruction> getSequenceinstruction() {
		if (sequenceinstruction == null) {
			sequenceinstruction = new EObjectContainmentEList<SequenceInstruction>(SequenceInstruction.class, this,
					Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION);
		}
		return sequenceinstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Farmbot_modelingPackage.SEQUENCE__IF:
			return ((InternalEList<?>) getIf()).basicRemove(otherEnd, msgs);
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
			return ((InternalEList<?>) getSequenceinstruction()).basicRemove(otherEnd, msgs);
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
		case Farmbot_modelingPackage.SEQUENCE__NAME:
			return getName();
		case Farmbot_modelingPackage.SEQUENCE__IF:
			return getIf();
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
			return getSequenceinstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Farmbot_modelingPackage.SEQUENCE__NAME:
			setName((String) newValue);
			return;
		case Farmbot_modelingPackage.SEQUENCE__IF:
			getIf().clear();
			getIf().addAll((Collection<? extends If>) newValue);
			return;
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
			getSequenceinstruction().clear();
			getSequenceinstruction().addAll((Collection<? extends SequenceInstruction>) newValue);
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
		case Farmbot_modelingPackage.SEQUENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Farmbot_modelingPackage.SEQUENCE__IF:
			getIf().clear();
			return;
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
			getSequenceinstruction().clear();
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
		case Farmbot_modelingPackage.SEQUENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Farmbot_modelingPackage.SEQUENCE__IF:
			return if_ != null && !if_.isEmpty();
		case Farmbot_modelingPackage.SEQUENCE__SEQUENCEINSTRUCTION:
			return sequenceinstruction != null && !sequenceinstruction.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl

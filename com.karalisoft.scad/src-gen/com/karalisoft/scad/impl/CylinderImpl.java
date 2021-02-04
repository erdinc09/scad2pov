/**
 * generated by Xtext 2.24.0
 */
package com.karalisoft.scad.impl;

import com.karalisoft.scad.Cylinder;
import com.karalisoft.scad.CylinderParams;
import com.karalisoft.scad.ScadPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.karalisoft.scad.impl.CylinderImpl#getCylinderParams <em>Cylinder Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CylinderImpl extends MinimalEObjectImpl.Container implements Cylinder
{
  /**
   * The cached value of the '{@link #getCylinderParams() <em>Cylinder Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCylinderParams()
   * @generated
   * @ordered
   */
  protected EList<CylinderParams> cylinderParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CylinderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScadPackage.Literals.CYLINDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CylinderParams> getCylinderParams()
  {
    if (cylinderParams == null)
    {
      cylinderParams = new EObjectContainmentEList<CylinderParams>(CylinderParams.class, this, ScadPackage.CYLINDER__CYLINDER_PARAMS);
    }
    return cylinderParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScadPackage.CYLINDER__CYLINDER_PARAMS:
        return ((InternalEList<?>)getCylinderParams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScadPackage.CYLINDER__CYLINDER_PARAMS:
        return getCylinderParams();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScadPackage.CYLINDER__CYLINDER_PARAMS:
        getCylinderParams().clear();
        getCylinderParams().addAll((Collection<? extends CylinderParams>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScadPackage.CYLINDER__CYLINDER_PARAMS:
        getCylinderParams().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScadPackage.CYLINDER__CYLINDER_PARAMS:
        return cylinderParams != null && !cylinderParams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CylinderImpl

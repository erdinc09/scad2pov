/**
 * generated by Xtext 2.24.0
 */
package com.karalisoft.scad.impl;

import com.karalisoft.scad.ScadPackage;
import com.karalisoft.scad.SphereParams;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sphere Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.karalisoft.scad.impl.SphereParamsImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link com.karalisoft.scad.impl.SphereParamsImpl#getFa <em>Fa</em>}</li>
 *   <li>{@link com.karalisoft.scad.impl.SphereParamsImpl#getFs <em>Fs</em>}</li>
 *   <li>{@link com.karalisoft.scad.impl.SphereParamsImpl#getR <em>R</em>}</li>
 *   <li>{@link com.karalisoft.scad.impl.SphereParamsImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SphereParamsImpl extends MinimalEObjectImpl.Container implements SphereParams
{
  /**
   * The default value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected static final Double FN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected Double fn = FN_EDEFAULT;

  /**
   * The default value of the '{@link #getFa() <em>Fa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFa()
   * @generated
   * @ordered
   */
  protected static final Double FA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFa() <em>Fa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFa()
   * @generated
   * @ordered
   */
  protected Double fa = FA_EDEFAULT;

  /**
   * The default value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected static final Double FS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected Double fs = FS_EDEFAULT;

  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final Double R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected Double r = R_EDEFAULT;

  /**
   * The default value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected static final Double D_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Double d = D_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SphereParamsImpl()
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
    return ScadPackage.Literals.SPHERE_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFn(Double newFn)
  {
    Double oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScadPackage.SPHERE_PARAMS__FN, oldFn, fn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getFa()
  {
    return fa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFa(Double newFa)
  {
    Double oldFa = fa;
    fa = newFa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScadPackage.SPHERE_PARAMS__FA, oldFa, fa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getFs()
  {
    return fs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFs(Double newFs)
  {
    Double oldFs = fs;
    fs = newFs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScadPackage.SPHERE_PARAMS__FS, oldFs, fs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setR(Double newR)
  {
    Double oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScadPackage.SPHERE_PARAMS__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setD(Double newD)
  {
    Double oldD = d;
    d = newD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScadPackage.SPHERE_PARAMS__D, oldD, d));
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
      case ScadPackage.SPHERE_PARAMS__FN:
        return getFn();
      case ScadPackage.SPHERE_PARAMS__FA:
        return getFa();
      case ScadPackage.SPHERE_PARAMS__FS:
        return getFs();
      case ScadPackage.SPHERE_PARAMS__R:
        return getR();
      case ScadPackage.SPHERE_PARAMS__D:
        return getD();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScadPackage.SPHERE_PARAMS__FN:
        setFn((Double)newValue);
        return;
      case ScadPackage.SPHERE_PARAMS__FA:
        setFa((Double)newValue);
        return;
      case ScadPackage.SPHERE_PARAMS__FS:
        setFs((Double)newValue);
        return;
      case ScadPackage.SPHERE_PARAMS__R:
        setR((Double)newValue);
        return;
      case ScadPackage.SPHERE_PARAMS__D:
        setD((Double)newValue);
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
      case ScadPackage.SPHERE_PARAMS__FN:
        setFn(FN_EDEFAULT);
        return;
      case ScadPackage.SPHERE_PARAMS__FA:
        setFa(FA_EDEFAULT);
        return;
      case ScadPackage.SPHERE_PARAMS__FS:
        setFs(FS_EDEFAULT);
        return;
      case ScadPackage.SPHERE_PARAMS__R:
        setR(R_EDEFAULT);
        return;
      case ScadPackage.SPHERE_PARAMS__D:
        setD(D_EDEFAULT);
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
      case ScadPackage.SPHERE_PARAMS__FN:
        return FN_EDEFAULT == null ? fn != null : !FN_EDEFAULT.equals(fn);
      case ScadPackage.SPHERE_PARAMS__FA:
        return FA_EDEFAULT == null ? fa != null : !FA_EDEFAULT.equals(fa);
      case ScadPackage.SPHERE_PARAMS__FS:
        return FS_EDEFAULT == null ? fs != null : !FS_EDEFAULT.equals(fs);
      case ScadPackage.SPHERE_PARAMS__R:
        return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
      case ScadPackage.SPHERE_PARAMS__D:
        return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (fn: ");
    result.append(fn);
    result.append(", fa: ");
    result.append(fa);
    result.append(", fs: ");
    result.append(fs);
    result.append(", r: ");
    result.append(r);
    result.append(", d: ");
    result.append(d);
    result.append(')');
    return result.toString();
  }

} //SphereParamsImpl

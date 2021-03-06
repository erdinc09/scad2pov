/**
 * generated by Xtext 2.24.0
 */
package com.karalisoft.scad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.karalisoft.scad.Sphere#getSphereParams <em>Sphere Params</em>}</li>
 * </ul>
 *
 * @see com.karalisoft.scad.ScadPackage#getSphere()
 * @model
 * @generated
 */
public interface Sphere extends EObject
{
  /**
   * Returns the value of the '<em><b>Sphere Params</b></em>' containment reference list.
   * The list contents are of type {@link com.karalisoft.scad.SphereParams}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sphere Params</em>' containment reference list.
   * @see com.karalisoft.scad.ScadPackage#getSphere_SphereParams()
   * @model containment="true"
   * @generated
   */
  EList<SphereParams> getSphereParams();

} // Sphere

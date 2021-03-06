/**
 * generated by Xtext 2.24.0
 */
package com.karalisoft.scad;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.karalisoft.scad.Union#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @see com.karalisoft.scad.ScadPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends EObject
{
  /**
   * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shapes</em>' containment reference list.
   * @see com.karalisoft.scad.ScadPackage#getUnion_Shapes()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getShapes();

} // Union

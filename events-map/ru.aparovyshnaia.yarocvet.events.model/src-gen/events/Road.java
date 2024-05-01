/**
 */
package events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.Road#getTowns <em>Towns</em>}</li>
 * </ul>
 *
 * @see events.EventsPackage#getRoad()
 * @model
 * @generated
 */
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Towns</b></em>' reference list.
	 * The list contents are of type {@link events.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towns</em>' reference list.
	 * @see events.EventsPackage#getRoad_Towns()
	 * @model required="true"
	 * @generated
	 */
	EList<Town> getTowns();

} // Road

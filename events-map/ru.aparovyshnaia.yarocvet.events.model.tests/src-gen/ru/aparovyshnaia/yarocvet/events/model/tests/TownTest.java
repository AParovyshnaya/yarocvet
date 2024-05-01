/**
 */
package ru.aparovyshnaia.yarocvet.events.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.aparovyshnaia.yarocvet.events.model.api.Town;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Town</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TownTest extends TestCase {

	/**
	 * The fixture for this Town test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Town fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TownTest.class);
	}

	/**
	 * Constructs a new Town test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Town test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Town fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Town test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Town getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EventsFactory.eINSTANCE.createTown());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TownTest

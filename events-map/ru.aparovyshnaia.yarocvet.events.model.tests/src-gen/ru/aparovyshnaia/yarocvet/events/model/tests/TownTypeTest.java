/**
 */
package ru.aparovyshnaia.yarocvet.events.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.aparovyshnaia.yarocvet.events.model.api.TownType;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Town Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TownTypeTest extends TestCase {

	/**
	 * The fixture for this Town Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TownType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TownTypeTest.class);
	}

	/**
	 * Constructs a new Town Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Town Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TownType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Town Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TownType getFixture() {
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
		setFixture(EventsFactory.eINSTANCE.createTownType());
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

} //TownTypeTest

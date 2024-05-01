/**
 */
package ru.aparovyshnaia.yarocvet.events.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.aparovyshnaia.yarocvet.events.model.api.Road;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoadTest extends TestCase {

	/**
	 * The fixture for this Road test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Road fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoadTest.class);
	}

	/**
	 * Constructs a new Road test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Road test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Road fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Road test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Road getFixture() {
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
		setFixture(EventsFactory.eINSTANCE.createRoad());
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

} //RoadTest

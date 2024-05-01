/**
 */
package ru.aparovyshnaia.yarocvet.events.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.aparovyshnaia.yarocvet.events.model.api.EventsMap;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsMapTest extends TestCase {

	/**
	 * The fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsMap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventsMapTest.class);
	}

	/**
	 * Constructs a new Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventsMap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsMap getFixture() {
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
		setFixture(EventsFactory.eINSTANCE.createEventsMap());
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

} //EventsMapTest

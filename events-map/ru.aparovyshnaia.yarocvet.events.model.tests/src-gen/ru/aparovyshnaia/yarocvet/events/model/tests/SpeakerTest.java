/**
 */
package ru.aparovyshnaia.yarocvet.events.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Speaker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeakerTest extends TestCase {

	/**
	 * The fixture for this Speaker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Speaker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpeakerTest.class);
	}

	/**
	 * Constructs a new Speaker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeakerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Speaker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Speaker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Speaker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Speaker getFixture() {
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
		setFixture(EventsFactory.eINSTANCE.createSpeaker());
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

} //SpeakerTest

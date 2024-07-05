/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Participants</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getParticipants()
 * @model
 * @generated
 */
public enum Participants implements Enumerator {
	/**
	 * The '<em><b>Schoolchildren</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOLCHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOLCHILDREN(0, "Schoolchildren", "Schoolchildren"),

	/**
	 * The '<em><b>Teachers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEACHERS_VALUE
	 * @generated
	 * @ordered
	 */
	TEACHERS(1, "Teachers", "Teachers"),

	/**
	 * The '<em><b>Preschoolers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCHOOLERS_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCHOOLERS(2, "Preschoolers", "Preschoolers"),

	/**
	 * The '<em><b>Parents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENTS_VALUE
	 * @generated
	 * @ordered
	 */
	PARENTS(3, "Parents", "Parents"),

	/**
	 * The '<em><b>College Students</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLEGE_STUDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	COLLEGE_STUDENTS(4, "CollegeStudents", "CollegeStudents"),

	/**
	 * The '<em><b>Univercity Students</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERCITY_STUDENTS_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERCITY_STUDENTS(5, "UnivercityStudents", "UnivercityStudents"),

	/**
	 * The '<em><b>Scientists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENTISTS_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENTISTS(6, "Scientists", "Scientists"),

	/**
	 * The '<em><b>Officials</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIALS_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIALS(7, "Officials", "Officials");

	/**
	 * The '<em><b>Schoolchildren</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOLCHILDREN
	 * @model name="Schoolchildren"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOLCHILDREN_VALUE = 0;

	/**
	 * The '<em><b>Teachers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEACHERS
	 * @model name="Teachers"
	 * @generated
	 * @ordered
	 */
	public static final int TEACHERS_VALUE = 1;

	/**
	 * The '<em><b>Preschoolers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCHOOLERS
	 * @model name="Preschoolers"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCHOOLERS_VALUE = 2;

	/**
	 * The '<em><b>Parents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENTS
	 * @model name="Parents"
	 * @generated
	 * @ordered
	 */
	public static final int PARENTS_VALUE = 3;

	/**
	 * The '<em><b>College Students</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLEGE_STUDENTS
	 * @model name="CollegeStudents"
	 * @generated
	 * @ordered
	 */
	public static final int COLLEGE_STUDENTS_VALUE = 4;

	/**
	 * The '<em><b>Univercity Students</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERCITY_STUDENTS
	 * @model name="UnivercityStudents"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERCITY_STUDENTS_VALUE = 5;

	/**
	 * The '<em><b>Scientists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENTISTS
	 * @model name="Scientists"
	 * @generated
	 * @ordered
	 */
	public static final int SCIENTISTS_VALUE = 6;

	/**
	 * The '<em><b>Officials</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIALS
	 * @model name="Officials"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIALS_VALUE = 7;

	/**
	 * An array of all the '<em><b>Participants</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Participants[] VALUES_ARRAY =
		new Participants[] {
			SCHOOLCHILDREN,
			TEACHERS,
			PRESCHOOLERS,
			PARENTS,
			COLLEGE_STUDENTS,
			UNIVERCITY_STUDENTS,
			SCIENTISTS,
			OFFICIALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Participants</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Participants> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participants</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Participants get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Participants result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participants</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Participants getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Participants result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participants</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Participants get(int value) {
		switch (value) {
			case SCHOOLCHILDREN_VALUE: return SCHOOLCHILDREN;
			case TEACHERS_VALUE: return TEACHERS;
			case PRESCHOOLERS_VALUE: return PRESCHOOLERS;
			case PARENTS_VALUE: return PARENTS;
			case COLLEGE_STUDENTS_VALUE: return COLLEGE_STUDENTS;
			case UNIVERCITY_STUDENTS_VALUE: return UNIVERCITY_STUDENTS;
			case SCIENTISTS_VALUE: return SCIENTISTS;
			case OFFICIALS_VALUE: return OFFICIALS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Participants(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Participants

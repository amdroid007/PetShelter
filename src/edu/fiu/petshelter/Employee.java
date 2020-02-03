/**
 * 
 */
package edu.fiu.petshelter;

/**
 * 
 * An employee is a subclass of Person
 * 
 * @author arijitsengupta
 *
 */
public class Employee extends Person {

	private String position;
	private String email;

	/**
	 * @param name Name of the person
	 * @param phonenumber phone number of person
	 * @param position position of the person in the shelter
	 * @param email email of the person
	 */
	public Employee(String name, String phonenumber, String position, String email) {
		super(name, phonenumber);
		this.position = position;
		this.email = email;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}

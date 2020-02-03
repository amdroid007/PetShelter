package edu.fiu.petshelter;

import java.util.ArrayList;

/**
 * The generic person class with contact information and pets
 * 
 * @author arijitsengupta
 *
 */
public class Person {
	
	private String name;
	private String phonenumber;
	
	private ArrayList<Animal> pets;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * Basic constructor for Person
	 * @param name name of person
	 * @param phonenumber phone number of person
	 */
	public Person(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
		pets = new ArrayList<Animal>();
	}

	/**
	 * Adopt an animal
	 * @param processedAnimal the animal who the person is adopting
	 */
	public void adopt(Animal processedAnimal) {
		pets.add(processedAnimal);
		
	}
	
	public String toString() {
		return name + " (phone: " + phonenumber + ")";
	}

}

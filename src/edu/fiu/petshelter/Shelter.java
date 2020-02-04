package edu.fiu.petshelter;

import java.util.Hashtable;

/**
 * This is the main Shelter class that has information on the Shelter
 * as well as the animals that it houses.
 * 
 * Includes a main method that runs the application
 * 
 * @author arijitsengupta
 *
 */
public class Shelter {
	
	private String name;
	private String address;
	private String phone;
	private Hashtable<String,Animal> animals;
	private Hashtable<String,Employee> employees;

	/**
	 * Get the number of available animals
	 * @return the number of animals
	 */
	public int numAnimals() {
		return animals.size();
	}

	/**
	 * Find an animal by name
	 * @param name name of animal to find
	 * @return the Animal with that name
	 */
	public Animal findAnimal(String name) {
		return animals.get(name);
	}

	/**
	 * Have all animals in the shelter make their sounds
	 */
	public void chorus() {
		animals.values().forEach((a) -> a.makeSound());	
	}

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Constructor for Shelter - uses name, address, phone to create a shelter
	 * initializes animals hashtable
	 * 
	 * @param name name of shelter
	 * @param address address of shelter
	 * @param phone phone number of shelter
	 */
	public Shelter(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.animals = new Hashtable<String,Animal>();
		this.employees = new Hashtable<String,Employee>();
	}

	/**
	 * Hire an employee into the shelter
	 * @param employee the employee we are hiring
	 */
	public void hire(Employee employee) {
		employees.put(employee.getName(), employee);
		System.out.println(employee.getName() + " joined " 
				+ getName() + " as " + employee.getPosition());
		
	}

	/**
	 * Process an Adoption
	 * @param adopter the person who is adopting the animal
	 * @param adoptee the animal that is getting adopted
	 */
	public void processAdoption(Person adopter, Animal adoptee) {
		Animal processedAnimal = animals.remove(adoptee.getName());
		adopter.adopt(processedAnimal);		
		System.out.println(adopter + " adopted " + adoptee);
	}

	/**
	 * Receive an animal into the shelter
	 * @param animal the animal that is received
	 * @param employee the employee who is receiving the animal
	 */
	public void receive(Animal animal, Employee employee) {
		System.out.println(employee.getName() + " received " + animal);
		animals.put(animal.getName(), animal);		
	}

	/**
	 * @return a string representation of the shelter
	 */
	public String toString() {
		return "Shelter Information: \n" +
		"\t Name: " + getName() + "\n" +
		"\t Address: " + getAddress() + "\n" + 
		"\t Phone: " + getPhone();		
	}

}

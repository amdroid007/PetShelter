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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The shelter story.");
		
		// Create a new Shelter
		Shelter myShelter = new Shelter("Jit's Shelter", "Miami", "111-2222");
		System.out.println(myShelter);

		// Hire some people
		System.out.println("\nBuilding the team..");
		myShelter.hire(new Employee("John", "555-1212", "owner", "john@shelter.org"));
		myShelter.hire(new Employee("Shiela", "555-3434", "admin", "shiela@shelter.org"));
		
		
		// Receive some animals
		System.out.println("\nWe are getting some animals!");
		myShelter.receive(new Dog("Bob", 24, "brown"), myShelter.employees.get("John"));
		myShelter.receive(new Cat("Roxie", 5, "tabbie"), myShelter.employees.get("Shiela"));
		myShelter.receive(new Bird("Coco", 2, "red", 3), myShelter.employees.get("Shiela"));
		
		// Let all animals go crazy
		System.out.println("\nAnimals are making a big ruccus!");
		myShelter.animals.values().forEach((a) -> a.makeSound());
		
		System.out.println("");
		Person joe = new Person("Joe", "123-456-78");
		myShelter.processAdoption(joe, myShelter.animals.get("Bob"));
		
		System.out.println("Now we have " + myShelter.animals.size() + " animals left.");
	}

	/**
	 * Hire an employee into the shelter
	 * @param employee the employee we are hiring
	 */
	private void hire(Employee employee) {
		employees.put(employee.getName(), employee);
		System.out.println(employee.getName() + " joined " 
				+ getName() + " as " + employee.getPosition());
		
	}

	/**
	 * Process an Adoption
	 * @param adopter the person who is adopting the animal
	 * @param adoptee the animal that is getting adopted
	 */
	private void processAdoption(Person adopter, Animal adoptee) {
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

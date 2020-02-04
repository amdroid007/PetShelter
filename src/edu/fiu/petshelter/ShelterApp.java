package edu.fiu.petshelter;

/**
 * 
 * A "driver" class - often called a controller class - that uses the model to
 * provide a connection between the UI and the logic. In this class we do not 
 * have any UI - so its just a simple class with nothing but a main method
 * that plays out the story.
 * 
 * @author arijitsengupta
 *
 */
public class ShelterApp {

	/**
	 * The main method to run the PetShelter Application and tell its story.
	 * The applications we will build in this class will not have much logic but
	 * will have the complete implementation of your design, including some basic
	 * storytelling, message passing and receiving to demonstrate the effectiveness
	 * of your design. 
	 * 
	 * I took a few coding liberties in this example to keep it short, but you will
	 * see more details of the method as we proceed through this class.
	 * 
	 * @param args command line arguments (none expected in this application)
	 */
	public static void main(String[] args) {
		System.out.println("The shelter story.");
		
		// Create a new Shelter
		Shelter myShelter = new Shelter("Jit's Shelter", "Miami", "111-2222");
		System.out.println(myShelter);

		// Hire some people
		System.out.println("\nBuilding the team..");
		Employee john = new Employee("John", "555-1212", "owner", "john@shelter.org");
		Employee shiela = new Employee("Shiela", "555-3434", "admin", "shiela@shelter.org");
		myShelter.hire(john);
		myShelter.hire(shiela);
		
		
		// Receive some animals
		System.out.println("\nWe are getting some animals!");
		myShelter.receive(new Dog("Bob", 24, "brown"), john);
		myShelter.receive(new Cat("Roxie", 5, "tabbie"), shiela);
		myShelter.receive(new Bird("Coco", 2, "red", 3), shiela);
		
		// Let all animals go crazy
		System.out.println("\n" + myShelter.numAnimals() + " animals are making a big ruccus!");
		myShelter.chorus();
		
		System.out.println("");
		Person joe = new Person("Joe", "123-456-78");
		myShelter.processAdoption(joe, myShelter.findAnimal("Bob"));
		
		System.out.println("Now we have " + myShelter.numAnimals() + " animals left.");
	}
}

package edu.fiu.petshelter;

/**
 * 
 * Dog - a subclass of Animal representing dogs
 * 
 * @author arijitsengupta
 *
 */
public class Dog extends Animal {

	/**
	 * Base constructor of Dog
	 * 
	 * @param name name of dog
	 * @param age age of dog (in months)
	 * @param color color of dog
	 */
	public Dog(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " says woof!");
		
	}

}

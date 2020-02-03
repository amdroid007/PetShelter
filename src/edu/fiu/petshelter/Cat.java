package edu.fiu.petshelter;

/**
 * The Cat class as a subclass of Animal
 * 
 * @author arijitsengupta
 *
 */
public class Cat extends Animal {

	/**
	 * Base constructor of Cat
	 * 
	 * @param name name of cat
	 * @param age age of cat (in months)
	 * @param color color of cat
	 */
	public Cat(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " says meow!");
		
	}

}

package edu.fiu.petshelter;

/**
 * 
 * The Bird class as a subclass of Animal
 * 
 * @author arijitsengupta
 *
 */
public class Bird extends Animal {
	private int wingspan;

	/**
	 * Constructor for bird
	 * 
	 * @param name name of bird
	 * @param age  age of bird
	 * @param color color of bird
	 * @param wingspan wingspan of bird
	 */
	public Bird(String name, int age, String color, int wingspan) {
		super(name, age, color);
		this.wingspan = wingspan;
	}

	/**
	 * @return the wingspan
	 */
	public int getWingspan() {
		return wingspan;
	}

	/**
	 * @param wingspan the wingspan to set
	 */
	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String toString() {
		return super.toString() + " with wingspan of " + wingspan + " ft.";
	}
	@Override
	public void makeSound() {
		System.out.println(getName() + " says chirp!");
		
	}

}

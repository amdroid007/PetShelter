package edu.fiu.petshelter;

/**
 * @author arijitsengupta
 *
 */
public class Bird extends Animal {
	private int wingspan;

	/**
	 * @param name
	 * @param age
	 * @param color
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

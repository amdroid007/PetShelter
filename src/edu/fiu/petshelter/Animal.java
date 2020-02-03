package edu.fiu.petshelter;

/**
 * The base Animal Class - includes basic information on animals
 * 
 * @author arijitsengupta
 *
 */
public abstract class Animal {
	private String name;
	private int age;
	private String color;
	
	public Animal(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	/**
	 * Make a sound
	 */
	public abstract void makeSound();
	
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "a " + getClass().getSimpleName() + " named " + getName() + 
				"(age: " + getAge() + " months, color: " + getColor() + ")";
	}
}

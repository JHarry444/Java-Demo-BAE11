package objects;

public class Dog {

	// instance variables
	private int age;

	private String name;

	private String colour;

	private String breed;

	// constructor - makes objects (dogs in this case)
	public Dog(int age, String name, String colour, String breed) {
		System.out.println("Current age: " + this.age);
		System.out.println("New age: " + age);
		this.age = age;
		this.name = name;
		this.colour = colour;
		this.breed = breed;
	}

	// methods
	public String bark() {
		return "Woof Woof!";
	}

	public void setAge(int age) {
		if (age >= 0 && age < 20) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void print() {
		System.out.println("Hi! I'm " + this.name + ", i'm a " + this.colour + " " + this.breed + " and i'm " + this.age
				+ " years old! " + this.bark());
	}

}

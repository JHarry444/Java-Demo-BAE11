package objects;

public class Dog {

	// instance variables
	public int age;

	public String name;

	public String colour;

	public String breed;

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

}

package objects.inheritance;

public abstract class Mammal {

	private int age;

	private String name;

	private String colour;

	private String breed;

	public Mammal() {
		super();
	}

	public Mammal(int age, String name, String colour, String breed) {
		if (age > 0 && age < 100) {
			this.age = age;
		}
		this.name = name;
		this.colour = colour;
		this.breed = breed;
	}

	public abstract String makeNoise();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		}
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
		System.out.println("Hi! I'm " + this.getName() + ", i'm a " + this.getColour() + " " + this.getBreed()
				+ " and i'm " + this.getAge() + " years old! " + this.makeNoise());
	}

}

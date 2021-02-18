package objects.inheritance;

public class Cat extends Mammal {

	public Cat(int age, String name, String colour, String breed) {
		super(age, name, colour, breed);
	}

	@Override
	public String makeNoise() {
		return "Meow";
	}

	public void scheme() {
		System.out.println("As soon as I figure out how to use a can opener you're a dead man.");
	}
}

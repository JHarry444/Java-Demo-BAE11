package objects;

public class GoodDogApp {

	public static void main(String[] args) {
		// class var_name object
		/*
		 * Dog dog1 = new Dog(); dog1.age = 12; dog1.name = "Rex"; dog1.colour = "Grey";
		 * dog1.breed = "Greyhound";
		 * 
		 * printDog(dog1);
		 */

		Dog dog2 = new Dog(6, "Fluff", "Blonde", "Malamute");

		printDog(dog2);
	}

	public static void printDog(Dog dog) {
		System.out.println("Hi! I'm " + dog.name + ", i'm a " + dog.colour + " " + dog.breed + " and i'm " + dog.age
				+ " years old! " + dog.bark());
	}

}

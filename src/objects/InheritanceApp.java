package objects;

import java.util.ArrayList;

import objects.inheritance.Cat;
import objects.inheritance.Dog;
import objects.inheritance.Mammal;

public class InheritanceApp {

	public static void main(String[] args) {
		Dog dog1 = new Dog(12, "Red", "Clifford", "Big", "Blue");

//		dog1.print();

		dog1.fetch();

		Mammal mammal1 = new Dog(9, "Fluffy", "Blonde", "Malamute", "Red");

		mammal1.makeNoise();

		Cat cat1 = new Cat(6, "Black", "Felix", "Maine Coon");

//		cat1.print();

		cat1.scheme();

		Demo d = new Demo();

		ArrayList<Mammal> mammals = new ArrayList<>();

		mammals.add(cat1);
		mammals.add(dog1);

		for (Mammal mammal : mammals) {
			System.out.println(mammal.makeNoise());
		}

		Mammal m1 = new Mammal();
		m1.setAge(99);
		Mammal m2 = new Mammal(27, "Barry", "White", "Geordie");

	}
}

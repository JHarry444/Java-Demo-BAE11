package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import generics.BadCage;
import generics.ChadCage;
import interfaces.Penguin;
import objects.inheritance.Animal;
import objects.inheritance.Cat;
import objects.inheritance.Dog;

public class MapApp {

	public static void main(String[] args) {
		Map<Integer, Animal> animals = new HashMap<>();

		animals.put(1, new Penguin("Oswald"));

		animals.put(2, new Dog(14, "Rex", "Blonde", "Boxer", "Black"));

		animals.put(2, new Cat(6, "Felix", "Black", "Cat"));

		int id = 2;
		if (animals.containsKey(id)) {
			Animal animal = animals.get(id);
			System.out.println(animal);
		}

		System.out.println(animals.keySet());

		Set<Animal> animalSet = new HashSet<>();

		animalSet.add(new Dog(14, "Rex", "Blonde", "Boxer", "Black"));
		animalSet.add(new Dog(14, "Rex", "Blonde", "Boxer", "Black"));

		System.out.println(animalSet);

		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Dog(14, "Rex", "Blonde", "Boxer", "Black"));

		Animal animal = animalList.get(0);

		List<String> words = new ArrayList<>();
		words.add("bloop");

		String word = words.get(0);

		setVal("bloop");

		if (getVal() instanceof String) {
			String word2 = (String) getVal(); // casting Object -> String
		}

		BadCage kennel = new BadCage();

		kennel.setAnimal(new Dog(14, "Rex", "Blonde", "Boxer", "Black"));

		Animal rex = kennel.getAnimal();

		if (rex instanceof Dog) {
			((Dog) rex).fetch(); // casting Animal -> Dog to access fetch()
		}

		ChadCage<Dog> kennel2 = new ChadCage<>();

		kennel2.setAnimal(new Dog(14, "Rex", "Blonde", "Boxer", "Black"));

		Dog dog = kennel2.getAnimal();
	}

	// bad
	private static Object val;

	public static Object getVal() {
		return val;
	}

	public static void setVal(Object val) {
		MapApp.val = val;
	}

}

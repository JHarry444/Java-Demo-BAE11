//package objects;
//
//import java.util.ArrayList;
//
//import objects.inheritance.Dog;
//
//public class GoodDogApp {
//
//	public static void main(String[] args) {
//		// class var_name object
//		/*
//		 * Dog dog1 = new Dog(); dog1.age = 12; dog1.name = "Rex"; dog1.colour = "Grey";
//		 * dog1.breed = "Greyhound";
//		 * 
//		 * printDog(dog1);
//		 */
//
//		Dog dog2 = new Dog(6, "Fluff", "Blonde", "Malamute");
//
////		dog2.print();
//		System.out.println(dog2.getAge());
//
//		dog2.setAge(Integer.MAX_VALUE);
//
////		dog2.print();
//		System.out.println(dog2.getAge());
//
//		Dog[] dogs = { dog2 };
//
//		ArrayList<Dog> dogsList = new ArrayList<>();
//
//		dogsList.add(dog2);
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//		dogsList.add(new Dog(14, "Russell", "White", "Boxer"));
//
//		System.out.println(dogsList.size());
//
//		for (int i = 0; i < dogsList.size(); i++) {
//			Dog currentDog = dogsList.get(i);
//			currentDog.print();
//		}
//
//		// enhanced-for loop
//		// for each Dog in dogsList
//		for (Dog dog : dogsList) {
//			dog.print();
//			dogsList.remove(dog);
//		}
//	}
//
//}

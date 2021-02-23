package staticpkg;

public class StaticApp {

	public static void main(String[] args) {
		final float pi = 3.14152F;
//		pi++;

		System.out.println(Math.PI);

		final Person p1 = new Person("Paul");
		p1.setName("Fred");
		System.out.println(p1.getName());
		System.out.println(Person.latinName);

//		Person.latinName = "Bill";

		System.out.println(p1.latinName); // bad practice

		Person p2 = new Person("Barry");
		System.out.println(p2.getName());
		System.out.println(p2.latinName);

	}

}

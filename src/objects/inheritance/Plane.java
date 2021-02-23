package objects.inheritance;

public class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Flaps mechanically");
	}

}

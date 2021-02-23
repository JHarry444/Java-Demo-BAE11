package objects.inheritance;

public class Bat extends Mammal implements Flyable {

	@Override
	public String makeNoise() {
		return "SCREEEEEEEEEE";
	}

	@Override
	public void fly() {
		System.out.println("Flaps leatherly");
	}

}

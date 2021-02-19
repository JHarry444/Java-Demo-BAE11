package objects.inheritance;

public class Hamster extends Mammal {

	public Hamster() {
		super();
	}

	@Override
	public String makeNoise() {
		return "Squeak Squeak";
	}
}

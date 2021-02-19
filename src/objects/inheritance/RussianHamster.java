package objects.inheritance;

public class RussianHamster extends Hamster {

	@Override
	public void spinTheWheel() {
		makeNoise();
	}

	@Override
	public String makeNoise() {
		return "Squeak Squeak";
	}

}

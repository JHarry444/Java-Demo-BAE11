package interfaces;

public abstract class FlyingBird extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Flaps featherly");

	}

}

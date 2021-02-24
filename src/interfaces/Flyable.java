package interfaces;

public interface Flyable {

	final int MAX_HEIGHT = 40_000;

	void fly();

	default void crash() {
		System.out.println("AHHHHHHHHHHHHHH");
	}
}

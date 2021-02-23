package objects;

import java.util.ArrayList;
import java.util.List;

import objects.inheritance.Bat;
import objects.inheritance.Flyable;
import objects.inheritance.Plane;
import objects.inheritance.Robin;

public class InterfaceApp {

	public static void main(String[] args) {
		List<Flyable> flyingThings = new ArrayList<>();

		flyingThings.add(new Bat());

		flyingThings.add(new Robin());

		flyingThings.add(new Plane());

		for (Flyable f : flyingThings) {
			f.fly();
//			f.makeNoise();
		}
	}

}

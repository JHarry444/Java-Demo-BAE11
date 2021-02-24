package generics;

import objects.inheritance.Animal;

public class ChadCage<T extends Animal> {

	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

}

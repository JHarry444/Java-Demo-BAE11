package objects.inheritance;

public class Dog extends Mammal {

	private String collarColour;

	public Dog(int age, String name, String colour, String breed, String colarColour) {
		super(age, name, colour, breed);
		this.setCollarColour(colarColour);
	}

	@Override
	public String makeNoise() {
		return "Woof Woof!";
	}

	@Override
	public void setAge(int age) {
		if (age > 0 && age < 20) {
			super.setAge(age);
		}
	}

	public void fetch() {
		System.out.println("drop it, drop it! DROP IT!");
	}

	public String getCollarColour() {
		return collarColour;
	}

	public void setCollarColour(String collarColour) {
		this.collarColour = collarColour;
	}

}

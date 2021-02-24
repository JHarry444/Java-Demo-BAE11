package objects.inheritance;

public class Dog extends Mammal {

	private String collarColour;

	public Dog(int age, String name, String colour, String breed, String colarColour) {
		super(age, name, colour, breed);
		this.setCollarColour(colarColour);
	}

	@Override
	public String toString() {
		return "Dog [collarColour=" + collarColour + ", getAge()=" + getAge() + ", getName()=" + getName()
				+ ", getColour()=" + getColour() + ", getBreed()=" + getBreed() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collarColour == null) ? 0 : collarColour.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (collarColour == null) {
			if (other.collarColour != null)
				return false;
		} else if (!collarColour.equals(other.collarColour))
			return false;
		return true;
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

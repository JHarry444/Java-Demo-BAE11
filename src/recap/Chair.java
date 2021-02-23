package recap;

public class Chair {

	private int noOfLegs;

	public Chair(int noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfLegs;
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
		Chair other = (Chair) obj;
		if (noOfLegs != other.noOfLegs)
			return false;
		return true;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}

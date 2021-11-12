package Lab3.prob4;

public class Condo extends Property{
	private int numFloors;

	public Condo(int numFloors, Address address) {
		super(address);
		this.numFloors = numFloors;
	}

	public double getNumFloors() {
		return numFloors;
	}

	@Override
	double computeRent() {
		return 400 * numFloors;
	}
}

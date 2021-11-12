package Lab3.prob4;

public class Trailer extends Property{
	public Trailer(Address address) {
		super(address);
	}

	@Override
	double computeRent() {
		return 500;
	}
}

package Lab3.prob4;

public class House extends Property{
	private double lotSize;
	

	public House(double lotSize, Address address) {
		super(address);
		this.lotSize = lotSize;
	}

	public double getLotSize() {
		return lotSize;
	}

	@Override
	double computeRent() {
		return 0.1 * lotSize;
	}

}

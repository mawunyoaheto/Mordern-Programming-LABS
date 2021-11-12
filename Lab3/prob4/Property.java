package Lab3.prob4;

public abstract class Property {
	private Address address;
	
	
Property(Address address){
	this.address = address;
}
	abstract double computeRent();



	public Address getAddress() {
		return address;
	}
	
	
}

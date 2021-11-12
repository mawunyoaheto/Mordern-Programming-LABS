package Lab2.prob2B_Factory;

public class OrderLine {
	
	private Order ord;
	private String name;
	
	
	OrderLine(Order ord){
		this.ord=ord;
		
	}


	public Order getOrd() {
		return ord;
	}


	public String getName() {
		return name;
	}





	@Override
	public String toString() {
		
		return name;
	}

	
}

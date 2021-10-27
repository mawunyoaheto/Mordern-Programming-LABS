package Lab2.prob2B;

public class OrderLine {
	
	private Order ord;
	private String name;
	
	
	OrderLine(Order ord, String name){
		this.ord=ord;
		this.name=name;
		
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

package Lab2.prob2B_Factory;

public class OrderOrderlinetFactory {
	public static Order createOrder(int orderNum) {
		if(orderNum <=0) 
			throw new IllegalArgumentException("Customer name cannot be null");
		
		Order ord = new Order(orderNum);
		
		
		OrderLine ordLine = new OrderLine(ord);
		
		ord.setOrderline(null);
		
		return ord;
		
	}

}

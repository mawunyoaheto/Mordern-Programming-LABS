package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	
private int orderNum;
	private List<OrderLine> orderline = new ArrayList<OrderLine>();
	
	public Order(int orderNum) {
		
		this.orderNum=orderNum;
		
	}

	public int getOrderNum() {
		return orderNum;
	}

	public List<OrderLine> getOrderline() {
		return orderline;
	}
	
	
	public void addOrderLine(String name) {
		
		OrderLine ord = new OrderLine(this, name);
		orderline.add(ord);
	}

	@Override
	public String toString() {
		
		return orderline.toString();
	}
	
	
	
}

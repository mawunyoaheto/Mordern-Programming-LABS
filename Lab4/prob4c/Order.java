package Lab4.prob4c;

import java.time.LocalDate;

public class Order {
	
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commisioned comm;
	
	
	Order(int orderNo, LocalDate orderDate, double orderAmount, Commisioned comm) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.comm=comm;
		
	}


	public int getOrderNo() {
		return orderNo;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public double getOrderAmount() {
		return orderAmount;
	}
	
	
	

}

package Lab4.prob4c;

import java.util.ArrayList;
import java.util.List;

public class Commisioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> orders = new ArrayList<>();
	
	
	public Commisioned(String empId, double commission, double baseSalary, List<Order> order) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		
	}
	

	@Override
	public double calcGrossPay(int month, int year) {
		
		double orderCommission = 0.0;
		for(Order order: orders) {
			if(year == (int) order.getOrderDate().getYear() && month == order.getOrderDate().getMonthValue()) {
				orderCommission += order.getOrderAmount();
			}
		}
		return ((orderCommission*this.commission)/100)+this.baseSalary;
	}
	
	
	

}

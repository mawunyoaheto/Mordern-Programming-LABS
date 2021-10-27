package Lab2.prob2B;

public class Main {

	public static void main(String[] args) {
		
		Order myOrder = new Order(1);
		myOrder.addOrderLine("pants");
		myOrder.addOrderLine("shoes");
		myOrder.addOrderLine("watch");
		myOrder.addOrderLine("belt");
		myOrder.addOrderLine("jacket");
		
		System.out.println("Order number is: "+myOrder.getOrderNum());
		
		System.out.println("Order Details: " + myOrder.toString());

	}

}

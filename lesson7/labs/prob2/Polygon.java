package lesson7.labs.prob2;


public interface Polygon extends ClosedCurve{
	
	public abstract double[] getSides();
	
	
	public default double computePerimeter() {
		
		double total=0;
		
		for(double sides : getSides()) {
			
			total+=sides;
		}
		
		return total;
	}
		
		
		

}

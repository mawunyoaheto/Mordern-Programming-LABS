package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon{
	
	private double length;
	

	public EquilateralTriangle(double length) {
		super();
		this.length = length;
	}



	@Override
	public double[] getSides() {
		
		 double[] sides= {length,length, length};
		 
		 return sides;
	}

}

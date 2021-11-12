package Lab5.prob2;

public final class Circle implements Figure{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		
		return Math.PI*(radius*radius);
	}
	
	

}

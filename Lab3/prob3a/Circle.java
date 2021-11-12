package Lab3.prob3a;

public class Circle extends Cylinder{
	//private double radius;

	public Circle(double radius) {
		super(radius);
		//this.radius = radius;
	}

	public double getRadius() {
		//this.radius = radius;
		return super.getRadius();
	}

	public double computeArea() {
		double area = Math.PI * Math.sqrt(getRadius());
		return area;
	}
}

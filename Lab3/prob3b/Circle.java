package Lab3.prob3b;

public class Circle{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius(double radius) {
		this.radius = radius;
		return this.radius;
	}

	public double computeArea() {
		double area = Math.PI * Math.sqrt(radius);
		return area;
	}
}

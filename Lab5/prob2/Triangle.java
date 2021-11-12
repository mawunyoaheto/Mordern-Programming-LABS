package Lab5.prob2;

public final class Triangle implements Figure{
	
	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double computeArea() {
		
		return 0.5 *(base*height);
	}
	
	

}

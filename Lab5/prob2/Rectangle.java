package Lab5.prob2;

public final class Rectangle implements Figure{
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return height;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.height = length;
	}

	@Override
	public double computeArea() {
		
		return height * width;
	}
	
	

}

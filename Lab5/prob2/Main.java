package Lab5.prob2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Figure> figures = Arrays.asList(new Circle(5),new Rectangle(5, 7),new Triangle(9, 15));
		double totalArea =0;
		for(Figure f: figures) {
			
			totalArea+=f.computeArea();
			
			
		}

		System.out.println("Sum of Areas: "+totalArea);
	}

}

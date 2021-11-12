package lesson9.labs.pob9;

import java.util.stream.IntStream;

public class PrintSquares {
	
	public static void main(String[] args) {
		
		printSquares(4);
	}

	public static void printSquares(int n) {
		 	

		IntStream.iterate(1,x->genNextSquare(x))
		.limit(n)
		.forEach(val->System.out.println(val));

	}

	
	 public static int genNextSquare(int n) {
	        n = (int) Math.floor(Math.sqrt(n)) + 1;
	        return n * n;
	    }

}

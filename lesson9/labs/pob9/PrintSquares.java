package lesson9.labs.pob9;

import java.util.stream.IntStream;

public class PrintSquares {
	private static int num = 1;
	
	
	public static void main(String[] args) {
		
		printSquares(20);
	}

	public static void printSquares(int n) {
		 	
		
	IntStream.iterate(1,x->{
		num += 1;
		return num * num;
	}).limit(n).forEach(val->System.out.println(val));
	
	}

}

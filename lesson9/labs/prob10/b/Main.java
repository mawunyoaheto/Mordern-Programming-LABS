package lesson9.labs.prob10.b;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		Stream<String> stringStream = Stream.of("Bill","Thomas","Mary");
		System.out.println(stringStream.reduce("", (x,y)->x+((x=="")?"": ", ")+y));

	}

}

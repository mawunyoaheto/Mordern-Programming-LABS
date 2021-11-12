package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.*;

public class PrimeStream {
	final Supplier<Stream<BigInteger>> primes=() -> Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
	
	public static void main(String[] args) {
		
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
		
		
	}
	
	

	private void printFirstNPrimes(long n) {
		System.out.println(primes.get().limit(n).collect(Collectors.toList()));
		
	}

}

package lesson9.labs.prob11a;

import java.util.*;
import java.util.stream.Collectors;

//import lesson9.labs.prob11b.LambdaLibrary;



public class Main {
	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));


		System.out.println(emps.stream().filter(e->e.getSalary()> 100000)
				.filter(e->Character.toUpperCase(e.getLastName().charAt(0)) >=Character.toUpperCase('M') 
				&& Character.toUpperCase(e.getLastName().charAt(0)) <=Character.toUpperCase('Z'))
				.sorted(Comparator.comparing(Employee::getFirstName))
				.map(e->e.getFirstName()+" "+e.getLastName())
				.collect(Collectors.toList()));
		
		//System.out.println(LambdaLibrary.filtered.apply(emps, 10000, 'z'));
	}




}

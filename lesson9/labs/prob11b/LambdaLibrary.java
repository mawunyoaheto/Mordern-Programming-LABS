package lesson9.labs.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lesson9.labs.prob11a.Employee;
import lesson9.labs.prob11a.TriFunction;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, String> filtered = (list,x,m)->list.stream()
			.filter(e->e.getSalary()> x)
			.filter(e->Character.toUpperCase(e.getLastName().charAt(0)) >=Character.toUpperCase(m)) 
			.sorted(Comparator.comparing(Employee::getFirstName))
			.map(e->e.getFirstName()+" "+e.getLastName())
			.collect(Collectors.joining(", "));

}

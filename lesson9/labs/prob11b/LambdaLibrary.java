package lesson9.labs.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lesson9.labs.prob11a.Employee;
import lesson9.labs.prob11a.TriFunction;

public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Character, Character, List<String>> filtered = (emps,M,Z)->emps.stream()
			.filter(e->e.getSalary()> 100000)
			.filter(e->Character.toUpperCase(e.getLastName().charAt(0)) >=Character.toUpperCase(M) 
			&& Character.toUpperCase(e.getLastName().charAt(0)) <=Character.toUpperCase(Z))
			.sorted(Comparator.comparing(Employee::getFirstName))
			.map(e->e.getFirstName()+" "+e.getLastName())
			.collect(Collectors.toList());

}

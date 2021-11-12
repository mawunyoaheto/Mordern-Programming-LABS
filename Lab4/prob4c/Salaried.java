package Lab4.prob4c;

public class Salaried extends Employee{
	private double salary;

	public Salaried(String empID,double salary) {
		super(empID);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		
		return this.salary;
	}

	
	
}

package Lab4.prob4c;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private double hoursPerWeek;
	
	
	
	public Hourly(String empID, double hourlyWage, double hoursPerWeek) {
		super(empID);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	@Override
	public double calcGrossPay(int month, int year) {
	
		return hourlyWage * hoursPerWeek * 4;
	}

	
	
	
	
}

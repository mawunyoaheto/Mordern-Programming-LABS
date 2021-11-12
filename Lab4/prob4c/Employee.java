package Lab4.prob4c;

import java.time.LocalDate;

public abstract class Employee {
	
	private String empID;
	


	public Employee(String empID) {
		super();
		this.empID = empID;
	}

	public void print() {
		
		LocalDate now = LocalDate.now();
		System.out.println(calcCompensation(now.getMonthValue(), now.getYear()));
		
	}
	
	public Paycheck calcCompensation(int month, int year) {

		double grossPay = calcGrossPay(month, year);
		return new Paycheck(grossPay, Paycheck.Tax.FICA, Paycheck.Tax.State, 
				Paycheck.Tax.Local, Paycheck.Tax.Medicare, Paycheck.Tax.SocialSecurity);
	};
	
	public abstract double calcGrossPay(int month, int year);
	
	
	
}

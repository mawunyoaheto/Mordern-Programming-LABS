package Lab4.prob4c;

public class Paycheck {
	
	
	
	private double grossPay;
	
	
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	
	public Paycheck(double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
		super();
		this.grossPay = grossPay;
		this.fica = fica.getTaxVal();
		this.state = state.getTaxVal();
		this.local = local.getTaxVal();
		this.medicare = medicare.getTaxVal();
		this.socialSecurity = socialSecurity.getTaxVal();
	}
	
	
	public void print() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Pay details: \n "+ "  Gross Pay: " + grossPay + "\n"+ "  Fica: " + fica  + "\n" 
				+ "  State: " + state  + "\n" + "  Local: " + local  + "\n" 
				+ "  Medicare: " + medicare  + "\n" + "  Social Security: " + socialSecurity  + "\n" 
				+ "  NET PAY: " + getNetPay();
	}
	
	public double getNetPay() {
		return grossPay - grossPay * fica - grossPay * state- grossPay * local- grossPay * medicare
				        - grossPay * socialSecurity;
	}

	
	enum Tax {
		FICA(.23), State(.05), Local(.01), Medicare(.03), 
		   SocialSecurity(.075);
		private double taxVal;
		private Tax(double val) {
			this.taxVal = val;
		}
		public double getTaxVal() {
			return taxVal;
		}
	}
}

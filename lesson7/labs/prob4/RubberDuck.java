package lesson7.labs.prob4;

public class RubberDuck extends Duck{
	
	public RubberDuck() {

	}

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}
	
	@Override
	public void quack() {
		System.out.println("squeaking");
	}
}


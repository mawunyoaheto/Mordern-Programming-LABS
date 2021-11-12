package Lab5.prob1;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}

	@Override
	public void display() {
		System.out.println("display");
	}
}

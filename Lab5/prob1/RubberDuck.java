package Lab5.prob1;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}

}

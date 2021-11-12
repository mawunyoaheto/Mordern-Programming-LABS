package Lab5.prob1;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
			
			
	
	}
}

package Lab5.prob1;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		setFlyBehaviour(new CannotFly());
		setQuackBehaviour(new MuteQuack());
	}

}

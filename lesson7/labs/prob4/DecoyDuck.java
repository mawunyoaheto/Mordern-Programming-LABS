package lesson7.labs.prob4;

public class DecoyDuck extends Duck{
	
	public DecoyDuck() {
		
	}
	
	@Override
	public void fly() {
		System.out.println("cannot fly");
	}
	
	
	@Override
	public void quack() {
		System.out.println("cannot quack");
	}

}

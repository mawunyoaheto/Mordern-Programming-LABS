package Lab5.prob1;

public class Duck {
	
	private QuackBehaviour quackBehaviour;
	private FlyBehaviour flyBehaviour;
	
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void quack() {
		quackBehaviour.quack();
	}
	
	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	
	public void display() {
		System.out.println("displaying");
	}
	
	public void swim() {
		System.out.println("swimming");
	}
	

}

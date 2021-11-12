package lesson9.labs.prob12;
import java.util.Optional;

public class MySingletonGood {

	private static MySingletonGood instance = null;
	private MySingletonGood(){}
	public static MySingletonGood getInstance() {
		instance = Optional.ofNullable(instance).orElseGet(()->new MySingletonGood());
		return instance;
	}
}

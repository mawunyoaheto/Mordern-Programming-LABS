package lesson9.labs.prob12;

public class MySingletonLazy {
	
	private static MySingletonLazy instance = null;
	private MySingletonLazy(){}
	public static MySingletonLazy getInstance() {
		if(instance == null) {
			instance = new MySingletonLazy();
		}
		return instance;
	}

}

package lesson9.labs.prob12;

public class MySingletonTest {

	public static void main(String[] args) {

		System.out.println("\n *********MySingletonLazy implementation withiout Optional************\n");

		MySingletonLazy lazySingleton1 = MySingletonLazy.getInstance();
		System.out.println(lazySingleton1);
		MySingletonLazy lazySingleton2 = MySingletonLazy.getInstance();
		System.out.println(lazySingleton2);
		
		System.out.println("\n *********MySingletonGood implementation with Optional**********\n");
		MySingletonGood notLazySingleton1 = MySingletonGood.getInstance();
		System.out.println(notLazySingleton1);
		MySingletonGood notLazySingleton2 = MySingletonGood.getInstance();
		System.out.println(notLazySingleton2);
	}

}

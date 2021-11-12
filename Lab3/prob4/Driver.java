package Lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(9000,new Address("1091 Balmorial Drive","Delaware","OH",45015)), new Condo(2,new Address("500 S Jackson St","Chicago","TX",32457)), new Trailer(new Address("1000 N 4th St", "Fairfield", "IA", 52557)) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
		Admin.listProperties(objects);
	}
}

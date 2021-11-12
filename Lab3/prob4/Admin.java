package Lab3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			Property p = (Property) o;
			totalRent += p.computeRent();
			/*if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condo) {
				Condo h = (Condo) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}	*/
		}
		return totalRent;
	}
	
	public static void listProperties(Property[] properties) {
		System.out.println("\nList of properties: ");
		for (Property o : properties) {
			System.out.println(o.getClass().getSimpleName()+"Address: "+o.getAddress());
		}
	}
}

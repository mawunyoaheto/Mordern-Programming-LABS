package lesson9.labs.prob10.a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		Simple accum = new Simple(false);
		Optional<Simple> result = list.stream().reduce((Simple a,Simple b)->(a.flag||b.flag) ? ((a.flag)?a:b) : accum);
		return result.isPresent() ? result.get().flag : false;
}
	
}
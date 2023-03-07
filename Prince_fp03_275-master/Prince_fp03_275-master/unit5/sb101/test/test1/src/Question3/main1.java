package Question3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("prince", "sohan", "raj", "mohan", "sohan", "ashish", "priya", "deepak", "sunny",
				"navnit");

		List<String> ne = (List<String>) l.stream().filter(s -> s.length() % 2 == 0).map(s -> s.toUpperCase())
				.collect(Collectors.toList());

		ne.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.compareTo(o2) > 0) {
					return -1;
				} else if (o1.compareTo(o2) < 0) {
					return 1;
				} else {
					return 0;
				}

			}

		});
		l.forEach(System.out::println);
		System.out.println("******************");
		ne.forEach(System.out::println);

	}

}

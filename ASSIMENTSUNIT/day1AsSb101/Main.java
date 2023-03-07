
// import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Prince Kumar", "Patna", 2000));
		list.add(new Employee(2, "Rishu Kumar", "Sasaram", 8000));
		list.add(new Employee(3, "Alka Sinha", "Patna", 6000));
		list.add(new Employee(4, "Arpna Singh", "Patna", 7600));
		list.add(new Employee(5, "Sonam Roi", "Buxar", 3200));
		list.add(new Employee(6, "Juhi Kumari", "Buxar", 4500));
		list.add(new Employee(7, "Shobha Kumari", "Patna", 9000));
		list.add(new Employee(8, "Rishav Kumar", "Barh", 5200));
		list.add(new Employee(9, "Rimi Kumari", "Maliyabag", 3400));
		list.add(new Employee(10, "Priyanka Kumari", "Sasaram", 9300));

		list.forEach(S -> {
			if (S.getSalary() < 5000) {
				int res = S.getSalary();
				res = res + 1000;
				S.setSalary(res);
			}
		});
		// Collection.sort(list, (list1, list2) -> {
		// 	return list1.getName().compareTo(list2.getName());
		// });
		list.forEach(S -> System.out.println(S.getSalary()));
	}

}

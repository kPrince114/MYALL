import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class four {
    public static HashMap<String, Product> sortByValue(Map<String, Product> map)
	{     List<Map.Entry<String, Product> > list =
			new LinkedList<Map.Entry<String, Product> >(map.entrySet());
		    Collections.sort(list, new Comparator<Map.Entry<String, Product> >() {
			public int compare(Map.Entry<String, Product> o1,
							Map.Entry<String, Product> o2)
			{
				return ((String) o1.getValue().name).compareTo(o2.getValue().name);
			}
		});
		HashMap<String, Product> temp = new LinkedHashMap<String, Product>();
		for (Map.Entry<String, Product> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
    public static void main(String[] args) {
        Map<String, Product> map = new HashMap<>();
        map.put("patna", new Product(1, "biscute", 1, 20));
        map.put("delhi", new Product(2, "sampoo", 1, 2));
        map.put("mokama", new Product(3, "headphone", 1, 200));
        map.put("binar", new Product(4, "mobile", 1, 20000));
        map.put("goa", new Product(5, "car", 1, 2000000));
        Map<String, Product> hm1 = sortByValue(map);
		for (Map.Entry<String, Product> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() +
						", Value = " + en.getValue());
		}
       
    }
}

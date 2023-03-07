import java.util.*;
// import java.lang.*;
import day1.Student;
public class usingmapShortObj {
	public static HashMap<String, Student> sortByValue(HashMap<String, Student> st)
	{     List<Map.Entry<String, Student> > list =
			new LinkedList<Map.Entry<String, Student> >(st.entrySet());
		    Collections.sort(list, new Comparator<Map.Entry<String, Student> >() {
			public int compare(Map.Entry<String, Student> o1,
							Map.Entry<String, Student> o2)
			{
				return (o1.getValue().getname()).compareTo(o2.getValue().getname());
			}
		});
		HashMap<String, Student> temp = new LinkedHashMap<String, Student>();
		for (Map.Entry<String, Student> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
	public static void main(String[] args)
	{
		// HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // List<Student> st=new ArrayList<>();
        HashMap<String, Student> st= new HashMap<>();
        st.put("delhi",new Student(1, "prince", 10));
        st.put("pelhi",new Student(2, "arince", 11));
        st.put("kelhi",new Student(3, "drince", 13));
        st.put("jelhi",new Student(4, "erince", 14));
        st.put("aelhi",new Student(5, "crince", 15));
		Map<String, Student> hm1 = sortByValue(st);
		for (Map.Entry<String, Student> en : hm1.entrySet()) {
			System.out.println("Key = " + en.getKey() +
						", Value = " + en.getValue());
		}
	}
}

// package day9;

import java.util.*;

public class Hasmap {
    public static void main(String[] args) {
        //java.util.Map(I)           k,v pairs username->email
        // HashMap(c)           SortedMap(I)        HashTable
        //LinkedHashMap(c)      TreeMap(c)

        //Map
        //Entry(k, v)

        Map<Integer, String> hm= new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        //dups: replace.
        hm.put(2, "new value");
        hm.get(2);
        System.out.println(hm.getOrDefault(9, "the value isn't present"));;

        hm.forEach((k,v)-> System.out.println(k+" ---> "+v));
        hm.keySet().forEach(k -> hm.get(k));
        for(Map.Entry<Integer, String> entry: hm.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }
        Map<String, Student> hm1 = new HashMap<>();
        hm1.put("MH", new Student(10, "abc", 950));
        hm1.put("HP", new Student(11, "def", 900));
        hm1.put("MP", new Student(12, "ghi", 800));
        hm1.put("UK", new Student(13, "xyz", 959));
        //get all the state names.
        System.out.println(hm1.keySet());
        for(Student student: hm1.values())
            System.out.println(student);

        hm1
                .forEach((k, v)-> System.out.println(k+"--> "+v));

    }
}
// Footer

package day9;

// package day9;

import java.util.*;
public class linkHasmap {
    //It is a child class of HashMap, and it will preserve the sequence of all the entries.
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(null, null);
        System.out.println(hm);
    }
}
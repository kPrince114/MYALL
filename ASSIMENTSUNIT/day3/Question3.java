package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        //Create a List of Integers and Map each integer to their square inside another List.
        List<Integer> list=List.of(2,3,4,5,6,20);
        List<Integer> list1=list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(list1);

    }
}

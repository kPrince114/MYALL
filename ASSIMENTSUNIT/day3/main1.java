package day3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class main1 {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<>();
        //Q(1):---  Create a List of 5 product objects.
        list.add(new Product(1, "oil", 200, 2));
        list.add(new Product(2, "apple", 50, 3));
        list.add(new Product(3, "book", 70, 15));
        list.add(new Product(6, "copy", 1000, 21));
        list.add(new Product(5, "ap", 100, 2));
        //Q(2):---- From the product list filter the products whose quantity is more than 10 in aseparate List of Products.
        List<Product> newList=list.stream().filter(i->i.Quantity>10).collect(Collectors.toList());
       //newList.forEach(e->System.out.println(e));
       //Q(3):-- Sort the Filtered List of Products by the price in ascending order.
       list.stream().sorted((p1, p2)->{
        if(p1.Price>p2.Price){
            return 1;
        }
        else if(p1.Price<p2.Price){
            return -1;
        }
        return 0;
       }
       ).forEach(System.out::println);
       // Q(4):--- Print all the products one by one from both Lists (
        System.out.println("*********************************");
        list.forEach(e->System.out.println(e));

        // it is only sort which prdoct put in first
        //list.forEach(e->System.out.println(e));
    }
}

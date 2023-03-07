import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.TreeSet;

// import Product.Sortbyprice;

public class third {
    public static void main(String[] args) {
        // TreeSet<Product> lst=new TreeSet<>(new sortByPrice());
        ArrayList<Product> lst=new ArrayList<Product>();
        lst.add(new Product(1, "biscute", 1, 20));
        lst.add(new Product(2, "sampoo", 1, 2));
        lst.add(new Product(3, "headphone", 1, 200));
        lst.add(new Product(4, "mobile", 1, 20000));
        lst.add(new Product(5, "car", 1, 2000000));
        Collections.sort(lst,new sortByPrice());
      System.out.println(lst);

    }
}

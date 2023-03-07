package day1_ass1.Day1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        switch (input) {
            case 1:
                TreeSet<Employee> ts1 = new TreeSet<>(new SortByEmpId());
        
                ts1.add(new Employee(1929431, "Ashish Kumar", "Patna", 45000));
                ts1.add(new Employee(1929432, "Prince Kumar", "Patna City", 40000));
                ts1.add(new Employee(1929437, "Kundan Kumar", "Uma Cinema", 50000));
                ts1.add(new Employee(1929434, "Luv Kumar", "90 feet", 46000));
                ts1.add(new Employee(1929435, "Kritya Anand", "B.N College", 55000));
                ts1.add(new Employee(1929436, "Shashwat Mishra", "Varanasi", 65000));

                ts1.forEach(System.out::println);
                break;
            case 2:
                TreeSet<Employee> ts2 = new TreeSet<>(new SortByAddress());
        
                ts2.add(new Employee(1929431, "Ashish Kumar", "Patna", 45000));
                ts2.add(new Employee(1929432, "Prince Kumar", "Patna City", 40000));
                ts2.add(new Employee(1929433, "Kundan Kumar", "Uma Cinema", 50000));
                ts2.add(new Employee(1929434, "Luv Kumar", "90 feet", 46000));
                ts2.add(new Employee(1929435, "Kritya Anand", "B.N College", 55000));
                ts2.add(new Employee(1929436, "Shashwat Mishra", "Varanasi", 65000));

                ts2.forEach(System.out::println);
                break;
            case 3:
                TreeSet<Employee> ts3 = new TreeSet<>();
        
                ts3.add(new Employee(1929431, "Zshish Kumar", "Patna", 40000));
                ts3.add(new Employee(1929432, "Prince Kumar", "Patna City", 45000));
                ts3.add(new Employee(1929433, "Kundan Kumar", "Uma Cinema", 50000));
                ts3.add(new Employee(1929434, "Luv Kumar", "90 feet", 40000));
                ts3.add(new Employee(1929435, "Kritya Anand", "B.N College", 55000));
                ts3.add(new Employee(1929436, "Shashwat Mishra", "Varanasi", 65000));

                ts3.forEach(System.out::println);

                break;
            default:
                break;
        }

         List<Product> lst=new ArrayList<Product>();
         lst.add(new Product(345, "Raja", 25, 850));
         lst.add(new Product(765, "Rani", 25, 550));
         lst.add(new Product(656, "MahaRaja", 25, 950));
         lst.add(new Product(784, "RajaRani", 25, 1050));
        lst.add(new Product(12,"p",3,4));
         Collections.sort(lst,(lst1,lst2)->{
             return lst1.productName.compareTo(lst2.productName);
         });
         System.out.println(lst);
    }
}

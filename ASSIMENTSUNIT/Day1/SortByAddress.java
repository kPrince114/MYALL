package day1_ass1.Day1;
import java.util.Comparator;

class SortByAddress implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.address.compareTo(e2.address);
    }
}

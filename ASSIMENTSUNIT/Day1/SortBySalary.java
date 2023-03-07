package day1_ass1.Day1;
import java.util.Comparator;

class SortBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        if(e1.salary>e2.salary)
            return -1;
        else if(e1.salary<e2.salary)
            return 1;
        else 
            return e1.empName.compareTo(e2.empName);
    }
}

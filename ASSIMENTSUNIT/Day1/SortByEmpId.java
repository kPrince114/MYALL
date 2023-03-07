package day1_ass1.Day1;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1,Employee e2){

        return e1.empId-e2.empId;
    }
}

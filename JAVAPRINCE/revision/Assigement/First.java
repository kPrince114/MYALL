package Assigement;

import java.util.*;
public class First {
    
    // private static final String StudentDet = null;

    public static void main(String[] args) {
        
        StudentDet c1 = new StudentDet(1, "prince", "customer1");
        StudentDet c2 = new StudentDet(3, "aman", "customer3");
        StudentDet c3 = new StudentDet(2, "raj", "customer2");
        Set<StudentDet> treeSet= new TreeSet<>(new StudentDetComparator());
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
       //Collaction.sort(StudentDet,new StudentDetComparator());
       System.out.println(treeSet);
    }
    
   
}
class StudentDetComparator implements Comparator<StudentDet>{
    @Override
    public int compare(StudentDet o1, StudentDet o2) {
        if(o1.getOrderId()==o2.getOrderId())
            return 0;
        else if(o1.getOrderId() < o2.getOrderId())
            return -1;
        else
            return +1;
    }
}

class StudentDet {
    private int orderId;
    private String empName;
    private String address;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getempName() {
        return empName;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public StudentDet(int orderId, String empName, String address) {
        this.orderId = orderId;
        this.empName = empName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDet{" +
                "orderId=" + orderId +
                ", empName=" + empName +
                ", address='" + address + '\'' +
                '}';
    }
}
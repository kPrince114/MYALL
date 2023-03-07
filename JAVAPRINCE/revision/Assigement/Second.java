package Assigement;

// import java.util.*;
public class Second {
    public static void main(String[] args) {
        // Map<String, String> treeSet= new TreeMap<>();
        // StudentDet c1 = new StudentDet(1, "prince", "Patna");
        // StudentDet c2 = new StudentDet(3, "aman", "bihar");
        // StudentDet c3 = new StudentDet(2, "raj", "delhi");
        // treeSet.add(c1,"p");
        // treeSet.add(c2);
        // treeSet.add(c3);
    }
}
class StudentDet {
    private int rollNo;
    private String Name;
    private String address;
    
    public int getrollNo() {
        return rollNo;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public StudentDet(int rollNo, String Name, String address) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.address = address;
    }
    public void print (){
        System.out.println(this.rollNo);
    }

    @Override
    public String toString() {
        return "StudentDet{" +
                "rollNo=" + rollNo +
                ", Name=" + Name +
                ", address='" + address + '\'' +
                '}';
    }
}

// package java;

// import java.util.*;
/*
 * public class class_obj {
 * public static void main(String[] args) {
 * int a = 0;
 * int b;
 * functio obj = new functio(6, 38);
 * functio obj2 = new functio(obj.x, obj.y);
 * obj.setValue(30, 40);
 * a = obj.addition();
 * b = obj2.addition();
 * System.out.println(a);
 * System.out.println(b);
 * 
 * }
 * 
 * }
 */
/// *********apna collage */
/* */
// class Pen {
// String color;
// String type;

// public void write() {
// System.out.println("wrinng somthing('fun do something')");
// }

// public void printtype() {
// System.out.println(this.type);
// }

// }

// class Student {
// String name;
// int age;

// public void printSt() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// /// prameterside conturcture
// /*
// * Student(String name, int age) {
// * this.name = name;
// * this.age = age;
// * }
// */
// // non parametersize contru;
// Student(Student s2) {
// this.name = s2.name;
// this.age = s2.age;
// }

// Student() {

// }
// }

// public class class_obj {
// public static void main(String[] args) {
// Pen pen1 = new Pen();
// pen1.color = "blue";
// pen1.type = "bolpen";
// pen1.write();
// Pen pen2 = new Pen();
// pen2.color = "red";
// pen2.type = " JELPen";
// pen2.write();
// System.out.println(pen2.color);
// pen2.printtype();
// /*
// //* para meter contruter;
// Student s1 = new Student("prince", 24);
// */
// /*
// //copy contruted
// Student s1 = new Student();
// s1.name = "prince";
// s1.age = 23;
// Student s2 = new Student(s1);
// s1.printSt();
// */
// }
// }
// 
class Employee {
  int id;
  int salary;
  String name;

  public void printDetails() {
    System.out.println("My id is " + id);
    System.out.println("and my name is " + name);
  }

  public int getSalary() {
    // return this.salary;either this or that
    return salary;
  }
}

public class class_obj {
  public static void main(String[] args) {
    System.out.println("This is our custom class");
    Employee harry = new Employee(); // Instantiating a new Employee Object
    Employee john = new Employee(); // Instantiating a new Employee Object

    // Setting Attributes for Harry
    harry.id = 12;
    harry.salary = 34;
    harry.name = "CodeWithHarry";

    // Setting Attributes for John
    john.id = 17;
    john.salary = 12;
    john.name = "John Khandelwal";

    // Printing the Attributes
    // harry.printDetails();
    // john.printDetails();
    int salary = john.getSalary();
    System.out.println(salary);
    // System.out.println(harry.id);
    // System.out.println(harry.name);
  }
}
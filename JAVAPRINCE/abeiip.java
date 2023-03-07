
/*
 * privite
 * class Employee {
 * 
 * private int id;
 * private String name;
 * 
 * public String getName() {
 * return name;
 * }
 * 
 * public void setName(String n) {
 * name = n;
 * }
 * 
 * public void setId(int i) {
 * id = i;
 * }
 * 
 * public int getId() {
 * return id;
 * }
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * Employee emp1 = new Employee();
 * 
 * emp1.setName("Shubham");
 * System.out.println(emp1.getName());
 * emp1.setId(1);
 * System.out.println(emp1.getId());
 * 
 * }
 * }
 */
/*
 * class MyMainEmployee {
 * private int id;
 * private String name;
 * 
 * public MyMainEmployee() {
 * id = 0;
 * name = "Your-Name-Here";
 * }
 * 
 * public MyMainEmployee(String myName, int myId) {
 * id = myId;
 * name = myName;
 * }
 * 
 * public MyMainEmployee(String myName) {
 * id = 1;
 * name = myName;
 * }
 * 
 * public String getName() {
 * return name;
 * }
 * 
 * public void setName(String n) {
 * this.name = n;
 * }
 * 
 * public void setId(int i) {
 * this.id = i;
 * }
 * 
 * public int getId() {
 * return id;
 * }
 * }
 * public class abeiip {
 * public static void main(String[] args) {
 * MyMainEmployee harry = new MyMainEmployee("rajprincekumar", 12);
 * MyMainEmployee harry2 = new MyMainEmployee("prince");
 * MyMainEmployee harry1 = new MyMainEmployee();
 * // harry.setName("CodeWithHarry");
 * // harry.setId(34);
 * System.out.println(harry.getId());
 * System.out.println(harry.getName());
 * System.out.println(harry1.getId());
 * System.out.println(harry1.getName());
 * System.out.println(harry2.getId());
 * System.out.println(harry2.getName());
 * }
 * 
 * }
 */
/*
 * class Cylinder {
 * private int radius;
 * private int height;
 * 
 * public Cylinder(int radius, int height) {
 * this.radius = radius;
 * this.height = height;
 * }
 * 
 * public int getRadius() {
 * return radius;
 * }
 * 
 * public void setRadius(int radius) {
 * this.radius = radius;
 * }
 * 
 * public int getHeight() {
 * return height;
 * }
 * 
 * public void setHeight(int height) {
 * this.height = height;
 * }
 * 
 * public double surfaceArea() {
 * return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
 * }
 * 
 * public double volume() {
 * return Math.PI * radius * radius * height;
 * }
 * 
 * }
 * 
 * public class abeiip {
 * 
 * public static void main(String[] args) {
 * 
 * // Problem 1
 * Cylinder myCylinder = new Cylinder(9, 12);
 * myCylinder.setHeight(12);
 * System.out.println(myCylinder.getHeight());
 * myCylinder.setRadius(9);
 * System.out.println(myCylinder.getRadius());
 * // Problem 2
 * System.out.println(myCylinder.surfaceArea());
 * System.out.println(myCylinder.volume());
 * }
 * }
 */
/*
 * // constructor with super use
 * class Base1 {
 * Base1() {
 * System.out.println("I am a constructor");
 * }
 * 
 * Base1(int x) {
 * System.out.println("I am an overloaded constructor with value of x as: " +
 * x);
 * }
 * }
 * 
 * class Derived1 extends Base1 {
 * Derived1() {
 * // super(0);
 * System.out.println("I am a derived class constructor");
 * }
 * 
 * Derived1(int x, int y) {
 * super(x);
 * System.out.
 * println("I am an overloaded constructor of Derived with value of y as: " +
 * y);
 * }
 * }
 * 
 * class ChildOfDerived extends Derived1 {
 * ChildOfDerived() {
 * System.out.println("I am a child of derived constructor");
 * }
 * 
 * ChildOfDerived(int x, int y, int z) {
 * super(x, y);
 * System.out.
 * println("I am an overloaded constructor of Derived with value of z as: " +
 * z);
 * }
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * // Base1 b = new Base1();
 * // Derived1 d = new Derived1();
 * // Derived1 d = new Derived1(14, 9);
 * // ChildOfDerived cd = new ChildOfDerived();
 * ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
 * System.out.println(cd);
 * 
 * }
 * }
 */
/*
 * // Override
 * class A {
 * public void meth1() {
 * System.out.println("I am method 1 of class A");
 * }
 * }
 * 
 * class B extends A {
 * 
 * @Override
 * public void meth1() {
 * System.out.println("I am method 1 of class B");
 * }
 * 
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * A a = new A();
 * a.meth1();
 * 
 * B b = new B();
 * b.meth1();
 * }
 * }
 */
/*
 * class Phone {
 * public void showTime() {
 * System.out.println("Time is 8 am");
 * }
 * 
 * public void on() {
 * System.out.println("Turning on Phone...");
 * }
 * }
 * 
 * class SmartPhone extends Phone {
 * public void music() {
 * System.out.println("Playing music...");
 * }
 * 
 * public void on() {
 * System.out.println("Turning on SmartPhone...");
 * };
 * };
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * // Phone obj = new Phone(); // Allowed
 * // SmartPhone smobj = new SmartPhone(); // Allowed
 * // obj.name();
 * 
 * Phone obj = new SmartPhone(); // Yes it is allowed
 * // SmartPhone obj2 = new Phone(); // Not allowed
 * 
 * obj.showTime();
 * obj.on();
 * // obj.music(); Not Allowed
 * 
 * };
 * };
 */
/*
 * interface Bicycle {
 * int a = 45;
 * 
 * void applyBrake(int decrement);
 * 
 * void speedUp(int increment);
 * }
 * 
 * // interface me two or more blue ptint bana sakte ho aur use both blueprint
 * and
 * // it make a single blue print
 * interface HornBicycle {
 * int x = 45;
 * 
 * void blowHornK3g();
 * 
 * void blowHornmhn();
 * }
 * 
 * class AvonCycle implements Bicycle, HornBicycle {
 * // public int x = 5;
 * void blowHorn() {
 * System.out.println("Pee Pee Poo Poo");
 * }
 * 
 * public void applyBrake(int decrement) {
 * System.out.println("Applying Brake");
 * }
 * 
 * public void speedUp(int increment) {
 * System.out.println("Applying SpeedUP");
 * }
 * 
 * public void blowHornK3g() {
 * System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
 * }
 * 
 * public void blowHornmhn() {
 * System.out.println("Main hoon naa po po po po");
 * }
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * AvonCycle cycleHarry = new AvonCycle();
 * cycleHarry.applyBrake(1);
 * // You can create properties in Interfaces
 * // System.out.println(cycleHarry);
 * cycleHarry.speedUp(1);
 * 
 * // You cannot modify the properties in Interfaces as they are final
 * // cycleHarry.a = 454;
 * // System.out.println(cycleHarry.a);
 * 
 * cycleHarry.blowHornK3g();
 * cycleHarry.blowHornmhn();
 * }
 * }
 */
/*
 * //Java Interfaces Example & Default Methods
 * interface MyCamera {
 * void takeSnap();
 * 
 * void recordVideo();
 * 
 * private void greet() {
 * System.out.println("Good Morning");
 * }
 * 
 * default void record4KVideo() {
 * greet();
 * System.out.println("Recording in 4k...");
 * }
 * }
 * 
 * interface MyWifi {
 * String[] getNetworks();
 * 
 * void connectToNetwork(String network);
 * }
 * 
 * class MyCellPhone {
 * void callNumber(int phoneNumber) {
 * System.out.println("Calling " + phoneNumber);
 * }
 * 
 * void pickCall() {
 * System.out.println("Connecting... ");
 * }
 * 
 * }
 * 
 * class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
 * public void takeSnap() {
 * System.out.println("Taking snap");
 * }
 * 
 * public void recordVideo() {
 * System.out.println("Taking snap");
 * }
 * 
 * // public void record4KVideo(){
 * // System.out.println("Taking snap and recoding in 4k");
 * // }
 * public String[] getNetworks() {
 * System.out.println("Getting List of Networks");
 * String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
 * return networkList;
 * }
 * 
 * public void connectToNetwork(String network) {
 * System.out.println("Connecting to " + network);
 * }
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * MySmartPhone ms = new MySmartPhone();
 * ms.record4KVideo();
 * // ms.greet(); --> Throws an error!
 * String[] ar = ms.getNetworks();
 * for (String item : ar) {
 * System.out.println(item);
 * }
 * }
 * }
 */
/*
 * //Inheritance in Interfaces
 * interface sampleInterface{
 * void meth1();
 * void meth2();
 * }
 * interface childSampleInterface extends sampleInterface{
 * void meth3();
 * void meth4();
 * }
 * class MySampleClass implements childSampleInterface{
 * public void meth1(){
 * System.out.println("meth1");
 * }
 * public void meth2(){
 * System.out.println("meth2");
 * }
 * public void meth3(){
 * System.out.println("meth3");
 * }
 * public void meth4(){
 * System.out.println("meth4");
 * }
 * }
 * public class abeiip {
 * public static void main(String[] args) {
 * MySampleClass obj = new MySampleClass();
 * obj.meth1();
 * obj.meth2();
 * obj.meth3();
 * }
 * }
 */
/*
 * //pract set
 * abstract class Pen{
 * abstract void write();
 * abstract void refill();
 * }
 * 
 * class FountainPen extends Pen{
 * void write(){
 * System.out.println("Write");
 * }
 * void refill(){
 * System.out.println("Refill");
 * }
 * void changeNib(){
 * System.out.println("Changing the nib");
 * }
 * }
 * class Monkey{
 * void jump(){
 * System.out.println("Jumping...");
 * }
 * void bite(){
 * System.out.println("Biting...");
 * }
 * }
 * 
 * interface BasicAnimal{
 * void eat();
 * void sleep();
 * }
 * 
 * class Human extends Monkey implements BasicAnimal{
 * void speak(){
 * System.out.println("Hello sir!");
 * }
 * 
 * @Override
 * public void eat() {
 * System.out.println("Eating");
 * }
 * 
 * @Override
 * public void sleep() {
 * System.out.println("Sleeping");
 * }
 * }
 * 
 * public class abeiip {
 * public static void main(String[] args) {
 * // Q1 + Q2
 * FountainPen pen = new FountainPen();
 * pen.changeNib();
 * 
 * // Q3
 * Human harry = new Human();
 * harry.sleep();
 * 
 * // Q5
 * Monkey m1 = new Human();
 * m1.jump();
 * m1.bite();
 * // m1.speak(); --> Cannot use speak method because the reference is monkey
 * which does not have speak method
 * 
 * BasicAnimal lovish = new Human();
 * // lovish.speak(); --> error
 * lovish.eat();
 * lovish.sleep();
 * 
 * }
 * }
 */
public class abeiip {
  public static void main(String[] args) {
    System.out.println("prince in java");
  }
}
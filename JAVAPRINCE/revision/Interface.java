// interface Bicycle{
//     int a = 45;
//     void applyBrake(int decrement);
//     void speedUp(int increment);
// }

// interface HornBicycle{
//     int x = 45;
//     void blowHornK3g();
//     void blowHornmhn();
// }

// class AvonCycle implements Bicycle, HornBicycle{
//     public int x = 5;
//     void blowHorn(){
//         System.out.println("Pee Pee Poo Poo");
//     }
//     public void applyBrake(int decrement){
//         System.out.println("Applying Brake");
//     }
//     public void speedUp(int increment){
//         System.out.println("Applying SpeedUP");
//     }
//     public void blowHornK3g(){
//         System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
//     }
//     public void blowHornmhn(){
//         System.out.println("Main hoon naa po po po po");
//     }
// }
// public class Interface {
//     public static void main(String[] args) {
//         AvonCycle cycleHarry = new AvonCycle();
//         cycleHarry.applyBrake(1);
//         // You can create properties in Interfaces
//         // System.out.println(cycleHarry.a);
//         System.out.println(cycleHarry.x);

//         // You cannot modify the properties in Interfaces as they are final aaha par class me kar sakte ho;
//         // cycleHarry.a = 454;
//         //System.out.println(cycleHarry.a);

//         cycleHarry.blowHornK3g();
//         cycleHarry.blowHornmhn();
//     }
// }
// ***************/   DAFAULT METHOD   \*****************
/* 
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    // privite class bannae ka fada:-agar app ka dafault method bara ho gaya to oriviite kam me aa sakta h.. aapp ise privite me overside or implemenent kar sakte ho 
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
    // dafault method:- iska use pahle dafault lagakar kiaya jata h.. agar aapko ik naya method chaiye to ise main method me reasine karenajaguri nahi h.. 
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Interface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
*/
// ***************/  INHERITANCE IN INTERFACE    \*****************
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

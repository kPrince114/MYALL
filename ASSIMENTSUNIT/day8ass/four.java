package day8ass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student implements java.io.Serializable{
    int roll;
     String name;
    int mark;
     String address;
    Student(int roll,String name,int mark,String address){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
        this.address=address;

    }

}
public class four {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // write serilazite object
        Student s=new Student(100, "prince kuamr", 100, "sabalpur");
       
        try {
            ObjectOutputStream op1=new ObjectOutputStream(new FileOutputStream("p.txt"));
            op1.writeObject(s);
            op1.close();
            //file.close();
              
            System.out.println("Object has been serialized");
        } 
        catch (Exception e) {
            System.out.println("Object has not been serialized");
        }
        Student object1 = null;
        // write read in serilazatided fun
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream("p.txt");
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            object1 = (Student)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("name:-- "+ object1.name +"Address:-- "+object1.mark +"roll_no:-- " +object1.roll +" Address:_-- "+object1.address);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        System.out.println("done");

    }
    
}

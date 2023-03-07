package day8ass;
// Write a program to create a new file abc.txt and write the Employee name and address into this file by taking input from the user.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class first {
    public static void main(String[] args) throws FileNotFoundException {
        /*  created file;

        File fe=new File("D//students.txt");
        try {
           boolean bol= fe.createNewFile();
           System.out.println("file is created now ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
        // input taking part;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();

        System.out.println("Enter your address");
        String add=sc.nextLine();
        // write in file 
        PrintWriter pr=new PrintWriter("p.txt");
        pr.write("name :- "+ name+ " \n");
        pr.write("Address:-- "+ add);
        pr.flush(); 
        pr.close();
        System.out.println("done..");


    }
    
}

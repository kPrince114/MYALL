package dya7ass;

import java.io.File;

public class third {
    public static void main(String[] args) {
        File fe=new File("D//students.txt");
        try {
           boolean bol= fe.createNewFile();
           System.out.println("file is created now ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

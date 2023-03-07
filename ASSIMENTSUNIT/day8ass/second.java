package day8ass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Write a program to read data from a text file using BufferedReader class
public class second {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader fr=new BufferedReader(new FileReader("p.txt"));
        fr.lines().forEach(System.out::println);
    }
    
}

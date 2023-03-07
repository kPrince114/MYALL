package com.Question5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class main1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
//		List<String> li=br.lines().toList();
		String line=br.readLine();
		while(line != null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();
		
		PrintWriter pr=new PrintWriter("prince2.txt");
		while(line != null){
			line=br.readLine();
			pr.print(line);
		}
		pr.flush();
		pr.close();
		System.out.println("done.........");
		
		
		
	}

}

package dya7ass;

import java.io.File;
import java.io.IOException;
// all file display in this code;
public class four {
	
	public static void readFiles(File f) {
		
		
		File[] files= f.listFiles();
		
		for(File file:files) {
			if(file.isFile())
				System.out.println(file.getName());
			else
				readFiles(file);
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		File rootFile = new File("day1");
		
		readFiles(rootFile);
		
		
	}

}
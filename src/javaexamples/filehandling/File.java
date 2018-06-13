package javaexamples.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Defining a public class FirstClass
 * 
 * This program will demonstrate how to create a class and a function (method)
 */

class FileOperations {

	/*
	 * Read a file
	 */
	public void readfile(String file_name) throws IOException {
		BufferedReader fr = new BufferedReader(new FileReader("in/file.txt"));
		
		System.out.println("\n##### read text file #####");
		
		String str = null;
		
		while((str = fr.readLine()) != null) {
			System.out.println(str);
		}
		
		fr.close();
	}
	
	/*
	 * Get line count
	 */
	public void getfilelinecount(String file_name) throws IOException {
		BufferedReader fr = new BufferedReader(new FileReader("in/file.txt"));
		
		System.out.println("\n##### getting line count #####");
		
		String str = null;
		int line_count = 0;
		
		while((str = fr.readLine()) != null) {
			line_count++;
		}
		
		System.out.println("line count: " + line_count);
		
		fr.close();
	}
	
	/*
	 * Get char count
	 */
	public void getcharcount(String file_name) throws IOException {
		BufferedReader fr = new BufferedReader(new FileReader("in/file.txt"));
		
		System.out.println("\n##### getting line count #####");
		
		int chr;
		int char_count = 0;
		char ch;
		
		while((chr = fr.read()) != -1) {
			ch = (char) chr;
			char_count++;
		}

		System.out.println("char count: " + char_count);
		
		fr.close();
	}
}

public class File {
	
	public static void main(String args[]) throws IOException {
		
		FileOperations fp = new FileOperations();
		
		String FILE = "in/file.txt";
		
		fp.readfile(FILE);
		
		fp.getfilelinecount(FILE);
		
		fp.getcharcount(FILE);
		
	}
}
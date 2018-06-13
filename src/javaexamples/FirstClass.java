/*
 * Creating my own package for all java examples
 */
package javaexamples;

/*
 * Defining a public class FirstClass
 * 
 * This program will demonstrate how to create a class and a function (method)
 */
public class FirstClass {
	
	public void hello() {
		System.out.println("Hello");
	}
	
	/*
	 * the mail function call, the entry point to the program
	 */
	public static void main(String args[]) {
		
		FirstClass fc = new FirstClass();
		
		fc.hello();
		
	}
}
/*
 * Creating my own package for all java examples
 */
package javaexamples.string;

/*
 * Defining a public class HelloWorld
 */
public class StringOperations {
	
	/*
	 * the mail function call, the entry point to the program
	 */
	public static void main(String args[]) {
		
		/*
		 * printing Hello World to the console
		 */
		String str = "Hello World";
		
		System.out.println("Length of string : " + str.length());
		
		System.out.println("Convert string to lower case : " + str.toLowerCase());
		
		System.out.println("Convert string to upper case : " + str.toUpperCase());

		System.out.println("Convert string to upper case : " + str.replace("W", "X"));

		System.out.println("Convert string to upper case : " + str.compareToIgnoreCase("Hello World"));
	}
}
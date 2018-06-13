/*
 * Creating my own package for all java examples
 */
package javaexamples.date;

import java.util.Date;

/*
 * Defining a public class HelloWorld
 */
public class Dates {
	
	/*
	 * the mail function call, the entry point to the program
	 */
	public static void main(String args[]) {
		
		/*
		 * printing Hello World to the console
		 */
		Date dt = new Date();
		
		System.out.println("date and time : " + dt);
		System.out.println("\nhour now : " + dt.getHours());
		System.out.println("\ndate today : " + dt.getDay());
		System.out.println("\ndate and time : " + dt.getMonth());

	}
}
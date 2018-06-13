/*
 * Creating my own package for all java examples
 */
package javaexamples;

/*
 * 
 */
import javaexamples.CheckFruitNVeggies;

/*
 * Defining a public class FruitsVeggies
 */
public class FruitsVeggies {
	
	public static void main(String args[]) {
		
		CheckFruitNVeggies cv = new CheckFruitNVeggies();
		
		cv.validateFruit("mango");
	}
}
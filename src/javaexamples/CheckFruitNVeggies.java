/*
 * Creating my own package for all java examples
 */
package javaexamples;

/*
 * Defining a public class CheckFruitNVeggies.
 * This program will validate fruit and veggie passed to the functions.
 */
public class CheckFruitNVeggies {
	
	public void validateFruit(String obj) {
		
		String arrayFruits[] = {"MANGO", "BANANA", "CHERRY", "STRAWBERRY", "ORANGE"};
		
		System.out.println("Validating if " + obj.toUpperCase() );
	
		/*
		 * comparing with some fruits 
		 */
		if(obj.toUpperCase().equals("MANGO"))  {
			
			System.out.println(obj + " is a fruit");
		
		} else if(obj.toUpperCase().equals("APPLE"))  {
		
			System.out.println(obj + " is a fruit");
		
		} else if(obj.toUpperCase().equals("BANANA"))  {
		
			System.out.println(obj + " is a fruit");
		
		}
		
		/*
		 * More tidy way of doing it to avoid multiple if else
		 */
		if(obj.toUpperCase().equals("MANGO") 
				|| obj.toUpperCase().equals("APPLE") 
				|| obj.toUpperCase().equals("BANANA"))  {
			
			System.out.println(obj + " is a fruit");
		} 
	
		/*
		 * Another little better way of doing it
		 */
		for(int i = 0; i < arrayFruits.length; i++) {
		
			if(obj.toUpperCase().equals(arrayFruits[i])) {
				System.out.println(obj + " is a fruit found at array index " + i);
			}
		}
	}
}
/*
 * Creating my own package for all java examples
 */
package javaexamples.junits;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Func {
	
	public static void beforeclass() {
	}
	
}


/*
 * Defining a public class HelloWorld
 */

public class FirstJunit {

	Func fn = new Func();
	
	int val = 0;

	@BeforeClass
	void beforeClass() {
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("Hello JUNIT : " + val);
	}
	
	@Test
	void FirstTest() {
		System.out.println("Hello JUNIT : " + val);
	}
	
}
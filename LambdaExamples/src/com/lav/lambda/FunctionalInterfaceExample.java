package com.lav.lambda;

/*- FUNCTIONAL PROGRAMMING
 * 
 *  Interface can have only one method
 *  We can multiple default methods with implementation
 * 
 *  Lamdba expression is used to define the implementation of 
 *  interface method
 * 
 */
public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		/* Here the function implementation is done using lambda */
		Function function = (input) -> {
			System.out.println("Hello value entered is: " + input);
		};

		/* Calling the method implementation */
		function.print("WOW!!");

		/* Calling default methods */
		function.printAnything();
		function.printAgainAnything();
	}

	@FunctionalInterface
	interface Function {

		void print(String input);

		default void printAnything() {
			System.out.println("this is a default method");
		}

		default void printAgainAnything() {
			System.out.println("this is a second default method");
		}
	}

}

package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {

	public static void main(String[] args) {

		  System.out.println("Enter your name:");
		    Scanner scanner = new Scanner(System.in);
		    String name = scanner.next();
		    scanner.close();
//		    greetUser(name); //Calling method by method signature
		    Greetings obj = new Greetings();
		    obj.greetUser(name);
		    
	}

	public  void greetUser(String name) // method header
	{
		System.out.println("Hi there, " + name); // method body
	}
}

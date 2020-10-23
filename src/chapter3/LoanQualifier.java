package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

	public static void main(String[] args) {
		
		//Initialize what we know
		int requiredSalary = 30000;
		int requiredYearsEmployeed = 2;
		
		//Get what we don't
		System.out.println("Enter your salary.");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("Enter the number of years with your current employeer.");
		double years = scanner.nextDouble();
		scanner.close();

		scanner.close();
		
		//Make decision
		if (salary >= requiredSalary) {
			if (years >= requiredYearsEmployeed) {
				System.out.println("Congrats! You qualify for the loan.");
			}
			else {
				System.out.println("Sorry, you must have worked at your current job "
						+ requiredYearsEmployeed + " years.");
			}
		}
		else {
			System.out.println("You must earn at least $"
					+requiredSalary+ " to qualify for the loan.");
		}
	}
}

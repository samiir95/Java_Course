package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EceptionHandling {
	public static void main(String[] args) throws NoOvertimeAllowedEception  {

//		createNewFile();
//		numbersExceptionHandling();
//		createNewFileRethrow();
		calculateSalary(40, 10);
	}

	public static void calculateSalary(double hours, double rate) throws NoOvertimeAllowedEception  {

		if (hours > 40) {
//			throw new IllegalArgumentException("We don't allow overtime");
			throw new NoOvertimeAllowedEception("We don't allow overtime");
		}
	}

	public static void numbersExceptionHandling() {

		File file = new File("resources/numbers.txt");
//		Scanner fileReader = null;
		try (Scanner fileReader = new Scanner(file)) {

			while (fileReader.hasNext()) {
				double num = fileReader.nextDouble();
			}
		} catch (FileNotFoundException | InputMismatchException e) {
			e.printStackTrace();
		}
//		finally {
//			fileReader.close();
//		}
//		catch (InputMismatchException e) {
//			e.printStackTrace();
//		}

	}

	public static void createNewFile() {

		File file = new File("resources/nonexistent.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Directory doesn't exist!");
			e.printStackTrace();
		}
	}

	public static void createNewFileRethrow() throws IOException{

		File file = new File("resources/nonexistent.txt");
		file.createNewFile();
		System.out.println("Directory doesn't exist!");
	}

}
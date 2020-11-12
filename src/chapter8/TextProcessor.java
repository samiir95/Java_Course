package chapter8;

public class TextProcessor {

	public static void main(String[] args) {

//		countWords("I Love Test Automation university");
//		reverseString("Hello TAU!");
//		addSpaces("HelloWorld!It'sMeMohamed");
//		String x = "avacado";
//		var y = x.split("a");
//		for (int i = 0; i < y.length; i++) {
//			System.out.print(y[i]);
//
//		}
		
		String text = "Hello TAU!";
		var reverse = new StringBuilder(text);
		var reversedtext = reverse.reverse();
		System.out.println(reversedtext);
		
	}

	/**
	 * Add spaces before each uppercase letter
	 * @param text jumbled text
	 */
	public static void addSpaces(String text) {

		var modifiedText = new StringBuilder(text);

		for (int i = 0; i < modifiedText.length(); i++) {
			if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
				modifiedText.insert(i, " ");
				i++;
			}
		}
		System.out.println(modifiedText);

	}

	/**
	 * Prints a string in a reverse order
	 * 
	 * @param text string to reverse
	 */
	public static void reverseString(String text) {

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}

	}

	/**
	 * Splits a String into an array by tokenizing it. Counts words and prints them
	 * @param text Full string to be split
	 */
	public static void countWords(String text) {

		var words = text.split(" ");
		int numberOfWords = words.length;

		String message = String.format("Your text contains %d words:", numberOfWords);
		System.out.println(message);

		for (int i = 0; i < numberOfWords; i++) {
			System.out.println(words[i]);
		}
	}

}

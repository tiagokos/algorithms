package algorithms;

/**
 * How to reverse a String without using nay built in method or recursion in Java
 * 
 * @author Tiago Kosciuk
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String input = "Hello World!";
		String reversedString = rs.reverse(input);
		System.out.println("Original: " + input + " - Reversed: " + reversedString);
	}

	private String reverse(String input) {
		char[] reversedInput = new char[input.length()];
		for (int i = 0; i < reversedInput.length; i++) {
			reversedInput[reversedInput.length - i - 1] = input.charAt(i);
		}
		return new String(reversedInput);
	}
	
}

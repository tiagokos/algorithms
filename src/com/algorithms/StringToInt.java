package algorithms;

/**
 * Convert a String to Integer without using any method from java.util
 * 
 * @author Tiago Kosciuk
 *
 */
public class StringToInt {

	public static void main(String[] args) {
		StringToInt si = new StringToInt();
		String input = "-12345";
		int sti = si.toInt(input);
		System.out.println("Integer value is: " + sti);
	}

	private int toInt(String input) {
		int i = 0;
		int number = 0;
		boolean isNegative = false;
		int len = input.length();
		if (input.charAt(0) == '-') {
			i++;
			isNegative = true;
		}
		while (i < len) {
			number *= 10;
			number += (input.charAt(i) - '0');
			i++;
		}
		if (isNegative) {
			number = -number;
		}
		return number;
	}
	
}

package algorithms;

/**
 * Check whether a String input is a palindrome
 * 
 * @author Tiago Kosciuk
 *
 */
public class Palindrome {
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String input = "ana";
		System.out.println(input + " is palindrome? " +  p.isPalindrome(input));
	}

	private boolean isPalindrome(String input) {
		return isPalindrome(input, 0, input.length() - 1);
	}

	private boolean isPalindrome(String input, int low, int high) {
		if (high <= low) {
			return true;
		} else if (input.charAt(low) != input.charAt(high)) {
			return false;
		} else {
			return isPalindrome(input, ++low, --high);
		}
	}

}

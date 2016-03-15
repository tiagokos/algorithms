package algorithms;

/**
 * Calculates the length of a String without using java.util.String length method
 * 
 * The idea is to loop the whole String using charAt, catching the Exception when it reaches the end
 * 
 * @author Tiago Kosciuk
 *
 */
public class StringLength {
	
	public static void main(String[] args) {
		StringLength sl = new StringLength();
		String input = "testing";
		int length = sl.getLength(input);
		System.out.println("Length of " + input + " is: " + length);
	}

	private int getLength(String input) {
		int i = 0;
		try {
			for (; true; i++) {
				input.charAt(i);
			}
		} catch (Exception e) {
			// Finish of the computation
		}
		return i;
	}

}

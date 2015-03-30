package algorithms;

/**
 * Count number of words in a String without using any built in method
 * 
 * @author Tiago Kosciuk
 *
 */
public class CountWords {

	public static void main(String[] args) {
		CountWords cw = new CountWords();
		String input = "Hello World!";
		System.out.println(input + " has " + cw.count(input) + " words");
	}

	private int count(String input) {
		int counter = 0;
		char[] stringAsChar = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if ((i == 0) && (stringAsChar[i] != ' ') 
					|| (i > 0) && (stringAsChar[i] != ' ') && (stringAsChar[i - 1] == ' ')) {
				counter++;
			}
		}
		return counter;
	}
	
}

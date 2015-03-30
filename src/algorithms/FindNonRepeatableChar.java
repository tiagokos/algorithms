package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Find first non repeatable char in a String 
 * 
 * @author Tiago Kosciuk
 *
 */
public class FindNonRepeatableChar {

	public static void main(String[] args) {
		FindNonRepeatableChar f = new FindNonRepeatableChar();
		String input = "cactus";
		System.out.println("First non repeatable char is: " + f.first(input));
	}

	private char first(String input) {
		char firstLetter = ' ';
		Map<Character, Integer> charMap = new HashMap<>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (charMap.get(c) == 1) {
				firstLetter = c;
				break;
			}
		}
		return firstLetter;
	}
	
}

package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Count number of each letter from an input
 * 
 * @author Tiago Kosciuk
 *
 */
public class CountChars {

	public static void main(String[] args) {
		CountChars c = new CountChars();
		c.count("Hello World!");
	}

	private void count(String input) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (!charMap.containsKey(input.charAt(i))) {
				charMap.put(input.charAt(i), 1);
			} else {
				charMap.put(input.charAt(i), charMap.get(input.charAt(i)) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}		
	}
	
}

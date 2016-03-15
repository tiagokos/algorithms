package algorithms;

/**
 * Remove specific chars without using any built in function
 * 
 * @author Tiago Kosciuk
 *
 */
public class RemoveSpecificChars {

	public static void main(String[] args) {
		RemoveSpecificChars r = new RemoveSpecificChars();
		String input = "banana";
		String output = r.remove("b", input);
		System.out.println(output);		
	}

	private String remove(String inputToRemove, String input) {
		char[] inputAsArray = inputToRemove.toCharArray();
		char[] outputAsArray = input.toCharArray();
		boolean[] tempBoolean = new boolean[128];
		
		for (int i = 0; i < inputAsArray.length; i++) {
			tempBoolean[inputAsArray[i]] = true;
		}
		
		int end = 0;
		for (int i = 0; i < outputAsArray.length; i++) {
			if (!tempBoolean[outputAsArray[i]]) {
				outputAsArray[end++] = outputAsArray[i];
			}
		}
		
		return new String(outputAsArray, 0, end);
	}
	
}

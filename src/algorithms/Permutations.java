package algorithms;

/**
 * Print all the permutations of a String
 * 
 * @author Tiago Kosciuk
 *
 */
public class Permutations {

	private String input;
	private boolean[] used;
	
	public static void main(String[] args) {
		Permutations f = new Permutations();
		f.permute("sky");
	}
	
	public void permute(String input) {
		this.input = input;
		this.used = new boolean[input.length()];
		permuteRecursive(new StringBuilder());
	}
	
	public void permuteRecursive(StringBuilder sb) {
		if (sb.length() == input.length()) {
			System.out.println(sb);
			return;
		}
		for (int i = 0; i < input.length(); i++) {
			if (used[i]) { 
				continue;
			} else {
				sb.append(input.charAt(i));
				used[i] = true;
				permuteRecursive(sb);
				used[i] = false;
				sb.setLength(sb.length() - 1);
			}
		}
	}
	
}

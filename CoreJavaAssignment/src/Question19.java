
public class Question19 {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";

		// Replace all the 'dog' with 'cat'.
		String new_str = str.replaceAll("fox", "cat");

		// Display the strings for comparison.
		System.out.println("Original string: " + str);
		System.out.println("New String: " + new_str);
	}
}

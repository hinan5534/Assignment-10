package Assignment_10;

public class quesiton28_badWord {

	public static void main(String[] args) {
		String text = "he said bla bla bla";
		String badWord = "bla";
		clean(text, badWord);

	}

	private static void clean(String text, String badWord) {

		for (int i = 0; i <= text.length() - badWord.length(); i++) {
			if (text.substring(i, i + badWord.length()).equals(badWord)) {
				text = text.replace(text.substring(i, i + badWord.length()), "");
			}
		}
		System.out.println(text);
	}

}

package Assignment_10;

public class quesiton26_uniqueChars {

	public static void main(String[] args) {


		String word = "mama";
		uniqueChars(word);

	}

	private static void uniqueChars(String word) {
		int counter = 0;
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					if (newWord.contains(word.charAt(i) + "")) {
						continue;
					}

					newWord += word.charAt(i);
				}
			}
		}

		System.out.println(newWord);
	}
}

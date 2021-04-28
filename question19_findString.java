package Assignment_10;

public class question19_findString {

	public static void main(String[] args) {

		String word = "jakvvajaklmvatynapjavaegsljavavfdgjavajava";
		String selectedWord = "java";
		int counter = 0;

		if (word.length() < selectedWord.length()) {
			System.out.println("Word length must be greater than or equal selected word");
		}

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.substring(i, i + 4).equals(selectedWord)) {
				counter++;
			}
		}
		System.out.println(selectedWord + " found " + counter + " times");
	}

}
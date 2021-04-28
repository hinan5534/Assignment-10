package Assignment_10;

public class question22_html {

	public static void main(String[] args) {


		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		if (!(html.contains("html"))) {
			System.out.println("Invalid input!");
			return;
		}

		int indexOfFirstQuote = html.indexOf('"');
		int indexOfSecondQuote = html.indexOf('"', indexOfFirstQuote + 1);

		String wordBetweenTwoQuote = html.substring(indexOfFirstQuote + 1, indexOfSecondQuote);
		System.out.println(wordBetweenTwoQuote);

	}

}


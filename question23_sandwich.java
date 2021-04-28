package Assignment_10;

public class question23_sandwich {

	public static void main(String[] args) {
		
		String word = "breadjambread";
		int lastIndexOfFirstBread = word.indexOf("bread") + "bread".length();
		int firstIndexOfSecondBread = word.lastIndexOf("bread");
		
		String wordBetweenFirstAndSecondBread = word.substring(lastIndexOfFirstBread, firstIndexOfSecondBread);
		
		if(wordBetweenFirstAndSecondBread.equals("bread")) {
			System.out.println("nothing!");
			return;
		}
		
		System.out.println(wordBetweenFirstAndSecondBread);

	}

}



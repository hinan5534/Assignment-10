package Assignment_10;

public class question18_wordSeperator {

	public static void main(String[] args) { 

		String word = "Word";
		String seperator = "X";
		
		int counter =3;
		
		for(int i = 0; i<counter; i++) {
			System.out.print(word);
			
			if(i<counter-1) {
				System.out.print(seperator);
			}
		}
		
	}

}
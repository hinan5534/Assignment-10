package Assignment_10;

public class question16_index_01 {

	public static void main(String[] args) {


		String word="javaxxjava";


		if (word.length()<4)  {
			System.out.println("Invalid word lenght");
			return;
		}
		

		if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
		
			System.out.println(true);
		
		} else {
		
			System.out.println(false);
	}

}

}
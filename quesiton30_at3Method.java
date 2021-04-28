package Assignment_10;

import java.util.Scanner;

public class quesiton30_at3Method {

	public static void main(String[] args) {
		
		String text = "";
		Scanner sc = new Scanner(System.in);
		
		while(text.length()<3) {
			System.out.println("Please enter minimum 3 characters of string : ");
			text = sc.nextLine();
		}
		System.out.println("Type to be inserted: ");
		String argument = sc.next();
		sc.close();
		
		System.out.println("Output : " + insert(text, argument));		

	}
		
	public static String insert(String text, String argument) {
		
		text = text.substring(0,3).concat(argument).concat(text.substring(3));
		return text;
		
	}
}

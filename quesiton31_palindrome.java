package Assignment_10;

import java.util.Scanner;

public class quesiton31_palindrome {

	public static void main(String[] args) {
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the main word : ");
			String text = sc.nextLine();
			sc.close();
			
			System.out.println("Output : " + isPalindrome(text.replaceAll(" ","")));

		}
			
		public static boolean isPalindrome(String text) {
			
			String reversed = "";
			for (int i=text.length()-1 ; i>=0 ; i--) {			
				reversed = reversed+(text.charAt(i));
			}
			
			if (reversed.equalsIgnoreCase(reversed)) {
				return true;
			}else {
				return false;
			}
		
		}
	}
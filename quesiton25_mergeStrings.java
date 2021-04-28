package Assignment_10;

public class quesiton25_mergeStrings {

	public static void main(String[] args) {
		
		
			String s1 = "12345";
			String s2 = "abcde";
			mergeStrings(s1, s2);

		}

		public static void mergeStrings(String s1, String s2) {
			int l1 = s1.length();
			int l2 = s2.length();
			String combine = "";

			for (int i = 0; i < l1 + l2; i++) {
				String w1 = "";
				String w2 = "";

				if (i < l1) {
					w1 = s1.charAt(i) + "";
				}

				if (i < l2) {
					w2 = s2.charAt(i) + "";
				}

				combine += w1 + w2;
			}

			System.out.println(combine);

		}
		
	}

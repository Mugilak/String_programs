package stringPrograms;

import java.util.Scanner;

public class ReverseString {
	Scanner sc = new Scanner(System.in);

	public void entry() {
//		System.out.println("Enter a word : ");
//		String s = sc.next();
//		reverseWord(s);

		System.out.println("\nEnter a Sentence : ");
		String s2 = sc.nextLine();
		reverseArraySentence(s2);

		sc.close();
	}

	private void reverseArraySentence(String s) {
		// TODO Auto-generated method stub
		String rev = "";
		String[] str = s.split(" ");

		System.out.println(s.length());
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "");
		}

		for (int i = 0; i < str.length; i++) {
			rev = str[i] + rev;
			if (i < str.length - 1) {
				if (str[i + 1] != "") {
					rev = " " + rev;
				}
			}
		}
		rev = rev.trim();
		System.out.println("\nreverse rev : " + rev);

		palindromeCheck(s, rev);
	}

	private void palindromeCheck(String str, String reverseStr) {
		// TODO Auto-generated method stub
		System.out.println((str.equalsIgnoreCase(reverseStr)) ? "Yes Palindrome" : "No Palindrome");
	}

	public void reverseWord(String s) {
		// TODO Auto-generated method stub
		String r = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			r = c[i] + r;
		}
		System.out.println(r);
		palindromeCheck(s, r);

//		String s3 = Arrays.toString(c);
//		System.out.println(s3);
	}

}

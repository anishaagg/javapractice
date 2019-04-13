//Rhyming Check

import java.util.Scanner;

public class rhymes {
	
	public static void compare(String s1, String s2) {

		String end_s1 = s1.substring(s1.length() - 2, s1.length());
		String end_s2 = s2.substring(s2.length() - 2, s2.length());

		//check if ends with the same last two letters
		if (end_s1.equalsIgnoreCase(end_s2)){
			System.out.println("They rhyme!");
			//check start with the same letter
			if (s1.substring(0,1).equalsIgnoreCase(s2.substring(0,1))) {
				System.out.println("They also start with the same letter!");
			}
		} else if (s1.substring(0,1).equalsIgnoreCase(s2.substring(0,1))) {
			System.out.println("They don't rhyme, but they start with the same letter!");
		} else {
			System.out.println("They have nothing in common...");
		}
		
	}

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What 2 words do you want to compare? ");
		String str1 = input.next();
		String str2 = input.next();

		//check the input
		//System.out.println("String 1: " + str1);
		//System.out.println("String 2: " + str2);

		compare(str1, str2);

	}
}



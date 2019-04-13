//Boolean practice from slides

import java.util.Scanner;

public class vowels {
	
	//method that returns whether a String is a vowel (a, e, i, o, or u), case-insensitively.
	public static boolean isVowel (String a) {
		if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")) {
			return true;
		} else {
			return false;
		}
	}

	//method that returns whether a String is any character EXCEPT a vowel (a, e, i, o, or u).
	public static boolean isNonVowel (String a) {
		if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")) {
			return false;
		} else {
			return true;
		}
	}

	//method that returns true if every character in a String is a vowel, else false.
	public static boolean isAllVowels (String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!isVowel(s.substring(i, i + 1))) {
				return false;
			}
		}

		return true;
	}

	//method to check if the word contains vowels
	public static boolean containsVowel (String s) {
		boolean v = false;

		//check each letter to see if it is a vowel
		for (int i = 0; i < s.length(); i++) {
			v = isVowel(s.substring(i, i + 1));
			//System.out.println("Letter " + s.substring(i, i + 1) + " is " + v);

			//if letter is vowel, return true immediately
			if (v == true) {
				return v;
			}
		}

		return v;
	}

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		String word;

		System.out.print("What word would you like to check? ");
		word = input.next();

		System.out.println("Does \"" + word + "\" contain vowels? " + containsVowel(word));
		System.out.println("Are all of the letters in \"" + word + "\"  vowels? " + isAllVowels(word));

	}
}
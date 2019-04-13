//Boolean check

import java.util.Scanner;

public class Check {
	
	//method that returns whether any digit of a positive integer is odd.
	public static boolean hasAnOddDigit(int num) {
		int n = num;

		while (num > 0) {
			n = num % 10;
			//System.out.println("n = " + n);
			num = num / 10;
			//System.out.println("num = " + num);

			if( (n % 2) == 1) {
				return true;
			}

		}
		
		return false;
	}


	//method that returns whether every digit of a positive integer is odd.
	public static boolean allDigitsOdd (int num) {
		int n = num;

		while (num > 0) {
			n = num % 10;
			//System.out.println("n = " + n);
			num = num / 10;
			//System.out.println("num = " + num);

			if( (n % 2) == 0) {
				return false;
			}

		}
		return true;
	}

	//method that returns true if every character in a String is a vowel, else false.
	public static boolean isAllVowels (String s) {
		boolean all = false;

		return all;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = input.nextInt();

		System.out.println("Does " + num + " have any odd digits? " + hasAnOddDigit(num));
		System.out.println("Are all digits of " + num + " odd? " + allDigitsOdd(num));


	}
}
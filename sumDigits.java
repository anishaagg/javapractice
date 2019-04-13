//Digit Sum slide problem

import java.util.Scanner;

public class sumDigits {
	
	public static int digitSum(int digits) {
		int sum = 0;
		int num = digits;

		while (num > 0) {
			sum = sum + (num % 10);

			num = num / 10;
		}

		return sum;
	}

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		int number;

		System.out.print("What number would you like the digit sum for? ");
		number = input.nextInt();

		System.out.println("Sum of the digits is " + digitSum(number));

	}

}



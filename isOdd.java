//Both Odd Check

import java.util.Scanner;

public class isOdd {
	
	public static boolean bothOdd (int n1, int n2) {
		boolean is_odd;
		int remain1 = n1 % 2;		//remanider of n1 to see if odd
		int remain2 = n2 % 2;		//remanider of n2 to see if odd

		//if both != 0, both are odd
		if ((remain1 != 0) && (remain2 != 0)) {
			is_odd = true;
		} else {	//else it is falase
			is_odd = false;
		}	

		return is_odd;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("What are the numbers you want to check? ");
		int num1 = input.nextInt();	//first number
		int num2 = input.nextInt();	//second number

		//System.out.println("Num1: " + num1);
		//System.out.println("Num2: " + num2);

		System.out.println("Are both numbers odd? " + bothOdd(num1, num2));

	}

}

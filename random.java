//Random Program

import java.util.Scanner;
import java.util.Random;

public class random {
	
	public static int numDice(Scanner in){
		int count = 0;

		System.out.print("How many 6 sided dice would you like to roll? ");
		count = in.nextInt();

		return count;
	}

	public static int rollEm(int dice, int attempt) {
		int sum = 0;					//sum of the dice
		int[] rolls = new int[dice];	//number of dice being rolled

		Random num = new Random();	//initialize random class

		//calculate the sum
		for (int i =0; i< dice; i++) {
			rolls[i] = num.nextInt(6) + 1;	//get random number between 1-6

			sum = sum + rolls[i];		//add dice roll to sum
		}

		//print the roll
		System.out.print("Roll " + (attempt+1) + ": " );
		for(int j = 0; j < dice; j++) {
			if (j == dice-1){
				System.out.println(rolls[j] + " = " + sum);
			} else {
				System.out.print(rolls[j] + " + ");
			}
			
		}

		return sum;
	}

	public static void main(String[] agrs) {

		Scanner input = new Scanner(System.in);

		int num_dice = numDice(input);

		int sum = 0;			//sum of dice
		int tries = 0; 			//number of tries		

		//check if the sum was 7, otherwise keep rolling
		while (sum != 7){
			sum = rollEm(num_dice, tries);
			tries++;
		}

		System.out.println("You won after " + tries + " tries!");


	}
}


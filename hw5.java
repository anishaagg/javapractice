//Homework 5

import java.util.Scanner;
import java.util.Random;

public class hw5 {
	
	//method to introduces the game to the user
	public static void intro () {

		System.out.println("This program allows you to play a guessing game.");
		System.out.println("I will think of a number between 1 and");
		System.out.println("100 and will allow you to guess until");
		System.out.println("you get it.  For each guess, I will tell you");
		System.out.println("whether the right answer is higher or lower");
		System.out.println("than your guess.");
		System.out.println("");

	}

	//method to play one game with the user (just one game, not multiple games)
	public static int oneGame () {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		int guess;								//user's guess
		int actual = rand.nextInt(100) + 1;		//random number between 1=100 for actual number
		int tries = 1;							//number of tries user takes


		System.out.println("");
		//System.out.println("Actual: " + actual);
		System.out.println("I'm thinking of a number between 1 and 100...");
		System.out.print("Your guess? ");
		guess = input.nextInt();

		while(guess != actual) {
			if(guess > actual) {
				System.out.println("It\'s lower.");
			} else {
				System.out.println("It\'s higher.");
			}

			tries++;

			System.out.print("Your guess? ");
			guess = input.nextInt();
		}

		System.out.println("You got it right in " + tries + " guesses!");

		return tries;
	}

	//a method to report overall results to the user
	public static void results (int games, int guesses, int best) {

		System.out.println("");
		System.out.println("Overall results:");
   		System.out.println("	total games = " + games);
		System.out.println("	total guesses = " + guesses);
		System.out.println("	guesses/game  = " + (guesses/games));
		System.out.println("	best game     = " + best);

	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int games = 1;				//number of games played
		int guesses = 0;			//number of guesses in total;
		int best_game = 0;			//number of tries on the best game
		String play_again;			//keep playing
		int tries;					//current game's number of tries

		intro();

		best_game = oneGame();
		guesses = best_game;
		System.out.print("Do you want to play again? ");
		play_again = input.next();

		//check if play_again is inputted correctly
		if (!(play_again.substring(0,1).equalsIgnoreCase("n")) && !(play_again.substring(0,1).equalsIgnoreCase("y"))) {
			System.out.println("Sorry... I didn't get that");
			System.out.print("Do you want to play again? ");
			play_again = input.next();
		}

		while(play_again.substring(0,1).equalsIgnoreCase("y")) {
			tries = oneGame();
			guesses = guesses + tries;

			//set best game to be the current game number of tries
			if (tries < best_game){
				best_game = tries;
			}

			games++;
		}

		results(games, guesses, best_game);

	}


}

        
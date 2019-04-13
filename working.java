//Worked Hours

import java.io.*;
import java.util.Scanner;

public class working {
	
	public static void main (String[] args) throws FileNotFoundException {

		//read file
		Scanner file = new Scanner (new File ("hours.txt"));
		//Scanner input = new Scanner(System.in);

		int id = -1;
		double hrs = 0.0;
		String name;
		boolean idFound = false;

		//get ID inputted correctly
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an ID: ");
			if (input.hasNextInt()) {
				id = input.nextInt();
			} else {
				System.out.println("Sorry, incorrect id inputted");
			}
		} while (id == -1);

		//parse the lines
		while (file.hasNextLine()) {
			String line = file.nextLine();
			Scanner lineIn = new Scanner(line);	//single line to parse through

			int thisID = lineIn.nextInt();	//id of this line

			//check if the id of this line is the one we are looking for
			if(thisID == id) {
				idFound = true;
				name = lineIn.next();
				int days = 0;
				while (lineIn.hasNextDouble()) {
					hrs += lineIn.nextDouble();
					days++;
				}

				double daily = hrs / days;

				System.out.println(name + " (ID#" + id + ") worked " + String.format("%.1f",hrs) + " hours (" + String.format("%.1f", daily) + " hours/day)");

			}
		}

		if (idFound == false) {
			System.out.println("ID #" + id + " not found");

		}

	}
}
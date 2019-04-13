//File input/output

import java.io.*;
import java.util.Scanner;

public class readNums {

	public static double readFive (Scanner file) {
		//read up to 5 doubles
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			double num = file.nextDouble();
			System.out.println("Number: " +num);
			sum +=  num;
		}

		return sum;
	}

	public static double readWhole (Scanner file) {
		//read all doubles
		double sum = 0;
		while (file.hasNext()) {
			if(file.hasNextDouble()) {
				double num = file.nextDouble();
				System.out.println("Number: " +num);
				sum +=  num;
			} else {
				file.next();
			}
			
		}

		return sum;
	}
	
	public static void main (String[] args) throws FileNotFoundException {

		//read file
		File file = new File ("test2.txt" );
		Scanner input = new Scanner (file);

/*
		double sumFive = readFive(input);
		System.out.println("Sum of digits is: " + String.format("%.1f", sumFive));
*/
		double sum = readWhole(input);
		System.out.println("Sum of digits is: " + String.format("%.1f", sum));
				
		
	}
}
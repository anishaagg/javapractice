/*
Program that processes an input file of data for a personality test known as the Keirsey Temperament Sorter.
The Keirsey personality test involves answering 70 questions each of which have two answers.
We will refer to them as the “A” answer and the “B” answer.

People taking the test are allowed to leave a question blank, in which case their answer will be recorded with a dash (“-”).

The input file will contain a series of line pairs, one per person.
First line: the person’s name (possibly including spaces)
Second line: series of 70 letters all in a row (all either “A”, “B” or “-”).

The Keirsey test measures four independent dimensions of personality:
	- Extrovert versus Introvert (E vs I): what energizes you
	- Sensation versus iNtuition (S vs N): what you focus on
	- Thinking versus Feeling (T vs F): how you interpret what you focus on
	- Judging versus Perceiving (J vs P): how you approach life

Individuals are categorized as being on one side or the other of each of these dimensions.

Remember that the Keirsey test involves 70 questions answered either A or B. 
A answers: extravert(E), sensation(S), thinking(T) and judging(J)
B answers: introvert(I), intuition(N), feeling(F) and perceiving(P)

For each of these dimensions, we determine a number between 0 and 100 and indicate whether they were closer to the A side or the B side. 
The number is computed by figuring out what percentage of B answers the user gave for that dimension (rounded to the nearest integer).
Compute the scores and overall result for each person and to report this information.

*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class personalityTest {

	// method to introduce the program
	public static void intro() {
		System.out.println("");
		System.out.println("This program processes a file of answers to the Keirsey Temperament Sorter.");
		System.out.println("It converts the various A and B answers for each person into a sequence of");
		System.out.println("B-percentages and then into a four-letter personality type.");
		System.out.println("");
	}

	//method to calculate the percentage of B answers
	public static int[] Bpercent (int[] p) {
		int[] percentage = {0,0,0,0};

		for (int i = 0; i < p.length; i= i+2) {
			//System.out.println(p[i] + " " + p[i+1]);

			double answered = (double)p[i] + (double)p[i+1];
			double b = (double)p[i+1];
			//System.out.println("answered " + answered + " b " + b);

			//System.out.println("percent = " + b/answered);
			double percent = (b / answered) * 100;
			//System.out.println("percent " + percent);
			percentage[i/2] = (int)Math.round(percent);
		}

		return percentage;
	}


	//method to parse the line of test data
	public static int[] parse(String line) {
		/*
		The test has 10 groups of 7 questions with a repeating pattern. 
		First question is an Extrovert/Introvert (questions 1, 8, 15, 22, etc).
		Next two questions are for Sensing/iNtuition (questions 2, 3, 9, 10, 16, 17, 23, 24, etc).
		Next two questions are for Thinking/Feeling (questions 4, 5, 11, 12, 18, 19, 25, 26, etc).
		Final two questions are for Judging/Perceiving (questions 6, 7, 13, 14, 20, 21, 27, 28, etc).
		*/
		int[] data = {0,0,0,0,0,0,0,0};
		//System.out.println(line);
		
		//parse the data in groups of 7
		for (int i = 0; i < line.length(); i= i+7) {
			//Extrovert/Introvert 1 question
			if (line.substring(i,i+1).equalsIgnoreCase("a")) {
				data[0]++;
			} else if (line.substring(i,i+1).equalsIgnoreCase("b")) {
				data[1]++;
			}
			//Sensing/iNtuition 2 questions
			if (line.substring(i+1,i+2).equalsIgnoreCase("a")) {
				data[2]++;
			} else if (line.substring(i+1,i+2).equalsIgnoreCase("b")) {
				data[3]++;
			}

			if (line.substring(i+2,i+3).equalsIgnoreCase("a")) {
				data[2]++;
			} else if (line.substring(i+2,i+3).equalsIgnoreCase("b")) {
				data[3]++;
			}
			//Thinking/Feeling 2 questions
			if (line.substring(i+3,i+4).equalsIgnoreCase("a")) {
				data[4]++;
			} else if (line.substring(i+3,i+4).equalsIgnoreCase("b")) {
				data[5]++;
			}

			if (line.substring(i+4,i+5).equalsIgnoreCase("a")) {
				data[4]++;
			} else if (line.substring(i+4,i+5).equalsIgnoreCase("b")) {
				data[5]++;
			}
			//Judging/Perceiving 2 questions
			if (line.substring(i+5,i+6).equalsIgnoreCase("a")) {
				data[6]++;
			} else if (line.substring(i+5,i+6).equalsIgnoreCase("b")) {
				data[7]++;
			}

			if (line.substring(i+6,i+7).equalsIgnoreCase("a")) {
				data[6]++;
			} else if (line.substring(i+6,i+7).equalsIgnoreCase("b")) {
				data[7]++;
			}
		}

		//System.out.println(data);
		return data;

	}

	//method to calculate the 4-letter personality type
	public static String pType (int[] data) {
		String type = "";

		//append string as type is determined
		//A answers: extravert(E), sensation(S), thinking(T) and judging(J)
		//B answers: introvert(I), intuition(N), feeling(F) and perceiving(P)
		if (data[0] >= 50) {
			type = type.concat("I");
		} else {
			type = type.concat("E");
		}

		if (data[1] >= 50) {
			type = type.concat("N");
		} else {
			type = type.concat("S");
		}

		if (data[2] >= 50) {
			type = type.concat("F");
		} else {
			type = type.concat("T");
		}

		if (data[3] >= 50) {
			type = type.concat("P");
		} else {
			type = type.concat("J");
		}

		//System.out.println(type);
		return type;
	}

	public static void main (String[] args) throws FileNotFoundException{

		intro();

		Scanner input = new Scanner(System.in);

		//get user input on the input file
		System.out.print("input file name? ");
		Scanner fileIn = new Scanner (new File(input.next()));
		System.out.println("");
		
		while(fileIn.hasNextLine()) {
			String name = fileIn.nextLine();
			int[] data = parse(fileIn.nextLine());
			//System.out.println(name + ": " + Arrays.toString(data));

			int[] percent = Bpercent(data);

			String type = pType(percent);
			System.out.println(name + ": " + Arrays.toString(percent) + " - " + type);
		}

	}


}




//Homework 4

import java.util.Scanner;

public class hw4 {

	public static void intro () {
		//into to the program for comparing 2 applicants
		System.out.println("This program compares two applicants to");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant.  For each candidate I will need");
		System.out.println("either SAT or ACT scores plus a weighted GPA.");
		System.out.println("");
	}

	public static double getSAT (int m, int r, int w) {
		double score = (2 * m + r + w) / 32;

		return score;
	}

	public static double getACT (int e, int m, int r, int s){
		double score = (e + (2 * m) + r + s)  / 1.8;

		return score;
	}

	public static double getGPA (double actual_gpa, double max_gpa, double multiplier){
		double gpa = ((actual_gpa / max_gpa) * 100 * multiplier);

		return gpa;
	}

	public static double getOverallScore (double exam, double gpa) {
		double score = exam + gpa;

		return score;
	}

	public static int testType () {
		Scanner input = new Scanner (System.in);

		//Check if user has entered incorrect input
		int test = 0;
		System.out.print("do you have 1) SAT scores or 2) ACT scores? ");
		test = input.nextInt();

		while ((test != 1) && (test != 2) ){
			System.out.println("Incorrect input.. please re-enter");
			System.out.print("do you have 1) SAT scores or 2) ACT scores? ");
			test = input.nextInt();
		}

		return test;
	}

	public static double getApplicant () {
		Scanner input = new Scanner (System.in);

		int test = testType();

		int math = 0;			//math score
		int read = 0;			//reading score
		int write = 0;			//writing score
		int science = 0;		//science score (only for ACT)
		int english = 0;		//english score (only for ACT)
		double exam = 0;		//overall exam score
		double gpa = 0;			//GPA of student
		double max_gpa = 0;		//Max GPA possible
		double multi = 0;		//Transcript Multiplier
		double gpa_score = 0; 	//overall GPA score
		double score = 0;		//overall score for applicant 

		//if user selected SAT
		if(test == 1){
			//get inputs for exam score
			System.out.print("SAT math? ");
			math = input.nextInt();
			System.out.print("SAT critical reading? ");
			read = input.nextInt();
			System.out.print("SAT writing? ");
			write = input.nextInt();

			//save and print exam score
			exam = getSAT(math, read, write);
			System.out.println("exam score = " + exam);

			//get inputs for gpa score
			System.out.print("overall GPA? ");
			gpa = input.nextDouble();
			System.out.print("max GPA? ");
			max_gpa = input.nextDouble();
			System.out.print("Transcript Multiplier? ");
			multi = input.nextDouble();

			//save and print gpa score
			gpa_score = getGPA(gpa, max_gpa, multi);
			System.out.println("GPA score = " + gpa_score);

			score = getOverallScore(exam, gpa_score);

		} else {
			//get inputs for exam score\
			System.out.print("ACT English? ");
			english = input.nextInt();
			System.out.print("ACT math? ");
			math = input.nextInt();
			System.out.print("ACT reading? ");
			read = input.nextInt();
			System.out.print("SAT science? ");
			science = input.nextInt();

			//save and print exam score
			exam = getACT(english, math, read, science);

			System.out.println("exam score = " + String.format("%.1f", exam));

			//get inputs for gpa score
			System.out.print("overall GPA? ");
			gpa = input.nextDouble();
			System.out.print("max GPA? ");
			max_gpa = input.nextDouble();
			System.out.print("Transcript Multiplier? ");
			multi = input.nextDouble();

			//save and print gpa score
			gpa_score = getGPA(gpa, max_gpa, multi);
			System.out.println("GPA score = " + String.format("%.1f", gpa_score));

			score = getOverallScore(exam, gpa_score);

		} 

		return score;
	}


	public static void main (String[] args){

		intro();
		
		int num_applicants = 2; 								//number of applicants
		double[] overallScores = new double[num_applicants];	//stores each applicant's overall scores
		int best_applicant = 0;

		//get applicant scores for each applicant
		for (int i = 0; i < num_applicants; i++){
			System.out.println("Information for applicant #" + (i+1) + ":");
			overallScores[0] = getApplicant();
		}
		
		//print out each applicant's scores
		for(int i=0; i<num_applicants; i ++){
			System.out.println("Applicant #" + (i+1) + " overall score  = " + overallScores[i]);
		}

		//compare each applicant's scores and find the best one
		for (int i=0; i<num_applicants; i++){
			if (overallScores[best_applicant] > overallScores[i]) {
				return;
			} else {
				best_applicant = i;
			} 

		}
		System.out.println("The best applicant is Applicant #" + best_applicant + " - Score: " + overallScores[best_applicant]);

/*
		// compare 2 applicants and find the best one
		if (overallScores[0] > overallScores[1]) {
			System.out.println("The first applicant seems to be better");
		} else if (overallScores[0] < overallScores[1]) {
			System.out.println("The second applicant seems to be better");
		} else {
			System.out.println("Both applicants are equal");

		}
*/

	}


}





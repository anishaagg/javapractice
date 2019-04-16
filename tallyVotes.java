//Tally Votes based on the String

import java.util.*;

public class tallyVotes {
	
	public static int[] tally (String s) {
		int[] votes = {0,0,0};

		// (M)cCain, (O)bama, (I)ndependent
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == 'M') {
				votes[0]++;
			} else if (letter == 'O') {
				votes[1]++;
			} else if (letter == 'I') {
				votes[2]++;
			} else {
				//do nothing
			}
		}

		return votes;

	}

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		// (M)cCain, (O)bama, (I)ndependent
		String strVotes = "MOOOOOOMMMMMOOOOOOMOMMIMOMMIMOMMIO";

		int[] votes = tally(strVotes);
		System.out.println("Votes: " + rmArrays.toString(votes));


	}
	

}






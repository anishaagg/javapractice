//Electoral Votes

import java.io.*;
import java.util.Scanner;

public class election {
	
	public static void main(String[] args) throws FileNotFoundException {

		//read file
		Scanner input = new Scanner (new File ("poll.txt"));

		int obamaVotes = 0;
		int mccainVotes = 0;

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int obama = input.nextInt();
                int mccain = input.nextInt();
                int eVotes = input.nextInt();
                if (obama > mccain) {
                    obamaVotes = obamaVotes + eVotes;
                } else if (mccain > obama) {
                    mccainVotes = mccainVotes + eVotes;
                }
            } else {
                input.next();   // skip non-integer token
            }
        }
        
        System.out.println("Obama: " + obamaVotes + " votes");
        System.out.println("McCain: " + mccainVotes + " votes");

	}
}
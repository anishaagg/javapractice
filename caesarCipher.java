// Caesar Cipher

import java.util.Scanner;

public class caesarCipher {

	public static String getMessage(Scanner in){
		//get message
		System.out.print("Your secret message: ");
		String message = in.nextLine();

		return message;
	}

	public static int getKey(Scanner in) {
		//get key
		System.out.print("Your secret key: ");
		int key = in.nextInt();

		return key;
	}

	public static String encode (String m, int key) {
		String encoded = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		//walk through each letter of the message
		for (int i = 0; i < m.length(); i++) {

			String letter = m.substring(i, i + 1);	//letter in the message

			//check if it is a space
			if (letter.equalsIgnoreCase(" ")) {
				encoded = encoded + " ";

			} else {
				//get index of letter in alphabet string
				int index = alphabet.indexOf(letter.toUpperCase());
				int new_index;
				//check if the index is at the end
				if ((alphabet.length() - index) > key) {
					new_index = index + key;
				} else {
					new_index = key - (alphabet.length() - index);
				}

				//new letter
				letter = alphabet.substring(new_index, new_index + 1).toLowerCase();

				//update encoded string
				encoded = encoded + letter;
			}

		}

		return encoded;
	}

	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		String message = getMessage(input);
		int key = getKey(input);

		String encoded = encode(message, key);

		System.out.println("The encoded message: " + encoded);


	}

}



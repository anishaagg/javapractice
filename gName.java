//Gangsta Name

import java.util.Scanner;


public class gName {
	
	public static String getName() {
		Scanner input = new Scanner (System.in);

		//get person's name
		System.out.print("Type your name, playa: ");
		String name = input.nextLine();

		return name;
	}

	public static String getGender() {
		Scanner input = new Scanner (System.in);

		//get gender
		System.out.print("(M)ale or (F)emale: ");
		String gender = input.nextLine();
		while ((!gender.equalsIgnoreCase("m")) && (!gender.equalsIgnoreCase("f"))) {
			System.out.print("(M)ale or (F)emale");
			gender = input.next();
		}

		return gender;
	}

	public static void printName (String n, String g) {
		String initial = n.substring(0, 1);
		String lastName = n.substring(n.indexOf(" ")+1, n.length());
		String firstName = n.substring(0, n.indexOf(" "));

		System.out.print("Your gangsta name is \"" + initial.toUpperCase() + ". ");
		System.out.print(lastName.toUpperCase());

		//based on gender
		if (g.equalsIgnoreCase("m")){
			System.out.print(" Daddy ");
		} else {
			System.out.print(" Goddess ");
		}

		System.out.println(firstName + "-izzle");
	}

	public static void main (String[] args) {

		String name = getName();
		String gender = getGender();

		printName(name, gender);


	}

}
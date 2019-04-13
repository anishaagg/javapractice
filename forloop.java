//ForLoop Practice
//forloop.java

import java.util.Scanner;

public class forloop {
	
	public static void main (String[] args) {

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++){
			for (int bdot = (4-i); bdot > 0; bdot--){
				System.out.print(".");

			}
			System.out.print(i+1);

			for (int j = i-1; j >=0; j--){
				System.out.print(".");

			}
			System.out.println("");
			
		}

/*
		System.out.println("....1");
		System.out.println("...2.");
		System.out.println("..3..");
		System.out.println(".4...");
		System.out.println("5....");

*/
	}
}
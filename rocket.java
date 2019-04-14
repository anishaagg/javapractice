//Rocket hw2

import java.util.Scanner;

public class hw2 {
	
	public static void top (int height) {
		int h = height*2;

		for (int i = 1; i<h; i++){
			for (int j = h-i-1; j >= 0; j--){
				System.out.print(" ");	
			}

			for (int k = 0; k<i; k++){
				System.out.print("/");
			}

			System.out.print("**");
			
			for (int k = 0; k<i; k++){
				System.out.print("\\");
			}
			
			System.out.println("");

		}

/*
		System.out.println("     /**\\ ");
    	System.out.println("    //**\\\\ ");
		System.out.println("   ///**\\\\\\ ");
		System.out.println("  ////**\\\\\\\\");
		System.out.println(" /////**\\\\\\\\\\");
*/
	}

	public static void section (int height) {
		System.out.print("+");
		for (int i = 1; i<=height; i++){
			System.out.print("=*=*");
			
		}
		System.out.println("+");
/*		
		System.out.println("+=*=*=*=*=*=*+");
*/
	}

	public static void topdiamond (int height) {
		for (int i = 1; i<=height; i++){
			System.out.print("|");

			for(int sym = 0; sym<2; sym++) {

				for (int k = height-i; k>0; k--){
					System.out.print(".");
				}
				for(int j = 0; j<i; j++) {
					System.out.print("/\\");
				}
				for (int k = height-i; k>0; k--){
					System.out.print(".");
				}
			}

			System.out.println("|");
		}
/*

		System.out.println("|../\\..../\\..|");
		System.out.println("|./\\/\\../\\/\\.|");
		System.out.println("|/\\/\\/\\/\\/\\/\\|");
*/

	}

	public static void botdiamond (int height) {
		for (int i = 1; i<=height; i++){
			System.out.print("|");

			for(int sym = 0; sym<2; sym++) {

				for (int k = 0; k<i-1; k++){
					System.out.print(".");
				}
				for(int j = height-i+1; j>0; j--) {
					System.out.print("\\/");
				}
				for (int k = 0; k<i-1; k++){
					System.out.print(".");
				}
			}

			System.out.println("|");

		}
/*
		System.out.println("|\\/\\/\\/\\/\\/\\/|");
		System.out.println("|.\\/\\/..\\/\\/.|");
		System.out.println("|..\\/....\\/..|");
*/
	}

	public static void main(String[] args) {

		int height = 3;

		top(height);
		section(height);
		topdiamond(height);
		botdiamond(height);
		section(height);
		botdiamond(height);
		topdiamond(height);
		section(height);
		top(height);

	}
}


/*

     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\

 */





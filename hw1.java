//Homework 1
//hw1.java

import java.util.Scanner;


public class hw1 {

	public static void die (){
		System.out.println("Perhaps she'll die.");
		System.out.println("");
	}

	public static void swollow (String animal){
		System.out.println("There was an old woman who swallowed a " + animal + ",");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		swollow("fly");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("bird");
		System.out.println("How absurd to swallow a bird.");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("cat");
		System.out.println("Imagine that to swallow a cat.");
		System.out.println("She swallowed the cat to catch the bird,");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("dog");
		System.out.println("What a hog to swallow a dog.");
		System.out.println("She swallowed the dog to catch the cat,");
		System.out.println("She swallowed the cat to catch the bird,");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("wolf");
		System.out.println("How brave to swollow a wolf.");
		System.out.println("She swallowed the wolf to catch the dog,");
		System.out.println("She swallowed the dog to catch the cat,");
		System.out.println("She swallowed the cat to catch the bird,");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed that fly,");
		die();

		swollow("horse");
		System.out.println("She died of course.");

		System.out.println(1.4 + (3 + 2 * 6) / (8 - 14 / 3) * 2.2);
	}
}





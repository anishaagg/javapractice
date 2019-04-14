//Homework 6

import java.io.*;
import java.util.Scanner;
import java.awt.*;

public class babyNames {

	//statement of what program does
	public static void intro () {
		System.out.println("");
		System.out.println("");

		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Security Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1920.");

		System.out.println("");
		System.out.println("");
	}

	//constants
	public static final int DECADES = 14;		//number of Decade data points
	public static final int START_YEAR = 1880;	//start year for data points
	public static final int WIDTH = 70;			//width of each decade

	//create the graph
	public static void drawGraph (Graphics g, int width) {
		
		g.drawLine(0, 25, width, 25);	//draw top line
		g.drawLine(0, 525, width, 525);	//draw bottom line

		//draw the grid lines for each decade based on width
		int count = 0;
		for(int i = 0; i < width; i =i + 70) {
			g.drawLine(i, 0, i, 550);
			g.drawString(Integer.toString(START_YEAR+(10*count)), i, 550);
			count++;
		}

	}

	//plot points on graph
	public static void plot (Graphics g, Scanner line, String name, String sex){
		g.setColor(Color.RED);

		//points used for graphing
		int x = 0;			//current x point
		int y = 0;			//current y point
		int prev_x = 0;		//previous x point
		int prev_y = 0;		//previous y point

		//go through each data point
		for(int i = 0; i < DECADES; i++) {
			//check if there was a previous point
			if (i != 0) {
				prev_x = x;		//set previous x point
				prev_y = y;		//set previous y point
			}

			int rank = 	line.nextInt();	//rank of the name
			x = WIDTH*i;				//set x point
			y = 525-(rank/2);			//set y point

			//label the point
			String label = name + " " + sex + " " + rank;
			//System.out.println(label);
			g.drawString(label, x, y);	
			
			//plot line only when there is a previous point
			if (i != 0) {
				g.drawLine(x, y, prev_x, prev_y);
			}
		}
	}
	
	public static void main (String[] args) throws FileNotFoundException{

		Scanner file = new Scanner (new File (args[0]));
		Scanner input = new Scanner (System.in);

		intro();

		//get user input on name and sex
		System.out.print("name? ");
		String name = input.next();
		System.out.print("sex (M or F)? ");
		String sex = input.next();

		boolean match = false;	//used to check if match was found

		while (file.hasNextLine()) {
			String line = file.nextLine();		//string for the matched line
			Scanner lineIn = new Scanner(line);	//single line to parse through
			//System.out.println(line);

			String thisName = lineIn.next();	//name found
			String thisSex = lineIn.next();		//sex found
			//System.out.println("Name: " + thisName + " Sex: " + thisSex);

			//check if name and sex matches inputted values
			if ((thisName.equalsIgnoreCase(name)) && (thisSex.equalsIgnoreCase(sex))) {
				//System.out.println(line);

				match = true;	//match found

				//draw panel and plot points
				DrawingPanel panel = new DrawingPanel(WIDTH*DECADES, 550);
				Graphics g = panel.getGraphics();
				drawGraph(g, WIDTH*DECADES);
				plot(g, lineIn, thisName, thisSex);
			}

		}

		//no match found
		if (match == false) {
			System.out.println("No matches found to " + name + " of Sex: " + sex);
		}

	}

}
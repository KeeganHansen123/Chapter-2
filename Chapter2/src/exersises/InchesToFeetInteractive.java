package exersises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int inchesToFeet = 12;
		
		int numOfInches;
		int numOfFeet;
		int extraLength;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of inches>>> ");
		numOfInches = input.nextInt();
		
		numOfFeet = numOfInches / inchesToFeet;
		extraLength = numOfInches % inchesToFeet; 
		
		System.out.println("That is " + numOfFeet + " feet and " + extraLength + " inches");
	}

}

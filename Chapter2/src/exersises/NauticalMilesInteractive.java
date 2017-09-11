package exersises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final double kiloMeters = 1.852;
		final double miles = 1.150779;
		
		double nauticalMiles;
		double kiloT;
		double milesT;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of nautical miles>>> ");
		nauticalMiles = input.nextDouble();
		
		kiloT = nauticalMiles * kiloMeters;
		milesT = nauticalMiles * miles;
		
		System.out.println("That is " + kiloT + " kilometers and " + milesT + " miles.");
	}

}

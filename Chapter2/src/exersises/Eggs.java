package exersises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final double dozenEggs = 3.25;
		final double  looseEggs = .45;
		
		double NumDozenEggs;
		double NumLooseEggs;
 		double totalDozenEggs;
 		double totalLooseEggs;
 		double costTotal;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many dozen eggs are you getting?>>> ");
		NumDozenEggs = input.nextDouble();
		System.out.println("How many loose eggs are you getting?>>> ");
		NumLooseEggs = input.nextDouble();
		
		totalDozenEggs = NumDozenEggs * dozenEggs;
		totalLooseEggs = NumLooseEggs * looseEggs;
		costTotal = totalDozenEggs + totalLooseEggs;
		
		System.out.println("You ordered " + NumDozenEggs + " eggs at " + dozenEggs + " a dozen and " + NumLooseEggs + " loose eggs at " 
		+ looseEggs + ". Thats a total of $"
				+ "" + costTotal);
		
	}

}

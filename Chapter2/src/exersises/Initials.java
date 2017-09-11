package exersises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String firstIn;
		String secondIn;
		String lastIn;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first letter of you first name>>> ");
		firstIn = input.next();
		System.out.println("Enter the first letter of your second name>>> ");
		secondIn = input.next();
		System.out.println("Enter the first letter of your last name>>> ");
		lastIn = input.next();
		
		System.out.println("Hello " + firstIn + "." + secondIn + "." + lastIn + ".");
	}

}

package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String color;
		String wordEst;
		String bodyPartPlural;
		String anAnimal;
		String aNoun;
		String PluralNoun;
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print("Enter a word that ends in est >>");
		wordEst = input.nextLine();
		System.out.print("Enter a body part thats plural >>");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter an Animal >>");
		anAnimal = input.nextLine();
		System.out.print("Enter a noun >>");
		aNoun = input.nextLine();
		System.out.print("Enter a Plural Noun >>");
		PluralNoun = input.nextLine();
		
		System.out.print("Enter a number>> ");
		a = input.nextInt();
		System.out.print("Enter another number>> ");
		b = input.nextInt();
		c = a - b;
		
		System.out.print("The " + color + " Dragon is the " + wordEst + " Dragon of all."
				+ "It has " + c + bodyPartPlural +", and a " + anAnimal + " shaped like a " + aNoun  
				+ ". It loves to eat " + PluralNoun + ", although it will feast on nearly anything.");
		
		
	}

}

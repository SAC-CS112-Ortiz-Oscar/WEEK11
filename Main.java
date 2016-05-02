// Week 11 - Main

import java.util.Scanner;

public class Main 
{
	private static Scanner input;
	
	public static void main(String[] args) 
	{
		input = new Scanner( System.in );
		
		boolean running = true;

		Dice newDice = new Dice();
		
		while(running)
		{
			System.out.print("Enter number of dices: ");
			int numberOfDices = input.nextInt();
				
			int diceRoll = newDice.throwDice(numberOfDices);
				
			System.out.print("Guess the number points: ");
			int numberOfPoints = input.nextInt();
				
			if(numberOfPoints == diceRoll)
				System.out.println("You are correct!");
			else
				System.out.printf("You are wrong! \nThe number was %d.", diceRoll);
			
			System.out.print("\n\nPress 1 to play again or any other number to exit... ");
			int again = input.nextInt();
			
			if(again != 1) 
			{
				newDice.printNumberOfThrows();
				newDice.printHistory();
				break;
			}
			else continue;
		}
	}
}
// Week 11 - Dice

public class Dice 
{
	Dice()
	{
		upperBound = 6;
		numberOfThrows = 0;
		index = 0;
		
	}
	
	public int throwDice(int dices)
	{
		int diceRoll;
		
		numberOfThrows++;
		
		upperBound = 6 * dices;
		
		diceRoll =  + rollDice(1,upperBound);
		
		setHistory(history, index, diceRoll);
		
		index++;
		logicalSize++;
		
		return diceRoll;
	}
	
	public void printNumberOfThrows()
	{
		System.out.printf("Total # of throws: \n%d\n", numberOfThrows);
	}
	public void printHistory()
	{
		System.out.println("Dice roll history:");
		for(int printIndex = 0; printIndex < logicalSize; printIndex++)
		{
			System.out.print(history[printIndex]+ "\n");
		}
	}
	
	private int rollDice(int lowerBound, int upperBound)
	{
		return lowerBound + (int)(Math.random() * upperBound);
	}
	
	private void setHistory(int history[], int index, int diceRoll)
	{
		history[index] = diceRoll;
	}
	

	int size = 20;
	int logicalSize = 0;
	private int upperBound;
	private int numberOfThrows;
	int index;
	private int history[] = new int[size];
}

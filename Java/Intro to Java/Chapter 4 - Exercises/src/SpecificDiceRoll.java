import java.util.Scanner;

public class SpecificDiceRoll {
	public static int RollCounter(int value)
	{
		//Takes in a value that the dice should equal
		//Returns the number of rolls it took to get the value
		int count = 0;
		int diceRoll  = 0;
		if ((value>13) || (value<2))
			throw new IllegalArgumentException();
		while(value != diceRoll)
		{
			int dice1 = (int)(Math.random()*5.9)+1;
			int dice2 = (int)(Math.random()*5.9)+1;
			diceRoll = dice1 + dice2;
			count += 1;
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the dice value: ");
		int value = stdin.nextInt();
		int count = RollCounter(value);
		stdin.close();
		System.out.print("It took " + count + " tries to get a " + value);
	}
}

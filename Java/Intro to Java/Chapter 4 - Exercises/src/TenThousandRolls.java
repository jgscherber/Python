
public class TenThousandRolls {
	public static double TenKRolls(int value)
	{
		int c = 0;
		int total = 0;
		double average = 0;
		while(c<10000)
		{
			c++;
			total += SpecificDiceRoll.RollCounter(value);
		}
		average = ((double)total)/10000.0;
		return average;
	}
	public static void main(String[] args) {
		System.out.println("Total On Dice\tAverage Number Of Rolls");
		System.out.println("-------------\t------------------------");
		for(int i=2;i<13;i++)
		{
			double average = TenKRolls(i);
			System.out.print("\t"+i+"\t\t"+average+"\n");
		}

	}

}

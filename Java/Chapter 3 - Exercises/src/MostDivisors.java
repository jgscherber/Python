
public class MostDivisors {

	public static void main(String[] args) {
		// Number less than 10000 with the most divisors
		int top = 10_000;
		int[] divisors;
		int index;
		int max = 0;
		int m_index = -1;
		int[] m_divisors;
		m_divisors = new int[200];
		for (int test = 2; test<top;test++)
		{
				//System.out.print("Test: " + test);
				index = 0;
				divisors = new int[200];
			for(int number = 2; number < Math.pow(test,0.5); number++)
			{
//				System.out.println("Div:" + (test/number));
				if (test%number == 0)
				{
					divisors[index] = number;
					index++;
				}
			}
			if (index > m_index)
			{
				max = test;
				m_divisors = divisors;
				m_index = index;
			}
		
		}
		System.out.print("The number with the most divisors is: " + max +"\nIt has " + m_index + " divisors");
		
		
	}
}
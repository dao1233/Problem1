
public class Primes {
	public static void main(String[] args)
	{
		int count = 0;
		int nValues = 50;
		for(int i = 2; i <= nValues; i++)
		{
			for (int j = 2; j <= Math.sqrt(i); j++)
			{			
				if (i % j == 0)
				{
					count++;
					continue;
				}		
			}
			if (count == 0) {
				System.out.println(i);
			} else
			count = 0;
		}
	}
}

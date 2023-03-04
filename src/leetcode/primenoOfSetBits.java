package leetcode;

public class primenoOfSetBits {
	public int countPrimeSetBits(int left, int right)
	{
		for(int i=left;i<=right;i++)
		{
			int setbit=Integer.bitCount(i);
			int c=0;
			for(int j=2;j<setbit;j++)
			{
				if(j<2)
					;
				if(j==2)
				{
					c++;
					continue;
				}
				if(setbit%j==0)
			}
		}
}}

package leetcode;

public class subsetofArray {
	public static void printSubsets(int[] sets)
	{
		int n=sets.length;
		for(int i=0;i<(1<<n);i++)
		{
			System.out.print("{");
			for(int j=0;j<sets.length;j++)
			{
				
				if((i&(1<<j))!=0)
					System.out.print(sets[j]);
			}
			System.out.println("}");
		}
	}
	
	public static void main(String args[])
	{
		int[] arr=new int[] {1,2,3};
		printSubsets(arr);
	}
	
}

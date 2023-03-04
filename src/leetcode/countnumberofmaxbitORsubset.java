package leetcode;

public class countnumberofmaxbitORsubset {
	  public static int countMaxOrSubsets(int[] nums)
	{
		int n=nums.length;
		int or=0;
		for(int i=0;i<nums.length;i++)
		{
			or=nums[i]|or;
		}
		
		int count=0;
		for(int i=0;i<(1<<n);i++)
		{
			int otheror=0;
			for(int j=0;j<nums.length;j++)
			{
				if((i&(1<<j))!=0)
				{
					otheror=nums[j]|otheror;
				}
			}
			if(otheror==or)
				count++;
		}
		return count;
	}
	
	public static void main(String args[])
	{
		int[] arr=new int[] {3,1};
		System.out.println(countMaxOrSubsets(arr));
	}
	
}

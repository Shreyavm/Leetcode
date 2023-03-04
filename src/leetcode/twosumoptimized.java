package leetcode;

import java.util.Arrays;

public class twosumoptimized {
	public static int[] twoSum(int[] nums, int target)
	{
		int num2[]=nums.clone();
		Arrays.sort(num2);
		int result[]=new int[2];
		int i=0;
		int j=num2.length-1;
		while(i<j)
		{
			if(num2[i]+num2[j]==target)
			{
				int k=0;
				for(int l=0;l<nums.length;l++)
				{
					if(nums[l]==num2[i]||nums[l]==num2[j])
						result[k++]=l;   //NOT WORKING FOR {3,3} 
				}
				return result;
			}
			if(num2[i]+num2[j]<target)
				i++;
			else
				j--;
		}
		return result;
	}
	
	  public static void main(String args[])
	  {
		  int nums[]= {3,3};
		  System.out.println(Arrays.toString(twoSum(nums,6)));
	  }
}

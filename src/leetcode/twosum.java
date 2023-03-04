package leetcode;

import java.util.Arrays;

public class twosum {
	  public static int[] twoSum(int[] nums, int target) {
		  int[] ans=new int[2];
	        for(int i=0;i<nums.length;i++)
	        {
	        	int val=nums[i];
	        	for(int j=i+1;j<nums.length;j++)
	        	{
	        		if(val+nums[j]==target)
	        		{
	        		ans[0]=i;
	        		ans[1]=j;
	        		return ans;
	        		}
	        	}
	        }
	        return ans;
	        		
	    }
	  
	  public static void main(String args[])
	  {
		  int nums[]= {2,4,6,8,7};
		  System.out.println(Arrays.toString(twoSum(nums,100)));
	  }
}

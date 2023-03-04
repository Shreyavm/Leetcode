package leetcode;

import java.util.ArrayList;
import java.util.List;

public class subarrayOfSumNLApnaCollege {
	public static List<Integer> fun(int[] nums,int s)
	{
		int i=0,j=0;
		int sum=0;
		List<Integer> res=new ArrayList<>();
		while(j<nums.length&&i<nums.length)
		{
			sum+=nums[j];
			while(i<nums.length&&sum>s)
			sum-=nums[i++];
			if(sum==s)
			{
				while(i<=j)
					res.add(nums[i++]);
				return res;
			}
			j++;
		}
		return res;
	}
	
	  public static void main(String args[])
	  {
	    int nums[]=new int[] {1,2,3,5,1,2,3,2};
	    System.out.println(fun(nums,7));
	  }
}

package leetcode;

import java.util.Arrays;

public class removeDuplicates {
	 public static int removeDuplicatess(int[] nums) {
	        int i=0;
	        int k=1;
	        for(int j=1;j<nums.length;j++)
	        {
	        	if(nums[j]!=nums[j-1])
	        	{
	        		nums[++i]=nums[j];
	        		k++;
	        	}
	        }
	        return k;
	 }
	 public static void main(String args[])
	 {
		 int nums[]=new int[] {0,0,1,1,1,2,2,3,3,4};
		 System.out.println(removeDuplicatess(nums));
		 System.out.println(Arrays.toString(nums));
	 }
}

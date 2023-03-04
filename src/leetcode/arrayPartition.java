package leetcode;
import java.util.*;
public class arrayPartition {
	 public static int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int sum=0;
	        for(int i=0;i<nums.length-1;i=i+2)
	        {
	        	sum+=Math.min(nums[i],nums[i+1]);
	        }
	        return sum;
	    }
	 public static void main(String args[])
	 {
		 int nums[]=new int[] {6,2,6,5,1,2};
		 System.out.println(arrayPairSum(nums));
	 }
}

package leetcode;
import java.util.*;
public class moveZeroesLeet {
	 public static void moveZeroes(int[] nums) {
		 int i=-1;
		 for(int j=0;j<nums.length;j++)
		 {
			 if(nums[j]!=0)
			 {
				int temp=nums[i+1];
				nums[i+1]=nums[j];
				nums[j]=temp;
				i++;
			 }
		 }
	 }
	 public static void main(String args[])
	 {
		 int nums[]=new int[] {0};
		 moveZeroes(nums);
		 System.out.println(Arrays.toString(nums));
	 }
}

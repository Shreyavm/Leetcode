package leetcode;
import java.util.*;
public class findAllDissapearedNumberInArrayII {
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> res=new ArrayList<>();
		 
		 for(int i=0;i<nums.length;i++)
		 {
			int d=nums[i];
			if(d<0)
				d*=-1;
			if(nums[d-1]>0)
				nums[d-1]*=-1;
		 }
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]>0)
				 res.add(i+1);
		 }
		 return res;
	 }
	 
	 public static void main(String args[])
	 {
		 int[] nums=new int[] {2,3,6,8,1,1,1,3,8};
	    	System.out.println( findDisappearedNumbers( nums));
	 }
}

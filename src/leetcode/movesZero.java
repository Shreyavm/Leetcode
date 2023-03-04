package leetcode;
import java.util.*;
public class movesZero {
	 public static void moveZeroes(int[] nums) {
	        ArrayList<Integer> res1=new ArrayList<>();
	        ArrayList<Integer> res2=new ArrayList<>(); //naive approach
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(nums[i]==0)
	        		res1.add(nums[i]);
	        	else
	        		res2.add(nums[i]);
	        		
	        }
	        int k=0;
	        for(int i=0;i<res2.size();i++)
	        	nums[k++]=res2.get(i);
	        for(int i=0;i<res1.size();i++)
	        	nums[k++]=res1.get(i);
	        
	    }
	 public static void main(String args[])
	 {
		 int nums[]=new int[] {0};
		 moveZeroes(nums);
		 System.out.println(Arrays.toString(nums));
	 }
}

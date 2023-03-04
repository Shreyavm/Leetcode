package leetcode;
import java.util.*;
public class threesumleet {
	 public static List<List<Integer>> threeSum(int[] nums) {
	      List<List<Integer>> ans=new LinkedList<>();
	      
	      Arrays.sort(nums);
	      for(int a=0;a<nums.length-2;a++)
	      {
	    	  if(a==0||(a>0&&nums[a]!=nums[a-1]))
	    	  {
	    		  int i=a+1;
	    		  int j=nums.length-1;
	    		  int sum=0-nums[a];
	    		  while(i<j) {
	    		  if(nums[i]+nums[j]==sum)
	    		  {
	    			  ans.add(Arrays.asList(nums[a],nums[i],nums[j]));
	    		      while(i<j&&nums[i]==nums[i+1])i++;
	    		      while(i<j&&nums[j]==nums[j-1])j--;
	    		      i++;
	    		      j--;
	    		  }
	    		  else if(nums[i]+nums[j]<sum)i++;
	    		  else
	    			  j--;
	    		  
	    	  }}
	      }
	     return ans;
	    }
	 public static void main(String args[])
	 {
		int arr[]= {0,1,1};
		System.out.println(threeSum(arr));
	 }
}

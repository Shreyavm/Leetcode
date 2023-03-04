package leetcode;

public class containsDuplicateII { //Naive-approach O(n^2), for O(n) approach look containsDuplicateII(hashmap) 
	  public static boolean containsNearbyDuplicate(int[] nums, int k) {
	        int n=nums.length;
	        for(int i=0;i<n;i++)
	        {
	        	int j=i+1;
	        	while(j<n&&(j-i)<=k)
	        	{
	        		if(nums[i]==nums[j])
	        			return true;
	        		j++;
	        	}
	        }
	        return false;
	    }
	  
	  public static void main(String args[])
	  {
		  int nums[]=new int[] {1,0,1};
		  System.out.println(containsNearbyDuplicate(nums,1));
	  }
}

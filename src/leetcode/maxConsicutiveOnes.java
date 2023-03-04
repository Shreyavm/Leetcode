package leetcode;

public class maxConsicutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int maxSoFar=0;
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]==1)
        		c++;
        	else
        		c=0;
        	if(maxSoFar<c)
        		maxSoFar=c;
        }
        return maxSoFar;
    }
    
    public static void main(String args[])
    {
    	int nums[]=new int[] {1};
    	System.out.println(findMaxConsecutiveOnes(nums));
    }
}

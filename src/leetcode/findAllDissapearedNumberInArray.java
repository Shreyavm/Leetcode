package leetcode;
import java.util.*;   //take extra memory other approach exist-
public class findAllDissapearedNumberInArray {
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> res=new ArrayList<>();
	        int store[]=new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	        ++store[nums[i]-1];
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(store[i]==0)
	        	{
	        		res.add(i+1);	
	        	}
	        }
	        return res;
	    }
    public static void main(String args[])
    {
    	int[] nums=new int[] {4,3,2,7,8,2,3,1};
    	System.out.println( findDisappearedNumbers( nums));
    }
}

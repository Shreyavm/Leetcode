package leetcode;
import java.util.*;
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(numbers.contains(nums[i]))
        		return true;
        	numbers.add(nums[i]);
        }
        return false;
    }
}
 /* Arrays.sort(nums);
  for(int i=0;i<nums.length-1;i++)
  {
	  if(nums[i]==nums[i-1])
		  return true;
	  
  }
  return false;*/

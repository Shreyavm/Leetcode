package leetcode;
import java.util.*;
public class containsDuplicateIIHashmap {
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 int n=nums.length;
		 
		 Map<Integer,Integer> hashMap=new HashMap<>();
		 for(int i=0;i<n;i++)
		 {
			 int j=nums[i];
			 if(hashMap.containsKey(j)&&i-hashMap.get(j)<=k)
				 return true;
			 hashMap.put(j,i);
		 }
		 return false;
	 }
}

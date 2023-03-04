package leetcode;

import java.util.Arrays;

public class nextGreaterElementI {
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	         
		 int res[]=new int[nums1.length];
		 int a=0;
		 for(int i=0;i<nums1.length;i++)
		 {
			 int k=-1;
			 for(int j=0;j<nums2.length;j++)
			 {
				 if(nums1[i]==nums2[j])
				 {
					 k=j;
					 break;
				 }
			 }
			 res[a]=-1;
			 for(int j=k+1;j<nums2.length;j++)
			 {
				 if(nums2[j]>nums1[i])
				 {
					 res[a]=nums2[j];
					 break;
				 }
			 }
			 a++;
		 }
		 return res;
	    }
	 public static void main(String args[])
	 {
		 int nums1[]=new int[] {6,2};
		 int nums2[]=new int[] {2,6,3,8};
		 System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
	 }
}

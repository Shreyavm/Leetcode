package leetcode;

import java.util.Arrays;

public class mergeSort {
	  public static void merge(int[] nums1, int m, int[] nums2, int n) 
	  {
		  int res[]=new int[m+n];
		  int i=0;
		  int j=0;
		  int k=0;
		  while(i<m&&j<n)
		  {
			  if(nums1[i]<nums2[j])
				  res[k++]=nums1[i++];
			  else 
				  res[k++]=nums2[j++];
		  }
		  while(i<m)
			  res[k++]=nums1[i++];
		  while(j<n)
			  res[k++]=nums2[j++];
		  for(int l=0;l<m+n;l++)
			  nums1[l]=res[l];
	  }
	  public static void main(String args[])
	  {
		  int nums1[]={0};
		  int nums2[]= {1};
		  merge(nums1,0,nums2,1);
				  System.out.println(Arrays.toString(nums1));
		  }
	  }


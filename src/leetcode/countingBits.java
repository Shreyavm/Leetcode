package leetcode;

import java.util.Arrays;

public class countingBits {
	 public static int[] countBit(int n)
	 {
		 int[] arr=new int[n+1];
		 for(int i=0;i<=n;i++)
			 arr[i]=arr[i>>1]+(i&1);
		 return arr;
	 }
	 
	 public static void main(String args[])
	 {
		 System.out.println(Arrays.toString(countBit(2)));
	 }
}

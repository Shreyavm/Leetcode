package leetcode;

import java.util.Arrays;

public class THREEsum {
	public static boolean twoSum(int arr[],int target,int i)
	{
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]==target)
				return true;
			if(arr[i]+arr[j]>target)
				j--;
			else
				i++;
		}
		return false;
	}
public static boolean threesum(int arr[])
{
	Arrays.sort(arr);
	for(int i=0;i<arr.length-2;i++)
	{
		if(twoSum(arr,-arr[i],i+1))
			return true;
	}
	return false;
}

public static void main(String arg[])
{
	int arr[]= {3,3,3,4};
	System.out.println(threesum(arr));
}

}

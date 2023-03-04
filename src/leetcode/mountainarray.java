package leetcode;

public class mountainarray {
public static int ascBS(int[] arr,int val,int m)
{
	int s=0;
	int e=m-1;
	while(s<=e)
	{
		int mid=(s+e)/2;
		if(val>arr[mid])
		    s=mid+1;;
		if(val<arr[mid])
			e=mid-1;
		else 
			return mid;
	}
	return -1;
}

public static int dscBS(int[] arr,int val,int m)
{
	int s=m;
	int e=arr.length-1;
	while(s<=e)
	{
		int mid=(s+e)/2;
		if(val>arr[mid])
			e=mid-1;
		else if(val<arr[mid])
			s=mid+1;
		else 
			return mid;
	}
	return -1;
}

public static int pivot(int[] arr)
{
	int s=0;
	int e=arr.length-1;
	while(s<e)
	{
		int mid=(s+e)/2;
		if(arr[mid]<arr[mid+1])
		s=mid+1;
		if(arr[mid]>arr[mid+1])
			e=mid;
	}
	return s;
}

public static void main(String arg[])
{
	int[] arr= {2,4,5,6,7,6,4,1};
	int pi=pivot(arr);
	System.out.println(pi);
	System.out.println(ascBS(arr,6,pi));
	System.out.println(dscBS(arr,6,pi));
}
}

package leetcode;

public class ceilingofanumber {
public static int ceiling(int[] arr,int target)
{
	int start=0;
	int end=arr.length-1;
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(arr[mid]==target)
			return mid;
		if(mid!=arr.length-1&&arr[mid]<target)
			start=mid+1;
		else
			end=mid-1;
	}
	if(arr[start]>target)
		return start;
	return -1;
}

public static void main(String[] args)
{
	int[] arr=new int[] {3,5,6,7,11};
	System.out.println(ceiling(arr,8));
}
}

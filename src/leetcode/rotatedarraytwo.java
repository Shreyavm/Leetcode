package leetcode;

public class rotatedarraytwo {
	 public static int binarySearch(int nums[],int start,int end,int target)
		{
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(nums[mid]==target)
					return mid;
				if(nums[mid]<target)
					start=mid+1;
				else
					end=mid-1;
			}
			return -1;
		}
		public static int pivot(int[] nums)
		{
			int start=0;
			int end=nums.length-1;
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(mid<end&&nums[mid]>nums[mid+1])
					return mid;
				if(mid>start&&nums[mid]<nums[mid-1])
					return mid-1;
				if(nums[mid]==nums[start]&&nums[mid]==nums[end])
				{
					if(nums[start]>nums[start+1])
						return start;
					start++;
					end--;
				}
				if(nums[mid]<nums[0])
					end=mid-1;
				else
					start=mid+1;
			}
			return -1;
		}
		 public static boolean search(int[] nums, int target) {
		        int piv=pivot(nums);
		        if(piv==-1)
		        	return binarySearch(nums,0,nums.length-1,target)!=-1;
		        int a=binarySearch(nums,0,piv,target);
		        int b=binarySearch(nums,piv+1,nums.length-1,target);
		        if(a==-1&&b==-1)
		        	return false;
		        return true;
		        
		        
		    }
	public static void main(String args[])
	{
		int[] nums=new int[] {6,6,6,6,6,6,6,6,6,6,0,1,2,3,4,5,6,6,6,6,6,6};
		System.out.println(search(nums,6));
	}

}

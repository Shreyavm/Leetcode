package leetcode;

public class convertSortedArrayToBST {
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	 public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length==0)
	        	return null;
	        return constructBST(nums,0,nums.length-1);
	    }
	 public static TreeNode constructBST(int nums[],int s,int e)
	 {
		 if(e<s)
			 return null;
		 int mid=s+(e-s)/2;
		 TreeNode newnode=new TreeNode(nums[mid]);
		 newnode.left=constructBST(nums,s,mid-1);
		 newnode.right=constructBST(nums,mid+1,e);
		 return newnode;
	 }
	 
}

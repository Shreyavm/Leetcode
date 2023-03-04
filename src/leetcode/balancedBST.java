package leetcode;
import java.util.*;
public class balancedBST {
	
	class node
	{
		int data;
		node left;
		node right;
		
		node(int val)
		{
			data=val;
			left=null;
			right=null;
		}
		
	}
	
public static int height(node root)
{ 
if(root==null)
	  return 0;
 int lh=height(root.left);
 int rh=height(root.right);
 return Math.max(lh, rh)+1;

}

public static boolean isBalanced(node root)
{
	if(root==null)
		return true;
	if(isBalanced(root.left)==false)
		return false;
	if(isBalanced(root.right)==false)
		return false;
	int lh=height(root.left);
	int rh=height(root.right);
	
	if(Math.abs(lh-rh)<=1)
		return true;
	return false;
	

}
}
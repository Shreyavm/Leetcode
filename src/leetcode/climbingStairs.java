package leetcode;

public class climbingStairs {
	  public static int climbStairs(int n) {
	        int count=climb(0,n);
	        return count;
	    }
	  public static int climb(int i,int n)
	  {
		  if(i==n)
			  return 1;
		  if(i>n)
			  return 0;
		  int count=0;
		  count+=climb(i+1,n);
		  count+=climb(i+2,n);
		  return count;
	  }
	  public static void main(String args[])
	  {
		  System.out.println(climbStairs(24));
	  }
}

package leetcode;

public class climibingStairs {
	 public static int climbStairs(int n) {
		 if(n==1)
			 return 1;
		 if(n==0)
			 return 0;
		 int a=1;
		 int b=1;
		 int res=0;
		 for(int i=0;i<=n-2;i++)
		 {
			res+=a+b;
			a=b;
			b=res;
		 }
		 return res;
	 }
	 
	 public static void main(String args[])
	 {
		 System.out.println(climbStairs(3));
	 }
}

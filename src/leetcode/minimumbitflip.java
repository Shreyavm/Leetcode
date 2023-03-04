package leetcode;

public class minimumbitflip {
	  public static int minBitFlips(int start, int goal)
	  {
		  int res=start^goal;
		  int count=0;
		  while(res!=0)
		  {
			  res=res&res-1;
			  count++;
		  }
		  return count;
	  }
	  public static void main(String[] arg)
	  {
		  System.out.println(minBitFlips(3,6));
	  }
}

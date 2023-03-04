package leetcode;
import java.util.*;
public class pascalstriangleii {
	  public static List<Integer> getRow(int rowIndex) {
	        List<Integer> res=new ArrayList<>();
	        int m=rowIndex;
	        for(int i=0;i<=rowIndex;i++)
	        {
	        	res.add(fact(m)/(fact(m-i)*fact(i)));
	        }
	        return res;
	    }
	  public static int fact(int n)
	  {
		  if(n<=1)
			  return 1;
		  return fact(n-1)*n;  ///problem is number is becoming very big so this method is failing
	  }
	 public static void main(String args[])
	 {
		 System.out.println(getRow(13)); //wrong output because big number
	 }
}

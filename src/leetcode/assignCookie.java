package leetcode;

import java.util.Arrays;

public class assignCookie {
	  public static int findContentChildren(int[] g, int[] s) {
	        int i=0,j=0,c=0;
	        Arrays.sort(g);
	        Arrays.sort(s);
	        while(i<g.length&&j<s.length)
	        {
	        	if(g[i]<=s[j])
	        	{
	        		c++;
	        		i++;
	        	}
	        	j++;
	        }
	        return c;
	    }
	  public static void main(String args[])
	  {
		  int g[]=new int[] {10,9,8,7};
		  int s[]=new int[] {5,6,7,8};
		  System.out.println(findContentChildren(g,s));
	  }
}

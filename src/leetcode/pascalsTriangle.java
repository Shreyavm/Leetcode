package leetcode;
import java.util.*;
public class pascalsTriangle {
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> res=new ArrayList<>();
          List<Integer> row,pre=null;
          for(int i=0;i<numRows;++i)
          {
        	  row=new ArrayList<Integer>();
        	  for(int j=0;j<=i;++j) {
        	  
        		  if(j==0||j==i)
        			  row.add(1);
        		  else
        			  row.add(pre.get(j-1)+pre.get(j)); //index out of bound
        		  pre=row;
          }
        	  res.add(row);
          }
          return res;
	    }
	 
	 public static void amain(String args[])
	 {
		 System.out.println(generate(5)); //error
	 }
}

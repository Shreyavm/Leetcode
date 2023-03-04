package leetcode;
import java.util.*;
public class reshapeMatrix {
	 public static int[][] matrixReshape(int[][] mat, int r, int c) {
	        
		    int row=mat.length;
	        int col=mat[0].length;
	        if(row*col!=r*c)
	        	return mat;
	        int[][] res=new int[r][c];
	        for(int i=0;i<r*c;i++)
	        {
	        	res[i/c][i%c]=mat[i/col][i%col];
	        }
	        return res;
	        
	    }
    public static void main(String args[])
    {
    	int[][] mat=new int[][] {{1,2},{3,4}};
        mat=matrixReshape(mat,1,4);
    	for(int i=0;i<4;i++)
    	{
    		System.out.print(mat[i/4][i%4]);
    	}
    	System.out.println();
    }
}

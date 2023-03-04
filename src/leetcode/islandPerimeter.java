package leetcode;

public class islandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int a=grid.length;
        int b=grid[0].length;
        int count=0;
        for(int i=0;i<a;i++)
        {
        	for(int j=0;j<b;j++)
        	{
        		if(grid[i][j]==1)
        		{
        			if(i==0)
        				count++;
        			else if(i<a&&grid[i-1][j]==0)
        				count++;
        			if(j==0)
        				count++;
        			else if(j<b&&grid[i][j-1]==0)
        				count++;
        			if(i==a-1)
        				count++;
        			else if(i<a&&grid[i+1][j]==0)
        				count++;
        			if(j==b-1)
        				count++;
        			else if(j<b&&grid[i][j+1]==0)
        				count++;
        			
        			
        		}
        	}
        }
        return count;
    }
    public static void main(String args[])
    {
    	int grid[][]=new int[][] {{1,0}};
    	System.out.println(islandPerimeter(grid));
    }
}

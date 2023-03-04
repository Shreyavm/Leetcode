package leetcode;

public class rangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
    int p=m;
    int q=n;
    for(int i=0;i<ops.length;i++)
    {
    if(ops[i][0]<p)
    	p=ops[i][0];
    if(ops[i][1]<q)
    	q=ops[i][1];
    }
    return p*q;
}
}

package leetcode;

public class onebittwobitchar {
	public static boolean isOneBitCharacter(int[] bits)
	{
		if(bits.length==1||bits[bits.length-2]==0)
			return true;
		int i=(bits.length)-2;
		int count=0;
		while(bits[i]!=0)
		{
			count++;
			if(i==0)
				break;
			i--;
		}
		if(count%2==0)
			return true;
		return false;
    }
	public static void main(String arg[])
	{
		int[] arr= new int[] {1,0};
		System.out.println(isOneBitCharacter(arr));
	}
}

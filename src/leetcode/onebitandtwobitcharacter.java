package leetcode;

public class onebitandtwobitcharacter {
	 public static boolean isOneBitCharacter(int[] bits) 
	 {
		 if(bits[(bits.length)-2]==0)
			 return true;
		 int count=0;
		for(int i=(bits.length)-2;i>0;i--)
		{
			if(bits[i]==0)
				break;
			count++;
		}
		if(count%2==0)
			return true;
		return false;
	 }
	 public static void main(String[] arg)
	 {
		 int[] ar= {1,1,1,0};
		 System.out.println(isOneBitCharacter(ar));
	 }

}

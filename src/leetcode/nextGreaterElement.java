package leetcode;
import java.util.*;
public class nextGreaterElement {
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 Map<Integer,Integer> hashMap=new HashMap<>();
		 Stack<Integer> st=new Stack<>();
		 int res[]=new int[nums1.length];
		 for(int i=0;i<nums2.length;i++)
		 {
			 int num=nums2[i];
			 while(!st.isEmpty()&&st.peek()<num)
				 hashMap.put(st.pop(), num);
			 st.push(num);
		 }
		 for(int i=0;i<nums1.length;i++)
		 {
			 int num=nums1[i];
			 if(hashMap.containsKey(num)) //   --->nums1[i] = map.getOrDefault(Nums1[i], -1); no need of extra array
				 res[i]=hashMap.get(num);
			 else
				 res[i]=-1;
		 }
		 return res;
	 }
	 public static void main(String args[])
	 {
		 int num1[]=new int[] {2,4};
		 int num2[]=new int[] {1,2,3,4};
		 System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
	 }
}

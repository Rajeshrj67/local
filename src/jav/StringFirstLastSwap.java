package jav;

public class StringFirstLastSwap {

	public static void main(String[] args) {

		String s1="hi how are you";
		String[] s2=s1.split(" ");
		
		String temp=s2[0];
		s2[0]=s2[s2.length-1];
		s2[s2.length-1]=temp;
		
		String s3="";
		
		for(int i=0;i<s2.length;i++)
		{
			s3=s3+" "+s2[i];
		}
		System.out.println(s3);
	}
}
package jav;

public class String11 {

	public static void main(String[] args) {

		String s1="Good Afternoon";
		int count=0;
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				count++;
			}
		}
		System.out.println(count);	
	}
}	
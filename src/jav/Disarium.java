package jav;
public class Disarium {
	public static int count(int a)
	{
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int num=135;
		int a=num;
		int pos=count(a);
		int sum=0;
		int ld=0;
		ld=a%10;
		sum=sum+(int)Math.pow(ld,pos);
		System.out.println(sum);
		while(a>0)
		{
			ld=a%10;
			sum=sum+(int)Math.pow(ld,pos);
			a=a/10;
			pos--;
		}
		if(sum==num)
		{
			System.out.println("It is Disarium Number");
		}
		else
		{
			System.out.println("It is not a Disarium Number");
		}
	}
}
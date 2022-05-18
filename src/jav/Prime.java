package jav;

public class Prime {

	public static void main(String[] args) {

		int a=17;
		int b=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				b=1;
				System.out.println("not a prime");
				break;
			}
		}
		if(b==0)
		{
			System.out.println("prime");
		}
	}
}
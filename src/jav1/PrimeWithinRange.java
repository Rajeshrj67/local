package jav1;

public class PrimeWithinRange {
	
	public static void primecheck(int a,int b)
	{
		int c=0;
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c=1;
					break;
				}
			}
		if(c==0)
		{
			System.out.println(i);
		}
		c=0;
		}
	}

	public static void main(String[] args) {

		primecheck(3,100);
	}
}
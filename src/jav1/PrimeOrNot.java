package jav1;

public class PrimeOrNot {

	public static void main(String[] args) {

		int num=17;
		int a=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				a=1;
				System.out.println(num+" is not a prime");
				break;
			}
		}
		if(a==0)
		{
			System.out.println(num+" is a prime");
		}
	}
}
package jav1;

import java.util.Scanner;

public class SumOfConsec {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		
		int a=s.nextInt();
		int sum=0;
		
		while(a>10)
		{
			int b=0;
			int c=0;
			
			b=a%100;
			b=b/10;
			
			c=a%10;
			c=c*10+b;   
			
			a=a/10;
			
			sum=sum+c;
		}
		System.out.println(sum);
	}
}
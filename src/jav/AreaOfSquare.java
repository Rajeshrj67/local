package jav;

import java.util.Scanner;

public class AreaOfSquare {
	public int square(int a) {
		int b=0;
		b=a*a;
		return b;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("enter a value");
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		AreaOfSquare ab=new AreaOfSquare();
		int c = ab.square(a);
		System.out.println(c);
	
				
		

	}

}

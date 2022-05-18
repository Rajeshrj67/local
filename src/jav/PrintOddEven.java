package jav;

import java.util.Scanner;

public class PrintOddEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner	s=new Scanner(System.in);
		int a = s.nextInt();
		for(int i=1;i<=a;i++) {
		if(i%2==0)
			System.out.println(i+" even");
		else
			System.out.println(i+" odd");
	}
  }
}
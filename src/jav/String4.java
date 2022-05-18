package jav;

public class String4 {

	public static void main(String[] args) {

//		creating String using new keyword
		String a=new String();
		System.out.println(a);//no o/p
		String b=new String("hiii");
		System.out.println(b);//hiii
		char[] ch= {'h','e','l','l','o'};
		String c=new String(ch);
		System.out.println(c);
	}
}

package jav;

public class String6 {

	public static void main(String[] args) {

		String a="hiii";
		String b=new String("hiii");
		System.out.println(a==b);//false
//		using equals method
		System.out.println(a.equals(b));//true
		String c="hiii";
		String d=new String("Hiii");
//		using equalsIgnoreCase method
		System.out.println(c.equalsIgnoreCase(d));//true
	}
}

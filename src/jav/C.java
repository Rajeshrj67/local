package jav;

public class C {
	static int a=a();
	static int b=a()+b();
	
	public static int a()
	{
		System.out.println("a()");
		return 5;
	}
	
	public static int b()
	{
		System.out.println("b()");
		return 5+a();
	}

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);

	}

}

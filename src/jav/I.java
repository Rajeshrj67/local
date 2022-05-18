package jav;

public class I {
	int a;
	I()
	{
		System.out.println("I()");
	}

	public static void main(String[] args) {
		
		I a=new I();
		I b=new I();
		
		System.out.println(a.a);
		System.out.println(b.a);
		a.a=100;
		b.a=200;
		System.out.println(a.a);
		System.out.println(b.a);

		
	}

}

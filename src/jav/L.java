package jav;

public class L {
	static int a=10;
	int b=10;
	@SuppressWarnings("static-access")
	L()
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(L.a);
		
		System.out.println(b);
		System.out.println(this.b);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		L a=new L();
	}

}

package jav;

public class G {
	G()
	{
		System.out.println("G()");
	}
	
	G(int a)
	{
		System.out.println("G(int a)");
	}
	
	G(int a,int b)
	{
		System.out.println("G(int a,int b)");
	}


	public static void main(String[] args) {
		
		G a=new G();
		G b=new G(10);
		G c=new G(10,20);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}

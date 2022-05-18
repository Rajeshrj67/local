package jav;

public class Driver {

	public static void main(String[] args) {

		M a=new M("Rajesh",18);
		display(a);
	}
	public static void display(M e)
	{
		System.out.println("name "+e.name);
		System.out.println("age "+e.age);
	}

}

package tyss_JAVA;

public class H {

	public void m1(String s) {
		System.out.println("from String");
	}
	public void m1(Object o) {
		System.out.println("from String");
	}
	public void m1(StringBuffer s) {
		System.out.println("from String");
	}
	public static void main(String[] args) {
		H h=new H();
		h.m1(new Object());
		h.m1("java");
		h.m1(new StringBuffer());
		//h.m1(null);
	}
}
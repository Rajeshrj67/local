package tyss_JAVA;

public class Pen {

	final String brand="parker";
	int price=300;
	String color="black";
	
	public void write() {
		System.out.println("pen is used to write");
	}
	public Pen(int price,String color) {
		this.price=price;
		this.color=color;
	}
	public static void main(String[] args) {
		Pen p = new Pen(300,"black");
		p.write();
		System.out.println(p.brand);
		System.out.println(p.color);
		System.out.println(p.price);
	}
}
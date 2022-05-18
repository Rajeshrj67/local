package tyss_JAVA;

public class G {

	private void a() {
		System.out.println("from private");
	}
	
	public void b() {
		a();
	}
	
	public static void main(String[] args) {
		G g=new G();
		g.b();
		
	}
}
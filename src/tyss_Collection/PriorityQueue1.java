package tyss_Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		PriorityQueue<Object> p=new PriorityQueue<>();
		p.add('A');
		p.add('B');
		p.add('D');
		p.add('C');
		p.add('E');
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}
}
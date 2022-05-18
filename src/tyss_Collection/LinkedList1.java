package tyss_Collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<>();
		l.add(10);
		l.add("hi");
		l.add('A');
		l.addFirst("hello");
		l.addLast("bye");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(1));
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}

}

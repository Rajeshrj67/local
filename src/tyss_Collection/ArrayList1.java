package tyss_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Object> list1 = new ArrayList<>();
		list1.add(1);
		list1.add("hi");
		list1.add(null);
		list1.add(1);
		list1.add('A');
		list1.add(2,"im two");
		for (Object obj : list1) {
			System.out.println(obj);
		}
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add('A');
		list2.add('A');


		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(1);
		System.out.println(list.get(3));
		System.out.println(list.get(4));// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out
										// of bounds for length 4
		Collections.sort(list);
		for (Integer obj : list) {
			System.out.println(obj);
		}
	}

}

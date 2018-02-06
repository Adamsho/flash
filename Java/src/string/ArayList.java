package string;

import java.util.ArrayList;

public class ArayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("Bye Bye");
		list.add(1);
		System.out.println(list);
		
		list.set(3, "everyone");
		System.out.println(list);
		

		list.get(0);
		System.out.println(list.get(0));
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}

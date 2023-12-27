package lists_Practice;

import java.util.ArrayList;
import java.util.List;

public class IteratList {
	public static void main(String[] args) {
		System.out.println("printing array list of colors");

		List<String> lis = new ArrayList<String>();
		lis.add("red");
		lis.add("green");
		lis.add("orange");
		lis.add("white");
		lis.add("yellow");
		lis.add("black");
//	System.out.println(a.size());
		System.out.println(lis);

		// Write a Java program to iterate through all elements in an array list..
		for (String a : lis) {
			System.out.println(a);

		}

	}
}

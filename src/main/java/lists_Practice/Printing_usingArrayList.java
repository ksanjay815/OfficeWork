package lists_Practice;

import java.util.ArrayList;
import java.util.List;

public class Printing_usingArrayList {
	public static void main(String[] args) {

		// Write a Java program to create an array list, add some colors (strings) and
		// print out the collection.

		System.out.println("printing array list of colors");

		List<String> a = new ArrayList<String>();
		a.add("red");
		a.add("green");
		a.add("orange");
		a.add("white");
		a.add("yellow");
		a.add("black");
		System.out.println(a);
		System.out.println(a.size());

	}
}

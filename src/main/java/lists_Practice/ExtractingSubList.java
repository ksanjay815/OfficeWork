package lists_Practice;

import java.util.ArrayList;
import java.util.List;

public class ExtractingSubList {
	public static void main(String[] args) {
		// Write a Java program to extract a portion of an array list.
		
		
		// Creae a list and add some colors to the list
		List<String> li = new ArrayList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Orange");
		li.add("White");
		li.add("Black");
		System.out.println("Original list: " + li);
		List<String> sub_List = li.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);

	}
}

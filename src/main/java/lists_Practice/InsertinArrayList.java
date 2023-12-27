package lists_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertinArrayList {
	public static void main(String[] args) {

		// Write a Java program to insert an element into the array list at the first
		// position.

		System.out.println("printing array list of colors");

		List<String> a = new ArrayList<String>();
		
		// to add in the list
		a.add("red");
		a.add("green");
		a.add("orange");
		a.add("white");
		a.add("yellow");
		a.add("black");
		System.out.println(a);
		
		// to add at any index
		a.add(0,"violet");
		// to change the value at index
		a.set(3, "nylon");
		// to remove the item in the list
		a.remove(3);
		System.out.println(a);
		System.out.println(a.size());
		
		// to sort an array list
		Collections.sort(a);
		System.out.println(a);
		
		// to reverse an array list
		Collections.reverse(a);
		System.out.println(a);
		
		// to swap an array list
		Collections.swap(a, 0, 3);
		System.out.println(a);
		
		
		// to shuffle an array list
		Collections.shuffle(a);
		  System.out.println("List after shuffling:\n" + a);
		    
		// Search the value Red
		    if (a.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
		    
		    
		   //Write a Java program to compare two array lists. 
		    
	ArrayList<String> c1= new ArrayList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");

    ArrayList<String> c2= new ArrayList<String>();
    c2.add("Red");
    c2.add("Green");
    c2.add("Black");
    c2.add("Pink");

    //Storing the comparison output in ArrayList<String>
    ArrayList<String> c3 = new ArrayList<String>();
    for (String e : c1)
       c3.add(c2.contains(e) ? "Yes" : "No");
    System.out.println(c3);
   
    
    //Write a Java program to join two array lists.
    ArrayList<String> c= new ArrayList<String>();
    c.addAll(c1);
    c.addAll(c2);
    System.out.println(c);
    
    
}
}

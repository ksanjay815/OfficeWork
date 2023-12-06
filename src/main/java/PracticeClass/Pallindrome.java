package PracticeClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Pallindrome {

	

	public static void main(String[] args) {
		
		
		/*
		 * A String is said to be Palindrome if its value is same when reversed. For
		 * example “aba” is a Palindrome String. String class doesn’t provide any method
		 * to reverse the String but StringBuffer and StringBuilder class has reverse
		 * method that we can use to check if String is palindrome or not.
		 */
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		
	String str = sc.nextLine();
	
	String str1= new StringBuilder(str).reverse().toString();
	
	if(str.equalsIgnoreCase(str1)) {
		System.out.println("It is a pallindrome");
	}else {System.out.println("It is not a pallindrome");
	}
	*/
	
		 String original, reverse = "";
	        Scanner in = new Scanner(System.in);
	        int length;
	        System.out.println("Enter the number or String");
	        original = in.nextLine();
	        length = original.length();
	        for (int i =length -1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);
	        }
	        System.out.println("reverse is:" +reverse);
	         
	        if(original.equals(reverse)) 
	            System.out.println("The number/String is palindrome");
	        else
	            System.out.println("The number/String is not a palindrome");
	        
	        
		}
}

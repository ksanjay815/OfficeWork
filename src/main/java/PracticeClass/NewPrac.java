package PracticeClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewPrac {

	public static void main(String args[]) {

		/*
		 * // problem 1 int a = 15; for (int i = 1; i <= a; i++) { if (i % 3 == 0 && i %
		 * 5 == 0) { System.out.println("FizzBuzz"); } else if (i % 3 == 0 && i % 5 !=
		 * 0) { System.out.println("Fizz"); } else if (i % 3 != 0 && i % 5 == 0) {
		 * System.out.println("Buzz"); } else System.out.println(i); }
		 */

		// problem 2
		// Write a Java program to find the largest number?
		/*
		 * int ar[] = { 25, 48, 65, 20, 8, 90, 55 }; int max=ar[0];
		 * 
		 * for (int i = 0; i < ar.length; i++) { if(ar[i]>max) {
		 * 
		 * max=ar[i]; System.out.println(max);
		 * 
		 * } }
		 */

		// problem 3
// java program to find 2nd largest number in an array

		
		  int arr[] = { 25, 48, 65, 20, 8, 90, 55 };
		  
		  int temp; for (int i = 0; i < arr.length; i++) {
		   for (int j = i + 1; j <arr.length; j++) {
		    if (arr[i] > arr[j]) { 
		    temp = arr[i];
		     arr[i] = arr[j];
		  arr[j] = temp; }
		   } } System.out.println("the 2nd largest no in array is :  "+ (arr[arr.length - 2]));
		 

		// problem 4
		// Write a Java program to print the command line arguments?

		
		  if (args.length > 0) {
		   System.out.println("The command line arguments are:");
		  for(String val:args) 
		  System.out.println(val); } else
		  System.out.println("No command line arguments found.");
		 
		// problem 5
		// Write a Java program to print the input from scanner
		/*
		 * int a; System.out.println("enter a no"); Scanner sc = new Scanner(System.in);
		 * a=sc.nextInt(); System.out.println(a); System.out.println("enter a name");
		 * Scanner sc1 = new Scanner(System.in); String b=sc1.nextLine();
		 * System.out.println("name is  "+b);
		 */

		// problem 6
		// Write a Java program to find odd and even numbers
		/*
		 * int a; System.out.println("Enter any no"); Scanner sc= new
		 * Scanner(System.in); a=sc.nextInt();
		 * 
		 * if(a%2==0) { System.out.println("it is a Even no"); } else if (a%2!=0) {
		 * System.out.println("it is a Odd no"); }
		 */

		// problem 7
		// Write a Java program to compare two strings?
		String a1 = "welcome";
		String a2 = "welcome";

		/* if(a1.compareTo(a2)==0) // comparing a string
		/*
		 * if (a1.equalsIgnoreCase(a2)) // using equals {
		 * System.out.println("It is equal"); } else {
		 * System.out.println("it is not equal"); } System.out.println(a1==a2);
		 * System.out.println(a1.equals(a2));
		 */

		// problem 8
		// Write a Java program to print stars using for loop, where the number of
		// stars printed should be equal to the row number?

		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<=i;j++) { System.out.print(" * "); }
		 * System.out.println(" "); }
		 */
		/*
		 * // problem 9 //Write a Java program to print the alphabets using for loop?
		 * char i; for(i='A';i<='Z';i++) { System.out.print(" "+i); }
		 */

		// problem 10
		// A palindrome is a word, phrase, number, or other sequence of characters which
		// reads the same backward or forward.
		// Given a string , print Yes if it is a palindrome, print No otherwise

		/*
		 * String aa="madam"; String bb = new StringBuilder(aa).reverse().toString(); if
		 * (aa.equalsIgnoreCase(bb)) // using equals {
		 * System.out.println("It is a pallindrome"); } else {
		 * System.out.println("it is not a pallindrome"); }
		 */

		// problem 11
	/*	String str = "hello";
		String str1 = "java";
		int A = str.length();
		int B = str1.length();
		int sum = A + B;
		System.out.println("sum of length of A & B is " + sum); // Sum the lengths of A and B.
		// Determine if A is lexicographically larger
		// than B (i.e.: does A come before B in the dictionary?)
		if (str.compareTo(str1) > 0) {
			System.out.println("A is lexicographically larger than B"); 
		} else if (str.compareTo(str1) < 0) {
			System.out.println("A is lexicographically not larger than B");
		} else {
			System.out.println("A and B are equal");
		}*/
		
		
		
		// problem 12
		//Write a Java program to demonstrate the usage of break and continue statements inside while loop?
		/*
		 * int i=0; 
		 * while(i<=10) {
		 *  i++; if(i==5) {
		 *   continue; }
		 *    if(i==8) {
		 *     break; }
		 * System.out.println(i); } 
		 * System.out.println("hi how are you");
		 */
	
		
		// problem 12
		// Find a no is prime or not
		/*
		 * System.out.println("Enter any no"); Scanner sc = new Scanner(System.in); int
		 * num = sc.nextInt(); boolean isPrime= true; for(int i=2;i<=num/2;i++) {
		 * if(num%i==0) { isPrime = false; break; }} if(isPrime) {
		 * System.out.println("It's a Prime No"); }else {
		 * System.out.println("It's not a Prime No"); }
		 */
		
		// problem 13
		//The number of duplicate characters in the string
/*		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string: ");
	      String str = sc.nextLine();
	      
	      // Create a HashMap to store the characters and their counts
	      Map<Character, Integer> map = new HashMap<>();
	      
	      // Iterate over the characters in the string and update the counts in the HashMap
	      for(int i=0; i<str.length(); i++) {
	         char ch = str.charAt(i);
	         if(map.containsKey(ch)) {
	            map.put(ch, map.get(ch) + 1);
	         }
	         else {
	            map.put(ch, 1);
	         }
	      }
	      
	      // Count the number of duplicate characters
	      int duplicateCount = 0;
	      for(int count : map.values()) {
	         if(count > 1) {
	            duplicateCount++;
	         }
	      }
	      
	      System.out.println("The number of duplicate characters in the string is: " + duplicateCount);
	   
		
	}*/
		
		
		
	}
}

package PracticeClass;

import java.util.Arrays;
import java.util.Scanner;

public class NewPractice2 {

	public static void main(String[] args) {

		// Check Given Number is Prime Or No

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter any no"); int
		 * n = sc.nextInt(); boolean isPrime = true;
		 * 
		 * for (int i=2;i<=n/2;i++) { if(n%i==0) {
		 * 
		 * isPrime=false; break;}} if(isPrime) {
		 * System.out.println("It is a Prime no");} else {
		 * System.out.println("It is not a prime no"); }
		 */

		// Check 2 Arrays are Equal or Not

		/*
		 * int arr1[]= {1,4,8,9,3}; int arr2[]= {1,4,8,9,3};
		 * 
		 * { boolean equals= Arrays.equals(arr1,arr2); if(equals == true) {
		 * System.out.println("arrays are equal"); }else {
		 * System.out.println("arrays are not equal"); } }
		 */

		// 3.Count Number Of Digits in a number

		/*
		 * int num = 123456789, count = 0; for(int i=0;num>0;i++) { num= num/10;
		 * count++;
		 * 
		 * }System.out.println("count of a no is "+ count);
		 */
		// 4.Count Number Of EVEN & ODD Digits in A Number

		/*
		 * int num = 123456789, even = 0,odd=0;
		 * 
		 * for(int i=0;num>0;i++) {
		 * 
		 * int remainder = num%10; if(remainder%2==0) { even++; }else if(remainder%2!=0)
		 * { odd++; } num= num/10; } System.out.println("even no count"+ even);
		 * System.out.println("odd no count"+ odd);
		 * 
		 */

		// 5.How To Find Duplicate Elements i

		/*
		 * String ar[] = { "java", "Python", "Go", "C", "Ruby", "java" }; boolean
		 * element=false; for(int i=0;i<ar.length;i++) { for(int j =i+1;j<ar.length;j++)
		 * {
		 * 
		 * if(ar[i].equals(ar[j])) { System.out.println("Duplicate element is:"+ar[i]);
		 * element = true; } } }if (element == false) {
		 * System.out.println("duplicate element is not found");
		 * 
		 * }
		 */
		
		// 6. floyd triangle 
		/*
		 * int rows, number = 1; Scanner input = new Scanner(System.in);
		 * System.out.println("Enter the number of rows for Floyd's triangle:"); rows =
		 * input.nextInt(); System.out.println("Floyd's triangle:"); for (int i = 1; i<=
		 * rows; i++) { for (int j = 1; j <= i; j++) { System.out.print(number + " ");
		 * number++; } System.out.println(); }
		 */
		
		
		 String str = "qwe";
	      int len = str.length();
	      System.out.println("Substrings of \"" + str + "\":");
	      for (int i = 0; i < len; i++) {
	         for (int j = i + 1; j <= len; j++) {
	            System.out.println(str.substring(i, j));
	         }
	      }
	      
	      //. How to split string in java Program

	      String s1="java string split method by Technolamror"; 
	      String[] words=s1.split("\\s");//splits the string based on whitespace 
	      //using java foreach loop to print elements of string array 
	      for(String w:words){ 
	      System.out.print(words); 
	 
	      
	      
	      } 
	      
	      
	}
}
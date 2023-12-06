package PracticeClass;

import java.util.Arrays;

public class Remove_StringFrom {

	
	//Write A Method That Will Remove Given Character From The String?
	
	
	   
	   public static void main(String[] args) {  
           String str = "India is my country";  
          
        String remove = str.replace("c", "");   // using replace
        
        System.out.println(remove);
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
        String remove1 = str1.replace(" ", "");   // using replace
        System.out.println(remove1);
        
		/*
		 * String s1="Sachin"; String s2="Sachin"; String s3=new String("Sachin");
		 * String s4="Saurav"; System.out.println(s1.equals(s2)); //true
		 * System.out.println(s1.equals(s3)); //true System.out.println(s1.equals(s4));
		 * //false
		 */	
	   
String st = "Hello";
char[] ch = st.toCharArray();

System.out.println(Arrays.toString(ch));










	   } 
}









      



package PracticeClass;

public class stringPractice {

	public static void main(String[] args) {

		// to lower case
		String str = "This IS ME";
		String name = str.toLowerCase();
		System.out.println(name);

		// replace space with _
		String Hi = "Hi how are you";
		Hi=Hi.replace(" ","_");
		System.out.println(Hi);
		
		// replace a word in sentence
		String A = "Hi <|how|> are you";
		A=A.replace("<|how|>","<|where|>");
		System.out.println(A);
		
		//to detect double & triple space 
		
		String q= "Hi  what are    you doing";
		System.out.println(q.indexOf("  "));
		System.out.println(q.indexOf("   "));
		
		//write a prog to format using escape sequence letter
		
		String letter = "Dear Sanjay,\n\t This Java Course is Nice.\n\t Thanks";
		
		System.out.println(letter);
		
		

		// for * pattern
		  for(int x=0; x<5; x++) { 
		  //inner loop for columns
		   for(int y=0; y<=x; y++) {
		  //To prints stars 
		  System.out.print("* "); } 
		  //Cursor goes to the new line
		//  after printing each line. 
		  System.out.println(); }
		 
		
		  
		  //Fibonacci series
		  int a=1, b=2, c;
		  
		  System.out.print(a +" "+ b);
		  for(int i=0;i<=10;i++) {
			 
			  c=a+b;
			  a=b;
			  b=c;
		 
		System.out.print(" "+c+" ");
		  }
		
		// using subString  
		  String str2 = "qwerty";
			System.out.println(str2.substring(1, 5));
			

			
			
			}
		
		}	
		
	

        

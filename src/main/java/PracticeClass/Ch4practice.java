package PracticeClass;
import java.util.Scanner;

public class Ch4practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("sum of three numbers");*/

		//sum of 3 nos
		/*int n1=5,n2=6,n3=7,sum;
		sum=n1+n2+n3;
		System.out.println(sum);*/

		//multiplication of 2 nos
		/*System.out.println("multiplication of two numbers");
		int n1=4,n2=5,n3;
		n3=n1*n2;
		System.out.println(n3);
*/
		
		//Division of 2 nos
		/*		System.out.println("division of two numbers");
				int n1=4,n2=8,n3;
				n3=n2/n1;
				System.out.println(n3);
		*/
		/*int a=4;
		float g=12.45f;
		double d1=44.4343;
		char c='a';
		String str="sanjay";
		System.out.println(a);
		System.out.println(g);		
		System.out.println(d1);
		System.out.println(c);
		System.out.println(str);
*/		
/*System.out.println("taking input from user");		
Scanner sc=new Scanner(System.in);
System.out.println("Enter no 1");
int a=sc.nextInt();
System.out.println("Enter no 2");
int b=sc.nextInt();
int sum=a+b;
System.out.println("the sum of nos");
System.out.println(sum);*/

		
		//using int
		
/*		System.out.println("taking input from user");		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1");
		int a=sc.nextInt();
		System.out.println("Enter no 2");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("the multiplication of nos");
		System.out.println(c);*/

		// using float
		
	/*	System.out.println("taking input from user");		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1");
		//int a=sc.nextInt();
		float a=sc.nextFloat();
		System.out.println("Enter no 2");
		//int b=sc.nextInt();
		float b=sc.nextFloat();
		//int c=a*b;
	float c=a*b;
		System.out.println("the multiplication of nos");
		System.out.println(c);
*/

Scanner sc=new Scanner(System.in);

float math,science,social,english,hindi;
System.out.println("enter math marks");
math=sc.nextInt();
System.out.println("enter science marks");
science=sc.nextFloat();
System.out.println("enter social marks");
social=sc.nextFloat();
System.out.println("enter english marks");
english=sc.nextFloat();
System.out.println("enter hindi marks");
hindi=sc.nextFloat();
System.out.println("the pass percentage is");
float percentage= ((math+science+social+english+hindi)/500f)*100;
System.out.println(percentage);


	}

}

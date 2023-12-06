package JavaClass;
import java.util.Scanner;
public class Sumof3digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
			a=sc.nextInt();
			while(a!=0)
			{
			sum=sum+a%10;
			a=a/10;
				
			}
		System.out.println(sum);
			}
	}



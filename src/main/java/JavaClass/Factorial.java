package JavaClass;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println(fact);
		}*/
		
		
int n= 5;
for (int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
		System.out.print("* ");
	}
	System.out.println();
	}

int n1=5;
for(int i=1;i<=10;i++) {
	System.out.printf("%d*%d=%d\n",n1,i,n1*i);
}



}
	}

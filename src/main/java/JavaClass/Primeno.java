package JavaClass;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the day no");
		a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satday");
			break;
		case 7:
			System.out.println("Sunday");
		default:
		}

	}
}
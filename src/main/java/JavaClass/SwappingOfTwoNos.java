package JavaClass;

public class SwappingOfTwoNos {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;

		System.out.println("Before swapping the values");
		System.out.println("value of a is : " + a);
		System.out.println("value of b is : " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping the values");
		System.out.println("value of a is : " + a);
		System.out.println("value of b is : " + b);

	}

}

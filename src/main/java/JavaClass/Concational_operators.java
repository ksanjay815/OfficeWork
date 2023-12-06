package JavaClass;

public class Concational_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		String str="sanjay";
		System.out.println(a+b+c); //arithmetic operations
		System.out.println(a+b+str+c); //30sanjay30
		System.out.println(a+b+str+b+c); //30sanjay2030//concational operator
		System.out.println(a+str+b+c); //10sanjay2030
		System.out.println(str+a+b+c); //sanjay102030
		System.out.println(str+a+(b+c)); //sanjay1050
	}

}

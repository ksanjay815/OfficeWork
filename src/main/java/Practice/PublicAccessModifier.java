package Practice;

class Z {
	public void msg3() {
		System.out.println("Hello I am public access modifier");
	}
}

public class PublicAccessModifier {
	public static void main(String[] args) {
		Z z = new Z();
		z.msg3();
	}
}

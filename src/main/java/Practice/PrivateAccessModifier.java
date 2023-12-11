package Practice;

public class PrivateAccessModifier {
	private int student = 40;

	// private access modifiers
	private static void msg4() {
		System.out.println("Hello I am private access modifier");
	}

	public static void main(String[] args) {
		msg4();
	}
}

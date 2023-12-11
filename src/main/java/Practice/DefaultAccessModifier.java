package Practice;

class X {
	// default access modifiers
	void msg1() {
		System.out.println("Hello I am default access modifier");
	}
}

public class DefaultAccessModifier {
	public static void main(String[] args) {
		X x = new X();
		x.msg1();
	}
}

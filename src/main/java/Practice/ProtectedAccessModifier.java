package Practice;

class Y {
	// protected access modifiers
	protected void msg2() {
		System.out.println("Hello I am protected access modifier");
	}
}

public class ProtectedAccessModifier extends Y{
	public static void main(String[] args) {
		ProtectedAccessModifier p = new ProtectedAccessModifier();
		p.msg2();
	}
}

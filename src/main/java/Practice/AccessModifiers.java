package Practice;

class School {
	private int student = 40;

	// private access modifiers
	private void msg() {
		System.out.println("Hello I am private access modifier");
	}
}

class X {
	// default access modifiers
	void msg1() {
		System.out.println("Hello I am default access modifier");
	}
}

class Y {
	// protected access modifiers
	protected void msg2() {
		System.out.println("Hello I am protected access modifier");
	}
}

class Z {
	public void msg3() {
		System.out.println("Hello I am public access modifier");
	}
}

public class AccessModifiers extends Y {
	private int student1 = 40;

	// private access modifiers
	private void msg4() {
		System.out.println("Hello I am private access modifier");
	}

	public static void main(String args[]) {

		System.out.println("Hello I am a private access modifier");

		School s = new School();
		
		// for private access modifier
//		System.out.println(s.student);
//		s.msg();

		// for default access modifiers
		X x = new X();
		x.msg1();

		// for protected access modifiers
		Y y = new Y();
		y.msg2();

		// for public access modifiers
		Z z = new Z();
		z.msg3();

	}
}

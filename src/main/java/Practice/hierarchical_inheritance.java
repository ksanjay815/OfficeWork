package Practice;

class A {

	public void method1() {
		System.out.println("Hi i am parent class");
	}
}

class B extends A {
	public void method2() {
		System.out.println("Hi i am child class 1");
	}

}

class C extends A {
	public void method3() {
		System.out.println("Hi i am child class 2");
	}
}

public class hierarchical_inheritance {

	public static void main(String[] args) {

		B b = new B();
		b.method1();
		b.method2();
		C c = new C();
		c.method1();
		c.method3();

	}
}
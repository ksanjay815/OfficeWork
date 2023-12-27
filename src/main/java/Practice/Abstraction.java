package Practice;

abstract class Bike {

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	
	}
}

// Creating a Child class which inherits Abstract class
class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}
// Creating a Test class which calls abstract and non-abstract methods
public class Abstraction {
	public static void main(String args[]) {
		Bike b = new Honda(); // upcasting
		b.run();
		b.changeGear();
	}
}

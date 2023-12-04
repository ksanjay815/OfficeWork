package Practice;


// Single level inheritance code 

class Maths {
	public void mathsMethod() {
		System.out.println("This is Maths class");
	}
}

class Geometry extends Maths {
	public void GeometryMethod() {
		System.out.println("Geometry is a topic in Maths class");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Geometry g = new Geometry();
		g.mathsMethod();
		g.GeometryMethod();
	}
}

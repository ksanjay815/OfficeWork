package Practice;


//Multi level inheritance code 


class Science {
	public void ScienceMethod() {
		System.out.println("Welcome to  Science Stream");
	}
}

class PhysicS extends Science {
	public void PhysicsMethod() {
		System.out.println("This is Physics class");
	}
}

class ChemistryS extends PhysicS {
	public void ChemistryMethod() {
		System.out.println("This is Chemistry class");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		PhysicS p = new PhysicS();
		p.ScienceMethod();
		p.PhysicsMethod();

		ChemistryS c = new ChemistryS();
		c.ScienceMethod();
		c.ChemistryMethod();
		c.PhysicsMethod();
	}
}

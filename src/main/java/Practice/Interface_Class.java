package Practice;


	// Interface
	interface Animals {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	class Pigs implements Animals {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzzzzz");
	  }
	}

	public class Interface_Class {
	  public static void main(String[] args) {
	    Pigs myPig = new Pigs();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}

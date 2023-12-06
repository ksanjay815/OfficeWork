package PracticeClass;


	class Employees {
		// First constructor
		 Employees(String s, int i){
		        System.out.println("The name of the first employee is : " + s);
		        System.out.println("The id of the first employee is : " + i);
		    }
//		    Constructor overloaded
		    Employees(String s, int i, int salary){
		        System.out.println("The name of the second employee is : " + s);
		        System.out.println("The id of the second employee is : " + i);
		        System.out.println("The salary of second employee is : " + salary);
		    }

		}
	public class Constructor {
		    public static void main(String[] args) {
		        Employees shubham = new Employees("Shubham",1);
		        Employees harry = new Employees("Harry",2,70000);



		    }
		}


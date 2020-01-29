package Interface;

/*Scenario 1: Child Class reference and child class object => allow will to access the all the child and base class
 * Scenario 2. Can have the base class reference and child class object , Can access only base class methods
 * Scenario 3. Reference of the of base class and object of the base class not valid(As interface don't have any
 *  implemented methods so cannot create the object of it)
 *  Scenario 4.Reference of the child class and object of the base class( cannot create the object of the Interface, it has abstract methods)
 * 
 */

public class AdvanceCal implements Calc {

	public static void main(String[] args) {
	
		
		AdvanceCal obj1 = new AdvanceCal();
		obj1.add();
		obj1.sub();
		obj1.AdvanceCos();
		obj1.AdvanceSin();
		
	}

	
    public void AdvanceSin() {
		
		System.out.println(" AdvanceSin method");
	}
	
    public void AdvanceCos() {
		
		System.out.println(" AdvanceCos method");
	}
	
	public void add() {
		
		System.out.println(" Addition method");
	}


	public void sub() {
		System.out.println(" Substraction method");
		
	}

}

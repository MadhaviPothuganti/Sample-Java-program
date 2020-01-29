package Abstract;

public class HRTeam extends ITDepartment {

	public static void main(String[] args) {
		
		//Scenario 1 : Child class object ref to child class ( can access the both the child and base class methods) 
		HRTeam obj1 = new HRTeam();
		obj1.goodies();
		obj1.work();
		obj1.sal();
		obj1.bonus();

		/*Scenario 2 : base  class object ref to child class ( can access to only  base class methods) 
		 Object of HRTeam and reference pointing to ITDepartment
		 */
		
		
		ITDepartment obj2 = new HRTeam();
		obj2.goodies();
		obj2.work();
		obj2.sal();
		
				
		/*Scenario 3:ITDepartment obj1 = new ITDepartment();
		  Cannot create the object of the Abstract Class, Because if class not fully implemented, then java will not allow you to create the object
		  => In Interface don't even have single method that is implemented, thats why cannot create the object of the Interface
		  =>Interface is 100% abstract class
		  =>By Class in Selenium is the example of Abstract Class
		*/
		
	}


	public void bonus() {
		
		System.out.println("Yearly bonus $10K");
	}
	public void sal() {
		
		System.out.println("Salary $100K");
		
	}

}

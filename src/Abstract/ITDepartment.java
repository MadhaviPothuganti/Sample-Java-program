package Abstract;


//What is abstract keyword?, Abstract Class? Abstract Method?
//1. Abstraction is the processes of showing only essentials details and hiding the background details.
//2. Any Class with Abstract keyword will be known as Abstract class
//3. if a class even a single method is abstract method then class will become an  Abstract Class
//4. Abstract class can contain Abstract methods and non Abstract Method
//5. we cannot create an object of an abstract class

public abstract class ITDepartment implements emp {

	public static void main(String[] args) {
		

	}

	@Override
	public abstract void sal(); 

	@Override
	public void goodies() {
		System.out.println("Laptop");
		
	}

	@Override
	public void work() {
		System.out.println("Automation");
		
	}

}

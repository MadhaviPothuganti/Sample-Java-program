package Polymorphism;

//What is polymorphism ?, type of polymorphism? and Signature?
//Polymorphism : In simple word one thing is multiple forms  Add(), Add(int a), Add(int a, int b)
//Method Overloading : Method can be overloading if and only if method has same name but with different signature
//signature : number of arguments, type of arguments and order of arguments

//Types of polymorphism -- Overloading (compiletime, early binding)
//-- Overriding (runtime poly, late binding)


public class CompileDemo {

	public static void main(String[] args) {
		
		CompileDemo obj1 = new CompileDemo();
		obj1.add(24.45, 45.56);
		obj1.add(67.80, 35);
		obj1.add(24, 67.89);
		obj1.add(45, 65);
		obj1.add(25, 35, 35);

	}
	public void add (double a, double b) {
		
		 double c = a+b;
		 System.out.println("Sum of the number is : " +c);
		
	}
	
	public void add (double a, int b) {
		
		 double c = a+b;
		 System.out.println("Sum of the number is : " +c);
		
	}
	
	public void add (int a, double b) {
		
		 double c = a+b;
		 System.out.println("Sum of the number is : " +c);
		
	}
	
	public void add (int a, int b) {
		
		 int c = a+b;
		 System.out.println("Sum of the number is : " +c);
		
	}
	
	public void add (int a, int b, int d) {
		
		 int c = a+b;
		 System.out.println("Sum of the number is : " +c);
		
	}
	
	

}

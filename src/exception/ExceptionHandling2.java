package exception;

import java.util.InputMismatchException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Staring of the program");
		
		try {
		int c = 10/0;
				System.out.println("Div result is " +c);
		}catch(ArithmeticException e)
		{
			
			System.out.println("Something went wrong pls check the exception message: " +e.getMessage());
			System.out.println("seems you have entered the zero please proide thevalue greater than zero >0");
		}
		catch (InputMismatchException e) {
			System.out.println("pls enter only integer values ");
		}
		catch (Exception e) {
			System.out.println("something went wrong");
		}
		
		
		finally {//it  will execute irrespective of the exception or not
			System.out.println("finally block");
			System.out.println("end test");
		}
		
	}

}

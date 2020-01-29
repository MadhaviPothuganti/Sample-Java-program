package exception;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class ExceptionHandlingthrows3 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		
		System.out.println("Staring of the program");
		
		Thread.sleep(5000);
		
		FileInputStream fis =  new FileInputStream("");
		Robot a = new Robot();
		
		
		/*catch (InputMismatchException e) {
			System.out.println("pls enter only integer values ");
		}
		catch (Exception e) {
			System.out.println("something went wrong");
		}
		
		
		finally {//it  will execute irrespective of the exception or not
			System.out.println("finally block");
			System.out.println("end test");
		}*/
		
	}

}

package ConditionalStatements;

public class IfElseDemo {

	public static void main(String[] args) {
		
		String browser = "chrome";
		System.out.println("Test started");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test Cases executed in Chrome ");
			
		}
	
		else {
			System.out.println("Test Cases executed in Firefox" );
			
		}
		System.out.println("Test End");
	}
	
}

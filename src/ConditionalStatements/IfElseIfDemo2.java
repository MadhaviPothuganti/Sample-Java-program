package ConditionalStatements;

public class IfElseIfDemo2 {

	public static void main(String[] args) {
		
		String browser = "IEuu";
		System.out.println("Test started");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test Cases executed in Chrome ");
			
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test Cases executed in Firefox ");
			
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Test Cases executed in IE ");
			
		}
		else {
			System.out.println("Provide the right browser name" );
			
		}
		System.out.println("Test End");
	}
	
}

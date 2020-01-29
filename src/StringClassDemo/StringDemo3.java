package StringClassDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String actuval = " welcome to Selenium Webdriver world";
		String expected = " welcome to Selenium webdriver world";
		boolean status1 = actuval.equals(expected);
		boolean status2 = actuval.equalsIgnoreCase(expected);
		System.out.println("Status is: "+status1);
		System.out.println("Status is: "+status2);
		

	}

}

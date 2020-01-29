package StringClassDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String actuval = " welcome to Selenium Webdriver world";
		String expected = "Selenium Webdriver world";
		boolean status1= actuval.contains(expected);
		
		System.out.println("Status is: "+status1);
		

	}

}

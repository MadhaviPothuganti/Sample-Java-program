package StringClassDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		String name = "Selenium Webdriver";
		boolean status1 = name.startsWith("Selenium");
		System.out.println("Status is: "+status1);
		String name1 = " welcome to Selenium Webdriver world";
		boolean status2 = name1.endsWith("world");
		System.out.println("Status is: "+status2);
	}

}

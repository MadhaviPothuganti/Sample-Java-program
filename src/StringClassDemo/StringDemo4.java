package StringClassDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String name = "Selenium-HP-QTP-Grid";
	//String  toolname[]	= name.split("-");
		String  []toolname	= name.split("-");
		
	for( int i=0;i<toolname.length;i++) {
		System.out.println("value for " +i+" is "+toolname[i]);
	    
		if(toolname[i].equalsIgnoreCase("Selenium")) {
			
			System.out.println("Test Passed");
			break;
		}
			
		}
	    		
	
	
		

	}

}

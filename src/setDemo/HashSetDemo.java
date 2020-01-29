package setDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Set<String> values = new HashSet<>();
		HashSet<String> values = new HashSet<>();
		
		values.add("Selenium");
		values.add("QTP");
		values.add("Nidhi");
		values.add("1");
		
		//System.out.println(values);
		
		for(String b:values) {
			
			System.out.println("Values are "+b);
		}
		
		
		
	}

}

package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		//Maintain the insertion order
		LinkedHashSet<String> values = new LinkedHashSet<>();
		
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

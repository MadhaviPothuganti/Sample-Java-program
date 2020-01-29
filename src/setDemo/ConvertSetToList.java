package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetToList {

	public static void main(String[] args) {
		
		Set<String> values = new HashSet<>();
	
		values.add("Selenium");
	    values.add("QTP");
		values.add("Nidhi");
		values.add("1");
		
		System.out.println(values);
		
		ArrayList<String> list = new ArrayList<>(values);
		System.out.println(list.get(3));
		
	}

}

/*
[1, Nidhi, Selenium, QTP]
QTP
*/
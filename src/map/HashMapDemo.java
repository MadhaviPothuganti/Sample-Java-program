package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("400", "Nidhi");
		obj1.put("200", "QTP");
		obj1.put("300", "Selenium");
		obj1.put("600", "Appium");
		obj1.put("600", "Appium");
		
		/*System.out.println(obj1);
		String value = obj1.get("200");
		System.out.println("Values from Map is "+value);*/
		
		
		//Entry is sub interface of Map
		for(Map.Entry<String, String> data : obj1.entrySet()) {
			System.out.println("Key from the Map is "+data.getKey() + "  and value is "+data.getValue());
		}
	}

}

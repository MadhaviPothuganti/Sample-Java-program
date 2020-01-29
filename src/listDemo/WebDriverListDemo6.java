package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * java.lang.Object
         java.util.AbstractCollection<E>
               java.util.AbstractList<E>
                       java.util.ArrayList<E>
      util means an existing java framework
      ArrayList =>CTRL+SPACE => this give the description about the Array list  from java docs
      Allows the duplicate values
      
      Iterator is an Iterface, it belongs to java.util
 */

public class WebDriverListDemo6 {

	public static void main(String[] args) {
		ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("Selenium webDriver1");
		obj1.add("Selenium webDriver2");
		//in generic array list in For loop we can mention directly object type  String, int ..etc instead of Object
		for(String v :obj1) {
			
			System.out.println(v);
		}
		

	}

}

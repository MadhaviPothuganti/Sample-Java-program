package listDemo;

import java.util.ArrayList;

/*
 * java.lang.Object
         java.util.AbstractCollection<E>
               java.util.AbstractList<E>
                       java.util.ArrayList<E>
      util means an existing java framework
      ArrayList =>CTRL+SPACE => this give the description about the Array list  from java docs
      Allows the duplicate values
 */

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(7778);
		obj1.add("Selenium webDriver");
		obj1.add("Selenium webDriver");
		obj1.add(12.78);
		obj1.add('N');
		
		
		for(Object abc : obj1) {
			
			System.out.println("Values in ArrayList is: "+abc);
		}
		
		
		

	}

}

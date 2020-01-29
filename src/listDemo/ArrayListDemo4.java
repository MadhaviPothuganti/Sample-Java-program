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

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(7778);
		obj1.add("Selenium webDriver");
		obj1.add("Selenium webDriver");
		obj1.add(12.78);
		obj1.add('N');
		
		Iterator itr = obj1.iterator();
		
		while(itr.hasNext()) {
			
			Object value = itr.next();
			System.out.println("Values are "+value);
		}
		
		

	}

}

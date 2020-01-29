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

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(7778);
		obj1.add("Selenium webDriver");
		obj1.add("Selenium webDriver");
		obj1.add(12.78);
		obj1.add('N');
		
		System.out.println(obj1);//returns all values in array list
		
		System.out.println(obj1.get(2));
		
		
		

	}

}

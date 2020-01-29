package ArrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		int i=0;
		//3*4 = 12 bytes of memory is allocated 
		int student_id[] = new int[3];
		student_id[0] = 10;
		student_id[1] = 25;
		student_id[2] = 45;
		//student_id[3] = 75;  array index out of bound exception
		System.out.println("student id "+student_id[2]);
		
		/*Limitation of arrays 
		 * Cannot change the size dynamically , its fixed
		 * Cannot change the array type once defined
		 * int arr[0] = (int) 67.75; it works , here we downcast the  double to int
		 */
		
		/*for (int i=0;i<student_id.length;i++) {
			
			System.out.println("student id "+student_id[i]);
			
		}*/
		
		
		System.out.println("Starting of while loop");
		while(i<=student_id.length) {
			i++;
			System.out.println("student id "+student_id[i]);
		}
		
		
	}

}

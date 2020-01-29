package parameterDemo;

public class ReturnParametersDemo {

	public static void main(String[] args) {
		DynamicCalculator obj = new DynamicCalculator();
         int sum = obj.add(35,67);
         System.out.println("result of sum is "+sum);
         double result1 =obj.sub(95.75, 67.89);
         System.out.println("result of substraction is "+result1);
         
         String name = DynamicCalculator.getMyfullName("Nidhi", "Bandi");
	     System.out.println("User name:  " +name );
	}
	
	
	
	
}

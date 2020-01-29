package parameterDemo;

public class DynamicCalculator {

	
	public static String getMyfullName(String fname, String lname) {
		String fullname = fname+" "+lname;
		return fullname;
	}
	public int add(int a, int b)
	{
		int  c = a+b;
		return c;
		//System.out.println("result of substraction is "+c);
	}
	public double sub(double x, double y)
	{
		double result = x-y;
		return result;
		
	}
	
	
	
}

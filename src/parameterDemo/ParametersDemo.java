package parameterDemo;

public class ParametersDemo {

	public static void main(String[] args) {
		ParametersDemo obj = new ParametersDemo();
         obj.add(60, 70);
         obj.sub(678.78, 456.95);
	}

	public void add(int a, int b)
	{
		int  c = a+b;
		System.out.println("result of substraction is "+c);
	}
	public void sub(double x, double y)
	{
		double result = x-y;
		System.out.println("result of substraction is "+result);
	}
	
	
}

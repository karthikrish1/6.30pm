package methodss;

public class m3 {

	public static void main(String[] args) {
		
		//parameter: variable passed to a function definition
		// argument: value assigned to the parameter while calling it
		
		m3.rectangle(10, 20);
		m3.rectangle(3, 4);
		System.out.println("division of two numbers "+ m3.div(30, 5));
		m4 ob= new m4();
		ob.add();
		//ob.area();
	}
	
	public static void rectangle(int l, int b)
	{
		System.out.println("Area of rectangle is "+ l*b);
	}
	
	public static int div(int a, int b)
	{
		return a/b;
	}
}

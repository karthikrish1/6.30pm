package methodss;

public class m2 {

	public static void main(String[] args) {
		//other than void- int, double, float, boolean, string, char
		
		// creation: add returen statement at end
		// calling:  call it within sysout statement 
		System.out.println("Product is "+ m2.prod());
        System.out.println("Area of circle is "+ m2.area());
        
        // returntype: float :  sub of two numbers :  private
        // returntupe: int  :  perimter f square:   public 
	}
	
	public static int prod()
	{
		int m=4;
		int n=9;
		int c=m*n;
		return c;
	}
	
	private static double area()
	{
		double r=3.4;
		return 3.14*r*r;
	}
	

}

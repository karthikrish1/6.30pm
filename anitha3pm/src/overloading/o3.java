package overloading;

public class o3 {

	public static void main(String[] args) {
		
		o3 ob= new o3();
		o3 ob1= new o3(7);
		o3 ob2= new o3(7.8);
		o3 ob4= new o3(9.8,7);
		o3 ob3= new o3(10,9.8);
		
		//static:  addition of two numbers, three numbers
		//nonstatic: average of two numbers , three numbers
		// constructor: detials (name), details(age)
	}
	
	public  o3()//0
	{
		System.out.println("hi");
		}

	public o3(int s)//1
	{
		System.out.println("area of square is "+s*s);
		}

	public  o3(double b)//datatype
	{
		System.out.println("area of circle is "+ 3.14*b*b);
		}

	public o3(int s, double b)
	{
		System.out.println("area of rectangle is "+ s*b);
		}


	public  o3(double b, int s)
	{
		System.out.println("area of triangle is "+ 0.5*s*b);
		}

}

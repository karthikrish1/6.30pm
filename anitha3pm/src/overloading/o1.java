package overloading;

public class o1 {
	
	/*
	 *inheritance
	 *polymorphism- overloading and overriding 
	 *abstraction
	 *encapsulation
	 *
	 * overloading:  using same methodname for different purpose
	 *              showing difference in number/datatype/sequence
	 *              
	 *              static
	 *              nonstatic
	 *              construct * 
	 * */
public static void main(String[] args) {
	o1.area();
	o1.area(3);
	o1.area(3.2);
	o1.area(30, 0.9);
	o1.area(3.2, 10);
}

public static void area()//0
{
	System.out.println("hi");
	}

public static void area(int s)//1
{
	System.out.println("area of square is "+s*s);
	}

public static void area(double b)//datatype
{
	System.out.println("area of circle is "+ 3.14*b*b);
	}

public static void area(int s, double b)
{
	System.out.println("area of rectangle is "+ s*b);
	}


public static void area(double b, int s)
{
	System.out.println("area of triangle is "+ 0.5*s*b);
	}
}

package basics;

public class v1 {
	public static void main(String[] args) {
		//datatype variablename=value;
		String n="dhivya";
		char letter='k';
		int age=31;
		double height=152.3;
		float weight=62.3f;
		boolean result=true;
		System.out.println("Name is "+ n);
		System.out.println("Initial is "+ letter);
		System.out.println("Age is "+ age);
		System.out.println("HEight is "+ height);
		System.out.println("Weight is "+weight);
		System.out.println("Result is "+ result);
		
		//addition: a+b
		//subtraction: a-b
		// product: a*b
		//division: a/b
		// average : (a+b)/2
		
		//area of square: side*side
		// area of circle: 3.14*r*r
		// area of triangle: 0.5*b*h
		
		double a=3.4;
		double b=2.3;
		System.out.println("Addition is "+ (a+b));
		System.out.println("subtraction is "+ (a-b));
		System.out.println("product is "+ a*b);
		System.out.println("division is "+ a/b);
		System.out.println("average is "+ (a+b)/2);
		
		float side=3.4f;
		System.out.println("Area of square is "+ side*side);
		
		int r=3;
		System.out.println("Area of circle is "+ 3.14*r*r);
		
		double b1=3.4;
		double h=3.2;
		System.out.println("Area of triangle is "+ 0.5*b1*h);
	}

}


/*variable:  name given to a memory location
 * 
 * word:   String
 * letter: char
 * number: int, double, float
 *         decimal
 *           double  : store upto 16 digits after decimal point
 *           float   : store upto 8 digits after decimal point, add f at the end
 *           
 * true/false: boolean
 * 
 * syntax for variable declaration: datatype variablename=value;
 * 
 * 
 * */
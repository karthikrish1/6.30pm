package methodss;

public class m6 {

	public static void main(String[] args) {
		
		//parameteR: variable passed to a function def
		// argument: value assigned to the parameter
		m6 ob= new m6();
		ob.perimter(3);
		System.out.println("Addition is "+ ob.add(3.4, 10.2));
	}
	
	public void perimter(int s)
	{
		System.out.println("perimter is "+ 4*s);
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
}

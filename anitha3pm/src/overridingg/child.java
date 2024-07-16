package overridingg;

public class child extends parent {
	public static void main(String[] args) {
		
		//parent=> area
		
		parent p= new parent();
		p.area();
		
		//child=> area
		child c= new child();
		c.area();
		
	}
	
	public void area()
	{
		int r=3;
		System.out.println("Area of circle is "+ 3.14*r*r);
	}

}

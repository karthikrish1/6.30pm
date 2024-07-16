package inheritance;

public class child extends parent {

	public static void main(String[] args) {
		
		child.cs();
		child c= new child();
		c.cn();
		
		//after inheritance: child is having full control on parent
		
		child.ps();// calling parent class static method with child name 
		c.pn();// calling parent class nonsttic method with child object
		
	}
	
	
	public static void cs()
	{
		System.out.println("child class static ");
	}
	
	public void cn()
	{
		System.out.println("child class nonstatic ");
	}

}

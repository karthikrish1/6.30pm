package abstraction;

public class child extends parent{
	
	public static void main(String[] args) {
		
		child c= new child();
		c.nm();
		c.ab();
		
		//parent p= new parent();
	}

	@Override
	public void ab() {
		System.out.println("im abstract method");
		
	}

}

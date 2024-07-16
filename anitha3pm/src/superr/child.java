package superr;

public class child extends parent{
	
	int age=3;
public static void main(String[] args) {
	
	child c= new child();
	c.n();
}

public void n()
{
	System.out.println(super.age);//super points to the parent reference 
	System.out.println(age);}
}

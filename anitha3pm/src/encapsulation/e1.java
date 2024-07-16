package encapsulation;

public class e1 {

	/*
	 * declare the variable as private
	 * must not assign value straightly to the variable
	 * access the variable through setter and getter method
	 * 
	 * setter:  assign value to the variable 
	 * getter: view the value stored in the variable
	 * 
	 * setter, getter: nonstatic, public
	 * 
	 * doesnot follow inheritance  * 
	 * */
	
	private String password;
	
	//setter:  assign value to the variable
	
	public void set(String p)
	{
		password=p;
	}
	
	public void get()
	{
		System.out.println(password);
	}
}

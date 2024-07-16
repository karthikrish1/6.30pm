package methodss;

public class m1 {

	public static void main(String[] args) {
		m1.area();
		m1.rec();
		
		//public: addition 
		//private:  average
		
	}
	
	
	public static void area()
	{
		int s=4;
		System.out.println("Area of square is "+ s*s);
	}
	
	private static void rec()
	{
		int l=9;
		int b=4;
		System.out.println("area of rec "+ l*b);
	}
}


/*method: block of code which performs certain action
 * static, nonstatic method
 * 
 * static: fixed memory space 
 * 
 * method should be created outside the main method
 * method should be called inside the main method
 * 
 * syntax for creation:  accessmodifier static returntype name(){}
 * syntax for calling:   classname.methodname();
 * 
 * accesmsodifier:  public, private, protected
 * returntype:  void, int, double, float, boolean
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 
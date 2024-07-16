package abstraction;

abstract public class parent {
	
	public void nm()
	{
		System.out.println("hi");
	}
	
	abstract public void ab();

	/*abstraction: hiding implementation details
	 * 
	 * achieved through abstract class and abstract method
	 * class-> abstract class: add abstract keyword befor eit
	 * 
	 * abstract class: nrml method and abstract method
	 * 
	 * abstract method
	 *      nonstatic
	 *      abstract 
	 *      will be empty in its own class
	 *      will be redefined in child class
	 *      
	 *we cannot create an object for abstract class
	 * 
	 * 
	 * 
	 * */
}

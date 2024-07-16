package interfacee;

public interface Intro {
	/*blue print of class
	 * doesnot contain static method
	 * doesnot contain main method
	 * will have nonstatic method with default keywrd
	 * will have abstract method
	 * 
	 * abstract method:
	 *    nonstatic
	 *    no abstract keyword
	 *    empy in its own place 
	 *    will be redefined in class to which interface connects to
	 *    
	 *    class<=> clasS: extends
	 *    class<=> interface : implements
	 *    
	 *    class definition: implemnets interfacename 
	 * 
	 * */
	
	default public void ns()
	{
		System.out.println("nonstatic method");
	}
	
	public void ab();

}

package exceptiongn;

public class e1 {
	public static void main(String[] args) {
		// try " code which s havng prob
		//catch:  executed only when error occurs
		
		try {
		System.out.println(8/0);
		}
		catch(Exception e)
		{
			System.out.println("error is "+ e);
		}
		
		finally
		{
			System.out.println("hi");
		}
	}

}

package loops;

public class v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for/while/do while
		 * 
		 * intialisation           :   where to start
		 * 
		 * condition checking      :   where to stop
		 *                             forward: <=end value
		 *                             backward: >=end value
		 *                             
		 * inc/dec                  :  diff between 2 consecutive numbers
		 *
		 * 
		 * initialisation
		 * do
		 * {
		 * statement
		 * inc/dec
		 * }
		 * while(condition);
		 * 
		 * 70,63...0
		 */
		
		int i=70;
		do
		{
			System.out.println(i);
			i=i-7;
		}
		while(i>=0);
	}

}

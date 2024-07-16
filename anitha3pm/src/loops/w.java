package loops;

public class w {

	public static void main(String[] args) {
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
		 * syntax:
		 * 
		 * initialisation
		 * while(condition)
		 * {
		 * statement
		 * inc/dec
		 * }
		 * * 
		 * odd numbers from 11 to 33   11,13,15...33
		 * 
		 * */
		
		int i=11;
		while(i<=33)
		{
			System.out.println(i);
			i=i+2;
			
		}
	}
}

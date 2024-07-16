package exceptiongn;

import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		
		// throw new Exceptionname("message")
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur age ");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("major");
		}
		
		else
		{
			throw new ArithmeticException("cannot vote");
		}
	}
}

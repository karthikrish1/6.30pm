package builtinclasses;

import java.util.Scanner;

public class sc12 {
	public static void main(String[] args) {
		
		// scanner: get input from the user at run time
		// nonstatic
		// String : nextLine()
		// int : nextInt()
		// double: nextDouble()
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String name=s.nextLine();
		System.out.println("Enter ur age : ");
		int age=s.nextInt();
		System.out.println("Enter ur salary :");
		double sal=s.nextDouble();
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}

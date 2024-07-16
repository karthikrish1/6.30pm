package builtinclasses;

public class x1 {

	public static void main(String[] args) {
		//String : class and datatype
		//n= variable and object
		
		String n="Welcome";
		
		// index    0     1    2   31`21	`  4     5    6
		//          W     e    l   c   o    m    e
		System.out.println(n.length());
		System.out.println(n.indexOf('m'));
		System.out.println(n.charAt(1));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('l', 'k'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.contains("co"));
		
	}
}

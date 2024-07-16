package builtinclasses;

public class s2 {

	public static void main(String[] args) {
		
				
				StringBuffer n=new StringBuffer("Welcome");
				
				// index    0     1    2   31`21	`  4     5    6
				//          W     e    l   c   o    m    e
				System.out.println(n.length());
				System.out.println(n.indexOf("m"));
				System.out.println(n.charAt(1));
				
				// insert
				System.out.println(n.append("hi"));
				System.out.println(n.insert(1, "L"));
				
				//delete
				System.out.println(n.deleteCharAt(1));
				System.out.println(n.delete(0, 2));// 0,1 will be deleted 
				
				System.out.println(n.reverse());
				System.out.println(n.reverse());
				
				System.out.println(n.replace(0, 3, "ani"));//0,1,2
	}
}

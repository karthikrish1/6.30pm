package collectionframework;

import java.util.ArrayList;

public class l1 {
	public static void main(String[] args) {
		/*
		 * store large amount of data under single name
		 * list, set, queue, map, table
		  list
		 *    indexed
		 *    add
		 *    remove
		 *    retrive
		 *    iterate
		 *    accept duplicates
		 *    ArrayList<Datatype> name= new ArrayList<>();
		 *    integer=> Integer
		 *    double=> Double
		 *    String=> String
		 *    char=> Character**/
		
		ArrayList<String>l= new ArrayList<>();
		l.add("abc");
		l.add("hi");
		l.add("bye");
		l.add("hello");
		l.add("nmi");
		System.out.println(l);
		//    index     0    1     2     3     4       
		//              abc  hi   bye  hello   nmi   
		//remove: know the index
		l.remove(2);
		System.out.println(l);
		
		// retrival : know the index
		System.out.println(l.get(0));
		System.out.println("Elements are : ");
		//enhanced/foreach:   for(datatype tempvariable: nameofthecollection)
		
		for(String x:l)
		{
			System.out.println(x);
		}
	}

}

package collectionframework;

import java.util.Hashtable;

public class m2 {

	public static void main(String[] args) {
		//HashMap: random order
		//Hashtable:  first order: last 
		Hashtable<Integer,String>t= new Hashtable<>();
		t.put(20,"zebra");
		t.put(2000,"apple");
		t.put(0,"yellow");
		t.put(10,"banana");
		System.out.println(t);
		
		//remove: know the key
		t.remove(20);
		System.out.println(t);
		// retrive: know the key
		System.out.println(t.get(0));
		System.out.println(t.keySet());
		System.out.println(t.values());
		
	}
}

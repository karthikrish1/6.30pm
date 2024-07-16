package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*set
		 *  not indexed
		 *  add
		 *  remove
		 *  retrival is not possible
		 *  will not accept duplicates
		 *  
		 *  TreeSet           : alphabetical/ascending order
		 *  LinkedHashSet     : insertion order
		 *  HashSet           : random order
		 * * 
		 * */
		TreeSet<Integer>t= new TreeSet<>();
		t.add(90);
		t.add(20);
		t.add(30);
		t.add(800);
		t.add(3);
		System.out.println(t);
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(90);
		t1.add(20);
		t1.add(30);
		t1.add(800);
		t1.add(3);
		System.out.println(t1);
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(90);
		t11.add(20);
		t11.add(30);
		t11.add(800);
		t11.add(3);
		System.out.println(t11);
		
	}

}

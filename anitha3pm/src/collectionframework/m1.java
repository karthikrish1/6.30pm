package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		
		/*
		 * map: container where elements will be stored along with its key
		 * 
		 * key: any datatype
		 * element: any datatype 
		 * add
		 * remove
		 * retrieve
		 * 
		 * TreeMap:       keys: alphabetical/ascendinf order
		 * LinkedHashmap: keys: insertion order
		 * hashmap:       keys: random order 
		 * TreeMap<dtypeofkey, dtypeoflement> name= new TreeMap<>();
* 
		 * */
		TreeMap<Integer,String>t= new TreeMap<>();
		t.put(20,"zebra");
		t.put(2000,"apple");
		t.put(0,"yellow");
		t.put(10,"banana");
		System.out.println(t);
		
		LinkedHashMap<Integer,String>t1= new LinkedHashMap<>();
		t1.put(20,"zebra");
		t1.put(2000,"apple");
		t1.put(0,"yellow");
		t1.put(10,"banana");
		System.out.println(t1);
		
		HashMap<Integer,String>t11= new HashMap<>();
		t11.put(20,"zebra");
		t11.put(2000,"apple");
		t11.put(0,"yellow");
		t11.put(10,"banana");
		System.out.println(t11);
	}
}

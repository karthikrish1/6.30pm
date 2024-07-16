package collectionframework;

import java.util.TreeSet;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>t= new TreeSet<>();
		t.add(90);
		t.add(20);
		t.add(30);
		t.add(800);
		t.add(3);
		System.out.println(t);
		//remove
		t.remove(3);
		System.out.println(t);
		for(int x:t)
		{
			System.out.println(x);
		}
	}

}

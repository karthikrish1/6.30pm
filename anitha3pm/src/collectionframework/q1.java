package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {
	/*
	 *queue
	 *
	 * not indexed
	 * add
	 * remove
	 * retrive only head
	 * iteration
	 * accept duplicates
	 * size 
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		ArrayBlockingQueue<Double>m= new ArrayBlockingQueue<>(4);
		m.add(8.0);
		m.add(5.6);
		m.add(3.4);
		m.add(2.3);
		System.out.println(m);
		m.remove(2.3);
		System.out.println(m);
		
		System.out.println(m.peek());
		for(double x:m)
		{
			System.out.println(x);
		}
	}

}

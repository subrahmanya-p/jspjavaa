package collectionss;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue q1 = new PriorityQueue();
		q1.add(10);
		q1.add(56);
		q1.add(-2);
		q1.add(12);
		q1.add(0);
		q1.add(100);
		System.out.println(q1);
		q1.remove(10);
		System.out.println("After removing the element 10 : " + q1);

		System.out.println("Does the list has element 10 ? :" + q1.contains(0));
		System.out.println("The Size of the list " + q1.size());
		PriorityQueue q2 = new PriorityQueue();
		q2.add(Integer.MIN_VALUE);
		q1.addAll(q2);
		System.out.println(" Queue  1 After Adding the Queue 2"+q1);
	}
}

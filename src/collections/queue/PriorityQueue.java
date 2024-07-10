package collections.queue;

import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new java.util.PriorityQueue<Integer>();
		System.out.println(q.peek());
		
		for(int i=20; i<=30; i++) {
			q.offer(i);
		}
		
		System.out.println(q);
		System.out.println(q.poll());
		
		System.out.println(q.remove());
		System.out.println(q);



		
	}

}

package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Sort the Data
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			pq.add(i);
		}
		
		// Queue    : 10 9 8 7 6 5 4 3 2 1 | FIFO 
		// 10 is the head and 1 is the tail
		
		// Pr Queue : 1 2 3 4 5 6 7 8 9 10 | FIFO (Sort the added data)
		// 1 becomes the head and 10 becomes the tail
		
		// Retrieve Head of Queue
		//System.out.println(pq.peek());

		// Retrieve Head of Queue and Remove it from Queue
		//System.out.println(pq.poll());
		
		// Pr Queue : 2 3 4 5 6 7 8 9 10 | FIFO (Sort the added data)
		// 2 becomes the head and 10 becomes the tail
		
		// What is the Output ??
		for(int i=0;i<pq.size();i++){
			System.out.println(pq.poll());
		}
	}

}

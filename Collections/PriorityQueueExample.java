package com.wbl.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public void queueExample(){
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(45);
		queue.add(10);
		queue.add(54);
		queue.add(55);
		queue.offer(56);
		
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			System.out.println("size:"+queue.size());
		}
		
		
	}
	public static void main(String[] args) {
		PriorityQueueExample pe = new PriorityQueueExample();
		pe.queueExample();
	}

}

package com.wbl.Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public void vectorExample(){
		Vector<Integer> li = new Vector<Integer>(5,2);
		System.out.println("Capacity Before : "+ li.capacity());
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(50);
		li.add(null);
		System.out.println("Capacity After : "+ li.capacity());


		/*System.out.println("fourth Index Value : " +li.get(4));
		//System.out.println("Parallel Stream : " + li.parallelStream().count());
		System.out.println(li.size());
		for(Integer i:li){
			System.out.println(i);
		}*/
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		VectorExample lle = new VectorExample();
		lle.vectorExample();
	}
}

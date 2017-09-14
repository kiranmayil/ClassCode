package com.wbl.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

		public void arrayListExample(){
			List<Integer> li = new ArrayList<Integer>();
			li.add(10);
			li.add(20);
			li.add(30);
			li.add(40);
			li.add(50);
			li.add(50);
			li.add(null);
			li.add(null);
			li.add(4, 7876);
			System.out.println("fourth Index Value : " +li.get(4));
			//System.out.println("Parallel Stream : " + li.parallelStream().count());
			System.out.println(li.size());
			for(Integer i:li){
				System.out.println(i);
			}
			Iterator<Integer> itr = li.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

		public static void main(String[] args) {
			ArrayListExample lle = new ArrayListExample();
			lle.arrayListExample();
		}


}

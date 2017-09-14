package com.wbl.Collections;


import java.util.LinkedList;


//import javax.swing.text.html.HTMLDocument.Iterator;

public class LisnkedListExample {

	public void linkedListExam(){

		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		li.add(50);
		li.addFirst(67869);
		li.addLast(12345);
		li.add(4, 4444);
		li.add(null);
		li.add(null);

		System.out.println("Peek Value : " +li.peek());

		System.out.println("Before Poll");
		for(Integer i:li){
			System.out.println(i);
		}

		System.out.println("poll Value : " +li.poll());// it returns n removes
		System.out.println("After Poll");
		for(Integer i:li){
			System.out.println(i);
		}


		System.out.println("pop Value : " +li.pop());

		//System.out.println(li.size());
		for(Integer i:li){
			System.out.println(i);
		}
	/*	li.removeFirstOccurrence(50);

		System.out.println(li.size());
		for(Integer i:li){
			System.out.println(i);
		}*/

	}

	public static void main(String[] args) {
		LisnkedListExample lle = new LisnkedListExample();
		lle.linkedListExam();
	}

}

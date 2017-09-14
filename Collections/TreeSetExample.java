package com.wbl.Collections;

import java.util.TreeSet;

public class TreeSetExample {

	public void setBasics(){
		TreeSet<String> set = new TreeSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("hru");
		set.add("Collections");
		set.add("Collections");
		//set.add(null);
		//set.add(null);
		System.out.println("First set Value :" + set.first());
		System.out.println("Ceiling value : " + set.ceiling("Hat"));

		for(String setValue : set){
			System.out.println(setValue);
		}
	}

	public void setBasics2(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		//set.add(null);
		//set.add(null);
		System.out.println("First set Value :" + set.first());
		System.out.println("Ceiling value : " + set.ceiling(35));
		System.out.println("Lower Value" +set.lower(35));

		for(Integer setValue : set){
			System.out.println(setValue);
		}
	}


	public static void main(String[] args) {
		TreeSetExample lhse = new TreeSetExample();
		lhse.setBasics2();

	}

}

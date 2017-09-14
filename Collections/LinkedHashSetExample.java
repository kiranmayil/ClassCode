package com.wbl.Collections;

import java.util.LinkedHashSet;
//import java.util.Set;

public class LinkedHashSetExample {

	public void setBasics(){
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("hru");
		set.add("Collections");
		set.add("Collections");
		set.add(null);
		set.add(null);

		for(String setValue : set){
			System.out.println(setValue);
		}
	}

	public static void main(String[] args) {
		LinkedHashSetExample lhse = new LinkedHashSetExample();
		lhse.setBasics();

	}

}

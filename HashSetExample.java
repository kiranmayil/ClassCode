package com.wbl.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public void setBasics(){
		Set<String> set = new HashSet<String>();
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

	public void customObjects(){
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(4,"John"));
		employees.add(new Employee(2,"Alex"));

		for(Employee setValue : employees){
			System.out.println("id :" + setValue.getId());
			System.out.println("id :" + setValue.getnName());
			//setValue.
		}
	}

	public static void main(String[] args) {
		HashSetExample he = new HashSetExample();
		he.customObjects();
	}

}

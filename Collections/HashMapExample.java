package com.wbl.Collections;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public void hashMapExample(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Apple");
		map.put(2,"Banana");
		map.put(3,"pear");
		map.put(4,"orange");
		map.put(null, "Apple");
		map.put(3, "mango");

		System.out.println("Size of Map :" + map.size());

		Set<Integer> keys = map.keySet();

		//method1
		for(Integer k : keys){
			System.out.println("Key :" +k + " value : "+ map.get(k));
		}

		//method2
		for(Map.Entry<Integer,String> entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

	public Map<Employee,String> customObjects(){
		Map<Employee,String> employees = new HashMap<Employee,String>();
		Employee e1 = new Employee(4,"John");
		Employee e2 = new Employee(2,"Alex");

		employees.put(e1, "JavaDeveloper");
		employees.put(e2, "UIDeveloper");

		/*for(Map.Entry<Employee,String> entry : employees.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		return employees;


		/*for(Employee setValue : employees){
			System.out.println("id :" + setValue.getId());
			System.out.println("id :" + setValue.getnName());
			//setValue.
		}*/
	}

	public static void main(String[] args) {
		HashMapExample he = new HashMapExample();
		Map<Employee,String> map = he.customObjects();
		for(Map.Entry<Employee,String> entry : map.entrySet()){
		 System.out.println(entry.getKey().getId()+ ":" + entry.getKey().getnName() + ":" +entry.getValue());
		 System.out.println(entry.getKey().getnName());
		 System.out.println(entry.getValue());
	}
	}


}

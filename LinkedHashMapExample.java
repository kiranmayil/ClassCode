package com.wbl.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public void linkedHashMapEx(){
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(4,"Apple");
		map.put(1, "Samsung");
		map.put(2,"Google");
		map.put(3, "BlackBerry");
		map.put(null,null);
		map.put(null, "Blu");

		Set<Integer> keys = map.keySet();

		//method1
		for(Integer k : keys){
			System.out.println("Key :" +k + " value : "+ map.get(k));
		}


	}

	public static void main(String[] args) {
		LinkedHashMapExample lhme = new LinkedHashMapExample();
		lhme.linkedHashMapEx();

	}

}

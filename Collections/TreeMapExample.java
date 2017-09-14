package com.wbl.Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public void treeMapEx(){
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(4,"Apple");
		map.put(1, "Samsung");
		map.put(2,"Google");
		map.put(3, "BlackBerry");
		map.put(8,null);
		map.put(6, "Blu");

		Set<Integer> keys = map.keySet();

		//method1
		for(Integer k : keys){
			System.out.println("Key :" +k + " value : "+ map.get(k));
		}


	}

	public static void main(String[] args) {
		TreeMapExample lhme = new TreeMapExample();
		lhme.treeMapEx();

	}

}

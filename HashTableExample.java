package com.wbl.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {

	public void hashTableEx(){

		Hashtable<Integer,String> map = new Hashtable<Integer,String>();
		map.put(4,"Apple");
		map.put(1, "Samsung");
		map.put(2,"Google");
		map.put(3, "BlackBerry");
		map.put(8,"Andriod");
		//map.put(null, "Blu");

		Set<Integer> keys = map.keySet();

		//method1
		for(Integer k : keys){
			System.out.println("Key :" +k + " value : "+ map.get(k));
		}


	}

	public static void main(String[] args) {
		HashTableExample lhme = new HashTableExample();
		lhme.hashTableEx();

	}

}

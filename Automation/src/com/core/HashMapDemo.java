package com.core;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101,"Jimmy");
		map.put(671,"Ronak");
		map.put(897,"Bhavika");
		map.put(432,"Vishrut");
		map.put(232,"Sahil");
		
		System.out.println(map);
		map.put(432,"Jigar");
		System.out.println(map);
		
		ArrayList tr=new ArrayList();
		tr.add(5000);
		tr.add(9000);
		tr.add(1000);
		HashMap<Integer, ArrayList> hm=new HashMap();
		hm.put(501,tr);
		System.out.println(hm);
		
	}
}

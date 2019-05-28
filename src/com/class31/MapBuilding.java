package com.class31;

import java.util.HashMap;
import java.util.Map;

public class MapBuilding {

	public static void main(String[] args) {

		Map<Integer,String> list=new HashMap<>();
		list.put(1, "Google");
		list.put(2, "Syntax");
		list.put(3, "Google");
		list.put(2, "Syntax");
		list.put(7, "Google");
		list.put(6, "Syntax");
		list.put(7, "Google");
System.out.println("How many entries "+list.size());
list.replace(4, "Facebook");
 
list.remove(7, "Google");
System.out.println(list);
		
	}

}

package com.class31;
import java.util.*;
public class BestBuy {
/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
 */
	public static void main(String[] args) {
Map<Integer, String> list=new LinkedHashMap<>();
list.put(1,	 "Laptop");
list.put(2,	 "Phone");
list.put(3,	 "TV");
list.put(4,	 "Game System");

for(Map.Entry<Integer, String> obj:list.entrySet()) {
	System.out.println(obj.getKey()+":"+obj.getValue());
}
System.out.println();
Iterator<Map.Entry<Integer, String>> value=list.entrySet().iterator();

while(value.hasNext()) {
	Map.Entry<Integer, String> it=value.next();
	System.out.println(it.getKey()+":"+it.getValue());
}

	}

}

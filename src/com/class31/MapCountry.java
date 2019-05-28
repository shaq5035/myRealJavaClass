package com.class31;
import java.util.*;
public class MapCountry {

	public static void main(String[] args) {
 Map<String, String> list=new HashMap<>();
 list.put("Usa", "DC");
 list.put("Afghanistan", "Kabul");
 list.put("Bangladesh", "Dhaka");
 list.put("Barbados", "Bridgetown");

 Set <String> it=list.keySet();
 for(String obj1:it) {
	 System.out.println(obj1+":"+list.get(obj1));
 }
 System.out.println();
 
 Iterator<String> value=it.iterator();
 while(value.hasNext()) {
	 String value1=value.next();
	 System.out.println(value1);
 }


		
	}

}

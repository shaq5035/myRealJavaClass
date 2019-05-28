package com.class31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {


				List<String> aList=new ArrayList<String>();
				        aList.add("John");
				        aList.add("Jane");
				        aList.add("James");
				        aList.add("Jasmine");
				        aList.add("Jane");
				        aList.add("James");
				        
				        Set<String> set=new HashSet<>(aList);
				        System.out.println("Set collection :" +set);
	}

}

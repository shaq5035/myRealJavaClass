package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsList {

	public static void main(String[] args) {
ArrayList<String> word=new ArrayList<String>();

word.add("Hello");
word.add("apple");
word.add("Eagle");
word.add("Banana");

Iterator<String> it=word.iterator();
while(it.hasNext()) {
	String word1=it.next();
	if(word1.endsWith("e")) {
		it.remove();
	}
}
System.out.println(word);
	}

}

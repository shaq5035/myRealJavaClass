package com.class32;
import java.util.*;
public class PersonTest {

	public static void main(String[] args) {
Map<Integer, Person> personMap=new HashMap<>();
personMap.put(1, new Person("Shaban","Haq",21,100000));
personMap.put(2, new Person("Keem","Haq",23,100000));

Collection<Person>personValue=personMap.values();
for(Person per:personValue) {
	per.getDetail();
}
	}

}

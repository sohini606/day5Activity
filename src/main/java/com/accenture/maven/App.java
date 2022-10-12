package com.accenture.maven;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	NavigableMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1,"Ram");
		map1.put(2,"Sam");
		map1.put(3,"Jas");
		map1.put(4,"Gopal");
		map1.put(5,"Ravi");
		
		System.out.println("The keys in descending order is: "+map1.descendingMap());
		
    }
}

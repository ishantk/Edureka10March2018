package co.edureka.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		//Set<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		set.add("Joe");
		
		// Read elements
		System.out.println("set is "+set);
		
		set.remove("Jim");
		
		if(set.contains("John")){
			System.out.println("John is in the set");
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
			
			if(nm.equals("Joe")){
				itr.remove();
			}
			
		}
		
		System.out.println("===========");
		
		Enumeration<String> enm = Collections.enumeration(set);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}

	}

}

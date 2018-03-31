package co.edureka.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		
		//HashMap<Integer, ArrayList> map1 = new HashMap<Integer, ArrayList>();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");  // Entry
		map.put(234, "Jennie");// Entry
		map.put(123, "Jim");
		map.put(678, "Jack");
		map.put(987, "Joe");
		map.put(null, "Harry");
		map.put(323, null);
		
		map.put(234, "Tom"); // updating the contents at 234 if 234 as a key exists
		
		System.out.println(map);
		
		String nm = map.get(123);
		System.out.println(nm);
		
		map.remove(123);
		
		System.out.println(map);

		if(map.containsKey(123)){
			System.out.println("123 key exists");
		}else{
			System.out.println("123 does not key exists");
		}
		
		if(map.containsValue("Harry")){
			System.out.println("Harry exists");
		}else{
			System.out.println("Harry not key exists");
		}
		
		System.out.println("====1. keySet ====");
		Set<Integer> keys = map.keySet(); // Obtain all the Keys from Map as a Set
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println("key: "+key+" Value: "+value);
		}
		
		// Comparator | Comparable
		
		System.out.println("====2. Entry ====");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");  // Entry
		table.put(234, "Jennie");// Entry
		table.put(123, "Jim");
		table.put(678, "Jack");
		table.put(987, "Joe");
		//table.put(null, "Harry");
		//table.put(323, null);
		
		System.out.println("table is: "+table);
	}

}

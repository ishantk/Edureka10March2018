package co.edureka.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"John");
		Employee e2 = new Employee(2,"Jennie");
		Employee e3 = new Employee(3,"Jack");
		Employee e4 = new Employee(4,"Jim");
		Employee e5 = new Employee(5,"Joe");
		
		
		// Limitation or Challenge is FIXED SIZE
		Employee[] empArr = new Employee[5];
		empArr[0] = new Employee(1,"John");
		//..
		//..
		
		ArrayList list1 = new ArrayList(); // Add Any Type of Data
		
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		//ArrayList<int> list4 = new ArrayList<int>(); // err
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		List<String> list5 = new ArrayList<String>(); // Polymorphic Statement
		
		//1. Add the Data in list
		list1.add("George"); //0th index
		list1.add(10); // list.add(new Integer(10));
		list1.add(new Character('A'));
		list1.add(e1);
		list1.add(2.2);     //n-1 index
		
		//list2.add(0,"Harry"); //0
		//list2.add(1,"Fionna");//1
		//list2.add(2,"George");//2
		//list2.add(3,"Kim");   //3
		
		list2.add("Harry"); //0
		list2.add("Fionna");//1
		list2.add("George");//2
		list2.add("Kim");   //3
		list2.add("Fionna");//4  We can add duplicates in list
		list2.add("Kim");//5  We can add duplicates in list
		
		list3.add(e1); //0
		list3.add(e2);
		list3.add(e3);
		list3.add(e4);
		list3.add(e5); //4
		
		list4.add(10); // list4.add(new Integer(10));
		list4.add(20);
		list4.add(30);
		list4.add(40);
		list4.add(50);
		//list4.add("Hello"); // error
		
		list5.add("John"); //0
		list5.add("Jennie");//1
		list5.add("George");//2
		list5.add("Jack");   //3
		
		//2. Size of list
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		System.out.println("list4 size is: "+list4.size());
		
		// 3. Read the data
		System.out.println("list1 is: "+list1);
		System.out.println("list2 is: "+list2);
		System.out.println("list3 is: "+list3);
		System.out.println("list4 is: "+list4);
		
		String list1Data = list1.toString();
		System.out.println("list1 data is "+list1Data);
		
		// 4. Read an element from list
		Object o = list1.get(2); // Object in Java is the Root Class. Every API or class which we create is child of Object in Java
		System.out.println("element at 2 of list1 is: "+o);
		
		String name = list2.get(3);
		System.out.println("element at 3 of list2 is: "+name);
		
		Employee emp = list3.get(4);
		emp.showEmployee();
		
		Integer iRef = list4.get(2);
		System.out.println("element at 2 of list4 is: "+iRef);
		
		//5. Iterate in the List
		//5.1. For Loop
		System.out.println("========For Loop=======");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println("---------");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		//5.2. Enhanced For loop
		System.out.println("========Enhanced For Loop=======");
		for(Object oRef : list1){
			System.out.println(oRef);
		}
		System.out.println("---------");
		for(String nm : list2){
			System.out.println(nm);
		}
		System.out.println("---------");
		for(Employee e : list3){
			e.showEmployee();
		}
		System.out.println("---------");
		for(Integer var : list4){
			System.out.println(var);
		}
		
		//5.3. Iterator
		System.out.println("========Iterator=======");
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object o1 = itr1.next();
			System.out.println(o1);
		}
		System.out.println("---------");
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String nm = itr2.next();
			System.out.println(nm);
			
			if(nm.equals("Jack")){
				itr2.remove(); // delete the data from ArrayList
			}
		}
		
		System.out.println("---------");
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee e = itr3.next();
			e.showEmployee();
		}
		
		//5.4. ListIterator
		System.out.println("========ListIterator=======");
		
		ListIterator<String> litr2 = list2.listIterator();
		while(litr2.hasNext()){
			String nm = litr2.next();
			System.out.println(nm);
		}
		System.out.println("----");
		while(litr2.hasPrevious()){
			String nm = litr2.previous();
			System.out.println(nm);
		}
		
		//5.5. Enumerations
		System.out.println("========Enumeration=======");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		//6. Delete the Data
		System.out.println("====Delete====");
		System.out.println(list2);
		list2.remove(1);
		System.out.println("Element removed from index 1");
		System.out.println(list2);
		
		//6. Updating the Data
		System.out.println("====Update====");
		System.out.println(list2);
		list2.set(1,"Geroge Watson");
		System.out.println("Element at 1 Updated");
		System.out.println(list2);
		
		System.out.println("===Add All===");
		list2.addAll(list5); // Adding All Elements of list5 into list2
		System.out.println(list2);
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("John");
		System.out.println("idx: "+idx);
		
		list2.clear(); // remove all elements from list
		
		if(list2.isEmpty()){
			System.out.println("list2 is empty and size is: "+list2.size());
		}
		
		//2-Dimension
		//ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList> list = new ArrayList<ArrayList>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		// THREAD-SAFE i.e. It is Synchronized
		Vector<String> vector = new Vector<String>();
		vector.add("John"); //0
		vector.add("Jennie");//1
		vector.add("George");//2
		vector.add("Jack");   //3
		
		System.out.println("vector is: "+vector);
		vector.remove(0);
		vector.set(1, "Fionna");
		//..
		//...
	}

}

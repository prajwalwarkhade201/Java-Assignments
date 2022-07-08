package arraylist.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLstMthd {
	
	public static void main(String[] args) {
	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(364);
		list.add(9071);
		list.add(4);
		list.add(78);
		list.add(87);
		list.add(100);
		list.add(1);
		list.add(1);
		list.add(111);
		
		ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
		
		list.ensureCapacity(10);
		
		System.out.println("is list empty : "+list.isEmpty());
		System.out.println("list elements : "+list);
		System.out.println("list size : "+list.size());
		System.out.println("Cloned list :"+ newList);
		System.out.println("is 78 exist in list : " + list.contains(78));
		System.out.println("Index of 4 :"+ list.indexOf(4));
		Collections.sort(list);
		
	}

}

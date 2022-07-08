//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.  

//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.  

//10. Write a Java program to get a reverse order view of the keys contained in a given map. 



package treemap_question;

import java.util.TreeMap;

public class TreemapOperations {
	
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1,"ABC");
		map.put(4,"DEFGHI");
		map.put(3,"JK");
		map.put(2,"LMNOPQ");
		map.put(5,"RSTU");
		map.put(6,"null");
		
		System.out.println("Dictionary 	: "+map);
		System.out.println("Greatest key : "+map.lastKey());
		System.out.println("Lowest key : "+map.firstKey());
		System.out.println("Greatest key-value pair: "+map.lastEntry());
		System.out.println("Lowest key-value pair: "+map.firstEntry());
		System.out.println("Reverse order : "+map.descendingMap());
		
	}

}

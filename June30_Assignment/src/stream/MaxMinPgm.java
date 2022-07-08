package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class MaxMinPgm {
	
public static void main(String[] args) {
		

		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Siraj","Hyd",26));
		p.add(new Players(6,"Shardul","Palghar",28));
		
		
		Integer maxMarks = p.stream().mapToInt(m->m.age).max().orElseThrow(NoSuchElementException::new);
		System.out.println("higest marks : "+maxMarks);
		
		Integer minMarks = p.stream().mapToInt(m->m.age).min().orElseThrow(NoSuchElementException::new);
		System.out.println("lowest marks : "+minMarks);
	}

}

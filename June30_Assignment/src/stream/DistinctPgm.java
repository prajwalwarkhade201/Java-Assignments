package stream;

import java.util.ArrayList;
import java.util.List;


public class DistinctPgm {
	
public static void main(String[] args) {
		

		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Virat","Delhi",18));;
		p.add(new Players(6,"Siraj","Hyd",26));
		p.add(new Players(7,"Shardul","Palghar",28));
		p.add(new Players(7,"Mohit","Nagpur",35));
		
		
		
		long count =p.stream().count();
		System.out.println("all players : "+count);
		p.forEach(student -> System.out.println("sequnce no.- "+student.getId()+", name : "+student.getName()));
		
		long distcount = p.stream().map(m->m.name).distinct().count();
		System.out.println("distinct names :" + distcount);
		p.stream().map(m->m.name).distinct().forEach(System.out::println);
		
	}

}

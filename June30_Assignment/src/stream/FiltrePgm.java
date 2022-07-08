package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrePgm {
	
	public static void main(String[] args) {
		

		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Siraj","Hyd",26));
		p.add(new Players(6,"Shardul","Palghar",28));
		
		
		List<String> list = p.stream().filter(f->f.age>31).map(m->m.name).collect(Collectors.toList());
		System.out.println("Players age is above 31 :"+list);
		
	



	}

}

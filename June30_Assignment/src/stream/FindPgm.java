package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindPgm {
	
	public static void main(String[] args) {
		

		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Virat","Delhi",18));;
		p.add(new Players(6,"Siraj","Hyd",26));
		p.add(new Players(7,"Shardul","Palghar",28));
		p.add(new Players(7,"Rohit","Nagpur",35));
		
		
		Optional<Integer> any = p.stream().map(m->m.age).filter(f -> f<50).findAny();
		Optional<Integer> first = p.stream().map(m->m.age).filter(f -> f<50).findFirst();
		
		for(int i=0; i<10; i++) 
		{
			if(any.isPresent()) 
			{
				Integer result = any.get();
				Integer first1 = first.get();
				System.out.println("any : "+result+" first :"+first1);
			}
		}
		
	}

}

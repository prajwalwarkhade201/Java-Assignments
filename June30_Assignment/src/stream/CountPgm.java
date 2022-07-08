package stream;

import java.util.ArrayList;
import java.util.List;

public class CountPgm {
	
	public static void main(String[] args) {
		

		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Siraj","Hyd",26));
		p.add(new Players(6,"Shardul","Palghar",28));
		
		
		long playerCount = p.stream().count();
		System.out.println("All players : "+playerCount);
	}

}

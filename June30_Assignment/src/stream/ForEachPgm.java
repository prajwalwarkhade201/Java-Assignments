package stream;

import java.util.ArrayList;
import java.util.List;

public class ForEachPgm {
	
	public static void main(String[] args) {
	
		List<Players> p = new ArrayList<>();
		p.add(new Players(1,"Virat","Delhi",34));
		p.add(new Players(2,"Rishabh","Delhi",23));
		p.add(new Players(3,"Ajinkya","Mumbai",33));
		p.add(new Players(4,"Rohit","Mumbai",35));
		p.add(new Players(5,"Siraj","Hyd",26));
		p.add(new Players(6,"Shardul","Palghar",28));
		
		p.forEach(player -> {
			if(player.getAge()<30)
				System.out.println("Sequnce No. "+player.getId()+", name : "+player.getName()+" Young player");
			else
				System.out.println("Sequnce No. "+player.getId()+", name : "+player.getName()+" Old Player");

		});
		
		
	}

}

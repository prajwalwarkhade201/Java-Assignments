package stream;

import java.util.Arrays;

public class LongStrmPgm {
	
	public static void main(String[] args) {

		//long[] num = {10345,38465,6089,92346,45,00563};
		long[] num = {1L, 5L, 12L};
		Long[] result = Arrays.stream(num).boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
		
	}

}

package corejava_practice;

import java.util.ArrayList;

public class LmbdExpression {
	public static void main(String[] args)
	{
		ArrayList<Integer> nums=new ArrayList<> ();
		nums.add(100);
		nums.add(60);
		nums.add(3);
		nums.add(80);
		
		
		long traditionalLoopStart  = System.currentTimeMillis();
		for(int i=0; i<nums.size(); i++)
		{
			System.out.println((i+1)+". "+nums.get(i));
		}
		long traditionalLoopEnd = System.currentTimeMillis();
		System.out.println("time taken : "+(traditionalLoopEnd - traditionalLoopStart));

		for(Integer num:nums)
		{
			// System.out.println((num)+". "+nums.get(num));
			System.out.println("item "+num);
		}
		
		nums.forEach( (n) -> {System.out.println(n);} );
	
	}
	

}

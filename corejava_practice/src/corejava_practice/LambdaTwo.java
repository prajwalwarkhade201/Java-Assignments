package corejava_practice;

import java.util.ArrayList;
import java.util.function.Consumer;


public class LambdaTwo {
	public static void main(String[] args)
	{
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(100);
		nums.add(70);
		nums.add(30);
		nums.add(80);
		
		Consumer<Integer> nums2=(num) -> {System.out.println(num);};
		System.out.println(nums2);
		}
	

}

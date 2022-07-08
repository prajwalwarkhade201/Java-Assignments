package string.assignment;

public class StringChar {
	
	public static void main(String[] args) {

		char[] ch = {'a','e','i','o','u','h'};
		
		String s = String.copyValueOf(ch);
		
		System.out.println("These '"+s+"'are vowels.");
		
		
	}

}

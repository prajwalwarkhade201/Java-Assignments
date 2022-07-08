package string.assignment;

public class StringCmpr {
	
	public static void main(String[] args) {
		

		String s1 = "mayank";
		String s2 = "MaYank";
		
		System.out.println("Comparing : ("+s1+") and ("+s2+")");
		
		System.out.println("Its matching : "+s1.compareToIgnoreCase(s2)); 
		System.out.println("Matching status : "+ s1.equals(s2));
		
	}

}

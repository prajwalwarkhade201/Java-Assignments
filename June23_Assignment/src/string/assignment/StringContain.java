package string.assignment;

public class StringContain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello, I am Prajwal";
		String s2 = "Mayank";
		String s3 = "Prajwal";
		
		System.out.println("String : "+ s1);
		System.out.println("Search : "+ s2);
		System.out.println("Search : "+ s3);
		System.out.println("It exists in string s2: "+ s1.contains(s2));
		System.out.println("It exists in string s3: "+ s1.contains(s3));
	}

}

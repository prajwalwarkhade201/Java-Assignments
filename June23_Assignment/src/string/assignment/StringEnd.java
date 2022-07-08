package string.assignment;

public class StringEnd {
	
	public static void main(String[] args) {
		
		String s = "Java is a high-level, general-purpose, object-oriented, and secure programming language developed by "
				+ "James Gosling at Sun Microsystems, Inc. in 1991. It is formally known as OAK. In 1995, Sun Microsystem "
				+ "changed the name to Java.";
		String check = "Tava";
		
		System.out.println("'"+s+"' ends with '"+check+"' ? "+ s.endsWith(check));
	}

}

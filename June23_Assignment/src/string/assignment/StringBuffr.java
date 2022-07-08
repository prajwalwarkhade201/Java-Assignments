package string.assignment;

public class StringBuffr {
	
	public static void main(String[] args) {

		String s = "Prajwal";
		StringBuffer sb = new StringBuffer("Prajwal");
		
		System.out.println("String: "+s+"\nStringBuffer: "+sb);
		
		System.out.println("Is the content equal: "+ s.contentEquals(sb));
		System.out.println("Hashcode equals to: "+ s.equals(sb));
		
		System.out.println("StringCode: "+s.hashCode()+"\nStringBufferCode: "+sb.hashCode());
	}

}

package question.on.io;

import java.io.*;

public class ByteArrayOpStream {
	
	public static void main(String args[]) throws Exception
	{
	
		try {
		
			FileOutputStream fos1 = new FileOutputStream("D:\\fos1.txt");
			FileOutputStream fos2 = new FileOutputStream("D:\\fos2.txt");
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			//String str = "Hello, I'm Prajwal Warkhade.";
			//byte b[] = str.getBytes();
			baos.write(75);
			baos.writeTo(fos1);
			baos.writeTo(fos2);
			
			baos.flush();
			baos.close();
			System.out.println("This is the text files");
		
		}catch(Exception e) {System.out.println(e);}
	}

}

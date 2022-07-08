package question.on.io;

import java.io.FileOutputStream;

public class FileOpStream {
	
	public static void main(String args[])
	{
	
		try {
		
			FileOutputStream fos = new FileOutputStream("D:\\fos.txt");
			String str = "Hello, I'm Prajwal Warkhade.";
			byte b[] = str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("This is the text file");
		
		}catch(Exception e) {System.out.println(e);}
	}

}

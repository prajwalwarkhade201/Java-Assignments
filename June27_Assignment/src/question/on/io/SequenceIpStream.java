package question.on.io;

import java.io.*;

public class SequenceIpStream {
	
	public static void main(String args[]) throws Exception {
		
		FileInputStream fsis1 = new FileInputStream("D:\\sis1.txt");
		FileInputStream fsis2 = new FileInputStream("D:\\sis2.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fsis1,fsis2);
		int i;
		while((i = sis.read())!=1)
		{
			System.out.println((char)i);
		}
		sis.close();
		fsis1.close();
		fsis2.close();
	}

}

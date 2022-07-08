package question.on.io;

import java.io.*;

public class ByteArrayIpStream {
	
	public static void main(String args[]) throws Exception
	{
		byte[] ba = {86, 76, 67, 99, 109};
		
		ByteArrayInputStream bais = new ByteArrayInputStream(ba);
		
		int i = 0;
		while ((i = bais.read())!= -1)
		{
			char ch = (char)i;
			System.out.println("ASCII value of :" + i + "Special character is : " +ch);
		}
		System.out.println("\nThis is output.");
	}

}

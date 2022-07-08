package question.on.io;

import java.io.FileInputStream;


public class FileIpStream {
	
	public static void main(String args[])
	{
	
		try {
		
			FileInputStream fin = new FileInputStream("D:\\fos.txt");
			int i = 0;
			while((i = fin.read())!= -1) {
				
				//System.out.println((char)i);
				System.out.print((char)i);
				
			}
			
			fin.close();
			System.out.println(" \n\n This is the content of the file");
		
		}catch(Exception e) {System.out.println(e);}
	}

}

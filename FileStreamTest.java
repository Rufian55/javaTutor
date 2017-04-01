package tutor;

import java.io.*;

public class FileStreamTest {
	public static void main(String args[]) {
		
		int intWrite[] = {2, 4, 6, 8, 22, 55};
		
		try{
			File f = new File("test.txt");
			if(!f.exists()){
				f.createNewFile();
			}
					
			PrintWriter fWrite = new PrintWriter(f);

			for(int i = 0; i < intWrite.length; i++){
				fWrite.println( intWrite[i] );// Don't hard code this with + "/r/n" etc.
			}
			fWrite.close();
		
		} catch(IOException e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}
	}
}

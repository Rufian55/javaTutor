package tutor; // In order to test on a Linux system.

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream in = null;
		FileReader in = null;
//		FileOutputStream out = null;
		FileWriter out = null;
		
		try {
//			in = new FileInputStream("infile.txt");
			in = new FileReader("infile.txt");
//			out = new FileOutputStream("outfile.txt");
			out = new FileWriter("outfile.txt");
			
			int aChar;
			while((aChar = in.read()) != -1) {
				out.write(aChar);
			}
		} finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}

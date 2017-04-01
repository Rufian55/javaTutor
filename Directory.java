//package tutor;

import java.io.*;

public class Directory {
	public static void main(String args[]) {
		// Make a directory tree.
		String dirName = "tmp/user/java/bin";
		File dFile = new File(dirName);
		
		// Creates the directory specified above.
		dFile.mkdirs();

		//Read and print directory structure.
		File file = null;
		String[] paths;
		
		try {
			// A file object.
			file = new File("/tmp");
			
			// Array of files and directories.
			paths = file.list();
			
			// Iterate and print contents of path array.
			for(String path : paths) {
				System.out.println(path);
			}
		} catch(Exception e ){
			e.printStackTrace();
		}
	}
}

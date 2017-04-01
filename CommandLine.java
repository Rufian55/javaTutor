package tutor;

public class CommandLine {
	public static void main(String []args){
		for(int i = 0; i < args.length; i++){
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
/* Run from command line proper, e.g., load this file into a linux OS
 * directory, compile and call with command line args or use eclipse's
 * run->configuration tool to set command line args for testing.
 */

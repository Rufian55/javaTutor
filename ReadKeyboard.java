package tutor;

public class ReadKeyboard {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		System.out.print("Press a key followed by ENTER ");
		ch = (char) System.in.read();
		System.out.println("Here is your entry: " + ch);
	}
}
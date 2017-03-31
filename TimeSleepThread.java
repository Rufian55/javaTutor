package tutor;
import java.util.*;

public class TimeSleepThread {
	public static void main(String []args){
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
		
			Thread.sleep(5*60*10);
			System.out.println(new Date() + "\n");
			
			long stop = System.currentTimeMillis();
			double elapsedTime = (stop - start) / 1000.0;
			System.out.printf("Elapsed time = %.3f seconds.\n", elapsedTime);
		}
		catch(Exception e) {
			System.out.println("An Exception error has occurred!");
		}
	}
}

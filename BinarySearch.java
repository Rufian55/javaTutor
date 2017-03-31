package tutor;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String []args){
		
		// An unsorted array.
		int anArray[] = {2, 4, 3, 0, 7, 1, -4, 99, 69};
		
		// Show sorted anArray.
		System.out.print("anArray unsorted = ");
		for(int num : anArray){
			System.out.print(num + " ");
		}

		System.out.println();
		
		// Sort anArray.
		Arrays.sort(anArray);
		
		// Show sorted anArray.
		System.out.print("anArray sorted = ");
		for(int num : anArray){
			System.out.print(num + " ");
		}
	
		int seekThis = -1, seekThat = 7;
		
		int sought4 = Arrays.binarySearch(anArray, seekThis);
		int alsoSought4 = Arrays.binarySearch(anArray, seekThat); 
	
		if(sought4 < 0)// If seekThis is negative, it's the bitwise not of the insert point.
			System.out.println("\nSought value \"" + seekThis + "\" not found.\n"
					+ "Insertion point is anArray[" + (-(sought4)-1) + "]");
		else
			System.out.println("\n" + seekThis + " was found at anArray[" + sought4 + "]");

		if(seekThat < 0)// If seekThat is negative, it's the bitwise not of the insert point.
			System.out.println("\nSought value \"" + seekThat + "\" not found.\n"
					+ "Insertion point is anArray[" + (-(alsoSought4)-1) + "]");
		else
			System.out.println("\n" + seekThat + " was found at anArray[" + alsoSought4 + "]");
	
	}

}
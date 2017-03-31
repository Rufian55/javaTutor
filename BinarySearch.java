package tutor;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String []args){
		
		// An unsorted array.
		int anArray[] = {2, 4, 3, 0, 7, 1, -4, 99, 69};
		
		// Show sorted anArray.
		System.out.print("anArry unsorted = ");
		for(int num : anArray){
			System.out.print(num + " ");
		}

		System.out.println();
		
		// Sort anArray.
		Arrays.sort(anArray);
		
		// Show sorted anArray.
		System.out.print("anArry sorted = ");
		for(int num : anArray){
			System.out.print(num + " ");
		}
	
		int seekThis = 0;
		
		int sought4 = Arrays.binarySearch(anArray, seekThis);
	
		System.out.println("\n" + seekThis + " was found at anArray[" + sought4 + "]");
		
	}
}
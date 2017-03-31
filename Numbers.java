package tutor;

public class Numbers {
	
	public static void main(String []args){
		Integer x = 5; // Boxes int to an Integer object!
		x = x + 10;		// Unboxes Integer object to an int!
		System.out.println(x);
		
		Integer y = 55;
		// Returns byte primitive data type
		System.out.println( y.byteValue() );

		// Returns double primitive data type
		System.out.println( y.doubleValue());

		// Returns long primitive data type
		System.out.println( y.longValue() );
		
		System.out.println(x.compareTo(y)); // Returns -1
		System.out.println(x.compareTo(x)); // Returns 0
		System.out.println(y.compareTo(x)); // Returns 1
		
		System.out.println(x.equals(y));	// Returns false.
		System.out.println(x.equals(x));	// True.
		System.out.println(y.equals(55));	// True.
		
		Integer t = 5;
		System.out.println(t.toString());  
		System.out.println(Integer.toString(12));
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
	      }
		
		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
	     }
		System.out.println("Total is " + total);
	      
		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) max = myList[i];
	    }
		System.out.println("Max is " + max);  
	}

}

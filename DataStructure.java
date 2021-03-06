package tutor;

public class DataStructure {
	// Create an array
	private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
    	// Fill the array with ascending integer values.
    	for (int i = 0; i < SIZE; i++) {
        	arrayOfInts[i] = i;
        }
    }

    // Print out values of even indices of the array
    public void printEven() {
        
    	DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
        	System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    /* Inner class implements the DataStructureIterator interface,
       which extends the Iterator<Integer> interface. */    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning.
        private int nextIndex = 0;

        // Check if the current element is the last in the array.
        public boolean hasNext() {
        	return (nextIndex <= SIZE - 1);
        }
        

        public Integer next() {
        	// Record a value of an even index of the array.
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element.
            nextIndex += 2;
            return retValue;
        }
    }
 
    /* Fill the array with integer values and print out only
       values of even indices. */
    public static void main(String s[]) {
    	DataStructure ds = new DataStructure();
        ds.printEven();
    }
}

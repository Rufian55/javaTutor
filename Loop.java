package tutor;

public class Loop {

	public static void main(String []args){
		int [] numbers = {0, 1, 2, 4, 8, 16};		
		int count = 0;
		for(int x : numbers){
			System.out.print( x );
			count++;
			if(count < numbers.length)
				System.out.print(", ");
		}

		int anArray[] = new int[20];
		System.out.println("\nArray length uninitialized is: " + anArray.length);

		count = 0;
		System.out.println("\n");
		String [] names = {"James", "John", "Jane", "Jamil"};
		for(String name : names){
			System.out.print( name );
			count++;
			if(count < names.length)
				System.out.print(", ");
		}
	}
}

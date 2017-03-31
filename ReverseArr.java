package tutor;

public class ReverseArr {
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}

	public static void main(String []args){
		int [] ascending = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
		int [] descending = reverse(ascending);

		int count = 0;
		for(int x : descending){
			System.out.print( x );
			count++;
			if(count < descending.length)
				System.out.print(", ");

		}
	}
}

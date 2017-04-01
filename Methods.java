package tutor;

public class Methods {

	public static void main(String []args){
		
		int a = 4, b = 5;
		double c = 3.14, d = 3.2;

		int result1 = minMe(a,b);
		double result2 = minMe(c,d);
		
		System.out.printf("MinMe = %d\n", result1);
		System.out.printf("MinMe = %.2f\n", result2);
	
		waterPhase(32);
		
		System.out.println("a = " + a + " b = " + b);
		uselessSwapDemo(a, b);
		System.out.println("a = " + a + " b = " + b + " Noooo! Pass by Value only...");
		a += (b - (b = a));
		System.out.println("a = " + a + " b = " + b + " Yay! Inline to the rescue!");
		
		
	}

	// minMe() returns smallest of two integers.
	public static int minMe(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min; 
	}
	
	// minMe() returns smallest of two doubles. (Method overloading).
		public static double minMe(double n1, double n2) {
			double min;
			if (n1 > n2)
				min = n2;
			else
				min = n1;

			return min; 
		}
	
	// In Fahrenheit, determines state of water.
	public static void waterPhase(double point){
		if(point < 32)
			System.out.println("Water is in a solid state below " + point + " degrees F.");
		else if(point == 32 || point == 212)
			System.out.println("Water is in a phase change at " + point + " degrees F.");
		else if(point > 32 && point < 212)
			System.out.println("Water is in a liquid state at " + point + " degrees F.");
		else if (point > 212)
			System.out.println("Water is in a gaseous state at " + point + " degrees F");
	}

	// Useless swap function as Java is pass by value...
	public static void uselessSwapDemo(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
}
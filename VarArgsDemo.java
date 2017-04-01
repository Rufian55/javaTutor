package tutor;

public class VarArgsDemo {
	
	public static void main(String[] args){
		
		printMax();
		printMax(10, 20, 5, 69, 4, 4.4, 69.01, 69.1);
		printMax(new double[]{10, 20, 5, 69, 4, 4.4, 69.01, 69.1});
	}

	public static void printMax( double... anArray){
		
		if(anArray.length == 0){
			System.out.println("The Stack Overflow Overlords are displeased! No args passed!!");
			return;
		}
		
		double result = anArray[0];
		
		for (int i = 0; i < anArray.length; i++){
			if(anArray[i] > result)
				result = anArray[i];
		}
			
		System.out.println("Max value of args passed = " + result + " The Overlords are pleased!");
		
	}

}
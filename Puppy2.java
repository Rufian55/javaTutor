public class Puppy2 {
	int puppyAge;
	String puppyName;

	public void setName(String name) {
		puppyName = name;
	}

	public String getName(){
		return puppyName;		
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		return puppyAge;
	}
		
	public static void main(String []args) {
		// Instantiates a new Puppy object.
		Puppy2 myPuppy = new Puppy2();

		// Call class methoid to set puppy's name.
		myPuppy.setName("Sic_em!");		

		// Call class method to set puppy's age.
		myPuppy.setAge(69);
		
		// Print instance vars.
		System.out.println("The Puppy's name is: " + myPuppy.getName());
		System.out.println("The Puppy's age is: " + myPuppy.getAge());
	}
}

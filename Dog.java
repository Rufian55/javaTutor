package tutor;

public class Dog {
	String name;
	String color;
	String breed;
	int ageC;

	enum DogType{ PUPPY, YOUNG, GRIZZLED }
	DogType type;

	public void setName(String aName) {
		name = aName;
	}

	public int getAgeC(){
		return ageC;
	}
	
	void barking(){
		System.out.println("Deep Booming Bark!");
	}
	
	void hungry(){
		System.out.println("Emaciated Barking \"Feed Me\"!");
	}
	
	void sleeping(){
		System.out.println("Snoring!");
	}
	
	String myHumanSays(){
		return "My dog is better than your dog!";
	}
	
	public static void main(String []args){
		Dog myDog = new Dog();
		myDog.setName("Sic 'em.");
		myDog.breed = "catDog.";
		myDog.ageC = 17;
		myDog.color = "Yellow.";
		myDog.type = Dog.DogType.GRIZZLED;
		
		System.out.println("My Dog's name is " + myDog.name);
		System.out.println("My Dog's breed is " + myDog.breed);
		System.out.println("My Dog's age is " + myDog.getAgeC() + ".");
		System.out.println("My Dog's color is " + myDog.color + ".");
		System.out.println("My dog's type is " + myDog.type + ".");
		myDog.sleeping();
		myDog.hungry();
		myDog.barking();
		System.out.println(myDog.myHumanSays());
	}
}

package tutor;

public class ConstructorDemo {
	
	public static void main(String []args){
	int anA = 55;
	String aString = "ButterBean";

	MyClass crunky = new MyClass();
	System.out.println("crunky.x = " + crunky.x);
	
	MyClass crunky2 = new MyClass(anA, aString);
	System.out.println("crunky2.x = " + crunky2.x + "  (Since x is unitialized, Java makes it 0.)");
	System.out.println("crunky2.a = " + crunky2.a);
	System.out.println("crunky2.b = " + crunky2.b);

	}
}

class MyClass{
	int x;
	int a;
	String b;

	// Parameterless (default) Constructor.
	MyClass(){
		x = 10;
	}

	// Overloaded Constructor (with parameters) for MyClass.
	MyClass(int a, String b){
		this.a = a;
		this.b = b;
	}
}
package tutor;

public class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE, JUMBO }
	FreshJuiceSize size;

	public static void main(String args[]){
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}


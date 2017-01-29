class FreshJuice {
	enum FreshJuiceSize{TINY, SMALL, MEDIUM, LARGE, JUMBO}
	FreshJuiceSize size;
}	

public class FreshJuiceTest {

	public static void main(String []args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.JUMBO;
		System.out.println("Size: " + juice.size);
	}
}

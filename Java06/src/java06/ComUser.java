package java06;

public class ComUser {

	public static void main(String[] args) {
		Computer c2 = new Computer(100);
		System.out.println(c2.price);
		
		Computer c1 = new Computer(50, "¾ÖÇÃ");
		
		System.out.println(c1.price);
		System.out.println(c1.company);
	}

}

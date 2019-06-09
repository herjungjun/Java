package 스레드;

public class 스레드User {

	public static void main(String[] args) {
		스레드1 r1 = new 스레드1();
		스레드2 r2 = new 스레드2();

		r1.start();
		r2.start();

	}

}

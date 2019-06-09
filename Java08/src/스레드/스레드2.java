package 스레드;

public class 스레드2 extends Thread {
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}
}

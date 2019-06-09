package ½º·¹µå;

public class ThreadUser {

	public static void main(String[] args) {
		RunThread1 r1 = new RunThread1();
		RunThread2 r2 = new RunThread2();

		r1.start();
		r2.start();
		
	}

}

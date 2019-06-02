package java06;

public class Car {
//	정적특징
	String color;
	int price;

//	동적특징
	public void speedup() {
		System.out.println("속도를 Up...");
		System.out.println("300까지 속도를 Up...");
	}
	public int get() {
		return 300;
	}
}

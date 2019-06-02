package java06;

public class Car2 {
//	정적특징
	String color;
	int price;

//	생성자 : 객체생성(new)할 때 자동으로 초기화
//	객체 생성할 때, 자동으로 호출(실행)
//	클래스 이름과 동일, 대문자로 시작하는 유일한 메소드

//	color만 생성자
	public Car2(String color) {
		this.color = color;
	}
//	price만 생성자
	public Car2(int price) {
		this.price = price;
	}
//	color, price 생성자
	public Car2(String color, int price) {
		this.color = color;
		this.price = price;
	}

//	동적특징
	public void speedup() {
		System.out.println("속도를 Up...");
		System.out.println("300까지 속도를 Up...");
	}

	public int get() {
		return 300;
	}
	
	public String toString() {
		return "Car2 [color : " + color + ", price : " + price + "]";
	}
}

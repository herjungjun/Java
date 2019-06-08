package 상속;

public class Car {
//	자동차 → class

//		- 정적특징 : 색, 속도 → 멤버변수
	String color;
	int speed;

	public Car() { // 기본 생성자
		
	}

	public Car(String color) {
		this.color = color;
	}

	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

//		- 동적특징 : 속도를 up, 속도를 down → 멤버메소드 
	public void speedUp() {
		System.out.println("속도를 Up");
	}

	public int speedDown() {
		return 60;
	}

	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}

}

package 상속;

//멤버변수 개수 : 3개, 멤버메소드 개수 : 3개
public class Truck extends Car {
	int weight; // 멤버변수 추가

	public void move() { // 멤버 메소드 추가
		System.out.println("물건을 운반하다.");
	}
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", color=" + color + ", speed=" + speed + "]";
	}

}

package 상속;

public class CarUser {

	public static void main(String[] args) {
		Car apple = new Car("red", 100);
		System.out.println(apple);
		
		Car banana = new Car("blue"); 	// 다형성
		System.out.println(banana);		// 재정의
	}

}

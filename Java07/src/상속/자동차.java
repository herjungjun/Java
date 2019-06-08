package 상속;

public class 자동차 extends Object {
//	색, 이름
	String color;
	String name;

	public 자동차() {
	}

	public 자동차(String color, String name) {
		this.color = color;
		this.name = name;
	}

//	출발하다, 멈추다
	public void start() {
		System.out.println("출발하다.");
	}

	public void stop() {
		System.out.println("멈추다");
	}

	@Override
	public String toString() {
		return "자동차 [color=" + color + ", name=" + name + "]";
	}
	
}

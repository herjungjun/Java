package 상속;

public class 세단 extends 자동차 {

//	기본 생성자는 다른 parameter 생성자가
//	하나도 없는 경우 자동으로 생성.
	public 세단() {
		super(); // 부모의 기본 생성자
	}

	public void window() {
		System.out.println("조용히 창문이 열리다.");
	}

}

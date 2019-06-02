package java05;

public class 계산기 {
	// 동적특징 - 더하다, 빼다
	public void 더하다(int x, int y) {
//	x, y 는 입력값이 들어왔을 때 
//	저장해줄 수 있는 매개역할
//	매개역할 변수 → 매개변수	
//	 매개변수 = parameter		
		System.out.println(x + y);
	}

	public void 빼다(int x, int y) {
		System.out.println(x - y);
	}
}
